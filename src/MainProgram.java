public class MainProgram {

    public static void main(String[] args) {
        Property p1 = new Property("An der Hordelwiese 3",10,20.57);
        System.out.println(p1.getAddress() + " - " + p1.getSize() + "m²");

        Property p2 = new Property("Kakastrasse 4", 22, 33);
        System.out.println(p2.getAddress() + " - " + p2.getSize() + "m²");
    }
    Property p3 = new Property("Kakastrasse 56", 23, 89);
        System.out.println(p3.getAddress() + " - " + p3.getSize() + "m²");
}
