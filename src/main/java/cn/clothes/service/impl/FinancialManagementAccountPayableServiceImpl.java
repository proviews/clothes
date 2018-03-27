package cn.clothes.service.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import cn.clothes.dao.FinancialManagementAccountPayableDao;
import cn.clothes.domain.FinancialManagementAccountPayable;
import cn.clothes.service.FinancialManagementAccountPayableService;
import cn.clothes.utils.Result;

@Service
@Transactional
public class FinancialManagementAccountPayableServiceImpl implements FinancialManagementAccountPayableService{
	@Autowired
	private FinancialManagementAccountPayableDao financialManagementAccountPayableDao;
	@Override
	public Integer getTotalCount() {
		// TODO Auto-generated method stub
		return (int) financialManagementAccountPayableDao.count();
	}
	@Override
	public Page<FinancialManagementAccountPayable> findAll(Integer page,Integer limit) {
		// TODO Auto-generated method stub
		 return financialManagementAccountPayableDao.findAll(new PageRequest(page, limit));
	}
	@Override
	public Page<FinancialManagementAccountPayable> findByOrderid(String keyword,Integer page,Integer limit) {
		// TODO Auto-generated method stub
		Pageable pageable=new PageRequest(page, limit);
		Specification<FinancialManagementAccountPayable> spec =new Specification<FinancialManagementAccountPayable>() {
			
			@Override
			public Predicate toPredicate(Root<FinancialManagementAccountPayable> root, CriteriaQuery<?> query,
					CriteriaBuilder cb) {
				// TODO Auto-generated method stub
				Path<Integer> orderid = root.get("orderid");
				Predicate p = cb.equal(orderid, keyword);
				return p;
			}
		};
		return financialManagementAccountPayableDao.findAll(spec,pageable);
	}
	@Override
	public Result deleteById(Long id) {
		// TODO Auto-generated method stub
		financialManagementAccountPayableDao.deleteById(id);
		return Result.ok();
	}
	@Override
	public FinancialManagementAccountPayable findById(Long id) {
		// TODO Auto-generated method stub
		return financialManagementAccountPayableDao.findById(id).get();
	}
	@Override
	public Result updateFinancialManagementAccountPayable(
			FinancialManagementAccountPayable financialManagementAccountPayable) {
		// TODO Auto-generated method stub
		 financialManagementAccountPayableDao.saveAndFlush(financialManagementAccountPayable);
		 return Result.ok();
	}
	@Override
	public Result addFinancialManagementAccountPayable(FinancialManagementAccountPayable financialManagementAccountPayable) {
		// TODO Auto-generated method stub
		 financialManagementAccountPayableDao.save(financialManagementAccountPayable);
		 return Result.ok();
	}
	@Override
	public List<FinancialManagementAccountPayable> findByPage(Integer page, Integer limit) {
		// TODO Auto-generated method stub
		return null;
	}

}
