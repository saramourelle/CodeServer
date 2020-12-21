package model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("AlquilerDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/AlquilerDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class AlquilerDao extends OntimizeJdbcDaoSupport {

 public static final String ATTR_alquiler_id = "alquiler_id";
 public static final String ATTR_piso_id = "piso_id";
 public static final String ATTR_habitacion_id = "habitacion_id";
 public static final String ATTR_precio = "precio";
 public static final String ATTR_direccion = "direccion";
 

}
