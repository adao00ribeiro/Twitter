package TwitterApp;

import GUI.telainicial;
import static TwitterApp.TelaLogin.conexao;
import java.io.IOException;
import twitter4j.Twitter;
import twitter4j.TwitterException;

public class Main {

    static Home home;

    public static void main(String[] args) throws IOException, TwitterException {
        //direto
     /*
      TwitterConfiguration novo = new TwitterConfiguration();
      Twitter twitter = novo.conexao();
      home = new Home(twitter);
        home.setVisible(true);
   
        //automatico token
        
       // TelaLogin novo;
       // novo = new TelaLogin();
     //  novo.setVisible(true);
      */
       TwitterConfiguration novo = new TwitterConfiguration();
       Twitter twitter = novo.conexao();
       telainicial menu = null;
       menu = new telainicial(twitter);
         menu.setVisible(true);
    
     
    }
}

