package kotlinx.coroutines.channels;

import android.support.v4.media.AbstractC0037f;
import kotlin.jvm.internal.AbstractC5832m;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;

/* renamed from: kotlinx.coroutines.channels.j */
/* loaded from: classes4.dex */
public final class C5881j extends C5873b {

    /* renamed from: k */
    public final BufferOverflow f9332k;

    public C5881j(int i, BufferOverflow bufferOverflow) {
        super(i);
        this.f9332k = bufferOverflow;
        if (bufferOverflow != BufferOverflow.SUSPEND) {
            if (i < 1) {
                throw new IllegalArgumentException(AbstractC0037f.m82g(i, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + AbstractC5832m.m5340a(C5873b.class).m5320e() + " instead").toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b6, code lost:
    
        return r8;
     */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5510J(java.lang.Object r16, boolean r17) {
        /*
            r15 = this;
            kotlinx.coroutines.channels.BufferOverflow r1 = r15.f9332k
            kotlinx.coroutines.channels.BufferOverflow r2 = kotlinx.coroutines.channels.BufferOverflow.DROP_LATEST
            d6.s r8 = p045d6.C5443s.f8405a
            if (r1 != r2) goto L17
            java.lang.Object r1 = super.mo5481a(r16)
            boolean r2 = r1 instanceof kotlinx.coroutines.channels.C5878g
            if (r2 == 0) goto L16
            boolean r2 = r1 instanceof kotlinx.coroutines.channels.C5877f
            if (r2 == 0) goto L15
            goto L16
        L15:
            return r8
        L16:
            return r1
        L17:
            e7.r r6 = kotlinx.coroutines.channels.AbstractC5874c.f9308d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.channels.C5873b.f9299f
            java.lang.Object r1 = r1.get(r15)
            kotlinx.coroutines.channels.i r1 = (kotlinx.coroutines.channels.C5880i) r1
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.channels.C5873b.f9295b
            long r2 = r2.getAndIncrement(r15)
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r2
            r7 = 0
            boolean r7 = r15.m5497u(r2, r7)
            int r9 = kotlinx.coroutines.channels.AbstractC5874c.f9306b
            long r10 = (long) r9
            long r2 = r4 / r10
            long r12 = r4 % r10
            int r12 = (int) r12
            long r13 = r1.f8478c
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L53
            kotlinx.coroutines.channels.i r2 = kotlinx.coroutines.channels.C5873b.m5470b(r15, r2, r1)
            if (r2 != 0) goto L52
            if (r7 == 0) goto L21
            java.lang.Throwable r1 = r15.m5495r()
            kotlinx.coroutines.channels.f r2 = new kotlinx.coroutines.channels.f
            r2.<init>(r1)
            return r2
        L52:
            r1 = r2
        L53:
            r0 = r15
            r3 = r16
            r2 = r12
            int r12 = kotlinx.coroutines.channels.C5873b.m5472d(r0, r1, r2, r3, r4, r6, r7)
            if (r12 == 0) goto Lb7
            r3 = 1
            if (r12 == r3) goto Lb6
            r3 = 2
            if (r12 == r3) goto L90
            r2 = 3
            if (r12 == r2) goto L88
            r2 = 4
            if (r12 == r2) goto L71
            r2 = 5
            if (r12 == r2) goto L6d
            goto L21
        L6d:
            r1.m4839a()
            goto L21
        L71:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.channels.C5873b.f9296c
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L7e
            r1.m4839a()
        L7e:
            java.lang.Throwable r1 = r15.m5495r()
            kotlinx.coroutines.channels.f r2 = new kotlinx.coroutines.channels.f
            r2.<init>(r1)
            return r2
        L88:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L90:
            if (r7 == 0) goto L9f
            r1.m4865h()
            java.lang.Throwable r1 = r15.m5495r()
            kotlinx.coroutines.channels.f r2 = new kotlinx.coroutines.channels.f
            r2.<init>(r1)
            return r2
        L9f:
            boolean r3 = r6 instanceof kotlinx.coroutines.InterfaceC6008u1
            if (r3 == 0) goto La6
            kotlinx.coroutines.u1 r6 = (kotlinx.coroutines.InterfaceC6008u1) r6
            goto La7
        La6:
            r6 = 0
        La7:
            if (r6 == 0) goto Lae
            int r12 = r2 + r9
            r6.mo4962a(r1, r12)
        Lae:
            long r3 = r1.f8478c
            long r3 = r3 * r10
            long r1 = (long) r2
            long r3 = r3 + r1
            r15.m5485h(r3)
        Lb6:
            return r8
        Lb7:
            r1.m4839a()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C5881j.m5510J(java.lang.Object, boolean):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.C5873b, kotlinx.coroutines.channels.InterfaceC5887p
    /* renamed from: a */
    public final Object mo5481a(Object obj) {
        return m5510J(obj, false);
    }

    @Override // kotlinx.coroutines.channels.C5873b, kotlinx.coroutines.channels.InterfaceC5887p
    /* renamed from: q */
    public final Object mo5494q(InterfaceC5631c interfaceC5631c, Object obj) throws Throwable {
        if (m5510J(obj, true) instanceof C5877f) {
            throw m5495r();
        }
        return C5443s.f8405a;
    }

    @Override // kotlinx.coroutines.channels.C5873b
    /* renamed from: x */
    public final boolean mo5500x() {
        return this.f9332k == BufferOverflow.DROP_OLDEST;
    }
}
