package EstructuraNoLineal;

class Nodo {
    String valor;
    Nodo izq, der;

    Nodo(String valor) {
        this.valor = valor;
        izq = der = null;
    }
}

class ArbolBinario {
    Nodo raiz;

    ArbolBinario(String valor) {
        raiz = new Nodo(valor);
    }

    void preorden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            preorden(nodo.izq);
            preorden(nodo.der);
        }
    }

    void inorden(Nodo nodo) {
        if (nodo != null) {
            inorden(nodo.izq);
            System.out.print(nodo.valor + " ");
            inorden(nodo.der);
        }
    }

    void postorden(Nodo nodo) {
        if (nodo != null) {
            postorden(nodo.izq);
            postorden(nodo.der);
            System.out.print(nodo.valor + " ");
        }
    }
}


