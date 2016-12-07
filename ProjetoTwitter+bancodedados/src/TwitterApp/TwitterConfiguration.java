package TwitterApp;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterConfiguration {

    private final String consumerKey = "EwcxsvSwWO94YRGpN55Bc01xG";
    private final String consumerSecret = "d6kYAfnyhxkoWFNH3SqqxkzZ3D7SURWM0MV5OCKPytJmfFVD10";
    private final String accessToken = "2169123428-3A3pt3L9tzSvokpcjzAepDZSCNjSK9UH0rHQKvT";
    private final String accessSecret = "UDhiprNLffVD0b3jiHyOUEeKW3YkHlFD9eLFLi8aUR23o";

    public Twitter conexao() {

        ConfigurationBuilder cb = new ConfigurationBuilder();

        cb.setDebugEnabled(true)
                .setOAuthConsumerKey(consumerKey)
                .setOAuthConsumerSecret(consumerSecret)
                .setOAuthAccessToken(accessToken)
                .setOAuthAccessTokenSecret(accessSecret);

        TwitterFactory factory = new TwitterFactory(cb.build());
        Twitter twitter = factory.getInstance();
        AccessToken accestoken = new AccessToken(accessToken, accessSecret);
        twitter.setOAuthAccessToken(accestoken);
        return twitter;
    }
    /*
           public String conexao(Twitter twitter) throws TwitterException{
              Scanner entrada = new Scanner(System.in);
              String url;
              // Twitter twitter = new TwitterFactory().getInstance();
                 twitter.setOAuthConsumer(consumerKey ,consumerSecret);
                RequestToken requestToken = twitter.getOAuthRequestToken();
                AccessToken accessToken = null;
                System.out.println("Open the following URL and grant access to your account:");
                url = requestToken.getAuthorizationURL();
                System.out.println(url);
              //  novo = new TelaLogin(url);
              //  novo.setVisible(true);
                /*
                System.out.print("Enter the PIN(if aviailable) or just hit enter.[PIN]:");
                String pin = entrada.nextLine();
                accessToken = twitter.getOAuthAccessToken(requestToken, pin);
                System.out.println(accessToken.getToken());
                System.out.println(accessToken.getTokenSecret());
                
                ConfigurationBuilder cb = new ConfigurationBuilder();

                cb.setDebugEnabled(true)
		.setOAuthConsumerKey(consumerKey)
		.setOAuthConsumerSecret(consumerSecret)
		.setOAuthAccessToken(accessToken.getToken())
		.setOAuthAccessTokenSecret(accessToken.getTokenSecret());
                
                TwitterFactory factory = new TwitterFactory(cb.build());
		twitter = factory.getInstance();
                
                twitter.setOAuthAccessToken(accessToken);
                   
                  return url;
       
          }*/
}
