package EncyclopediaApi.repository;

import EncyclopediaApi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long>, UserRepositoryCustom {

    Optional<User> findByEmailAndPassword(String email, String password);

    User save(User user);
    List<User> findAll();



}
