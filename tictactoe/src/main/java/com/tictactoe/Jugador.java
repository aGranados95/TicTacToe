package com.tictactoe;

public class Jugador {

    //region atributs
    private String nom;
    private char fitxa;
    //endregion atributs

    /**
     * Únic mètode constructor dels jugadors.
     */
    public Jugador(String nom, char fitxa) {
        this.nom = nom;
        this.fitxa = fitxa;
    }

    // region get
    public String getNom() {
        return nom;
    }

    public char getFitxa() {
        return fitxa;
    }
    // endregion

    // region set
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setFitxa(char fitxa) {
        this.fitxa = fitxa;
    }
    // endregion


    // region mètodes

    public static String ordenarEntrada(String entrada) {
        char[] coordenada = entrada.toCharArray();
        String result = "";
        if (Character.isDigit(coordenada[0])) {
            return result += String.valueOf(coordenada[0]) + String.valueOf(coordenada[1]);
        } else {
            return result += String.valueOf(coordenada[1]) + String.valueOf(coordenada[0]);
        }
    }

    public boolean comprobaCasella(String casella, Taulell t) {
        switch (casella) {
            case "1A":
                    t.setCasellesOcupades(casella, true);
                    t.marcaCasella(1, 1, this.getFitxa());
                    System.out.println(Taulell.getTotalOcupat() + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaa");
                return true;
            case "1B":
                    t.setCasellesOcupades(casella, true);
                    t.marcaCasella(1, 3, this.getFitxa());
                    System.out.println(Taulell.getTotalOcupat() + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaa");
                return true;
            case "1C":
                    t.setCasellesOcupades(casella, true);
                    t.marcaCasella(1, 5, this.getFitxa());
                    System.out.println(Taulell.getTotalOcupat() + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaa");
                return true;
            case "2A":
                    t.setCasellesOcupades(casella, true);
                    t.marcaCasella(3, 1, this.getFitxa());
                    System.out.println(Taulell.getTotalOcupat() + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaa");
                return true;
            case "2B":
                    t.setCasellesOcupades(casella, true);
                    t.marcaCasella(3, 3, this.getFitxa());
                    System.out.println(Taulell.getTotalOcupat() + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaa");
                return true;
            case "2C":
                    t.setCasellesOcupades(casella, true);
                    t.marcaCasella(3, 5, this.getFitxa());
                    System.out.println(Taulell.getTotalOcupat() + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaa");
                return true;
            case "3A":
                    t.setCasellesOcupades(casella, true);
                    t.marcaCasella(5, 1, this.getFitxa());
                    System.out.println(Taulell.getTotalOcupat() + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaa");
                return true;
            case "3B":
                    t.setCasellesOcupades(casella, true);
                    t.marcaCasella(5, 3, this.getFitxa());
                    System.out.println(Taulell.getTotalOcupat() + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaa");
                return true;
            case "3C":
                    t.setCasellesOcupades(casella, true);
                    t.marcaCasella(5, 5, this.getFitxa());
                    System.out.println(Taulell.getTotalOcupat() + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaa");
                return true;

            default:
                    System.out.println("\n\n\n\n\nAlguien no entiende las reglas del juego, mira que es simple...:/");
                return false;
        }
    }

    // endregion

}
