package br.com.taskrouter.domain.task

import br.com.taskrouter.domain.task.create.task.CreateTaskCommand

interface TaskRepository {

  Task create(CreateTaskCommand task)
  Task enqueue(UUID taskId)

}