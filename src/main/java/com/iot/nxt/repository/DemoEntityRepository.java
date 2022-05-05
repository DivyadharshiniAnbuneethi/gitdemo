package com.iot.nxt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.iot.nxt.entity.DemoEntity;

@Transactional
public interface DemoEntityRepository extends CrudRepository<DemoEntity, Long>{

	@Query(value = "SELECT new DemoEntity(id, name )" +
            " FROM DemoEntity",
            nativeQuery = false)
    public List<DemoEntity> getDemoData();
	
	@Modifying
	@Query("update DemoEntity set NAME = :updatedName where id = :id ")
    public Integer getUpdateDemoData(Long id, String updatedName);
}
