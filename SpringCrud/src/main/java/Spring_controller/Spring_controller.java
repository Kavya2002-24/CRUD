package Spring_controller;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.transaction.Transactional;

//import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import Spring_Dao.Spring_Dao;
import Spring_Dto.Spring_Dto;



@Controller
public class Spring_controller {

	@Autowired
	Spring_Dao sdo;

	@RequestMapping("/insert")
	@ResponseBody
	public String insertData( @ModelAttribute Spring_Dto Sdto)
	{
		System.out.println(Sdto);
		String msg=sdo.insert(Sdto);
	    return msg;
	}
	
	
	@RequestMapping("/fid")
	public ModelAndView findById( @ModelAttribute Spring_Dto Sdto)
	{
	  Object o=sdo.fetchById(Sdto.getEmail());
	  ModelAndView mdv=new ModelAndView("display.jsp");
	  mdv.addObject("obj", o);
	
		return mdv;
	}
	
	
	@RequestMapping("/did")
	@ResponseBody
	public String deleteById( @ModelAttribute Spring_Dto Sdto)
	{
	  String str=sdo.deleteById(Sdto.getEmail());
	  return str;
	  
	}
	
	
	@RequestMapping("/fetchAll")
	public ModelAndView fetchAll( @ModelAttribute Spring_Dto Sdto)
	{
	  Object o=sdo.fetchAll(Sdto.getEmail());
	  ModelAndView mdv=new ModelAndView("display.jsp");
	  //mdv.setViewName("fetchAll.jsp");
	  mdv.addObject("obj", o);
	
		return mdv;
	}
	
	@RequestMapping("/deleteAll")
	@ResponseBody
	public String deleteAll( @ModelAttribute Spring_Dto Sdto)
	{
	  String str=sdo.deleteAll(Sdto.getEmail());
	  return str;
	}
	
	
	@RequestMapping("/update")
	@ResponseBody
	public ModelAndView updatedata(@ModelAttribute Spring_Dto Sdto) {
	    sdo.update(Sdto);
	    
	    Object o1=sdo.fetchAll(null);
	    ModelAndView mdv = new ModelAndView("display.jsp");
	    mdv.addObject("obj", o1);
	    return mdv;
	}


}
