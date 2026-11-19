package com.tendcloud.tenddata;

import android.os.Handler;
import android.os.HandlerThread;
import com.taobao.accs.utl.BaseMonitor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.tendcloud.tenddata.ed */
/* loaded from: classes5.dex */
public class C7953ed {

    /* renamed from: a */
    private static List<String> f14827a = new ArrayList();

    /* renamed from: b */
    private static Handler f14828b;

    /* renamed from: c */
    private static HandlerThread f14829c;

    static {
        try {
            HandlerThread handlerThread = new HandlerThread("excHandlerThread", 10);
            f14829c = handlerThread;
            handlerThread.start();
            f14828b = new Handler(f14829c.getLooper());
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m11860b(boolean z10, String str, String str2) {
        if (z10 && !C7912cq.m11608b(str2) && str2.contains(C7842aa.f14251l)) {
            return false;
        }
        return z10 || !str.contains("api/q/a");
    }

    /* renamed from: a */
    public static void m11857a(final String str, final boolean z10, final Map<String, Object> map) {
        try {
            f14828b.post(new Runnable() { // from class: com.tendcloud.tenddata.ed.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Map map2 = map;
                        if (map2 != null && !map2.isEmpty() && C7953ed.m11860b(z10, String.valueOf(map.get("targetUrl")), str)) {
                            C7896ca.dForInternal(map.toString() + " host: " + str);
                            C7961el c7961el = new C7961el();
                            c7961el.f14869b = "sdk";
                            c7961el.f14870c = z10 ? "send_ok" : BaseMonitor.ALARM_POINT_REQ_ERROR;
                            c7961el.f14871d = map;
                            c7961el.f14868a = AbstractC7841a.ENV;
                            C7913cr.m11625a().post(c7961el);
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static final String m11856a(Throwable th) {
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
                sb2.append("\t");
                sb2.append(stackTrace[i10]);
                sb2.append("\r\n");
            }
            Throwable cause = th.getCause();
            if (cause != null) {
                m11858a(sb2, stackTrace, cause, 1);
            }
        } catch (Throwable unused) {
        }
        return sb2.toString();
    }

    /* renamed from: a */
    private static final void m11858a(StringBuilder sb2, StackTraceElement[] stackTraceElementArr, Throwable th, int i10) {
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
                m11858a(sb2, stackTrace, th, i10 + 1);
            }
        } catch (Throwable unused) {
        }
    }
}
