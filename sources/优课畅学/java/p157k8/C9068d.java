package p157k8;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.BufferedChannelKt;
import p191n8.AbstractC9436a0;

/* renamed from: k8.d */
/* loaded from: classes5.dex */
public final class C9068d extends AbstractC9436a0 {

    /* renamed from: e */
    public final BufferedChannel f17331e;

    /* renamed from: f */
    public final /* synthetic */ AtomicReferenceArray f17332f;

    public C9068d(long j10, C9068d c9068d, BufferedChannel bufferedChannel, int i10) {
        super(j10, c9068d, i10);
        this.f17331e = bufferedChannel;
        this.f17332f = new AtomicReferenceArray(BufferedChannelKt.f17642b * 2);
    }

    /* renamed from: A */
    public final Object m15882A(int i10) {
        return m15895z().get(i10 * 2);
    }

    /* renamed from: B */
    public final Object m15883B(int i10) {
        return m15895z().get((i10 * 2) + 1);
    }

    /* renamed from: C */
    public final void m15884C(int i10, boolean z10) {
        if (z10) {
            m15894y().m16449a1((this.f18641c * BufferedChannelKt.f17642b) + i10);
        }
        m17295t();
    }

    /* renamed from: D */
    public final Object m15885D(int i10) {
        Object objM15882A = m15882A(i10);
        m15892w(i10);
        return objM15882A;
    }

    /* renamed from: E */
    public final void m15886E(int i10, Object obj) {
        m15895z().set(i10 * 2, obj);
    }

    /* renamed from: F */
    public final void m15887F(int i10, Object obj) {
        m15895z().set((i10 * 2) + 1, obj);
    }

    /* renamed from: G */
    public final void m15888G(int i10, Object obj) {
        m15886E(i10, obj);
    }

    @Override // p191n8.AbstractC9436a0
    /* renamed from: r */
    public int mo15889r() {
        return BufferedChannelKt.f17642b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
    
        m15892w(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0065, code lost:
    
        if (r0 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0067, code lost:
    
        r4 = m15894y().f17618b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006d, code lost:
    
        if (r4 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006f, code lost:
    
        kotlinx.coroutines.internal.OnUndeliveredElementKt.m16744b(r4, r5, r6);
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
    @Override // p191n8.AbstractC9436a0
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo15890s(int r4, java.lang.Throwable r5, kotlin.coroutines.InterfaceC9100d r6) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r3 = this;
            int r5 = kotlinx.coroutines.channels.BufferedChannelKt.f17642b
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.m15882A(r4)
        Le:
            java.lang.Object r1 = r3.m15883B(r4)
            boolean r2 = r1 instanceof p135i8.InterfaceC8895z1
            if (r2 != 0) goto L73
            boolean r2 = r1 instanceof p157k8.C9074j
            if (r2 == 0) goto L1b
            goto L73
        L1b:
            n8.d0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.m16502j()
            if (r1 == r2) goto L62
            n8.d0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.m16501i()
            if (r1 != r2) goto L28
            goto L62
        L28:
            n8.d0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.m16508p()
            if (r1 == r2) goto Le
            n8.d0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.m16509q()
            if (r1 != r2) goto L35
            goto Le
        L35:
            n8.d0 r4 = kotlinx.coroutines.channels.BufferedChannelKt.m16498f()
            if (r1 == r4) goto L99
            n8.d0 r4 = kotlinx.coroutines.channels.BufferedChannelKt.f17644d
            if (r1 != r4) goto L40
            goto L99
        L40:
            n8.d0 r4 = kotlinx.coroutines.channels.BufferedChannelKt.m16518z()
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
            r3.m15892w(r4)
            if (r0 == 0) goto L99
            kotlinx.coroutines.channels.BufferedChannel r4 = r3.m15894y()
            x7.l r4 = r4.f17618b
            if (r4 == 0) goto L99
            kotlinx.coroutines.internal.OnUndeliveredElementKt.m16744b(r4, r5, r6)
            return
        L73:
            if (r0 == 0) goto L7a
            n8.d0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.m16502j()
            goto L7e
        L7a:
            n8.d0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.m16501i()
        L7e:
            boolean r1 = r3.m15891v(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.m15892w(r4)
            r1 = r0 ^ 1
            r3.m15884C(r4, r1)
            if (r0 == 0) goto L99
            kotlinx.coroutines.channels.BufferedChannel r4 = r3.m15894y()
            x7.l r4 = r4.f17618b
            if (r4 == 0) goto L99
            kotlinx.coroutines.internal.OnUndeliveredElementKt.m16744b(r4, r5, r6)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p157k8.C9068d.mo15890s(int, java.lang.Throwable, kotlin.coroutines.d):void");
    }

    /* renamed from: v */
    public final boolean m15891v(int i10, Object obj, Object obj2) {
        return AbstractC9067c.m15881a(m15895z(), (i10 * 2) + 1, obj, obj2);
    }

    /* renamed from: w */
    public final void m15892w(int i10) {
        m15886E(i10, null);
    }

    /* renamed from: x */
    public final Object m15893x(int i10, Object obj) {
        return m15895z().getAndSet((i10 * 2) + 1, obj);
    }

    /* renamed from: y */
    public final BufferedChannel m15894y() {
        BufferedChannel bufferedChannel = this.f17331e;
        AbstractC9133u.m16130d(bufferedChannel);
        return bufferedChannel;
    }

    /* renamed from: z */
    public final /* synthetic */ AtomicReferenceArray m15895z() {
        return this.f17332f;
    }
}
