package br.gov.dataprev.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.dataprev.dsvendas.dto.SellerDTO;
import br.gov.dataprev.dsvendas.entity.Seller;
import br.gov.dataprev.dsvendas.repository.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository sellerRepository;

	public List<SellerDTO> findAll() {
		List<Seller> result = sellerRepository.findAll();
		return result.stream().map(seller -> new SellerDTO(seller)).collect(Collectors.toList());
	}
}
