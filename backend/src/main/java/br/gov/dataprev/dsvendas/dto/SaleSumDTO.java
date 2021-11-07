package br.gov.dataprev.dsvendas.dto;

import java.io.Serializable;

import br.gov.dataprev.dsvendas.entity.Seller;

public class SaleSumDTO implements Serializable {
	private static final long serialVersionUID = 6026960345262805343L;
	private String sellerName;
	private Double sum;

	public SaleSumDTO() {
	}

	public SaleSumDTO(Seller seller, Double sum) {
		this.setSellerName(seller.getName());
		this.setSum(sum);
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}

}
