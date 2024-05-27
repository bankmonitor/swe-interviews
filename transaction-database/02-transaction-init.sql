DELETE FROM transaction;
INSERT INTO transaction (id, amount, data) VALUES
  (1, 100, '{ "amount": 100, "reference": "BM_2023_101" }'),
  (2, 3333, '{ "amount": 3333, "reference": "", "sender": "Bankmonitor" }'),
  (3, -1,  '{ "amount": -100, "reference": "BM_2023_101_BACK", "reason": "duplicate" }'),
  (4, 12345, '{ "amount": 12345, "reference": "BM_2023_105" }'),
  (5, 54321, '{ "amount": 54321, "sender": "Bankmonitor", "recipient": "John Doe" }');