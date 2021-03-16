class tekstiga implements kysitlus {
    String vastus = "0";
    String[] lahendused = {"Volvo", "BMW", "Ford", "Mazda"};
    public tekstiga(String[] l){
        lahendused = l;
    }
    public void vasta(String v){vastus = v;}
    public int kysiVastus(){
        for(int i=0; i<lahendused.length; i++){
			if(vastus.equals(lahendused[i])){
                return 1;
            }
		}
        return 0;}
}
