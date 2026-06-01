public interface ListaDala<T> {

    public void adicionarRegistro(T dado);

    public T removerRegistro(int posicao);

    public T obterRegistro(int posicao);

    public void limparRegistros();

    public int obterTamanho();

    public boolean estaVazia();
 

}
