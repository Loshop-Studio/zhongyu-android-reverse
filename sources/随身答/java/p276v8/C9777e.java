package p276v8;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p172l8.C8923v;
import p216p8.C9342e;
import p256t8.C9637b;

/* renamed from: v8.e */
/* loaded from: classes5.dex */
public final class C9777e {

    /* renamed from: a */
    public static final C9777e f17388a = new C9777e();

    /* renamed from: b */
    public static final CopyOnWriteArraySet f17389b = new CopyOnWriteArraySet();

    /* renamed from: c */
    public static final Map f17390c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = C8923v.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = C8923v.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = C9637b.class.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = C9342e.class.getName();
        Intrinsics.checkNotNullExpressionValue(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f17390c = MapsKt.toMap(linkedHashMap);
    }

    /* renamed from: a */
    public final void m16566a(String loggerName, int i9, String message, Throwable th) {
        int iMin;
        Intrinsics.checkNotNullParameter(loggerName, "loggerName");
        Intrinsics.checkNotNullParameter(message, "message");
        String strM16569d = m16569d(loggerName);
        if (Log.isLoggable(strM16569d, i9)) {
            if (th != null) {
                message = message + '\n' + Log.getStackTraceString(th);
            }
            String str = message;
            int length = str.length();
            int i10 = 0;
            while (i10 < length) {
                int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, '\n', i10, false, 4, (Object) null);
                if (iIndexOf$default == -1) {
                    iIndexOf$default = length;
                }
                while (true) {
                    iMin = Math.min(iIndexOf$default, i10 + 4000);
                    String strSubstring = str.substring(i10, iMin);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i9, strM16569d, strSubstring);
                    if (iMin >= iIndexOf$default) {
                        break;
                    } else {
                        i10 = iMin;
                    }
                }
                i10 = iMin + 1;
            }
        }
    }

    /* renamed from: b */
    public final void m16567b() {
        for (Map.Entry entry : f17390c.entrySet()) {
            m16568c((String) entry.getKey(), (String) entry.getValue());
        }
    }

    /* renamed from: c */
    public final void m16568c(String str, String str2) throws SecurityException {
        Logger logger = Logger.getLogger(str);
        if (f17389b.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(C9778f.f17391a);
        }
    }

    /* renamed from: d */
    public final String m16569d(String str) {
        String str2 = (String) f17390c.get(str);
        return str2 == null ? StringsKt.take(str, 23) : str2;
    }
}
