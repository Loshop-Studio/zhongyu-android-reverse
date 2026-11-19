package com.tendcloud.tenddata;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.tendcloud.tenddata.C8022zz;
import java.lang.Thread;
import java.util.HashMap;
import java.util.TreeMap;

/* renamed from: com.tendcloud.tenddata.dv */
/* loaded from: classes5.dex */
public class C7944dv {

    /* renamed from: a */
    private static volatile C7944dv f14800a;

    /* renamed from: com.tendcloud.tenddata.dv$a */
    public static class a implements Thread.UncaughtExceptionHandler {
        private Thread.UncaughtExceptionHandler appDefaultHandler = Thread.getDefaultUncaughtExceptionHandler();

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (C7843ab.f14305e) {
                C7944dv.m11813a(th, String.valueOf(System.currentTimeMillis()), AbstractC7841a.UNIVERSAL, true);
                Log.w(C7843ab.f14321u, "UncaughtException in Thread " + thread.getName(), th);
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.appDefaultHandler;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }

    static {
        try {
            C7913cr.m11625a().register(m11810a());
        } catch (Throwable unused) {
        }
    }

    private C7944dv() {
        m11814b();
    }

    /* renamed from: a */
    public static C7944dv m11810a() {
        if (f14800a == null) {
            synchronized (C7944dv.class) {
                try {
                    if (f14800a == null) {
                        f14800a = new C7944dv();
                    }
                } finally {
                }
            }
        }
        return f14800a;
    }

    /* renamed from: b */
    private static void m11814b() {
        try {
            Thread.setDefaultUncaughtExceptionHandler(new a());
        } catch (Throwable unused) {
        }
    }

    public final void onTDEBEventError(C8022zz.a aVar) {
        if (aVar != null) {
            try {
                HashMap<String, Object> map = aVar.paraMap;
                if (map != null && Integer.parseInt(String.valueOf(map.get("apiType"))) == 3) {
                    m11815a(aVar.paraMap);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public void m11815a(HashMap<String, Object> map) {
        try {
            AbstractC7841a abstractC7841a = (AbstractC7841a) map.get("service");
            if (map.containsKey("throwable") && map.containsKey("occurTime")) {
                m11813a((Throwable) map.get("throwable"), String.valueOf(map.get("occurTime")), abstractC7841a, false);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m11813a(Throwable th, String str, AbstractC7841a abstractC7841a, boolean z10) {
        if (C7843ab.f14307g == null) {
            return;
        }
        try {
            long jCurrentTimeMillis = str.trim().isEmpty() ? System.currentTimeMillis() : Long.parseLong(str);
            if (z10 && C7843ab.f14276K) {
                C7897cb.m11387c(jCurrentTimeMillis, abstractC7841a);
            }
        } catch (Throwable unused) {
        }
        Throwable cause = th;
        while (cause.getCause() != null) {
            try {
                cause = cause.getCause();
            } catch (Throwable unused2) {
                return;
            }
        }
        StackTraceElement[] stackTrace = cause.getStackTrace();
        String packageName = C7843ab.f14307g.getPackageName();
        int i10 = 0;
        for (int i11 = 0; i10 < 3 && i11 < stackTrace.length; i11++) {
            String className = stackTrace[i11].getClassName();
            if ((!className.startsWith("java.") || packageName.startsWith("java.")) && ((!className.startsWith("javax.") || packageName.startsWith("javax.")) && ((!className.startsWith("android.") || packageName.startsWith("android.")) && (!className.startsWith("com.android.") || packageName.startsWith("com.android."))))) {
                stackTrace[i11].toString();
                i10++;
            }
        }
        C7961el c7961el = new C7961el();
        c7961el.f14869b = "apm";
        c7961el.f14870c = "error";
        TreeMap treeMap = new TreeMap();
        treeMap.put(NotificationCompat.CATEGORY_MESSAGE, m11811a(th));
        treeMap.put("type", cause.getClass().getName());
        c7961el.f14871d = treeMap;
        c7961el.f14868a = AbstractC7841a.UNIVERSAL;
        C7913cr.m11625a().post(c7961el);
    }

    /* renamed from: a */
    private static final String m11811a(Throwable th) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(th.toString());
        sb2.append("\r\n");
        try {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = 50;
            if (stackTrace.length <= 50) {
                length = stackTrace.length;
            }
            for (int i10 = 0; i10 < length; i10++) {
                sb2.append("\tat ");
                sb2.append(stackTrace[i10]);
                sb2.append("\r\n");
            }
            Throwable cause = th.getCause();
            if (cause != null) {
                m11812a(sb2, stackTrace, cause, 1);
            }
        } catch (Throwable unused) {
        }
        return sb2.toString();
    }

    /* renamed from: a */
    private static final void m11812a(StringBuilder sb2, StackTraceElement[] stackTraceElementArr, Throwable th, int i10) {
        try {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length - 1;
            for (int length2 = stackTraceElementArr.length - 1; length >= 0 && length2 >= 0 && stackTrace[length].equals(stackTraceElementArr[length2]); length2--) {
                length--;
            }
            if (length > 50) {
                length = 50;
            }
            sb2.append("Caused by : ");
            sb2.append(th);
            sb2.append("\r\n");
            for (int i11 = 0; i11 <= length; i11++) {
                sb2.append("\t");
                sb2.append(stackTrace[i11]);
                sb2.append("\r\n");
            }
            if (i10 < 5 && th.getCause() != null) {
                m11812a(sb2, stackTrace, th, i10 + 1);
            }
        } catch (Throwable unused) {
        }
    }
}
