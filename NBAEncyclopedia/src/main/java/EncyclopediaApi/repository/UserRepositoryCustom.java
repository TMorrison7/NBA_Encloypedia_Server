package EncyclopediaApi.repository;

import org.springframework.data.repository.query.Param;

public interface UserRepositoryCustom {
    boolean existByEmail(String email);
}
