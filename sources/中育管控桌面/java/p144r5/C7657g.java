package p144r5;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p058f5.C6356a0;
import p086j5.C6601d;
import p116n5.C7468b;

/* renamed from: r5.g */
/* loaded from: classes4.dex */
public final class C7657g {

    /* renamed from: a */
    public static final C7657g f10096a = new C7657g();

    /* renamed from: b */
    public static final CopyOnWriteArraySet f10097b = new CopyOnWriteArraySet();

    /* renamed from: c */
    public static final Map f10098c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = C6356a0.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(C6356a0.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(C7468b.class.getName(), "okhttp.Http2");
        linkedHashMap.put(C6601d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f10098c = MapsKt.toMap(linkedHashMap);
    }

    /* renamed from: a */
    public final void m9088a(String loggerName, int i6, String message, Throwable th) {
        int iMin;
        Intrinsics.checkNotNullParameter(loggerName, "loggerName");
        Intrinsics.checkNotNullParameter(message, "message");
        String strM9091d = m9091d(loggerName);
        if (Log.isLoggable(strM9091d, i6)) {
            if (th != null) {
                message = message + '\n' + Log.getStackTraceString(th);
            }
            String str = message;
            int length = str.length();
            int i7 = 0;
            while (i7 < length) {
                int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, '\n', i7, false, 4, (Object) null);
                if (iIndexOf$default == -1) {
                    iIndexOf$default = length;
                }
                while (true) {
                    iMin = Math.min(iIndexOf$default, i7 + 4000);
                    String strSubstring = str.substring(i7, iMin);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    Log.println(i6, strM9091d, strSubstring);
                    if (iMin >= iIndexOf$default) {
                        break;
                    } else {
                        i7 = iMin;
                    }
                }
                i7 = iMin + 1;
            }
        }
    }

    /* renamed from: b */
    public final void m9089b() {
        try {
            for (Map.Entry entry : f10098c.entrySet()) {
                m9090c((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (RuntimeException e6) {
            e6.printStackTrace();
        }
    }

    /* renamed from: c */
    public final void m9090c(String str, String str2) throws SecurityException {
        Logger logger = Logger.getLogger(str);
        if (f10097b.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(C7658h.f10099a);
        }
    }

    /* renamed from: d */
    public final String m9091d(String str) {
        String str2 = (String) f10098c.get(str);
        return str2 == null ? StringsKt.take(str, 23) : str2;
    }
}
