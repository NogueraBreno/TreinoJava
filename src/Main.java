import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        List<String[]>  dadosFuncionario = new ArrayList<>();
                        dadosFuncionario.add(new String[]{"Maria", "18/10/2000", "2009.44", "Operador"});
                        dadosFuncionario.add(new String[]{"João", "15/05/1990", "2284.38", "Operador"});
                        dadosFuncionario.add(new String[]{"Caio","02/05/1961","9836.14","Coordenador"});
                        dadosFuncionario.add(new String[]{"Alice","05/01/1995","2234.68","Recepcionista"});
                        dadosFuncionario.add(new String[]{"Heitor","19/11/1999","1582.72","Operador"});
                        dadosFuncionario.add(new String[]{"Arthur","31/03/1993","4071.84","Contador"});
                        dadosFuncionario.add(new String[]{"Laura", "08/07/1994", "3017.45", "Gerente"});
                        dadosFuncionario.add(new String[]{"Heloisa", "24/05/2003", "1606.85", "Eletricista"});
                        dadosFuncionario.add(new String[]{"Helena", "02/09/1996", "2799.93", "Gerente"});

        List<Funcionario> listaFuncionarios = new ArrayList<>();

        for (String[] dados : dadosFuncionario) {
            String nome = dados[0];
            String dataNascimento = dados[1];
            BigDecimal salario = new BigDecimal(dados[2]);
            String funcao = dados[3];

            Funcionario funcionario = new Funcionario(nome, dataNascimento, salario, funcao);
            listaFuncionarios.add(funcionario);
        }

        for (Funcionario funcionario : listaFuncionarios) {
            System.out.println("-----------------------");
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Data de Nascimento: " + funcionario.getDataNascimento());
            System.out.println("Salário: " + funcionario.getSalario());
            System.out.println("Função: " + funcionario.getFuncao());
        }
        System.out.println("-----------------------");
    }
}