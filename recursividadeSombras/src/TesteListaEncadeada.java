public class TesteListaEncadeada {
    public static void main(String[] args) {
        ListaBaseadaEmListaEncadeada<Integer> listaEncadeada = new ListaBaseadaEmListaEncadeada<Integer>();

        // Adicionando elementos
        listaEncadeada.adicionarRegistro(10);
        listaEncadeada.adicionarRegistro(20);
        listaEncadeada.adicionarRegistro(30);


        // Tamanho da lista
        System.out.println("Tamanho: " + listaEncadeada.obterTamanho()); // 2

        System.out.println(listaEncadeada.somaElementos(listaEncadeada.obterNo(2)));

        // Verificando se está vazia
        System.out.println("Está vazia? " + listaEncadeada.estaVazia()); // false

        // Limpando a lista
        listaEncadeada.limparRegistros();
        System.out.println("Está vazia após limpar? " + listaEncadeada.estaVazia()); // true

    }
}