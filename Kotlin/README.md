# Kotlin Ready 4 Kata

Requirements:

- `openjdk-18.0.2` or later

> or just `docker` in alternative, see "Docker way" at the end

### Build it

```
$ ./gradlew build -x test
```

> first run can be slow, it will download gradle wrapper and dependencies

### Run tests

To run tests:

```
$ ./gradlew test
```

## Docker way

If you do not have java installed in you machine, everything can be executed in a temporary container.

Start the temporary container on bash with:

```
$ docker run --rm -it -v $PWD:/app -w /app openjdk:18.0-slim bash
root@620af4e91dbf:/app#
```

Here you can execute setup commands normally as described above:

```
# ./gradlew build -x test
# ./gradlew ...
```

To open a new bash session in the same temporary container:

```
$ docker exec -it [container-name] bash
```
