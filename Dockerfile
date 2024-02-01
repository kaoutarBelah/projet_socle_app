FROM ubuntu:latest
LABEL authors="dosi"

ENTRYPOINT ["top", "-b"]