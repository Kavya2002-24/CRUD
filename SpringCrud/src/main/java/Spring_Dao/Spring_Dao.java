package Spring_Dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;


import Spring_Dto.Spring_Dto;


@Component
public class Spring_Dao {
		EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
		EntityManager m=e.createEntityManager();
		EntityTransaction t=m.getTransaction();
	
	
	public String insert(Spring_Dto sdto) {
		
		t.begin();
		m.persist(sdto);
		t.commit();
		return "data inserted done";
	}


	public Object fetchById(String email) {
	       Spring_Dto ddt=m.find(Spring_Dto.class, email);
	       if(ddt==null)
	       {
	    	   return "no data found";
	       }else
	       
	    	   return ddt;
	       
	}


	public String deleteById(String email) {
		 Spring_Dto sd =m.find(Spring_Dto.class, email);
		 if(sd==null)
		 {
			 return "no data found";
		 }else
		 {
			 t.begin();
			 m.remove(sd);
			 t.commit();
		 }
		return "data deleted";
	}
	
	
	public List<Spring_Dto> fetchAll(String email) {
		Query q= m.createQuery("select vn from Spring_Dto vn");
		List<Spring_Dto> sdt=q.getResultList();
		if(sdt.isEmpty())
		{
			return null;
		}
		else
		{
			return sdt;
		}
		
	}


	public String deleteAll(String email) {
		Query q1=m.createQuery("select vn from Spring_Dto vn");
		List<Spring_Dto> ls=q1.getResultList();
		
		if(ls.isEmpty())
		{
			return "no data found";
		}
		else
		{
			for(Spring_Dto s:ls)
			{
				t.begin();
				m.remove(s);
				t.commit();
			}
			return "all data deleted";
		}
	}

	public String update(Spring_Dto sdto) {
		t.begin();
		m.merge(sdto);
		t.commit();
		return "data updated";
		
	}
	
	

}



