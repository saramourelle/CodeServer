package ws.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ontimize.jee.server.rest.ORestController;

import api.core.service.IFlatService;


@RestController
@RequestMapping("/flat")
@ComponentScan(basePackageClasses = { api.core.service.IFlatService.class })
public class FlatRestController2 extends ORestController<IFlatService> {

 @Autowired
 private IFlatService flatService;

 @Override
 public IFlatService getService() {
  return this.flatService;
 }
}
