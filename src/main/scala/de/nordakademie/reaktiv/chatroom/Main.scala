package de.nordakademie.reaktiv.chatroom

import akka.actor.{ActorSystem, Props}

object Main extends App {

  val system: ActorSystem = ActorSystem("chat")

  val chatRoom = system.actorOf(Props[ChatRoom], "chatRoom")

  val tobi = system.actorOf(Props[User], "tobi")
  val morten = system.actorOf(Props[User] , "morten")
  val clarissa = system.actorOf(Props[User] , "clarissa")
  val nico = system.actorOf(Props[User] , "nico")

  tobi ! User.ConnectTo(chatRoom)
  morten ! User.ConnectTo(chatRoom)
  clarissa ! User.ConnectTo(chatRoom)
  nico ! User.ConnectTo(chatRoom)

  tobi ! User.OutgoingMessage(chatRoom, "hey!")
  nico ! User.OutgoingMessage(chatRoom, "hallo!")

}
