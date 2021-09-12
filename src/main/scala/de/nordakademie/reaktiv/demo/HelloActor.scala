package de.nordakademie.reaktiv.demo

import akka.actor.Actor

class HelloActor extends Actor {

  def receive: Receive = {
    case "hello" => println("hello back at you")
    case _ => println("huh?")
  }

}