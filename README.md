The task service uses in-memory data structures to support storing tasks (no database required). In addition, there is no user interface for this milestone. 
You will verify the task service through JUnit tests. The task service contains a task object along with the task service. The requirements are outlined below.

Task Class Requirements

The task object shall have a required unique task ID String that cannot be longer than 10 characters. The task ID shall not be null and shall not be updatable.
The task object shall have a required name String field that cannot be longer than 20 characters. The name field shall not be null.
The task object shall have a required description String field that cannot be longer than 50 characters. The description field shall not be null.
Task Service Requirements

The task service shall be able to add tasks with a unique ID.
The task service shall be able to delete tasks per task ID.
The task service shall be able to update task fields per task ID. The following fields are updatable:
Name
Description
