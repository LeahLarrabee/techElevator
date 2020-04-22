package com.techelevator;

import com.techelevator.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerSearchController {

    @Autowired
    private CustomerDao customerDao;

    @RequestMapping(path="/customerList",method = RequestMethod.GET)
    public String showSearchCustomerForm() {

        return "customerList";
    }

    @RequestMapping(path="/customerList",method = RequestMethod.POST)
    public String searchCustomer(@RequestParam String search, @RequestParam String Sort, ModelMap modelMap /*need to put the text from jsp for input name value*/) {
        /* Call the model and pass values to the jsp */


        modelMap.put("customers",customerDao.searchAndSortCustomers(search,Sort)); //key will tie to the jsp


        return "customerList";
    }




}