import java.util.ArrayList;
import java.util.HashSet;

public class q7 {

    public static void main(String[] arg){
        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        numeros.add(25);

        if(numeros.contains(15)){
            System.out.println("o número 15 está na lista");
        } else {
            System.out.println("o número 15 não está na lista");
        }
    }
}
