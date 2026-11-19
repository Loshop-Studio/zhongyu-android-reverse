package p129e5;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;
import java.io.IOException;
import p333s5.AbstractC11064d;
import p333s5.C11067g;

/* renamed from: e5.a */
/* loaded from: classes5.dex */
public abstract class AbstractC9104a {
    /* renamed from: a */
    public static void m17882a(Context context) {
        C11067g.m24536k(context).m17895f("subjectId");
    }

    /* renamed from: b */
    public static void m17883b(Context context, String str) {
        C11067g.m24536k(context).m17895f(str);
    }

    /* renamed from: c */
    public static String m17884c(Context context, String str, boolean z10) {
        return z10 ? C11067g.m24536k(context).m24537j(str) : C11067g.m24536k(context).m17894e(str);
    }

    /* renamed from: d */
    public static String m17885d(Context context, String str) {
        return C11067g.m24536k(context).m24539m(str);
    }

    /* renamed from: e */
    public static boolean m17886e(Context context) {
        return C11067g.m24536k(context).m17893d("_proxy_init");
    }

    /* renamed from: f */
    public static String[] m17887f(Context context) {
        String strM17894e = C11067g.m24536k(context).m17894e("subjectId");
        return TextUtils.isEmpty(strM17894e) ? new String[0] : strM17894e.split(",");
    }

    /* renamed from: g */
    public static boolean m17888g(Context context) throws IOException {
        String strM24522b = AbstractC11064d.m24522b(context);
        String str = context.getApplicationInfo().processName;
        HMSLog.m8727i("BaseUtils", "main process name: " + str + ", current process name: " + strM24522b);
        return str.equals(strM24522b);
    }

    /* renamed from: h */
    public static void m17889h(Context context, String str, String str2) {
        C11067g.m24536k(context).m24540n(str, str2);
    }
}
