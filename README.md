# spark-hello-world
Minimal Apache spark example to run a spark application in Scala

http://spark.apache.org/docs/latest/quick-start.html


### Installation
Install Apache Spark 2.0.0 (http://spark.apache.org/downloads.html), Scala 2.11, and the Scala build tool on your system.

### Example
Build the application.
```bash
$ sbt package
```

Submit application to spark to run it.
```bash
$ /PATH TO SPARK/bin/spark-submit --class "SimpleApp" --master local[2] target/scala-2.11/simple-project_2.11-1.0.jar \
[...] 
Hello, Spark!
Lines with a: 10, Lines with b: 4
```
