package cn.clothes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Component;

import cn.clothes.domain.FinancialManagementAccountPayable;
@Component
public interface FinancialManagementAccountPayableDao extends JpaRepository<FinancialManagementAccountPayable, Long>,JpaSpecificationExecutor<FinancialManagementAccountPayable>{
}
