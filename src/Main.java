// Aula sobre Operadores Relacionais, operadores lógicos, controle de fluxo e blocos

public class Main {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;
        int i3 = 30;
        int i4 = 40;
        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        float f1 = 4.5F;
        float f2 = 3.5F;
        float f3 = 20F;
        float f4 = 50F;

        double d1 = 59.6D;
        double salarioMensal = 11893.58D;
        double mediaSalario = 10500D;

        char c1 = 'x';
        char c2 = 'y';

        String s1 = "João";
        String s2 = "Maria";
        String s3 = "Pedro";

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;
        boolean b5 = true;
        boolean b6 = false;
        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);

        long l1 = 1597L;
        long l2 = 8997L;

        byte y1 = 1;

        short h1 = 25;


        System.out.println("i1 == i2 " + (i1 == i2));
        System.out.println("i1 != i2 " + (i1 != i2));
        System.out.println("i1 > i2 " + (i1 > i2));
        System.out.println("i1 <= i2 " + (i1 <= i2));

        System.out.println(" f1 == f2 " + (f1 == f2));
        System.out.println(" f1 != f2 " + (f1 != f2));
        System.out.println(" f1 >= f2 " + (f1 >= f2));
        System.out.println("fi < f2 " + (f1 < f2));

        System.out.println("c1 == c2 " + (c1 == c2));
        System.out.println("c1 != c2 " + (c1 != c2));
        System.out.println("c1 > c2 " + (c1 > c2));
        System.out.println("c1 <= c2 " + (c1 <= c2));

        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s1 == s3 " + (s1 == s3));
        System.out.println("s1 != s2 " + (s1 != s2));
        //System.out.println("s1 >= s2 " + (s1 >= s2));
        //System.out.println("s1 < s2 " + (s1 < s2));

        System.out.println("b1 == b2 " + (b1 == b2));
        System.out.println("b1 != b2 " + (b1 != b2));
        //System.out.println("b1 > b2 " + (b1 > b2));
        //System.out.println("b1 <= i1" + (b1 <= i1));

        System.out.println("i2 > f1 " + (i2 > f1));
        System.out.println("d1 == h1 " + (d1 == h1));
        //System.out.println(s2 != c1);
        //System.out.println(s3 != i1);

        System.out.println("l1 == i2 " + (l1 == i2));
        System.out.println("l2 >= i1 " + (l2 >= i1));
        System.out.println("y1 != h1 " + (y1 != h1));

        System.out.println("b3 && b4 " + (b3 && b4));
        System.out.println("b3 && b4 " + (b3 && b4));
        System.out.println("b5 || b6 " + (b5 || b6));
        System.out.println("b5 || b6 " + (b5 || b6));
        //System.out.println("b3 ^ b4 " + b3 ^ b4);
        //System.out.println("b5 ^ b3 " + b5 ^ b3);
        System.out.println(!b3);
        System.out.println(!b4);

        System.out.println("(i3 + i4) < (f3 - f4)) && true " + (((i3 + i4) < (f3 - f4)) && true));
        System.out.println("(i3 > i4) || (f3 < f4) " + ((i3 > i4) || (f3 < f4)));

        //System.out.println(salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));
        System.out.println((salarioBaixo) && (muitosDependentes));
        System.out.println("Recebe auxilio = " + recebeAuxilio);

}
}
