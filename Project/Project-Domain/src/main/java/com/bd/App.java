package com.bd;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bd.dao.ProjetRepository;
import com.bd.entities.Projet;
import com.bd.service.ProjetService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext ctx1 =new AnnotationConfigApplicationContext(JavaConfig.class) ;
       //ApplicationContext ctx= new  ClassPathXmlApplicationContext("applicationContext.xml");
    	// ProjetRepository repository = ctx1.getBean(ProjetRepository.class);
    	 Projet projet = new Projet();
     	 projet.setId(2);
         projet.setName("pfe2");
     //System.out.println(registrationBean.add(projet));
      ProjetService iServiceProject = (ProjetService) ctx1.getBean("ServiceProjetImp");
     iServiceProject.addProjet(projet);
    // iServiceProject.DeleteProjet(projet);
     
     List<Projet> projets = iServiceProject.findAllProjets();
     for(Projet project : projets){
     	System.out.println(projet.getName());
     }
     
     Projet projet2 = iServiceProject.findProjetById(2);
     
     System.out.println( projet2.getName());
      
     iServiceProject.DeleteProjet(projet2);
    }
}
