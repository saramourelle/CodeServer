package api.core.service;

import java.util.List;
import java.util.Map;

import com.ontimize.db.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

public interface IRentalsService {

 //alquiler
 public EntityResult rentalQuery(Map<String, Object> keyMap, List<String> attrList) ;
 public EntityResult rentalInsert(Map<String, Object> attrMap) ;
 public EntityResult rentalUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) ;
 public EntityResult rentalDelete(Map<String, Object> keyMap) ;

}