package de.nordakademie.reaktiv.chatroom

import akka.actor.{Actor, ActorRef}
import de.nordakademie.reaktiv.chatroom.User._

object User {

  case class ConnectTo(chatRoom: ActorRef)
  case class OutgoingMessage(toRoom: ActorRef, text: String)

}

class User extends Actor {

  def receive: Receive = {
    case ConnectTo(chatRoom) =>
      chatRoom ! ChatAction.Join
      context.become(connectedBehaviour())
    case _ => context.system.log.warning("I'm not connected to any chatrooms yet :(")
  }

  def connectedBehaviour(): Receive = {

    {
      case ChatAction.Message(user, text) =>
        context.system.log.info(s"Received message from ${user}: ${text}")

      case OutgoingMessage(actorRef, text) =>
        context.system.log.info(s"Sending message to chat: ${actorRef.toString()}: ${text}")
        actorRef ! text
    }
  }

}
