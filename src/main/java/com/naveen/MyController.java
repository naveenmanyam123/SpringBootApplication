package com.naveen;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

	@RequestMapping("req1")
	public String welcome()
	{
		return "index";
	}
	@RequestMapping("req2")
	public String home(@RequestParam int first,@RequestParam int second,@RequestParam int third,Model m)
	{
		m.addAttribute("k1", first);
		m.addAttribute("k2", second);
		m.addAttribute("k3", third);
		
		String s="";
		if(first>second && first>third)
		{
			s="First is Big";
		}
		else if(second>third)
		{
			s="Second is big";
		}
		else
		{
			s="Third is Big";
		}
		m.addAttribute("k4", s);
		
		return "result";
	}
}