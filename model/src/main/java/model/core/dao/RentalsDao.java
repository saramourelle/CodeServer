package model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("RentalsDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/RentalsDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class RentalsDao extends OntimizeJdbcDaoSupport {

 public static final String ATTR_rental_id = "rental_id";
 public static final String ATTR_flat_id = "flat_id";
 public static final String ATTR_room_id = "room_id";
 public static final String ATTR_availability = "availability";


}
