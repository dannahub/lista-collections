import java.util.ArrayList;

public class q1 {
    public static void main(String[] arg){
        ArrayList<Integer> numeros = new ArrayList();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        for (int i = 0; i < numeros.size(); i++){
            System.out.println(numeros.get(i));
        }
    }
}
