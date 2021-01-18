package ws.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.core.service.IAlquilerService;
import com.ontimize.jee.server.rest.ORestController;

@RestController
@RequestMapping("/rentals")
@ComponentScan(basePackageClasses = { api.core.service.IAlquilerService.class })
public class alquilerRestController extends ORestController<IAlquilerService> {

 @Autowired
 private IAlquilerService alquilerService;

 @Override
 public IAlquilerService getService() {
  return this.alquilerService;
 }
}
