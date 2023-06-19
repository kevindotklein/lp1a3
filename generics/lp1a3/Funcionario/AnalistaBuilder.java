package lp1a3.Funcionario;

import java.time.LocalDateTime;

import lp1a3.Funcionario.Builder.FuncionarioBuilder;


public class AnalistaBuilder implements FuncionarioBuilder{
    private String nome;
    private int id;
    private double salario;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;


    public AnalistaBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }
    public AnalistaBuilder setId(int id) {
        this.id = id;
        return this;
    }
    public AnalistaBuilder setSalario(double salario) {
        this.salario = salario;
        return this;
    }
    public AnalistaBuilder setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
        return this;
    }
    public AnalistaBuilder setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
        return this;
    }

    public Analista createFuncionario(){
        return new Analista(this.nome,this.id,this.salario,this.horaEntrada,this.horaSaida);
    }


}