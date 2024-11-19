
import java.util.HashSet;

public class q6 {

    public static void main(String[] arg){
        HashSet<String> cidades = new HashSet<>();
        cidades.add("alagoinha");
        cidades.add("cajazeiras");
        cidades.add("ipaumirim");
        cidades.add("rio de janeiro");
        cidades.add("pato branco");

        for (String cidade: cidades) {
            System.out.println(cidade);
        }
    }
}
