package p003a2;

import java.util.Calendar;
import java.util.Date;

/* renamed from: a2.e */
/* loaded from: classes4.dex */
public abstract class AbstractC0018e {
    /* renamed from: a */
    public static void m121a(Calendar calendar, Calendar calendar2) {
        int iM127g = m127g(calendar);
        int iM126f = m126f(calendar);
        int iM122b = m122b(calendar);
        calendar2.clear();
        calendar2.set(iM127g, iM126f, iM122b);
    }

    /* renamed from: b */
    public static int m122b(Calendar calendar) {
        return calendar.get(5);
    }

    /* renamed from: c */
    public static int m123c(Calendar calendar) {
        return calendar.get(7);
    }

    /* renamed from: d */
    public static Calendar m124d() {
        Calendar calendar = Calendar.getInstance();
        m121a(calendar, calendar);
        return calendar;
    }

    /* renamed from: e */
    public static Calendar m125e(Date date) {
        Calendar calendar = Calendar.getInstance();
        if (date != null) {
            calendar.setTime(date);
        }
        m121a(calendar, calendar);
        return calendar;
    }

    /* renamed from: f */
    public static int m126f(Calendar calendar) {
        return calendar.get(2);
    }

    /* renamed from: g */
    public static int m127g(Calendar calendar) {
        return calendar.get(1);
    }
}
