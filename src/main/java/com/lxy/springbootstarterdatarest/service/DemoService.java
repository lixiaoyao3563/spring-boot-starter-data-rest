package com.lxy.springbootstarterdatarest.service;


import com.lxy.springbootstarterdatarest.domain.Person;

public interface DemoService {

	public Person save(Person person);

	public void remove(Long id);

	public Person findOne(Person person);


	public Person savePersonWithRollBack(Person person);

	public Person savePersonWithoutRollBack(Person person);

}
