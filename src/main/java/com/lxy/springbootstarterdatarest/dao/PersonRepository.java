package com.lxy.springbootstarterdatarest.dao;

import com.lxy.springbootstarterdatarest.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

//@RepositoryRestResource(path = "people")
//Spring Data REST 默认规则：默认使用实体类后加"s"形成路径。可通过@RepositoryRestResource注解修改
public interface PersonRepository extends JpaRepository<Person, Long> {

    @RestResource(path = "nameStartsWith", rel = "nameStartsWith")
    Person findByNameStartingWith(String name);


    List<Person> findByAddress(String name);

    Person findByNameAndAddress(String name, String address);

    @Query("select p from Person p where p.name=:name and p.address=:address")
    Person withNameAndAddressQuery(@Param("name") String name,
                                   @Param("address") String address);

    @Query("select p from Person p where p.id=1")
    Person withIdQuery();

    Person withNameAndAddressNamedQuery(String name, String address);

}
