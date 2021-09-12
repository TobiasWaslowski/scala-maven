package de.nordakademie.reaktiv.demo

import akka.actor.{ActorSystem, Props}

object Main extends App {

  // Initiate ActorSystem and HelloActor
  val system: ActorSystem = ActorSystem("test")
  val helloActor = system.actorOf(Props[HelloActor], "helloActor")

  // TODO: Send message to HelloActor

  // And kill the system
  system.terminate()
}
