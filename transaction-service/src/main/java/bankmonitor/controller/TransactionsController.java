package bankmonitor.controller;

import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bankmonitor.model.TransactionEntity;
import bankmonitor.api.TransactionApi;
import bankmonitor.api.model.Transaction;
import bankmonitor.repository.TransactionRepository;
import jakarta.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/")
public class TransactionsController implements TransactionApi {

  private TransactionRepository transactionRepository;

  @Autowired
  public void setTransactionRepository(TransactionRepository transactionRepository) {
      this.transactionRepository = transactionRepository;
  }

  public ResponseEntity<List<Transaction>> _readTransactions() {
    return ResponseEntity.ok(transactionRepository.findAll().stream().map(this::conv).toList());
  }

  public ResponseEntity<Transaction> _createTransaction(String jsonData) {
    return ResponseEntity.badRequest().build();
  }

  public ResponseEntity<Transaction> _updateTransaction(Long id, String jsonData) {
      try {
        var entity = transactionRepository.findById(id).orElseThrow(EntityNotFoundException::new);

        JSONObject jsonObj = new JSONObject(jsonData);
        Long amount = jsonObj.has("amount") ? jsonObj.getInt("amount") : -1L;
        
        entity.setAmount(amount);
        transactionRepository.save(entity);
        return ResponseEntity.ok(conv(entity));
      }
      catch (EntityNotFoundException e) {
          return ResponseEntity.badRequest().build();
      }
  }

  private Transaction conv(TransactionEntity entity) {
    return new Transaction(entity.getData(), entity.getId(), entity.getAmount());
  }

}