# Typescript Ready 4 Kata

Requirements:

- `node 16.18` or later

> or just `docker` in alternative, see "Docker way" at the end

### Build it

```
$ yarn install
$ yarn tsc
```

> remember to enable `yarn` if needed: `corepack enable`


### Run tests

To run tests:

```
$ yarn test
```

## Docker way

If you do not have node installed in you machine, everything can be executed in a temporary container.

Start the temporary container on bash with:

```
$ docker run --rm -it -v $PWD:/app -w /app node:16.18 bash
root@620af4e91dbf:/app#
```

Here you can execute setup commands normally as described above:

```
# yarn install
# yarn ...
```
