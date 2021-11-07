package br.gov.dataprev.dsvendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.dataprev.dsvendas.entity.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
