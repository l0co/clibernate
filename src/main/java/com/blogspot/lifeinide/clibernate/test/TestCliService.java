package com.blogspot.lifeinide.clibernate.test;

import com.blogspot.lifeinide.clibernate.respository.IRepository;
import com.blogspot.lifeinide.clibernate.services.BaseCliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author l0co@wp.pl
 */
@Service
public class TestCliService extends BaseCliService {

	@Autowired
	protected IRepository<TestEntity> testRepository;

	@Override
	public void main(String[] args) {
		System.out.println("hello from cli service");
	}
}
