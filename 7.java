// Persona.java
package scuola.model;

public class Persona {
    private String nome;
    private int eta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        if (eta >= 0) {
            this.eta = eta;
        } else {
            System.out.println("L'età non può essere negativa.");
        }
    }
}