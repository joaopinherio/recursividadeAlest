public class TesteListaEncadeada {
    public static void main(String[] args) {
        ListaBaseadaEmListaEncadeada<Integer> listaEncadeada = new ListaBaseadaEmListaEncadeada<Integer>();

        // Adicionando elementos
        listaEncadeada.adicionarRegistro(10);
        listaEncadeada.adicionarRegistro(20);
        listaEncadeada.adicionarRegistro(30);


        // Tamanho da lista
        System.out.println("Tamanho: " + listaEncadeada.obterTamanho()); // 2

        //4.1
        System.out.println("soma elementos");
        System.out.println(listaEncadeada.somaElementos(listaEncadeada.obterNo(0)));


        //4.2
        System.out.println("count maior numero qeu:");
        System.out.println(listaEncadeada.contarMaioresQue(listaEncadeada.obterNo(0), 9));

        //4.3
        System.out.println("maior valor");
        System.out.println(listaEncadeada.maiorElemento(listaEncadeada.obterNo(0)));



    }
}