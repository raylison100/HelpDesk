package br.com.helpdesk.api.repository;

import br.com.helpdesk.api.security.entity.ChangeStatus;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChangeStatusRepository extends MongoRepository<ChangeStatus, String> {

    Iterable<ChangeStatus> findByTicketIdOrderByDateChangerStatusDesc(String ticketId);
}
