# pcf-workshop

cf cs p-config-server trial config-server2 -c '{"git": { "uri": "https://github.com/NLxAROSA/pcf-workshop", "searchPaths": "config-server", "label": "add-config-server" } }'
