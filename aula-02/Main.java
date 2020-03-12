class Main {
    public static void main(String args[]) {
        Pixel p1 = new Pixel();
        Pixel p2 = new Pixel(1, 2, 3);
        Point p3 = new Pixel(5, 6, 7);

        System.out.println(p3.getX()); //ok
        // System.out.println(p3.getColor()); //erro
        System.out.println(((Pixel)p3).getColor()); //ok
        System.out.println(p3.toString()); //?
        System.out.println(p3 instanceof Point); //?
        System.out.println(p3 instanceof Pixel); //?

        Point p4 = new Point(1, 1);
        Point p5 = new Point(1, 1);

        System.out.println(p4 == p5); //?

        Point p6 = new Point(1, 1);
        // p6 não recebe o objeto e sim a posição na memória
        // ex: 2000
        Point p7 = p6;
        // então p7 recebe a posição na memória
        // p7 = 2000
        // p6 e p7 apontam para a mesma posição na memória

        p7.setX(5);
        // settou na POSIÇÃO da memória o valor 5 para x

        System.out.println(p6.getX()); //5
    }
}
