package p147k9;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p011a9.C0059v;
import p081e9.C7420e;
import p125i9.C7717b;

/* renamed from: k9.e */
/* loaded from: classes5.dex */
public final class C7907e {

    /* renamed from: a */
    public static final C7907e f13781a = new C7907e();

    /* renamed from: b */
    public static final CopyOnWriteArraySet f13782b = new CopyOnWriteArraySet();

    /* renamed from: c */
    public static final Map f13783c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = C0059v.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = C0059v.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = C7717b.class.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = C7420e.class.getName();
        Intrinsics.checkNotNullExpressionValue(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f13783c = MapsKt.toMap(linkedHashMap);
    }

    /* renamed from: a */
    public final void m13533a(String loggerName, int i10, String message, Throwable th) {
        int iMin;
        Intrinsics.checkNotNullParameter(loggerName, "loggerName");
        Intrinsics.checkNotNullParameter(message, "message");
        String strM13536d = m13536d(loggerName);
        if (Log.isLoggable(strM13536d, i10)) {
            if (th != null) {
                message = message + '\n' + Log.getStackTraceString(th);
            }
            String str = message;
            int length = str.length();
            int i11 = 0;
            while (i11 < length) {
                int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, '\n', i11, false, 4, (Object) null);
                if (iIndexOf$default == -1) {
                    iIndexOf$default = length;
                }
                while (true) {
                    iMin = Math.min(iIndexOf$default, i11 + 4000);
                    String strSubstring = str.substring(i11, iMin);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i10, strM13536d, strSubstring);
                    if (iMin >= iIndexOf$default) {
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
    public final void m13534b() {
        for (Map.Entry entry : f13783c.entrySet()) {
            m13535c((String) entry.getKey(), (String) entry.getValue());
        }
    }

    /* renamed from: c */
    public final void m13535c(String str, String str2) throws SecurityException {
        Logger logger = Logger.getLogger(str);
        if (f13782b.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(C7908f.f13784a);
        }
    }

    /* renamed from: d */
    public final String m13536d(String str) {
        String str2 = (String) f13783c.get(str);
        return str2 == null ? StringsKt.take(str, 23) : str2;
    }
}
