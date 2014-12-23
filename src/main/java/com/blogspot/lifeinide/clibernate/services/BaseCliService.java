package com.blogspot.lifeinide.clibernate.services;

import org.springframework.transaction.annotation.Transactional;

/**
 * Base class for all command line services.
 *
 * @see ICliService
 * @author l0co@wp.pl
 */
@Transactional
public abstract class BaseCliService implements ICliService {
}
