package StockAccoountManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class StockMain {
    public static void main(String[] args) {
        ArrayList<Model> portfolio = new ArrayList();
        System.out.println("Enter the Number of stocks");
        Scanner scanner = new Scanner(System.in);
        int numOfStocks = scanner.nextInt();
        StockManagementClass stockManagementClass = new StockManagementClass(numOfStocks);
        portfolio = stockManagementClass.getValue();

        for (int i = 0; i < portfolio.size(); i++) {
            System.out.println("");
            System.out.println("Company Name:" + portfolio.get(i).getShareName());
            System.out.println("Number of Shares:" + portfolio.get(i).getNumberOfShare());
            System.out.println("Share Prices: " + portfolio.get(i).getSharePrice());
            System.out.println("Total Vale: " + portfolio.get(i).getTotalValue());
        }
    }

}
