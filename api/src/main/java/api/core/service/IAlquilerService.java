package api.core.service;

import java.util.List;
import java.util.Map;

import com.ontimize.db.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

public interface IAlquilerService {

 //alquiler
 public EntityResult alquilerQuery(Map<String, Object> keyMap, List<String> attrList) ;
 public EntityResult alquilerInsert(Map<String, Object> attrMap) ;
 public EntityResult alquilerUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) ;
 public EntityResult alquilerDelete(Map<String, Object> keyMap) ;

}