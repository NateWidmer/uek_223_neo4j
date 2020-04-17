package ch.course223.noSQL.domainmodels.user;

import ch.course223.noSQL.core.ExtendedNeo4jRepository;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ExtendedNeo4jRepository<User> {
}
