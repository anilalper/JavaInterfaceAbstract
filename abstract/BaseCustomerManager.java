
public class BaseCustomerManager implements CustomerService {

	@Override
	public void Save(Customer customer) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("Customer Saved. Customer:"+customer.getFirstName());
	}

}
