package p008a7;

import android.content.Context;
import com.luck.picture.lib.R$string;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: a7.d */
/* loaded from: classes5.dex */
public abstract class AbstractC0071d {

    /* renamed from: a */
    public static final SimpleDateFormat f58a = new SimpleDateFormat("yyyyMMddHHmmssSSS");

    /* renamed from: b */
    public static final SimpleDateFormat f59b = new SimpleDateFormat("yyyy-MM");

    /* renamed from: c */
    public static final SimpleDateFormat f60c = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /* renamed from: a */
    public static int m152a(long j10) {
        try {
            return (int) Math.abs(m155d() - j10);
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1;
        }
    }

    /* renamed from: b */
    public static String m153b(long j10) {
        String str = j10 < 0 ? "-" : "";
        long jAbs = Math.abs(j10) + 500;
        long j11 = (jAbs <= 500 || jAbs >= 1000) ? jAbs / 1000 : 1L;
        long j12 = j11 % 60;
        long j13 = (j11 / 60) % 60;
        long j14 = j11 / 3600;
        return j14 > 0 ? String.format(Locale.getDefault(), "%s%d:%02d:%02d", str, Long.valueOf(j14), Long.valueOf(j13), Long.valueOf(j12)) : String.format(Locale.getDefault(), "%s%02d:%02d", str, Long.valueOf(j13), Long.valueOf(j12));
    }

    /* renamed from: c */
    public static String m154c(String str) {
        return str + f58a.format(Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: d */
    public static long m155d() {
        String strM242g = AbstractC0084q.m242g(Long.valueOf(System.currentTimeMillis()));
        if (strM242g.length() > 10) {
            strM242g = strM242g.substring(0, 10);
        }
        return AbstractC0084q.m240e(strM242g);
    }

    /* renamed from: e */
    public static String m156e(Context context, long j10) {
        if (String.valueOf(j10).length() <= 10) {
            j10 *= 1000;
        }
        return m159h(j10) ? context.getString(R$string.ps_current_week) : m158g(j10) ? context.getString(R$string.ps_current_month) : f59b.format(Long.valueOf(j10));
    }

    /* renamed from: f */
    public static String m157f(long j10) {
        if (String.valueOf(j10).length() <= 10) {
            j10 *= 1000;
        }
        return f60c.format(Long.valueOf(j10));
    }

    /* renamed from: g */
    public static boolean m158g(long j10) {
        Date date = new Date(j10);
        SimpleDateFormat simpleDateFormat = f59b;
        return simpleDateFormat.format(date).equals(simpleDateFormat.format(new Date()));
    }

    /* renamed from: h */
    public static boolean m159h(long j10) {
        Calendar calendar = Calendar.getInstance();
        int i10 = calendar.get(3);
        calendar.setTime(new Date(j10));
        return calendar.get(3) == i10;
    }

    /* renamed from: i */
    public static long m160i(long j10) {
        return ((Math.abs(j10) + 500) / 1000) * 1000;
    }
}
