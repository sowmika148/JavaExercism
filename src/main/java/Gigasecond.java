import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {
    private LocalDateTime localDateTime;

    Gigasecond(LocalDate localDate) {

        this.localDateTime = localDate.atStartOfDay();
    }

    Gigasecond(LocalDateTime localDateTime) {

        this.localDateTime = localDateTime;
    }

    LocalDateTime getDate() {
        return localDateTime.plusSeconds(1000000000);
    }
}
