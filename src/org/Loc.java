package org;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loc extends Bs {
	
	public Loc() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//h5//following-sibling::br)[7]")
	private WebElement txtFirst;
	
	
	@FindBy(xpath="//a[text()='CONTACT US']")
	private WebElement btnContact;


	public WebElement getTxtFirst() {
		return txtFirst;
	}


	public WebElement getBtnContact() {
		return btnContact;
	}
	
	


	

}
