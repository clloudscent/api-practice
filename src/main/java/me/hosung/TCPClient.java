package me.hosung;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 9898);
        System.out.println("서버에 연결 되었습니다.");

        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);
        Scanner scanner = new Scanner(System.in);
        System.out.print("전송할 메시지 입력: ");
        String messageToSend = scanner.nextLine();
        printWriter.println(messageToSend);
        printWriter.flush();

        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String message = bufferedReader.readLine();
        System.out.println("서버로부터 수신한 메시지: "+message);

        socket.close();
    }
}
