package org.SAFTY.repositories;

import org.SAFTY.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ApplicationRepositories {
    @Repository
    public interface PeopleRepository extends JpaRepository<Client, Integer> {

    }
}
