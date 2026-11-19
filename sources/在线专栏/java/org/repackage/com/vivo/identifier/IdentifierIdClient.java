package org.repackage.com.vivo.identifier;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.taobao.accs.utl.UtilityImpl;
import com.xuexiang.xui.widget.popupwindow.bar.Cookie;
import org.android.agoo.message.MessageService;

/* loaded from: classes.dex */
public class IdentifierIdClient {

    /* renamed from: A */
    private static String f11508A = null;

    /* renamed from: B */
    private static volatile IdentifierIdClient f11509B = null;

    /* renamed from: C */
    private static volatile DataBaseOperation f11510C = null;

    /* renamed from: a */
    private static final String f11511a = "VMS_IDLG_SDK_Client";

    /* renamed from: b */
    private static final String f11512b = "content://com.vivo.vms.IdProvider/IdentifierId";

    /* renamed from: c */
    private static final String f11513c = "persist.sys.identifierid.supported";

    /* renamed from: d */
    private static final String f11514d = "appid";

    /* renamed from: e */
    private static final String f11515e = "type";

    /* renamed from: f */
    private static final String f11516f = "OAID";

    /* renamed from: g */
    private static final String f11517g = "VAID";

    /* renamed from: h */
    private static final String f11518h = "AAID";

    /* renamed from: i */
    private static final int f11519i = 0;

    /* renamed from: j */
    private static final int f11520j = 1;

    /* renamed from: k */
    private static final int f11521k = 2;

    /* renamed from: l */
    private static final int f11522l = 4;

    /* renamed from: m */
    private static final int f11523m = 11;

    /* renamed from: n */
    private static final int f11524n = 2000;

    /* renamed from: o */
    private static Context f11525o = null;

    /* renamed from: p */
    private static boolean f11526p = false;

    /* renamed from: q */
    private static IdentifierIdObserver f11527q;

    /* renamed from: r */
    private static IdentifierIdObserver f11528r;

    /* renamed from: s */
    private static IdentifierIdObserver f11529s;

    /* renamed from: t */
    private static Object f11530t = new Object();

    /* renamed from: u */
    private static HandlerThread f11531u;

    /* renamed from: v */
    private static Handler f11532v;

    /* renamed from: w */
    private static String f11533w;

    /* renamed from: x */
    private static String f11534x;

    /* renamed from: y */
    private static String f11535y;

    /* renamed from: z */
    private static String f11536z;

    private IdentifierIdClient() {
    }

    /* renamed from: a */
    public static IdentifierIdClient m10062a(Context context) {
        if (f11509B == null) {
            synchronized (IdentifierIdClient.class) {
                f11525o = context.getApplicationContext();
                f11509B = new IdentifierIdClient();
            }
        }
        if (f11510C == null) {
            synchronized (IdentifierIdClient.class) {
                f11525o = context.getApplicationContext();
                m10069g();
                f11510C = new DataBaseOperation(f11525o);
                m10066d();
            }
        }
        return f11509B;
    }

    /* renamed from: d */
    public static void m10066d() {
        f11526p = "1".equals(m10061a(f11513c, MessageService.MSG_DB_READY_REPORT));
    }

    /* renamed from: g */
    private static void m10069g() {
        HandlerThread handlerThread = new HandlerThread("SqlWorkThread");
        f11531u = handlerThread;
        handlerThread.start();
        f11532v = new Handler(f11531u.getLooper()) { // from class: org.repackage.com.vivo.identifier.IdentifierIdClient.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what != 11) {
                    Log.e(IdentifierIdClient.f11511a, "message type valid");
                    return;
                }
                String unused = IdentifierIdClient.f11533w = IdentifierIdClient.f11510C.m10060a(message.getData().getInt("type"), message.getData().getString(IdentifierIdClient.f11514d));
                synchronized (IdentifierIdClient.f11530t) {
                    IdentifierIdClient.f11530t.notify();
                }
            }
        };
    }

    /* renamed from: b */
    public String m10073b() {
        if (!m10072a()) {
            return null;
        }
        String str = f11534x;
        if (str != null) {
            return str;
        }
        m10071a(0, (String) null);
        if (f11527q == null) {
            m10063a(f11525o, 0, null);
        }
        return f11534x;
    }

    /* renamed from: c */
    public String m10075c() {
        if (!m10072a()) {
            return null;
        }
        m10071a(4, (String) null);
        return f11508A;
    }

    /* renamed from: b */
    public String m10074b(String str) {
        if (!m10072a()) {
            return null;
        }
        String str2 = f11536z;
        if (str2 != null) {
            return str2;
        }
        m10071a(2, str);
        if (f11529s == null && f11536z != null) {
            m10063a(f11525o, 2, str);
        }
        return f11536z;
    }

    /* renamed from: b */
    private void m10064b(int i4, String str) {
        Message messageObtainMessage = f11532v.obtainMessage();
        messageObtainMessage.what = 11;
        Bundle bundle = new Bundle();
        bundle.putInt("type", i4);
        if (i4 == 1 || i4 == 2) {
            bundle.putString(f11514d, str);
        }
        messageObtainMessage.setData(bundle);
        f11532v.sendMessage(messageObtainMessage);
    }

    /* renamed from: a */
    public boolean m10072a() {
        return f11526p;
    }

    /* renamed from: a */
    public String m10070a(String str) {
        if (!m10072a()) {
            return null;
        }
        String str2 = f11535y;
        if (str2 != null) {
            return str2;
        }
        m10071a(1, str);
        if (f11528r == null && f11535y != null) {
            m10063a(f11525o, 1, str);
        }
        return f11535y;
    }

    /* renamed from: a */
    public void m10071a(int i4, String str) {
        synchronized (f11530t) {
            m10064b(i4, str);
            long jUptimeMillis = SystemClock.uptimeMillis();
            try {
                f11530t.wait(Cookie.DEFAULT_COOKIE_DURATION);
            } catch (InterruptedException e4) {
                e4.printStackTrace();
            }
            if (SystemClock.uptimeMillis() - jUptimeMillis >= Cookie.DEFAULT_COOKIE_DURATION) {
                Log.d(f11511a, "query timeout");
            } else if (i4 == 0) {
                f11534x = f11533w;
                f11533w = null;
            } else if (i4 != 1) {
                if (i4 == 2) {
                    String str2 = f11533w;
                    if (str2 != null) {
                        f11536z = str2;
                        f11533w = null;
                    } else {
                        Log.e(f11511a, "get aaid failed");
                    }
                } else if (i4 != 4) {
                }
                f11508A = f11533w;
                f11533w = null;
            } else {
                String str3 = f11533w;
                if (str3 != null) {
                    f11535y = str3;
                    f11533w = null;
                } else {
                    Log.e(f11511a, "get vaid failed");
                }
            }
        }
    }

    /* renamed from: a */
    public static String m10061a(String str, String str2) {
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, UtilityImpl.NET_TYPE_UNKNOWN);
            } catch (Exception e4) {
                e4.printStackTrace();
                return str2;
            }
        } catch (Throwable unused) {
            return str2;
        }
    }

    /* renamed from: a */
    private static void m10063a(Context context, int i4, String str) {
        if (i4 == 0) {
            f11527q = new IdentifierIdObserver(f11509B, 0, null);
            context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), true, f11527q);
            return;
        }
        if (i4 == 1) {
            f11528r = new IdentifierIdObserver(f11509B, 1, str);
            context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/VAID_" + str), false, f11528r);
            return;
        }
        if (i4 != 2) {
            return;
        }
        f11529s = new IdentifierIdObserver(f11509B, 2, str);
        context.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/AAID_" + str), false, f11529s);
    }
}
