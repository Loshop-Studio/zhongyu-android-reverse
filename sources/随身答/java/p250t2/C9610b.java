package p250t2;

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
import android.text.TextUtils;
import android.util.Base64;
import java.io.File;
import java.util.LinkedList;
import p004a3.AbstractC0034b;
import p176m2.AbstractC8959h;
import p210p2.AbstractC9318a;
import p260u2.AbstractC9668c;
import p270v2.AbstractC9754b;
import p270v2.AbstractC9758f;

/* renamed from: t2.b */
/* loaded from: classes4.dex */
public class C9610b {

    /* renamed from: a */
    public static Context f16884a = null;

    /* renamed from: b */
    public static HandlerThread f16885b = null;

    /* renamed from: c */
    public static Handler f16886c = null;

    /* renamed from: e */
    public static c f16888e = null;

    /* renamed from: f */
    public static IntentFilter f16889f = null;

    /* renamed from: g */
    public static boolean f16890g = false;

    /* renamed from: d */
    public static Object f16887d = new Object();

    /* renamed from: h */
    public static LinkedList f16891h = new LinkedList();

    /* renamed from: i */
    public static BroadcastReceiver f16892i = new a();

    /* renamed from: t2.b$a */
    public static class a extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ConnectivityManager connectivityManager;
            if (context == null || intent == null) {
                return;
            }
            try {
                if (intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    return;
                }
                Context unused = C9610b.f16884a = context.getApplicationContext();
                if (C9610b.f16884a == null || (connectivityManager = (ConnectivityManager) C9610b.f16884a.getSystemService("connectivity")) == null) {
                    return;
                }
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                    AbstractC8959h.m14292b("MobclickRT", "--->>>网络断连： 2号数据仓");
                    boolean unused2 = C9610b.f16890g = false;
                } else {
                    boolean unused3 = C9610b.f16890g = true;
                    AbstractC8959h.m14292b("MobclickRT", "--->>>网络可用： 触发2号数据仓信封消费动作。");
                    C9610b.m15873f(274);
                }
            } catch (Throwable th) {
                AbstractC9318a.m15200b(context, th);
            }
        }
    }

    /* renamed from: t2.b$b */
    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i9 = message.what;
            if (i9 != 512) {
                switch (i9) {
                    case 273:
                        C9610b.m15882o();
                        return;
                    case 274:
                        C9610b.m15884q();
                        return;
                    case 275:
                        C9610b.m15886s();
                        break;
                    default:
                        return;
                }
            }
            C9610b.m15887t();
        }
    }

    /* renamed from: t2.b$c */
    public static class c extends FileObserver {
        public c(String str) {
            super(str);
        }

        @Override // android.os.FileObserver
        public void onEvent(int i9, String str) {
            if ((i9 & 8) != 8) {
                return;
            }
            AbstractC8959h.m14293c("MobclickRT", "--->>> envelope file created >>> " + str);
            C9610b.m15869b(274);
        }
    }

    public C9610b(Context context) {
        synchronized (f16887d) {
            if (context != null) {
                try {
                    try {
                        Context applicationContext = context.getApplicationContext();
                        f16884a = applicationContext;
                        if (applicationContext != null && f16885b == null) {
                            HandlerThread handlerThread = new HandlerThread("SL-NetWorkSender");
                            f16885b = handlerThread;
                            handlerThread.start();
                            if (f16888e == null) {
                                String str = f16884a.getFilesDir() + File.separator + ".emitter";
                                File file = new File(str);
                                if (!file.exists()) {
                                    AbstractC8959h.m14292b("MobclickRT", "--->>> 2号数据仓目录不存在，创建之。");
                                    file.mkdir();
                                }
                                c cVar = new c(str);
                                f16888e = cVar;
                                cVar.startWatching();
                                AbstractC8959h.m14292b("MobclickRT", "--->>> 2号数据仓File Monitor启动.");
                            }
                            if (f16886c == null) {
                                f16886c = new b(f16885b.getLooper());
                            }
                            if (AbstractC9754b.m16367b(f16884a, "android.permission.ACCESS_NETWORK_STATE")) {
                                AbstractC9758f.m16434i("walle", "[stateless] begin register receiver");
                                if (f16889f == null) {
                                    IntentFilter intentFilter = new IntentFilter();
                                    f16889f = intentFilter;
                                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                                    if (f16892i != null) {
                                        AbstractC8959h.m14292b("MobclickRT", "--->>> 2号数据仓：注册网络状态监听器。");
                                        f16884a.registerReceiver(f16892i, f16889f);
                                    }
                                }
                            }
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                }
            }
        }
    }

    /* renamed from: b */
    public static void m15869b(int i9) {
        Handler handler;
        if (!f16890g || (handler = f16886c) == null) {
            return;
        }
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.what = i9;
        f16886c.sendMessage(messageObtainMessage);
    }

    /* renamed from: c */
    public static boolean m15870c() {
        synchronized (f16887d) {
            try {
                return f16888e != null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: e */
    public static void m15872e() {
        AbstractC8959h.m14292b("MobclickRT", "--->>>信封构建成功： 触发2号数据仓信封消费动作。");
        m15873f(274);
    }

    /* renamed from: f */
    public static void m15873f(int i9) {
        Handler handler;
        try {
            if (!f16890g || (handler = f16886c) == null || handler.hasMessages(i9)) {
                return;
            }
            Message messageObtainMessage = f16886c.obtainMessage();
            messageObtainMessage.what = i9;
            f16886c.sendMessage(messageObtainMessage);
        } catch (Throwable th) {
            AbstractC9318a.m15200b(f16884a, th);
        }
    }

    /* renamed from: g */
    public static void m15874g() {
        m15873f(275);
    }

    /* renamed from: m */
    public static void m15880m() {
        File[] fileArrM15900i = AbstractC9612d.m15900i(f16884a);
        if (fileArrM15900i != null) {
            if (f16891h.size() > 0) {
                f16891h.clear();
            }
            for (File file : fileArrM15900i) {
                f16891h.add(file.getAbsolutePath());
            }
        }
    }

    /* renamed from: n */
    public static void m15881n() {
        String str;
        byte[] bArrM15897f;
        if (f16891h.size() <= 0) {
            AbstractC8959h.m14292b("MobclickRT", "--->>> todoList无内容，无需处理。");
            return;
        }
        do {
            str = (String) f16891h.pollFirst();
            if (!TextUtils.isEmpty(str)) {
                File file = new File(str);
                if (file.exists()) {
                    C9611c c9611c = new C9611c(f16884a);
                    try {
                        bArrM15897f = AbstractC9612d.m15897f(str);
                    } catch (Exception unused) {
                        bArrM15897f = null;
                    }
                    String name = file.getName();
                    String strSubstring = !TextUtils.isEmpty(name) ? name.substring(0, 1) : "u";
                    String strM15901j = AbstractC9612d.m15901j(name);
                    String str2 = AbstractC9609a.f16882c;
                    String strM15899h = AbstractC9612d.m15899h(strM15901j);
                    if (AbstractC0034b.f112b.equalsIgnoreCase(strM15899h)) {
                        str2 = AbstractC0034b.f111a;
                    }
                    if (c9611c.m15889b(bArrM15897f, strM15899h, str2, strSubstring) && !file.delete()) {
                        file.delete();
                    }
                } else {
                    AbstractC8959h.m14292b("MobclickRT", "--->>> 信封文件不存在，处理下一个文件。");
                }
            }
        } while (str != null);
        f16891h.clear();
    }

    /* renamed from: o */
    public static void m15882o() {
        File fileM15893b;
        byte[] bArrM15897f;
        if (!f16890g || f16884a == null) {
            return;
        }
        do {
            try {
                fileM15893b = AbstractC9612d.m15893b(f16884a);
                if (fileM15893b != null && fileM15893b.getParentFile() != null && !TextUtils.isEmpty(fileM15893b.getParentFile().getName())) {
                    C9611c c9611c = new C9611c(f16884a);
                    String str = new String(Base64.decode(fileM15893b.getParentFile().getName(), 0));
                    if ("umpx_internal".equalsIgnoreCase(str) || "umpx_crash".equalsIgnoreCase(str) || "umpx_oplus_lbs".equalsIgnoreCase(str)) {
                        new File(fileM15893b.getAbsolutePath()).delete();
                    } else {
                        AbstractC9758f.m16434i("walle", "[stateless] handleProcessNext, pathUrl is " + str);
                        try {
                            bArrM15897f = AbstractC9612d.m15897f(fileM15893b.getAbsolutePath());
                        } catch (Exception unused) {
                            bArrM15897f = null;
                        }
                        String str2 = AbstractC0034b.f112b.equalsIgnoreCase(str) ? AbstractC0034b.f111a : "";
                        String str3 = AbstractC9668c.f17078e.equalsIgnoreCase(str) ? "s" : "u";
                        if (AbstractC9668c.f17080g.equalsIgnoreCase(str) || AbstractC9668c.f17079f.equalsIgnoreCase(str) || AbstractC9668c.f17081h.equalsIgnoreCase(str)) {
                            str3 = "p";
                        }
                        if (!c9611c.m15889b(bArrM15897f, str, str2, str3)) {
                            AbstractC9758f.m16434i("walle", "[stateless] Send envelope file failed, abandon and wait next trigger!");
                            return;
                        }
                        AbstractC9758f.m16434i("walle", "[stateless] Send envelope file success, delete it.");
                        File file = new File(fileM15893b.getAbsolutePath());
                        if (!file.delete()) {
                            AbstractC9758f.m16434i("walle", "[stateless] Failed to delete already processed file. We try again after delete failed.");
                            file.delete();
                        }
                    }
                }
            } catch (Throwable th) {
                AbstractC9318a.m15200b(f16884a, th);
            }
        } while (fileM15893b != null);
        m15883p();
    }

    /* renamed from: p */
    public static void m15883p() {
        try {
            File file = new File(f16884a.getFilesDir() + File.separator + "stateless");
            if (file.exists() && file.isDirectory()) {
                AbstractC8959h.m14292b("MobclickRT", "--->>> 2号数据仓：删除stateless目录。");
                AbstractC9612d.m15896e(file);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: q */
    public static void m15884q() {
        if (!f16890g || f16884a == null) {
            return;
        }
        m15880m();
        m15881n();
        m15874g();
    }

    /* renamed from: r */
    public static void m15885r() {
        try {
            File file = new File(f16884a.getFilesDir() + File.separator + "stateless");
            if (file.exists() && file.isDirectory()) {
                AbstractC8959h.m14292b("MobclickRT", "--->>>2号数据仓：检测到stateless目录。");
                m15873f(273);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: s */
    public static void m15886s() {
        m15885r();
    }

    /* renamed from: t */
    public static void m15887t() {
    }
}
