package br.com.taskrouter.domain.task.equeue.task

import br.com.taskrouter.domain.task.Task
import br.com.taskrouter.domain.task.TaskRepository

class EnqueueTaskImpl implements EnqueueTask {

  TaskRepository taskRepository

  EnqueueTaskImpl(TaskRepository taskRepository) {
    this.taskRepository = taskRepository
  }

  @Override
  Task enqueue(UUID taskId) {
    return this.taskRepository.enqueue(taskId)
  }
}
