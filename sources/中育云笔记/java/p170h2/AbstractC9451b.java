package p170h2;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: h2.b */
/* loaded from: classes3.dex */
public abstract class AbstractC9451b {

    /* renamed from: a */
    public static final ConcurrentHashMap f21865a = new ConcurrentHashMap();

    /* renamed from: a */
    public static final String m18638a(int i10, int i11, int i12) {
        char c10 = (char) (((((i12 * i11) * 33) + 33) % 94) + 33);
        char cCharAt = ":F0wKU!Qg3}UkbW+w[:9|D3-5h=:T;7t#_GZ4#G;~ZNSq{8;}QIP>'{q.lje".charAt(i12 + i11);
        int i13 = ((i10 * i11) * i12) % 60;
        String strSubstring = ":F0wKU!Qg3}UkbW+w[:9|D3-5h=:T;7t#_GZ4#G;~ZNSq{8;}QIP>'{q.lje".substring(0, i13);
        AbstractC9979u.m20293f(strSubstring, "substring(...)");
        String strSubstring2 = ":F0wKU!Qg3}UkbW+w[:9|D3-5h=:T;7t#_GZ4#G;~ZNSq{8;}QIP>'{q.lje".substring(i13);
        AbstractC9979u.m20293f(strSubstring2, "substring(...)");
        String strSubstring3 = (strSubstring2 + strSubstring).substring(0, 14);
        AbstractC9979u.m20293f(strSubstring3, "substring(...)");
        return c10 + strSubstring3 + cCharAt;
    }

    /* renamed from: b */
    public static final String m18639b() {
        String strM18638a;
        Calendar calendar = Calendar.getInstance(Locale.CHINA);
        int i10 = calendar.get(1);
        int i11 = calendar.get(2) + 1;
        int i12 = calendar.get(5);
        String str = i10 + "--" + i11 + "--" + i12;
        ConcurrentHashMap concurrentHashMap = f21865a;
        synchronized (concurrentHashMap) {
            try {
                if (!concurrentHashMap.containsKey(str)) {
                    concurrentHashMap.put(str, m18638a(i10, i11, i12));
                }
                strM18638a = (String) concurrentHashMap.get(str);
                if (strM18638a == null) {
                    strM18638a = m18638a(i10, i11, i12);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return strM18638a;
    }
}
