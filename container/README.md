
Nuvla Ring Server Container
===========================

This module contains a simple, generic ring application container that
can be reused for the collection of micro-services that make up the
Nuvla platform.

When running the build of this repository, it will create a Docker
container, which contains an example ring handler.  The name of the
container will be `nuvla/ring:version` when building a release version
and `nuvladev/ring:branch-name` when building a snapshot.

Running Example
---------------

To run this, do the following:

```sh
docker run -p 8200:8200 -d nuvla/ring
```

The example service will be available on
http://localhost:8200/example, which should respond with the message
"Ring Example Running!".

Running Other Ring Handlers
---------------------------

To use a different ring handler (i.e. run a different service), you
must provide the namespace for the init function as an environmental
variable:

```sh
NUVLA_SERVER_INIT=sixsq.nuvla.server.example/init
```

You can also modify the variables:

```sh
NUVLA_SERVER_HOST=0.0.0.0
NUVLA_SERVER_PORT=8200
```

The example shows the default values.  If you modify the port, you
should also modify the "exposes" and "ports" parameters in your
Dockerfile.
