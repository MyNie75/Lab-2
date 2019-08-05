package Jp.ivs.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ivsController {
	@RequestMapping("index")
	public String index()
	{
		return "index";
	}
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}
	@RequestMapping("admin-home")
	public String adminhom()
	{
		return "admin/home";
	}
	
}
