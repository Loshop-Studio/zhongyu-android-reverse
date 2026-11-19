package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.C3346at;
import com.umeng.analytics.pro.C3352az;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.statistics.proto.C3504a;
import com.umeng.commonsdk.statistics.proto.C3505b;
import com.umeng.commonsdk.statistics.proto.C3506c;
import com.umeng.commonsdk.utils.C3510b;
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
/* loaded from: classes2.dex */
public class C3484e {

    /* renamed from: a */
    public static final long f2805a = 86400000;

    /* renamed from: b */
    public static C3484e f2806b = null;

    /* renamed from: c */
    private static final String f2807c = "umeng_it.cache";

    /* renamed from: j */
    private static Object f2808j = new Object();

    /* renamed from: d */
    private File f2809d;

    /* renamed from: f */
    private long f2811f;

    /* renamed from: i */
    private a f2814i;

    /* renamed from: e */
    private C3506c f2810e = null;

    /* renamed from: h */
    private Set<AbstractC3480a> f2813h = new HashSet();

    /* renamed from: g */
    private long f2812g = 86400000;

    /* renamed from: com.umeng.commonsdk.statistics.idtracking.e$a */
    public static class a {

        /* renamed from: a */
        private Context f2815a;

        /* renamed from: b */
        private Set<String> f2816b = new HashSet();

        public a(Context context) {
            this.f2815a = context;
        }

        /* renamed from: a */
        public synchronized boolean m3782a(String str) {
            return !this.f2816b.contains(str);
        }

        /* renamed from: b */
        public synchronized void m3784b(String str) {
            this.f2816b.add(str);
        }

        /* renamed from: c */
        public void m3785c(String str) {
            this.f2816b.remove(str);
        }

        /* renamed from: a */
        public synchronized void m3781a() {
            if (!this.f2816b.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                Iterator<String> it = this.f2816b.iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                    sb.append(',');
                }
                sb.deleteCharAt(sb.length() - 1);
                PreferenceWrapper.getDefault(this.f2815a).edit().putString("invld_id", sb.toString()).commit();
            }
        }

