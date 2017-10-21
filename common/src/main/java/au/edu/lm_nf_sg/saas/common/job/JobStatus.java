package au.edu.lm_nf_sg.saas.common.job;

public enum JobStatus {
	INACTIVE,
	INITIATING,

	ASSIGNING,
	ASSIGNED_ON_MASTER,
	ASSIGNED_ON_WORKER,
	REJECTED_BY_WORKER,

	PREPARING_ON_WORKER,
	QUEUED_ON_WORKER,

	STARTING_ON_WORKER,
	RUNNING,

	FINISHING,
	FINISHED,

	STOPPING_ON_MASTER,
	STOPPING_ON_WORKER,
	STOPPED,

	MIGRATING,

	ERROR,

	DELETING_ON_MASTER,
	DELETING_ON_WORKER,
	DELETED
}
