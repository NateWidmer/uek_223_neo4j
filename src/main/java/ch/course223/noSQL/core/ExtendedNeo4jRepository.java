package ch.course223.noSQL.core;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface ExtendedNeo4jRepository<T extends ExtendedNodeEntity> extends Neo4jRepository<T, Long> {

}
