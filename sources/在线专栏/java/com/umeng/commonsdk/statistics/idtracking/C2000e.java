package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.C1862at;
import com.umeng.analytics.pro.C1868az;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.statistics.proto.C2020a;
import com.umeng.commonsdk.statistics.proto.C2021b;
import com.umeng.commonsdk.statistics.proto.C2022c;
import com.umeng.commonsdk.utils.C2026b;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.e */
/* loaded from: classes.dex */
public class C2000e {

    /* renamed from: a */
    public static final long f9397a = 86400000;

    /* renamed from: b */
    public static C2000e f9398b = null;

    /* renamed from: c */
    private static final String f9399c = "umeng_it.cache";

    /* renamed from: j */
    private static Object f9400j = new Object();

    /* renamed from: d */
    private File f9401d;

    /* renamed from: f */
    private long f9403f;

    /* renamed from: i */
    private a f9406i;

    /* renamed from: e */
    private C2022c f9402e = null;

    /* renamed from: h */
    private Set<AbstractC1996a> f9405h = new HashSet();

    /* renamed from: g */
    private long f9404g = 86400000;

    /* renamed from: com.umeng.commonsdk.statistics.idtracking.e$a */
    public static class a {

        /* renamed from: a */
        private Context f9407a;

        /* renamed from: b */
        private Set<String> f9408b = new HashSet();

        public a(Context context) {
            this.f9407a = context;
        }

        /* renamed from: a */
        public synchronized boolean m7705a(String str) {
            return !this.f9408b.contains(str);
        }

        /* renamed from: b */
        public synchronized void m7707b(String str) {
            this.f9408b.add(str);
        }

        /* renamed from: c */
        public void m7708c(String str) {
            this.f9408b.remove(str);
        }

        /* renamed from: a */
        public synchronized void m7704a() {
            if (!this.f9408b.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                Iterator<String> it = this.f9408b.iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                    sb.append(',');
                }
                sb.deleteCharAt(sb.length() - 1);
                PreferenceWrapper.getDefault(this.f9407a).edit().putString("invld_id", sb.toString()).commit();
            }
        }

