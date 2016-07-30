// Simple 'hello world' example for using Apache Spark
// http://spark.apache.org/docs/latest/quick-start.html

import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

object SimpleApp {
  def main(args: Array[String]) {
    val logFile = "README.md"
    val conf = new SparkConf().setAppName("Simple Application")
    val sc = new SparkContext(conf)
    val logData = sc.textFile(logFile, 2).cache()
    val numAs = logData.filter(line => line.contains("a")).count()
    val numBs = logData.filter(line => line.contains("b")).count()
    println("Hello, Spark!")
    println("Lines with a: %s, Lines with b: %s".format(numAs, numBs))
  }
}

