package de.nordakademie.reaktiv.demo

import akka.actor.Actor

class HelloActor extends Actor {

  def receive: Receive = {
    case string: String => println(s"Hallo, ${string}!")
    case _ => println("Sorry, das verstehe ich nicht.")
  }

}