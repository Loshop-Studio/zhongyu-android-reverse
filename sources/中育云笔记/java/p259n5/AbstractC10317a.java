package p259n5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import java.util.Locale;

/* renamed from: n5.a */
/* loaded from: classes5.dex */
public abstract class AbstractC10317a {
    /* renamed from: a */
    public static String m21521a() {
        return "8.0.1.304";
    }

    /* renamed from: b */
    public static String m21522b(Context context) {
        if (context == null) {
            return "";
        }
        if (ContextHolder.getAppContext() != null) {
            context = ContextHolder.getAppContext();
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionName;
        } catch (PackageManager.NameNotFoundException | RuntimeException e10) {
            Logger.m8589w("AgentUtil", "", e10);
            return "";
        }
    }

    /* renamed from: c */
    public static String m21523c(Context context, String str, String str2) {
        if (context == null) {
            return String.format(Locale.ROOT, str + "/%s", m21521a());
        }
        String packageName = (ContextHolder.getAppContext() == null ? context : ContextHolder.getAppContext()).getPackageName();
        String strM21522b = m21522b(context);
        String str3 = Build.VERSION.RELEASE;
        String str4 = Build.MODEL;
        Locale locale = Locale.ROOT;
        String str5 = "%s/%s (Linux; Android %s; %s) " + str + "/%s %s";
        String strM21521a = m21521a();
        if (TextUtils.isEmpty(str2)) {
            str2 = "no_service_name";
        }
        return String.format(locale, str5, packageName, strM21522b, str3, str4, strM21521a, str2);
    }

    /* renamed from: d */
    public static String m21524d(Context context, String str, String str2) {
        return m21523c(context, str, str2);
    }
}
