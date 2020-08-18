delete from  account;
delete from  account_transactions;


insert into account values(1000001, 'ANZ0001', 'Savings', 1000.45, sysdate(), 'SGD' );
insert into account values(1000002, 'ANZ0002', 'Current', 4562.56, sysdate(), 'AUD' );
insert into account values(1000003, 'ANZ0003', 'Savings', 5675.45, sysdate(), 'USD' );
insert into account values(1000004, 'ANZ0004', 'Current', 2434.97, sysdate(), 'INR' );
insert into account values(1000005, 'ANZ0005', 'Savings', 4565.34, sysdate(), 'NZD' );
insert into account values(1000006, 'ANZ0006', 'Trading', 75676.23, sysdate(), 'RUS' );



-- Transactions for Account 1000001
insert into account_transactions values(20000001, 56.23, 23.23, 'Credit', 'Switch ', sysdate(), 1000001);
insert into account_transactions values(20000002, 56.23, 23.23, 'Debit', 'Transfer ', sysdate(), 1000001);

-- Transactions for Account 1000002
insert into account_transactions values(20000003, 34.12, 787.34, 'Debit', 'LumpSum Transfer', sysdate(), 1000002);
insert into account_transactions values(20000004, 7897.4, 24.23, 'Credit', 'Pension', sysdate(), 1000002);

-- Transactions for Account 1000003
insert into account_transactions values(20000005, 676.45, 66.45, 'Credit', 'DIV59', sysdate(), 1000003);
insert into account_transactions values(20000006, 87.34, 23.67, 'Credit', 'ATO Return', sysdate(), 1000003);