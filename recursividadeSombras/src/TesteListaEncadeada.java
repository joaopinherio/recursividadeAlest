public class TesteListaEncadeada {
    public static void main(String[] args) {
        ListaDala<Integer> listaEncadeada = new ListaBaseadaEmListaEncadeada<Integer>();

        // Adicionando elementos
        listaEncadeada.adicionarRegistro(10);
        listaEncadeada.adicionarRegistro(20);
        listaEncadeada.adicionarRegistro(30);

        // Obtendo elementos
        System.out.println("Elemento na posição 1: " + listaEncadeada.obterRegistro(1)); // 20

        // Removendo elementos
        System.out.println("Removido: " + listaEncadeada.removerRegistro(0)); // 10
        System.out.println("Novo primeiro elemento: " + listaEncadeada.obterRegistro(0)); // 20

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