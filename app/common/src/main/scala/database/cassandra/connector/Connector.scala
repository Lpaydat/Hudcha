package database.cassandra.connector

import java.net.InetAddress

import com.typesafe.config.ConfigFactory
import com.websudos.phantom.connectors.{ContactPoint, ContactPoints, KeySpace}

import scala.collection.JavaConversions._

/**
  * Created by madooc on 9/25/16.
  */
object Connector {

  val config = ConfigFactory.load()

  val username = config.getString("cassandra.username")
  val password = config.getString("cassandra.password")

  // web app
  val webHosts = config.getStringList("cassandra.web_hosts")
  val webInets = webHosts.map(InetAddress.getByName)
  val webKs = config.getString("cassandra.web_keyspace")
  lazy val webConnector = ContactPoints(webHosts).withClusterBuilder(
    _.withCredentials(username, password)
  ).keySpace(webKs)

  // crawler app
  val crawlerHosts = config.getStringList("cassandra.crawler_hosts")
  val crawlerInets = crawlerHosts.map(InetAddress.getByName)
  val crawlerKs = config.getString("cassandra.crawler_keyspace")
  lazy val crawlerConnector = ContactPoints(crawlerHosts).withClusterBuilder(
    _.withCredentials(username, password)
  ).keySpace(crawlerKs)

  // analyser app
  val analyserHosts = config.getStringList("cassandra.analyser_hosts")
  val analyserInets = analyserHosts.map(InetAddress.getByName)
  val analyserKs = config.getString("cassandra.analyser_keyspace")
  lazy val analyserConnector = ContactPoints(analyserHosts).withClusterBuilder(
    _.withCredentials(username, password)
  ).keySpace(analyserKs)

  // advertiser app
  val advertiserHosts = config.getStringList("cassandra.advertiser_hosts")
  val advertiserInets = advertiserHosts.map(InetAddress.getByName)
  val advertiserKs = config.getString("cassandra.advertiser_keyspace")
  lazy val advertiserConnector = ContactPoints(advertiserHosts).withClusterBuilder(
    _.withCredentials(username, password)
  ).keySpace(advertiserKs)

  // for scalaTest use
  val testKs = config.getString("cassandra.test_keyspace")
  lazy val test = ContactPoint.embedded.keySpace(testKs)
  lazy val testKeySpace = KeySpace.apply(testKs)
  lazy val testSession = test.session

}
