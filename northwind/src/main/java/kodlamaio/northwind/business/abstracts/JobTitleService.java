package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.entities.concretes.JobTitle;

public interface JobTitleService {

	void save(JobTitle jobTitle);
	List<JobTitle> findAll();
	
	
}
