class Rectangulo {
    
    private Coordenada superiorIzq, inferiorDer;

    // Nuevo constructor
    public Rectangulo(Coordenada c1, Coordenada c2) {
        superiorIzq = c1;
        inferiorDer = c2;
    }
    
    public Rectangulo() {
        superiorIzq = new Coordenada(0, 0);
        inferiorDer = new Coordenada(0, 0);
    }

    public Rectangulo(double xSupIzq, double ySupIzq, double xInfDer, double yInfDer) {
        superiorIzq = new Coordenada(xSupIzq, ySupIzq);
        inferiorDer = new Coordenada(xInfDer, yInfDer);
    }

    public Coordenada superiorIzquierda() {
        return superiorIzq;
    }

    public Coordenada inferiorDerecha() {
        return inferiorDer;
    }

    @Override
    public String toString() {
        return "Esquina superior izquierda: " + superiorIzq + "\tEsquina superior derecha: " + inferiorDer + "\n";

    }
}
