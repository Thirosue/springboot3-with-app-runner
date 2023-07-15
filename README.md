# springboot3-with-app-runner

## Run

- mac

```bash
./gradlew bootRun
```

- windows

```bash
gradlew.bat bootRun
```

## Format

- mac

```bash
./gradlew spotlessApply
```

## Build

- mac

```bash
./gradlew clean build -x test
```

## Run Server

```bash
POSTGRES_ENDPOINT=localhost POSTGRES_PASSWORD=postgres java -jar build/libs/demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod
```