        /* renamed from: b */
        public synchronized void m3783b() {
            String[] strArrSplit;
            String string = PreferenceWrapper.getDefault(this.f2815a).getString("invld_id", null);
            if (!TextUtils.isEmpty(string) && (strArrSplit = string.split(",")) != null) {
                for (String str : strArrSplit) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f2816b.add(str);
                    }
                }
            }
        }
    }

    public C3484e(Context context) {
        this.f2814i = null;
        this.f2809d = new File(context.getFilesDir(), f2807c);
        a aVar = new a(context);
        this.f2814i = aVar;
        aVar.m3783b();
    }

    /* renamed from: a */
    public static synchronized void m3768a() {
        C3484e c3484e = f2806b;
        if (c3484e != null) {
            c3484e.m3778e();
            f2806b = null;
        }
    }

    /* renamed from: h */
    private synchronized void m3772h() {
        C3506c c3506c = new C3506c();
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (AbstractC3480a abstractC3480a : this.f2813h) {
            if (abstractC3480a.m3763c()) {
                if (abstractC3480a.m3764d() != null) {
                    map.put(abstractC3480a.m3762b(), abstractC3480a.m3764d());
                }
                if (abstractC3480a.m3765e() != null && !abstractC3480a.m3765e().isEmpty()) {
                    arrayList.addAll(abstractC3480a.m3765e());
                }
            }
        }
        c3506c.m3902a(arrayList);
        c3506c.m3903a(map);
        synchronized (this) {
            this.f2810e = c3506c;
        }
    }

    /* renamed from: i */
    private C3506c m3773i() {
        Throwable th;
        FileInputStream fileInputStream;
        synchronized (f2808j) {
            if (!this.f2809d.exists()) {
                return null;
            }
            try {
                fileInputStream = new FileInputStream(this.f2809d);
                try {
                    try {
                        byte[] streamToByteArray = HelperUtils.readStreamToByteArray(fileInputStream);
                        C3506c c3506c = new C3506c();
                        new C3346at().m2988a(c3506c, streamToByteArray);
                        HelperUtils.safeClose(fileInputStream);
                        return c3506c;
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
    public synchronized void m3775b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f2811f >= this.f2812g) {
            boolean z3 = false;
            for (AbstractC3480a abstractC3480a : this.f2813h) {
                if (abstractC3480a.m3763c() && abstractC3480a.m3761a()) {
                    if (!abstractC3480a.m3763c()) {
                        this.f2814i.m3784b(abstractC3480a.m3762b());
                    }
                    z3 = true;
                }
            }
            if (z3) {
                m3772h();
                this.f2814i.m3781a();
                m3780g();
            }
            this.f2811f = jCurrentTimeMillis;
        }
    }

    /* renamed from: c */
    public synchronized C3506c m3776c() {
        return this.f2810e;
    }

    /* renamed from: d */
    public String m3777d() {
        return null;
    }

    /* renamed from: e */
    public synchronized void m3778e() {
        if (f2806b == null) {
            return;
        }
        boolean z3 = false;
        for (AbstractC3480a abstractC3480a : this.f2813h) {
            if (abstractC3480a.m3763c() && abstractC3480a.m3765e() != null && !abstractC3480a.m3765e().isEmpty()) {
                abstractC3480a.m3760a((List<C3504a>) null);
                z3 = true;
            }
        }
        if (z3) {
            this.f2810e.m3908b(false);
            m3780g();
        }
    }

    /* renamed from: f */
    public synchronized void m3779f() {
        C3506c c3506cM3773i = m3773i();
        if (c3506cM3773i == null) {
            return;
        }
        m3769a(c3506cM3773i);
        ArrayList arrayList = new ArrayList(this.f2813h.size());
        synchronized (this) {
            this.f2810e = c3506cM3773i;
            for (AbstractC3480a abstractC3480a : this.f2813h) {
                abstractC3480a.m3759a(this.f2810e);
                if (!abstractC3480a.m3763c()) {
                    arrayList.add(abstractC3480a);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f2813h.remove((AbstractC3480a) it.next());
            }
            m3772h();
        }
    }

    /* renamed from: g */
    public synchronized void m3780g() {
        C3506c c3506c = this.f2810e;
        if (c3506c != null) {
            m3771b(c3506c);
        }
    }

    /* renamed from: a */
    public static synchronized C3484e m3767a(Context context) {
        if (f2806b == null) {
            C3484e c3484e = new C3484e(context);
            f2806b = c3484e;
            c3484e.m3770a(new C3485f(context));
            f2806b.m3770a(new C3481b(context));
            f2806b.m3770a(new C3491l(context));
            f2806b.m3770a(new C3483d(context));
            f2806b.m3770a(new C3482c(context));
            f2806b.m3770a(new C3486g(context));
            f2806b.m3770a(new C3490k());
            if (FieldManager.allow(C3510b.f2972G)) {
                f2806b.m3770a(new C3488i(context));
            }
            C3489j c3489j = new C3489j(context);
            if (c3489j.m3790g()) {
                f2806b.m3770a(c3489j);
                f2806b.m3770a(new C3487h(context));
                c3489j.m3792i();
            }
            f2806b.m3779f();
        }
        return f2806b;
    }

    /* renamed from: b */
    private void m3771b(C3506c c3506c) {
        byte[] bArrM3000a;
        synchronized (f2808j) {
            if (c3506c != null) {
                try {
                    synchronized (this) {
                        m3769a(c3506c);
                        bArrM3000a = new C3352az().m3000a(c3506c);
                    }
                    if (bArrM3000a != null) {
                        HelperUtils.writeFile(this.f2809d, bArrM3000a);
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m3770a(AbstractC3480a abstractC3480a) {
        if (this.f2814i.m3782a(abstractC3480a.m3762b())) {
            return this.f2813h.add(abstractC3480a);
        }
        if (!AnalyticsConstants.UM_DEBUG) {
            return false;
        }
        MLog.m3665w("invalid domain: " + abstractC3480a.m3762b());
        return false;
    }

    /* renamed from: a */
    public void m3774a(long j4) {
        this.f2812g = j4;
    }

    /* renamed from: a */
    private void m3769a(C3506c c3506c) {
        Map<String, C3505b> map;
        if (c3506c == null || (map = c3506c.f2907a) == null) {
            return;
        }
        if (map.containsKey("mac") && !FieldManager.allow(C3510b.f3012h)) {
            c3506c.f2907a.remove("mac");
        }
        if (c3506c.f2907a.containsKey("imei") && !FieldManager.allow(C3510b.f3011g)) {
            c3506c.f2907a.remove("imei");
        }
        if (c3506c.f2907a.containsKey("android_id") && !FieldManager.allow(C3510b.f3013i)) {
            c3506c.f2907a.remove("android_id");
        }
        if (c3506c.f2907a.containsKey("serial") && !FieldManager.allow(C3510b.f3014j)) {
            c3506c.f2907a.remove("serial");
        }
        if (c3506c.f2907a.containsKey("idfa") && !FieldManager.allow(C3510b.f3027w)) {
            c3506c.f2907a.remove("idfa");
        }
        if (!c3506c.f2907a.containsKey("oaid") || FieldManager.allow(C3510b.f2972G)) {
            return;
        }
        c3506c.f2907a.remove("oaid");
    }
}
