# Clojure backend example

Backend for Ilja's front-end project.

####### Inspired from
https://github.com/ilja903/simple-frontend-boilerplate
https://github.com/ilja903/java-backend-boilerplate

####### To run
* 1) You need to have both Ilja's projects (ref: inspired from), leiningen and PostGresDb
* 2) Fill the database by running "mvn clean install flyway:clean flyway:migrate"
* 3) Navigate cmd to this folder and run "lein ring server 4567"
* 4) Open front-end project's index.html in IDE
* 5) POST method doesn't work*

* if you simulate post request, it works. Dunno why:/


####### My experience with Clojure in backend

* Clojure rocks, but plugins suck.
For database integration I've used YESQL, which is a by far best db integration plugin, based on brilliant idea and very easy, but runs on jdbc2.
Which means a bunch of extra problems with getting and inserting data. To insert a date, I must use sql Date. Etc...

* IDE sucks. Java tools are many times superior. IDE's must improve!

* Debugging? None. Do I need to add (do (println myvariable) ... everywhere once I run into trouble.

* Sign up for clojure now!