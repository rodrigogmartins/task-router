package br.com.taskrouter.domain.task.equeue.task

import br.com.taskrouter.domain.task.Task

interface EnqueueTask {

  Task enqueue(UUID taskId)

}