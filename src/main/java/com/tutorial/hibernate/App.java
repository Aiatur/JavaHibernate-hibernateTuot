package com.tutorial.hibernate;

import java.util.List;
import java.util.Map;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/* ++++++++++++++++++++++Method 1 WIth Functions+++++++++++++++ */
//        StudentModel studentObj = new StudentModel();
//        studentObj.setId(5);
//        studentObj.setsId(500);
//        studentObj.setsName("ayat");
//        SnameModel snameObj = new SnameModel();
//        snameObj.setFname("ayat");
//        snameObj.setLname("Mullick");
//        studentObj.setsName(snameObj);
        
        
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(StudentModel.class);
        SessionFactory sf=configuration.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx= session.beginTransaction();
        
		/* ++++++++++++++++++++++Method 1 WIth Functions+++++++++++++++ */   
//        session.save(studentObj);
//        studentObj=(StudentModel)session.get(StudentModel.class, 5);
        
        String sqlString= "SELECT id ,sId,sName FROM STUDENTTABLE WHERE sId=?";
        
        /* ++++++++++++++++++++++Method 2 WIth Object type array+++++++++++++++ */
//        NativeQuery q =session.createNativeQuery(sqlString);
//        q.setParameter(1,400);
//		List<Object[]> studentObjList = q.getResultList();
        
        /* ++++++++++++++++++++++Method 3 WIth StudentModel type List map+++++++++++++++ */
//        NativeQuery q=session.createNativeQuery(sqlString);
//        q.setParameter(1,100);
//        q.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
//        List<StudentModel> studentObjList = q.getResultList();
        
        /* ++++++++++++++++++++++Method 4 WIth Entity type List+++++++++++++++ */
        NativeQuery q=session.createNativeQuery(sqlString);
        q.setParameter(1,100);
        q.addEntity(StudentModel.class);
        List<StudentModel> studentObjList = q.getResultList();
        
        tx.commit();
        
        /* ++++++++++++++++++++++Method 1 WIth Functions+++++++++++++++ */
//        System.out.println(studentObj.toString());
        
        /* ++++++++++++++++++++++Method 2 WIth Object type array+++++++++++++++ */
//        for (Object[] studentObj : studentObjList) {
//       	System.out.println("|"+studentObj[0]+"|"+studentObj[1]+"|"+studentObj[2]+"|");   	
//        }
        
        /* ++++++++++++++++++++++Method 3 WIth StudentModel type List map+++++++++++++++ */
//        for (Object studentObj : studentObjList) {
//        	Map m=(Map)studentObj;
//			System.out.println("|" + m.get("id") + "|" + m.get("sId") + "|" +m.get("sName")+"|" );
//        }
        
        /* ++++++++++++++++++++++Method 4 WIth Entity type List+++++++++++++++ */
        for (StudentModel studentObj : studentObjList) {
        	System.out.println(studentObj.toString());
        } 
    }
}
