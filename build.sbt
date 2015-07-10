name := "lda"

version := "1.0"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.3.1"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "1.3.1"

libraryDependencies += "org.apache.spark" %% "spark-hive" % "1.3.1"

libraryDependencies += "org.apache.spark" %% "spark-mllib" % "1.3.1"

libraryDependencies += "org.apache.spark" %% "spark-graphx" % "1.3.1"

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"

resolvers ++= Seq(
    "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/"
)

resolvers +=
    "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"


libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.2.1" % "test"
