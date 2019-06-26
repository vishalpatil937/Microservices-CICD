FROM java:8
WORKDIR /
ADD ./eureka-server.jar eureka-server.jar
COPY ./application.properties application.properties
ENTRYPOINT ["java","-jar","/eureka-server.jar","/application.properties"]
EXPOSE 8761
