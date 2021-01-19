package api.core.service;

import java.util.List;
import java.util.Map;

import com.ontimize.db.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

public interface IRoomService {

 //habitacion
 public EntityResult roomQuery(Map<String, Object> keyMap, List<String> attrList) ;
 public EntityResult roomInsert(Map<String, Object> attrMap) ;
 public EntityResult roomUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) ;
 public EntityResult roomDelete(Map<String, Object> keyMap) ;

}