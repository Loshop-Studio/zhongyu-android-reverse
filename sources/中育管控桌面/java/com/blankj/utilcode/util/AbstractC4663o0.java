package com.blankj.utilcode.util;

import android.app.Activity;
import android.app.Application;
import android.app.Notification;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.blankj.utilcode.util.AbstractC4657l0;
import com.blankj.utilcode.util.AbstractC4673x;
import com.google.gson.Gson;
import java.io.File;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.blankj.utilcode.util.o0 */
/* loaded from: classes3.dex */
public abstract class AbstractC4663o0 {

    /* renamed from: com.blankj.utilcode.util.o0$a */
    public static final class a {

        /* renamed from: a */
        public String f2108a;

        /* renamed from: b */
        public LinkedHashMap f2109b = new LinkedHashMap();

        /* renamed from: c */
        public LinkedHashMap f2110c = new LinkedHashMap();

        public a(String str) {
            this.f2108a = str;
        }

        /* renamed from: a */
        public void m2342a(String str, String str2) {
            m2343b(this.f2109b, str, str2);
        }

        /* renamed from: b */
        public final void m2343b(Map map, String str, String str2) {
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
        public String m2344c() {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : this.f2110c.entrySet()) {
                sb.append((String) entry.getKey());
                sb.append(": ");
                sb.append((String) entry.getValue());
                sb.append(SignParameters.NEW_LINE);
            }
            return sb.toString();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = "************* " + this.f2108a + " Head ****************\n";
            sb.append(str);
            for (Map.Entry entry : this.f2109b.entrySet()) {
                sb.append((String) entry.getKey());
                sb.append(": ");
                sb.append((String) entry.getValue());
                sb.append(SignParameters.NEW_LINE);
            }
            sb.append("Rom Info           : ");
            sb.append(AbstractC4637b0.m2137c());
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
            sb.append(AbstractC4640d.m2153g());
            sb.append(SignParameters.NEW_LINE);
            sb.append("App VersionCode    : ");
            sb.append(AbstractC4640d.m2151e());
            sb.append(SignParameters.NEW_LINE);
            sb.append(m2344c());
            sb.append(str);
            sb.append(SignParameters.NEW_LINE);
            return sb.toString();
        }
    }

    /* renamed from: A */
    public static boolean m2298A(Activity activity) {
        return AbstractC4634a.m2119h(activity);
    }

    /* renamed from: B */
    public static boolean m2299B() {
        return C4661n0.f2091g.m2289p();
    }

    /* renamed from: C */
    public static boolean m2300C(File file) {
        return AbstractC4656l.m2246x(file);
    }

    /* renamed from: D */
    public static boolean m2301D() {
        return AbstractC4675z.m2441a();
    }

    /* renamed from: E */
    public static boolean m2302E() {
        return AbstractC4665p0.m2347a();
    }

    /* renamed from: F */
    public static boolean m2303F() {
        return AbstractC4639c0.m2146a();
    }

    /* renamed from: G */
    public static boolean m2304G(String str) {
        return AbstractC4649h0.m2193d(str);
    }

    /* renamed from: H */
    public static boolean m2305H(View view, long j6) {
        return AbstractC4648h.m2188b(view, j6);
    }

    /* renamed from: I */
    public static View m2306I(int i6) {
        return AbstractC4665p0.m2348b(i6);
    }

    /* renamed from: J */
    public static void m2307J() {
        m2308K(AbstractC4636b.m2133f());
    }

    /* renamed from: K */
    public static void m2308K(Runnable... runnableArr) {
        for (Runnable runnable : runnableArr) {
            ThreadUtils.m2070b().execute(runnable);
        }
    }

    /* renamed from: L */
    public static void m2309L(AbstractC4657l0.a aVar) {
        C4661n0.f2091g.m2293t(aVar);
    }

    /* renamed from: M */
    public static void m2310M(Runnable runnable) {
        ThreadUtils.m2073e(runnable);
    }

