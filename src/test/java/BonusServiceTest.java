import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {


    @org.junit.jupiter.api.Test
    void shoudCalculateNotRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000_60;
        boolean notRegistered = false;
        long expected = 10;

        // вызываем целевой метод:
        long actual = service.calculate(amount, notRegistered);

        // производим проверку (сравниваем ожидаемый и фактический):
        // если true - то PASS
        // если false - то FAIL
        boolean passed = expected == actual;

        // производится проверка
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shoudCalculateNotRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 100_000_060;
        boolean notRegistered = false;
        long expected = 5000;

        // вызываем целевой метод:
        long actual = service.calculate(amount, notRegistered);

        // производим проверку (сравниваем ожидаемый и фактический):
        // если true - то PASS
        // если false - то FAIL
        boolean passed = expected == actual;

        // производится проверка
        assertEquals(expected, actual);
    }
}