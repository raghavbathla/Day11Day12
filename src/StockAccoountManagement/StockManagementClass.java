package StockAccoountManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class StockManagementClass {
    private int numberOfStock;
    private ArrayList<Model> arrayList;

    public StockManagementClass(int numberOfStock)
    {
        this.numberOfStock = numberOfStock;
        arrayList = new ArrayList<Model>();
    }

    public ArrayList<Model> getValue()
    {
        Scanner scanner = new Scanner(System.in);
        while (numberOfStock > 0) {
            System.out.println("Enter the company name");
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(scanner.nextLine());
            System.out.println("Enter the number of share");
            int numOfShare = scanner.nextInt();
            System.out.println("Enter the price of share");
            int priceOfShare = scanner.nextInt();
            int totalPrice = numOfShare * priceOfShare;
            arrayList.add(new Model(stringBuffer.toString(), numOfShare, priceOfShare, totalPrice));
            numberOfStock--;
        }
        return arrayList;
    }

}
