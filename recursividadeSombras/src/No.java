class No<T> {
    T dado;
    No<T> esquerda;
    No<T> direita;
    No<T> pai;

    No(T valor) {
        this.dado = valor;
        this.esquerda = null;
        this.direita = null;
        this.pai = null;
    }
}