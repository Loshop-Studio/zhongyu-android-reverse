package com.umeng.commonsdk.statistics.idtracking;

import androidx.core.os.EnvironmentCompat;
import com.umeng.commonsdk.statistics.proto.C3504a;
import com.umeng.commonsdk.statistics.proto.C3505b;
import com.umeng.commonsdk.statistics.proto.C3506c;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.a */
/* loaded from: classes2.dex */
public abstract class AbstractC3480a {

    /* renamed from: a */
    private final int f2794a = 10;

    /* renamed from: b */
    private final int f2795b = 100;

    /* renamed from: c */
    private final String f2796c;

    /* renamed from: d */
    private List<C3504a> f2797d;

    /* renamed from: e */
    private C3505b f2798e;

    public AbstractC3480a(String str) {
        this.f2796c = str;
    }

    /* renamed from: g */
    private boolean m3756g() {
        C3505b c3505b = this.f2798e;
        String strM3872b = c3505b == null ? null : c3505b.m3872b();
        int iM3880h = c3505b == null ? 0 : c3505b.m3880h();
        String strM3757a = m3757a(mo3766f());
        if (strM3757a == null || strM3757a.equals(strM3872b)) {
            return false;
        }
        if (c3505b == null) {
            c3505b = new C3505b();
        }
        c3505b.m3869a(strM3757a);
        c3505b.m3868a(System.currentTimeMillis());
        c3505b.m3867a(iM3880h + 1);
        C3504a c3504a = new C3504a();
        c3504a.m3831a(this.f2796c);
        c3504a.m3836c(strM3757a);
        c3504a.m3833b(strM3872b);
        c3504a.m3830a(c3505b.m3877e());
        if (this.f2797d == null) {
            this.f2797d = new ArrayList(2);
        }
        this.f2797d.add(c3504a);
        if (this.f2797d.size() > 10) {
            this.f2797d.remove(0);
        }
        this.f2798e = c3505b;
        return true;
    }

    /* renamed from: a */
    public boolean m3761a() {
        return m3756g();
    }

    /* renamed from: b */
    public String m3762b() {
        return this.f2796c;
    }

    /* renamed from: c */
    public boolean m3763c() {
        C3505b c3505b = this.f2798e;
        return c3505b == null || c3505b.m3880h() <= 100;
    }

    /* renamed from: d */
    public C3505b m3764d() {
        return this.f2798e;
    }

    /* renamed from: e */
    public List<C3504a> m3765e() {
        return this.f2797d;
    }

    /* renamed from: f */
    public abstract String mo3766f();

    /* renamed from: a */
    public void m3758a(C3505b c3505b) {
        this.f2798e = c3505b;
    }

    /* renamed from: a */
    public void m3760a(List<C3504a> list) {
        this.f2797d = list;
    }

    /* renamed from: a */
    public String m3757a(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.length() == 0 || "0".equals(strTrim) || EnvironmentCompat.MEDIA_UNKNOWN.equals(strTrim.toLowerCase(Locale.US))) {
            return null;
        }
        return strTrim;
    }

    /* renamed from: a */
    public void m3759a(C3506c c3506c) {
        this.f2798e = c3506c.m3909c().get(this.f2796c);
        List<C3504a> listM3915h = c3506c.m3915h();
        if (listM3915h == null || listM3915h.size() <= 0) {
            return;
        }
        if (this.f2797d == null) {
            this.f2797d = new ArrayList();
        }
        for (C3504a c3504a : listM3915h) {
            if (this.f2796c.equals(c3504a.f2866a)) {
                this.f2797d.add(c3504a);
            }
        }
    }
}
