name := "otb-ab-to-city_star_order_cancel_daily_acc"

version := "1.0"

scalaVersion := "2.10.6"

libraryDependencies +=  "org.apache.spark" % "spark-core_2.10" % "1.5.1" % "provided"

assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false)
