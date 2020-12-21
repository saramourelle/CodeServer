package model.core.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.ontimize.db.EntityResult;
import api.core.service.IAlquilerService;
import model.core.dao.AlquilerDao;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;

@Service("AlquilerService")
@Lazy
public class AlquilerService implements IAlquilerService{

 @Autowired private AlquilerDao AlquilerDao;
 @Autowired private DefaultOntimizeDaoHelper daoHelper;
 
 @Override
 public EntityResult alquilerQuery(Map<String, Object> keyMap, List<String> attrList)
   throws OntimizeJEERuntimeException {
  return this.daoHelper.query(this.AlquilerDao, keyMap, attrList);
 }

 @Override
 public EntityResult alquilerInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
  return this.daoHelper.insert(this.AlquilerDao, attrMap);
 }

 @Override
 public EntityResult alquilerUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
   throws OntimizeJEERuntimeException {
  return this.daoHelper.update(this.AlquilerDao, attrMap, keyMap);
 }

 @Override
 public EntityResult alquilerDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
  return this.daoHelper.delete(this.AlquilerDao, keyMap);
 }

}