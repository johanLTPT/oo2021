class valikvastusega implements kysitlus {
    int vastus = 0;
    int lahendus = 3;
    public valikvastusega(int l){
        lahendus = l;
    }
    public void vasta(String v){vastus = Integer.parseInt(v);}
    public int kysiVastus(){if(vastus == lahendus){return 1;}else{return 0;}}
    
}
