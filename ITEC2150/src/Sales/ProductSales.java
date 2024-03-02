package Sales;

public class ProductSales {
    public static void main(String[] args) throws Exception{
    	
    	Sale s1 = new Sale("Power Generator", 10.00);
    	DiscountSale ds1 = new DiscountSale("Power Generator", 10.00, 5);
    	
    	System.out.println(s1);
    	System.out.println(ds1);
    	System.out.println(ds1.equals(s1));
    	System.out.println(ds1.equalDeals(s1));
    	System.out.println(ds1.greaterThan(s1));
    	System.out.println(ds1.lessThan(s1));
    }
}
