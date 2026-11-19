package com.efs.sdk.base.p035a.p050i;

import com.efs.sdk.base.p035a.p040d.C1293a;
import com.efs.sdk.base.p035a.p050i.C1339f;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.efs.sdk.base.a.i.d */
/* loaded from: classes.dex */
public final class HandlerC1337d extends AbstractHandlerC1334a {

    /* renamed from: c */
    private AtomicInteger f7135c = new AtomicInteger(0);

    /* renamed from: d */
    private AtomicInteger f7136d = new AtomicInteger(0);

    /* renamed from: b */
    public AtomicInteger f7134b = new AtomicInteger(0);

    /* renamed from: e */
    private AtomicInteger f7137e = new AtomicInteger(0);

    /* renamed from: f */
    private AtomicInteger f7138f = new AtomicInteger(0);

    @Override // com.efs.sdk.base.p035a.p050i.AbstractHandlerC1334a
    /* renamed from: a */
    public final void mo5587a() {
        if ((this.f7135c.get() == 0 && this.f7136d.get() == 0 && this.f7134b.get() == 0 && this.f7138f.get() == 0 && this.f7137e.get() == 0) || this.f7126a == null || !C1293a.m5487a().f7011d) {
            return;
        }
        C1293a c1293a = this.f7126a;
        int i4 = this.f7135c.get();
        int i5 = this.f7136d.get();
        int i6 = this.f7134b.get();
        int i7 = this.f7138f.get();
        int i8 = this.f7137e.get();
        C1335b c1335b = new C1335b("efs_core", "lf_st", C1339f.a.f7143a.f7139a.f7133c);
        c1335b.put("create_cnt", Integer.valueOf(i4));
        c1335b.put("cache_cnt", Integer.valueOf(i5));
        c1335b.put("req_cnt", Integer.valueOf(i6));
        c1335b.put("err_cnt", Integer.valueOf(i7));
        c1335b.put("expire_cnt", Integer.valueOf(i8));
        this.f7135c.addAndGet(i4 * (-1));
        this.f7136d.addAndGet(i5 * (-1));
        this.f7134b.addAndGet(i6 * (-1));
        this.f7138f.addAndGet(i7 * (-1));
        this.f7137e.addAndGet(i8 * (-1));
        c1293a.m5492a(c1335b);
    }

    /* renamed from: b */
    public final void m5588b() {
        this.f7135c.incrementAndGet();
    }

    /* renamed from: c */
    public final void m5589c() {
        this.f7136d.incrementAndGet();
    }

    /* renamed from: d */
    public final void m5590d() {
        this.f7137e.incrementAndGet();
    }

    /* renamed from: e */
    public final void m5591e() {
        this.f7138f.incrementAndGet();
    }
}
