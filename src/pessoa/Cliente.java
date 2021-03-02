
package pessoa;
import java.util.Scanner;

public class Cliente extends Pessoa{
    String codigoCliente, telefone;
    int idade;
    
    public void setCodigoCliente(String addCodigoCliente){
        if(!addCodigoCliente.isEmpty()){
            codigoCliente = addCodigoCliente;
        }
    }
    
    public String getCodigoCliente(){
        return codigoCliente;
    }
    
    public void setTelefone(String addTelefone){
        if(!addTelefone.isEmpty()){
            telefone = addTelefone;
        }
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public void setIdade(int addIdade){
        if(addIdade > 0){
            idade = addIdade;
        }
    }
    
    public int getIdade(){
        return idade;
    }
    
    public Cliente(){ }
    public Cliente(String identidade){
        super(identidade);
    }
    
    public Cliente(int idade){
        setIdade(idade);
    }
    
    public Cliente(String identidade, int idade){
        super(identidade);
        setIdade(idade);
    }
    
    public Cliente(int idade, String identidade){
        super(identidade);
        setIdade(idade);
    }
    
    public Cliente(String nome, String identidade, String codigoCliente,
            String telefone, int idade){
        super(nome, identidade);
        setCodigoCliente(codigoCliente);
        setTelefone(telefone);
        setIdade(idade);
    }
    public void cadastrar(String nome, String identidade, String codigoCliente,
            String telefone, int idade){
        super.cadastrar(nome, identidade);
        setCodigoCliente(codigoCliente);
        setTelefone(telefone);
        setIdade(idade);
    }
    
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        System.out.println("Codigo do Cliente.: ");
        setCodigoCliente(sc.nextLine());
        System.out.println("Telefone.: ");
        setTelefone(sc.nextLine());
        System.out.println("Idade.: ");
        setIdade(Integer.parseInt(sc.nextLine()));
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println("Codigo do Cliente.: "+ getCodigoCliente());
        System.out.println("Telefone.: "+getTelefone());
        System.out.println("Idade.: "+getIdade());
    }
}
