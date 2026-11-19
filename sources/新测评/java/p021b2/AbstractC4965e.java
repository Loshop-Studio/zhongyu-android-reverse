package p021b2;

import java.util.Calendar;
import java.util.Date;

/* renamed from: b2.e */
/* loaded from: classes4.dex */
public abstract class AbstractC4965e {
    /* renamed from: a */
    public static void m2410a(Calendar calendar, Calendar calendar2) {
        int iM2416g = m2416g(calendar);
        int iM2415f = m2415f(calendar);
        int iM2411b = m2411b(calendar);
        calendar2.clear();
        calendar2.set(iM2416g, iM2415f, iM2411b);
    }

    /* renamed from: b */
    public static int m2411b(Calendar calendar) {
        return calendar.get(5);
    }

    /* renamed from: c */
    public static int m2412c(Calendar calendar) {
        return calendar.get(7);
    }

    /* renamed from: d */
    public static Calendar m2413d() {
        Calendar calendar = Calendar.getInstance();
        m2410a(calendar, calendar);
        return calendar;
    }

    /* renamed from: e */
    public static Calendar m2414e(Date date) {
        Calendar calendar = Calendar.getInstance();
        if (date != null) {
            calendar.setTime(date);
        }
        m2410a(calendar, calendar);
        return calendar;
    }

    /* renamed from: f */
    public static int m2415f(Calendar calendar) {
        return calendar.get(2);
    }

    /* renamed from: g */
    public static int m2416g(Calendar calendar) {
        return calendar.get(1);
    }
}
