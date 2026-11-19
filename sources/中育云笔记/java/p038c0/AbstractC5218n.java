package p038c0;

import android.content.Context;
import com.alibaba.sdk.android.logger.ILog;
import com.aliyun.ams.emas.push.notification.CPushMessage;
import com.taobao.accs.utl.AccsLogger;
import java.util.Random;

/* renamed from: c0.n */
/* loaded from: classes3.dex */
public abstract class AbstractC5218n {

    /* renamed from: a */
    public static final ILog f3101a = AccsLogger.getLogger("[MPS]");

    /* renamed from: b */
    public static String f3102b = "com.alibaba.sdk.android.push.NOTIFY_ACTION";

    /* renamed from: c */
    public static Class f3103c = null;

    /* renamed from: d */
    public static C5216l f3104d = null;

    /* renamed from: e */
    public static InterfaceC5210f f3105e = null;

    /* renamed from: f */
    public static int f3106f = 0;

    /* renamed from: g */
    public static int f3107g = 0;

    /* renamed from: h */
    public static Random f3108h = null;

    /* renamed from: a */
    public static Class m2784a() {
        return f3103c;
    }

    /* renamed from: b */
    public static void m2785b(int i10, int i11, int i12, int i13, InterfaceC5207c interfaceC5207c) {
        f3104d.m2779a(i10, i11, i12, i13, interfaceC5207c);
    }

    /* renamed from: c */
    public static void m2786c(Context context) {
        f3104d = new C5216l(context.getApplicationContext());
    }

    /* renamed from: d */
    public static void m2787d(Context context, String str, int i10) {
        InterfaceC5210f interfaceC5210f = f3105e;
        if (interfaceC5210f != null) {
            interfaceC5210f.reportPushArrive(context, str, i10);
        }
    }

    /* renamed from: e */
    public static void m2788e(InterfaceC5210f interfaceC5210f) {
        f3105e = interfaceC5210f;
    }

    /* renamed from: f */
    public static void m2789f(CPushMessage cPushMessage) {
        f3104d.m2780b(cPushMessage);
    }

    /* renamed from: g */
    public static void m2790g(Class cls) {
        f3103c = cls;
    }

    /* renamed from: h */
    public static void m2791h(boolean z10) {
        f3104d.m2781c(z10);
    }

    /* renamed from: i */
    public static void m2792i(CPushMessage cPushMessage) {
        f3104d.m2783e(cPushMessage);
    }

    /* renamed from: j */
    public static boolean m2793j() {
        return f3104d.m2782d();
    }

    /* renamed from: k */
    public static int m2794k() {
        if (f3107g == 0) {
            if (f3108h == null) {
                f3108h = new Random(System.currentTimeMillis());
            }
            int iNextInt = f3108h.nextInt(1000000);
            f3107g = iNextInt;
            if (iNextInt < 0) {
                f3107g = iNextInt * (-1);
            }
        }
        int i10 = f3107g;
        f3107g = i10 + 1;
        return i10;
    }

    /* renamed from: l */
    public static int m2795l() {
        if (f3106f == 0) {
            if (f3108h == null) {
                f3108h = new Random(System.currentTimeMillis());
            }
            int iNextInt = f3108h.nextInt(1000000);
            f3106f = iNextInt;
            if (iNextInt < 0) {
                f3106f = iNextInt * (-1);
            }
        }
        int i10 = f3106f;
        f3106f = i10 + 1;
        return i10;
    }
}
