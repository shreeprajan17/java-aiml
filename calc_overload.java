class Calculator
{
    int add(int n1, int n2)
    {
        return n1 + n2;
    }

    int add(int n1, int n2, int n3)
    {
        return n1 + n2 + n3;
    }

    double add(double n1, double n2)
    {
        return n1 + n2;
    }
}

public class calc_overload
{
    public static void main(String[] args) {
        Calculator obj = new Calculator();

        System.out.println(obj.add(5, 10));
        System.out.println(obj.add(1, 2, 3));
        System.out.println(obj.add(4.5, 5.5));
    }
}