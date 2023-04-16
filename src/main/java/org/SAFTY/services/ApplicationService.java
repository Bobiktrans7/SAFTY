package org.SAFTY.services;

import org.SAFTY.models.Client;
import org.SAFTY.repositories.ApplicationRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class ApplicationService {

    private final ApplicationRepositories.PeopleRepository peopleRepository;


    public ApplicationService(ApplicationRepositories.PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    public Client findOne(int id) {
        Optional<Client> foundPerson = peopleRepository.findById(id);
        return foundPerson.orElse(null);
    }

    @Transactional
    public void save(Client client) {
        peopleRepository.save(client);
    }

    @Transactional
    public void update(int id, Client updatedPerson) {
        updatedPerson.setId(id);
        peopleRepository.save(updatedPerson);
    }

    @Transactional
    public void delete(int id) {
        peopleRepository.deleteById(id);
    }


}