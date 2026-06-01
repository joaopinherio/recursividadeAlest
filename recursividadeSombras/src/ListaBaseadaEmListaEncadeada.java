public class ListaBaseadaEmListaEncadeada<T> implements ListaDala<T> {
    private No<T> cabeca; // Início da lista
    private int tamanho;

    public ListaBaseadaEmListaEncadeada() {
        this.cabeca = null;
        this.tamanho = 0;
    }

    @Override
    public void adicionarRegistro(T dado) {
        No<T> novoNo = new No<>(dado);
        if (cabeca == null) {
            cabeca = novoNo;
        } else {
            No<T> atual = cabeca;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
        tamanho++;
    }

    @Override
    public T removerRegistro(int posicao) {
        verificarIndice(posicao);
        No<T> atual = cabeca;
        if (posicao == 0) {
            T removido = cabeca.dado;
            cabeca = cabeca.proximo;
            tamanho--;
            return removido;
        }
        No<T> anterior = null;
        for (int i = 0; i < posicao; i++) {
            anterior = atual;
            atual = atual.proximo;
        }
        anterior.proximo = atual.proximo;
        tamanho--;
        return atual.dado;
    }

    @Override
    public T obterRegistro(int posicao) {
        verificarIndice(posicao);
        No<T> atual = cabeca;
        for (int i = 0; i < posicao; i++) {
            atual = atual.proximo;
        }
        return atual.dado;
    }

    @Override
    public void limparRegistros() {
        cabeca = null;
        tamanho = 0;
    }

    @Override
    public int obterTamanho() {
        return tamanho;
    }

    @Override
    public boolean estaVazia() {
        return cabeca == null;
    }

    private void verificarIndice(int indice) {
        if (indice < 0 || indice >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido: " + indice);
        }
    }
}