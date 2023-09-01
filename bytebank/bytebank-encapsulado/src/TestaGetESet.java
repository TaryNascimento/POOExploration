public class TestaGetESet {
    public static void main(String[] args) {

        Conta conta = new Conta(1333, 2979);
        // não compila, pois o número é privado
        //conta.numero = 1337;

        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        conta.setAgencia(7729);
        System.out.println(conta.getAgencia());

        Cliente tary = new Cliente();
        //titular é método privado
        //conta.titular = "Tary Junior";
        tary.setNome("Tary Junior");
        conta.setTitular(tary);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("programador");


        // agora todo o codigo acima em duas linhas
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("prgramador");

        System.out.println(titularDaConta);
        System.out.println(tary);
        System.out.println(conta.getTitular());

    }

}