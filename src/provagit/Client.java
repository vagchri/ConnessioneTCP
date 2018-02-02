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
import java.net.Socket;

/**
 *
 * @author Christian Vagnetti
 */
public class Client {
    Socket s1 = null;

    public Client(int portaserver) throws IOException {
        s1=new Socket("localhost",portaserver);
        
    }
    
public void connetti(String s) throws IOException{
    BufferedWriter w = new BufferedWriter( new OutputStreamWriter(s1.getOutputStream()));//Aperto canale di scrittura,conversione byte to caratteri
    w.write(s + '\n');
    w.flush();//forza lo scaricamento del buffering
}

public String risposta() throws IOException{
    BufferedReader r = new BufferedReader( new InputStreamReader( s1.getInputStream()));
    String s = r.readLine();
    r.close();
    return s;
}
    
    
}
