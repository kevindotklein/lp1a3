package lp1a3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import A4.Funcionario.Funcionario;
import A4.Funcionario.Gerente;

public class Departamento{
    static List<Gerente> gerentes = new ArrayList<Gerente>();
    static List<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public static <T extends Funcionario & Ponto> void adicionaFuncionario(T funcionario){
        funcionarios.add(funcionario);
    }
    public static < T extends Gerente> void adicionaFuncionario(T funcionario){
        gerentes.add(funcionario);
    }

    public static void listarFuncionarios(){
        System.out.println("FUNCIONARIOS \n");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.toString());
        }
        System.out.println("GERENTES \n");
        for (Gerente gerente : gerentes) {
            System.out.println(gerente.toString());
        }
    }


    public static void listarAtrasados(LocalDateTime date){
        int comparacaoDeHoras;
        int quantidadeDeHoras;
        System.out.println("FUNCIONARIOS ATRASADOS\n");
        for (Funcionario funcionario : funcionarios) {
            if(funcionario.getHoraEntrada() != null){
                comparacaoDeHoras = funcionario.getHoraEntrada().compareTo(date);
                if(comparacaoDeHoras > 0 ){
                    quantidadeDeHoras = (date.getHour() - funcionario.getHoraEntrada().getHour()) + (date.getMinute() - funcionario.getHoraEntrada().getMinute());
                    System.out.println(funcionario.toString() + ", Horario entrada: " + funcionario.getHoraEntrada().toString() + ", Horario de comparacacao: " + date.toString()+", Tempo:" + quantidadeDeHoras);
                }
            }
        }
    }

}