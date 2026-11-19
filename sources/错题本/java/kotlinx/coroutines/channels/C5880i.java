package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.AbstractC5830k;
import p054e7.AbstractC5484p;

/* renamed from: kotlinx.coroutines.channels.i */
/* loaded from: classes4.dex */
public final class C5880i extends AbstractC5484p {

    /* renamed from: e */
    public final C5873b f9330e;

    /* renamed from: f */
    public final /* synthetic */ AtomicReferenceArray f9331f;

    public C5880i(long j7, C5880i c5880i, C5873b c5873b, int i) {
        super(j7, c5880i, i);
        this.f9330e = c5873b;
        this.f9331f = new AtomicReferenceArray(AbstractC5874c.f9306b * 2);
    }

    @Override // p054e7.AbstractC5484p
    /* renamed from: f */
    public final int mo4863f() {
        return AbstractC5874c.f9306b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        m5508m(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        kotlin.jvm.internal.AbstractC5830k.m5327d(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // p054e7.AbstractC5484p
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo4864g(int r5, p075h6.InterfaceC5636h r6) {
        /*
            r4 = this;
            int r6 = kotlinx.coroutines.channels.AbstractC5874c.f9306b
            if (r5 < r6) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r5 = r5 - r6
        La:
            int r6 = r5 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r4.f9331f
            r1.get(r6)
        L11:
            java.lang.Object r6 = r4.m5506k(r5)
            boolean r1 = r6 instanceof kotlinx.coroutines.InterfaceC6008u1
            kotlinx.coroutines.channels.b r2 = r4.f9330e
            r3 = 0
            if (r1 != 0) goto L62
            boolean r1 = r6 instanceof kotlinx.coroutines.channels.C5888q
            if (r1 == 0) goto L21
            goto L62
        L21:
            e7.r r1 = kotlinx.coroutines.channels.AbstractC5874c.f9314j
            if (r6 == r1) goto L59
            e7.r r1 = kotlinx.coroutines.channels.AbstractC5874c.f9315k
            if (r6 != r1) goto L2a
            goto L59
        L2a:
            e7.r r1 = kotlinx.coroutines.channels.AbstractC5874c.f9311g
            if (r6 == r1) goto L11
            e7.r r1 = kotlinx.coroutines.channels.AbstractC5874c.f9310f
            if (r6 != r1) goto L33
            goto L11
        L33:
            e7.r r5 = kotlinx.coroutines.channels.AbstractC5874c.f9313i
            if (r6 == r5) goto L7c
            e7.r r5 = kotlinx.coroutines.channels.AbstractC5874c.f9308d
            if (r6 != r5) goto L3c
            goto L7c
        L3c:
            e7.r r5 = kotlinx.coroutines.channels.AbstractC5874c.f9316l
            if (r6 != r5) goto L41
            goto L7c
        L41:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unexpected state: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L59:
            r4.m5508m(r5, r3)
            if (r0 == 0) goto L7c
            kotlin.jvm.internal.AbstractC5830k.m5327d(r2)
            return
        L62:
            if (r0 == 0) goto L67
            e7.r r1 = kotlinx.coroutines.channels.AbstractC5874c.f9314j
            goto L69
        L67:
            e7.r r1 = kotlinx.coroutines.channels.AbstractC5874c.f9315k
        L69:
            boolean r6 = r4.m5505j(r5, r6, r1)
            if (r6 == 0) goto L11
            r4.m5508m(r5, r3)
            r6 = r0 ^ 1
            r4.m5507l(r5, r6)
            if (r0 == 0) goto L7c
            kotlin.jvm.internal.AbstractC5830k.m5327d(r2)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C5880i.mo4864g(int, h6.h):void");
    }

    /* renamed from: j */
    public final boolean m5505j(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i8 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.f9331f;
            if (atomicReferenceArray.compareAndSet(i8, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i8) == obj);
        return false;
    }

    /* renamed from: k */
    public final Object m5506k(int i) {
        return this.f9331f.get((i * 2) + 1);
    }

    /* renamed from: l */
    public final void m5507l(int i, boolean z8) {
        if (z8) {
            C5873b c5873b = this.f9330e;
            AbstractC5830k.m5327d(c5873b);
            c5873b.m5480I((this.f8478c * AbstractC5874c.f9306b) + i);
        }
        m4865h();
    }

    /* renamed from: m */
    public final void m5508m(int i, Object obj) {
        this.f9331f.set(i * 2, obj);
    }

    /* renamed from: n */
    public final void m5509n(int i, Object obj) {
        this.f9331f.set((i * 2) + 1, obj);
    }
}
