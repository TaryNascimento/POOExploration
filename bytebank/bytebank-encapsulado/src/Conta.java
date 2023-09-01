//Métodos
public class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular ;

    // o  static conta o total de contas
    private static int total;

    public Conta(int agencia, int numero ){
        Conta.total++;
        //System.out.println(" o Total de conta é " + Conta.total);

        if (agencia <= 0 )
            this.agencia = agencia;
        this.numero = numero;

        //System.out.println("estou criando uma conta " + this.numero);



    }

    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int novoNumero) {
        if (novoNumero <= 0){
            System.out.println("não pode valor <= 0 ");
        }
        this.numero = novoNumero;


    }

    public int getAgencia(){
        return this.agencia;
    }
    public void setAgencia(int novaAgencia){
        if (novaAgencia <= 0 ){
            System.out.println("Não pode valor menor igual a 0");
            return;
        }
        this.agencia = novaAgencia;
    }

    public void setTitular(Cliente titular) {        //setT + control e Espaço
        this.titular = titular;
    }

    public Cliente getTitular() {         //Dica: Dando get e a letra inicial do método getT e dando control + Espaço, autoCompleta
        return titular;
    }

    public static int getTotal(){
        return Conta.total;
    }


}
