clibernate
==========

Simple Spring+Hibernate application template supposed to test some ideas from command line. In default configuration
working with embedded H2 database (the engine and hibernate dialect can be switched in `clibernate.properties`).

1. Create model classes derived from `BaseEntity`.
2. Create repositories derived from `BaseRepository`.
3. Create command line services derived from `BaseCliService`, parse command line options and perform actions.
4. Build with `mvn package`.
5. Run with `java -jar clibernate-1.0-SNAPSHOT.jar [your_options] [your_service_name]`.

The example is included in `TestCliService` class.
