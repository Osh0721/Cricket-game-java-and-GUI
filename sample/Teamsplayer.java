package sample;

import javafx.beans.property.SimpleStringProperty;

public class Teamsplayer {


    protected SimpleStringProperty Chennai;
    protected SimpleStringProperty Mumbai;
    protected SimpleStringProperty Rajasthan;
    protected SimpleStringProperty Kolkata;
    protected SimpleStringProperty Kandy;
    protected SimpleStringProperty Uthura;
    protected SimpleStringProperty Uva;
    protected SimpleStringProperty Wayamba;

    public Teamsplayer(String Chennai,String Mumbai,String Rajasthan,String Kolkata,String Kandy,String Uthtura,String Uva,String Wayamba){
        this.Chennai=new SimpleStringProperty(Chennai);
        this.Mumbai=new SimpleStringProperty(Mumbai);
        this.Rajasthan=new SimpleStringProperty(Rajasthan);
        this.Kolkata=new SimpleStringProperty(Kolkata);
        this.Kandy=new SimpleStringProperty(Kandy);
        this.Uthura=new SimpleStringProperty(Uthtura);
        this.Uva=new SimpleStringProperty(Uva);
        this.Wayamba=new SimpleStringProperty(Wayamba);

    }

    public String getChennai() {
        return Chennai.get();
    }

    public void setChennai(String Chennai) {
        this.Chennai=new SimpleStringProperty(Chennai);
    }

    public String getMumbai() {
        return Mumbai.get();
    }


    public void setMumbai(String Mumbai) {
        this.Mumbai=new SimpleStringProperty(Mumbai);}

    public String getRajasthan() {
        return Rajasthan.get();
    }


    public void setRajasthan(String Rajasthan) {
        this.Rajasthan=new SimpleStringProperty(Rajasthan);}

    public String getKolkata() {
        return Kolkata.get();
    }


    public void setKolkata(String Kolkata) {
        this.Kolkata=new SimpleStringProperty(Kolkata);}


    public String getKandy() {
        return Kandy.get();
    }


    public void setKandy(String Kandy) {
        this.Kandy=new SimpleStringProperty(Kandy);}



    public String getUthura() {
        return Uthura.get();
    }


    public void setUthura(String Uthura) {
        this.Uthura=new SimpleStringProperty(Uthura);}


    public String getUva() {
        return Uva.get();
    }

    public void setUva(String Uva) {
        this.Uva=new SimpleStringProperty(Uva);}




    public void setWayamba(String Wayamba) {
        this.Wayamba=new SimpleStringProperty(Wayamba);}



    public String getWayamba() {
        return Wayamba.get();
    }






}
