package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5824d;
import com.bumptech.glide.load.engine.InterfaceC5844c;
import java.io.File;
import java.util.List;
import p168h0.InterfaceC9435b;
import p254n0.InterfaceC10300n;

/* renamed from: com.bumptech.glide.load.engine.b */
/* loaded from: classes3.dex */
public class C5843b implements InterfaceC5844c, InterfaceC5824d.a {

    /* renamed from: c */
    public final List f4801c;

    /* renamed from: d */
    public final C5845d f4802d;

    /* renamed from: e */
    public final InterfaceC5844c.a f4803e;

    /* renamed from: f */
    public int f4804f;

    /* renamed from: g */
    public InterfaceC9435b f4805g;

    /* renamed from: h */
    public List f4806h;

    /* renamed from: i */
    public int f4807i;

    /* renamed from: j */
    public volatile InterfaceC10300n.a f4808j;

    /* renamed from: k */
    public File f4809k;

    public C5843b(C5845d c5845d, InterfaceC5844c.a aVar) {
        this(c5845d.m4155c(), c5845d, aVar);
    }

    /* renamed from: a */
    private boolean m4151a() {
        return this.f4807i < this.f4806h.size();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5824d.a
    /* renamed from: b */
    public void mo4062b(Exception exc) {
        this.f4803e.mo4091b(this.f4805g, exc, this.f4808j.f24544c, DataSource.DATA_DISK_CACHE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (m4151a() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r0 = r7.f4806h;
        r3 = r7.f4807i;
        r7.f4807i = r3 + 1;
        r7.f4808j = ((p254n0.InterfaceC10300n) r0.get(r3)).mo21421b(r7.f4809k, r7.f4802d.m4172t(), r7.f4802d.m4158f(), r7.f4802d.m4163k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (r7.f4808j == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (r7.f4802d.m4173u(r7.f4808j.f24544c.mo4051a()) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        r7.f4808j.f24544c.mo4057c(r7.f4802d.m4164l(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        r7.f4808j = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        if (r2 != false) goto L40;
     */
    @Override // com.bumptech.glide.load.engine.InterfaceC5844c
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo4152c() {
        /*
            r7 = this;
            java.lang.String r0 = "DataCacheGenerator.startNext"
            p125e1.AbstractC9070b.m17864a(r0)
        L5:
            java.util.List r0 = r7.f4806h     // Catch: java.lang.Throwable -> L68
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L6e
            boolean r0 = r7.m4151a()     // Catch: java.lang.Throwable -> L68
            if (r0 != 0) goto L12
            goto L6e
        L12:
            r0 = 0
            r7.f4808j = r0     // Catch: java.lang.Throwable -> L68
        L15:
            if (r2 != 0) goto L6a
            boolean r0 = r7.m4151a()     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L6a
            java.util.List r0 = r7.f4806h     // Catch: java.lang.Throwable -> L68
            int r3 = r7.f4807i     // Catch: java.lang.Throwable -> L68
            int r4 = r3 + 1
            r7.f4807i = r4     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L68
            n0.n r0 = (p254n0.InterfaceC10300n) r0     // Catch: java.lang.Throwable -> L68
            java.io.File r3 = r7.f4809k     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.d r4 = r7.f4802d     // Catch: java.lang.Throwable -> L68
            int r4 = r4.m4172t()     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.d r5 = r7.f4802d     // Catch: java.lang.Throwable -> L68
            int r5 = r5.m4158f()     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.d r6 = r7.f4802d     // Catch: java.lang.Throwable -> L68
            h0.e r6 = r6.m4163k()     // Catch: java.lang.Throwable -> L68
            n0.n$a r0 = r0.mo21421b(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L68
            r7.f4808j = r0     // Catch: java.lang.Throwable -> L68
            n0.n$a r0 = r7.f4808j     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L15
            com.bumptech.glide.load.engine.d r0 = r7.f4802d     // Catch: java.lang.Throwable -> L68
            n0.n$a r3 = r7.f4808j     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.data.d r3 = r3.f24544c     // Catch: java.lang.Throwable -> L68
            java.lang.Class r3 = r3.mo4051a()     // Catch: java.lang.Throwable -> L68
            boolean r0 = r0.m4173u(r3)     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L15
            n0.n$a r0 = r7.f4808j     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.data.d r0 = r0.f24544c     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.d r2 = r7.f4802d     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.Priority r2 = r2.m4164l()     // Catch: java.lang.Throwable -> L68
            r0.mo4057c(r2, r7)     // Catch: java.lang.Throwable -> L68
            r2 = r1
            goto L15
        L68:
            r0 = move-exception
            goto Lb0
        L6a:
            p125e1.AbstractC9070b.m17868e()
            return r2
        L6e:
            int r0 = r7.f4804f     // Catch: java.lang.Throwable -> L68
            int r0 = r0 + r1
            r7.f4804f = r0     // Catch: java.lang.Throwable -> L68
            java.util.List r1 = r7.f4801c     // Catch: java.lang.Throwable -> L68
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L68
            if (r0 < r1) goto L7f
            p125e1.AbstractC9070b.m17868e()
            return r2
        L7f:
            java.util.List r0 = r7.f4801c     // Catch: java.lang.Throwable -> L68
            int r1 = r7.f4804f     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L68
            h0.b r0 = (p168h0.InterfaceC9435b) r0     // Catch: java.lang.Throwable -> L68
            j0.a r1 = new j0.a     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.d r3 = r7.f4802d     // Catch: java.lang.Throwable -> L68
            h0.b r3 = r3.m4168p()     // Catch: java.lang.Throwable -> L68
            r1.<init>(r0, r3)     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.d r3 = r7.f4802d     // Catch: java.lang.Throwable -> L68
            l0.a r3 = r3.m4156d()     // Catch: java.lang.Throwable -> L68
            java.io.File r1 = r3.mo21107b(r1)     // Catch: java.lang.Throwable -> L68
            r7.f4809k = r1     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L5
            r7.f4805g = r0     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.d r0 = r7.f4802d     // Catch: java.lang.Throwable -> L68
            java.util.List r0 = r0.m4162j(r1)     // Catch: java.lang.Throwable -> L68
            r7.f4806h = r0     // Catch: java.lang.Throwable -> L68
            r7.f4807i = r2     // Catch: java.lang.Throwable -> L68
            goto L5
        Lb0:
            p125e1.AbstractC9070b.m17868e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C5843b.mo4152c():boolean");
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5844c
    public void cancel() {
        InterfaceC10300n.a aVar = this.f4808j;
        if (aVar != null) {
            aVar.f24544c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5824d.a
    /* renamed from: d */
    public void mo4063d(Object obj) {
        this.f4803e.mo4090a(this.f4805g, obj, this.f4808j.f24544c, DataSource.DATA_DISK_CACHE, this.f4805g);
    }

    public C5843b(List list, C5845d c5845d, InterfaceC5844c.a aVar) {
        this.f4804f = -1;
        this.f4801c = list;
        this.f4802d = c5845d;
        this.f4803e = aVar;
    }
}
