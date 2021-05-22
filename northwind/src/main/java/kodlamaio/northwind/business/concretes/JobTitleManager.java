package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.JobTitleService;
import kodlamaio.northwind.dataAccess.abstracts.JobTitleDao;
import kodlamaio.northwind.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService {
	
	private JobTitleDao jobTitleDao;
	
	public JobTitleManager(JobTitleDao jobTitleDao){
			this.jobTitleDao = jobTitleDao;
	}
	
	@Override
	public void save(JobTitle jobTitle) {
		jobTitleDao.save(jobTitle);
		
	}

	@Override
	public List<JobTitle> findAll() {
		return jobTitleDao.findAll();
		
	}

	
	
}
