package cntt61.p61134168;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class DichSo extends Thread{
	Socket socketClient;
	int id = -1;
	public DichSo(Socket socketClient, int id) {
		super();
		this.socketClient = socketClient;
		this.id = id;
	}
	public void run() {
		try {
			System.out.print(socketClient.getInetAddress().getHostAddress());
			System.out.print(id);
			
			OutputStream osToClient = socketClient.getOutputStream();
			OutputStreamWriter write2client = new OutputStreamWriter(osToClient);
			BufferedWriter buffW = new BufferedWriter(write2client);
			
			InputStream in = socketClient.getInputStream();
			InputStreamReader inReader = new InputStreamReader(in);
			BufferedReader buffR = new BufferedReader(inReader);
			
			while(true){
				String chuoiNhan=buffR.readLine();
				System.out.print("\n"+chuoiNhan);
				
				if(chuoiNhan.equals("0")) {
					String chuoiGui= "zero";
					buffW.write(chuoiGui+"\n");
					buffW.flush();
				}else if(chuoiNhan.equals("1")) {
					String chuoiGui= "one";
					buffW.write(chuoiGui+"\n");
					buffW.flush();
				}else if(chuoiNhan.equals("2")) {
					String chuoiGui= "two";
					buffW.write(chuoiGui+"\n");
					buffW.flush();
				}else if(chuoiNhan.equals("3")) {
					String chuoiGui= "three";
					buffW.write(chuoiGui+"\n");
					buffW.flush();
				}else if(chuoiNhan.equals("4")) {
					String chuoiGui= "four";
					buffW.write(chuoiGui+"\n");
					buffW.flush();
				}else if(chuoiNhan.equals("5")) {
					String chuoiGui= "five";
					buffW.write(chuoiGui+"\n");
					buffW.flush();
				}else if(chuoiNhan.equals("6")) {
					String chuoiGui= "six";
					buffW.write(chuoiGui+"\n");
					buffW.flush();
				}else if(chuoiNhan.equals("7")) {
					String chuoiGui= "seven";
					buffW.write(chuoiGui+"\n");
					buffW.flush();
				}else if(chuoiNhan.equals("8")) {
					String chuoiGui= "eight";
					buffW.write(chuoiGui+"\n");
					buffW.flush();
				}else if(chuoiNhan.equals("9")) {
					String chuoiGui= "night";
					buffW.write(chuoiGui+"\n");
					buffW.flush();
				}else if(chuoiNhan.equals("10")) {
					String chuoiGui= "ten";
					buffW.write(chuoiGui+"\n");
					buffW.flush();
					break;
				}
				
			}
			socketClient.close();
			
		}catch(Exception e) {
			System.out.print(e.getMessage());
		}
	}
}
