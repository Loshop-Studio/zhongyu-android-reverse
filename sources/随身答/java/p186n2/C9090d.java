package p186n2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.FileObserver;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.umeng.commonsdk.framework.AbstractC6782a;
import com.umeng.commonsdk.framework.AbstractC6783b;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import p176m2.AbstractC8959h;
import p196o2.C9160b;
import p210p2.AbstractC9318a;
import p260u2.C9671f;
import p270v2.AbstractC9754b;
import p270v2.AbstractC9758f;
import p280w2.C9802b;
import p290x2.InterfaceC9868c;

/* renamed from: n2.d */
/* loaded from: classes4.dex */
public class C9090d implements InterfaceC9868c {

    /* renamed from: a */
    public static HandlerThread f15304a = null;

    /* renamed from: b */
    public static Handler f15305b = null;

    /* renamed from: c */
    public static Handler f15306c = null;

    /* renamed from: d */
    public static c f15307d = null;

    /* renamed from: e */
    public static ConnectivityManager f15308e = null;

    /* renamed from: f */
    public static NetworkInfo f15309f = null;

    /* renamed from: g */
    public static IntentFilter f15310g = null;

    /* renamed from: h */
    public static boolean f15311h = false;

    /* renamed from: i */
    public static ArrayList f15312i;

    /* renamed from: j */
    public static Object f15313j = new Object();

    /* renamed from: k */
    public static ReentrantLock f15314k = new ReentrantLock();

    /* renamed from: l */
    public static boolean f15315l = false;

    /* renamed from: m */
    public static int f15316m = 15;

    /* renamed from: n */
    public static Object f15317n = new Object();

    /* renamed from: o */
    public static BroadcastReceiver f15318o = new a();

    /* renamed from: n2.d$a */
    public static class a extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int size;
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                Context contextM14580b = AbstractC9087a.m14580b();
                try {
                    if (C9090d.f15308e != null) {
                        NetworkInfo unused = C9090d.f15309f = C9090d.f15308e.getActiveNetworkInfo();
                        if (C9090d.f15309f == null || !C9090d.f15309f.isAvailable()) {
                            AbstractC9758f.m16432g("--->>> network disconnected.");
                            boolean unused2 = C9090d.f15311h = false;
                            return;
                        }
                        AbstractC9758f.m16432g("--->>> network isAvailable, check if there are any files to send.");
                        boolean unused3 = C9090d.f15311h = true;
                        synchronized (C9090d.f15313j) {
                            try {
                                if (C9090d.f15312i != null && (size = C9090d.f15312i.size()) > 0) {
                                    for (int i9 = 0; i9 < size; i9++) {
                                        ((InterfaceC9088b) C9090d.f15312i.get(i9)).mo12283e();
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        AbstractC8959h.m14292b("MobclickRT", "网络状态通知：尝试发送 MSG_PROCESS_NEXT");
                        C9090d.m14610l();
                        if (C9090d.f15309f.getType() != 1 || context == null) {
                            return;
                        }
                        try {
                            if (AbstractC9089c.m14589f(32774)) {
                                return;
                            }
                            AbstractC9089c.m14596m(context, 32774, C9160b.m14737a(context).m14738b(), null);
                        } catch (Throwable unused4) {
                        }
                    }
                } catch (Throwable th2) {
                    AbstractC9318a.m15200b(contextM14580b, th2);
                }
            }
        }
    }

    /* renamed from: n2.d$b */
    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i9 = message.what;
            if (i9 == 273) {
                AbstractC9758f.m16426a("--->>> handleMessage: recv MSG_PROCESS_NEXT msg.");
                try {
                    C9090d.f15314k.tryLock(1L, TimeUnit.SECONDS);
                    try {
                        C9090d.m14622y();
                    } catch (Throwable unused) {
                    }
                    C9090d.f15314k.unlock();
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            }
            if (i9 == 274) {
                C9090d.m14620w();
            } else {
                if (i9 != 512) {
                    return;
                }
                C9090d.m14621x();
            }
        }
    }

    /* renamed from: n2.d$c */
    public static class c extends FileObserver {
        public c(String str) {
            super(str);
        }

