import java.util.ArrayList;

public class q3 {

    public static void main(String[] arg){
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("maçã");
        frutas.add("banana");
        frutas.add("laranja");
        frutas.add("abacaxi");

        if(frutas.contains("banana")){
            System.out.println("banana está na lista de frutas");
        } else {
            System.out.println("banana não está na lista de frutas");
        }
    }
}
