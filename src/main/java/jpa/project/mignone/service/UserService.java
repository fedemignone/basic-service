package jpa.project.mignone.service;

import jpa.project.mignone.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional // Esto hace que cada metodo lo tome como una transaccion
public class UserService {

    @PersistenceContext
    private EntityManager entityManager;

    public Long insertUser(User user){
        // Open transaction - Change - Close Transaction
        entityManager.persist(user);
        return user.getId();
    }
}
