package p014b3;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import p117r2.C4521x;
import p133v2.C4635e;
import p149z2.C4710c;

/* renamed from: b3.e */
/* loaded from: classes2.dex */
public final class C2722e {

    /* renamed from: b */
    public static final Map f471b;

    /* renamed from: c */
    public static final C2722e f472c = new C2722e();

    /* renamed from: a */
    public static final CopyOnWriteArraySet f470a = new CopyOnWriteArraySet();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = C4521x.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = C4521x.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = C4710c.class.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = C4635e.class.getName();
        Intrinsics.checkNotNullExpressionValue(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f471b = MapsKt__MapsKt.toMap(linkedHashMap);
    }

    /* renamed from: a */
    public final void m1515a(String loggerName, int i4, String message, Throwable th) {
        int iMin;
        Intrinsics.checkNotNullParameter(loggerName, "loggerName");
        Intrinsics.checkNotNullParameter(message, "message");
        String strM1518d = m1518d(loggerName);
        if (Log.isLoggable(strM1518d, i4)) {
            if (th != null) {
                message = message + "\n" + Log.getStackTraceString(th);
            }
            int length = message.length();
            int i5 = 0;
            while (i5 < length) {
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) message, '\n', i5, false, 4, (Object) null);
                if (iIndexOf$default == -1) {
                    iIndexOf$default = length;
                }
                while (true) {
                    iMin = Math.min(iIndexOf$default, i5 + 4000);
                    String strSubstring = message.substring(i5, iMin);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i4, strM1518d, strSubstring);
                    if (iMin >= iIndexOf$default) {
                        break;
                    } else {
                        i5 = iMin;
                    }
                }
                i5 = iMin + 1;
            }
        }
    }

    /* renamed from: b */
    public final void m1516b() {
        for (Map.Entry entry : f471b.entrySet()) {
            m1517c((String) entry.getKey(), (String) entry.getValue());
        }
    }

    /* renamed from: c */
    public final void m1517c(String str, String str2) throws SecurityException {
        Logger logger = Logger.getLogger(str);
        if (f470a.add(logger)) {
            Intrinsics.checkNotNullExpressionValue(logger, "logger");
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(C2723f.f473a);
        }
    }

    /* renamed from: d */
    public final String m1518d(String str) {
        String str2 = (String) f471b.get(str);
        return str2 != null ? str2 : StringsKt___StringsKt.take(str, 23);
    }
}
