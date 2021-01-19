package ws.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ontimize.jee.server.rest.ORestController;

import api.core.service.IRentalsService;

@RestController
@RequestMapping("/rentals")
@ComponentScan(basePackageClasses = { api.core.service.IRentalsService.class })
public class RentalRestController extends ORestController<IRentalsService> {

 @Autowired
 private IRentalsService rentalsService;

 @Override
 public IRentalsService getService() {
  return this.rentalsService;
 }
}
