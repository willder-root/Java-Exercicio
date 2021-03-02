
package pessoa;
import java.util.Scanner;

public class Pessoa {
    String nome, identidade;
    
    public Pessoa(){ }
    public Pessoa(String nome, String identidade) {
       setNome(nome);
       setIdentidade(identidade);
    }
    
    public Pessoa(String identidade){
        setIdentidade(identidade);
    }
    
    public void cadastrar(String nome, String identidade) {
       setNome(nome);
       setIdentidade(identidade);
    }
    
    public void setNome(String addNome){
        if(!addNome.isEmpty()){
            nome = addNome;
        }
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setIdentidade(String addIdentidade){
        if(!addIdentidade.isEmpty()){
            identidade = addIdentidade;
        }
    }
    
    public String getIdentidade(){
        return identidade;
    }
    
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome-> ");
        setNome(sc.nextLine());
        System.out.println("Identidade-> ");
        setIdentidade(sc.nextLine());
    }
    
    public void imprimir(){
        System.out.println("Nome.: "+ getNome());
        System.out.println("identidade.: "+getIdentidade());
    }
    
}
