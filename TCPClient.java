
import java.io.*;

public class TCPClient
{
	public static void main (String[] args) throws Exception
	{
		try
               {
                     Socket socket= new Socket("192.168.254.128",8888);
			DataInputStream inStream= new DataInputStream(TCPClient.getInputStream());
			DataOutputStream outStream = new DataOutputStream(TCPClient.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String clientMessage=" ",serverMessage=" ";
			while(!clientMessage.equals("bye"))
			{
				clientMessage = br.readLine();
				outStream.writeUTF(clientMessage);
				outStream.flush();
				serverMessage= inStream.readUTF();
				System.out.println("From server:" + serverMessage);
			}
			outStream.close();
			outStream.close();
			client.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

