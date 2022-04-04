package phi61134168;

import java.io.DataInputStream;

import java.io.DataOutputStream;

import java.io.IOException;

import java.net.ServerSocket;

import java.net.Socket;





public class Server {

private static ServerSocket serverSocket = null;

public static void main(String[] args) throws IOException{

// TODO code application logic here



    DataOutputStream dos = null;

    DataInputStream dis=null;

    try {

        serverSocket = new ServerSocket(8989);

        System.out.print("Server đã được mở \n" );

        Socket clientSocket = null;

        clientSocket = serverSocket.accept();

        dos=new DataOutputStream(clientSocket.getOutputStream());

        dis=new DataInputStream(clientSocket.getInputStream());

        String inline="";

        while(true)

        {

            inline = dis.readUTF();

            char ch[]=inline.toCharArray();

            if(Character.isDigit(ch[0]))

                {

                int i=Integer.parseInt(inline);

                switch(i)

                {

                    case 0:inline="Zero";break;

                    case 1:inline="One";break;

                    case 2:inline="Two";break;

                    case 3:inline="Three";break;

                    case 4:inline="Four";break;

                    case 5:inline="Five";break;

                    case 6:inline="Six";break;

                    case 7:inline="Seven";break;

                    case 8:inline="Eight";break;

                    case 9:inline="Nine";break;

                }

                dos.writeUTF(inline);

            }

          catch(Exception e) 
     }

}
