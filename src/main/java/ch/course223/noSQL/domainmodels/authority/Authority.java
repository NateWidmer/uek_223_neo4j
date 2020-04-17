package ch.course223.noSQL.domainmodels.authority;

import ch.course223.noSQL.domainmodels.role.Role;
import org.neo4j.ogm.annotation.*;

@NodeEntity(label = "Authority")
public class Authority {

  @Id
  @GeneratedValue
  private Long id;

  private String name;

  @Relationship(type = "INCLUDES_AUTHORITY", direction = Relationship.INCOMING)
  private Role role;

  public Authority() {

  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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
