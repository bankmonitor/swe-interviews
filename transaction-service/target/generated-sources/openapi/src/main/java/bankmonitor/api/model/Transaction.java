package bankmonitor.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Transaction
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-27T16:55:21.508764211Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class Transaction {

  private String data;

  private Long id;

  private Long amount;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timestamp;

  public Transaction() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Transaction(String data, Long id, Long amount) {
    this.data = data;
    this.id = id;
    this.amount = amount;
  }

  public Transaction data(String data) {
    this.data = data;
    return this;
  }

  /**
   * raw transaction data
   * @return data
  */
  @NotNull 
  @Schema(name = "data", example = "{ \"amount\": 100, \"reference\": \"BM_2023_101\" }", description = "raw transaction data", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("data")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public Transaction id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * id of the transaction
   * @return id
  */
  @NotNull 
  @Schema(name = "id", example = "100", description = "id of the transaction", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Transaction amount(Long amount) {
    this.amount = amount;
    return this;
  }

  /**
   * amount of the transaction
   * @return amount
  */
  @NotNull 
  @Schema(name = "amount", example = "100", description = "amount of the transaction", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("amount")
  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public Transaction timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * timestamp of the transaction
   * @return timestamp
  */
  @Valid 
  @Schema(name = "timestamp", description = "timestamp of the transaction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timestamp")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.data, transaction.data) &&
        Objects.equals(this.id, transaction.id) &&
        Objects.equals(this.amount, transaction.amount) &&
        Objects.equals(this.timestamp, transaction.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, id, amount, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

