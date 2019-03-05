package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import wdMethods.SeMethods;

public class ResultView extends SeMethods {
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI0_") WebElement eleRVRollBack;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI1_") WebElement eleRVQueryPanel;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI2_") WebElement eleRVRefresh;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI3_") WebElement eleRVSymbol;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI4_") WebElement eleRVExportToBtn;
	@FindBy(how=How.ID, using="Vertical_mainMenu_Menu_DXI4_P") WebElement eleRVExportToDrpDwn;
	@FindBy(how=How.ID, using="Vertical_SearchAC_Menu_ITCNT0_xaf_a0_Ed_I") WebElement eleRVSearchTxt;
	@FindBy(how=How.ID, using="Vertical_SearchAC_Menu_ITCNT0_xaf_a0_Ed_B1") WebElement eleRVSearchBtn;
	@FindBy(how=How.ID, using="dxp-comboBox") WebElement eleSCVPageSize;
	
	public ResultView clickRVRollBack() {
		click(eleRVRollBack);
		return this;
	}
	public ResultView clickRVQueryPanel() {
		click(eleRVQueryPanel);
		return this;
	}
	public ResultView clickRVRefresh() {
		click(eleRVRefresh);
		return this;
	}
	public ResultView clickRVSymbol() {
		click(eleRVSymbol);
		return this;
	}
	public ResultView clickRVExportToBtn() {
		click(eleRVExportToBtn);
		return this;
	}
	public ResultView clickRVExportToDrpDwn() {
		click(eleRVExportToDrpDwn);
		return this;
	}
	public ResultView clickRVSearchTxt() {
		click(eleRVSearchTxt);
		return this;
	}
	public ResultView clickRVSearchBtn() {
		click(eleRVSearchBtn);
		return this;
	}
	
	public ResultView SelectPageSize(String data) {
		selectDropDownUsingText(eleSCVPageSize,data);
		return this;
	}
}