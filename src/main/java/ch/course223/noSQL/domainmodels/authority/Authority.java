package ch.course223.noSQL.domainmodels.authority;

import ch.course223.noSQL.core.ExtendedNodeEntity;
import ch.course223.noSQL.domainmodels.role.Role;
import org.neo4j.ogm.annotation.*;

@NodeEntity(label = "Authority")
public class Authority extends ExtendedNodeEntity {

  @Id
  @GeneratedValue
  private Long id;

  private String name;

  @Relationship(type = "INCLUDES_AUTHORITY", direction = Relationship.INCOMING)
  private Role role;

  public Authority() {

  }

  public String getName() {
    return name;
  }

  public Authority setName(String name) {
    this.name = name;
    return this;
  }

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }
}
