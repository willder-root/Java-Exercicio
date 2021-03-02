package pessoa;

import java.util.Scanner;

public class PessoaEmpresa extends Pessoa {

    String matricula;
    double salario;

    public PessoaEmpresa() {
    }

    public PessoaEmpresa(String identidade) {
        super(identidade);
    }

    public PessoaEmpresa(double salario) {
        setSalario(salario);
    }

    public PessoaEmpresa(String identidade, double salario) {
        super(identidade);
        setSalario(salario);

    }

    public PessoaEmpresa(String nome, String identidade, String matricula,
            double salario) {
        super(nome, identidade);
        setMatricula(matricula);
        setSalario(salario);
    }

    public void setMatricula(String addMatricula) {
        if (!addMatricula.isEmpty()) {
            matricula = addMatricula;
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setSalario(double addSalario) {
        if (addSalario >= 0) {
            salario = addSalario;
        }
    }

    public double getSalario() {
        return salario;
    }

    public void cadastrar(String nome, String identidade, String matricula,
            double salario) {
        super.cadastrar(nome, identidade);
        setMatricula(matricula);
        setSalario(salario);
    }

    @Override
    public void entradaDados(){
        super.entradaDados();
        Scanner sc = new Scanner(System.in);
        System.out.println("Matricula.: ");
        setMatricula(sc.nextLine());
        System.out.println("Salário.: ");
        setSalario(Double.parseDouble(sc.nextLine()));
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Matricula.: " + getMatricula());
        System.out.println("Salário.: " + getSalario());
    }
}
