public class ArvoreBinaria<T> {
    public No<T> raiz; 

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void adcionaRaiz(T valor){
        raiz = new No<>(valor);
    }

    public void adcionarEsquerda(No<T> no, T valor){
        if(no == null){
            return;
        }
        no.esquerda = new No(valor);
    }

    public void adcionarDireita(No<T> no, T valor){
        if(no == null){
            return;
        }
        no.direita = new No(valor);
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
        if(atual != null){
            int esquerda = contarNodos(atual.esquerda);
            int direita = contarNodos(atual.direita);

            return esquerda + direita + 1;
        }

        return 0;

    }

    //2
        public int contarAltura(No<T> atual){
        if(atual != null){ 
            int esquerda = contarAltura(atual.esquerda);
            int direita = contarAltura(atual.direita);

            if(esquerda >= direita)
                return esquerda + 1;
            if(direita <= esquerda)
                return direita + 1;
        }
        return 0;
    }


    //3
    public boolean ehFolha(No nodo){
        if(nodo.esquerda == null && nodo.direita == null){
            return true;
        }
        return false;
    }

    public No<T> buscarFolha(No atual){
        if(atual != null){
            
            buscarFolha(atual.esquerda);
            buscarFolha(atual.direita);
        }

        return null;
    }

}