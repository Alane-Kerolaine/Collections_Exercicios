package Main;

import Model.Pessoa;
import com.sun.source.doctree.SeeTree;

import java.util.*;

public class main {

    public static void main(String[] args) {

        //USANDO MÉTODO COM SCAN PARA ADD PESSOAS DINAMICAMENTE//
//        Pessoa p1 = new Pessoa();
//        p1.adicionarPessoa();
//
//        Pessoa p2 = new Pessoa();
//        p2.adicionarPessoa();
//
//        Pessoa p3 = new Pessoa();
//        p3.adicionarPessoa();
//
//        Pessoa p4 = new Pessoa();
//        p4.adicionarPessoa();
//
//        Pessoa p5 = new Pessoa();
//        p5.adicionarPessoa();

        Pessoa p1 = new Pessoa();
        p1.setNome("Kerolaine");
        p1.setDataNascimento("10/01/1996");
        p1.setEmail("kerolaine@live.com");

        Pessoa p2 = new Pessoa();
        p2.setNome("Abelardo");
        p2.setDataNascimento("31/05/1994");
        p2.setEmail("abelardo@live.com");

        Pessoa p3 = new Pessoa();
        p3.setNome("Gael");
        p3.setDataNascimento("23/05/2019");
        p3.setEmail("gael@live.com");

        Pessoa p4 = new Pessoa();
        p4.setNome("Alexandre");
        p4.setDataNascimento("18/06/1974");
        p4.setEmail("alexandre@live.com");

        Pessoa p5 = new Pessoa();
        p5.setNome("Carmen");
        p5.setDataNascimento("15/11/1976");
        p5.setEmail("carmen@live.com");

        //USANDO LIST, ARRAY LIST
//        List<Pessoa> listaPessoas = new ArrayList<>();

        //ADICIONAR
//        listaPessoas.add(p1);
//        listaPessoas.add(p2);
//        listaPessoas.add(p3);
//        listaPessoas.add(p4);
//        listaPessoas.add(p5);

        //PESQUISAR
        //        System.out.println(listaPessoas.get(0));

        // DELETAR
        //        listaPessoas.remove(0);

        //  LISTAR
        //        for (Pessoa pessoasCadastradas : listaPessoas){
//            System.out.println(pessoasCadastradas);
//        }

        //USANDO SET, HASH SET

        //ADICIONAR
//        Set<Pessoa> setPessoas = new HashSet<>();
//        setPessoas.add(p1);
//        setPessoas.add(p2);
//        setPessoas.add(p3);
//        setPessoas.add(p4);
//        setPessoas.add(p5);
//        setPessoas.add(p5);

        //REMOVER
//        setPessoas.remove(p1);

        //LISTAR
//        for (Pessoa pessoasCadastradas : setPessoas){
//            System.out.println(pessoasCadastradas);
//        }

        //USANDO MAP, HASH MAP
        Map<String, Pessoa> mapPessoas = new HashMap<>();

        //ADICIONAR
        mapPessoas.put("A", p1);
        mapPessoas.put("B", p2);
        mapPessoas.put("C", p3);
        mapPessoas.put("D", p4);
        mapPessoas.put("E", p5);

        //PESQUISAR
//        System.out.println(mapPessoas.get("C"));

       //REMOVER
//        mapPessoas.remove("A");

        //LISTAR
        for (Map.Entry<String, Pessoa> pessoasCadastradas : mapPessoas.entrySet()){
            System.out.println(pessoasCadastradas);
        }

    }
}
