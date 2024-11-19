import java.util.HashMap;

public class q8 {

    public static void main(String[] arg) {
        HashMap<String, Integer> pessoas = new HashMap<>();
        pessoas.put("jordanna", 19);
        pessoas.put("erlon", 24);
        pessoas.put("gunde", 21);

        for (String nome : pessoas.keySet()){
            int idade = pessoas.get(nome);
            System.out.printf("\nnome: %s, idade: %d\n", nome, idade);
        }
    }
}
