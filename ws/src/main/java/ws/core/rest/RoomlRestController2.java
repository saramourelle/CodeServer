package ws.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ontimize.jee.server.rest.ORestController;


import api.core.service.IRoomService;


@RestController
@RequestMapping("/room")
@ComponentScan(basePackageClasses = { api.core.service.IRoomService.class })
public class RoomlRestController2 extends ORestController<IRoomService> {

 @Autowired
 private IRoomService roomService;

 @Override
 public IRoomService getService() {
  return this.roomService;
 }
}
