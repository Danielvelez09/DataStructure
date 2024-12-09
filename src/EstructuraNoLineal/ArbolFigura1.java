package EstructuraNoLineal;

public class ArbolFigura1 {
    public static void main(String[] args) {

        ArbolBinario arbol = new ArbolBinario("A1");
        arbol.raiz.izq = new Nodo("C5");
        arbol.raiz.der = new Nodo("D7");
        arbol.raiz.izq.izq = new Nodo("B3");
        arbol.raiz.izq.der = new Nodo("F8");
        arbol.raiz.der.izq = new Nodo("F9");
        arbol.raiz.der.der = new Nodo("D1");
        arbol.raiz.izq.izq.izq = new Nodo("J1");
        arbol.raiz.izq.izq.der = new Nodo("T3");

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
