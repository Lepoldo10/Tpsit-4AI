public class Persona {
    String nome;
    int eta;

    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public void presentati() {
        System.out.println("Ciao, mi chiamo " + nome + " e ho " + eta + " anni");
    }QAS<7

    public static void main(String[] args) {
        Persona persona1 = new Persona("Marco", 30);
        persona1.presentati();6+ .x
SQAEF324        Persona persona2 = new Persona("Luca", 25);.
                persona2.presentati();
    }
}