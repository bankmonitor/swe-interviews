package bankmonitor.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;

@Builder
@Entity
@Table(name = "transaction")
public class TransactionEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "created_at")
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", shape = Shape.STRING)
  private LocalDateTime timestamp;

  @Column(name = "data")
  private String data;

  @Column(name = "amount")
  private Long amount;

  public Long getId() {
      return this.id;
  }

  public void setId(Long id) {
      this.id = id;
  }

  public LocalDateTime getTimestamp() {
      return timestamp;
  }

  public void setTimestamp(LocalDateTime timestamp) {
      this.timestamp = timestamp;
  }

  public String getData() {
      return this.data;
  }

  public void setData(String data) {
      this.data = data;
  }

  public TransactionEntity data(String data) {
      this.data=data;
      return this;
  }

  public Long getAmount() {
    return this.amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

}