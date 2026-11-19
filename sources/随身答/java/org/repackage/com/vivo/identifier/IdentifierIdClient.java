package org.repackage.com.vivo.identifier;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.os.EnvironmentCompat;

/* loaded from: classes5.dex */
public class IdentifierIdClient {

    /* renamed from: A */
    private static String f16049A = null;

    /* renamed from: B */
    private static volatile IdentifierIdClient f16050B = null;

    /* renamed from: C */
    private static volatile DataBaseOperation f16051C = null;

    /* renamed from: a */
    private static final String f16052a = "VMS_IDLG_SDK_Client";

    /* renamed from: b */
    private static final String f16053b = "content://com.vivo.vms.IdProvider/IdentifierId";

    /* renamed from: c */
    private static final String f16054c = "persist.sys.identifierid.supported";

    /* renamed from: d */
    private static final String f16055d = "appid";

    /* renamed from: e */
    private static final String f16056e = "type";

    /* renamed from: f */
    private static final String f16057f = "OAID";

    /* renamed from: g */
    private static final String f16058g = "VAID";

    /* renamed from: h */
    private static final String f16059h = "AAID";

    /* renamed from: i */
    private static final int f16060i = 0;

    /* renamed from: j */
    private static final int f16061j = 1;

    /* renamed from: k */
    private static final int f16062k = 2;

    /* renamed from: l */
    private static final int f16063l = 4;

    /* renamed from: m */
    private static final int f16064m = 11;

    /* renamed from: n */
    private static final int f16065n = 2000;

    /* renamed from: o */
    private static Context f16066o = null;

    /* renamed from: p */
    private static boolean f16067p = false;

    /* renamed from: q */
    private static IdentifierIdObserver f16068q;

    /* renamed from: r */
    private static IdentifierIdObserver f16069r;

    /* renamed from: s */
    private static IdentifierIdObserver f16070s;

    /* renamed from: t */
    private static Object f16071t = new Object();

    /* renamed from: u */
    private static HandlerThread f16072u;

    /* renamed from: v */
    private static Handler f16073v;

    /* renamed from: w */
    private static String f16074w;

    /* renamed from: x */
    private static String f16075x;

    /* renamed from: y */
    private static String f16076y;

    /* renamed from: z */
    private static String f16077z;

    private IdentifierIdClient() {
    }

    /* renamed from: a */
    public static IdentifierIdClient m15109a(Context context) {
        if (f16050B == null) {
            synchronized (IdentifierIdClient.class) {
                f16066o = context.getApplicationContext();
                f16050B = new IdentifierIdClient();
            }
        }
        if (f16051C == null) {
            synchronized (IdentifierIdClient.class) {
                f16066o = context.getApplicationContext();
                m15116g();
                f16051C = new DataBaseOperation(f16066o);
                m15113d();
            }
        }
        return f16050B;
    }

    /* renamed from: d */
    public static void m15113d() {
        f16067p = "1".equals(m15108a(f16054c, "0"));
    }

    /* renamed from: g */
    private static void m15116g() {
        HandlerThread handlerThread = new HandlerThread("SqlWorkThread");
        f16072u = handlerThread;
        handlerThread.start();
        f16073v = new Handler(f16072u.getLooper()) { // from class: org.repackage.com.vivo.identifier.IdentifierIdClient.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what != 11) {
                    Log.e(IdentifierIdClient.f16052a, "message type valid");
                    return;
                }
                String unused = IdentifierIdClient.f16074w = IdentifierIdClient.f16051C.m15107a(message.getData().getInt("type"), message.getData().getString(IdentifierIdClient.f16055d));
                synchronized (IdentifierIdClient.f16071t) {
                    IdentifierIdClient.f16071t.notify();
                }
            }
        };
    }

    /* renamed from: b */
    public String m15120b() {
        if (!m15119a()) {
            return null;
        }
        String str = f16075x;
        if (str != null) {
            return str;
        }
        m15118a(0, (String) null);
        if (f16068q == null) {
            m15110a(f16066o, 0, null);
        }
        return f16075x;
    }

    /* renamed from: c */
    public String m15122c() {
        if (!m15119a()) {
            return null;
        }
        m15118a(4, (String) null);
        return f16049A;
    }

    /* renamed from: b */
    public String m15121b(String str) {
        if (!m15119a()) {
            return null;
        }
        String str2 = f16077z;
        if (str2 != null) {
            return str2;
        }
        m15118a(2, str);
        if (f16070s == null && f16077z != null) {
            m15110a(f16066o, 2, str);
        }
        return f16077z;
    }

    /* renamed from: b */
    private void m15111b(int i9, String str) {
        Message messageObtainMessage = f16073v.obtainMessage();
        messageObtainMessage.what = 11;
        Bundle bundle = new Bundle();
        bundle.putInt("type", i9);
        if (i9 == 1 || i9 == 2) {
            bundle.putString(f16055d, str);
        }
        messageObtainMessage.setData(bundle);
        f16073v.sendMessage(messageObtainMessage);
    }

    /* renamed from: a */
    public boolean m15119a() {
        return f16067p;
    }

    /* renamed from: a */
    public String m15117a(String str) {
        if (!m15119a()) {
            return null;
        }
        String str2 = f16076y;
        if (str2 != null) {
            return str2;
        }
        m15118a(1, str);
        if (f16069r == null && f16076y != null) {
            m15110a(f16066o, 1, str);
        }
        return f16076y;
    }

    /* renamed from: a */
    public void m15118a(int i9, String str) {
        synchronized (f16071t) {
            m15111b(i9, str);
            long jUptimeMillis = SystemClock.uptimeMillis();
            try {
                f16071t.wait(2000L);
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
            if (SystemClock.uptimeMillis() - jUptimeMillis < 2000) {
                if (i9 == 0) {
                    f16075x = f16074w;
                    f16074w = null;
                } else if (i9 != 1) {
                    if (i9 == 2) {
                        String str2 = f16074w;
                        if (str2 != null) {
                            f16077z = str2;
                            f16074w = null;
                        } else {
                            Log.e(f16052a, "get aaid failed");
                        }
                    } else if (i9 != 4) {
                    }
                    f16049A = f16074w;
                    f16074w = null;
                } else {
                    String str3 = f16074w;
                    if (str3 != null) {
                        f16076y = str3;
                        f16074w = null;
                    } else {
                        Log.e(f16052a, "get vaid failed");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static String m15108a(String str, String str2) {
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, EnvironmentCompat.MEDIA_UNKNOWN);
            } catch (Exception e10) {
                e10.printStackTrace();
                return str2;
            }
        } catch (Throwable unused) {
            return str2;
        }
    }

    /* renamed from: a */
    private static void m15110a(Context context, int i9, String str) {
        if (i9 == 0) {
            f16068q = new IdentifierIdObserver(f16050B, 0, null);
            context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), true, f16068q);
            return;
        }
        if (i9 == 1) {
            f16069r = new IdentifierIdObserver(f16050B, 1, str);
            context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/VAID_" + str), false, f16069r);
            return;
        }
        if (i9 != 2) {
            return;
        }
        f16070s = new IdentifierIdObserver(f16050B, 2, str);
        context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/AAID_" + str), false, f16070s);
    }
}
