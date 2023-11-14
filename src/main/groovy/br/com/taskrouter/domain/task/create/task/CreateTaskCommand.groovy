package br.com.taskrouter.domain.task.create.task

import br.com.taskrouter.domain.task.TaskStatus

class CreateTaskCommand {
  TaskStatus status
  Map<String, Object> data
}
