public class TestaBanco {
    public static void main(String[] args) {

        Cliente tary = new Cliente();

        tary.nome = "Tary Nascimeno";
        tary.cpf = "111.111.111-11";
        tary.profissao = "Software Enginner";

        Conta contaDoTary = new Conta();
        contaDoTary.deposita(100);


        System.out.println(contaDoTary.titular.nome);


    }
}
