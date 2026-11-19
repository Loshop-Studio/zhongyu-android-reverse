package kotlinx.coroutines.channels;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.SieveCacheKt;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.AbstractC5774b;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5835p;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.C5961g;
import kotlinx.coroutines.InterfaceC5895f;
import kotlinx.coroutines.InterfaceC6008u1;
import p045d6.C5443s;
import p054e7.AbstractC5469a;
import p054e7.AbstractC5484p;
import p054e7.AbstractC5485q;
import p054e7.C5486r;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p185v7.AbstractC6683l;

/* renamed from: kotlinx.coroutines.channels.b */
/* loaded from: classes4.dex */
public class C5873b implements InterfaceC5876e {

    /* renamed from: b */
    public static final /* synthetic */ AtomicLongFieldUpdater f9295b = AtomicLongFieldUpdater.newUpdater(C5873b.class, "sendersAndCloseStatus$volatile");

    /* renamed from: c */
    public static final /* synthetic */ AtomicLongFieldUpdater f9296c = AtomicLongFieldUpdater.newUpdater(C5873b.class, "receivers$volatile");

    /* renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f9297d = AtomicLongFieldUpdater.newUpdater(C5873b.class, "bufferEnd$volatile");

    /* renamed from: e */
    public static final /* synthetic */ AtomicLongFieldUpdater f9298e = AtomicLongFieldUpdater.newUpdater(C5873b.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9299f = AtomicReferenceFieldUpdater.newUpdater(C5873b.class, Object.class, "sendSegment$volatile");

    /* renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9300g = AtomicReferenceFieldUpdater.newUpdater(C5873b.class, Object.class, "receiveSegment$volatile");

    /* renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9301h = AtomicReferenceFieldUpdater.newUpdater(C5873b.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9302i = AtomicReferenceFieldUpdater.newUpdater(C5873b.class, Object.class, "_closeCause$volatile");

    /* renamed from: j */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9303j = AtomicReferenceFieldUpdater.newUpdater(C5873b.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* renamed from: a */
    public final int f9304a;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public C5873b(int i) {
        this.f9304a = i;
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0037f.m82g(i, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        C5880i c5880i = AbstractC5874c.f9305a;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f9297d.get(this);
        C5880i c5880i2 = new C5880i(0L, null, this, 3);
        this.sendSegment$volatile = c5880i2;
        this.receiveSegment$volatile = c5880i2;
        if (m5501y()) {
            c5880i2 = AbstractC5874c.f9305a;
            AbstractC5830k.m5328e(c5880i2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = c5880i2;
        this._closeCause$volatile = AbstractC5874c.f9323s;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m5468B(kotlinx.coroutines.channels.C5873b r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            boolean r0 = r14 instanceof kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1
            if (r0 == 0) goto L14
            r0 = r14
            kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 r0 = (kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 r0 = new kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            kotlin.AbstractC5774b.m5119b(r14)
            kotlinx.coroutines.channels.h r14 = (kotlinx.coroutines.channels.C5879h) r14
            java.lang.Object r13 = r14.f9329a
            return r13
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            kotlin.AbstractC5774b.m5119b(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = kotlinx.coroutines.channels.C5873b.f9300g
            java.lang.Object r14 = r14.get(r13)
            kotlinx.coroutines.channels.i r14 = (kotlinx.coroutines.channels.C5880i) r14
        L40:
            boolean r1 = r13.m5498v()
            if (r1 == 0) goto L50
            java.lang.Throwable r13 = r13.m5491n()
            kotlinx.coroutines.channels.f r14 = new kotlinx.coroutines.channels.f
            r14.<init>(r13)
            return r14
        L50:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.channels.C5873b.f9296c
            long r4 = r1.getAndIncrement(r13)
            int r1 = kotlinx.coroutines.channels.AbstractC5874c.f9306b
            long r7 = (long) r1
            long r9 = r4 / r7
            long r7 = r4 % r7
            int r3 = (int) r7
            long r7 = r14.f8478c
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 == 0) goto L6d
            kotlinx.coroutines.channels.i r1 = r13.m5490m(r9, r14)
            if (r1 != 0) goto L6b
            goto L40
        L6b:
            r8 = r1
            goto L6e
        L6d:
            r8 = r14
        L6e:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = r7.m5478G(r8, r9, r10, r12)
            r1 = r7
            e7.r r14 = kotlinx.coroutines.channels.AbstractC5874c.f9317m
            if (r13 == r14) goto La0
            e7.r r14 = kotlinx.coroutines.channels.AbstractC5874c.f9319o
            if (r13 != r14) goto L8d
            long r13 = r1.m5496s()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L8a
            r8.m4839a()
        L8a:
            r13 = r1
            r14 = r8
            goto L40
        L8d:
            e7.r r14 = kotlinx.coroutines.channels.AbstractC5874c.f9318n
            if (r13 != r14) goto L9c
            r6.label = r2
            r2 = r8
            java.lang.Object r13 = r1.m5475C(r2, r3, r4, r6)
            if (r13 != r0) goto L9b
            return r0
        L9b:
            return r13
        L9c:
            r8.m4839a()
            return r13
        La0:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C5873b.m5468B(kotlinx.coroutines.channels.b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* renamed from: F */
    public static boolean m5469F(Object obj) {
        if (obj instanceof InterfaceC5895f) {
            AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return AbstractC5874c.m5503a((InterfaceC5895f) obj, C5443s.f8405a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    /* renamed from: b */
    public static final C5880i m5470b(C5873b c5873b, long j7, C5880i c5880i) {
        Object objM4826b;
        C5873b c5873b2;
        C5880i c5880i2 = AbstractC5874c.f9305a;
        BufferedChannelKt$createSegmentFunction$1 bufferedChannelKt$createSegmentFunction$1 = BufferedChannelKt$createSegmentFunction$1.INSTANCE;
        loop0: while (true) {
            objM4826b = AbstractC5469a.m4826b(c5880i, j7, bufferedChannelKt$createSegmentFunction$1);
            if (!AbstractC5469a.m4829e(objM4826b)) {
                AbstractC5484p abstractC5484pM4827c = AbstractC5469a.m4827c(objM4826b);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9299f;
                    AbstractC5484p abstractC5484p = (AbstractC5484p) atomicReferenceFieldUpdater.get(c5873b);
                    if (abstractC5484p.f8478c >= abstractC5484pM4827c.f8478c) {
                        break loop0;
                    }
                    if (!abstractC5484pM4827c.m4866i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c5873b, abstractC5484p, abstractC5484pM4827c)) {
                        if (atomicReferenceFieldUpdater.get(c5873b) != abstractC5484p) {
                            if (abstractC5484pM4827c.m4862e()) {
                                abstractC5484pM4827c.m4842d();
                            }
                        }
                    }
                    if (abstractC5484p.m4862e()) {
                        abstractC5484p.m4842d();
                    }
                }
            } else {
                break;
            }
        }
        boolean zM4829e = AbstractC5469a.m4829e(objM4826b);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f9296c;
        if (zM4829e) {
            c5873b.m5499w();
            if (c5880i.f8478c * AbstractC5874c.f9306b < atomicLongFieldUpdater.get(c5873b)) {
                c5880i.m4839a();
                return null;
            }
        } else {
            C5880i c5880i3 = (C5880i) AbstractC5469a.m4827c(objM4826b);
            long j8 = c5880i3.f8478c;
            if (j8 <= j7) {
                return c5880i3;
            }
            long j9 = AbstractC5874c.f9306b * j8;
            while (true) {
                long j10 = f9295b.get(c5873b);
                long j11 = 1152921504606846975L & j10;
                if (j11 >= j9) {
                    c5873b2 = c5873b;
                    break;
                }
                c5873b2 = c5873b;
                if (f9295b.compareAndSet(c5873b2, j10, (((int) (j10 >> 60)) << 60) + j11)) {
                    break;
                }
                c5873b = c5873b2;
            }
            if (j8 * AbstractC5874c.f9306b < atomicLongFieldUpdater.get(c5873b2)) {
                c5880i3.m4839a();
            }
        }
        return null;
    }

    /* renamed from: c */
    public static final void m5471c(C5873b c5873b, Object obj, C5961g c5961g) {
        c5961g.resumeWith(Result.m13956constructorimpl(AbstractC5774b.m5118a(c5873b.m5495r())));
    }

    /* renamed from: d */
    public static final int m5472d(C5873b c5873b, C5880i c5880i, int i, Object obj, long j7, Object obj2, boolean z8) {
        c5880i.m5508m(i, obj);
        if (z8) {
            return c5873b.m5479H(c5880i, i, obj, j7, obj2, z8);
        }
        Object objM5506k = c5880i.m5506k(i);
        if (objM5506k == null) {
            if (c5873b.m5482e(j7)) {
                if (c5880i.m5505j(i, null, AbstractC5874c.f9308d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (c5880i.m5505j(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (objM5506k instanceof InterfaceC6008u1) {
            c5880i.m5508m(i, null);
            if (c5873b.m5477E(objM5506k, obj)) {
                c5880i.m5509n(i, AbstractC5874c.f9313i);
                return 0;
            }
            C5486r c5486r = AbstractC5874c.f9315k;
            if (c5880i.f9331f.getAndSet((i * 2) + 1, c5486r) == c5486r) {
                return 5;
            }
            c5880i.m5507l(i, true);
            return 5;
        }
        return c5873b.m5479H(c5880i, i, obj, j7, obj2, z8);
    }

    /* renamed from: t */
    public static void m5473t(C5873b c5873b) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f9298e;
        if ((atomicLongFieldUpdater.addAndGet(c5873b, 1L) & SieveCacheKt.NodeVisitedBit) != 0) {
            while ((atomicLongFieldUpdater.get(c5873b) & SieveCacheKt.NodeVisitedBit) != 0) {
            }
        }
    }

    /* renamed from: A */
    public final Object m5474A(InterfaceC5631c interfaceC5631c, Object obj) {
        C5961g c5961g = new C5961g(1, AbstractC6683l.m6374n(interfaceC5631c));
        c5961g.m5584u();
        c5961g.resumeWith(Result.m13956constructorimpl(AbstractC5774b.m5118a(m5495r())));
        Object objM5583t = c5961g.m5583t();
        return objM5583t == CoroutineSingletons.COROUTINE_SUSPENDED ? objM5583t : C5443s.f8405a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5475C(kotlinx.coroutines.channels.C5880i r15, int r16, long r17, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C5873b.m5475C(kotlinx.coroutines.channels.i, int, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* renamed from: D */
    public final void m5476D(InterfaceC6008u1 interfaceC6008u1, boolean z8) {
        if (interfaceC6008u1 instanceof InterfaceC5895f) {
            ((InterfaceC5631c) interfaceC6008u1).resumeWith(Result.m13956constructorimpl(AbstractC5774b.m5118a(z8 ? m5493p() : m5495r())));
            return;
        }
        if (interfaceC6008u1 instanceof C5885n) {
            ((C5885n) interfaceC6008u1).f9334a.resumeWith(Result.m13956constructorimpl(new C5879h(new C5877f(m5491n()))));
            return;
        }
        if (!(interfaceC6008u1 instanceof C5872a)) {
            throw new IllegalStateException(("Unexpected waiter: " + interfaceC6008u1).toString());
        }
        C5872a c5872a = (C5872a) interfaceC6008u1;
        C5961g c5961g = c5872a.f9293b;
        AbstractC5830k.m5327d(c5961g);
        c5872a.f9293b = null;
        c5872a.f9292a = AbstractC5874c.f9316l;
        Throwable thM5491n = c5872a.f9294c.m5491n();
        if (thM5491n == null) {
            c5961g.resumeWith(Result.m13956constructorimpl(Boolean.FALSE));
        } else {
            c5961g.resumeWith(Result.m13956constructorimpl(AbstractC5774b.m5118a(thM5491n)));
        }
    }

    /* renamed from: E */
    public final boolean m5477E(Object obj, Object obj2) {
        if (obj instanceof C5885n) {
            AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            return AbstractC5874c.m5503a(((C5885n) obj).f9334a, new C5879h(obj2), null);
        }
        if (!(obj instanceof C5872a)) {
            if (obj instanceof InterfaceC5895f) {
                AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                return AbstractC5874c.m5503a((InterfaceC5895f) obj, obj2, null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        C5872a c5872a = (C5872a) obj;
        C5961g c5961g = c5872a.f9293b;
        AbstractC5830k.m5327d(c5961g);
        c5872a.f9293b = null;
        c5872a.f9292a = obj2;
        return AbstractC5874c.m5503a(c5961g, Boolean.TRUE, null);
    }

    /* renamed from: G */
    public final Object m5478G(C5880i c5880i, int i, long j7, Object obj) {
        Object objM5506k = c5880i.m5506k(i);
        AtomicReferenceArray atomicReferenceArray = c5880i.f9331f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f9295b;
        if (objM5506k == null) {
            if (j7 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return AbstractC5874c.f9318n;
                }
                if (c5880i.m5505j(i, objM5506k, obj)) {
                    m5486i();
                    return AbstractC5874c.f9317m;
                }
            }
        } else if (objM5506k == AbstractC5874c.f9308d && c5880i.m5505j(i, objM5506k, AbstractC5874c.f9313i)) {
            m5486i();
            Object obj2 = atomicReferenceArray.get(i * 2);
            c5880i.m5508m(i, null);
            return obj2;
        }
        while (true) {
            Object objM5506k2 = c5880i.m5506k(i);
            if (objM5506k2 == null || objM5506k2 == AbstractC5874c.f9309e) {
                if (j7 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (c5880i.m5505j(i, objM5506k2, AbstractC5874c.f9312h)) {
                        m5486i();
                        return AbstractC5874c.f9319o;
                    }
                } else {
                    if (obj == null) {
                        return AbstractC5874c.f9318n;
                    }
                    if (c5880i.m5505j(i, objM5506k2, obj)) {
                        m5486i();
                        return AbstractC5874c.f9317m;
                    }
                }
            } else if (objM5506k2 != AbstractC5874c.f9308d) {
                C5486r c5486r = AbstractC5874c.f9314j;
                if (objM5506k2 == c5486r) {
                    return AbstractC5874c.f9319o;
                }
                if (objM5506k2 == AbstractC5874c.f9312h) {
                    return AbstractC5874c.f9319o;
                }
                if (objM5506k2 == AbstractC5874c.f9316l) {
                    m5486i();
                    return AbstractC5874c.f9319o;
                }
                if (objM5506k2 != AbstractC5874c.f9311g && c5880i.m5505j(i, objM5506k2, AbstractC5874c.f9310f)) {
                    boolean z8 = objM5506k2 instanceof C5888q;
                    if (z8) {
                        objM5506k2 = ((C5888q) objM5506k2).f9335a;
                    }
                    if (m5469F(objM5506k2)) {
                        c5880i.m5509n(i, AbstractC5874c.f9313i);
                        m5486i();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        c5880i.m5508m(i, null);
                        return obj3;
                    }
                    c5880i.m5509n(i, c5486r);
                    c5880i.m4865h();
                    if (z8) {
                        m5486i();
                    }
                    return AbstractC5874c.f9319o;
                }
            } else if (c5880i.m5505j(i, objM5506k2, AbstractC5874c.f9313i)) {
                m5486i();
                Object obj4 = atomicReferenceArray.get(i * 2);
                c5880i.m5508m(i, null);
                return obj4;
            }
        }
    }

    /* renamed from: H */
    public final int m5479H(C5880i c5880i, int i, Object obj, long j7, Object obj2, boolean z8) {
        while (true) {
            Object objM5506k = c5880i.m5506k(i);
            if (objM5506k == null) {
                if (!m5482e(j7) || z8) {
                    if (z8) {
                        if (c5880i.m5505j(i, null, AbstractC5874c.f9314j)) {
                            c5880i.m4865h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (c5880i.m5505j(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (c5880i.m5505j(i, null, AbstractC5874c.f9308d)) {
                    break;
                }
            } else {
                if (objM5506k != AbstractC5874c.f9309e) {
                    C5486r c5486r = AbstractC5874c.f9315k;
                    if (objM5506k == c5486r) {
                        c5880i.m5508m(i, null);
                        return 5;
                    }
                    if (objM5506k == AbstractC5874c.f9312h) {
                        c5880i.m5508m(i, null);
                        return 5;
                    }
                    if (objM5506k == AbstractC5874c.f9316l) {
                        c5880i.m5508m(i, null);
                        m5499w();
                        return 4;
                    }
                    c5880i.m5508m(i, null);
                    if (objM5506k instanceof C5888q) {
                        objM5506k = ((C5888q) objM5506k).f9335a;
                    }
                    if (m5477E(objM5506k, obj)) {
                        c5880i.m5509n(i, AbstractC5874c.f9313i);
                        return 0;
                    }
                    if (c5880i.f9331f.getAndSet((i * 2) + 1, c5486r) != c5486r) {
                        c5880i.m5507l(i, true);
                    }
                    return 5;
                }
                if (c5880i.m5505j(i, objM5506k, AbstractC5874c.f9308d)) {
                    break;
                }
            }
        }
        return 1;
    }

    /* renamed from: I */
    public final void m5480I(long j7) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        C5873b c5873b = this;
        if (c5873b.m5501y()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f9297d;
            if (atomicLongFieldUpdater.get(c5873b) > j7) {
                break;
            } else {
                c5873b = this;
            }
        }
        int i = AbstractC5874c.f9307c;
        int i8 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f9298e;
            if (i8 < i) {
                long j8 = atomicLongFieldUpdater.get(c5873b);
                if (j8 == (4611686018427387903L & atomicLongFieldUpdater2.get(c5873b)) && j8 == atomicLongFieldUpdater.get(c5873b)) {
                    return;
                } else {
                    i8++;
                }
            } else {
                while (true) {
                    long j9 = atomicLongFieldUpdater2.get(c5873b);
                    if (atomicLongFieldUpdater2.compareAndSet(c5873b, j9, (j9 & 4611686018427387903L) + SieveCacheKt.NodeVisitedBit)) {
                        break;
                    } else {
                        c5873b = this;
                    }
                }
                while (true) {
                    long j10 = atomicLongFieldUpdater.get(c5873b);
                    long j11 = atomicLongFieldUpdater2.get(c5873b);
                    long j12 = j11 & 4611686018427387903L;
                    boolean z8 = (j11 & SieveCacheKt.NodeVisitedBit) != 0;
                    if (j10 == j12 && j10 == atomicLongFieldUpdater.get(c5873b)) {
                        break;
                    }
                    if (z8) {
                        c5873b = this;
                    } else {
                        c5873b = this;
                        atomicLongFieldUpdater2.compareAndSet(c5873b, j11, SieveCacheKt.NodeVisitedBit + j12);
                    }
                }
                while (true) {
                    long j13 = atomicLongFieldUpdater2.get(c5873b);
                    if (atomicLongFieldUpdater2.compareAndSet(c5873b, j13, j13 & 4611686018427387903L)) {
                        return;
                    } else {
                        c5873b = this;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be A[SYNTHETIC] */
    @Override // kotlinx.coroutines.channels.InterfaceC5887p
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo5481a(java.lang.Object r16) {
        /*
            r15 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = kotlinx.coroutines.channels.C5873b.f9295b
            long r1 = r8.get(r15)
            r9 = 0
            boolean r3 = r15.m5497u(r1, r9)
            r10 = 1
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r3 == 0) goto L15
            r1 = r9
            goto L1b
        L15:
            long r1 = r1 & r11
            boolean r1 = r15.m5482e(r1)
            r1 = r1 ^ r10
        L1b:
            kotlinx.coroutines.channels.g r13 = kotlinx.coroutines.channels.C5879h.f9328b
            if (r1 == 0) goto L20
            return r13
        L20:
            e7.r r6 = kotlinx.coroutines.channels.AbstractC5874c.f9314j
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.channels.C5873b.f9299f
            java.lang.Object r1 = r1.get(r15)
            kotlinx.coroutines.channels.i r1 = (kotlinx.coroutines.channels.C5880i) r1
        L2a:
            long r2 = r8.getAndIncrement(r15)
            long r4 = r2 & r11
            boolean r7 = r15.m5497u(r2, r9)
            int r14 = kotlinx.coroutines.channels.AbstractC5874c.f9306b
            long r2 = (long) r14
            long r11 = r4 / r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r9 = r1.f8478c
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L5d
            kotlinx.coroutines.channels.i r3 = m5470b(r15, r11, r1)
            if (r3 != 0) goto L5c
            if (r7 == 0) goto L54
            java.lang.Throwable r1 = r15.m5495r()
            kotlinx.coroutines.channels.f r2 = new kotlinx.coroutines.channels.f
            r2.<init>(r1)
            return r2
        L54:
            r9 = 0
            r10 = 1
        L56:
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            goto L2a
        L5c:
            r1 = r3
        L5d:
            r0 = r15
            r3 = r16
            int r9 = m5472d(r0, r1, r2, r3, r4, r6, r7)
            d6.s r3 = p045d6.C5443s.f8405a
            if (r9 == 0) goto Lbe
            r10 = 1
            if (r9 == r10) goto Lbd
            r3 = 2
            if (r9 == r3) goto L9c
            r2 = 3
            if (r9 == r2) goto L94
            r2 = 4
            if (r9 == r2) goto L7d
            r2 = 5
            if (r9 == r2) goto L78
            goto L7b
        L78:
            r1.m4839a()
        L7b:
            r9 = 0
            goto L56
        L7d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.channels.C5873b.f9296c
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r1.m4839a()
        L8a:
            java.lang.Throwable r1 = r15.m5495r()
            kotlinx.coroutines.channels.f r2 = new kotlinx.coroutines.channels.f
            r2.<init>(r1)
            return r2
        L94:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L9c:
            if (r7 == 0) goto Lab
            r1.m4865h()
            java.lang.Throwable r1 = r15.m5495r()
            kotlinx.coroutines.channels.f r2 = new kotlinx.coroutines.channels.f
            r2.<init>(r1)
            return r2
        Lab:
            boolean r3 = r6 instanceof kotlinx.coroutines.InterfaceC6008u1
            if (r3 == 0) goto Lb2
            kotlinx.coroutines.u1 r6 = (kotlinx.coroutines.InterfaceC6008u1) r6
            goto Lb3
        Lb2:
            r6 = 0
        Lb3:
            if (r6 == 0) goto Lb9
            int r2 = r2 + r14
            r6.mo4962a(r1, r2)
        Lb9:
            r1.m4865h()
            return r13
        Lbd:
            return r3
        Lbe:
            r1.m4839a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C5873b.mo5481a(java.lang.Object):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5886o
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        m5483f(true, cancellationException);
    }

    /* renamed from: e */
    public final boolean m5482e(long j7) {
        return j7 < f9297d.get(this) || j7 < f9296c.get(this) + ((long) this.f9304a);
    }

    /* renamed from: f */
    public final boolean m5483f(boolean z8, Throwable th) {
        C5873b c5873b;
        boolean z9;
        long j7;
        long j8;
        long j9;
        Object obj;
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f9295b;
        if (!z8) {
            c5873b = this;
            break;
        }
        do {
            j11 = atomicLongFieldUpdater.get(this);
            if (((int) (j11 >> 60)) != 0) {
                c5873b = this;
                break;
            }
            C5880i c5880i = AbstractC5874c.f9305a;
            c5873b = this;
        } while (!atomicLongFieldUpdater.compareAndSet(c5873b, j11, (j11 & 1152921504606846975L) + (1 << 60)));
        C5486r c5486r = AbstractC5874c.f9323s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9302i;
            if (atomicReferenceFieldUpdater.compareAndSet(this, c5486r, th)) {
                z9 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != c5486r) {
                z9 = false;
                break;
            }
        }
        if (z8) {
            do {
                j10 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(c5873b, j10, (3 << 60) + (j10 & 1152921504606846975L)));
        } else {
            do {
                j7 = atomicLongFieldUpdater.get(this);
                int i = (int) (j7 >> 60);
                if (i == 0) {
                    j8 = j7 & 1152921504606846975L;
                    j9 = 2;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j8 = j7 & 1152921504606846975L;
                    j9 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(c5873b, j7, (j9 << 60) + j8));
        }
        m5499w();
        if (z9) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f9303j;
                obj = atomicReferenceFieldUpdater2.get(this);
                C5486r c5486r2 = obj == null ? AbstractC5874c.f9321q : AbstractC5874c.f9322r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, c5486r2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                AbstractC5835p.m5354c(1, obj);
                ((InterfaceC6471c) obj).invoke(m5491n());
                return z9;
            }
        }
        return z9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        r1 = (kotlinx.coroutines.channels.C5880i) ((p054e7.AbstractC5470b) p054e7.AbstractC5470b.f8446b.get(r1));
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.channels.C5880i m5484g(long r13) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C5873b.m5484g(long):kotlinx.coroutines.channels.i");
    }

    /* renamed from: h */
    public final void m5485h(long j7) {
        C5880i c5880i = (C5880i) f9300g.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f9296c;
            long j8 = atomicLongFieldUpdater.get(this);
            if (j7 < Math.max(this.f9304a + j8, f9297d.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j8, 1 + j8)) {
                long j9 = AbstractC5874c.f9306b;
                long j10 = j8 / j9;
                int i = (int) (j8 % j9);
                if (c5880i.f8478c != j10) {
                    C5880i c5880iM5490m = m5490m(j10, c5880i);
                    if (c5880iM5490m != null) {
                        c5880i = c5880iM5490m;
                    }
                }
                C5880i c5880i2 = c5880i;
                if (m5478G(c5880i2, i, j8, null) != AbstractC5874c.f9319o || j8 < m5496s()) {
                    c5880i2.m4839a();
                }
                c5880i = c5880i2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x018e, code lost:
    
        m5473t(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0191, code lost:
    
        return;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5486i() {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C5873b.m5486i():void");
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5886o
    public final C5872a iterator() {
        return new C5872a(this);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5886o
    /* renamed from: j */
    public final Object mo5487j() {
        C5880i c5880i;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f9296c;
        long j7 = atomicLongFieldUpdater.get(this);
        long j8 = f9295b.get(this);
        if (m5497u(j8, true)) {
            return new C5877f(m5491n());
        }
        long j9 = j8 & 1152921504606846975L;
        C5878g c5878g = C5879h.f9328b;
        if (j7 >= j9) {
            return c5878g;
        }
        Object obj = AbstractC5874c.f9315k;
        C5880i c5880i2 = (C5880i) f9300g.get(this);
        while (!m5498v()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j10 = AbstractC5874c.f9306b;
            long j11 = andIncrement / j10;
            int i = (int) (andIncrement % j10);
            if (c5880i2.f8478c != j11) {
                C5880i c5880iM5490m = m5490m(j11, c5880i2);
                if (c5880iM5490m == null) {
                    continue;
                } else {
                    c5880i = c5880iM5490m;
                }
            } else {
                c5880i = c5880i2;
            }
            Object objM5478G = m5478G(c5880i, i, andIncrement, obj);
            C5880i c5880i3 = c5880i;
            if (objM5478G == AbstractC5874c.f9317m) {
                InterfaceC6008u1 interfaceC6008u1 = obj instanceof InterfaceC6008u1 ? (InterfaceC6008u1) obj : null;
                if (interfaceC6008u1 != null) {
                    interfaceC6008u1.mo4962a(c5880i3, i);
                }
                m5480I(andIncrement);
                c5880i3.m4865h();
                return c5878g;
            }
            if (objM5478G != AbstractC5874c.f9319o) {
                if (objM5478G == AbstractC5874c.f9318n) {
                    throw new IllegalStateException("unexpected");
                }
                c5880i3.m4839a();
                return objM5478G;
            }
            if (andIncrement < m5496s()) {
                c5880i3.m4839a();
            }
            c5880i2 = c5880i3;
        }
        return new C5877f(m5491n());
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5886o
    /* renamed from: k */
    public final Object mo5488k(InterfaceC5631c interfaceC5631c) {
        return m5468B(this, (ContinuationImpl) interfaceC5631c);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5887p
    /* renamed from: l */
    public final boolean mo5489l(Throwable th) {
        return m5483f(false, th);
    }

    /* renamed from: m */
    public final C5880i m5490m(long j7, C5880i c5880i) {
        Object objM4826b;
        long j8;
        C5880i c5880i2 = AbstractC5874c.f9305a;
        BufferedChannelKt$createSegmentFunction$1 bufferedChannelKt$createSegmentFunction$1 = BufferedChannelKt$createSegmentFunction$1.INSTANCE;
        loop0: while (true) {
            objM4826b = AbstractC5469a.m4826b(c5880i, j7, bufferedChannelKt$createSegmentFunction$1);
            if (!AbstractC5469a.m4829e(objM4826b)) {
                AbstractC5484p abstractC5484pM4827c = AbstractC5469a.m4827c(objM4826b);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9300g;
                    AbstractC5484p abstractC5484p = (AbstractC5484p) atomicReferenceFieldUpdater.get(this);
                    if (abstractC5484p.f8478c >= abstractC5484pM4827c.f8478c) {
                        break loop0;
                    }
                    if (!abstractC5484pM4827c.m4866i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, abstractC5484p, abstractC5484pM4827c)) {
                        if (atomicReferenceFieldUpdater.get(this) != abstractC5484p) {
                            if (abstractC5484pM4827c.m4862e()) {
                                abstractC5484pM4827c.m4842d();
                            }
                        }
                    }
                    if (abstractC5484p.m4862e()) {
                        abstractC5484p.m4842d();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC5469a.m4829e(objM4826b)) {
            m5499w();
            if (c5880i.f8478c * AbstractC5874c.f9306b < m5496s()) {
                c5880i.m4839a();
                return null;
            }
        } else {
            C5880i c5880i3 = (C5880i) AbstractC5469a.m4827c(objM4826b);
            long j9 = c5880i3.f8478c;
            if (!m5501y() && j7 <= f9297d.get(this) / AbstractC5874c.f9306b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f9301h;
                    AbstractC5484p abstractC5484p2 = (AbstractC5484p) atomicReferenceFieldUpdater2.get(this);
                    if (abstractC5484p2.f8478c >= j9 || !c5880i3.m4866i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, abstractC5484p2, c5880i3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != abstractC5484p2) {
                            if (c5880i3.m4862e()) {
                                c5880i3.m4842d();
                            }
                        }
                    }
                    if (abstractC5484p2.m4862e()) {
                        abstractC5484p2.m4842d();
                    }
                }
            }
            if (j9 <= j7) {
                return c5880i3;
            }
            long j10 = j9 * AbstractC5874c.f9306b;
            do {
                j8 = f9296c.get(this);
                if (j8 >= j10) {
                    break;
                }
            } while (!f9296c.compareAndSet(this, j8, j10));
            if (j9 * AbstractC5874c.f9306b < m5496s()) {
                c5880i3.m4839a();
            }
        }
        return null;
    }

    /* renamed from: n */
    public final Throwable m5491n() {
        return (Throwable) f9302i.get(this);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5886o
    /* renamed from: o */
    public final Object mo5492o(SuspendLambda suspendLambda) throws Throwable {
        C5880i c5880i;
        Throwable th;
        C5880i c5880i2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9300g;
        C5880i c5880i3 = (C5880i) atomicReferenceFieldUpdater.get(this);
        while (!m5498v()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f9296c;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j7 = AbstractC5874c.f9306b;
            long j8 = andIncrement / j7;
            int i = (int) (andIncrement % j7);
            if (c5880i3.f8478c != j8) {
                C5880i c5880iM5490m = m5490m(j8, c5880i3);
                if (c5880iM5490m == null) {
                    continue;
                } else {
                    c5880i = c5880iM5490m;
                }
            } else {
                c5880i = c5880i3;
            }
            Object objM5478G = m5478G(c5880i, i, andIncrement, null);
            C5486r c5486r = AbstractC5874c.f9317m;
            if (objM5478G == c5486r) {
                throw new IllegalStateException("unexpected");
            }
            C5486r c5486r2 = AbstractC5874c.f9319o;
            if (objM5478G == c5486r2) {
                if (andIncrement < m5496s()) {
                    c5880i.m4839a();
                }
                c5880i3 = c5880i;
            } else {
                if (objM5478G != AbstractC5874c.f9318n) {
                    c5880i.m4839a();
                    return objM5478G;
                }
                C5961g c5961gM5644o = AbstractC6014x.m5644o(AbstractC6683l.m6374n(suspendLambda));
                C5873b c5873b = this;
                try {
                    Object objM5478G2 = c5873b.m5478G(c5880i, i, andIncrement, c5961gM5644o);
                    if (objM5478G2 == c5486r) {
                        c5961gM5644o.mo4962a(c5880i, i);
                    } else {
                        if (objM5478G2 == c5486r2) {
                            if (andIncrement < m5496s()) {
                                c5880i.m4839a();
                            }
                            C5880i c5880i4 = (C5880i) atomicReferenceFieldUpdater.get(this);
                            while (true) {
                                if (m5498v()) {
                                    c5961gM5644o.resumeWith(Result.m13956constructorimpl(AbstractC5774b.m5118a(m5493p())));
                                    break;
                                }
                                C5961g c5961g = c5961gM5644o;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j9 = AbstractC5874c.f9306b;
                                    long j10 = andIncrement2 / j9;
                                    int i8 = (int) (andIncrement2 % j9);
                                    if (c5880i4.f8478c != j10) {
                                        try {
                                            C5880i c5880iM5490m2 = m5490m(j10, c5880i4);
                                            if (c5880iM5490m2 == null) {
                                                c5961gM5644o = c5961g;
                                            } else {
                                                c5880i2 = c5880iM5490m2;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            c5961gM5644o = c5961g;
                                            c5961gM5644o.m5574A();
                                            throw th;
                                        }
                                    } else {
                                        c5880i2 = c5880i4;
                                    }
                                    objM5478G2 = c5873b.m5478G(c5880i2, i8, andIncrement2, c5961g);
                                    C5880i c5880i5 = c5880i2;
                                    c5961gM5644o = c5961g;
                                    if (objM5478G2 == AbstractC5874c.f9317m) {
                                        c5961gM5644o.mo4962a(c5880i5, i8);
                                        break;
                                    }
                                    if (objM5478G2 == AbstractC5874c.f9319o) {
                                        if (andIncrement2 < m5496s()) {
                                            c5880i5.m4839a();
                                        }
                                        c5873b = this;
                                        c5880i4 = c5880i5;
                                    } else {
                                        if (objM5478G2 == AbstractC5874c.f9318n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        c5880i5.m4839a();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    c5961gM5644o = c5961g;
                                    th = th;
                                    c5961gM5644o.m5574A();
                                    throw th;
                                }
                            }
                        } else {
                            c5880i.m4839a();
                        }
                        c5961gM5644o.mo4963b(objM5478G2, null);
                    }
                    Object objM5583t = c5961gM5644o.m5583t();
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    return objM5583t;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable thM5493p = m5493p();
        int i9 = AbstractC5485q.f8479a;
        throw thM5493p;
    }

    /* renamed from: p */
    public final Throwable m5493p() {
        Throwable thM5491n = m5491n();
        return thM5491n == null ? new ClosedReceiveChannelException("Channel was closed") : thM5491n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0196, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c6, code lost:
    
        m5471c(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0180 A[RETURN] */
    @Override // kotlinx.coroutines.channels.InterfaceC5887p
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo5494q(p075h6.InterfaceC5631c r24, java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C5873b.mo5494q(h6.c, java.lang.Object):java.lang.Object");
    }

    /* renamed from: r */
    public final Throwable m5495r() {
        Throwable thM5491n = m5491n();
        return thM5491n == null ? new ClosedSendChannelException("Channel was closed") : thM5491n;
    }

    /* renamed from: s */
    public final long m5496s() {
        return f9295b.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x019d, code lost:
    
        r16 = r7;
        r3 = (kotlinx.coroutines.channels.C5880i) r3.m4840b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a6, code lost:
    
        if (r3 != null) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C5873b.toString():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
    
        r0 = (kotlinx.coroutines.channels.C5880i) ((p054e7.AbstractC5470b) p054e7.AbstractC5470b.f8446b.get(r0));
     */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m5497u(long r14, boolean r16) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C5873b.m5497u(long, boolean):boolean");
    }

    /* renamed from: v */
    public final boolean m5498v() {
        return m5497u(f9295b.get(this), true);
    }

    /* renamed from: w */
    public final boolean m5499w() {
        return m5497u(f9295b.get(this), false);
    }

    /* renamed from: x */
    public boolean mo5500x() {
        return false;
    }

    /* renamed from: y */
    public final boolean m5501y() {
        long j7 = f9297d.get(this);
        return j7 == 0 || j7 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5502z(long r5, kotlinx.coroutines.channels.C5880i r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f8478c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            e7.b r0 = r7.m4840b()
            kotlinx.coroutines.channels.i r0 = (kotlinx.coroutines.channels.C5880i) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.mo4841c()
            if (r5 == 0) goto L22
            e7.b r5 = r7.m4840b()
            kotlinx.coroutines.channels.i r5 = (kotlinx.coroutines.channels.C5880i) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.channels.C5873b.f9301h
            java.lang.Object r6 = r5.get(r4)
            e7.p r6 = (p054e7.AbstractC5484p) r6
            long r0 = r6.f8478c
            long r2 = r7.f8478c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.m4866i()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.m4862e()
            if (r5 == 0) goto L49
            r6.m4842d()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.m4862e()
            if (r5 == 0) goto L22
            r7.m4842d()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C5873b.m5502z(long, kotlinx.coroutines.channels.i):void");
    }
}
