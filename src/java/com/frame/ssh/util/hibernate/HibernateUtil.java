package com.frame.ssh.util.hibernate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
@SuppressWarnings({"unchecked", "rawtypes"})
public class HibernateUtil {

	public static final ThreadLocal MAP = new ThreadLocal();
	private static final Log LOG = LogFactory.getLog(HibernateUtil.class);
	private static final SessionFactory SESSION_FACTORY;
	/** Make default construct private */
	private HibernateUtil() {
	}

	/** Loads Hibernate config. */
	static {
		try {
			LOG.debug("HibernateUtil.static - loading config");
			SESSION_FACTORY = new Configuration().configure().buildSessionFactory();
			LOG.debug("HibernateUtil.static - end");
		} catch (HibernateException ex) {
			throw new RuntimeException("Exception building SessionFactory: " + ex.getMessage(), ex);
		}
	}

	public static Session currentSession() throws HibernateException {
		Session s = (Session) MAP.get();
		// Open a new Session, if this Thread has none yet
		if (s == null) {
			s = SESSION_FACTORY.openSession();
			MAP.set(s);
		}
		return s;
	}
	public static void closeSession() throws HibernateException {
		Session s = (Session) MAP.get();
		MAP.set(null);
		if (s != null) {
			s.close();
		}
	}
}
