import org.example.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount("Maria", 1000.0);
    }


    @Test
    void testDepositIncreasesBalance2() {
        // TODO: Adaugă bani și verifică dacă balanța crește corect
        double initialBalance = account.getBalance();
        account.deposit(1111.0);
        assertEquals(initialBalance + 1111.0, account.getBalance());
    }

    @Test
    void testDepositNegativeAmountThrowsException() {
        // TODO: Încearcă să depui o sumă negativă și verifică dacă se aruncă IllegalArgumentException
    }

    @Test
    void testWithdrawDecreasesBalance() {
        // TODO: Retrage o sumă validă și verifică noua balanță
    }

    @Test
    void testWithdrawMoreThanBalanceThrowsException() {
        // TODO: Încearcă să retragi mai mult decât ai și verifică dacă se aruncă excepția corectă
    }

    @Test
    void testNoOperationsWhenAccountIsLocked() {
        // TODO: Blochează contul, apoi încearcă să depui/retragi și verifică dacă se aruncă IllegalStateException
    }

    @Test
    void testGetOwnerReturnsCorrectName() {
        // TODO: Verifică dacă getOwner() returnează "Maria"
    }

    @Test
    void testUnlockAllowsOperationsAgain() {
        // TODO: Blochează și apoi deblochează contul, apoi fă o operație și vezi dacă funcționează
    }
}
