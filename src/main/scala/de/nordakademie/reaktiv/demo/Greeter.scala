package de.nordakademie.reaktiv.demo

import akka.actor.Actor

class Greeter extends Actor {

  def receive: Receive = {
    case m : Message => m.recipient ! m.content
    case s : String => println(s"Received message ${s}")
    case _ => println("I'm afraid I can't do anything with this.")
  }

}
