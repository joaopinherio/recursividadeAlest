public class ArvoreBinaria<T> {
    private No<T> raiz; 

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void adcionaRaiz(T valor){
        raiz = new No<>(valor);
    }

    


    public void imprimir(No<T> atual){
        if(atual == null){
            return;
        }

        imprimir(atual.esquerda);
        System.out.println(atual.dado + " ");

        imprimir(atual.direita);

    }



}