import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) throws Exception {
		
		/*Mernis Omitted for not revealing personal info*/
		KPSPublicSoapProxy mernisProxy=new KPSPublicSoapProxy();
		  
		
		  boolean mernisResult=mernisProxy.TCKimlikNoDogrula(Long.parseLong(customer.
		  getNationalityId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
		  customer.getDateOfBirth().getYear()); 
		  return mernisResult;
		 
		
		//return true;
	}

}
