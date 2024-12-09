package EstructuraNoLineal;

class NodoArbol {
    int valor;
    NodoArbol izq, der;

    NodoArbol(int valor) {
        this.valor = valor;
        izq = der = null;
    }
}

class ArbolBinarioBusqueda {
    NodoArbol raiz;

    void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    NodoArbol insertarRec(NodoArbol nodo, int valor) {
        if (nodo == null) {
            nodo = new NodoArbol(valor);
            return nodo;
        }
        if (valor < nodo.valor) {
            nodo.izq = insertarRec(nodo.izq, valor);
        } else if (valor > nodo.valor) {
            nodo.der = insertarRec(nodo.der, valor);
        }
        return nodo;
    }

    void preorden(NodoArbol nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            preorden(nodo.izq);
            preorden(nodo.der);
        }
    }

    void inorden(NodoArbol nodo) {
        if (nodo != null) {
            inorden(nodo.izq);
            System.out.print(nodo.valor + " ");
            inorden(nodo.der);
        }
    }

    void postorden(NodoArbol nodo) {
        if (nodo != null) {
            postorden(nodo.izq);
            postorden(nodo.der);
            System.out.print(nodo.valor + " ");
        }
    }
}

