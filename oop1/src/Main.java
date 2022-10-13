
public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(10);
        product1.setImageUrl("http://localhost");
        product1.setUnitPrice(100);
        product1.setUnitsInStock(1000);

        Product product2 = new Product();
        product2.setName("Xiaomi Kahve Makinesi");
        product1.setDiscount(20);
        product1.setImageUrl("http://localhost");
        product1.setUnitPrice(200);
        product1.setUnitsInStock(2000);

        Product product3 = new Product();
        product3.setName("Arzum Kahve Makinesi");
        product1.setDiscount(30);
        product1.setImageUrl("http://localhost");
        product1.setUnitPrice(300);
        product1.setUnitsInStock(3000);

        Product[] products = {product1, product2, product3};
        for (Product product : products) {
            System.out.println(product.getName());
        }

        /* ------------------------------------------------------ */
        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhoneNumber("05555555555");
        individualCustomer.setCustomerNumber("1234567890");
        individualCustomer.setFirstName("Sinan");
        individualCustomer.setLastName("Khan");

        /* ------------------------------------------------------- */
        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setPhoneNumber("0555555555555");
        corporateCustomer.setCustomerNumber("1234567890");
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setTaxNumber("1111111111111");

        Customer[] customer = {individualCustomer, corporateCustomer};
        System.out.println(individualCustomer.getFirstName());
        System.out.println(individualCustomer.getLastName());

    }
}