        /* renamed from: b */
        public synchronized void m7706b() {
            String[] strArrSplit;
            String string = PreferenceWrapper.getDefault(this.f9407a).getString("invld_id", null);
            if (!TextUtils.isEmpty(string) && (strArrSplit = string.split(",")) != null) {
                for (String str : strArrSplit) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f9408b.add(str);
                    }
                }
            }
        }
    }

    C2000e(Context context) {
        this.f9406i = null;
        this.f9401d = new File(context.getFilesDir(), f9399c);
        a aVar = new a(context);
        this.f9406i = aVar;
        aVar.m7706b();
    }

    /* renamed from: a */
    public static synchronized void m7691a() {
        C2000e c2000e = f9398b;
        if (c2000e != null) {
            c2000e.m7701e();
            f9398b = null;
        }
    }

    /* renamed from: h */
    private synchronized void m7695h() {
        C2022c c2022c = new C2022c();
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (AbstractC1996a abstractC1996a : this.f9405h) {
            if (abstractC1996a.m7686c()) {
                if (abstractC1996a.m7687d() != null) {
                    map.put(abstractC1996a.m7685b(), abstractC1996a.m7687d());
                }
                if (abstractC1996a.m7688e() != null && !abstractC1996a.m7688e().isEmpty()) {
                    arrayList.addAll(abstractC1996a.m7688e());
                }
            }
        }
        c2022c.m7825a(arrayList);
        c2022c.m7826a(map);
        synchronized (this) {
            this.f9402e = c2022c;
        }
    }

    /* renamed from: i */
    private C2022c m7696i() {
        Throwable th;
        FileInputStream fileInputStream;
        synchronized (f9400j) {
            if (!this.f9401d.exists()) {
                return null;
            }
            try {
                fileInputStream = new FileInputStream(this.f9401d);
                try {
                    try {
                        byte[] streamToByteArray = HelperUtils.readStreamToByteArray(fileInputStream);
                        C2022c c2022c = new C2022c();
                        new C1862at().m6911a(c2022c, streamToByteArray);
                        HelperUtils.safeClose(fileInputStream);
                        return c2022c;
                    } catch (Exception e4) {
                        e = e4;
                        e.printStackTrace();
                        HelperUtils.safeClose(fileInputStream);
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    HelperUtils.safeClose(fileInputStream);
                    throw th;
                }
            } catch (Exception e5) {
                e = e5;
                fileInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
                HelperUtils.safeClose(fileInputStream);
                throw th;
            }
        }
    }

    /* renamed from: b */
    public synchronized void m7698b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f9403f >= this.f9404g) {
            boolean z3 = false;
            for (AbstractC1996a abstractC1996a : this.f9405h) {
                if (abstractC1996a.m7686c() && abstractC1996a.m7684a()) {
                    z3 = true;
                    if (!abstractC1996a.m7686c()) {
                        this.f9406i.m7707b(abstractC1996a.m7685b());
                    }
                }
            }
            if (z3) {
                m7695h();
                this.f9406i.m7704a();
                m7703g();
            }
            this.f9403f = jCurrentTimeMillis;
        }
    }

    /* renamed from: c */
    public synchronized C2022c m7699c() {
        return this.f9402e;
    }

    /* renamed from: d */
    public String m7700d() {
        return null;
    }

    /* renamed from: e */
    public synchronized void m7701e() {
        if (f9398b == null) {
            return;
        }
        boolean z3 = false;
        for (AbstractC1996a abstractC1996a : this.f9405h) {
            if (abstractC1996a.m7686c() && abstractC1996a.m7688e() != null && !abstractC1996a.m7688e().isEmpty()) {
                abstractC1996a.m7683a((List<C2020a>) null);
                z3 = true;
            }
        }
        if (z3) {
            this.f9402e.m7831b(false);
            m7703g();
        }
    }

    /* renamed from: f */
    public synchronized void m7702f() {
        C2022c c2022cM7696i = m7696i();
        if (c2022cM7696i == null) {
            return;
        }
        m7692a(c2022cM7696i);
        ArrayList arrayList = new ArrayList(this.f9405h.size());
        synchronized (this) {
            this.f9402e = c2022cM7696i;
            for (AbstractC1996a abstractC1996a : this.f9405h) {
                abstractC1996a.m7682a(this.f9402e);
                if (!abstractC1996a.m7686c()) {
                    arrayList.add(abstractC1996a);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f9405h.remove((AbstractC1996a) it.next());
            }
            m7695h();
        }
    }

    /* renamed from: g */
    public synchronized void m7703g() {
        C2022c c2022c = this.f9402e;
        if (c2022c != null) {
            m7694b(c2022c);
        }
    }

    /* renamed from: a */
    public static synchronized C2000e m7690a(Context context) {
        if (f9398b == null) {
            C2000e c2000e = new C2000e(context);
            f9398b = c2000e;
            c2000e.m7693a(new C2001f(context));
            f9398b.m7693a(new C1997b(context));
            f9398b.m7693a(new C2007l(context));
            f9398b.m7693a(new C1999d(context));
            f9398b.m7693a(new C1998c(context));
            f9398b.m7693a(new C2002g(context));
            f9398b.m7693a(new C2006k());
            if (FieldManager.allow(C2026b.f9564G)) {
                f9398b.m7693a(new C2004i(context));
            }
            C2005j c2005j = new C2005j(context);
            if (c2005j.m7713g()) {
                f9398b.m7693a(c2005j);
                f9398b.m7693a(new C2003h(context));
                c2005j.m7715i();
            }
            f9398b.m7702f();
        }
        return f9398b;
    }

    /* renamed from: b */
    private void m7694b(C2022c c2022c) {
        byte[] bArrM6923a;
        synchronized (f9400j) {
            if (c2022c != null) {
                try {
                    synchronized (this) {
                        m7692a(c2022c);
                        bArrM6923a = new C1868az().m6923a(c2022c);
                    }
                    if (bArrM6923a != null) {
                        HelperUtils.writeFile(this.f9401d, bArrM6923a);
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m7693a(AbstractC1996a abstractC1996a) {
        if (this.f9406i.m7705a(abstractC1996a.m7685b())) {
            return this.f9405h.add(abstractC1996a);
        }
        if (!AnalyticsConstants.UM_DEBUG) {
            return false;
        }
        MLog.m7588w("invalid domain: " + abstractC1996a.m7685b());
        return false;
    }

    /* renamed from: a */
    public void m7697a(long j4) {
        this.f9404g = j4;
    }

    /* renamed from: a */
    private void m7692a(C2022c c2022c) {
        Map<String, C2021b> map;
        if (c2022c == null || (map = c2022c.f9499a) == null) {
            return;
        }
        if (map.containsKey("mac") && !FieldManager.allow(C2026b.f9604h)) {
            c2022c.f9499a.remove("mac");
        }
        if (c2022c.f9499a.containsKey(Constants.KEY_IMEI) && !FieldManager.allow(C2026b.f9603g)) {
            c2022c.f9499a.remove(Constants.KEY_IMEI);
        }
        if (c2022c.f9499a.containsKey("android_id") && !FieldManager.allow(C2026b.f9605i)) {
            c2022c.f9499a.remove("android_id");
        }
        if (c2022c.f9499a.containsKey("serial") && !FieldManager.allow(C2026b.f9606j)) {
            c2022c.f9499a.remove("serial");
        }
        if (c2022c.f9499a.containsKey("idfa") && !FieldManager.allow(C2026b.f9619w)) {
            c2022c.f9499a.remove("idfa");
        }
        if (!c2022c.f9499a.containsKey("oaid") || FieldManager.allow(C2026b.f9564G)) {
            return;
        }
        c2022c.f9499a.remove("oaid");
    }
}
