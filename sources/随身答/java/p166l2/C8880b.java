package p166l2;

import com.umeng.commonsdk.config.AbstractC6781d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: l2.b */
/* loaded from: classes4.dex */
public class C8880b {

    /* renamed from: a */
    public static Map f14676a = new HashMap();

    /* renamed from: b */
    public static Object f14677b = new Object();

    /* renamed from: l2.b$b */
    public static class b {

        /* renamed from: a */
        public static final C8880b f14678a = new C8880b();
    }

    /* renamed from: c */
    public static boolean m13792c(String str) {
        if (!AbstractC6781d.m6265a(str)) {
            return false;
        }
        synchronized (f14677b) {
            try {
                if (!f14676a.containsKey(str)) {
                    return true;
                }
                return ((Boolean) f14676a.get(str)).booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public static C8880b m13793d() {
        return b.f14678a;
    }

    /* renamed from: a */
    public void m13794a() {
        synchronized (f14677b) {
            f14676a.clear();
        }
    }

    /* renamed from: b */
    public void m13795b(String str, Boolean bool) {
        if (AbstractC6781d.m6265a(str)) {
            synchronized (f14677b) {
                try {
                    Map map = f14676a;
                    if (map != null) {
                        map.put(str, bool);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C8880b() {
    }
}
