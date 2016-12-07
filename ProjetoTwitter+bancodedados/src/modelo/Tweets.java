/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author adao-
 */
public class Tweets {
  
    private int codigotweets;
    private long idtweet;
    private String Status;
    private String data;
    private String hashtag;
    private int codigouser;
    private String pesquisa;

    /**
     * @return the idtweet
     */
    public long getIdtweet() {
        return idtweet;
    }

    /**
     * @param idtweet the idtweet to set
     */
    public void setIdtweet(long idtweet) {
        this.idtweet = idtweet;
    }

    /**
     * @return the Status
     */
    public String getStatus() {
        return Status;
    }

    /**
     * @param Status the Status to set
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the hashtag
     */
    public String getHashtag() {
        return hashtag;
    }

    /**
     * @param hashtag the hashtag to set
     */
    public void setHashtag(String hashtag) {
        this.hashtag = hashtag;
    }

    /**
     * @return the codigouser
     */
    public int getCodigouser() {
        return codigouser;
    }

    /**
     * @param codigouser the codigouser to set
     */
    public void setCodigouser(int codigouser) {
        this.codigouser = codigouser;
    }

    /**
     * @return the pesquisa
     */
    public String getPesquisa() {
        return pesquisa;
    }

    /**
     * @param pesquisa the pesquisa to set
     */
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    /**
     * @return the codigotweets
     */
    public int getCodigotweets() {
        return codigotweets;
    }

    /**
     * @param codigotweets the codigotweets to set
     */
    public void setCodigotweets(int codigotweets) {
        this.codigotweets = codigotweets;
    }
}