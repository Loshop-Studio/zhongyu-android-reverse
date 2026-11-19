package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5356d;
import com.bumptech.glide.load.engine.InterfaceC5376c;
import java.io.File;
import java.util.List;
import p162m0.InterfaceC8537b;
import p228s0.InterfaceC9112n;

/* renamed from: com.bumptech.glide.load.engine.b */
/* loaded from: classes3.dex */
public class C5375b implements InterfaceC5376c, InterfaceC5356d.a {

    /* renamed from: a */
    public final List f3598a;

    /* renamed from: b */
    public final C5377d f3599b;

    /* renamed from: c */
    public final InterfaceC5376c.a f3600c;

    /* renamed from: d */
    public int f3601d;

    /* renamed from: e */
    public InterfaceC8537b f3602e;

    /* renamed from: f */
    public List f3603f;

    /* renamed from: g */
    public int f3604g;

    /* renamed from: h */
    public volatile InterfaceC9112n.a f3605h;

    /* renamed from: i */
    public File f3606i;

    public C5375b(C5377d c5377d, InterfaceC5376c.a aVar) {
        this(c5377d.m3505c(), c5377d, aVar);
    }

    /* renamed from: a */
    private boolean m3501a() {
        return this.f3604g < this.f3603f.size();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5356d.a
    /* renamed from: c */
    public void mo3412c(Exception exc) {
        this.f3600c.mo3440a(this.f3602e, exc, this.f3605h.f15786c, DataSource.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5376c
    public void cancel() {
        InterfaceC9112n.a aVar = this.f3605h;
        if (aVar != null) {
            aVar.f15786c.cancel();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (m3501a() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r0 = r7.f3603f;
        r3 = r7.f3604g;
        r7.f3604g = r3 + 1;
        r7.f3605h = ((p228s0.InterfaceC9112n) r0.get(r3)).mo15355b(r7.f3606i, r7.f3599b.m3522t(), r7.f3599b.m3508f(), r7.f3599b.m3513k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (r7.f3605h == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (r7.f3599b.m3523u(r7.f3605h.f15786c.mo3399a()) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        r7.f3605h.f15786c.mo3407e(r7.f3599b.m3514l(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        r7.f3605h = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        if (r2 != false) goto L40;
     */
    @Override // com.bumptech.glide.load.engine.InterfaceC5376c
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo3502d() {
        /*
            r7 = this;
            java.lang.String r0 = "DataCacheGenerator.startNext"
            p128j1.AbstractC7779b.m13143a(r0)
        L5:
            java.util.List r0 = r7.f3603f     // Catch: java.lang.Throwable -> L68
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L6e
            boolean r0 = r7.m3501a()     // Catch: java.lang.Throwable -> L68
            if (r0 != 0) goto L12
            goto L6e
        L12:
            r0 = 0
            r7.f3605h = r0     // Catch: java.lang.Throwable -> L68
        L15:
            if (r2 != 0) goto L6a
            boolean r0 = r7.m3501a()     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L6a
            java.util.List r0 = r7.f3603f     // Catch: java.lang.Throwable -> L68
            int r3 = r7.f3604g     // Catch: java.lang.Throwable -> L68
            int r4 = r3 + 1
            r7.f3604g = r4     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L68
            s0.n r0 = (p228s0.InterfaceC9112n) r0     // Catch: java.lang.Throwable -> L68
            java.io.File r3 = r7.f3606i     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.d r4 = r7.f3599b     // Catch: java.lang.Throwable -> L68
            int r4 = r4.m3522t()     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.d r5 = r7.f3599b     // Catch: java.lang.Throwable -> L68
            int r5 = r5.m3508f()     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.d r6 = r7.f3599b     // Catch: java.lang.Throwable -> L68
            m0.d r6 = r6.m3513k()     // Catch: java.lang.Throwable -> L68
            s0.n$a r0 = r0.mo15355b(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L68
            r7.f3605h = r0     // Catch: java.lang.Throwable -> L68
            s0.n$a r0 = r7.f3605h     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L15
            com.bumptech.glide.load.engine.d r0 = r7.f3599b     // Catch: java.lang.Throwable -> L68
            s0.n$a r3 = r7.f3605h     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.data.d r3 = r3.f15786c     // Catch: java.lang.Throwable -> L68
            java.lang.Class r3 = r3.mo3399a()     // Catch: java.lang.Throwable -> L68
            boolean r0 = r0.m3523u(r3)     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L15
            s0.n$a r0 = r7.f3605h     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.data.d r0 = r0.f15786c     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.d r2 = r7.f3599b     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.Priority r2 = r2.m3514l()     // Catch: java.lang.Throwable -> L68
            r0.mo3407e(r2, r7)     // Catch: java.lang.Throwable -> L68
            r2 = r1
            goto L15
        L68:
            r0 = move-exception
            goto Lb0
        L6a:
            p128j1.AbstractC7779b.m13147e()
            return r2
        L6e:
            int r0 = r7.f3601d     // Catch: java.lang.Throwable -> L68
            int r0 = r0 + r1
            r7.f3601d = r0     // Catch: java.lang.Throwable -> L68
            java.util.List r1 = r7.f3598a     // Catch: java.lang.Throwable -> L68
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L68
            if (r0 < r1) goto L7f
            p128j1.AbstractC7779b.m13147e()
            return r2
        L7f:
            java.util.List r0 = r7.f3598a     // Catch: java.lang.Throwable -> L68
            int r1 = r7.f3601d     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L68
            m0.b r0 = (p162m0.InterfaceC8537b) r0     // Catch: java.lang.Throwable -> L68
            o0.a r1 = new o0.a     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.d r3 = r7.f3599b     // Catch: java.lang.Throwable -> L68
            m0.b r3 = r3.m3518p()     // Catch: java.lang.Throwable -> L68
            r1.<init>(r0, r3)     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.d r3 = r7.f3599b     // Catch: java.lang.Throwable -> L68
            q0.a r3 = r3.m3506d()     // Catch: java.lang.Throwable -> L68
            java.io.File r1 = r3.mo14868a(r1)     // Catch: java.lang.Throwable -> L68
            r7.f3606i = r1     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L5
            r7.f3602e = r0     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.d r0 = r7.f3599b     // Catch: java.lang.Throwable -> L68
            java.util.List r0 = r0.m3512j(r1)     // Catch: java.lang.Throwable -> L68
            r7.f3603f = r0     // Catch: java.lang.Throwable -> L68
            r7.f3604g = r2     // Catch: java.lang.Throwable -> L68
            goto L5
        Lb0:
            p128j1.AbstractC7779b.m13147e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C5375b.mo3502d():boolean");
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5356d.a
    /* renamed from: f */
    public void mo3413f(Object obj) {
        this.f3600c.mo3441b(this.f3602e, obj, this.f3605h.f15786c, DataSource.DATA_DISK_CACHE, this.f3602e);
    }

    public C5375b(List list, C5377d c5377d, InterfaceC5376c.a aVar) {
        this.f3601d = -1;
        this.f3598a = list;
        this.f3599b = c5377d;
        this.f3600c = aVar;
    }
}
