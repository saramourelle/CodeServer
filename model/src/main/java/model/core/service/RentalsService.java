package model.core.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.ontimize.db.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;

import api.core.service.IRentalsService;
import model.core.dao.RentalsDao;

@Service("RentalsService")
@Lazy
public class RentalsService implements IRentalsService{

 @Autowired private RentalsDao rentalsDao;
 @Autowired private DefaultOntimizeDaoHelper daoHelper;
 
 @Override
 public EntityResult rentalQuery(Map<String, Object> keyMap, List<String> attrList)
   throws OntimizeJEERuntimeException {
  return this.daoHelper.query(this.rentalsDao, keyMap, attrList);
 }

 @Override
 public EntityResult rentalInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
  return this.daoHelper.insert(this.rentalsDao, attrMap);
 }

 @Override
 public EntityResult rentalUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
   throws OntimizeJEERuntimeException {
  return this.daoHelper.update(this.rentalsDao, attrMap, keyMap);
 }

 @Override
 public EntityResult rentalDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
  return this.daoHelper.delete(this.rentalsDao, keyMap);
 }

}