package br.com.taskrouter.domain.task

import br.com.taskrouter.domain.queue.create.queue.CreateQueueCommand

interface TaskRepository {

  Queue create(CreateQueueCommand queue)

}