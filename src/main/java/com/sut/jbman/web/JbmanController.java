package com.sut.jbman.web;
import com.sut.jbman.Jbman;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/jbmen")
@Controller
@RooWebScaffold(path = "jbmen", formBackingObject = Jbman.class)
public class JbmanController {
}
