class BST {
    Nodo raiz;

    BST() {
        raiz = null;
    }

    // Método para insertar una nueva asociación en el BST
    void insertar(String palabra, String traduccion) {
        raiz = insertarRecursivo(raiz, palabra, traduccion);
    }

    Nodo insertarRecursivo(Nodo nodo, String palabra, String traduccion) {
        if (nodo == null) {
            nodo = new Nodo(palabra, traduccion);
            return nodo;
        }

        if (palabra.compareTo(nodo.palabra) < 0) {
            nodo.izquierda = insertarRecursivo(nodo.izquierda, palabra, traduccion);
        } else if (palabra.compareTo(nodo.palabra) > 0) {
            nodo.derecha = insertarRecursivo(nodo.derecha, palabra, traduccion);
        }

        return nodo;
    }

    // Método para recorrer el BST en orden
    void recorrerInorden() {
        recorrerInordenRecursivo(raiz);
    }

    void recorrerInordenRecursivo(Nodo nodo) {
        if (nodo != null) {
            recorrerInordenRecursivo(nodo.izquierda);
            System.out.println("(" + nodo.palabra + ", " + nodo.traduccion + ")");
            recorrerInordenRecursivo(nodo.derecha);
        }
    }

    // Método para buscar la traducción de una palabra
    String buscarTraduccion(String palabra) {
        Nodo nodo = buscarRecursivo(raiz, palabra.toLowerCase());
        if (nodo != null) {
            return nodo.traduccion;
        } else {
            return null;
        }
    }

    Nodo buscarRecursivo(Nodo nodo, String palabra) {
        if (nodo == null || palabra.equals(nodo.palabra)) {
            return nodo;
        }

        if (palabra.compareTo(nodo.palabra) < 0) {
            return buscarRecursivo(nodo.izquierda, palabra);
        } else {
            return buscarRecursivo(nodo.derecha, palabra);
        }
    }
}