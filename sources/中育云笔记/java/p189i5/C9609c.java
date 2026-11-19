package p189i5;

import android.content.Context;
import android.content.pm.PackageManager;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.PLSharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: i5.c */
/* loaded from: classes5.dex */
public class C9609c {

    /* renamed from: b */
    public static final String f22131b = "c";

    /* renamed from: c */
    public static final Map f22132c = new ConcurrentHashMap(16);

    /* renamed from: a */
    public final PLSharedPreferences f22133a;

    public C9609c(Context context, String str) {
        String packageName = context.getPackageName();
        Logger.m8572d(f22131b, "get pkgname from context is{%s}", packageName);
        Map map = f22132c;
        if (map.containsKey(str + packageName)) {
            this.f22133a = (PLSharedPreferences) map.get(str + packageName);
        } else {
            PLSharedPreferences pLSharedPreferences = new PLSharedPreferences(context, str + packageName);
            this.f22133a = pLSharedPreferences;
            map.put(str + packageName, pLSharedPreferences);
        }
        m18839c(context);
    }

    /* renamed from: a */
    public String m18837a(String str, String str2) {
        String string;
        PLSharedPreferences pLSharedPreferences = this.f22133a;
        if (pLSharedPreferences == null) {
            return str2;
        }
        synchronized (pLSharedPreferences) {
            string = this.f22133a.getString(str, str2);
        }
        return string;
    }

    /* renamed from: b */
    public Map m18838b() {
        Map<String, ?> all;
        PLSharedPreferences pLSharedPreferences = this.f22133a;
        if (pLSharedPreferences == null) {
            return new HashMap();
        }
        synchronized (pLSharedPreferences) {
            all = this.f22133a.getAll();
        }
        return all;
    }

    /* renamed from: c */
    public final void m18839c(Context context) {
        String str = f22131b;
        Logger.m8580i(str, "ContextHolder.getAppContext() from GRS is:" + ContextHolder.getAppContext());
        if (ContextHolder.getAppContext() != null) {
            context = ContextHolder.getAppContext();
        }
        try {
            String string = Long.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionCode);
            String strM18837a = m18837a("version", "");
            if (string.equals(strM18837a)) {
                return;
            }
            Logger.m8581i(str, "app version changed! old version{%s} and new version{%s}", strM18837a, string);
            m18841e();
            m18842f("version", string);
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            Logger.m8588w(f22131b, "get app version failed and catch NameNotFoundException");
        }
    }

    /* renamed from: d */
    public void m18840d(String str) {
        PLSharedPreferences pLSharedPreferences = this.f22133a;
        if (pLSharedPreferences == null) {
            return;
        }
        synchronized (pLSharedPreferences) {
            this.f22133a.remove(str);
        }
    }

    /* renamed from: e */
    public void m18841e() {
        PLSharedPreferences pLSharedPreferences = this.f22133a;
        if (pLSharedPreferences == null) {
            return;
        }
        synchronized (pLSharedPreferences) {
            this.f22133a.clear();
        }
    }

    /* renamed from: f */
    public void m18842f(String str, String str2) {
        PLSharedPreferences pLSharedPreferences = this.f22133a;
        if (pLSharedPreferences == null) {
            return;
        }
        synchronized (pLSharedPreferences) {
            this.f22133a.putString(str, str2);
        }
    }
}
