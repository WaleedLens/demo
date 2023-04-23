package com.swe206.group_two.backend.sport;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SportRepository extends JpaRepository<Sport,Long> {

    Sport getById(long id);

}
