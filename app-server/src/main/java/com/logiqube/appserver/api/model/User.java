package com.logiqube.appserver.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import org.openapitools.jackson.nullable.JsonNullable;

import java.util.Arrays;
import java.util.Objects;

/**
 * User
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class User {

  @JsonProperty("id")
  private JsonNullable<Object> id = JsonNullable.undefined();

  @JsonProperty("username")
  private JsonNullable<Object> username = JsonNullable.undefined();

  @JsonProperty("email")
  private JsonNullable<Object> email = JsonNullable.undefined();

  @JsonProperty("first_name")
  private JsonNullable<Object> firstName = JsonNullable.undefined();

  @JsonProperty("last_name")
  private JsonNullable<Object> lastName = JsonNullable.undefined();

  public User id(Object id) {
    this.id = JsonNullable.of(id);
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", required = false)
  public JsonNullable<Object> getId() {
    return id;
  }

  public void setId(JsonNullable<Object> id) {
    this.id = id;
  }

  public User username(Object username) {
    this.username = JsonNullable.of(username);
    return this;
  }

  /**
   * Get username
   * @return username
  */
  
  @Schema(name = "username", required = false)
  public JsonNullable<Object> getUsername() {
    return username;
  }

  public void setUsername(JsonNullable<Object> username) {
    this.username = username;
  }

  public User email(Object email) {
    this.email = JsonNullable.of(email);
    return this;
  }

  /**
   * Get email
   * @return email
  */
  
  @Schema(name = "email", required = false)
  public JsonNullable<Object> getEmail() {
    return email;
  }

  public void setEmail(JsonNullable<Object> email) {
    this.email = email;
  }

  public User firstName(Object firstName) {
    this.firstName = JsonNullable.of(firstName);
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  
  @Schema(name = "first_name", required = false)
  public JsonNullable<Object> getFirstName() {
    return firstName;
  }

  public void setFirstName(JsonNullable<Object> firstName) {
    this.firstName = firstName;
  }

  public User lastName(Object lastName) {
    this.lastName = JsonNullable.of(lastName);
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  
  @Schema(name = "last_name", required = false)
  public JsonNullable<Object> getLastName() {
    return lastName;
  }

  public void setLastName(JsonNullable<Object> lastName) {
    this.lastName = lastName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return equalsNullable(this.id, user.id) &&
        equalsNullable(this.username, user.username) &&
        equalsNullable(this.email, user.email) &&
        equalsNullable(this.firstName, user.firstName) &&
        equalsNullable(this.lastName, user.lastName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), hashCodeNullable(username), hashCodeNullable(email), hashCodeNullable(firstName), hashCodeNullable(lastName));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

