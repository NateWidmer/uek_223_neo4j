package ch.course223.noSQL.domainmodels.authority;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AuthorityRepository extends Neo4jRepository<Authority, Long> {

}
