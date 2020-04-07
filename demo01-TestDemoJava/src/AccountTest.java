import org.junit.Assert;
import org.junit.Test;

public class AccountTest {
    private double epsilon = 1e-6;

    @Test
    public void accountCannotHaveNegativeOverdraftLimit() {
        Account account = new Account(-20);

        Assert.assertEquals(0d, account.getOverdraftLimit(), epsilon);
    }

    @Test
    public void accountCannotOverstepOverdraftLimit() {
        Account account = new Account(10);
        final boolean result = account.withdraw(30);

        Assert.assertEquals(0d, account.getBalance(), epsilon);
        Assert.assertFalse(result);
    }

    @Test
    public void depositCannotHaveNegativeValue() {
        Account account = new Account(10);
        boolean result = account.deposit(-10);

        Assert.assertEquals(0d, account.getBalance(), epsilon);
        Assert.assertFalse(result);
    }

    @Test
    public void withdrawCannotHaveNegativeValue() {
        Account account = new Account(10);
        boolean result = account.withdraw(-10);

        Assert.assertEquals(0d, account.getBalance(), epsilon);
        Assert.assertFalse(result);
    }

    @Test
    public void depositAcceptPositiveValue() {
        Account account = new Account(10);
        boolean result = account.deposit(10);

        Assert.assertEquals(10d, account.getBalance(), epsilon);
        Assert.assertTrue(result);
    }

    @Test
    public void withdrawAcceptPositiveValue() {
        Account account = new Account(10);
        account.deposit(20);
        boolean result = account.withdraw(10);

        Assert.assertEquals(10d, account.getBalance(), epsilon);
        Assert.assertTrue(result);
    }

    @Test
    public void withdrawAcceptPositiveValueOverdraftLimit() {
        Account account = new Account(10);
        boolean result = account.withdraw(10);

        Assert.assertEquals(-10d, account.getBalance(), epsilon);
        Assert.assertTrue(result);
    }
}

class Account {
    private double balance;
    private double overdraftLimit;

    public Account(double overdraftLimit) {
        this.balance = 0;
        this.overdraftLimit = overdraftLimit > 0 ? overdraftLimit : 0;
    }

    public boolean deposit(double amount) {
        if (amount >= 0) {
            this.balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (this.balance - amount >= -this.overdraftLimit && amount >= 0) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}