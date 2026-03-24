class Calculator {
    int volume(int a) {
       return a*a*a;
    }


    int volume (int l, int b, int h){
        return l*b*h;
    }

    double volume(double r, double h){
        return 3.14*r*r*h;
    }
}

class Main{
    public static void main(String[]args){
        Calculator obj = new Calculator();
        int x = 3;

        switch (x){
            case 1 -> System.out.print(obj.volume(4));
            case 2 -> System.out.print(obj.volume(7,3,1));
            case 3 -> System.out.print(obj.volume(3,6));
        }
    }

}
