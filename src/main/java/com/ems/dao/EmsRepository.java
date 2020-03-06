package com.ems.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ems.models.empDetail;


@Repository
public interface EmsRepository extends CrudRepository<empDetail, Long> {

}
