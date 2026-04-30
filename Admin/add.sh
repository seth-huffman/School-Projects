#!/bin/bash

if [ $# != 1 ]; then
echo "Expected name of LDIF file"
exit
fi

ldapadd -v -x -D "cn=Directory Manager" -W -f $1
