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
            int result = 1;
            return percorreLista(atual, result);
        }
        return 0;
    }


    public int percorreLista(No atual, int count){

        if(atual != null){
            percorreLista(atual.esquerda,count++);
            
            percorreLista(atual.direita,count++);
        }

        return count;
    }

    //2
        public int contarAltura(No<T> atual){
        if(atual != null){
            int result = 1;
            return percorreListaAltura(atual, result);
        }
        return 0;
    }


    public int percorreListaAltura(No atual, int count){

        if(atual != null){
            percorreLista(atual.esquerda,count++);
        }

        return count;
    }



}