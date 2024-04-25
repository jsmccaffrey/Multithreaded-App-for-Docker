package edu.wgu.d387_sample_code.il8n;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class TimeZoneController {

    @GetMapping("/timezones")
    public TimeZoneInfo getTimeZones() {
        return new TimeZoneInfo();
    }
}
