FROM public.ecr.aws/amazoncorretto/amazoncorretto:17
VOLUME /tmp

COPY demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar","--spring.profiles.active=prod"]