package com.crts.app.mfi.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class ApplicationForm 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String applicationCode;
	@OneToOne(cascade = CascadeType.ALL)
	private GuarantorDetails guarantordetails;
	@OneToOne(cascade = CascadeType.ALL)
	private CurrentLoanDetails currentloandetails;
	@OneToOne(cascade = CascadeType.ALL)
	private BankDetails bankdetails;
	@OneToOne(cascade = CascadeType.ALL)
	private BusinessDetails businessdetails;
	@OneToOne(cascade = CascadeType.ALL)
	private documentsDetails documentsdetails;
	@OneToOne(cascade = CascadeType.ALL)
	private PreviousLoanDetails previousloandetails;

}
