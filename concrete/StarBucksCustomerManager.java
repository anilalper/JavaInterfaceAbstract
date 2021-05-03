

public class StarBucksCustomerManager extends BaseCustomerManager{

	private CustomerCheckService customerCheckService;
	
	public StarBucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	@Override
   public void Save(Customer customer) throws Exception
	{	
		try 
		{
			if (customerCheckService.CheckIfRealPerson(customer)) {
				super.Save(customer);
			} else {
				throw new Exception("Not Valid Customer");
			}
		} catch (Exception e) {
			throw e;
		}
		
	}
}
