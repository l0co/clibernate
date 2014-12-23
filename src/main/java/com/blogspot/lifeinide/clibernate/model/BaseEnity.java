package com.blogspot.lifeinide.clibernate.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

/**
 * Base model class.
 *
 * @author l0co@wp.pl
 */
@MappedSuperclass
public class BaseEnity {

	public static final String DISCRIMINATOR_COLUMN = "classname";

	@Id
	protected long id;

	@Version
	private long version;

	@Column(updatable = false, insertable = false)
	protected String classname;

	public long getId() {
		return id;
	}

	public long getVersion() {
		return version;
	}

	public String getClassname() {
		return classname;
	}

}
