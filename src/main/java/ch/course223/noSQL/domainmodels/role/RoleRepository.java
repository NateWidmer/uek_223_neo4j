package ch.course223.noSQL.domainmodels.role;

import ch.course223.noSQL.core.ExtendedNeo4jRepository;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends ExtendedNeo4jRepository<Role> {

}
