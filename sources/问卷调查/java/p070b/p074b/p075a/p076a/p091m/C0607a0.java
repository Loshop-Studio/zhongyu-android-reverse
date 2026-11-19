package p070b.p074b.p075a.p076a.p091m;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: b.b.a.a.m.a0 */
/* loaded from: classes.dex */
public class C0607a0 {

    /* renamed from: a */
    public static AtomicReference<C0634z> f3714a = new AtomicReference<>();

    /* renamed from: a */
    public static long m2177a(long j) {
        Calendar calendarM2181e = m2181e();
        calendarM2181e.setTimeInMillis(j);
        return m2178b(calendarM2181e).getTimeInMillis();
    }

    /* renamed from: b */
    public static Calendar m2178b(Calendar calendar) {
        Calendar calendarM2182f = m2182f(calendar);
        Calendar calendarM2181e = m2181e();
        calendarM2181e.set(calendarM2182f.get(1), calendarM2182f.get(2), calendarM2182f.get(5));
        return calendarM2181e;
    }

    /* renamed from: c */
    public static TimeZone m2179c() {
        return TimeZone.getTimeZone("UTC");
    }

    /* renamed from: d */
    public static Calendar m2180d() {
        C0634z c0634z = f3714a.get();
        if (c0634z == null) {
            c0634z = C0634z.f3815c;
        }
        TimeZone timeZone = c0634z.f3817b;
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = c0634z.f3816a;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(m2179c());
        return calendar;
    }

    /* renamed from: e */
    public static Calendar m2181e() {
        return m2182f(null);
    }

    /* renamed from: f */
    public static Calendar m2182f(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(m2179c());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }
}
