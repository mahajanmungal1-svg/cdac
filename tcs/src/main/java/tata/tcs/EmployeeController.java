package tata.tcs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home/")
public class EmployeeController {
	@Autowired
	private EmployeeRepo rmp;

	public EmployeeController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeController(EmployeeRepo rmp) {
		super();
		this.rmp = rmp;
	}
	@GetMapping
	public List<Employee> getData()
	{
		List l1=rmp.findAll();
		return l1;
		
	}

}
