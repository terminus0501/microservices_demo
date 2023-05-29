FROM openjdk:11
ENV APP_HOME=/apps
WORKDIR $APP_HOME
COPY ./ems-departments-0.0.1-SNAPSHOT.jar ./departments.jar
EXPOSE 8086
ENTRYPOINT ["java","-jar"]
CMD ["departments.jar"]
