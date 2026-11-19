package com.efs.sdk.base.p020a.p035i;

import com.efs.sdk.base.p020a.p025d.C2921a;
import com.efs.sdk.base.p020a.p035i.C2967f;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.efs.sdk.base.a.i.d */
/* loaded from: classes2.dex */
public final class HandlerC2965d extends AbstractHandlerC2962a {

    /* renamed from: c */
    private AtomicInteger f1165c = new AtomicInteger(0);

    /* renamed from: d */
    private AtomicInteger f1166d = new AtomicInteger(0);

    /* renamed from: b */
    public AtomicInteger f1164b = new AtomicInteger(0);

    /* renamed from: e */
    private AtomicInteger f1167e = new AtomicInteger(0);

    /* renamed from: f */
    private AtomicInteger f1168f = new AtomicInteger(0);

    @Override // com.efs.sdk.base.p020a.p035i.AbstractHandlerC2962a
    /* renamed from: a */
    public final void mo2228a() {
        if ((this.f1165c.get() == 0 && this.f1166d.get() == 0 && this.f1164b.get() == 0 && this.f1168f.get() == 0 && this.f1167e.get() == 0) || this.f1156a == null || !C2921a.m2128a().f1041d) {
            return;
        }
        C2921a c2921a = this.f1156a;
        int i4 = this.f1165c.get();
        int i5 = this.f1166d.get();
        int i6 = this.f1164b.get();
        int i7 = this.f1168f.get();
        int i8 = this.f1167e.get();
        C2963b c2963b = new C2963b("efs_core", "lf_st", C2967f.a.f1173a.f1169a.f1163c);
        c2963b.put("create_cnt", Integer.valueOf(i4));
        c2963b.put("cache_cnt", Integer.valueOf(i5));
        c2963b.put("req_cnt", Integer.valueOf(i6));
        c2963b.put("err_cnt", Integer.valueOf(i7));
        c2963b.put("expire_cnt", Integer.valueOf(i8));
        this.f1165c.addAndGet(i4 * (-1));
        this.f1166d.addAndGet(i5 * (-1));
        this.f1164b.addAndGet(i6 * (-1));
        this.f1168f.addAndGet(i7 * (-1));
        this.f1167e.addAndGet(i8 * (-1));
        c2921a.m2133a(c2963b);
    }

    /* renamed from: b */
    public final void m2229b() {
        this.f1165c.incrementAndGet();
    }

    /* renamed from: c */
    public final void m2230c() {
        this.f1166d.incrementAndGet();
    }

    /* renamed from: d */
    public final void m2231d() {
        this.f1167e.incrementAndGet();
    }

    /* renamed from: e */
    public final void m2232e() {
        this.f1168f.incrementAndGet();
    }
}
