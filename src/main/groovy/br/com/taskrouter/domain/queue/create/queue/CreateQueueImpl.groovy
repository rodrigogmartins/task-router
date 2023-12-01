package br.com.taskrouter.domain.queue.create.queue

import br.com.taskrouter.domain.queue.QueueRepository

class CreateQueueImpl implements CreateQueue {

  QueueRepository queueRepository

  CreateQueueImpl(QueueRepository queueRepository) {
    this.queueRepository = queueRepository
  }

  @Override
  Queue create(CreateQueueCommand createQueueCommand) {
    return this.queueRepository.create(createQueueCommand) as Queue
  }

}
