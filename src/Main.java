//Scrivere un programma che contenga una classe che definisce un Auto che abbia come proprietà cilindrata, targa,
// marca e modello.
  //      Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
    //    Nel main dichiarare un oggetto di tipo Auto.
public class Main {
    public static void main(String[] args) {

        Auto auto1 = new Auto(1600, "LM429KI", "BMW", "C4");
        Auto auto2 = new Auto(1200, "FA467PR", "FIAT", "PUNTO");

        System.out.println(auto1);

        auto2.setTarga("BV123JK");

        System.out.println(auto2);


    }
}