/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provagit;

/**
 *
 * @author Christian Vagnetti
 */
public class ProvaGit2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Client cl = new Client(2222);
            cl.connetti("Ciao!");
            String risp = cl.risposta();
            System.out.println("Il server risponde: " + risp);
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    
}
