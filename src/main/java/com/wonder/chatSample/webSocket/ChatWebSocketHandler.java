package com.wonder.chatSample.webSocket;//package com.wonder.reactiveProgramSample.webSocket;////import org.springframework.web.socket.CloseStatus;//import org.springframework.web.socket.TextMessage;//import org.springframework.web.socket.WebSocketSession;//import org.springframework.web.socket.handler.TextWebSocketHandler;////public class ChatWebSocketHandler extends TextWebSocketHandler {//    @Override//    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {//        String payload = message.getPayload();//        System.out.println("Received message: " + payload);////        // Broadcast the message to all connected clients//        for (WebSocketSession s : WebSocketSessionStore.getSessions()) {//            if (s.isOpen() && !s.getId().equals(session.getId())) {//                s.sendMessage(new TextMessage(payload));//            }//        }//    }////    @Override//    public void afterConnectionEstablished(WebSocketSession session) throws Exception {//        WebSocketSessionStore.addSession(session);//        System.out.println("Connection established with session: " + session.getId());//    }////    @Override//    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {//        WebSocketSessionStore.removeSession(session);//        System.out.println("Connection closed with session: " + session.getId());//    }//}