public class ListaBaseadaEmListaEncadeada<Integer> {
    private No<Integer> cabeca; // Início da lista
    private int tamanho;

    public ListaBaseadaEmListaEncadeada() {
        this.cabeca = null;
        this.tamanho = 0;
    }

    public int somaElementos(No atual) {

        if (atual == null) {
            return 0;
        }

        return (int) atual.valor + somaElementos(atual.proximo);
    }

    public int contarMaioresQue(No atual, int x) {
        if (atual == null) {
            return 0;
        }
        if ((int) atual.valor > x) {
            return contarMaioresQue(atual.proximo, x) + 1;
        }

        return contarMaioresQue(atual.proximo, x);

    }

    public int maiorElemento(No atual) {
        if (atual == null) {
            return 0;
        }

        if (atual.proximo != null) {

            if ((int) atual.valor > (int) atual.proximo.valor) {
                return maiorElemento(atual.proximo);
            }

            return maiorElemento(atual.proximo);
        }

        return (int) atual.valor;
    }

    public void removerValor(int valor) {
        if (cabeca == null) {
            return;
        }

        if(cabeca.proximo != null){
            if ((int) cabeca.valor == valor) {
                tamanho--;
                cabeca = cabeca.proximo;
                removerValor(valor);
                return;
            }
            removerValor(valor);
        }
        return;
    }

    public void andaNaLista(No atual) {
        if (cabeca == null) {
            return;
        }
        if (atual.proximo != null) {
            andaNaLista(atual.proximo);
        }
        return;
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

    public No<Integer> obterNo(int posicao) {
        verificarIndice(posicao);
        No<Integer> atual = cabeca;
        for (int i = 0; i < posicao; i++) {
            atual = atual.proximo;
        }
        return atual;
    }

    public void limparRegistros() {
        cabeca = null;
        tamanho = 0;
    }

    public int obterTamanho() {
        return tamanho;
    }

    public boolean estaVazia() {
        return cabeca == null;
    }

    private void verificarIndice(int indice) {
        if (indice < 0 || indice >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido: " + indice);
        }
    }
}