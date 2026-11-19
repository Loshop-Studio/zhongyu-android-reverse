package p075i3;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.os.EnvironmentCompat;
import com.umeng.commonsdk.statistics.SdkVersion;

/* renamed from: i3.b */
/* loaded from: classes2.dex */
public class C3784b {

    /* renamed from: a */
    public static Context f4519a = null;

    /* renamed from: b */
    public static boolean f4520b = false;

    /* renamed from: c */
    public static C3785c f4521c;

    /* renamed from: d */
    public static C3785c f4522d;

    /* renamed from: e */
    public static C3785c f4523e;

    /* renamed from: f */
    public static Object f4524f = new Object();

    /* renamed from: g */
    public static HandlerThread f4525g;

    /* renamed from: h */
    public static Handler f4526h;

    /* renamed from: i */
    public static String f4527i;

    /* renamed from: j */
    public static String f4528j;

    /* renamed from: k */
    public static String f4529k;

    /* renamed from: l */
    public static String f4530l;

    /* renamed from: m */
    public static String f4531m;

    /* renamed from: n */
    public static volatile C3784b f4532n;

    /* renamed from: o */
    public static volatile C3783a f4533o;

    /* renamed from: i3.b$a */
    public static class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 11) {
                Log.e("VMS_IDLG_SDK_Client", "message type valid");
                return;
            }
            String unused = C3784b.f4527i = C3784b.f4533o.m4926a(message.getData().getInt("type"), message.getData().getString("appid"));
            synchronized (C3784b.f4524f) {
                C3784b.f4524f.notify();
            }
        }
    }

    /* renamed from: a */
    public static C3784b m4927a(Context context) {
        if (f4532n == null) {
            synchronized (C3784b.class) {
                f4519a = context.getApplicationContext();
                f4532n = new C3784b();
            }
        }
        if (f4533o == null) {
            synchronized (C3784b.class) {
                f4519a = context.getApplicationContext();
                m4934l();
                f4533o = new C3783a(f4519a);
                m4931i();
            }
        }
        return f4532n;
    }

    /* renamed from: b */
    public static String m4928b(String str, String str2) {
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, EnvironmentCompat.MEDIA_UNKNOWN);
            } catch (Exception e4) {
                e4.printStackTrace();
                return str2;
            }
        } catch (Throwable unused) {
            return str2;
        }
    }

    /* renamed from: d */
    public static void m4929d(Context context, int i4, String str) {
        if (i4 == 0) {
            f4521c = new C3785c(f4532n, 0, null);
            context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), true, f4521c);
            return;
        }
        if (i4 == 1) {
            f4522d = new C3785c(f4532n, 1, str);
            context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/VAID_" + str), false, f4522d);
            return;
        }
        if (i4 != 2) {
            return;
        }
        f4523e = new C3785c(f4532n, 2, str);
        context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/AAID_" + str), false, f4523e);
    }

    /* renamed from: i */
    public static void m4931i() {
        f4520b = SdkVersion.MINI_VERSION.equals(m4928b("persist.sys.identifierid.supported", "0"));
    }

    /* renamed from: l */
    public static void m4934l() {
        HandlerThread handlerThread = new HandlerThread("SqlWorkThread");
        f4525g = handlerThread;
        handlerThread.start();
        f4526h = new a(f4525g.getLooper());
    }

    /* renamed from: c */
    public void m4935c(int i4, String str) {
        synchronized (f4524f) {
            m4938g(i4, str);
            long jUptimeMillis = SystemClock.uptimeMillis();
            try {
                f4524f.wait(2000L);
            } catch (InterruptedException e4) {
                e4.printStackTrace();
            }
            if (SystemClock.uptimeMillis() - jUptimeMillis < 2000) {
                if (i4 == 0) {
                    f4528j = f4527i;
                    f4527i = null;
                } else if (i4 != 1) {
                    if (i4 == 2) {
                        String str2 = f4527i;
                        if (str2 != null) {
                            f4530l = str2;
                            f4527i = null;
                        } else {
                            Log.e("VMS_IDLG_SDK_Client", "get aaid failed");
                        }
                    } else if (i4 != 4) {
                    }
                    f4531m = f4527i;
                    f4527i = null;
                } else {
                    String str3 = f4527i;
                    if (str3 != null) {
                        f4529k = str3;
                        f4527i = null;
                    } else {
                        Log.e("VMS_IDLG_SDK_Client", "get vaid failed");
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public boolean m4936e() {
        return f4520b;
    }

    /* renamed from: f */
    public String m4937f() {
        if (!m4936e()) {
            return null;
        }
        String str = f4528j;
        if (str != null) {
            return str;
        }
        m4935c(0, null);
        if (f4521c == null) {
            m4929d(f4519a, 0, null);
        }
        return f4528j;
    }

    /* renamed from: g */
    public final void m4938g(int i4, String str) {
        Message messageObtainMessage = f4526h.obtainMessage();
        messageObtainMessage.what = 11;
        Bundle bundle = new Bundle();
        bundle.putInt("type", i4);
        if (i4 == 1 || i4 == 2) {
            bundle.putString("appid", str);
        }
        messageObtainMessage.setData(bundle);
        f4526h.sendMessage(messageObtainMessage);
    }
}
