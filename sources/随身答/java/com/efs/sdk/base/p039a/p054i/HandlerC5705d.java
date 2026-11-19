package com.efs.sdk.base.p039a.p054i;

import com.efs.sdk.base.p039a.p044d.C5661a;
import com.efs.sdk.base.p039a.p054i.C5707f;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.efs.sdk.base.a.i.d */
/* loaded from: classes3.dex */
public final class HandlerC5705d extends AbstractHandlerC5702a {

    /* renamed from: c */
    private AtomicInteger f4769c = new AtomicInteger(0);

    /* renamed from: d */
    private AtomicInteger f4770d = new AtomicInteger(0);

    /* renamed from: b */
    public AtomicInteger f4768b = new AtomicInteger(0);

    /* renamed from: e */
    private AtomicInteger f4771e = new AtomicInteger(0);

    /* renamed from: f */
    private AtomicInteger f4772f = new AtomicInteger(0);

    @Override // com.efs.sdk.base.p039a.p054i.AbstractHandlerC5702a
    /* renamed from: a */
    public final void mo4197a() {
        if ((this.f4769c.get() == 0 && this.f4770d.get() == 0 && this.f4768b.get() == 0 && this.f4772f.get() == 0 && this.f4771e.get() == 0) || this.f4760a == null || !C5661a.m4097a().f4645d) {
            return;
        }
        C5661a c5661a = this.f4760a;
        int i9 = this.f4769c.get();
        int i10 = this.f4770d.get();
        int i11 = this.f4768b.get();
        int i12 = this.f4772f.get();
        int i13 = this.f4771e.get();
        C5703b c5703b = new C5703b("efs_core", "lf_st", C5707f.a.f4777a.f4773a.f4767c);
        c5703b.put("create_cnt", Integer.valueOf(i9));
        c5703b.put("cache_cnt", Integer.valueOf(i10));
        c5703b.put("req_cnt", Integer.valueOf(i11));
        c5703b.put("err_cnt", Integer.valueOf(i12));
        c5703b.put("expire_cnt", Integer.valueOf(i13));
        this.f4769c.addAndGet(i9 * (-1));
        this.f4770d.addAndGet(i10 * (-1));
        this.f4768b.addAndGet(i11 * (-1));
        this.f4772f.addAndGet(i12 * (-1));
        this.f4771e.addAndGet(i13 * (-1));
        c5661a.m4102a(c5703b);
    }

    /* renamed from: b */
    public final void m4198b() {
        this.f4769c.incrementAndGet();
    }

    /* renamed from: c */
    public final void m4199c() {
        this.f4770d.incrementAndGet();
    }

    /* renamed from: d */
    public final void m4200d() {
        this.f4771e.incrementAndGet();
    }

    /* renamed from: e */
    public final void m4201e() {
        this.f4772f.incrementAndGet();
    }
}
