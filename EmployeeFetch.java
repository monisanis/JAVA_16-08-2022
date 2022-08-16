package com.fetch;

import javax.persistence.*;

import javax.persistence.criteria.*;

import com.AssessmentJpa.EmployeeEntity;

import java.util.*;

public class EmployeeFetch{

  public static void main( String args[]) {

     EntityManagerFactory emf = Persistence.createEntityManagerFactory("emp");

     EntityManager em = emf.createEntityManager();

     em.getTransaction().begin( );
     
     EmployeeEntity emp1=new EmployeeEntity();

     emp1.setEmployeeno(10);
     emp1.setemployeename("Monis Anis");
     emp1.setemployeedesignation("Manager");
     emp1.setemployeesalary(50000.0);
     
     em.persist(emp1);
     em.getTransaction().commit();
     
     Query q= em.createQuery("EmployeeEntity");
     List <EmployeeEntity> list=q.getResultList();
     for(EmployeeEntity e:list)
     {
    	 System.out.println(emp1.getEmployeeno()+" "+emp1.getemployeename()+" "+emp1.getemployeedesignation()+" "+emp1.getemployeesalary());
     }
     }}
