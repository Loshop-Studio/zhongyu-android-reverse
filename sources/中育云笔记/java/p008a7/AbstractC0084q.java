package p008a7;

import com.alibaba.android.arouter.utils.Consts;

/* renamed from: a7.q */
/* loaded from: classes5.dex */
public abstract class AbstractC0084q {
    /* renamed from: a */
    public static double m236a(Object obj) {
        return m237b(obj, 0);
    }

    /* renamed from: b */
    public static double m237b(Object obj, int i10) {
        if (obj == null) {
            return i10;
        }
        try {
            return Double.parseDouble(obj.toString().trim());
        } catch (Exception unused) {
            return i10;
        }
    }

    /* renamed from: c */
    public static int m238c(Object obj) {
        return m239d(obj, 0);
    }

    /* renamed from: d */
    public static int m239d(Object obj, int i10) {
        if (obj != null) {
            try {
                String strTrim = obj.toString().trim();
                return strTrim.contains(Consts.DOT) ? Integer.parseInt(strTrim.substring(0, strTrim.lastIndexOf(Consts.DOT))) : Integer.parseInt(strTrim);
            } catch (Exception unused) {
            }
        }
        return i10;
    }

    /* renamed from: e */
    public static long m240e(Object obj) {
        return m241f(obj, 0L);
    }

    /* renamed from: f */
    public static long m241f(Object obj, long j10) {
        if (obj != null) {
            try {
                String strTrim = obj.toString().trim();
                return strTrim.contains(Consts.DOT) ? Long.parseLong(strTrim.substring(0, strTrim.lastIndexOf(Consts.DOT))) : Long.parseLong(strTrim);
            } catch (Exception unused) {
            }
        }
        return j10;
    }

    /* renamed from: g */
    public static String m242g(Object obj) {
        try {
            return obj.toString();
        } catch (Exception unused) {
            return "";
        }
    }
}
