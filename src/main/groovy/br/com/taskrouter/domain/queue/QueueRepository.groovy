package br.com.taskrouter.domain.queue

import br.com.taskrouter.domain.queue.create.queue.CreateQueueCommand

interface QueueRepository {

  Queue create(CreateQueueCommand queue)

}