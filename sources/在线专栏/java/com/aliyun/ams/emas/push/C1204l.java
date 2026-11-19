package com.aliyun.ams.emas.push;

import android.content.Context;
import com.alibaba.sdk.android.logger.ILog;
import com.aliyun.ams.emas.push.notification.CPushMessage;
import com.taobao.accs.utl.AccsLogger;
import java.util.Random;

/* renamed from: com.aliyun.ams.emas.push.l */
/* loaded from: classes.dex */
public class C1204l {

    /* renamed from: a */
    public static final ILog f6942a = AccsLogger.getLogger("[MPS]");

    /* renamed from: b */
    public static String f6943b = "com.alibaba.sdk.android.push.NOTIFY_ACTION";

    /* renamed from: c */
    private static Class<?> f6944c = null;

    /* renamed from: d */
    private static C1202j f6945d = null;

    /* renamed from: e */
    private static InterfaceC1196d f6946e = null;

    /* renamed from: f */
    private static int f6947f = 0;

    /* renamed from: g */
    private static int f6948g = 0;

    /* renamed from: h */
    private static Random f6949h = null;

    /* renamed from: a */
    public static Class<?> m5389a() {
        return f6944c;
    }

    /* renamed from: b */
    public static void m5390b(int i4, int i5, int i6, int i7, InterfaceC1193a interfaceC1193a) {
        f6945d.m5384a(i4, i5, i6, i7, interfaceC1193a);
    }

    /* renamed from: c */
    public static void m5391c(Context context) {
        f6945d = new C1202j(context.getApplicationContext());
    }

    /* renamed from: d */
    public static void m5392d(Context context, String str, int i4) {
        InterfaceC1196d interfaceC1196d = f6946e;
        if (interfaceC1196d != null) {
            interfaceC1196d.reportPushArrive(context, str, i4);
        }
    }

    /* renamed from: e */
    public static void m5393e(InterfaceC1196d interfaceC1196d) {
        f6946e = interfaceC1196d;
    }

    /* renamed from: f */
    public static void m5394f(CPushMessage cPushMessage) {
        f6945d.m5385b(cPushMessage);
    }

    /* renamed from: g */
    public static void m5395g(Class<?> cls) {
        f6944c = cls;
    }

    /* renamed from: h */
    public static void m5396h(boolean z3) {
        f6945d.m5386c(z3);
    }

    /* renamed from: i */
    public static void m5397i(CPushMessage cPushMessage) {
        f6945d.m5388e(cPushMessage);
    }

    /* renamed from: j */
    public static boolean m5398j() {
        return f6945d.m5387d();
    }

    /* renamed from: k */
    public static int m5399k() {
        if (f6948g == 0) {
            if (f6949h == null) {
                f6949h = new Random(System.currentTimeMillis());
            }
            int iNextInt = f6949h.nextInt(1000000);
            f6948g = iNextInt;
            if (iNextInt < 0) {
                f6948g = iNextInt * (-1);
            }
        }
        int i4 = f6948g;
        f6948g = i4 + 1;
        return i4;
    }

    /* renamed from: l */
    public static int m5400l() {
        if (f6947f == 0) {
            if (f6949h == null) {
                f6949h = new Random(System.currentTimeMillis());
            }
            int iNextInt = f6949h.nextInt(1000000);
            f6947f = iNextInt;
            if (iNextInt < 0) {
                f6947f = iNextInt * (-1);
            }
        }
        int i4 = f6947f;
        f6947f = i4 + 1;
        return i4;
    }
}
