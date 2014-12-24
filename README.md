clibernate
==========

Simple Spring+Hibernate application template supposed to test some ideas from command line. In default configuation
working with embedded H2 database (the engine and hibernate dialect can be switched in `clibernate.properties`).

1. Create model class(s) derived from `BaseEntity`.
2. Create repository(s) derived from `BaseRepository`.
3. Create command line service(s) derived from `BaseCliService`, parse command line options and perform action(s).
4. Build with maven.
5. Run with `java -jar cliberante-1.0-SNAPSHOT.jar [options] [service_name]`.
