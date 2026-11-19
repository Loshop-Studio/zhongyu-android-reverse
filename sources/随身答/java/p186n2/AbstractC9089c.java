package p186n2;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.umeng.commonsdk.framework.AbstractC6782a;
import com.umeng.commonsdk.framework.AbstractC6783b;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import org.json.JSONObject;
import p176m2.AbstractC8959h;
import p210p2.AbstractC9318a;
import p270v2.AbstractC9758f;
import p310z2.AbstractC9993d;

/* renamed from: n2.c */
/* loaded from: classes4.dex */
public abstract class AbstractC9089c {

    /* renamed from: a */
    public static HandlerThread f15300a;

    /* renamed from: b */
    public static Handler f15301b;

    /* renamed from: c */
    public static C9090d f15302c;

    /* renamed from: d */
    public static Object f15303d = new Object();

    /* renamed from: n2.c$a */
    public static class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i9 = message.what;
            if (i9 == 768) {
                AbstractC9089c.m14590g(message);
                return;
            }
            if (i9 == 784) {
                AbstractC9089c.m14591h();
            } else if (i9 == 770) {
                AbstractC9089c.m14587d();
            } else {
                if (i9 != 771) {
                    return;
                }
                AbstractC9089c.m14590g(message);
            }
        }
    }

    /* renamed from: d */
    public static void m14587d() {
        JSONObject jSONObjectMo6253d;
        JSONObject jSONObjectM6268b;
        AbstractC9758f.m16426a("--->>> delayProcess Enter...");
        AbstractC8959h.m14293c("MobclickRT", "--->>> delayProcess Enter...");
        Context contextM14580b = AbstractC9087a.m14580b();
        if (contextM14580b == null || !AbstractC6783b.m6291l(contextM14580b)) {
            return;
        }
        long jM6278l = AbstractC6782a.m6278l(contextM14580b);
        UMLogDataProtocol uMLogDataProtocolM14581c = AbstractC9087a.m14581c("analytics");
        if (uMLogDataProtocolM14581c != null) {
            try {
                jSONObjectMo6253d = uMLogDataProtocolM14581c.mo6253d(jM6278l);
                if (jSONObjectMo6253d == null) {
                    AbstractC8959h.m14293c("MobclickRT", "--->>> analyticsCB.setupReportData() return null");
                    return;
                }
            } catch (Throwable th) {
                AbstractC9318a.m15200b(contextM14580b, th);
                return;
            }
        } else {
            jSONObjectMo6253d = null;
        }
        if (jSONObjectMo6253d == null || jSONObjectMo6253d.length() <= 0) {
            return;
        }
        JSONObject jSONObject = (JSONObject) jSONObjectMo6253d.opt("header");
        JSONObject jSONObject2 = (JSONObject) jSONObjectMo6253d.opt("content");
        if (jSONObject == null || jSONObject2 == null || (jSONObjectM6268b = AbstractC6782a.m6268b(contextM14580b, jSONObject, jSONObject2)) == null) {
            return;
        }
        try {
            if (jSONObjectM6268b.has("exception")) {
                AbstractC8959h.m14293c("MobclickRT", "--->>> autoProcess: Build envelope error code: " + jSONObjectM6268b.getInt("exception"));
            }
        } catch (Throwable unused) {
        }
        AbstractC8959h.m14293c("MobclickRT", "--->>> autoProcess: removeCacheData ... ");
        uMLogDataProtocolM14581c.mo6251a(jSONObjectM6268b);
    }

    /* renamed from: e */
    public static synchronized boolean m14588e() {
        Handler handler = f15301b;
        if (handler == null) {
            return false;
        }
        return handler.hasMessages(771);
    }

    /* renamed from: f */
    public static synchronized boolean m14589f(int i9) {
        Handler handler = f15301b;
        if (handler == null) {
            return false;
        }
        return handler.hasMessages(i9);
    }

    /* renamed from: g */
    public static void m14590g(Message message) {
        int i9 = message.arg1;
        Object obj = message.obj;
        UMLogDataProtocol uMLogDataProtocolM14581c = AbstractC9087a.m14581c(AbstractC9087a.m14579a(i9));
        if (uMLogDataProtocolM14581c != null) {
            AbstractC9758f.m16426a("--->>> dispatch:handleEvent: call back workEvent with msg type [ 0x" + Integer.toHexString(i9) + "]");
            uMLogDataProtocolM14581c.mo6252c(obj, i9);
        }
    }

    /* renamed from: h */
    public static void m14591h() {
        if (f15302c == null || f15300a == null) {
            return;
        }
        C9090d.m14608j();
        AbstractC9758f.m16426a("--->>> handleQuit: Quit dispatch thread.");
        f15300a.quit();
        m14599p();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:13:0x0032, B:12:0x002b, B:5:0x0008, B:7:0x000c, B:9:0x001c), top: B:19:0x0003, inners: #1 }] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void m14592i() {
        /*
            java.lang.Class<n2.c> r0 = p186n2.AbstractC9089c.class
            monitor-enter(r0)
            java.lang.String r1 = "--->>> Dispatch: init Enter..."
            p270v2.AbstractC9758f.m16426a(r1)     // Catch: java.lang.Throwable -> L39
            android.os.HandlerThread r1 = p186n2.AbstractC9089c.f15300a     // Catch: java.lang.Throwable -> L2a
            if (r1 != 0) goto L32
            android.os.HandlerThread r1 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = "work_thread"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2a
            p186n2.AbstractC9089c.f15300a = r1     // Catch: java.lang.Throwable -> L2a
            r1.start()     // Catch: java.lang.Throwable -> L2a
            android.os.Handler r1 = p186n2.AbstractC9089c.f15301b     // Catch: java.lang.Throwable -> L2a
            if (r1 != 0) goto L32
            n2.c$a r1 = new n2.c$a     // Catch: java.lang.Throwable -> L2a
            android.os.HandlerThread r2 = p186n2.AbstractC9089c.f15300a     // Catch: java.lang.Throwable -> L2a
            android.os.Looper r2 = r2.getLooper()     // Catch: java.lang.Throwable -> L2a
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2a
            p186n2.AbstractC9089c.f15301b = r1     // Catch: java.lang.Throwable -> L2a
            goto L32
        L2a:
            r1 = move-exception
            android.content.Context r2 = p186n2.AbstractC9087a.m14580b()     // Catch: java.lang.Throwable -> L39
            p210p2.AbstractC9318a.m15200b(r2, r1)     // Catch: java.lang.Throwable -> L39
        L32:
            java.lang.String r1 = "--->>> Dispatch: init Exit..."
            p270v2.AbstractC9758f.m16426a(r1)     // Catch: java.lang.Throwable -> L39
            monitor-exit(r0)
            return
        L39:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p186n2.AbstractC9089c.m14592i():void");
    }

    /* renamed from: j */
    public static void m14593j(InterfaceC9088b interfaceC9088b) {
        if (f15302c != null) {
            C9090d.m14603e(interfaceC9088b);
        }
    }

    /* renamed from: k */
    public static synchronized void m14594k() {
        Handler handler = f15301b;
        if (handler == null) {
            return;
        }
        handler.removeMessages(771);
    }

    /* renamed from: l */
    public static void m14595l(long j9) {
        Handler handler = f15301b;
        if (handler != null) {
            if (handler.hasMessages(770)) {
                AbstractC8959h.m14293c("MobclickRT", "--->>> MSG_DELAY_PROCESS has exist. do nothing.");
                return;
            }
            AbstractC8959h.m14293c("MobclickRT", "--->>> MSG_DELAY_PROCESS not exist. send it.");
            Message messageObtainMessage = f15301b.obtainMessage();
            messageObtainMessage.what = 770;
            f15301b.sendMessageDelayed(messageObtainMessage, j9);
        }
    }

    /* renamed from: m */
    public static void m14596m(Context context, int i9, UMLogDataProtocol uMLogDataProtocol, Object obj) {
        m14598o(context, 768, i9, uMLogDataProtocol, obj, 0L);
    }

    /* renamed from: n */
    public static void m14597n(Context context, int i9, UMLogDataProtocol uMLogDataProtocol, Object obj, long j9) {
        m14598o(context, 771, i9, uMLogDataProtocol, obj, j9);
    }

    /* renamed from: o */
    public static void m14598o(Context context, int i9, int i10, UMLogDataProtocol uMLogDataProtocol, Object obj, long j9) {
        if (context == null || uMLogDataProtocol == null) {
            AbstractC9758f.m16426a("--->>> Context or UMLogDataProtocol parameter cannot be null!");
            return;
        }
        AbstractC9087a.m14582d(context.getApplicationContext());
        if (AbstractC9087a.m14583e(i10, uMLogDataProtocol)) {
            if (f15300a == null || f15301b == null) {
                m14592i();
            }
            try {
                if (f15301b != null) {
                    if (AbstractC9993d.m17334s(context)) {
                        synchronized (f15303d) {
                            try {
                                if (f15302c == null) {
                                    AbstractC6783b.m6295p(context);
                                    f15302c = new C9090d(context, f15301b);
                                }
                            } finally {
                            }
                        }
                    }
                    Message messageObtainMessage = f15301b.obtainMessage();
                    messageObtainMessage.what = i9;
                    messageObtainMessage.arg1 = i10;
                    messageObtainMessage.obj = obj;
                    f15301b.sendMessageDelayed(messageObtainMessage, j9);
                }
            } catch (Throwable th) {
                AbstractC9318a.m15200b(AbstractC9087a.m14580b(), th);
            }
        }
    }

    /* renamed from: p */
    public static void m14599p() {
        if (f15300a != null) {
            f15300a = null;
        }
        if (f15301b != null) {
            f15301b = null;
        }
        if (f15302c != null) {
            f15302c = null;
        }
    }
}
