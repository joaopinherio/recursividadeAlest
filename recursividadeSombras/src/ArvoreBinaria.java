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

    //1
    public int contarNodos(No<T> atual){
        int result =1;
        if(atual != null){
            if(percorreLista(atual) != null){
                return result += contarNodos(percorreLista(atual));
            }
        }
        return 0;
    }

    public No<T> percorreLista(No atual){
        if(atual == null){
            return null;
        }

        if(atual.esquerda != null){
            return atual.esquerda;
        }
        if(atual.direita != null){
            return atual.direita;
        }

        return null;
    }



}