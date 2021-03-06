#! /bin/bash

# Prepare config file
cd /etc/api-umbrella
cp api-umbrella.template.yml api-umbrella.yml

# Check key ENV
key=""
if [ -n "$SHEPHERD_TOKEN_KEY_CONTENT" ]; then
    # Private Key content set as ENV
    echo "Private key content found as ENV, replacing in api-umbrella.yml"
    key=`(echo ${SHEPHERD_TOKEN_KEY_CONTENT} | awk '/-----BEGIN PRIVATE KEY-----/, /-----END PRIVATE KEY-----/')`
elif [ -n "$SHEPHERD_TOKEN_KEY_FILE" ]; then
    # Private Key set as file
    echo "Private key set as file, replacing in api-umbrella.yml"
    key=`(awk '/-----BEGIN PRIVATE KEY-----/, /-----END PRIVATE KEY-----/' /run/secrets/shepherd_key)`
else
    # No private Key set
    echo "ERROR: No private key set (ENVS: SHEPHERD_TOKEN_KEY_CONTENT or SHEPHERD_TOKEN_KEY)"
    exit 1
fi
# replace /
key2="$(sed -z 's:\/:\\/:g' <<<"$key")"
# replace \n and add whitespaces for indent
key3="$(sed -z 's:\n:\\n    :g' <<<"$key2")"
# Replace var in yml template
sed -i "s:<SHEPHERD_KEY>:${key3}:g" api-umbrella.yml


# Check cert ENV TODO
crt_oneline=""
if [ -n "$SHEPHERD_TOKEN_CRT_CONTENT" ]; then
    # Certificate content set as ENV
    echo "Certificate content found as ENV, replacing in api-umbrella.yml"
    # Replace line breaks
    crt_oneline=`(echo ${SHEPHERD_TOKEN_CRT_CONTENT} | awk 'NF {sub(/\r/, ""); printf "%s",$0;}')`
elif [ -n "$SHEPHERD_TOKEN_CRT_FILE" ]; then
    # Certificate set as file
    echo "Certificate set as file, replacing in api-umbrella.yml"
    # Replace line breaks
    crt_oneline=`(awk 'NF {sub(/\r/, ""); printf "%s",$0;}' /run/secrets/shepherd_cert)`
else
    # No certificate set
    echo "ERROR: No certificate set (ENVS: SHEPHERD_TOKEN_CRT_CONTENT or SHEPHERD_TOKEN_CRT)"
    exit 1
fi
# Strip single certificates
crt=`(echo $crt_oneline | awk '/-----BEGIN CERTIFICATE-----/, /-----END CERTIFICATE-----/')`
# Replace \n
crt2=`(echo $crt | awk 'NF {sub(/\n/, ""); printf "%s",$0;}')`
# Replace /
crt3="$(sed -z 's:\/:\\/:g' <<<"$crt2")"
# Build array for final yml config file
crt_array=""
while read -r line ; do
    crt_array=${crt_array}"    - ${line}\n"
done < <(echo $crt3 | grep -oP '(?<=-----BEGIN CERTIFICATE-----).*?(?=-----END CERTIFICATE-----)')
# Replace \n again
crt_finalarray="$(sed -z 's:\n:\\n:g' <<<"$crt_array")"
# Replace var in yml template
sed -i "s:<SHEPHERD_CERTS>:${crt_finalarray}:g" api-umbrella.yml


# Set EORI ENV
if [ -n "$SHEPHERD_EORI" ]; then
    # Replace var in yml template
    sed -i "s/<SHEPHERD_EORI>/${SHEPHERD_EORI}/g" api-umbrella.yml
else
    echo "ERROR: No EORI set (ENV: SHEPHERD_EORI)"
    exit 1
fi

# Set iSHARE Satellite ENVs
if [ -n "$SATELLITE_HOST" ]; then
    # replace /
    val="$(sed -z 's:\/:\\/:g' <<<"$SATELLITE_HOST")"
    # Replace var in yml template
    sed -i "s/<SATELLITE_HOST>/${val}/g" api-umbrella.yml
else
    echo "ERROR: No host set for iSHARE satellite (ENV: SATELLITE_HOST)"
    exit 1
fi
if [ -n "$SATELLITE_TOKEN_ENDPOINT" ]; then
    # replace /
    val="$(sed -z 's:\/:\\/:g' <<<"$SATELLITE_TOKEN_ENDPOINT")"
    # Replace var in yml template
    sed -i "s/<SATELLITE_TOKEN_ENDPOINT>/${val}/g" api-umbrella.yml
else
    echo "ERROR: No token endpoint set for iSHARE satellite (ENV: SATELLITE_TOKEN_ENDPOINT)"
    exit 1
fi
if [ -n "$SATELLITE_TRUSTED_LIST_ENDPOINT" ]; then
    # replace /
    val="$(sed -z 's:\/:\\/:g' <<<"$SATELLITE_TRUSTED_LIST_ENDPOINT")"
    # Replace var in yml template
    sed -i "s/<SATELLITE_TRUSTED_LIST_ENDPOINT>/${val}/g" api-umbrella.yml
else
    echo "ERROR: No parties endpoint set for iSHARE satellite (ENV: SATELLITE_TRUSTED_LIST_ENDPOINT)"
    exit 1
fi
if [ -n "$SATELLITE_EORI" ]; then
    # Replace var in yml template
    sed -i "s/<SATELLITE_EORI>/${SATELLITE_EORI}/g" api-umbrella.yml
else
    echo "ERROR: No EORI set for iSHARE satellite (ENV: SATELLITE_EORI)"
    exit 1
fi

# Wait parameters
MAX_RETRIES=60
INTERVAL=10

# Wait for elasticsearch
while ! curl --silent --fail shepherd-elasticsearch.docker:9200/_cluster/health;
do
    echo "Waiting for elasticsearch"; ((i++)) && ((i==${MAX_RETRIES})) && break; sleep ${INTERVAL};
done

# Start API Umbrella
echo "Starting API Umbrella"
/app/docker/dev/docker-start-command
