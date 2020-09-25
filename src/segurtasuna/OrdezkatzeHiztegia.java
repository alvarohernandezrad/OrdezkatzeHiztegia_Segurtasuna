package segurtasuna;

public class OrdezkatzeHiztegia {

    private final String alfabetoa = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String gakoa = "ZXCVBNMASDFGHJKLQWERTYUIOP";

    public static void main(String [] args){
        /*OrdezkatzeHiztegia oH = new OrdezkatzeHiztegia();
        String mezua="EZ GAUDE GERRAREN ALDE";
        String kripto = oH.zifratu(mezua);
        System.out.println(kripto);
        String deskr = oH.deszifratu(kripto);
        System.out.println(deskr);*/
    }


    public String zifratu(String mezua){
        String emaitza = ""; //aldagai honetan mezua zifratuta gordeko dugu
        String bilatu = ""; //aldagai honetan mezuko karaktereak gordetzen joango gara alfabetoko karaktereekin konparatzeko eta zuriuneak, puntuak, komak, etab aurkitzeko
        mezua=mezua.toUpperCase(); //mezua letra larrietan jarriko dugu
       // mezua=mezua.replace(" ", ""); //nahi izango bagenu mezuko zuriuneak kendu ahalko genituzke
        for(int i=0; i< mezua.length(); i++){ //mezua karakterez-karaktere zehakatuko dugu
            char karakterea=mezua.charAt(i); //for-aren bueltari dagokion karakterea gordeko da hemen
            bilatu=bilatu+karakterea; //contains metodoak parametro moduan String bat eskatzen duenez eta ez karaktere bat, karakterea String huts batean sartuko dugu konparaketa egiteko
            if(!alfabetoa.contains(bilatu)){ //karakterea ez badago alfabetoan dagoen moduan sartuko dugu
                emaitza=emaitza+karakterea;
            }
            else{ //bestela karaktere horren posizioa bilatuko dugu alfabetoan eta gakoan posizio horri dagokion letra sartuko dugu mezuan
                int pos=alfabetoa.indexOf(karakterea);
                emaitza=emaitza+gakoa.charAt(pos);
            }
            bilatu = ""; //parametroa berriz hutsitu
        }

        return emaitza;
    }


    public String deszifratu(String kripto){ //zifratu metodoak egiten duena egiten du baina kontrara
        String emaitza = "";
        String bilatu = "";
        kripto=kripto.toUpperCase();
        //kripto=kripto.replace(" ","");
        for(int i=0; i< kripto.length(); i++){
            char karakterea=kripto.charAt(i);
            bilatu=bilatu+karakterea;
            if(!gakoa.contains(bilatu)){
                emaitza=emaitza+karakterea;
            }
            else{
                int pos=gakoa.indexOf(karakterea);
                emaitza=emaitza+alfabetoa.charAt(pos);
            }
            bilatu = "";
        }
        return emaitza;
    }










}
