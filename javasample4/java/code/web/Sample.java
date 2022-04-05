package web;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class Web {
	@RequestMapping("/")
	String w1(Model model) {
		model.addAttribute("brand", "iCoffee");
		return "home"; 
	}
	String[] products = {"iPad", "iPod", "iPhone"};
	
	@RequestMapping({"/product", "/products"})
	String w3(Model m) {
		m.addAttribute("brand", "iGadget");
		m.addAttribute("products", products);
		return "product"; 
	}
	
	@RequestMapping("/search")
	String w2(String query, Model m) {
		m.addAttribute("brand", "Coffee Park");
		
		if (query == null) {
			
			m.addAttribute("request", 1);
			m.addAttribute("result", "");
		} else {
			
			m.addAttribute("request", 2);
			boolean flag = false;
			for (int i = 0; i < products.length; i++) {
				if (products[i].equals(query)) {
					flag = true;
				}
			}
			m.addAttribute("result", flag ? "Found" : "Not Found");
		}
		return "search";
	}
	
	@RequestMapping("/detail") @ResponseBody
	Team m1() {
		return new Team("USA", 5);
	}
}

record Team(String name, int point) { }