    /* renamed from: N */
    public static void m2311N(Runnable runnable, long j6) {
        ThreadUtils.m2074f(runnable, j6);
    }

    /* renamed from: O */
    public static void m2312O(Application application) {
        C4661n0.f2091g.m2296x(application);
    }

    /* renamed from: P */
    public static Bitmap m2313P(View view) {
        return AbstractC4660n.m2272f(view);
    }

    /* renamed from: Q */
    public static boolean m2314Q(String str, InputStream inputStream) {
        return AbstractC4654k.m2214f(str, inputStream);
    }

    /* renamed from: R */
    public static boolean m2315R(String str, String str2, boolean z6) {
        return AbstractC4654k.m2216h(str, str2, z6);
    }

    /* renamed from: a */
    public static void m2316a(AbstractC4657l0.a aVar) {
        C4661n0.f2091g.m2277d(aVar);
    }

    /* renamed from: b */
    public static String m2317b(long j6) {
        return AbstractC4646g.m2181a(j6);
    }

    /* renamed from: c */
    public static String m2318c(byte[] bArr) {
        return AbstractC4646g.m2183c(bArr);
    }

    /* renamed from: d */
    public static boolean m2319d(File file) {
        return AbstractC4656l.m2229g(file);
    }

    /* renamed from: e */
    public static boolean m2320e(File file) {
        return AbstractC4656l.m2230h(file);
    }

    /* renamed from: f */
    public static boolean m2321f(File file) {
        return AbstractC4656l.m2231i(file);
    }

    /* renamed from: g */
    public static int m2322g(float f6) {
        return AbstractC4647g0.m2186a(f6);
    }

    /* renamed from: h */
    public static void m2323h() {
        AbstractC4634a.m2114c();
    }

    /* renamed from: i */
    public static void m2324i(Activity activity) {
        AbstractC4666q.m2349a(activity);
    }

    /* renamed from: j */
    public static String m2325j(String str, Object... objArr) {
        return AbstractC4649h0.m2190a(str, objArr);
    }

    /* renamed from: k */
    public static String m2326k(String str) {
        return AbstractC4664p.m2345a(str);
    }

    /* renamed from: l */
    public static List m2327l() {
        return C4661n0.f2091g.m2282i();
    }

    /* renamed from: m */
    public static int m2328m() {
        return AbstractC4643e0.m2169a();
    }

    /* renamed from: n */
    public static Application m2329n() {
        return C4661n0.f2091g.m2286m();
    }

    /* renamed from: o */
    public static String m2330o() {
        return AbstractC4635a0.m2124a();
    }

    /* renamed from: p */
    public static File m2331p(String str) {
        return AbstractC4656l.m2239q(str);
    }

    /* renamed from: q */
    public static String m2332q(Throwable th) {
        return AbstractC4651i0.m2195a(th);
    }

    /* renamed from: r */
    public static Gson m2333r() {
        return AbstractC4658m.m2262e();
    }

    /* renamed from: s */
    public static Intent m2334s(String str) {
        return AbstractC4662o.m2297a(str);
    }

    /* renamed from: t */
    public static String m2335t(String str) {
        return AbstractC4634a.m2116e(str);
    }

    /* renamed from: u */
    public static int m2336u() {
        return AbstractC4642e.m2167a();
    }

    /* renamed from: v */
    public static Notification m2337v(AbstractC4673x.a aVar, AbstractC4657l0.b bVar) {
        return AbstractC4673x.m2436a(aVar, bVar);
    }

    /* renamed from: w */
    public static C4641d0 m2338w() {
        return C4641d0.m2158b("Utils");
    }

    /* renamed from: x */
    public static int m2339x() {
        return AbstractC4642e.m2168b();
    }

    /* renamed from: y */
    public static Activity m2340y() {
        return C4661n0.f2091g.m2287n();
    }

    /* renamed from: z */
    public static void m2341z(Application application) {
        C4661n0.f2091g.m2288o(application);
    }
}
