package jpabook.jpashop;

import jpabook.jpashop.domain.Member;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        //<persistence-unit name="hello">
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try{
            //create
//            Member member = new Member();
//            member.setId(1L);
//            member.setName("HelloA");
//            em.persist(member);
            //read
//            Member findMember = em.find(Member.class, 1L);
//            List<Member> result = em.createQuery("select m from Member as m",Member.class).setFirstResult(1).setMaxResults(10).getResultList();
//
//            for (Member member :
//                    result) {
//                System.out.println("member.getname = " + member.getName());
//            }
//            System.out.println("findMember = " + findMember.getId());
//            System.out.println("findMember = " + findMember.getName());

            tx.commit();

        }catch(Exception e){
            tx.rollback();
        }finally {
            em.close();
        }


        emf.close();

    }
}