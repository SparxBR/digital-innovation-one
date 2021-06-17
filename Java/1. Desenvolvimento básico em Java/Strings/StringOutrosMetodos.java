package strings;

public class StringOutrosMetodos {
    public static void main(String args[]) {

        var novoAmigo = new String("Olá, Chinês");

        System.out.print("你好中国人: ");
        System.out.println(novoAmigo.toCharArray());

        System.out.println(novoAmigo.concat(", prazer em conhece-lo."));

        var amigo = novoAmigo.concat(", prazer em conhece-lo.123456789");

        String[] palavras =amigo.split(",");
        System.out.println(palavras[0]);

        System.out.println(amigo.replaceAll("[a, b, c]", "你"));
        System.out.println(amigo.replaceAll("[0-9]", "你"));
    }
}