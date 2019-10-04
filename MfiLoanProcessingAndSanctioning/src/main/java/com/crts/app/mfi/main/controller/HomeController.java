package com.crts.app.mfi.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.mfi.main.model.GuarantorDetails;
import com.crts.app.mfi.main.model.LoanDetails;
import com.crts.app.mfi.main.service.Iservice;
@CrossOrigin
@RestController
public class HomeController {

	@Autowired
	Iservice si;
	
	/*
	 * @RequestMapping(value="/savedata",method = RequestMethod.POST) public void
	 * saveDetails(@RequestBody GuarantorDetails gd) { sr.saveData(gd);
	 * System.out.println("inserted"); }
	 * 
	 * @RequestMapping(value = "/getall",method=RequestMethod.GET) public
	 * List<GuarantorDetails> getdata() { List<GuarantorDetails>
	 * glist=sr.getalldata(); return glist;
	 * 
	 * }
	 */
	@RequestMapping(value = "/getLoanSanctionTable",method = RequestMethod.GET, produces = "application/json")
	public List<LoanDetails> getData(/* @ModelAttribute("Loan_Santion") Loan_Sanction_Details l, Model m */)
	{
		//m.addAttribute("Data",hs.getall());
		return si.getall();
	}
	@RequestMapping(value = "/updateLoanSanctionTable", method = RequestMethod.PUT, consumes = "application/json")
	public LoanDetails updateData(@RequestBody LoanDetails l){
		System.out.println("In Update Method");
		System.out.println("Application code: "+l.getApplicationId());
		System.out.println("LoanNumber: "+l.getLoanNumber());
		System.out.println("LoanAmount: "+l.getLoanAmount());
		System.out.println("ROI: "+l.getRoi());
		System.out.println("InterestAmount: "+l.getInterestAmount());
		System.out.println("LoanTotalAmount: "+l.getLoanTotalAmount());
		System.out.println("Tenure: "+l.getTenure());
		System.out.println("Emi: "+l.getEmiAmount());
		System.out.println("LoanSanctionDate: "+l.getLoanSanctionDate());
		System.out.println("InsuranceAmount: "+l.getInsuranceAmount());
		System.out.println("DocumentCharges: "+l.getDocumentCharges()); 
		System.out.println("Naukar Charges: "+l.getNaukarCharges());
		System.out.println("Processing charges: "+l.getProcessingCharges());
		/*
		 * System.out.println("TotalOtherAmountcharges: "+l.getTotalOtherAmountCharges()
		 * ); System.out.println("CM Status: "+l.getCmStatus());
		 * System.out.println("OH Status: "+l.getOhStatus());
		 * System.out.println("CustomerConfirmationTable: "+l.
		 * getCustomerConfirmationLetterStatus());
		 * System.out.println("OE Status: "+l.getOeStatus()); long
		 */
		float loanamount=l.getLoanAmount();
		float roi=l.getRoi();
		int tenure=l.getTenure();
		float interestamount=(loanamount*roi)/100;
		long totalloanamount=(long) (loanamount+interestamount);
		long emi=totalloanamount/tenure;
		float documentcharges=(float) (0.025*loanamount);
		float naukarcharges=(float) (0.005*loanamount);
		float processingcharges=(float) (0.005*loanamount);
		long insurancecharges=7000;
		//float documentCharges =(float) (loanamount*0.05);
		System.out.println("loanAmount: "+loanamount);
		System.out.println("roi: "+roi);
		System.out.println("tenure: "+tenure);
		System.out.println("interestamount: "+interestamount);
		System.out.println("totalloanAmount: "+totalloanamount);
		System.out.println("emi: "+emi);
		
		//System.out.println("documentcharges :"+documentCharges);
		l.setInterestAmount(interestamount);
		l.setLoanTotalAmount(totalloanamount);
		l.setEmiAmount(emi);
		l.setDocumentCharges(documentcharges);
		l.setNaukarCharges(naukarcharges);
		l.setProcessingCharges(processingcharges);
		l.setInsuranceAmount(insurancecharges);
		//.setDocumentCharges(documentCharges);
		System.out.println("InsuranceAmount: "+l.getInsuranceAmount());
		System.out.println("DocumentCharges: "+l.getDocumentCharges()); 
		System.out.println("Naukar Charges: "+l.getNaukarCharges());
		System.out.println("Processing charges: "+l.getProcessingCharges());
		si.save(l);
		
		return si.updateData(l);
	}
}
