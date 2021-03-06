package br.gov.dataprev.dsvendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.gov.dataprev.dsvendas.dto.SaleDTO;
import br.gov.dataprev.dsvendas.dto.SaleSuccessSumDTO;
import br.gov.dataprev.dsvendas.dto.SaleSumDTO;
import br.gov.dataprev.dsvendas.entity.Sale;
import br.gov.dataprev.dsvendas.repository.SaleRepository;
import br.gov.dataprev.dsvendas.repository.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;

	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageble) {
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageble);
		return result.map(sale -> new SaleDTO(sale));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller() {
		return repository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessSumDTO> successGroupedBySeller() {
		return repository.successGroupedBySeller();
	}
}
