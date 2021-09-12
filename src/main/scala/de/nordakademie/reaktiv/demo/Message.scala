package de.nordakademie.reaktiv.demo

import akka.actor.ActorRef

case class Message(recipient: ActorRef, content: String)
