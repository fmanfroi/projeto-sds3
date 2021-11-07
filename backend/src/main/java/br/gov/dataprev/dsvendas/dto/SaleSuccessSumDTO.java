package br.gov.dataprev.dsvendas.dto;

import java.io.Serializable;

import br.gov.dataprev.dsvendas.entity.Seller;

public class SaleSuccessSumDTO implements Serializable {
	private static final long serialVersionUID = 6026960345262805343L;
	private String sellerName;
	private Long visited;
	private Long deals;

	public SaleSuccessSumDTO() {
	}

	public SaleSuccessSumDTO(Seller seller, Long visited, Long deals) {
		sellerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Long getVisited() {
		return visited;
	}

	public void setVisited(Long visited) {
		this.visited = visited;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}

}
