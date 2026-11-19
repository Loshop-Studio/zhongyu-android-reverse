package com.alibaba.fastjson.parser.deserializer;

import androidx.compose.animation.core.AnimationKt;
import androidx.work.WorkRequest;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.serializer.BeanContext;
import com.alibaba.fastjson.serializer.ContextObjectSerializer;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import java.lang.reflect.Type;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public class Jdk8DateCodec extends ContextObjectDeserializer implements ObjectSerializer, ContextObjectSerializer, ObjectDeserializer {
    private static final String formatter_iso8601_pattern_23 = "yyyy-MM-dd'T'HH:mm:ss.SSS";
    private static final String formatter_iso8601_pattern_29 = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS";
    public static final Jdk8DateCodec instance = new Jdk8DateCodec();
    private static final String defaultPatttern = "yyyy-MM-dd HH:mm:ss";
    private static final DateTimeFormatter defaultFormatter = DateTimeFormatter.ofPattern(defaultPatttern);
    private static final DateTimeFormatter defaultFormatter_23 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
    private static final DateTimeFormatter formatter_dt19_tw = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    private static final DateTimeFormatter formatter_dt19_cn = DateTimeFormatter.ofPattern("yyyy年M月d日 HH:mm:ss");
    private static final DateTimeFormatter formatter_dt19_cn_1 = DateTimeFormatter.ofPattern("yyyy年M月d日 H时m分s秒");
    private static final DateTimeFormatter formatter_dt19_kr = DateTimeFormatter.ofPattern("yyyy년M월d일 HH:mm:ss");
    private static final DateTimeFormatter formatter_dt19_us = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
    private static final DateTimeFormatter formatter_dt19_eur = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private static final DateTimeFormatter formatter_dt19_de = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    private static final DateTimeFormatter formatter_dt19_in = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    private static final DateTimeFormatter formatter_d8 = DateTimeFormatter.ofPattern("yyyyMMdd");
    private static final DateTimeFormatter formatter_d10_tw = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    private static final DateTimeFormatter formatter_d10_cn = DateTimeFormatter.ofPattern("yyyy年M月d日");
    private static final DateTimeFormatter formatter_d10_kr = DateTimeFormatter.ofPattern("yyyy년M월d일");
    private static final DateTimeFormatter formatter_d10_us = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    private static final DateTimeFormatter formatter_d10_eur = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter formatter_d10_de = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    private static final DateTimeFormatter formatter_d10_in = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private static final DateTimeFormatter ISO_FIXED_FORMAT = DateTimeFormatter.ofPattern(defaultPatttern).withZone(ZoneId.systemDefault());
    private static final String formatter_iso8601_pattern = "yyyy-MM-dd'T'HH:mm:ss";
    private static final DateTimeFormatter formatter_iso8601 = DateTimeFormatter.ofPattern(formatter_iso8601_pattern);

    public static Object castToLocalDateTime(Object obj, String str) {
        if (obj == null) {
            return null;
        }
        if (str == null) {
            str = defaultPatttern;
        }
        return LocalDateTime.parse(obj.toString(), DateTimeFormatter.ofPattern(str));
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ContextObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj, String str, int i10) {
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        if (jSONLexer.token() == 8) {
            jSONLexer.nextToken();
            return null;
        }
        if (jSONLexer.token() != 4) {
            if (jSONLexer.token() != 2) {
                throw new UnsupportedOperationException();
            }
            long jLongValue = jSONLexer.longValue();
            jSONLexer.nextToken();
            if ("unixtime".equals(str)) {
                jLongValue *= 1000;
            } else if ("yyyyMMddHHmmss".equals(str)) {
                int i11 = (int) (jLongValue / 10000000000L);
                int i12 = (int) ((jLongValue / 100000000) % 100);
                int i13 = (int) ((jLongValue / AnimationKt.MillisToNanos) % 100);
                int i14 = (int) ((jLongValue / WorkRequest.MIN_BACKOFF_MILLIS) % 100);
                int i15 = (int) ((jLongValue / 100) % 100);
                int i16 = (int) (jLongValue % 100);
                if (type == AbstractC5520b.m3333a()) {
                    return (T) LocalDateTime.of(i11, i12, i13, i14, i15, i16);
                }
            }
            if (type == AbstractC5520b.m3333a()) {
                return (T) LocalDateTime.ofInstant(Instant.ofEpochMilli(jLongValue), JSON.defaultTimeZone.toZoneId());
            }
            if (type == AbstractC5547o0.m3360a()) {
                return (T) LocalDateTime.ofInstant(Instant.ofEpochMilli(jLongValue), JSON.defaultTimeZone.toZoneId()).toLocalDate();
            }
            if (type == AbstractC5548p.m3361a()) {
                return (T) LocalDateTime.ofInstant(Instant.ofEpochMilli(jLongValue), JSON.defaultTimeZone.toZoneId()).toLocalTime();
            }
            if (type == AbstractC5564x.m3377a()) {
                return (T) ZonedDateTime.ofInstant(Instant.ofEpochMilli(jLongValue), JSON.defaultTimeZone.toZoneId());
            }
            if (type == AbstractC5539k0.m3352a()) {
                return (T) Instant.ofEpochMilli(jLongValue);
            }
            throw new UnsupportedOperationException();
        }
        String strStringVal = jSONLexer.stringVal();
        jSONLexer.nextToken();
        DateTimeFormatter dateTimeFormatterOfPattern = str != null ? defaultPatttern.equals(str) ? defaultFormatter : DateTimeFormatter.ofPattern(str) : null;
        if ("".equals(strStringVal)) {
            return null;
        }
        if (type == AbstractC5520b.m3333a()) {
            return (strStringVal.length() == 10 || strStringVal.length() == 8) ? (T) LocalDateTime.of(parseLocalDate(strStringVal, str, dateTimeFormatterOfPattern), LocalTime.MIN) : (T) parseDateTime(strStringVal, dateTimeFormatterOfPattern);
        }
        if (type == AbstractC5547o0.m3360a()) {
            if (strStringVal.length() != 23) {
                return (T) parseLocalDate(strStringVal, str, dateTimeFormatterOfPattern);
            }
            LocalDateTime localDateTime = LocalDateTime.parse(strStringVal);
            return (T) LocalDate.of(localDateTime.getYear(), localDateTime.getMonthValue(), localDateTime.getDayOfMonth());
        }
        int i17 = 0;
        if (type == AbstractC5548p.m3361a()) {
            if (strStringVal.length() == 23) {
                LocalDateTime localDateTime2 = LocalDateTime.parse(strStringVal);
                return (T) LocalTime.of(localDateTime2.getHour(), localDateTime2.getMinute(), localDateTime2.getSecond(), localDateTime2.getNano());
            }
            while (true) {
                if (i17 < strStringVal.length()) {
                    char cCharAt = strStringVal.charAt(i17);
                    if (cCharAt < '0' || cCharAt > '9') {
                        break;
                    }
                    i17++;
                } else if (strStringVal.length() > 8 && strStringVal.length() < 19) {
                    return (T) LocalDateTime.ofInstant(Instant.ofEpochMilli(Long.parseLong(strStringVal)), JSON.defaultTimeZone.toZoneId()).toLocalTime();
                }
            }
            return (T) LocalTime.parse(strStringVal);
        }
        if (type == AbstractC5564x.m3377a()) {
            if (dateTimeFormatterOfPattern == defaultFormatter) {
                dateTimeFormatterOfPattern = ISO_FIXED_FORMAT;
            }
            if (dateTimeFormatterOfPattern == null && strStringVal.length() <= 19) {
                JSONScanner jSONScanner = new JSONScanner(strStringVal);
                TimeZone timeZone = defaultJSONParser.lexer.getTimeZone();
                jSONScanner.setTimeZone(timeZone);
                if (jSONScanner.scanISO8601DateIfMatch(false)) {
                    return (T) ZonedDateTime.ofInstant(jSONScanner.getCalendar().getTime().toInstant(), timeZone.toZoneId());
                }
            }
            return (T) parseZonedDateTime(strStringVal, dateTimeFormatterOfPattern);
        }
        if (type == AbstractC5567z.m3380a()) {
            return (T) OffsetDateTime.parse(strStringVal);
        }
        if (type == AbstractC5521b0.m3334a()) {
            return (T) OffsetTime.parse(strStringVal);
        }
        if (type == AbstractC5527e0.m3340a()) {
            return (T) ZoneId.of(strStringVal);
        }
        if (type == AbstractC5529f0.m3342a()) {
            return (T) Period.parse(strStringVal);
        }
        if (type == AbstractC5535i0.m3348a()) {
            return (T) Duration.parse(strStringVal);
        }
        if (type != AbstractC5539k0.m3352a()) {
            return null;
        }
        while (true) {
            if (i17 < strStringVal.length()) {
                char cCharAt2 = strStringVal.charAt(i17);
                if (cCharAt2 < '0' || cCharAt2 > '9') {
                    break;
                }
                i17++;
            } else if (strStringVal.length() > 8 && strStringVal.length() < 19) {
                return (T) Instant.ofEpochMilli(Long.parseLong(strStringVal));
            }
        }
        return (T) Instant.parse(strStringVal);
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
        return 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.time.LocalDateTime parseDateTime(java.lang.String r17, java.time.format.DateTimeFormatter r18) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.parseDateTime(java.lang.String, java.time.format.DateTimeFormatter):java.time.LocalDateTime");
    }

    public LocalDate parseLocalDate(String str, String str2, DateTimeFormatter dateTimeFormatter) {
        DateTimeFormatter dateTimeFormatter2;
        DateTimeFormatter dateTimeFormatter3;
        if (dateTimeFormatter == null) {
            if (str.length() == 8) {
                dateTimeFormatter = formatter_d8;
            }
            int i10 = 0;
            if (str.length() == 10) {
                char cCharAt = str.charAt(4);
                char cCharAt2 = str.charAt(7);
                if (cCharAt == '/' && cCharAt2 == '/') {
                    dateTimeFormatter = formatter_d10_tw;
                }
                char cCharAt3 = str.charAt(0);
                char cCharAt4 = str.charAt(1);
                char cCharAt5 = str.charAt(2);
                char cCharAt6 = str.charAt(3);
                char cCharAt7 = str.charAt(5);
                if (cCharAt5 == '/' && cCharAt7 == '/') {
                    int i11 = ((cCharAt6 - '0') * 10) + (cCharAt - '0');
                    if (((cCharAt3 - '0') * 10) + (cCharAt4 - '0') > 12) {
                        dateTimeFormatter3 = formatter_d10_eur;
                    } else if (i11 > 12) {
                        dateTimeFormatter3 = formatter_d10_us;
                    } else {
                        String country = Locale.getDefault().getCountry();
                        if (country.equals("US")) {
                            dateTimeFormatter3 = formatter_d10_us;
                        } else if (country.equals("BR") || country.equals("AU")) {
                            dateTimeFormatter3 = formatter_d10_eur;
                        }
                    }
                    dateTimeFormatter = dateTimeFormatter3;
                } else if (cCharAt5 == '.' && cCharAt7 == '.') {
                    dateTimeFormatter = formatter_d10_de;
                } else if (cCharAt5 == '-' && cCharAt7 == '-') {
                    dateTimeFormatter = formatter_d10_in;
                }
            }
            if (str.length() >= 9) {
                char cCharAt8 = str.charAt(4);
                if (cCharAt8 == 24180) {
                    dateTimeFormatter2 = formatter_d10_cn;
                } else if (cCharAt8 == 45380) {
                    dateTimeFormatter2 = formatter_d10_kr;
                }
                dateTimeFormatter = dateTimeFormatter2;
            }
            while (true) {
                if (i10 < str.length()) {
                    char cCharAt9 = str.charAt(i10);
                    if (cCharAt9 < '0' || cCharAt9 > '9') {
                        break;
                    }
                    i10++;
                } else if (str.length() > 8 && str.length() < 19) {
                    return LocalDateTime.ofInstant(Instant.ofEpochMilli(Long.parseLong(str)), JSON.defaultTimeZone.toZoneId()).toLocalDate();
                }
            }
        }
        return dateTimeFormatter == null ? LocalDate.parse(str) : LocalDate.parse(str, dateTimeFormatter);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.time.ZonedDateTime parseZonedDateTime(java.lang.String r16, java.time.format.DateTimeFormatter r17) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec.parseZonedDateTime(java.lang.String, java.time.format.DateTimeFormatter):java.time.ZonedDateTime");
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i10) {
        SerializeWriter serializeWriter = jSONSerializer.out;
        if (obj == null) {
            serializeWriter.writeNull();
            return;
        }
        if (type == null) {
            type = obj.getClass();
        }
        if (type != AbstractC5520b.m3333a()) {
            serializeWriter.writeString(obj.toString());
            return;
        }
        SerializerFeature serializerFeature = SerializerFeature.UseISO8601DateFormat;
        int mask = serializerFeature.getMask();
        LocalDateTime localDateTimeM3335a = AbstractC5522c.m3335a(obj);
        String dateFormatPattern = jSONSerializer.getDateFormatPattern();
        if (dateFormatPattern == null) {
            int i11 = i10 & mask;
            dateFormatPattern = formatter_iso8601_pattern;
            if (i11 == 0 && !jSONSerializer.isEnabled(serializerFeature)) {
                if (jSONSerializer.isEnabled(SerializerFeature.WriteDateUseDateFormat)) {
                    dateFormatPattern = JSON.DEFFAULT_DATE_FORMAT;
                } else {
                    int nano = localDateTimeM3335a.getNano();
                    if (nano != 0) {
                        dateFormatPattern = nano % 1000000 == 0 ? formatter_iso8601_pattern_23 : formatter_iso8601_pattern_29;
                    }
                }
            }
        }
        if (dateFormatPattern != null) {
            write(serializeWriter, localDateTimeM3335a, dateFormatPattern);
        } else {
            serializeWriter.writeLong(localDateTimeM3335a.atZone(JSON.defaultTimeZone.toZoneId()).toInstant().toEpochMilli());
        }
    }

    @Override // com.alibaba.fastjson.serializer.ContextObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, BeanContext beanContext) {
        write(jSONSerializer.out, AbstractC5526e.m3339a(obj), beanContext.getFormat());
    }

    private void write(SerializeWriter serializeWriter, TemporalAccessor temporalAccessor, String str) {
        DateTimeFormatter dateTimeFormatterOfPattern;
        Instant instant;
        if ("unixtime".equals(str)) {
            if (AbstractC5528f.m3341a(temporalAccessor)) {
                serializeWriter.writeInt((int) AbstractC5534i.m3347a(temporalAccessor).toEpochSecond());
                return;
            } else if (AbstractC5530g.m3343a(temporalAccessor)) {
                serializeWriter.writeInt((int) AbstractC5522c.m3335a(temporalAccessor).atZone(JSON.defaultTimeZone.toZoneId()).toEpochSecond());
                return;
            }
        }
        if ("millis".equals(str)) {
            if (AbstractC5528f.m3341a(temporalAccessor)) {
                instant = AbstractC5534i.m3347a(temporalAccessor).toInstant();
            } else {
                instant = AbstractC5530g.m3343a(temporalAccessor) ? AbstractC5522c.m3335a(temporalAccessor).atZone(JSON.defaultTimeZone.toZoneId()).toInstant() : null;
            }
            if (instant != null) {
                serializeWriter.writeLong(instant.toEpochMilli());
                return;
            }
        }
        if (str != formatter_iso8601_pattern) {
            dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern(str);
        } else {
            dateTimeFormatterOfPattern = formatter_iso8601;
        }
        serializeWriter.writeString(dateTimeFormatterOfPattern.format(temporalAccessor));
    }
}
