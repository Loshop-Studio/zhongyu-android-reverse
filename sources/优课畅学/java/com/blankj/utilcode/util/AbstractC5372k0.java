package com.blankj.utilcode.util;

import android.app.Activity;
import android.app.Application;
import android.app.Notification;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.blankj.utilcode.util.AbstractC5366h0;
import com.blankj.utilcode.util.AbstractC5384u;
import com.google.gson.Gson;
import java.io.File;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.blankj.utilcode.util.k0 */
/* loaded from: classes3.dex */
public abstract class AbstractC5372k0 {

    /* renamed from: com.blankj.utilcode.util.k0$a */
    public static final class a {

        /* renamed from: a */
        public String f2727a;

        /* renamed from: b */
        public LinkedHashMap f2728b = new LinkedHashMap();

        /* renamed from: c */
        public LinkedHashMap f2729c = new LinkedHashMap();

        public a(String str) {
            this.f2727a = str;
        }

        /* renamed from: a */
        public void m2571a(String str, String str2) {
            m2572b(this.f2728b, str, str2);
        }

        /* renamed from: b */
        public final void m2572b(Map map, String str, String str2) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            int length = 19 - str.length();
            if (length > 0) {
                str = str + "                   ".substring(0, length);
            }
            map.put(str, str2);
        }

