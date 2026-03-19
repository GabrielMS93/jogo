//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Times a = new Times("Grêmio");
        Times b = new Times("Inter");


        Partida p = new Partida(a,b);
        p.jogar();




    }
}