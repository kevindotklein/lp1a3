package lp1a3.Funcionario.Builder;

import java.time.LocalDateTime;

import A4.Funcionario.Funcionario;

public interface FuncionarioBuilder {
    public FuncionarioBuilder setNome(String nome);
    public FuncionarioBuilder setId(int id);
    public FuncionarioBuilder setSalario(double salario);
    public FuncionarioBuilder setHoraEntrada(LocalDateTime horaEntrada);
    public FuncionarioBuilder setHoraSaida(LocalDateTime horaSaida);
    public Funcionario createFuncionario();
}