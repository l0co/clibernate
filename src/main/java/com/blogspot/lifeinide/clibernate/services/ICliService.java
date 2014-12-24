package com.blogspot.lifeinide.clibernate.services;

/**
 * Implemented by all command line services. Implement your own services in following way:
 * <pre>{@code
 * @literal@Service
 * class MyService extends BaseCliService {
 * }
 * }</pre>
 *
 * @author l0co@wp.pl
 */
public interface ICliService {

	public void main(String[] args);

}
