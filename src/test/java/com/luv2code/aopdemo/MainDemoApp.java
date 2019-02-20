package com.luv2code.aopdemo;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MainDemoApp {
   
    public static void main(String[] args) {
        // read spring config java class
        AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(DemoConfig.class);
        
        // get the bean from spring container
        AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
        
        // call the business method
            Account myAccount = new Account();
            theAccountDAO.addAccount(myAccount, true);
        
        // do it again!
        System.out.println("\nlet's add a member also!\n");
        MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
        
            theMembershipDAO.addSillyMember();
        
        System.out.println("");
        
        // close the context
        context.close();
    }

}
