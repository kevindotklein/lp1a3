package lp1a3.Funcionario;

import java.time.LocalDateTime;

public class Gerente extends Funcionario{

    protected Gerente(String nome, int id, double salario, LocalDateTime horaEntrada, LocalDateTime horaSaida) {
        super(nome, id, salario, horaEntrada, horaSaida);
    }


    @Override
    public String toString() {
        return super.toString().replaceAll("Funcionario","Gerente");
    }


}