        /* renamed from: c */
        public String m2573c() {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : this.f2729c.entrySet()) {
                sb.append((String) entry.getKey());
                sb.append(": ");
                sb.append((String) entry.getValue());
                sb.append(SignParameters.NEW_LINE);
            }
            return sb.toString();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = "************* " + this.f2727a + " Head ****************\n";
            sb.append(str);
            for (Map.Entry entry : this.f2728b.entrySet()) {
                sb.append((String) entry.getKey());
                sb.append(": ");
                sb.append((String) entry.getValue());
                sb.append(SignParameters.NEW_LINE);
            }
            sb.append("Rom Info           : ");
            sb.append(AbstractC5387x.m2675c());
            sb.append(SignParameters.NEW_LINE);
            sb.append("Device Manufacturer: ");
            sb.append(Build.MANUFACTURER);
            sb.append(SignParameters.NEW_LINE);
            sb.append("Device Model       : ");
            sb.append(Build.MODEL);
            sb.append(SignParameters.NEW_LINE);
            sb.append("Android Version    : ");
            sb.append(Build.VERSION.RELEASE);
            sb.append(SignParameters.NEW_LINE);
            sb.append("Android SDK        : ");
            sb.append(Build.VERSION.SDK_INT);
            sb.append(SignParameters.NEW_LINE);
            sb.append("App VersionName    : ");
            sb.append(AbstractC5357d.m2439e());
            sb.append(SignParameters.NEW_LINE);
            sb.append("App VersionCode    : ");
            sb.append(AbstractC5357d.m2437c());
            sb.append(SignParameters.NEW_LINE);
            sb.append(m2573c());
            sb.append(str);
            sb.append(SignParameters.NEW_LINE);
            return sb.toString();
        }
    }

    /* renamed from: A */
    public static boolean m2530A() {
        return AbstractC5385v.m2668a();
    }

    /* renamed from: B */
    public static boolean m2531B() {
        return AbstractC5374l0.m2575a();
    }

    /* renamed from: C */
    public static boolean m2532C() {
        return AbstractC5388y.m2684a();
    }

    /* renamed from: D */
    public static boolean m2533D(String str) {
        return AbstractC5358d0.m2444d(str);
    }

    /* renamed from: E */
    public static boolean m2534E(View view, long j10) {
        return AbstractC5365h.m2476b(view, j10);
    }

    /* renamed from: F */
    public static View m2535F(int i10) {
        return AbstractC5374l0.m2576b(i10);
    }

    /* renamed from: G */
    public static void m2536G() {
        m2537H(AbstractC5353b.m2429f());
    }

    /* renamed from: H */
    public static void m2537H(Runnable... runnableArr) {
        for (Runnable runnable : runnableArr) {
            ThreadUtils.m2376b().execute(runnable);
        }
    }

    /* renamed from: I */
    public static void m2538I(AbstractC5366h0.a aVar) {
        C5370j0.f2709g.m2515s(aVar);
    }

    /* renamed from: J */
    public static void m2539J(Runnable runnable) {
        ThreadUtils.m2379e(runnable);
    }

    /* renamed from: K */
    public static void m2540K(Runnable runnable, long j10) {
        ThreadUtils.m2380f(runnable, j10);
    }

    /* renamed from: L */
    public static void m2541L(Application application) {
        C5370j0.f2709g.m2518w(application);
    }

    /* renamed from: M */
    public static Bitmap m2542M(View view) {
        return AbstractC5375m.m2580d(view);
    }

    /* renamed from: N */
    public static boolean m2543N(String str, InputStream inputStream) {
        return AbstractC5369j.m2492b(str, inputStream);
    }

    /* renamed from: O */
    public static boolean m2544O(String str, String str2, boolean z10) {
        return AbstractC5369j.m2494d(str, str2, z10);
    }

    /* renamed from: a */
    public static void m2545a(AbstractC5366h0.a aVar) {
        C5370j0.f2709g.m2500d(aVar);
    }

    /* renamed from: b */
    public static String m2546b(byte[] bArr) {
        return AbstractC5363g.m2465a(bArr);
    }

    /* renamed from: c */
    public static boolean m2547c(File file) {
        return AbstractC5371k.m2519a(file);
    }

    /* renamed from: d */
    public static boolean m2548d(File file) {
        return AbstractC5371k.m2520b(file);
    }

    /* renamed from: e */
    public static boolean m2549e(File file) {
        return AbstractC5371k.m2521c(file);
    }

    /* renamed from: f */
    public static int m2550f(float f10) {
        return AbstractC5356c0.m2434a(f10);
    }

    /* renamed from: g */
    public static void m2551g() {
        AbstractC5351a.m2419a();
    }

    /* renamed from: h */
    public static void m2552h(Activity activity) {
        KeyboardUtils.m2342a(activity);
    }

    /* renamed from: i */
    public static String m2553i(String str, Object... objArr) {
        return AbstractC5358d0.m2441a(str, objArr);
    }

    /* renamed from: j */
    public static String m2554j(String str) {
        return AbstractC5377n.m2587a(str);
    }

    /* renamed from: k */
    public static List m2555k() {
        return C5370j0.f2709g.m2505i();
    }

    /* renamed from: l */
    public static int m2556l() {
        return AbstractC5352a0.m2422a();
    }

    /* renamed from: m */
    public static Application m2557m() {
        return C5370j0.f2709g.m2509m();
    }

    /* renamed from: n */
    public static String m2558n() {
        return AbstractC5386w.m2669a();
    }

    /* renamed from: o */
    public static File m2559o(String str) {
        return AbstractC5371k.m2525g(str);
    }

    /* renamed from: p */
    public static String m2560p(Throwable th) {
        return AbstractC5360e0.m2447a(th);
    }

    /* renamed from: q */
    public static Gson m2561q() {
        return AbstractC5373l.m2574a();
    }

    /* renamed from: r */
    public static int m2562r() {
        return AbstractC5359e.m2445a();
    }

    /* renamed from: s */
    public static Notification m2563s(AbstractC5384u.a aVar, AbstractC5366h0.b bVar) {
        return AbstractC5384u.m2665a(aVar, bVar);
    }

    /* renamed from: t */
    public static C5389z m2564t() {
        return C5389z.m2685f("Utils");
    }

    /* renamed from: u */
    public static int m2565u() {
        return AbstractC5359e.m2446b();
    }

    /* renamed from: v */
    public static String m2566v(int i10) {
        return AbstractC5358d0.m2442b(i10);
    }

    /* renamed from: w */
    public static void m2567w(Application application) {
        C5370j0.f2709g.m2510n(application);
    }

    /* renamed from: x */
    public static boolean m2568x(Activity activity) {
        return AbstractC5351a.m2421c(activity);
    }

    /* renamed from: y */
    public static boolean m2569y() {
        return C5370j0.f2709g.m2511o();
    }

    /* renamed from: z */
    public static boolean m2570z(File file) {
        return AbstractC5371k.m2527i(file);
    }
}
