package br.gov.dataprev.dsvendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.dataprev.dsvendas.entity.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}
