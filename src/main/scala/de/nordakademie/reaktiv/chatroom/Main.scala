package de.nordakademie.reaktiv.chatroom

import akka.actor.{ActorSystem, Props}

object Main extends App {

  val system: ActorSystem = ActorSystem("chat")

  val chatRoom = system.actorOf(Props[ChatRoom], "chatRoom")

  val tobi = system.actorOf(Props[User], "tobi")
  val morten = system.actorOf(Props[User] , "morten")
  val clarissa = system.actorOf(Props[User] , "clarissa")

  tobi ! User.ConnectTo(chatRoom)
  morten ! User.ConnectTo(chatRoom)
  clarissa ! User.ConnectTo(chatRoom)

  tobi ! User.OutgoingMessage(chatRoom, "test")

}
