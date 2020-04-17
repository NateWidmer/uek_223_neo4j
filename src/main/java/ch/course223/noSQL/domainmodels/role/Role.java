package ch.course223.noSQL.domainmodels.role;

import ch.course223.noSQL.core.ExtendedNodeEntity;
import ch.course223.noSQL.domainmodels.authority.Authority;
import ch.course223.noSQL.domainmodels.user.User;
import org.neo4j.ogm.annotation.*;

import java.util.Set;

@NodeEntity(label = "Role")
public class Role extends ExtendedNodeEntity {

  private String name;

  @Relationship(type = "INCLUDES_AUTHORITY")
  private Set<Authority> authorities;

  @Relationship(type = "HAS_ROLE", direction = Relationship.INCOMING)
  private Set<User> users;

  public Role() {

  }

  public String getName() {
    return name;
  }

  public Role setName(String name) {
    this.name = name;
    return this;
  }

  public Set<Authority> getAuthorities() {
    return authorities;
  }

  public Role setAuthorities(Set<Authority> authorities) {
    this.authorities = authorities;
    return this;
  }

  public Set<User> getUsers() {
    return users;
  }

  public void setUsers(Set<User> users) {
    this.users = users;
  }
}
