package pessoa;
import java.util.Scanner;

public class Funcionario extends PessoaEmpresa{
    String setor, nomeGerente;
    
    public void setSetor(String addSetor){
        if(!addSetor.isEmpty()){
            setor = addSetor;
        }
    }
    
    public String getSetor(){
        return setor;
    }
    
    public void setNomeGerente(String addNomeGerente){
        if(!addNomeGerente.isEmpty()){
            nomeGerente = addNomeGerente;
        }
    }
    
    public String getNomeGerente(){
        return nomeGerente;
    }
    
    public Funcionario(){ }
    
    public Funcionario(String identidade){
        super(identidade);
    }
    
    public Funcionario(double salario){
        super(salario);
    }
    
    public Funcionario(String identidade, double salario){
        super(identidade, salario);
    }
    
    public Funcionario(double salario, String identidade){
        super(identidade, salario);
    }
    
    public Funcionario(String nome, String identidade, String matricula,
            double salario, String setor, String nomeGerente){
        super(nome, identidade, matricula, salario);
        setSetor(setor);
        setNomeGerente(nomeGerente);
    }
    
    public void cadastrar(String nome, String identidade, String matricula,
            double salario, String setor, String nomeGerente){
        super.cadastrar(nome, identidade, matricula, salario);
        setSetor(setor);
        setNomeGerente(nomeGerente);
    }
    
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        System.out.println("Setor.: ");
        setSetor(sc.nextLine());
        System.out.println("Nome do Gerente.: ");
        setNomeGerente(sc.nextLine());
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("Setor.: "+ getSetor());
        System.out.println("Nome do Gerente.: ");
    }
}