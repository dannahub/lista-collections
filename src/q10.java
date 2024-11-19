import java.util.TreeMap;

public class q10 {

    public static void main(String[] arg){
        TreeMap<String, Integer> pessoas = new TreeMap<>();
        pessoas.put("jordanna", 19);
        pessoas.put("erlon", 24);
        pessoas.put("gunde", 21);
        pessoas.put("victor", 19);
        pessoas.put("julia", 20);
        pessoas.put("mathias", 22);

        for (String nome : pessoas.keySet()) {
            System.out.printf("\nnome: %s, idade: %d\n", nome, pessoas.get(nome));
        }
    }
}
