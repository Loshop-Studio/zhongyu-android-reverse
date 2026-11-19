package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5405d;
import com.bumptech.glide.load.engine.InterfaceC5425c;
import java.io.File;
import java.util.List;
import p160l.InterfaceC9228b;
import p226r.InterfaceC9888n;

/* renamed from: com.bumptech.glide.load.engine.b */
/* loaded from: classes3.dex */
public class C5424b implements InterfaceC5425c, InterfaceC5405d.a {

    /* renamed from: a */
    public final List f3031a;

    /* renamed from: b */
    public final C5426d f3032b;

    /* renamed from: c */
    public final InterfaceC5425c.a f3033c;

    /* renamed from: d */
    public int f3034d;

    /* renamed from: e */
    public InterfaceC9228b f3035e;

    /* renamed from: f */
    public List f3036f;

    /* renamed from: g */
    public int f3037g;

    /* renamed from: h */
    public volatile InterfaceC9888n.a f3038h;

    /* renamed from: i */
    public File f3039i;

    public C5424b(C5426d c5426d, InterfaceC5425c.a aVar) {
        this(c5426d.m2951c(), c5426d, aVar);
    }

    /* renamed from: b */
    private boolean m2947b() {
        return this.f3037g < this.f3036f.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (m2947b() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r0 = r7.f3036f;
        r3 = r7.f3037g;
        r7.f3037g = r3 + 1;
        r7.f3038h = ((p226r.InterfaceC9888n) r0.get(r3)).mo18446b(r7.f3039i, r7.f3032b.m2968t(), r7.f3032b.m2954f(), r7.f3032b.m2959k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (r7.f3038h == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (r7.f3032b.m2969u(r7.f3038h.f19821c.mo2846a()) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        r7.f3038h.f19821c.mo2853d(r7.f3032b.m2960l(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        r7.f3038h = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        if (r2 != false) goto L40;
     */
    @Override // com.bumptech.glide.load.engine.InterfaceC5425c
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo2948a() {
        /*
            r7 = this;
            java.lang.String r0 = "DataCacheGenerator.startNext"
            p127i0.AbstractC8749b.m14415a(r0)
        L5:
            java.util.List r0 = r7.f3036f     // Catch: java.lang.Throwable -> L68
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L6e
            boolean r0 = r7.m2947b()     // Catch: java.lang.Throwable -> L68
            if (r0 != 0) goto L12
            goto L6e
        L12:
            r0 = 0
            r7.f3038h = r0     // Catch: java.lang.Throwable -> L68
        L15:
            if (r2 != 0) goto L6a
            boolean r0 = r7.m2947b()     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L6a
            java.util.List r0 = r7.f3036f     // Catch: java.lang.Throwable -> L68
            int r3 = r7.f3037g     // Catch: java.lang.Throwable -> L68
            int r4 = r3 + 1
            r7.f3037g = r4     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L68
            r.n r0 = (p226r.InterfaceC9888n) r0     // Catch: java.lang.Throwable -> L68
            java.io.File r3 = r7.f3039i     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.d r4 = r7.f3032b     // Catch: java.lang.Throwable -> L68
            int r4 = r4.m2968t()     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.d r5 = r7.f3032b     // Catch: java.lang.Throwable -> L68
            int r5 = r5.m2954f()     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.d r6 = r7.f3032b     // Catch: java.lang.Throwable -> L68
            l.d r6 = r6.m2959k()     // Catch: java.lang.Throwable -> L68
            r.n$a r0 = r0.mo18446b(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L68
            r7.f3038h = r0     // Catch: java.lang.Throwable -> L68
            r.n$a r0 = r7.f3038h     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L15
            com.bumptech.glide.load.engine.d r0 = r7.f3032b     // Catch: java.lang.Throwable -> L68
            r.n$a r3 = r7.f3038h     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.data.d r3 = r3.f19821c     // Catch: java.lang.Throwable -> L68
            java.lang.Class r3 = r3.mo2846a()     // Catch: java.lang.Throwable -> L68
            boolean r0 = r0.m2969u(r3)     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L15
            r.n$a r0 = r7.f3038h     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.data.d r0 = r0.f19821c     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.d r2 = r7.f3032b     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.Priority r2 = r2.m2960l()     // Catch: java.lang.Throwable -> L68
            r0.mo2853d(r2, r7)     // Catch: java.lang.Throwable -> L68
            r2 = r1
            goto L15
        L68:
            r0 = move-exception
            goto Lb0
        L6a:
            p127i0.AbstractC8749b.m14419e()
            return r2
        L6e:
            int r0 = r7.f3034d     // Catch: java.lang.Throwable -> L68
            int r0 = r0 + r1
            r7.f3034d = r0     // Catch: java.lang.Throwable -> L68
            java.util.List r1 = r7.f3031a     // Catch: java.lang.Throwable -> L68
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L68
            if (r0 < r1) goto L7f
            p127i0.AbstractC8749b.m14419e()
            return r2
        L7f:
            java.util.List r0 = r7.f3031a     // Catch: java.lang.Throwable -> L68
            int r1 = r7.f3034d     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L68
            l.b r0 = (p160l.InterfaceC9228b) r0     // Catch: java.lang.Throwable -> L68
            n.a r1 = new n.a     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.d r3 = r7.f3032b     // Catch: java.lang.Throwable -> L68
            l.b r3 = r3.m2964p()     // Catch: java.lang.Throwable -> L68
            r1.<init>(r0, r3)     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.d r3 = r7.f3032b     // Catch: java.lang.Throwable -> L68
            p.a r3 = r3.m2952d()     // Catch: java.lang.Throwable -> L68
            java.io.File r1 = r3.mo18170a(r1)     // Catch: java.lang.Throwable -> L68
            r7.f3039i = r1     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L5
            r7.f3035e = r0     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.d r0 = r7.f3032b     // Catch: java.lang.Throwable -> L68
            java.util.List r0 = r0.m2958j(r1)     // Catch: java.lang.Throwable -> L68
            r7.f3036f = r0     // Catch: java.lang.Throwable -> L68
            r7.f3037g = r2     // Catch: java.lang.Throwable -> L68
            goto L5
        Lb0:
            p127i0.AbstractC8749b.m14419e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C5424b.mo2948a():boolean");
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5405d.a
    /* renamed from: c */
    public void mo2858c(Exception exc) {
        this.f3033c.mo2889d(this.f3035e, exc, this.f3038h.f19821c, DataSource.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5425c
    public void cancel() {
        InterfaceC9888n.a aVar = this.f3038h;
        if (aVar != null) {
            aVar.f19821c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5405d.a
    /* renamed from: e */
    public void mo2859e(Object obj) {
        this.f3033c.mo2887b(this.f3035e, obj, this.f3038h.f19821c, DataSource.DATA_DISK_CACHE, this.f3035e);
    }

    public C5424b(List list, C5426d c5426d, InterfaceC5425c.a aVar) {
        this.f3034d = -1;
        this.f3031a = list;
        this.f3032b = c5426d;
        this.f3033c = aVar;
    }
}
