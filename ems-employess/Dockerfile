FROM openjdk:11
ENV APP_HOME=/apps
WORKDIR $APP_HOME
COPY ./ems-employess-1.0-SNAPSHOT.jar ./emp.jar
EXPOSE 8086
ENTRYPOINT ["java","-jar"]
CMD ["emp.jar"]
