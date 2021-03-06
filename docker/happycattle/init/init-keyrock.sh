#! /bin/bash

# Check key ENV
if [ -n "$HAPPYCATTLE_TOKEN_KEY_CONTENT" ]; then
    # Private Key content set as ENV
    echo "Private key content found as ENV, exporting as IDM_PR_CLIENT_KEY"
    export IDM_PR_CLIENT_KEY=${HAPPYCATTLE_TOKEN_KEY_CONTENT}
elif [ -n "$HAPPYCATTLE_TOKEN_KEY_FILE" ]; then
    # Private Key set as file
    echo "Private key set as file, exporting content as ENV IDM_PR_CLIENT_KEY"
    export IDM_PR_CLIENT_KEY=`(awk '/-----BEGIN PRIVATE KEY-----/, /-----END PRIVATE KEY-----/' /run/secrets/happycattle_key)`
else
    # No private Key set
    echo "ERROR: No private key set (ENVS: HAPPYCATTLE_TOKEN_KEY_CONTENT or HAPPYCATTLE_TOKEN_KEY)"
    exit 1
fi

# Check cert ENV
if [ -n "$HAPPYCATTLE_TOKEN_CRT_CONTENT" ]; then
    # Certificate content set as ENV
    echo "Certificate content found as ENV, exporting as IDM_PR_CLIENT_CRT"
    export IDM_PR_CLIENT_CRT=${HAPPYCATTLE_TOKEN_CRT_CONTENT}
elif [ -n "$HAPPYCATTLE_TOKEN_CRT_FILE" ]; then
    # Certificate set as file
    echo "Certificate set as file, exporting content as ENV IDM_PR_CLIENT_CRT"
    export IDM_PR_CLIENT_CRT=`(awk '/-----BEGIN CERTIFICATE-----/, /-----END CERTIFICATE-----/' /run/secrets/happycattle_cert)`
else
    # No certificate set
    echo "ERROR: No certificate set (ENVS: HAPPYCATTLE_TOKEN_CRT_CONTENT or HAPPYCATTLE_TOKEN_CRT)"
    exit 1
fi

# Check EORI ENV
if [ -n "$HAPPYCATTLE_EORI" ]; then
    export IDM_PR_CLIENT_ID=${HAPPYCATTLE_EORI}
else
    echo "ERROR: No EORI set (ENV: HAPPYCATTLE_EORI)"
    exit 1
fi

# Check iSHARE Satellite ENVs
if [ -n "$SATELLITE_HOST" ]; then
    export IDM_PR_URL=${SATELLITE_HOST}
else
    echo "ERROR: No host set for iSHARE satellite (ENV: SATELLITE_HOST)"
    exit 1
fi
if [ -n "$SATELLITE_TOKEN_ENDPOINT" ]; then
    export IDM_PR_TOKEN_ENDPOINT=${SATELLITE_TOKEN_ENDPOINT}
else
    echo "ERROR: No token endpoint set for iSHARE satellite (ENV: SATELLITE_TOKEN_ENDPOINT)"
    exit 1
fi
if [ -n "$SATELLITE_PARTIES_ENDPOINT" ]; then
    export IDM_PR_PARTIES_ENDPOINT=${SATELLITE_PARTIES_ENDPOINT}
else
    echo "ERROR: No parties endpoint set for iSHARE satellite (ENV: SATELLITE_PARTIES_ENDPOINT)"
    exit 1
fi
if [ -n "$SATELLITE_EORI" ]; then
    export IDM_PR_ID=${SATELLITE_EORI}
else
    echo "ERROR: No EORI set for iSHARE satellite (ENV: SATELLITE_EORI)"
    exit 1
fi


# Start Keyrock
echo "Starting Keyrock"
npm start
