package com.umeng.commonsdk.statistics.idtracking;

import com.taobao.accs.utl.UtilityImpl;
import com.umeng.commonsdk.statistics.proto.C2020a;
import com.umeng.commonsdk.statistics.proto.C2021b;
import com.umeng.commonsdk.statistics.proto.C2022c;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.android.agoo.message.MessageService;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.a */
/* loaded from: classes.dex */
public abstract class AbstractC1996a {

    /* renamed from: a */
    private final int f9386a = 10;

    /* renamed from: b */
    private final int f9387b = 100;

    /* renamed from: c */
    private final String f9388c;

    /* renamed from: d */
    private List<C2020a> f9389d;

    /* renamed from: e */
    private C2021b f9390e;

    public AbstractC1996a(String str) {
        this.f9388c = str;
    }

    /* renamed from: g */
    private boolean m7679g() {
        C2021b c2021b = this.f9390e;
        String strM7795b = c2021b == null ? null : c2021b.m7795b();
        int iM7803h = c2021b == null ? 0 : c2021b.m7803h();
        String strM7680a = m7680a(mo7689f());
        if (strM7680a == null || strM7680a.equals(strM7795b)) {
            return false;
        }
        if (c2021b == null) {
            c2021b = new C2021b();
        }
        c2021b.m7792a(strM7680a);
        c2021b.m7791a(System.currentTimeMillis());
        c2021b.m7790a(iM7803h + 1);
        C2020a c2020a = new C2020a();
        c2020a.m7754a(this.f9388c);
        c2020a.m7759c(strM7680a);
        c2020a.m7756b(strM7795b);
        c2020a.m7753a(c2021b.m7800e());
        if (this.f9389d == null) {
            this.f9389d = new ArrayList(2);
        }
        this.f9389d.add(c2020a);
        if (this.f9389d.size() > 10) {
            this.f9389d.remove(0);
        }
        this.f9390e = c2021b;
        return true;
    }

    /* renamed from: a */
    public boolean m7684a() {
        return m7679g();
    }

    /* renamed from: b */
    public String m7685b() {
        return this.f9388c;
    }

    /* renamed from: c */
    public boolean m7686c() {
        C2021b c2021b = this.f9390e;
        return c2021b == null || c2021b.m7803h() <= 100;
    }

    /* renamed from: d */
    public C2021b m7687d() {
        return this.f9390e;
    }

    /* renamed from: e */
    public List<C2020a> m7688e() {
        return this.f9389d;
    }

    /* renamed from: f */
    public abstract String mo7689f();

    /* renamed from: a */
    public void m7681a(C2021b c2021b) {
        this.f9390e = c2021b;
    }

    /* renamed from: a */
    public void m7683a(List<C2020a> list) {
        this.f9389d = list;
    }

    /* renamed from: a */
    public String m7680a(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.length() == 0 || MessageService.MSG_DB_READY_REPORT.equals(strTrim) || UtilityImpl.NET_TYPE_UNKNOWN.equals(strTrim.toLowerCase(Locale.US))) {
            return null;
        }
        return strTrim;
    }

    /* renamed from: a */
    public void m7682a(C2022c c2022c) {
        this.f9390e = c2022c.m7832c().get(this.f9388c);
        List<C2020a> listM7838h = c2022c.m7838h();
        if (listM7838h == null || listM7838h.size() <= 0) {
            return;
        }
        if (this.f9389d == null) {
            this.f9389d = new ArrayList();
        }
        for (C2020a c2020a : listM7838h) {
            if (this.f9388c.equals(c2020a.f9458a)) {
                this.f9389d.add(c2020a);
            }
        }
    }
}
