public class ListaBaseadaEmListaEncadeada<Integer>{
    private No<Integer> cabeca; // Início da lista
    private int tamanho;

    public ListaBaseadaEmListaEncadeada() {
        this.cabeca = null;
        this.tamanho = 0;
    }
    public int somaElementos(No atual){
        int resultado = 0;
        if(atual == null){
            return resultado;
        }
     
        resultado = somaElementos(atual.proximo);

        return resultado;
    }


    public void adicionarRegistro(Integer valor) {
        No<Integer> novoNo = new No<>(valor);
        if (cabeca == null) {
            cabeca = novoNo;
        } else {
            No<Integer> atual = cabeca;
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
            T removido = cabeca.valor;
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
        return atual.valor;
    }

    @Override
    public T obterRegistro(int posicao) {
        verificarIndice(posicao);
        No<T> atual = cabeca;
        for (int i = 0; i < posicao; i++) {
            atual = atual.proximo;
        }
        return atual.valor;
    }
    
    public No<T> obterNo(int posicao) {
        verificarIndice(posicao);
        No<T> atual = cabeca;
        for (int i = 0; i < posicao; i++) {
            atual = atual.proximo;
        }
        return atual;
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