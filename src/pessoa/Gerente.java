package pessoa;
import java.util.Scanner;

public class Gerente extends PessoaEmpresa{
    double percentualVenda;
    int nivelGerente;
    
    public void setPercentualVenda(double addPercentualVenda){
        if(addPercentualVenda >=0){
            percentualVenda = addPercentualVenda;
        }
    }
    
    public double getPercentualVenda(){
        return percentualVenda;
    }
    
    public void setNivelGerente(int addNivelGerente){
        if(addNivelGerente >=0){
            nivelGerente = addNivelGerente;
        }
    }
    
    public int getNivelGerente(){
        return nivelGerente;
    }
    
    public Gerente(){ }
    
    public Gerente(String identidade){
        super(identidade);
    }
    
    public Gerente(double salario){
        super(salario);
    }
    
    public Gerente(String identidade, double salario){
        super(identidade, salario);
    }
    
    public Gerente(double salario, String identidade){
        super(identidade, salario);
    }
    
    public Gerente(String nome, String identidade, String matricula,
            double salario, double percentualVenda, int nivelGerente){
        super(nome, identidade, matricula, salario);
        setPercentualVenda(percentualVenda);
        setNivelGerente(nivelGerente);
    }
    public void cadastrar(String nome, String identidade, String matricula,
            double salario, double percentualVenda, int nivelGerente){
        super.cadastrar(nome, identidade, matricula, salario);
        setPercentualVenda(percentualVenda);
        setNivelGerente(nivelGerente);
    }
    
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        System.out.println("Percentual das Vendas.: ");
        setPercentualVenda(Double.parseDouble(sc.nextLine()));
        System.out.println("Nivel de Gerência.: ");
        setNivelGerente(Integer.parseInt(sc.nextLine()));
        sc.close();
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println("Percentual das Vendas.: " + getPercentualVenda());
        System.out.println("Nivel de Gerência.: "+ getNivelGerente());
    }
}
