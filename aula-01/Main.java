import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int dia = 0, mes = 0, ano = 0;
        try {
            System.out.print("Digite o dia: ");
            dia = Integer.parseInt(entrada.nextLine());
            System.out.print("Digite o mes: ");
            mes = Integer.parseInt(entrada.nextLine());
            System.out.print("Digite o ano:  ");
            ano = Integer.parseInt(entrada.nextLine());
        }
        catch(NumberFormatException e) {
            System.out.println("Digite um valor válido!");
        }

        // Exception precisa ser tratado
        // RuntimeException é erro que acontece durente o programa
        // int dia = Integer.parseInt(System.console().readLine("Digite o dia:"));
        // int mes = Integer.parseInt(System.console().readLine("Digite o mês:"));
        
        // int ano = Integer.parseInt(System.console().readLine("Digite o ano:"));
        // READLINE não funciona sempre
        Data data1 = new Data(dia, mes, ano);
        System.out.println("data1 = " + data1.toString() );

        // Comparar duas string
        // ("abc".equals("def"))
        // ("abc".equalsIgnoreCase("DEF")) -> desconsidera maiusculas e minusculas
        // !("abc".equalsIgnoreCase("DEF")) -> desconsidera maiusculas e minusculas
        // ("abc".compareTo("def") == 0)
        // ("abc".equalsIgnoreCase("DEF")) -> desconsidera maiusculas e minusculas
    }
}