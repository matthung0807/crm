package com.abc.crm.repo;

import com.abc.crm.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepo extends JpaRepository<Client, Long> {

    List<Client> findByCompanyId(Long companyId);
}
