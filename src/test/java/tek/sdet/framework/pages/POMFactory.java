package tek.sdet.framework.pages;

import tek.sdet.framework.base.BaseSetup;

public class POMFactory extends BaseSetup{
	private RetailHomePage homepage;
	private RetailSignInPage signInPage;
	private RetailAccountPage accountPage;
	
	public POMFactory() {
		this.homepage = new RetailHomePage();
		this.signInPage= new RetailSignInPage();
		this.accountPage= new RetailAccountPage();
		
		
		
		
	}
	
	public RetailHomePage homePage() {
		return this.homepage;
	}
	
	public RetailSignInPage signInPage() {
		return this.signInPage;
		
	}
	
	public RetailAccountPage accountPage() {
		return this.accountPage;
	}
	

}
