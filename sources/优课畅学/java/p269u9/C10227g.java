package p269u9;

import android.util.Log;
import com.tencent.liteav.TXLiteAVCode;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.AbstractC9080a;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8661c0;
import p113g8.AbstractC8665e0;
import p136i9.C8897a0;
import p181m9.C9346d;
import p225q9.C9857b;

/* renamed from: u9.g */
/* loaded from: classes5.dex */
public final class C10227g {

    /* renamed from: a */
    public static final C10227g f20403a = new C10227g();

    /* renamed from: b */
    public static final CopyOnWriteArraySet f20404b = new CopyOnWriteArraySet();

    /* renamed from: c */
    public static final Map f20405c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = C8897a0.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(C8897a0.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(C9857b.class.getName(), "okhttp.Http2");
        linkedHashMap.put(C9346d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f20405c = AbstractC9080a.m15956u(linkedHashMap);
    }

    /* renamed from: a */
    public final void m19124a(String loggerName, int i10, String message, Throwable th) {
        int iMin;
        AbstractC9133u.m16133g(loggerName, "loggerName");
        AbstractC9133u.m16133g(message, "message");
        String strM19127d = m19127d(loggerName);
        if (Log.isLoggable(strM19127d, i10)) {
            if (th != null) {
                message = message + '\n' + Log.getStackTraceString(th);
            }
            String str = message;
            int length = str.length();
            int i11 = 0;
            while (i11 < length) {
                int iM13990e0 = AbstractC8661c0.m13990e0(str, '\n', i11, false, 4, null);
                if (iM13990e0 == -1) {
                    iM13990e0 = length;
                }
                while (true) {
                    iMin = Math.min(iM13990e0, i11 + TXLiteAVCode.WARNING_START_CAPTURE_IGNORED);
                    String strSubstring = str.substring(i11, iMin);
                    AbstractC9133u.m16132f(strSubstring, "substring(...)");
                    Log.println(i10, strM19127d, strSubstring);
                    if (iMin >= iM13990e0) {
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
    public final void m19125b() {
        try {
            for (Map.Entry entry : f20405c.entrySet()) {
                m19126c((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (RuntimeException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: c */
    public final void m19126c(String str, String str2) throws SecurityException {
        Logger logger = Logger.getLogger(str);
        if (f20404b.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(C10228h.f20406a);
        }
    }

    /* renamed from: d */
    public final String m19127d(String str) {
        String str2 = (String) f20405c.get(str);
        return str2 == null ? AbstractC8665e0.m14033a1(str, 23) : str2;
    }
}
