public class TesteListaEncadeada {
    public static void main(String[] args) {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        
        arvore.adcionaRaiz(1);
        arvore.adcionarEsquerda(arvore.raiz,2);
        arvore.adcionarDireita(arvore.raiz,3);


        arvore.imprimir(arvore.raiz);
        System.out.println(arvore.contarNodos(arvore.raiz));

        System.out.println(arvore.contarAltura(arvore.raiz));
    }
}