package com.bloom.app.poc.model271;

import java.io.Serializable;
import java.util.List;

public class Response271 implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private InterchangeControlHeader interchangeControlHeader;		// ISA
	private FunctionalGroupHeader functionalGroupHeader;			// GS
	private TransactionSetHeader transactionSetHeader;				// ST
	private BeginningHierarchicalTransaction beginningHierarchicalTransaction;	// BHT
	
	private List<HierarchicalLevel> hierarchicalLevelList;			// HL (Information Source or Information Receiver or Subscriber or Dependent)
	
	private TransactionSetTrailer transactionSetTrailer;			// SE
	private FunctionalGroupTrailer functionalGroupTrailer;			// GE
	private InterchangeControlTrailer interchangeControlTrailer;	// IEA

	public InterchangeControlHeader getInterchangeControlHeader() {
		return interchangeControlHeader;
	}

	public void setInterchangeControlHeader(InterchangeControlHeader interchangeControlHeader) {
		this.interchangeControlHeader = interchangeControlHeader;
	}
	
	public FunctionalGroupHeader getFunctionalGroupHeader() {
		return functionalGroupHeader;
	}

	public void setFunctionalGroupHeader(FunctionalGroupHeader functionalGroupHeader) {
		this.functionalGroupHeader = functionalGroupHeader;
	}

	public TransactionSetHeader getTransactionSetHeader() {
		return transactionSetHeader;
	}

	public void setTransactionSetHeader(TransactionSetHeader transactionSetHeader) {
		this.transactionSetHeader = transactionSetHeader;
	}

	public BeginningHierarchicalTransaction getBeginningHierarchicalTransaction() {
		return beginningHierarchicalTransaction;
	}

	public void setBeginningHierarchicalTransaction(BeginningHierarchicalTransaction beginningHierarchicalTransaction) {
		this.beginningHierarchicalTransaction = beginningHierarchicalTransaction;
	}

	public List<HierarchicalLevel> getHierarchicalLevelList() {
		return hierarchicalLevelList;
	}

	public void setHierarchicalLevelList(List<HierarchicalLevel> hierarchicalLevelList) {
		this.hierarchicalLevelList = hierarchicalLevelList;
	}

	public TransactionSetTrailer getTransactionSetTrailer() {
		return transactionSetTrailer;
	}

	public void setTransactionSetTrailer(TransactionSetTrailer transactionSetTrailer) {
		this.transactionSetTrailer = transactionSetTrailer;
	}

	public FunctionalGroupTrailer getFunctionalGroupTrailer() {
		return functionalGroupTrailer;
	}

	public void setFunctionalGroupTrailer(FunctionalGroupTrailer functionalGroupTrailer) {
		this.functionalGroupTrailer = functionalGroupTrailer;
	}

	public InterchangeControlTrailer getInterchangeControlTrailer() {
		return interchangeControlTrailer;
	}

	public void setInterchangeControlTrailer(InterchangeControlTrailer interchangeControlTrailer) {
		this.interchangeControlTrailer = interchangeControlTrailer;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		
		buffer.append(interchangeControlHeader + "\n\n");
		buffer.append(functionalGroupHeader + "\n\n");
		buffer.append(transactionSetHeader + "\n\n");
		buffer.append(beginningHierarchicalTransaction + "\n\n");
		buffer.append(hierarchicalLevelList + "\n\n");
		buffer.append(transactionSetTrailer + "\n\n");
		buffer.append(functionalGroupTrailer + "\n\n");
		buffer.append(interchangeControlTrailer + "\n\n");
		
		return buffer.toString();
	}

}
