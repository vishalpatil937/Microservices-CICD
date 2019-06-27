FROM java:8
WORKDIR /
ADD ./api-gateway.jar api-gateway.jar
COPY ./application.properties application.properties
ENTRYPOINT ["java","-jar","/api-gateway.jar","/application.properties"]
EXPOSE 8086
