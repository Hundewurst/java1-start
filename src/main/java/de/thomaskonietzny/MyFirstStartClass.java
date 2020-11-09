package de.thomaskonietzny;

class MyFirstStartClass {

    public static void main(String[] args) {

        String ergebnis = "";

        int zahl = 1;

        Variablen variablen = new Variablen();
        System.out.println("Was steht in der Var: " + variablen.getAenderMich());

        variablen.setAenderMich("Jetzt habe ich dich geaendert!");

        System.out.println("Was steht jetzt in der Variable: "+ variablen.getAenderMich());
    }

}
