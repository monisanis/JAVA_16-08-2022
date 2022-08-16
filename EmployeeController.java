package com.java;  
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
  
@RequestMapping("/Information")  
@Controller  
public class EmployeeController {  
    @RequestMapping("/InformationForm")  
public String Form(Model model)  
{  
        
    Employee emp=new Employee();  
      
    model.addAttribute("Employee",emp);  
    return "reservation-page";  
}  
@RequestMapping("/submitForm")  
public String submitForm(@ModelAttribute("employee") Employee emp)  
{  
    return "confirmation-page";  
}  
}  
