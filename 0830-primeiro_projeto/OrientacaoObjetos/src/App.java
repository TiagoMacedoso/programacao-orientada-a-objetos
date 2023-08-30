public class App {
    public static void main(String[] args) throws Exception {
        //criação do objeto para instanciar a classe computador
        Computador comp1 = new Computador();
        Computador comp2 = new Computador();

        //atribuição de valor para o atributo memória
        //trabalhando o encapsulamento
        comp1.setMemoria(8);
        comp2.setMemoria(16);

        //acessando o valor do atributo
        System.out.println(comp1.getMemoria());
        System.out.println(comp2.getMemoria());
    }
}
