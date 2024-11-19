import java.util.ArrayList;
import java.util.HashSet;

public class q5 {

    public static void main(String[] arg){
        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(50);
        numeros.add(50);

        ArrayList<Integer> semDuplicidade = new ArrayList<>(numeros);
        for (int i = 0; i < semDuplicidade.size(); i++){
            System.out.println(semDuplicidade.get(i));
        }
    }
}
