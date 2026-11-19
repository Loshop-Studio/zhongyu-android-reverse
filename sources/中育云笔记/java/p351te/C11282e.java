package p351te;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import je.C9742v;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9979u;
import ne.C10415e;
import p310qd.AbstractC10793c0;
import p310qd.AbstractC10797e0;
import re.C10995b;

/* renamed from: te.e */
/* loaded from: classes6.dex */
public final class C11282e {

    /* renamed from: a */
    public static final C11282e f27092a = new C11282e();

    /* renamed from: b */
    public static final CopyOnWriteArraySet f27093b = new CopyOnWriteArraySet();

    /* renamed from: c */
    public static final Map f27094c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = C9742v.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = C9742v.class.getName();
        AbstractC9979u.m20293f(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = C10995b.class.getName();
        AbstractC9979u.m20293f(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = C10415e.class.getName();
        AbstractC9979u.m20293f(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f27094c = AbstractC9925a.m20101u(linkedHashMap);
    }

    /* renamed from: a */
    public final void m25223a(String loggerName, int i10, String message, Throwable th) {
        int iMin;
        AbstractC9979u.m20294g(loggerName, "loggerName");
        AbstractC9979u.m20294g(message, "message");
        String strM25226d = m25226d(loggerName);
        if (Log.isLoggable(strM25226d, i10)) {
            if (th != null) {
                message = message + '\n' + Log.getStackTraceString(th);
            }
            String str = message;
            int length = str.length();
            int i11 = 0;
            while (i11 < length) {
                int iM23128e0 = AbstractC10793c0.m23128e0(str, '\n', i11, false, 4, null);
                if (iM23128e0 == -1) {
                    iM23128e0 = length;
                }
                while (true) {
                    iMin = Math.min(iM23128e0, i11 + 4000);
                    String strSubstring = str.substring(i11, iMin);
                    AbstractC9979u.m20293f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i10, strM25226d, strSubstring);
                    if (iMin >= iM23128e0) {
                        break;
                    } else {
                        i11 = iMin;
                    }
                }
                i11 = iMin + 1;
            }
        }
    }

    /* renamed from: b */
    public final void m25224b() {
        for (Map.Entry entry : f27094c.entrySet()) {
            m25225c((String) entry.getKey(), (String) entry.getValue());
        }
    }

    /* renamed from: c */
    public final void m25225c(String str, String str2) throws SecurityException {
        Logger logger = Logger.getLogger(str);
        if (f27093b.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(C11283f.f27095a);
        }
    }

    /* renamed from: d */
    public final String m25226d(String str) {
        String str2 = (String) f27094c.get(str);
        return str2 == null ? AbstractC10797e0.m23172i1(str, 23) : str2;
    }
}
