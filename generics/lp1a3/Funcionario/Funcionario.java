package lp1a3.Funcionario;

import java.time.LocalDateTime;

public class Funcionario{

    private String nome;
    private int id;
    private double salario;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;



    public Funcionario(String nome, int id, double salario, LocalDateTime horaEntrada, LocalDateTime horaSaida) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Funcionario other = (Funcionario) obj;
        if (id != other.id)
            return false;
        return true;
    }


    public String getNome() {
        return nome;
    }


    protected void setNome(String nome) {
        this.nome = nome;
    }


    public int getId() {
        return id;
    }


    protected void setId(int id) {
        this.id = id;
    }


    public double getSalario() {
        return salario;
    }


    protected void setSalario(double salario) {
        this.salario = salario;
    }


    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }


    protected void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }


    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }


    protected void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }


    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", id=" + id + ", salario=" + salario + "]";
    }


}