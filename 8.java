// Studente.java
package scuola.model;

public class Studente extends Persona {
    private String matricola;

    public Studente(String nome, int eta, String matricola) {
        setNome(nome);
        setEta(eta);
        this.matricola = matricola;
    }

    public void presentati() {
        System.out.println("Ciao, sono " + getNome() + ", ho " + getEta() + " anni e la mia matricola è " + matricola);
    }
}