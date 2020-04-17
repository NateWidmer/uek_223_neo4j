package ch.course223.noSQL.domainmodels.authority;

import ch.course223.noSQL.core.ExtendedNeo4jRepository;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AuthorityRepository extends ExtendedNeo4jRepository<Authority> {

}
