package api.core.service;

import java.util.List;
import java.util.Map;

import com.ontimize.db.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

public interface IFlatService {

 //piso
 public EntityResult flatQuery(Map<String, Object> keyMap, List<String> attrList) ;
 public EntityResult flatInsert(Map<String, Object> attrMap) ;
 public EntityResult flatUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) ;
 public EntityResult flatDelete(Map<String, Object> keyMap) ;

}