public class TesteListaEncadeada {
    public static void main(String[] args) {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        
        arvore.adcionaRaiz(1);
        arvore.adcionarEsquerda(arvore.raiz,2);
        arvore.adcionarDireita(arvore.raiz,3);
        arvore.adcionarEsquerda(arvore.raiz.esquerda, 4);


        arvore.imprimir(arvore.raiz);

        //1
        System.out.println("num de nodos: " + arvore.contarNodos(arvore.raiz));
        //2
        System.out.println("altura da arvore: " + arvore.contarAltura(arvore.raiz));
        //3
        System.out.println("esse nodo eh folha? " + arvore.ehFolha(arvore.raiz.esquerda.esquerda));
        
    }
}