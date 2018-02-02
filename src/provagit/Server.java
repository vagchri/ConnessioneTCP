/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provagit;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Christian Vagnetti
 */
public class Server {
    ServerSocket sv = null;
    
    public Server(int portaserver) throws IOException{
     
        sv=new ServerSocket(portaserver);  
    }
    
 public void ascolta() throws IOException{
    Socket s1 = sv.accept();//apre comunicazione con client
    BufferedReader r = new BufferedReader( new InputStreamReader(s1.getInputStream()));
    System.out.println("Il client ha inviato il seguente messaggio: " + r.readLine());
    rispondi(s1);
 }
 
 public void rispondi(Socket s1) throws IOException{
     BufferedWriter w = new BufferedWriter(new OutputStreamWriter(s1.getOutputStream()));
     w.write("Grazie per il messaggio\n");
     w.flush();
 }
           
                
                       
                            
                                    
                                        
                                                    
    
}
