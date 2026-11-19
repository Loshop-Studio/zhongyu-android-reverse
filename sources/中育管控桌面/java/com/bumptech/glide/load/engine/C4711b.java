package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC4692d;
import com.bumptech.glide.load.engine.InterfaceC4712c;
import java.io.File;
import java.util.List;
import p053f0.InterfaceC6283b;
import p097l0.InterfaceC7280n;

/* renamed from: com.bumptech.glide.load.engine.b */
/* loaded from: classes3.dex */
public class C4711b implements InterfaceC4712c, InterfaceC4692d.a {

    /* renamed from: a */
    public final List f2389a;

    /* renamed from: b */
    public final C4713d f2390b;

    /* renamed from: c */
    public final InterfaceC4712c.a f2391c;

    /* renamed from: d */
    public int f2392d;

    /* renamed from: e */
    public InterfaceC6283b f2393e;

    /* renamed from: f */
    public List f2394f;

    /* renamed from: g */
    public int f2395g;

    /* renamed from: h */
    public volatile InterfaceC7280n.a f2396h;

    /* renamed from: i */
    public File f2397i;

    public C4711b(C4713d c4713d, InterfaceC4712c.a aVar) {
        this(c4713d.m2685c(), c4713d, aVar);
    }

    /* renamed from: a */
    private boolean m2681a() {
        return this.f2395g < this.f2394f.size();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC4692d.a
    /* renamed from: c */
    public void mo2593c(Exception exc) {
        this.f2391c.mo2622b(this.f2393e, exc, this.f2396h.f9232c, DataSource.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC4712c
    public void cancel() {
        InterfaceC7280n.a aVar = this.f2396h;
        if (aVar != null) {
            aVar.f9232c.cancel();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (m2681a() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r0 = r7.f2394f;
        r3 = r7.f2395g;
        r7.f2395g = r3 + 1;
        r7.f2396h = ((p097l0.InterfaceC7280n) r0.get(r3)).mo8191b(r7.f2397i, r7.f2390b.m2702t(), r7.f2390b.m2688f(), r7.f2390b.m2693k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (r7.f2396h == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (r7.f2390b.m2703u(r7.f2396h.f9232c.mo2580a()) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        r7.f2396h.f9232c.mo2588e(r7.f2390b.m2694l(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        r7.f2396h = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        if (r2 != false) goto L40;
     */
    @Override // com.bumptech.glide.load.engine.InterfaceC4712c
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo2682d() {
        /*
            r7 = this;
            java.lang.String r0 = "DataCacheGenerator.startNext"
            p024c1.AbstractC4483b.m1587a(r0)
        L5:
            java.util.List r0 = r7.f2394f     // Catch: java.lang.Throwable -> L68
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L6e
            boolean r0 = r7.m2681a()     // Catch: java.lang.Throwable -> L68
            if (r0 != 0) goto L12
            goto L6e
        L12:
            r0 = 0
            r7.f2396h = r0     // Catch: java.lang.Throwable -> L68
        L15:
            if (r2 != 0) goto L6a
            boolean r0 = r7.m2681a()     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L6a
            java.util.List r0 = r7.f2394f     // Catch: java.lang.Throwable -> L68
            int r3 = r7.f2395g     // Catch: java.lang.Throwable -> L68
            int r4 = r3 + 1
            r7.f2395g = r4     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L68
            l0.n r0 = (p097l0.InterfaceC7280n) r0     // Catch: java.lang.Throwable -> L68
            java.io.File r3 = r7.f2397i     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.d r4 = r7.f2390b     // Catch: java.lang.Throwable -> L68
            int r4 = r4.m2702t()     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.d r5 = r7.f2390b     // Catch: java.lang.Throwable -> L68
            int r5 = r5.m2688f()     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.d r6 = r7.f2390b     // Catch: java.lang.Throwable -> L68
            f0.d r6 = r6.m2693k()     // Catch: java.lang.Throwable -> L68
            l0.n$a r0 = r0.mo8191b(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L68
            r7.f2396h = r0     // Catch: java.lang.Throwable -> L68
            l0.n$a r0 = r7.f2396h     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L15
            com.bumptech.glide.load.engine.d r0 = r7.f2390b     // Catch: java.lang.Throwable -> L68
            l0.n$a r3 = r7.f2396h     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.data.d r3 = r3.f9232c     // Catch: java.lang.Throwable -> L68
            java.lang.Class r3 = r3.mo2580a()     // Catch: java.lang.Throwable -> L68
            boolean r0 = r0.m2703u(r3)     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L15
            l0.n$a r0 = r7.f2396h     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.data.d r0 = r0.f9232c     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.d r2 = r7.f2390b     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.Priority r2 = r2.m2694l()     // Catch: java.lang.Throwable -> L68
            r0.mo2588e(r2, r7)     // Catch: java.lang.Throwable -> L68
            r2 = r1
            goto L15
        L68:
            r0 = move-exception
            goto Lb0
        L6a:
            p024c1.AbstractC4483b.m1591e()
            return r2
        L6e:
            int r0 = r7.f2392d     // Catch: java.lang.Throwable -> L68
            int r0 = r0 + r1
            r7.f2392d = r0     // Catch: java.lang.Throwable -> L68
            java.util.List r1 = r7.f2389a     // Catch: java.lang.Throwable -> L68
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L68
            if (r0 < r1) goto L7f
            p024c1.AbstractC4483b.m1591e()
            return r2
        L7f:
            java.util.List r0 = r7.f2389a     // Catch: java.lang.Throwable -> L68
            int r1 = r7.f2392d     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L68
            f0.b r0 = (p053f0.InterfaceC6283b) r0     // Catch: java.lang.Throwable -> L68
            h0.a r1 = new h0.a     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.d r3 = r7.f2390b     // Catch: java.lang.Throwable -> L68
            f0.b r3 = r3.m2698p()     // Catch: java.lang.Throwable -> L68
            r1.<init>(r0, r3)     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.d r3 = r7.f2390b     // Catch: java.lang.Throwable -> L68
            j0.a r3 = r3.m2686d()     // Catch: java.lang.Throwable -> L68
            java.io.File r1 = r3.mo7440b(r1)     // Catch: java.lang.Throwable -> L68
            r7.f2397i = r1     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L5
            r7.f2393e = r0     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.d r0 = r7.f2390b     // Catch: java.lang.Throwable -> L68
            java.util.List r0 = r0.m2692j(r1)     // Catch: java.lang.Throwable -> L68
            r7.f2394f = r0     // Catch: java.lang.Throwable -> L68
            r7.f2395g = r2     // Catch: java.lang.Throwable -> L68
            goto L5
        Lb0:
            p024c1.AbstractC4483b.m1591e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C4711b.mo2682d():boolean");
    }

    @Override // com.bumptech.glide.load.data.InterfaceC4692d.a
    /* renamed from: f */
    public void mo2594f(Object obj) {
        this.f2391c.mo2621a(this.f2393e, obj, this.f2396h.f9232c, DataSource.DATA_DISK_CACHE, this.f2393e);
    }

    public C4711b(List list, C4713d c4713d, InterfaceC4712c.a aVar) {
        this.f2392d = -1;
        this.f2389a = list;
        this.f2390b = c4713d;
        this.f2391c = aVar;
    }
}
