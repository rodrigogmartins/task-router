package br.com.taskrouter.domain.task.create.task

import br.com.taskrouter.domain.task.Task
import br.com.taskrouter.domain.task.TaskRepository

class CreateTaskImpl implements CreateTask {

  TaskRepository taskRepository

  CreateTaskImpl(TaskRepository taskRepository) {
    this.taskRepository = taskRepository
  }

  @Override
  Task create(CreateTaskCommand task) {
    return this.taskRepository.create(task)
  }
}