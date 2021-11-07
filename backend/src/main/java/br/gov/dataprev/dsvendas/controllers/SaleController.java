package br.gov.dataprev.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.dataprev.dsvendas.dto.SaleDTO;
import br.gov.dataprev.dsvendas.dto.SaleSuccessSumDTO;
import br.gov.dataprev.dsvendas.dto.SaleSumDTO;
import br.gov.dataprev.dsvendas.service.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService service;

	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
		return ResponseEntity.ok(service.findAll(pageable));
	}
	
	@GetMapping(value = "/amountBySeller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller() {
		return ResponseEntity.ok(service.amountGroupedBySeller());
	}
	
	@GetMapping(value = "/salesSuccessBySeller")
	public ResponseEntity<List<SaleSuccessSumDTO>> successGroupedBySeller() {
		return ResponseEntity.ok(service.successGroupedBySeller());
	}
}
