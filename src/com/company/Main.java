package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        Example: Using TABLE_PER_CLASS with @Inheritance annotation
CREATE TABLE SAVINGS_ACCOUNT (ID NUMBER, BALANCE NUMBER, INTERESTRATE NUMBER)
CREATE TABLE CHECKING_ACCOUNT (ID NUMBER, BALANCE NUMBER, RETURNCHECKS BOOLEAN)
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Account implements Serializable {
    @Id
    private Long id;
    @Basic
    private BigDecimal balance;
    ...
}
@Entity
@Table(name="SAVINGS_ACCOUNT")
public class SavingAccount extends Account {
    @Basic
    private BigDecimal interestRate;
}
@Entity
@Table(name="CHECKING_ACCOUNT")
public class CheckingAccount extends Account {
    @Basic
    private boolean returnChecks;
}
        * */

    }
}
