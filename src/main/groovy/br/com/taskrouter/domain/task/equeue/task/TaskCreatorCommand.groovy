package br.com.taskrouter.domain.task.equeue.task

import br.com.taskrouter.domain.task.TaskStatus

class TaskCreatorCommand {
  TaskStatus status
  Map<String, Object> data
}
