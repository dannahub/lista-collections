import java.util.ArrayList;
import java.util.Collections;

public class q4 {
    public static void main(String[] arg){
        ArrayList<Integer> numeros = new ArrayList();
        numeros.add(2);
        numeros.add(0);
        numeros.add(23);
        numeros.add(40);
        numeros.add(8);

        Collections.sort(numeros);
        for (int i = 0; i < numeros.size(); i++){
            System.out.println(numeros.get(i));
        }
    }
}
