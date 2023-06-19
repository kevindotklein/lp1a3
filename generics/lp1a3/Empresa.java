package lp1a3;

import java.time.LocalDateTime;

import lp1a2.Funcionario.*;

public class Empresa {
    public static void main(String[] args) {
        Programador programador = new ProgramadorBuilder().setNome("AAA").setId(1).setSalario(2300).createFuncionario();
        Analista analista = new AnalistaBuilder().setNome("BBB").setId(3).setSalario(1102.00).createFuncionario();
        Analista analista2 = new AnalistaBuilder().setNome("CCC").setId(2).setSalario(1113).createFuncionario();
        Gerente gerente = new GerenteBuilder().setNome("DDD").setId(10).setId(5).setSalario(2000).createFuncionario();


        programador.entradaFuncionario(LocalDateTime.of(2023,4,7,9,30));
        analista.entradaFuncionario(LocalDateTime.of(2023,4,7,9,15));
        analista2.entradaFuncionario(LocalDateTime.of(2023,4,7,7,59));

        Departamento.adicionaFuncionario(gerente);
        Departamento.adicionaFuncionario(programador);
        Departamento.adicionaFuncionario(analista);
        Departamento.adicionaFuncionario(analista2);


        Departamento.listarFuncionarios();

        Departamento.listarAtrasados(LocalDateTime.of(2023,4,7,8,0));

    }
}