        @Override // android.os.FileObserver
        public void onEvent(int i9, String str) {
            if ((i9 & 8) != 8) {
                return;
            }
            AbstractC9758f.m16426a("--->>> envelope file created >>> " + str);
            AbstractC8959h.m14293c("MobclickRT", "--->>> envelope file created >>> " + str);
            C9090d.m14609k(273);
        }
    }

    public C9090d(Context context, Handler handler) {
        Context contextM14580b = AbstractC9087a.m14580b();
        f15308e = (ConnectivityManager) contextM14580b.getSystemService("connectivity");
        f15306c = handler;
        try {
            if (f15304a == null) {
                HandlerThread handlerThread = new HandlerThread("NetWorkSender");
                f15304a = handlerThread;
                handlerThread.start();
                if (f15307d == null) {
                    c cVar = new c(AbstractC6783b.m6283d(context));
                    f15307d = cVar;
                    cVar.startWatching();
                    AbstractC9758f.m16426a("--->>> FileMonitor has already started!");
                }
                if (AbstractC9754b.m16367b(contextM14580b, "android.permission.ACCESS_NETWORK_STATE") && f15308e != null && f15310g == null) {
                    IntentFilter intentFilter = new IntentFilter();
                    f15310g = intentFilter;
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    BroadcastReceiver broadcastReceiver = f15318o;
                    if (broadcastReceiver != null) {
                        contextM14580b.registerReceiver(broadcastReceiver, f15310g);
                    }
                }
                m14623v();
                if (f15305b == null) {
                    f15305b = new b(f15304a.getLooper());
                }
                C9802b.m16620u(context).m16635v("report_policy", this);
                C9802b.m16620u(context).m16635v("report_interval", this);
            }
        } catch (Throwable th) {
            AbstractC9318a.m15200b(context, th);
        }
    }

    /* renamed from: d */
    public static void m14602d(int i9, int i10) {
        Handler handler;
        if (!f15311h || (handler = f15305b) == null) {
            return;
        }
        handler.removeMessages(i9);
        Message messageObtainMessage = f15305b.obtainMessage();
        messageObtainMessage.what = i9;
        f15305b.sendMessageDelayed(messageObtainMessage, i10);
    }

    /* renamed from: e */
    public static void m14603e(InterfaceC9088b interfaceC9088b) {
        synchronized (f15313j) {
            try {
                if (f15312i == null) {
                    f15312i = new ArrayList();
                }
                if (interfaceC9088b != null) {
                    for (int i9 = 0; i9 < f15312i.size(); i9++) {
                        if (interfaceC9088b == f15312i.get(i9)) {
                            AbstractC8959h.m14293c("MobclickRT", "--->>> addConnStateObserver: input item has exist.");
                            return;
                        }
                    }
                    f15312i.add(interfaceC9088b);
                }
            } catch (Throwable th) {
                AbstractC9318a.m15200b(AbstractC9087a.m14580b(), th);
            }
        }
    }

    /* renamed from: f */
    public static boolean m14604f() {
        boolean z9;
        synchronized (f15317n) {
            z9 = f15315l;
        }
        return z9;
    }

    /* renamed from: h */
    public static int m14606h() {
        int i9;
        synchronized (f15317n) {
            i9 = f15316m;
        }
        return i9;
    }

    /* renamed from: i */
    public static void m14607i(int i9) {
        Handler handler;
        if (!f15311h || (handler = f15305b) == null || handler.hasMessages(i9)) {
            return;
        }
        Message messageObtainMessage = f15305b.obtainMessage();
        messageObtainMessage.what = i9;
        f15305b.sendMessage(messageObtainMessage);
    }

    /* renamed from: k */
    public static void m14609k(int i9) {
        Handler handler;
        if (!f15311h || (handler = f15305b) == null) {
            return;
        }
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.what = i9;
        f15305b.sendMessage(messageObtainMessage);
    }

    /* renamed from: l */
    public static void m14610l() {
        if (f15314k.tryLock()) {
            try {
                m14607i(273);
            } finally {
                f15314k.unlock();
            }
        }
    }

