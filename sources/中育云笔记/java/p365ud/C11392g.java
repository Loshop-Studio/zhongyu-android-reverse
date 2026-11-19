package p365ud;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.BufferedChannelKt;
import p410xd.AbstractC11875z;

/* renamed from: ud.g */
/* loaded from: classes6.dex */
public final class C11392g extends AbstractC11875z {

    /* renamed from: g */
    public final BufferedChannel f27216g;

    /* renamed from: h */
    public final /* synthetic */ AtomicReferenceArray f27217h;

    public C11392g(long j10, C11392g c11392g, BufferedChannel bufferedChannel, int i10) {
        super(j10, c11392g, i10);
        this.f27216g = bufferedChannel;
        this.f27217h = new AtomicReferenceArray(BufferedChannelKt.f23556b * 2);
    }

    /* renamed from: A */
    public final Object m25343A(int i10) {
        return m25354z().get(i10 * 2);
    }

    /* renamed from: B */
    public final Object m25344B(int i10) {
        return m25354z().get((i10 * 2) + 1);
    }

    /* renamed from: C */
    public final void m25345C(int i10, boolean z10) {
        if (z10) {
            m25353y().m20659t1((this.f28135e * BufferedChannelKt.f23556b) + i10);
        }
        m26357t();
    }

    /* renamed from: D */
    public final Object m25346D(int i10) {
        Object objM25343A = m25343A(i10);
        m25351w(i10);
        return objM25343A;
    }

    /* renamed from: E */
    public final void m25347E(int i10, Object obj) {
        m25354z().set(i10 * 2, obj);
    }

    /* renamed from: F */
    public final void m25348F(int i10, Object obj) {
        m25354z().set((i10 * 2) + 1, obj);
    }

    /* renamed from: G */
    public final void m25349G(int i10, Object obj) {
        m25347E(i10, obj);
    }

    @Override // p410xd.AbstractC11875z
    /* renamed from: r */
    public int mo2760r() {
        return BufferedChannelKt.f23556b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
    
        m25351w(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0065, code lost:
    
        if (r0 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0067, code lost:
    
        r4 = m25353y().f23534d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006d, code lost:
    
        if (r4 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006f, code lost:
    
        p410xd.AbstractC11871v.m26349a(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0072, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    @Override // p410xd.AbstractC11875z
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo2761s(int r4, java.lang.Throwable r5, kotlin.coroutines.InterfaceC9945d r6) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r3 = this;
            int r5 = kotlinx.coroutines.channels.BufferedChannelKt.f23556b
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.m25343A(r4)
        Le:
            java.lang.Object r1 = r3.m25344B(r4)
            boolean r2 = r1 instanceof sd.InterfaceC11144n2
            if (r2 != 0) goto L73
            boolean r2 = r1 instanceof p365ud.C11398m
            if (r2 == 0) goto L1b
            goto L73
        L1b:
            xd.c0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.m20695j()
            if (r1 == r2) goto L62
            xd.c0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.m20694i()
            if (r1 != r2) goto L28
            goto L62
        L28:
            xd.c0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.m20701p()
            if (r1 == r2) goto Le
            xd.c0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.m20702q()
            if (r1 != r2) goto L35
            goto Le
        L35:
            xd.c0 r4 = kotlinx.coroutines.channels.BufferedChannelKt.m20691f()
            if (r1 == r4) goto L99
            xd.c0 r4 = kotlinx.coroutines.channels.BufferedChannelKt.f23558d
            if (r1 != r4) goto L40
            goto L99
        L40:
            xd.c0 r4 = kotlinx.coroutines.channels.BufferedChannelKt.m20711z()
            if (r1 != r4) goto L47
            goto L99
        L47:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "unexpected state: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L62:
            r3.m25351w(r4)
            if (r0 == 0) goto L99
            kotlinx.coroutines.channels.BufferedChannel r4 = r3.m25353y()
            hd.l r4 = r4.f23534d
            if (r4 == 0) goto L99
            p410xd.AbstractC11871v.m26349a(r4, r5, r6)
            return
        L73:
            if (r0 == 0) goto L7a
            xd.c0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.m20695j()
            goto L7e
        L7a:
            xd.c0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.m20694i()
        L7e:
            boolean r1 = r3.m25350v(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.m25351w(r4)
            r1 = r0 ^ 1
            r3.m25345C(r4, r1)
            if (r0 == 0) goto L99
            kotlinx.coroutines.channels.BufferedChannel r4 = r3.m25353y()
            hd.l r4 = r4.f23534d
            if (r4 == 0) goto L99
            p410xd.AbstractC11871v.m26349a(r4, r5, r6)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p365ud.C11392g.mo2761s(int, java.lang.Throwable, kotlin.coroutines.d):void");
    }

    /* renamed from: v */
    public final boolean m25350v(int i10, Object obj, Object obj2) {
        return AbstractC11391f.m25342a(m25354z(), (i10 * 2) + 1, obj, obj2);
    }

    /* renamed from: w */
    public final void m25351w(int i10) {
        m25347E(i10, null);
    }

    /* renamed from: x */
    public final Object m25352x(int i10, Object obj) {
        return m25354z().getAndSet((i10 * 2) + 1, obj);
    }

    /* renamed from: y */
    public final BufferedChannel m25353y() {
        BufferedChannel bufferedChannel = this.f27216g;
        AbstractC9979u.m20291d(bufferedChannel);
        return bufferedChannel;
    }

    /* renamed from: z */
    public final /* synthetic */ AtomicReferenceArray m25354z() {
        return this.f27217h;
    }
}
