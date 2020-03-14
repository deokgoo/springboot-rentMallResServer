#!/bin/sh

echo "CREATE DATABASE IF NOT EXISTS \`rent_mall_test\` ;" | "${mysql[@]}"
echo "GRANT ALL ON \`rent_mall_test\`.* TO '"$MYSQL_USER"'@'%' ;" | "${mysql[@]}"
echo "FLUSH PRIVILEGES ;" | "${mysql[@]}"
