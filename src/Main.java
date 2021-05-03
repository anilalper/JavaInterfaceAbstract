import java.util.Date;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Customer realCustomer=new Customer(1,"Anıl Alper","Avdan",new Date(1983,9,24),"11111111111");/*TcNo Changed*/
		Customer fakeCustomer = new Customer(2,"Engin","Demiroğ",new Date(1989,2,11),"12345678901");
		
		BaseCustomerManager starbuckscustomerManager=new StarBucksCustomerManager(new MernisServiceAdapter());
		starbuckscustomerManager.Save(realCustomer);
		starbuckscustomerManager.Save(fakeCustomer);

		
		BaseCustomerManager neroCustomerManager=new NeroCustomerManager();
		neroCustomerManager.Save(realCustomer);
	}

}
