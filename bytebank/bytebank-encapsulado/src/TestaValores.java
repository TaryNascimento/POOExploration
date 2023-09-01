public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 2979);

        // conta está inconsistente
        conta.setAgencia(-50);
        conta.setNumero(-330);

        System.out.println(conta.getAgencia());


        Conta conta2 = new Conta(1337, 2927);
        Conta conta3 = new Conta(2785, 1486);


        System.out.println(Conta.getTotal());


    }
}
