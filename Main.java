import java.util.*;
import static java.lang.Math.*;

class Electricityinvoice  {
    private  String name;
    private  String address;
    private  double    num;

    private double cost;

    public Electricityinvoice() {

    }

    public Electricityinvoice(String name, String address, double num) { // Change 'int num' to 'double num'
        this.name = name;
        this.address = address;
        this.num = num;
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getNum() {
        return num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNum(double num) {
        this.num = num;
    }
    double calcCost()   {
        double usage = getNum();
        double cost = 0;

        if (usage >= 0 && usage <= 50) {
            cost = usage * 0.80;
        } else if (usage > 50 && usage <= 200) {
            cost = 50 * 0.80 + (usage - 50) * 0.90;
        } else if (usage > 200 && usage <= 350) {
            cost = 50 * 0.80 + 150 * 0.90 + (usage - 200) * 1.00;
        } else if (usage > 350) {
            cost = 50 * 0.80 + 150 * 0.90 + 150 * 1.00 + (usage - 350) * 1.20;
        }
        this.cost = cost;
        return cost;
    }
    void printInvoice()    {
        calcCost();
        System.out.println("name: "+this.name);
        System.out.println("address: "+this.address);
        System.out.println("cost: "+this.cost+" L.E");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.err.println("enter your Info");
        Electricityinvoice obj = new Electricityinvoice();
        String name = in.next();
        String address=in.next();
        double num = in.nextDouble();
        obj.setName(name);
        obj.setAddress(address);
        obj.setNum(num);
        obj.printInvoice();
    }

}
