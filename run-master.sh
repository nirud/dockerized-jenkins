docker build master -t master
docker run --rm -p 8080:8080 -p 50000:50000 master
