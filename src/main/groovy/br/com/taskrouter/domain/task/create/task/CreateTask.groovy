package br.com.taskrouter.domain.task.create.task

import br.com.taskrouter.domain.task.Task

interface CreateTask {

  Task create(CreateTaskCommand taskCreatorCommand)

}