    /* renamed from: m */
    public static void m14611m() {
        m14602d(274, 3000);
    }

    /* renamed from: w */
    public static void m14620w() {
        int size;
        synchronized (f15313j) {
            try {
                ArrayList arrayList = f15312i;
                if (arrayList != null && (size = arrayList.size()) > 0) {
                    for (int i9 = 0; i9 < size; i9++) {
                        ((InterfaceC9088b) f15312i.get(i9)).mo12282b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: y */
    public static void m14622y() {
        AbstractC9758f.m16426a("--->>> handleProcessNext: Enter...");
        if (f15311h) {
            Context contextM14580b = AbstractC9087a.m14580b();
            try {
                if (AbstractC6783b.m6281b(contextM14580b) > 0) {
                    AbstractC9758f.m16426a("--->>> The envelope file exists.");
                    if (AbstractC6783b.m6281b(contextM14580b) > 200) {
                        AbstractC9758f.m16426a("--->>> Number of envelope files is greater than 200, remove old files first.");
                        AbstractC6783b.m6293n(contextM14580b, 200);
                    }
                    File fileM6284e = AbstractC6783b.m6284e(contextM14580b);
                    if (fileM6284e != null) {
                        String path = fileM6284e.getPath();
                        AbstractC9758f.m16426a("--->>> Ready to send envelope file [" + path + "].");
                        AbstractC8959h.m14293c("MobclickRT", "--->>> send envelope file [ " + path + "].");
                        if (!new C9671f(contextM14580b).m16129c(fileM6284e)) {
                            AbstractC9758f.m16426a("--->>> Send envelope file failed, abandon and wait next trigger!");
                            return;
                        }
                        AbstractC9758f.m16426a("--->>> Send envelope file success, delete it.");
                        if (!AbstractC6783b.m6292m(fileM6284e)) {
                            AbstractC9758f.m16426a("--->>> Failed to delete already processed file. We try again after delete failed.");
                            AbstractC6783b.m6292m(fileM6284e);
                        }
                        m14609k(273);
                        return;
                    }
                }
                m14611m();
            } catch (Throwable th) {
                AbstractC9318a.m15200b(contextM14580b, th);
            }
        }
    }

    @Override // p290x2.InterfaceC9868c
    /* renamed from: b */
    public void mo12451b(String str, String str2) {
        synchronized (f15317n) {
            try {
                if ("report_policy".equals(str)) {
                    if ("11".equals(str2)) {
                        AbstractC8959h.m14293c("MobclickRT", "--->>> switch to report_policy 11");
                        f15315l = true;
                    } else {
                        f15315l = false;
                    }
                }
                if ("report_interval".equals(str)) {
                    int iIntValue = Integer.valueOf(str2).intValue();
                    AbstractC8959h.m14293c("MobclickRT", "--->>> set report_interval value to: " + iIntValue);
                    if (iIntValue < 3 || iIntValue > 90) {
                        f15316m = 15000;
                    } else {
                        f15316m = iIntValue * 1000;
                    }
                    AbstractC8959h.m14293c("MobclickRT", "--->>> really set report_interval value to: " + f15316m);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: v */
    public final void m14623v() {
        synchronized (f15317n) {
            try {
                if ("11".equals(AbstractC6782a.m6274h(AbstractC9087a.m14580b(), "report_policy", ""))) {
                    AbstractC8959h.m14293c("MobclickRT", "--->>> switch to report_policy 11");
                    f15315l = true;
                    f15316m = 15;
                    int iIntValue = Integer.valueOf(AbstractC6782a.m6274h(AbstractC9087a.m14580b(), "report_interval", "15")).intValue();
                    AbstractC8959h.m14293c("MobclickRT", "--->>> set report_interval value to: " + iIntValue);
                    if (iIntValue < 3 || iIntValue > 90) {
                        f15316m = 15;
                    } else {
                        f15316m = iIntValue * 1000;
                    }
                } else {
                    f15315l = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: j */
    public static void m14608j() {
    }

    /* renamed from: x */
    public static void m14621x() {
    }
}
