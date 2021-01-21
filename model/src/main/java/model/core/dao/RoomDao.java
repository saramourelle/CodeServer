package model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("RoomDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/RoomDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class RoomDao extends OntimizeJdbcDaoSupport {

 public static final String ATTR_room_id = "room_id";
 public static final String ATTR_flat_id = "flat_id";
 public static final String ATTR_price = "price";
 public static final String ATTR_adress = "adress";
 public static final String ATTR_description = "description";
 public static final String ATTR_image = "image";

}
