package com.blogspot.lifeinide.clibernate.test;

import com.blogspot.lifeinide.clibernate.respository.BaseRepository;

/**
 * @author l0co@wp.pl
 */
public class TestRepository extends BaseRepository<TestEntity> {

	public TestRepository() {
		super(TestEntity.class);
	}
}
