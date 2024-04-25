package edu.wgu.d387_sample_code.il8n;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZoneInfo {
    private String easternTime;
    private String mountainTime;
    private String utcTime;

    public TimeZoneInfo() {
        this.easternTime = convertTimeZones("America/New_York");
        this.mountainTime = convertTimeZones("America/Denver");
        this.utcTime = convertTimeZones("UTC");
    }

    public String getEasternTime() {
        return easternTime;
    }

    public String getMountainTime() {
        return mountainTime;
    }

    public String getUtcTime() {
        return utcTime;
    }

    private String convertTimeZones(String zoneIdString) {
        ZoneId zoneId = ZoneId.of(zoneIdString);
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.systemDefault());
        ZonedDateTime convertedZonedDateTime = zonedDateTime.withZoneSameInstant(zoneId);
        return convertedZonedDateTime.format(DateTimeFormatter.ofPattern("HH:mm z"));
    }
}

/*
    public TimezoneInfo getTimezones() {
        ZoneId zEastern = ZoneId.of("America/New_York");
        ZoneId zMountain = ZoneId.of("America/Denver");
        ZoneId zUTC = ZoneId.of("UTC");

        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.systemDefault());

        ZonedDateTime zonedDateTimeEastern = zonedDateTime.withZoneSameInstant(zEastern);
        String easternTime = zonedDateTimeEastern.format(DateTimeFormatter.ofPattern("HH:mm z"));

        ZonedDateTime zonedDateTimeMountain = zonedDateTime.withZoneSameInstant(zMountain);
        String mountainTime = zonedDateTimeMountain.format(DateTimeFormatter.ofPattern("HH:mm z"));

        ZonedDateTime zonedDateTimeUTC = zonedDateTime.withZoneSameInstant(zUTC);
        String utcTime = zonedDateTimeUTC.format(DateTimeFormatter.ofPattern("HH:mm z"));

        return new TimezoneInfo(easternTime, mountainTime, utcTime);
 */