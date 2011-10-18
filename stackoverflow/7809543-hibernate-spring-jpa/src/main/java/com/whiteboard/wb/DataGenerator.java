package com.whiteboard.wb;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by IntelliJ IDEA.
 * User: ryan
 * Date: 10/18/11
 * Time: 11:10 AM
 */
@Component
public class DataGenerator {
    @PersistenceContext
    EntityManager em;

    @Transactional
    public void generateTestData(){
        Container c = new Container();
        c.addChildA(new ChildTypeA());
        em.persist(c);
    }
}
