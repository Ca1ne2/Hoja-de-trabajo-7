class Nodo {
    String palabra;
    String traduccion;
    Nodo izquierda;
    Nodo derecha;

    Nodo(String palabra, String traduccion) {
        this.palabra = palabra;
        this.traduccion = traduccion;
        izquierda = null;
        derecha = null;
    }
}