package com.websocket.unicast;

import java.io.*;
import java.util.*;

import javax.websocket.*;
import javax.websocket.server.*;

@ServerEndpoint("/unicast")
public class Unicast {
	private static Set<Session> clients = Collections.synchronizedSet(new HashSet<Session>());
	
	@OnOpen
	public void onOpen(Session session) {
		System.out.println(session);
		
		clients.add(session);
	}
	
	@OnMessage
	public void onMessage(String msg, Session session) throws IOException {
		System.out.println(msg);
		
		synchronized (session) {
			for (Session client : clients) {
				if (!client.equals(session)) client.getBasicRemote().sendText(msg);
			}
		}
	}
	
	@OnError
	public void onError(Throwable e) {
		e.printStackTrace();
	}
	
	@OnClose
	public void onClose(Session session) {
		clients.remove(session);
	}
}
