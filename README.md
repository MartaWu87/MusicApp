# MusicApp
Introduction
We are asking you to start a small music database application that keeps the track listings of
selected records. To get started, it will contain just a single album, “Vows” by Kimbra, released in
2011. The album does however come in two editions: a shorter one (11 songs - the original,
Australian / New Zealand release) and a longer one (13 songs - the North American / European
release) and we want the database to be aware of this.
And yes, we need you to look up the track listings on the internet.
Your Task
Your task is to:
● Design a relational database structure that will be able to store track listings for albums,
and the minimal set of stored data should include:
○ The album performer
○ The album title
○ The album release date
○ The tracks the album contains, along with their respective titles and duration times
● Design a Java application using a framework of your choice (Spring / Quarkus / Helidon /
plain JavaEE) that will expose the data stored in the database as a REST API. We expect
the API to have at least two endpoints:
○ One for getting a list of stored albums
○ One for getting an ordered track list of a chosen album
● The application has just a few constraints we want to impose:
○ It needs to use a real relational database engine, it may however be an embedded,
in-memory DB such as H2
○ We want your DB structure and seed data to be delivered as an SQL script file
○ The REST API responses should be in the JSON format
○ The endpoint returning the list of stored albums, should expose - for each of them -
the total album length, calculated from the track listing.
The rest is entirely up to you, you may choose to deliver the project as simple or as complicated
as you wish. You may choose any LTS Java version (8, 11, 17) and the corresponding language
features. Use Hibernate, Liquibase, Flyway, Spring Security, Docker Compose or any other
technology only if it helps you to achieve the goal easier or faster.
Our final request is to use Maven for dependency management and project description - none of
our reviewers is a particular Gradle fan 😉
