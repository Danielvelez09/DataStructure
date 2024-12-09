package EstructuraNoLineal;

public class BST {
    public static void main(String[] args) {

        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();
        int[] valores = {150, 44, 180, 20, 11, 15, 147, 8};

        for (int valor : valores) {
            arbol.insertar(valor);
        }

        System.out.print("Preorden: ");
        arbol.preorden(arbol.raiz);
        System.out.println();

        System.out.print("Inorden: ");
        arbol.inorden(arbol.raiz);
        System.out.println();

        System.out.print("Postorden: ");
        arbol.postorden(arbol.raiz);
        System.out.println();
    }
}
