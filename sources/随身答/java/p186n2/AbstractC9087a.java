package p186n2;

import android.content.Context;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import java.util.HashMap;

/* renamed from: n2.a */
/* loaded from: classes4.dex */
public abstract class AbstractC9087a {

    /* renamed from: a */
    public static HashMap f15298a;

    /* renamed from: b */
    public static Context f15299b;

    /* renamed from: a */
    public static String m14579a(int i9) {
        String str = (i9 < 16385 || i9 > 20480) ? "analytics" : "push";
        if (i9 >= 24577 && i9 <= 28672) {
            str = "share";
        }
        if (i9 >= 32769 && i9 <= 36864) {
            str = "internal";
        }
        return (i9 < 36945 || i9 > 37120) ? str : "process";
    }

    /* renamed from: b */
    public static Context m14580b() {
        return f15299b;
    }

    /* renamed from: c */
    public static UMLogDataProtocol m14581c(String str) {
        if (f15298a.containsKey(str)) {
            return (UMLogDataProtocol) f15298a.get(str);
        }
        return null;
    }

    /* renamed from: d */
    public static void m14582d(Context context) {
        if (f15299b == null) {
            f15299b = context.getApplicationContext();
        }
    }

    /* renamed from: e */
    public static boolean m14583e(int i9, UMLogDataProtocol uMLogDataProtocol) {
        if (f15298a == null) {
            f15298a = new HashMap();
        }
        String strM14579a = m14579a(i9);
        if (f15298a.containsKey(strM14579a)) {
            return true;
        }
        f15298a.put(strM14579a, uMLogDataProtocol);
        return true;
    }
}
