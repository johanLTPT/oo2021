public class Ioon implements IoonLiides{
    String nimetus;
    Double aatomMassideSumma;
    Double Laeng;
    public Ioon(String nimetus, Double aatomMassideSumma, Double Laeng ){
        this.nimetus = nimetus;
        this.aatomMassideSumma=aatomMassideSumma;
        this.Laeng=Laeng;
    }
    public String kysiNimetus(){
        return nimetus;
    }
    public Double kysiAatomMassideSumma(){
        return aatomMassideSumma;
    }
    public Double kysiLaeng(){
        return Laeng;
    }
    public String kysiTyyp(){
        if(Laeng<0d){return "anioon";}
        if(Laeng>0d){return "katioon";}
        else{return "ioon";}
    }
}
