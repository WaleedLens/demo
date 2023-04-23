package com.swe206.group_two.backend.sport;

import org.springframework.stereotype.Service;

@Service
public class SportService {

    private final SportRepository sportRepository;

    public SportService(SportRepository sportRepository){
        this.sportRepository = sportRepository;
    }


    public Sport tos(long id){
        return sportRepository.getById(id);
    }

}
