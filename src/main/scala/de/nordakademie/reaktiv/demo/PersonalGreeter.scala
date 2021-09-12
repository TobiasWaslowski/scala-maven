package de.nordakademie.reaktiv.demo

import akka.actor.Actor

class PersonalGreeter extends Actor {

  def receive: Receive = {
    case string: String => println("blub")
  }

}
