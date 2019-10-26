package com.pluralsight.springbatch.patientbatchloader.config;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.batch.core.configuration.annotation.BatchConfigurer;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.explore.JobExplorer;
import org.springframework.batch.core.explore.support.JobExplorerFactoryBean;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.support.SimpleJobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.repository.support.JobRepositoryFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * The Class BatchConfiguration.
 */
@Component
@EnableBatchProcessing
public class BatchConfiguration implements BatchConfigurer {

	/** The job repository. */
	private JobRepository jobRepository;

	/** The job explorer. */
	private JobExplorer jobExplorer;

	/** The job launcher. */
	private JobLauncher jobLauncher;

	/** The batch transaction manager. */
	@Autowired
	@Qualifier(value = "batchTransactionManager")
	private PlatformTransactionManager batchTransactionManager;

	/** The batch data source. */
	@Autowired
	@Qualifier(value = "batchDataSource")
	private DataSource batchDataSource;

	/**
	 * Gets the job repository.
	 *
	 * @return the job repository
	 * @throws Exception the exception
	 */
	@Override
	public JobRepository getJobRepository() throws Exception {
		return this.jobRepository;
	}

	/**
	 * Gets the transaction manager.
	 *
	 * @return the transaction manager
	 * @throws Exception the exception
	 */
	@Override
	public PlatformTransactionManager getTransactionManager() throws Exception {
		return this.batchTransactionManager;
	}

	/**
	 * Gets the job launcher.
	 *
	 * @return the job launcher
	 * @throws Exception the exception
	 */
	@Override
	public JobLauncher getJobLauncher() throws Exception {
		return this.jobLauncher;
	}

	/**
	 * Gets the job explorer.
	 *
	 * @return the job explorer
	 * @throws Exception the exception
	 */
	@Override
	public JobExplorer getJobExplorer() throws Exception {
		return this.jobExplorer;
	}

	/**
	 * Creates the job launcher.
	 *
	 * @return the job launcher
	 * @throws Exception the exception
	 */
	protected JobLauncher createJobLauncher() throws Exception {
		SimpleJobLauncher jobLauncher = new SimpleJobLauncher();
		jobLauncher.setJobRepository(jobRepository);
		jobLauncher.afterPropertiesSet();
		return jobLauncher;
	}

	/**
	 * Creates the job repository.
	 *
	 * @return the job repository
	 * @throws Exception the exception
	 */
	protected JobRepository createJobRepository() throws Exception {
		JobRepositoryFactoryBean factory = new JobRepositoryFactoryBean();
		factory.setDataSource(this.batchDataSource);
		factory.setTransactionManager(getTransactionManager());
		factory.afterPropertiesSet();
		return factory.getObject();
	}

	/**
	 * After properties set.
	 *
	 * @throws Exception the exception
	 */
	@PostConstruct
	public void afterPropertiesSet() throws Exception {
		this.jobRepository = createJobRepository();
		JobExplorerFactoryBean jobExplorerFactoryBean = new JobExplorerFactoryBean();
		jobExplorerFactoryBean.setDataSource(this.batchDataSource);
		jobExplorerFactoryBean.afterPropertiesSet();
		this.jobExplorer = jobExplorerFactoryBean.getObject();
		this.jobLauncher = createJobLauncher();
	}

}
