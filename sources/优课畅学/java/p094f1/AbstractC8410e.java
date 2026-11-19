package p094f1;

import java.util.Calendar;
import java.util.Date;

/* renamed from: f1.e */
/* loaded from: classes4.dex */
public abstract class AbstractC8410e {
    /* renamed from: a */
    public static void m13714a(Calendar calendar, Calendar calendar2) {
        int iM13720g = m13720g(calendar);
        int iM13719f = m13719f(calendar);
        int iM13715b = m13715b(calendar);
        calendar2.clear();
        calendar2.set(iM13720g, iM13719f, iM13715b);
    }

    /* renamed from: b */
    public static int m13715b(Calendar calendar) {
        return calendar.get(5);
    }

    /* renamed from: c */
    public static int m13716c(Calendar calendar) {
        return calendar.get(7);
    }

    /* renamed from: d */
    public static Calendar m13717d() {
        Calendar calendar = Calendar.getInstance();
        m13714a(calendar, calendar);
        return calendar;
    }

    /* renamed from: e */
    public static Calendar m13718e(Date date) {
        Calendar calendar = Calendar.getInstance();
        if (date != null) {
            calendar.setTime(date);
        }
        m13714a(calendar, calendar);
        return calendar;
    }

    /* renamed from: f */
    public static int m13719f(Calendar calendar) {
        return calendar.get(2);
    }

    /* renamed from: g */
    public static int m13720g(Calendar calendar) {
        return calendar.get(1);
    }
}
