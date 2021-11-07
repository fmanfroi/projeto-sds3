package br.gov.dataprev.dsvendas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.gov.dataprev.dsvendas.dto.SaleSuccessSumDTO;
import br.gov.dataprev.dsvendas.dto.SaleSumDTO;
import br.gov.dataprev.dsvendas.entity.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
	@Query("SELECT new br.gov.dataprev.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new br.gov.dataprev.dsvendas.dto.SaleSuccessSumDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessSumDTO> successGroupedBySeller();
}
