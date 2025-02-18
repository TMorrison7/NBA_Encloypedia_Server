package EncyclopediaApi.repository;

public class UserRepositoryImpl implements UserRepositoryCustom {
    @Override
    public boolean existByEmail(String email) {
        return false;
    }
}
