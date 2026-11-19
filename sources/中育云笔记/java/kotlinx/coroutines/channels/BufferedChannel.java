package kotlinx.coroutines.channels;

import ae.C0111g;
import ae.C0113i;
import ae.InterfaceC0110f;
import ae.InterfaceC0112h;
import ae.InterfaceC0115k;
import androidx.collection.SieveCacheKt;
import androidx.concurrent.futures.AbstractC3223a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.AbstractC9962d0;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.C9997c;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.InterfaceC10000a;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p280od.InterfaceC10473g;
import p309qc.AbstractC10771b;
import p309qc.C10786q;
import p365ud.C11392g;
import p365ud.C11396k;
import p365ud.C11398m;
import p365ud.InterfaceC11390e;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.AbstractC11831f;
import p410xd.AbstractC11835a0;
import p410xd.AbstractC11836b;
import p410xd.AbstractC11837b0;
import p410xd.AbstractC11838c;
import p410xd.AbstractC11852j;
import p410xd.AbstractC11871v;
import p410xd.AbstractC11875z;
import sd.AbstractC11137m;
import sd.InterfaceC11125j;
import sd.InterfaceC11144n2;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public class BufferedChannel implements InterfaceC10000a {

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f23524f = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "sendersAndCloseStatus$volatile");

    /* renamed from: g */
    public static final /* synthetic */ AtomicLongFieldUpdater f23525g = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "receivers$volatile");

    /* renamed from: h */
    public static final /* synthetic */ AtomicLongFieldUpdater f23526h = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "bufferEnd$volatile");

    /* renamed from: i */
    public static final /* synthetic */ AtomicLongFieldUpdater f23527i = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: j */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23528j = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "sendSegment$volatile");

    /* renamed from: k */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23529k = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "receiveSegment$volatile");

    /* renamed from: l */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23530l = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: m */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23531m = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "_closeCause$volatile");

    /* renamed from: n */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23532n = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* renamed from: c */
    public final int f23533c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* renamed from: d */
    public final InterfaceC9540l f23534d;

    /* renamed from: e */
    public final InterfaceC9545q f23535e;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* renamed from: kotlinx.coroutines.channels.BufferedChannel$a */
    public final class C9998a implements InterfaceC11390e, InterfaceC11144n2 {

        /* renamed from: c */
        public Object f23536c = BufferedChannelKt.f23570p;

        /* renamed from: d */
        public C9997c f23537d;

        public C9998a() {
        }

        @Override // p365ud.InterfaceC11390e
        /* renamed from: a */
        public Object mo20669a(InterfaceC11588c interfaceC11588c) throws Throwable {
            C11392g c11392gM20619W;
            boolean zM20671g = true;
            if (this.f23536c == BufferedChannelKt.f23570p || this.f23536c == BufferedChannelKt.m20711z()) {
                BufferedChannel bufferedChannel = BufferedChannel.this;
                C11392g c11392g = (C11392g) BufferedChannel.m20562f0().get(bufferedChannel);
                while (!bufferedChannel.m20658t0()) {
                    long andIncrement = BufferedChannel.m20565g0().getAndIncrement(bufferedChannel);
                    int i10 = BufferedChannelKt.f23556b;
                    long j10 = andIncrement / i10;
                    int i11 = (int) (andIncrement % i10);
                    if (c11392g.f28135e != j10) {
                        c11392gM20619W = bufferedChannel.m20619W(j10, c11392g);
                        if (c11392gM20619W == null) {
                            continue;
                        }
                    } else {
                        c11392gM20619W = c11392g;
                    }
                    Object objM20648n1 = bufferedChannel.m20648n1(c11392gM20619W, i11, andIncrement, null);
                    if (objM20648n1 == BufferedChannelKt.f23567m) {
                        throw new IllegalStateException("unreachable");
                    }
                    if (objM20648n1 == BufferedChannelKt.f23569o) {
                        if (andIncrement < bufferedChannel.m20644l0()) {
                            c11392gM20619W.m26236c();
                        }
                        c11392g = c11392gM20619W;
                    } else {
                        if (objM20648n1 == BufferedChannelKt.f23568n) {
                            return m20670e(c11392gM20619W, i11, andIncrement, interfaceC11588c);
                        }
                        c11392gM20619W.m26236c();
                        this.f23536c = objM20648n1;
                    }
                }
                zM20671g = m20671g();
            }
            return AbstractC11826a.m26206a(zM20671g);
        }

        /* renamed from: e */
        public final Object m20670e(C11392g c11392g, int i10, long j10, InterfaceC11588c interfaceC11588c) throws Throwable {
            Boolean boolM26206a;
            C11392g c11392gM20619W;
            BufferedChannel bufferedChannel = BufferedChannel.this;
            C9997c c9997cM24757b = AbstractC11137m.m24757b(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c));
            try {
                this.f23537d = c9997cM24757b;
                try {
                    Object objM20648n1 = bufferedChannel.m20648n1(c11392g, i10, j10, this);
                    if (objM20648n1 == BufferedChannelKt.f23567m) {
                        bufferedChannel.m20609Q0(this, c11392g, i10);
                    } else {
                        InterfaceC9545q interfaceC9545qM20593H = null;
                        if (objM20648n1 == BufferedChannelKt.f23569o) {
                            if (j10 < bufferedChannel.m20644l0()) {
                                c11392g.m26236c();
                            }
                            C11392g c11392g2 = (C11392g) BufferedChannel.m20562f0().get(bufferedChannel);
                            while (true) {
                                if (bufferedChannel.m20658t0()) {
                                    m20672h();
                                    break;
                                }
                                long andIncrement = BufferedChannel.m20565g0().getAndIncrement(bufferedChannel);
                                int i11 = BufferedChannelKt.f23556b;
                                long j11 = andIncrement / i11;
                                int i12 = (int) (andIncrement % i11);
                                if (c11392g2.f28135e != j11) {
                                    c11392gM20619W = bufferedChannel.m20619W(j11, c11392g2);
                                    if (c11392gM20619W == null) {
                                    }
                                } else {
                                    c11392gM20619W = c11392g2;
                                }
                                Object objM20648n12 = bufferedChannel.m20648n1(c11392gM20619W, i12, andIncrement, this);
                                if (objM20648n12 == BufferedChannelKt.f23567m) {
                                    bufferedChannel.m20609Q0(this, c11392gM20619W, i12);
                                    break;
                                }
                                if (objM20648n12 == BufferedChannelKt.f23569o) {
                                    if (andIncrement < bufferedChannel.m20644l0()) {
                                        c11392gM20619W.m26236c();
                                    }
                                    c11392g2 = c11392gM20619W;
                                } else {
                                    if (objM20648n12 == BufferedChannelKt.f23568n) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    c11392gM20619W.m26236c();
                                    this.f23536c = objM20648n12;
                                    this.f23537d = null;
                                    boolM26206a = AbstractC11826a.m26206a(true);
                                    InterfaceC9540l interfaceC9540l = bufferedChannel.f23534d;
                                    if (interfaceC9540l != null) {
                                        interfaceC9545qM20593H = bufferedChannel.m20593H(interfaceC9540l, objM20648n12);
                                    }
                                }
                            }
                        } else {
                            c11392g.m26236c();
                            this.f23536c = objM20648n1;
                            this.f23537d = null;
                            boolM26206a = AbstractC11826a.m26206a(true);
                            InterfaceC9540l interfaceC9540l2 = bufferedChannel.f23534d;
                            if (interfaceC9540l2 != null) {
                                interfaceC9545qM20593H = bufferedChannel.m20593H(interfaceC9540l2, objM20648n1);
                            }
                        }
                        c9997cM24757b.mo20526k(boolM26206a, interfaceC9545qM20593H);
                    }
                    Object objM20538x = c9997cM24757b.m20538x();
                    if (objM20538x == AbstractC11725a.m25952f()) {
                        AbstractC11831f.m26221c(interfaceC11588c);
                    }
                    return objM20538x;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    c9997cM24757b.m20511O();
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        @Override // sd.InterfaceC11144n2
        /* renamed from: f */
        public void mo20523f(AbstractC11875z abstractC11875z, int i10) {
            C9997c c9997c = this.f23537d;
            if (c9997c != null) {
                c9997c.mo20523f(abstractC11875z, i10);
            }
        }

        /* renamed from: g */
        public final boolean m20671g() throws Throwable {
            this.f23536c = BufferedChannelKt.m20711z();
            Throwable thM20627b0 = BufferedChannel.this.m20627b0();
            if (thM20627b0 == null) {
                return false;
            }
            throw AbstractC11837b0.m26232a(thM20627b0);
        }

        /* renamed from: h */
        public final void m20672h() {
            C9997c c9997c = this.f23537d;
            AbstractC9979u.m20291d(c9997c);
            this.f23537d = null;
            this.f23536c = BufferedChannelKt.m20711z();
            Throwable thM20627b0 = BufferedChannel.this.m20627b0();
            if (thM20627b0 == null) {
                Result.C9921a c9921a = Result.f23263d;
                c9997c.resumeWith(Result.m20054c(Boolean.FALSE));
            } else {
                Result.C9921a c9921a2 = Result.f23263d;
                c9997c.resumeWith(Result.m20054c(AbstractC9924b.m20070a(thM20627b0)));
            }
        }

        /* renamed from: i */
        public final boolean m20673i(Object obj) {
            C9997c c9997c = this.f23537d;
            AbstractC9979u.m20291d(c9997c);
            this.f23537d = null;
            this.f23536c = obj;
            Boolean bool = Boolean.TRUE;
            BufferedChannel bufferedChannel = BufferedChannel.this;
            InterfaceC9540l interfaceC9540l = bufferedChannel.f23534d;
            return BufferedChannelKt.m20684B(c9997c, bool, interfaceC9540l != null ? bufferedChannel.m20593H(interfaceC9540l, obj) : null);
        }

        /* renamed from: j */
        public final void m20674j() {
            C9997c c9997c = this.f23537d;
            AbstractC9979u.m20291d(c9997c);
            this.f23537d = null;
            this.f23536c = BufferedChannelKt.m20711z();
            Throwable thM20627b0 = BufferedChannel.this.m20627b0();
            if (thM20627b0 == null) {
                Result.C9921a c9921a = Result.f23263d;
                c9997c.resumeWith(Result.m20054c(Boolean.FALSE));
            } else {
                Result.C9921a c9921a2 = Result.f23263d;
                c9997c.resumeWith(Result.m20054c(AbstractC9924b.m20070a(thM20627b0)));
            }
        }

        @Override // p365ud.InterfaceC11390e
        public Object next() throws Throwable {
            Object obj = this.f23536c;
            if (obj == BufferedChannelKt.f23570p) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.f23536c = BufferedChannelKt.f23570p;
            if (obj != BufferedChannelKt.m20711z()) {
                return obj;
            }
            throw AbstractC11837b0.m26232a(BufferedChannel.this.m20632e0());
        }
    }

    public BufferedChannel(int i10, InterfaceC9540l interfaceC9540l) {
        this.f23533c = i10;
        this.f23534d = interfaceC9540l;
        if (i10 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i10 + ", should be >=0").toString());
        }
        this.bufferEnd$volatile = BufferedChannelKt.m20683A(i10);
        this.completedExpandBuffersAndPauseFlag$volatile = m20623Z();
        C11392g c11392g = new C11392g(0L, null, this, 3);
        this.sendSegment$volatile = c11392g;
        this.receiveSegment$volatile = c11392g;
        if (m20663x0()) {
            c11392g = BufferedChannelKt.f23555a;
            AbstractC9979u.m20292e(c11392g, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = c11392g;
        this.f23535e = interfaceC9540l != null ? new InterfaceC9545q() { // from class: ud.a
            @Override // p181hd.InterfaceC9545q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BufferedChannel.m20550O0(this.f27209c, (InterfaceC0115k) obj, obj2, obj3);
            }
        } : null;
        this._closeCause$volatile = BufferedChannelKt.f23573s;
    }

    /* renamed from: J */
    public static final C10786q m20549J(InterfaceC9540l interfaceC9540l, Object obj, Throwable th, Object obj2, InterfaceC9945d interfaceC9945d) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC11871v.m26349a(interfaceC9540l, obj, interfaceC9945d);
        return C10786q.f26013a;
    }

    /* renamed from: O0 */
    public static final InterfaceC9545q m20550O0(final BufferedChannel bufferedChannel, final InterfaceC0115k interfaceC0115k, Object obj, final Object obj2) {
        return new InterfaceC9545q() { // from class: ud.c
            @Override // p181hd.InterfaceC9545q
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return BufferedChannel.m20551P0(obj2, bufferedChannel, interfaceC0115k, (Throwable) obj3, obj4, (InterfaceC9945d) obj5);
            }
        };
    }

    /* renamed from: P0 */
    public static final C10786q m20551P0(Object obj, BufferedChannel bufferedChannel, InterfaceC0115k interfaceC0115k, Throwable th, Object obj2, InterfaceC9945d interfaceC9945d) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (obj != BufferedChannelKt.m20711z()) {
            AbstractC11871v.m26349a(bufferedChannel.f23534d, obj, interfaceC0115k.getContext());
        }
        return C10786q.f26013a;
    }

    /* renamed from: V0 */
    public static /* synthetic */ Object m20552V0(BufferedChannel bufferedChannel, InterfaceC11588c interfaceC11588c) throws Throwable {
        C11392g c11392g;
        C11392g c11392g2 = (C11392g) m20562f0().get(bufferedChannel);
        while (!bufferedChannel.m20658t0()) {
            long andIncrement = m20565g0().getAndIncrement(bufferedChannel);
            int i10 = BufferedChannelKt.f23556b;
            long j10 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (c11392g2.f28135e != j10) {
                C11392g c11392gM20619W = bufferedChannel.m20619W(j10, c11392g2);
                if (c11392gM20619W == null) {
                    continue;
                } else {
                    c11392g = c11392gM20619W;
                }
            } else {
                c11392g = c11392g2;
            }
            BufferedChannel bufferedChannel2 = bufferedChannel;
            Object objM20648n1 = bufferedChannel2.m20648n1(c11392g, i11, andIncrement, null);
            if (objM20648n1 == BufferedChannelKt.f23567m) {
                throw new IllegalStateException("unexpected");
            }
            if (objM20648n1 != BufferedChannelKt.f23569o) {
                if (objM20648n1 == BufferedChannelKt.f23568n) {
                    return bufferedChannel2.m20622Y0(c11392g, i11, andIncrement, interfaceC11588c);
                }
                c11392g.m26236c();
                return objM20648n1;
            }
            if (andIncrement < bufferedChannel2.m20644l0()) {
                c11392g.m26236c();
            }
            bufferedChannel = bufferedChannel2;
            c11392g2 = c11392g;
        }
        throw AbstractC11837b0.m26232a(bufferedChannel.m20632e0());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: W0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object m20553W0(kotlinx.coroutines.channels.BufferedChannel r13, vc.InterfaceC11588c r14) throws java.lang.Throwable {
        /*
            boolean r0 = r14 instanceof kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1
            if (r0 == 0) goto L14
            r0 = r14
            kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 r0 = (kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1) r0
            int r1 = r0.f23547e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f23547e = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 r0 = new kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f23545c
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r6.f23547e
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            kotlin.AbstractC9924b.m20071b(r14)
            kotlinx.coroutines.channels.c r14 = (kotlinx.coroutines.channels.C10002c) r14
            java.lang.Object r13 = r14.m20734l()
            return r13
        L31:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L39:
            kotlin.AbstractC9924b.m20071b(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = m20573o()
            java.lang.Object r14 = r14.get(r13)
            ud.g r14 = (p365ud.C11392g) r14
        L46:
            boolean r1 = r13.m20658t0()
            if (r1 == 0) goto L57
            kotlinx.coroutines.channels.c$b r14 = kotlinx.coroutines.channels.C10002c.f23583b
            java.lang.Throwable r13 = r13.m20627b0()
            java.lang.Object r13 = r14.m20735a(r13)
            return r13
        L57:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = m20574p()
            long r4 = r1.getAndIncrement(r13)
            int r1 = kotlinx.coroutines.channels.BufferedChannelKt.f23556b
            long r7 = (long) r1
            long r7 = r4 / r7
            long r9 = (long) r1
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r14.f28135e
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L77
            ud.g r1 = m20569l(r13, r7, r14)
            if (r1 != 0) goto L75
            goto L46
        L75:
            r8 = r1
            goto L78
        L77:
            r8 = r14
        L78:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = m20547F(r7, r8, r9, r10, r12)
            r1 = r7
            xd.c0 r14 = kotlinx.coroutines.channels.BufferedChannelKt.m20703r()
            if (r13 == r14) goto Lb6
            xd.c0 r14 = kotlinx.coroutines.channels.BufferedChannelKt.m20693h()
            if (r13 != r14) goto L9b
            long r13 = r1.m20644l0()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L98
            r8.m26236c()
        L98:
            r13 = r1
            r14 = r8
            goto L46
        L9b:
            xd.c0 r14 = kotlinx.coroutines.channels.BufferedChannelKt.m20704s()
            if (r13 != r14) goto Lac
            r6.f23547e = r2
            r2 = r8
            java.lang.Object r13 = r1.m20621X0(r2, r3, r4, r6)
            if (r13 != r0) goto Lab
            return r0
        Lab:
            return r13
        Lac:
            r8.m26236c()
            kotlinx.coroutines.channels.c$b r14 = kotlinx.coroutines.channels.C10002c.f23583b
            java.lang.Object r13 = r14.m20737c(r13)
            return r13
        Lb6:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.m20553W0(kotlinx.coroutines.channels.BufferedChannel, vc.c):java.lang.Object");
    }

    /* renamed from: f0 */
    public static final /* synthetic */ AtomicReferenceFieldUpdater m20562f0() {
        return f23529k;
    }

    /* renamed from: f1 */
    public static /* synthetic */ Object m20563f1(BufferedChannel bufferedChannel, Object obj, InterfaceC11588c interfaceC11588c) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C11392g c11392g;
        C11392g c11392g2 = (C11392g) m20566j0().get(bufferedChannel);
        while (true) {
            long andIncrement = m20568k0().getAndIncrement(bufferedChannel);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zM20661v0 = bufferedChannel.m20661v0(andIncrement);
            int i10 = BufferedChannelKt.f23556b;
            long j11 = j10 / i10;
            int i11 = (int) (j10 % i10);
            if (c11392g2.f28135e != j11) {
                C11392g c11392gM20620X = bufferedChannel.m20620X(j11, c11392g2);
                if (c11392gM20620X != null) {
                    c11392g = c11392gM20620X;
                } else if (zM20661v0) {
                    Object objM20599K0 = bufferedChannel.m20599K0(obj, interfaceC11588c);
                    if (objM20599K0 == AbstractC11725a.m25952f()) {
                        return objM20599K0;
                    }
                }
            } else {
                c11392g = c11392g2;
            }
            BufferedChannel bufferedChannel2 = bufferedChannel;
            Object obj2 = obj;
            int iM20651p1 = bufferedChannel2.m20651p1(c11392g, i11, obj2, j10, null, zM20661v0);
            if (iM20651p1 == 0) {
                c11392g.m26236c();
                break;
            }
            if (iM20651p1 == 1) {
                break;
            }
            if (iM20651p1 != 2) {
                if (iM20651p1 == 3) {
                    Object objM20634g1 = bufferedChannel2.m20634g1(c11392g, i11, obj2, j10, interfaceC11588c);
                    if (objM20634g1 == AbstractC11725a.m25952f()) {
                        return objM20634g1;
                    }
                } else if (iM20651p1 != 4) {
                    if (iM20651p1 == 5) {
                        c11392g.m26236c();
                    }
                    bufferedChannel = bufferedChannel2;
                    c11392g2 = c11392g;
                    obj = obj2;
                } else {
                    if (j10 < bufferedChannel2.m20636h0()) {
                        c11392g.m26236c();
                    }
                    Object objM20599K02 = bufferedChannel2.m20599K0(obj2, interfaceC11588c);
                    if (objM20599K02 == AbstractC11725a.m25952f()) {
                        return objM20599K02;
                    }
                }
            } else if (zM20661v0) {
                c11392g.m26357t();
                Object objM20599K03 = bufferedChannel2.m20599K0(obj2, interfaceC11588c);
                if (objM20599K03 == AbstractC11725a.m25952f()) {
                    return objM20599K03;
                }
            }
        }
        return C10786q.f26013a;
    }

    /* renamed from: g0 */
    public static final /* synthetic */ AtomicLongFieldUpdater m20565g0() {
        return f23525g;
    }

    /* renamed from: j0 */
    public static final /* synthetic */ AtomicReferenceFieldUpdater m20566j0() {
        return f23528j;
    }

    /* renamed from: k0 */
    public static final /* synthetic */ AtomicLongFieldUpdater m20568k0() {
        return f23524f;
    }

    /* renamed from: p0 */
    public static /* synthetic */ void m20575p0(BufferedChannel bufferedChannel, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i10 & 1) != 0) {
            j10 = 1;
        }
        bufferedChannel.m20649o0(j10);
    }

    /* renamed from: A0 */
    public final void m20586A0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f23524f;
        do {
            j10 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, BufferedChannelKt.m20708w(1152921504606846975L & j10, 3)));
    }

    /* renamed from: B0 */
    public final void m20587B0() {
        long j10;
        long jM20708w;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f23524f;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 >> 60);
            if (i10 == 0) {
                jM20708w = BufferedChannelKt.m20708w(1152921504606846975L & j10, 2);
            } else if (i10 != 1) {
                return;
            } else {
                jM20708w = BufferedChannelKt.m20708w(1152921504606846975L & j10, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, jM20708w));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /* renamed from: C0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m20588C0(long r5, p365ud.C11392g r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f28135e
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            xd.c r0 = r7.m26239f()
            ud.g r0 = (p365ud.C11392g) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.mo26242k()
            if (r5 == 0) goto L22
            xd.c r5 = r7.m26239f()
            ud.g r5 = (p365ud.C11392g) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = m20556a0()
        L26:
            java.lang.Object r6 = r5.get(r4)
            xd.z r6 = (p410xd.AbstractC11875z) r6
            long r0 = r6.f28135e
            long r2 = r7.f28135e
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L35
            return
        L35:
            boolean r0 = r7.m26358u()
            if (r0 != 0) goto L3c
            goto L11
        L3c:
            boolean r0 = androidx.concurrent.futures.AbstractC3223a.m1395a(r5, r4, r6, r7)
            if (r0 == 0) goto L4c
            boolean r5 = r6.m26356p()
            if (r5 == 0) goto L4b
            r6.m26245n()
        L4b:
            return
        L4c:
            boolean r6 = r7.m26356p()
            if (r6 == 0) goto L26
            r7.m26245n()
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.m20588C0(long, ud.g):void");
    }

    /* renamed from: D0 */
    public final void m20589D0(Throwable th, Object obj, InterfaceC9945d interfaceC9945d) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        InterfaceC9540l interfaceC9540l = this.f23534d;
        AbstractC9979u.m20291d(interfaceC9540l);
        Object objM20728f = C10002c.m20728f(obj);
        AbstractC9979u.m20291d(objM20728f);
        AbstractC11871v.m26349a(interfaceC9540l, objM20728f, interfaceC9945d);
    }

    /* renamed from: E0 */
    public final void m20590E0(Throwable th, Object obj, InterfaceC9945d interfaceC9945d) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        InterfaceC9540l interfaceC9540l = this.f23534d;
        AbstractC9979u.m20291d(interfaceC9540l);
        AbstractC11871v.m26349a(interfaceC9540l, obj, interfaceC9945d);
    }

    /* renamed from: F0 */
    public void m20591F0() {
    }

    /* renamed from: G0 */
    public final void m20592G0(InterfaceC11125j interfaceC11125j) {
        Result.C9921a c9921a = Result.f23263d;
        interfaceC11125j.resumeWith(Result.m20054c(C10002c.m20724b(C10002c.f23583b.m20735a(m20627b0()))));
    }

    /* renamed from: H */
    public final InterfaceC9545q m20593H(final InterfaceC9540l interfaceC9540l, final Object obj) {
        return new InterfaceC9545q() { // from class: ud.b
            @Override // p181hd.InterfaceC9545q
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                return BufferedChannel.m20549J(interfaceC9540l, obj, (Throwable) obj2, obj3, (InterfaceC9945d) obj4);
            }
        };
    }

    /* renamed from: H0 */
    public final void m20594H0(InterfaceC11125j interfaceC11125j) {
        Result.C9921a c9921a = Result.f23263d;
        interfaceC11125j.resumeWith(Result.m20054c(AbstractC9924b.m20070a(m20632e0())));
    }

    /* renamed from: I */
    public final InterfaceC10473g m20595I(InterfaceC9540l interfaceC9540l) {
        return new BufferedChannel$bindCancellationFun$2(this);
    }

    /* renamed from: I0 */
    public final void m20596I0(InterfaceC0115k interfaceC0115k) {
        interfaceC0115k.mo286b(BufferedChannelKt.m20711z());
    }

    /* renamed from: J0 */
    public final void m20597J0(Object obj, InterfaceC0115k interfaceC0115k) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        InterfaceC9540l interfaceC9540l = this.f23534d;
        if (interfaceC9540l != null) {
            AbstractC11871v.m26349a(interfaceC9540l, obj, interfaceC0115k.getContext());
        }
        interfaceC0115k.mo286b(BufferedChannelKt.m20711z());
    }

    /* renamed from: K */
    public final InterfaceC10473g m20598K(InterfaceC9540l interfaceC9540l) {
        return new BufferedChannel$bindCancellationFunResult$1(this);
    }

    /* renamed from: K0 */
    public final Object m20599K0(Object obj, InterfaceC11588c interfaceC11588c) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        UndeliveredElementException undeliveredElementExceptionM26351c;
        C9997c c9997c = new C9997c(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c), 1);
        c9997c.m20503F();
        InterfaceC9540l interfaceC9540l = this.f23534d;
        if (interfaceC9540l == null || (undeliveredElementExceptionM26351c = AbstractC11871v.m26351c(interfaceC9540l, obj, null, 2, null)) == null) {
            Throwable thM20639i0 = m20639i0();
            Result.C9921a c9921a = Result.f23263d;
            c9997c.resumeWith(Result.m20054c(AbstractC9924b.m20070a(thM20639i0)));
        } else {
            AbstractC10771b.m22973a(undeliveredElementExceptionM26351c, m20639i0());
            Result.C9921a c9921a2 = Result.f23263d;
            c9997c.resumeWith(Result.m20054c(AbstractC9924b.m20070a(undeliveredElementExceptionM26351c)));
        }
        Object objM20538x = c9997c.m20538x();
        if (objM20538x == AbstractC11725a.m25952f()) {
            AbstractC11831f.m26221c(interfaceC11588c);
        }
        return objM20538x == AbstractC11725a.m25952f() ? objM20538x : C10786q.f26013a;
    }

    /* renamed from: L */
    public final boolean m20600L(long j10) {
        return j10 < m20623Z() || j10 < m20636h0() + ((long) this.f23533c);
    }

    /* renamed from: L0 */
    public final void m20601L0(Object obj, InterfaceC11125j interfaceC11125j) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        InterfaceC9540l interfaceC9540l = this.f23534d;
        if (interfaceC9540l != null) {
            AbstractC11871v.m26349a(interfaceC9540l, obj, interfaceC11125j.getContext());
        }
        Throwable thM20639i0 = m20639i0();
        Result.C9921a c9921a = Result.f23263d;
        interfaceC11125j.resumeWith(Result.m20054c(AbstractC9924b.m20070a(thM20639i0)));
    }

    /* renamed from: M */
    public boolean m20602M(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return m20607P(th, true);
    }

    /* renamed from: M0 */
    public void m20603M0() {
    }

    /* renamed from: N */
    public final void m20604N(C11392g c11392g, long j10) {
        Object objM26283b = AbstractC11852j.m26283b(null, 1, null);
        loop0: while (c11392g != null) {
            for (int i10 = BufferedChannelKt.f23556b - 1; -1 < i10; i10--) {
                if ((c11392g.f28135e * BufferedChannelKt.f23556b) + i10 < j10) {
                    break loop0;
                }
                while (true) {
                    Object objM25344B = c11392g.m25344B(i10);
                    if (objM25344B != null && objM25344B != BufferedChannelKt.f23559e) {
                        if (!(objM25344B instanceof C11398m)) {
                            if (!(objM25344B instanceof InterfaceC11144n2)) {
                                break;
                            }
                            if (c11392g.m25350v(i10, objM25344B, BufferedChannelKt.m20711z())) {
                                objM26283b = AbstractC11852j.m26284c(objM26283b, objM25344B);
                                c11392g.m25345C(i10, true);
                                break;
                            }
                        } else {
                            if (c11392g.m25350v(i10, objM25344B, BufferedChannelKt.m20711z())) {
                                objM26283b = AbstractC11852j.m26284c(objM26283b, ((C11398m) objM25344B).f27219a);
                                c11392g.m25345C(i10, true);
                                break;
                            }
                        }
                    } else {
                        if (c11392g.m25350v(i10, objM25344B, BufferedChannelKt.m20711z())) {
                            c11392g.m26357t();
                            break;
                        }
                    }
                }
            }
            c11392g = (C11392g) c11392g.m26241h();
        }
        if (objM26283b != null) {
            if (!(objM26283b instanceof ArrayList)) {
                m20629c1((InterfaceC11144n2) objM26283b);
                return;
            }
            AbstractC9979u.m20292e(objM26283b, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ArrayList arrayList = (ArrayList) objM26283b;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                m20629c1((InterfaceC11144n2) arrayList.get(size));
            }
        }
    }

    /* renamed from: N0 */
    public void m20605N0() {
    }

    /* renamed from: O */
    public final C11392g m20606O() {
        Object obj = f23530l.get(this);
        C11392g c11392g = (C11392g) f23528j.get(this);
        if (c11392g.f28135e > ((C11392g) obj).f28135e) {
            obj = c11392g;
        }
        C11392g c11392g2 = (C11392g) f23529k.get(this);
        if (c11392g2.f28135e > ((C11392g) obj).f28135e) {
            obj = c11392g2;
        }
        return (C11392g) AbstractC11836b.m26230b((AbstractC11838c) obj);
    }

    /* renamed from: P */
    public boolean m20607P(Throwable th, boolean z10) {
        if (z10) {
            m20665z0();
        }
        boolean zM1395a = AbstractC3223a.m1395a(f23531m, this, BufferedChannelKt.f23573s, th);
        if (z10) {
            m20586A0();
        } else {
            m20587B0();
        }
        m20612S();
        m20591F0();
        if (zM1395a) {
            m20652q0();
        }
        return zM1395a;
    }

    /* renamed from: Q */
    public final void m20608Q(long j10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        m20628b1(m20610R(j10));
    }

    /* renamed from: Q0 */
    public final void m20609Q0(InterfaceC11144n2 interfaceC11144n2, C11392g c11392g, int i10) {
        m20605N0();
        interfaceC11144n2.mo20523f(c11392g, i10);
    }

    /* renamed from: R */
    public final C11392g m20610R(long j10) {
        C11392g c11392gM20606O = m20606O();
        if (mo20662w0()) {
            long jM20664y0 = m20664y0(c11392gM20606O);
            if (jM20664y0 != -1) {
                m20614T(jM20664y0);
            }
        }
        m20604N(c11392gM20606O, j10);
        return c11392gM20606O;
    }

    /* renamed from: R0 */
    public final void m20611R0(InterfaceC11144n2 interfaceC11144n2, C11392g c11392g, int i10) {
        interfaceC11144n2.mo20523f(c11392g, i10 + BufferedChannelKt.f23556b);
    }

    /* renamed from: S */
    public final void m20612S() {
        isClosedForSend();
    }

    /* renamed from: S0 */
    public final Object m20613S0(Object obj, Object obj2) throws Throwable {
        if (obj2 != BufferedChannelKt.m20711z()) {
            return obj2;
        }
        throw m20632e0();
    }

    /* renamed from: T */
    public final void m20614T(long j10) {
        C11392g c11392gM20619W;
        UndeliveredElementException undeliveredElementExceptionM26351c;
        C11392g c11392g = (C11392g) f23529k.get(this);
        while (true) {
            long j11 = f23525g.get(this);
            if (j10 < Math.max(this.f23533c + j11, m20623Z())) {
                return;
            }
            if (f23525g.compareAndSet(this, j11, 1 + j11)) {
                int i10 = BufferedChannelKt.f23556b;
                long j12 = j11 / i10;
                int i11 = (int) (j11 % i10);
                if (c11392g.f28135e != j12) {
                    c11392gM20619W = m20619W(j12, c11392g);
                    if (c11392gM20619W == null) {
                        continue;
                    }
                } else {
                    c11392gM20619W = c11392g;
                }
                Object objM20648n1 = m20648n1(c11392gM20619W, i11, j11, null);
                if (objM20648n1 != BufferedChannelKt.f23569o) {
                    c11392gM20619W.m26236c();
                    InterfaceC9540l interfaceC9540l = this.f23534d;
                    if (interfaceC9540l != null && (undeliveredElementExceptionM26351c = AbstractC11871v.m26351c(interfaceC9540l, objM20648n1, null, 2, null)) != null) {
                        throw undeliveredElementExceptionM26351c;
                    }
                } else if (j11 < m20644l0()) {
                    c11392gM20619W.m26236c();
                }
                c11392g = c11392gM20619W;
            }
        }
    }

    /* renamed from: T0 */
    public final Object m20615T0(Object obj, Object obj2) {
        return C10002c.m20724b(obj2 == BufferedChannelKt.m20711z() ? C10002c.f23583b.m20735a(m20627b0()) : C10002c.f23583b.m20737c(obj2));
    }

    /* renamed from: U */
    public final void m20616U() {
        if (m20663x0()) {
            return;
        }
        C11392g c11392g = (C11392g) f23530l.get(this);
        while (true) {
            long andIncrement = f23526h.getAndIncrement(this);
            int i10 = BufferedChannelKt.f23556b;
            long j10 = andIncrement / i10;
            if (m20644l0() <= andIncrement) {
                if (c11392g.f28135e < j10 && c11392g.m26239f() != null) {
                    m20588C0(j10, c11392g);
                }
                m20575p0(this, 0L, 1, null);
                return;
            }
            if (c11392g.f28135e != j10) {
                C11392g c11392gM20618V = m20618V(j10, c11392g, andIncrement);
                if (c11392gM20618V == null) {
                    continue;
                } else {
                    c11392g = c11392gM20618V;
                }
            }
            if (m20645l1(c11392g, (int) (andIncrement % i10), andIncrement)) {
                m20575p0(this, 0L, 1, null);
                return;
            }
            m20575p0(this, 0L, 1, null);
        }
    }

    /* renamed from: U0 */
    public final Object m20617U0(Object obj, Object obj2) throws Throwable {
        if (obj2 != BufferedChannelKt.m20711z()) {
            return this;
        }
        throw m20639i0();
    }

    /* renamed from: V */
    public final C11392g m20618V(long j10, C11392g c11392g, long j11) {
        Object objM26231c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23530l;
        InterfaceC9544p interfaceC9544p = (InterfaceC9544p) BufferedChannelKt.m20710y();
        loop0: while (true) {
            objM26231c = AbstractC11836b.m26231c(c11392g, j10, interfaceC9544p);
            if (!AbstractC11835a0.m26228c(objM26231c)) {
                AbstractC11875z abstractC11875zM26227b = AbstractC11835a0.m26227b(objM26231c);
                while (true) {
                    AbstractC11875z abstractC11875z = (AbstractC11875z) atomicReferenceFieldUpdater.get(this);
                    if (abstractC11875z.f28135e >= abstractC11875zM26227b.f28135e) {
                        break loop0;
                    }
                    if (!abstractC11875zM26227b.m26358u()) {
                        break;
                    }
                    if (AbstractC3223a.m1395a(atomicReferenceFieldUpdater, this, abstractC11875z, abstractC11875zM26227b)) {
                        if (abstractC11875z.m26356p()) {
                            abstractC11875z.m26245n();
                        }
                    } else if (abstractC11875zM26227b.m26356p()) {
                        abstractC11875zM26227b.m26245n();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC11835a0.m26228c(objM26231c)) {
            m20612S();
            m20588C0(j10, c11392g);
            m20575p0(this, 0L, 1, null);
            return null;
        }
        C11392g c11392g2 = (C11392g) AbstractC11835a0.m26227b(objM26231c);
        if (c11392g2.f28135e <= j10) {
            return c11392g2;
        }
        long j12 = c11392g2.f28135e;
        int i10 = BufferedChannelKt.f23556b;
        if (f23526h.compareAndSet(this, j11 + 1, j12 * i10)) {
            m20649o0((c11392g2.f28135e * i10) - j11);
        } else {
            m20575p0(this, 0L, 1, null);
        }
        return null;
    }

    /* renamed from: W */
    public final C11392g m20619W(long j10, C11392g c11392g) {
        Object objM26231c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23529k;
        InterfaceC9544p interfaceC9544p = (InterfaceC9544p) BufferedChannelKt.m20710y();
        loop0: while (true) {
            objM26231c = AbstractC11836b.m26231c(c11392g, j10, interfaceC9544p);
            if (!AbstractC11835a0.m26228c(objM26231c)) {
                AbstractC11875z abstractC11875zM26227b = AbstractC11835a0.m26227b(objM26231c);
                while (true) {
                    AbstractC11875z abstractC11875z = (AbstractC11875z) atomicReferenceFieldUpdater.get(this);
                    if (abstractC11875z.f28135e >= abstractC11875zM26227b.f28135e) {
                        break loop0;
                    }
                    if (!abstractC11875zM26227b.m26358u()) {
                        break;
                    }
                    if (AbstractC3223a.m1395a(atomicReferenceFieldUpdater, this, abstractC11875z, abstractC11875zM26227b)) {
                        if (abstractC11875z.m26356p()) {
                            abstractC11875z.m26245n();
                        }
                    } else if (abstractC11875zM26227b.m26356p()) {
                        abstractC11875zM26227b.m26245n();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC11835a0.m26228c(objM26231c)) {
            m20612S();
            if (c11392g.f28135e * BufferedChannelKt.f23556b < m20644l0()) {
                c11392g.m26236c();
            }
            return null;
        }
        C11392g c11392g2 = (C11392g) AbstractC11835a0.m26227b(objM26231c);
        if (!m20663x0() && j10 <= m20623Z() / BufferedChannelKt.f23556b) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f23530l;
            while (true) {
                AbstractC11875z abstractC11875z2 = (AbstractC11875z) atomicReferenceFieldUpdater2.get(this);
                if (abstractC11875z2.f28135e >= c11392g2.f28135e || !c11392g2.m26358u()) {
                    break;
                }
                if (AbstractC3223a.m1395a(atomicReferenceFieldUpdater2, this, abstractC11875z2, c11392g2)) {
                    if (abstractC11875z2.m26356p()) {
                        abstractC11875z2.m26245n();
                    }
                } else if (c11392g2.m26356p()) {
                    c11392g2.m26245n();
                }
            }
        }
        long j11 = c11392g2.f28135e;
        if (j11 <= j10) {
            return c11392g2;
        }
        int i10 = BufferedChannelKt.f23556b;
        m20655r1(j11 * i10);
        if (c11392g2.f28135e * i10 < m20644l0()) {
            c11392g2.m26236c();
        }
        return null;
    }

    /* renamed from: X */
    public final C11392g m20620X(long j10, C11392g c11392g) {
        Object objM26231c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23528j;
        InterfaceC9544p interfaceC9544p = (InterfaceC9544p) BufferedChannelKt.m20710y();
        loop0: while (true) {
            objM26231c = AbstractC11836b.m26231c(c11392g, j10, interfaceC9544p);
            if (!AbstractC11835a0.m26228c(objM26231c)) {
                AbstractC11875z abstractC11875zM26227b = AbstractC11835a0.m26227b(objM26231c);
                while (true) {
                    AbstractC11875z abstractC11875z = (AbstractC11875z) atomicReferenceFieldUpdater.get(this);
                    if (abstractC11875z.f28135e >= abstractC11875zM26227b.f28135e) {
                        break loop0;
                    }
                    if (!abstractC11875zM26227b.m26358u()) {
                        break;
                    }
                    if (AbstractC3223a.m1395a(atomicReferenceFieldUpdater, this, abstractC11875z, abstractC11875zM26227b)) {
                        if (abstractC11875z.m26356p()) {
                            abstractC11875z.m26245n();
                        }
                    } else if (abstractC11875zM26227b.m26356p()) {
                        abstractC11875zM26227b.m26245n();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC11835a0.m26228c(objM26231c)) {
            m20612S();
            if (c11392g.f28135e * BufferedChannelKt.f23556b < m20636h0()) {
                c11392g.m26236c();
            }
            return null;
        }
        C11392g c11392g2 = (C11392g) AbstractC11835a0.m26227b(objM26231c);
        long j11 = c11392g2.f28135e;
        if (j11 <= j10) {
            return c11392g2;
        }
        int i10 = BufferedChannelKt.f23556b;
        m20657s1(j11 * i10);
        if (c11392g2.f28135e * i10 < m20636h0()) {
            c11392g2.m26236c();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: X0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m20621X0(p365ud.C11392g r11, int r12, long r13, vc.InterfaceC11588c r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.m20621X0(ud.g, int, long, vc.c):java.lang.Object");
    }

    /* renamed from: Y0 */
    public final Object m20622Y0(C11392g c11392g, int i10, long j10, InterfaceC11588c interfaceC11588c) {
        InterfaceC9545q interfaceC9545q;
        C11392g c11392g2;
        C9997c c9997cM24757b = AbstractC11137m.m24757b(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c));
        try {
            Object objM20648n1 = m20648n1(c11392g, i10, j10, c9997cM24757b);
            if (objM20648n1 == BufferedChannelKt.f23567m) {
                m20609Q0(c9997cM24757b, c11392g, i10);
            } else {
                if (objM20648n1 == BufferedChannelKt.f23569o) {
                    if (j10 < m20644l0()) {
                        c11392g.m26236c();
                    }
                    C11392g c11392g3 = (C11392g) m20562f0().get(this);
                    while (true) {
                        if (m20658t0()) {
                            m20594H0(c9997cM24757b);
                            break;
                        }
                        long andIncrement = m20565g0().getAndIncrement(this);
                        int i11 = BufferedChannelKt.f23556b;
                        long j11 = andIncrement / i11;
                        int i12 = (int) (andIncrement % i11);
                        if (c11392g3.f28135e != j11) {
                            C11392g c11392gM20619W = m20619W(j11, c11392g3);
                            if (c11392gM20619W != null) {
                                c11392g2 = c11392gM20619W;
                            }
                        } else {
                            c11392g2 = c11392g3;
                        }
                        objM20648n1 = m20648n1(c11392g2, i12, andIncrement, c9997cM24757b);
                        C11392g c11392g4 = c11392g2;
                        if (objM20648n1 == BufferedChannelKt.f23567m) {
                            C9997c c9997c = c9997cM24757b != null ? c9997cM24757b : null;
                            if (c9997c != null) {
                                m20609Q0(c9997c, c11392g4, i12);
                            }
                        } else if (objM20648n1 == BufferedChannelKt.f23569o) {
                            if (andIncrement < m20644l0()) {
                                c11392g4.m26236c();
                            }
                            c11392g3 = c11392g4;
                        } else {
                            if (objM20648n1 == BufferedChannelKt.f23568n) {
                                throw new IllegalStateException("unexpected");
                            }
                            c11392g4.m26236c();
                            InterfaceC9540l interfaceC9540l = this.f23534d;
                            interfaceC9545q = (InterfaceC9545q) (interfaceC9540l != null ? m20595I(interfaceC9540l) : null);
                        }
                    }
                } else {
                    c11392g.m26236c();
                    InterfaceC9540l interfaceC9540l2 = this.f23534d;
                    interfaceC9545q = (InterfaceC9545q) (interfaceC9540l2 != null ? m20595I(interfaceC9540l2) : null);
                }
                c9997cM24757b.mo20526k(objM20648n1, interfaceC9545q);
            }
            Object objM20538x = c9997cM24757b.m20538x();
            if (objM20538x == AbstractC11725a.m25952f()) {
                AbstractC11831f.m26221c(interfaceC11588c);
            }
            return objM20538x;
        } catch (Throwable th) {
            c9997cM24757b.m20511O();
            throw th;
        }
    }

    /* renamed from: Z */
    public final long m20623Z() {
        return f23526h.get(this);
    }

    /* renamed from: Z0 */
    public final void m20624Z0(InterfaceC0115k interfaceC0115k, Object obj) {
        C11392g c11392g;
        C11392g c11392g2 = (C11392g) m20562f0().get(this);
        while (!m20658t0()) {
            long andIncrement = m20565g0().getAndIncrement(this);
            int i10 = BufferedChannelKt.f23556b;
            long j10 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (c11392g2.f28135e != j10) {
                C11392g c11392gM20619W = m20619W(j10, c11392g2);
                if (c11392gM20619W == null) {
                    continue;
                } else {
                    c11392g = c11392gM20619W;
                }
            } else {
                c11392g = c11392g2;
            }
            InterfaceC0115k interfaceC0115k2 = interfaceC0115k;
            Object objM20648n1 = m20648n1(c11392g, i11, andIncrement, interfaceC0115k2);
            c11392g2 = c11392g;
            if (objM20648n1 == BufferedChannelKt.f23567m) {
                InterfaceC11144n2 interfaceC11144n2 = interfaceC0115k2 instanceof InterfaceC11144n2 ? (InterfaceC11144n2) interfaceC0115k2 : null;
                if (interfaceC11144n2 != null) {
                    m20609Q0(interfaceC11144n2, c11392g2, i11);
                    return;
                }
                return;
            }
            if (objM20648n1 != BufferedChannelKt.f23569o) {
                if (objM20648n1 == BufferedChannelKt.f23568n) {
                    throw new IllegalStateException("unexpected");
                }
                c11392g2.m26236c();
                interfaceC0115k2.mo286b(objM20648n1);
                return;
            }
            if (andIncrement < m20644l0()) {
                c11392g2.m26236c();
            }
            interfaceC0115k = interfaceC0115k2;
        }
        m20596I0(interfaceC0115k);
    }

    /* renamed from: a1 */
    public void mo20625a1(InterfaceC0115k interfaceC0115k, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C11392g c11392g;
        C11392g c11392g2 = (C11392g) m20566j0().get(this);
        while (true) {
            long andIncrement = m20568k0().getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zM20661v0 = m20661v0(andIncrement);
            int i10 = BufferedChannelKt.f23556b;
            long j11 = j10 / i10;
            int i11 = (int) (j10 % i10);
            if (c11392g2.f28135e != j11) {
                C11392g c11392gM20620X = m20620X(j11, c11392g2);
                if (c11392gM20620X != null) {
                    c11392g = c11392gM20620X;
                } else if (zM20661v0) {
                    m20597J0(obj, interfaceC0115k);
                    return;
                }
            } else {
                c11392g = c11392g2;
            }
            InterfaceC0115k interfaceC0115k2 = interfaceC0115k;
            Object obj2 = obj;
            int iM20651p1 = m20651p1(c11392g, i11, obj2, j10, interfaceC0115k2, zM20661v0);
            c11392g2 = c11392g;
            if (iM20651p1 == 0) {
                c11392g2.m26236c();
                interfaceC0115k2.mo286b(C10786q.f26013a);
                return;
            }
            if (iM20651p1 == 1) {
                interfaceC0115k2.mo286b(C10786q.f26013a);
                return;
            }
            if (iM20651p1 == 2) {
                if (zM20661v0) {
                    c11392g2.m26357t();
                    m20597J0(obj2, interfaceC0115k2);
                    return;
                } else {
                    InterfaceC11144n2 interfaceC11144n2 = interfaceC0115k2 instanceof InterfaceC11144n2 ? (InterfaceC11144n2) interfaceC0115k2 : null;
                    if (interfaceC11144n2 != null) {
                        m20611R0(interfaceC11144n2, c11392g2, i11);
                        return;
                    }
                    return;
                }
            }
            if (iM20651p1 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iM20651p1 == 4) {
                if (j10 < m20636h0()) {
                    c11392g2.m26236c();
                }
                m20597J0(obj2, interfaceC0115k2);
                return;
            } else {
                if (iM20651p1 == 5) {
                    c11392g2.m26236c();
                }
                obj = obj2;
                interfaceC0115k = interfaceC0115k2;
            }
        }
    }

    @Override // p365ud.InterfaceC11397l
    /* renamed from: b */
    public Object mo20626b(InterfaceC11588c interfaceC11588c) {
        return m20553W0(this, interfaceC11588c);
    }

    /* renamed from: b0 */
    public final Throwable m20627b0() {
        return (Throwable) f23531m.get(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
    
        r12 = (p365ud.C11392g) r12.m26241h();
     */
    /* renamed from: b1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m20628b1(p365ud.C11392g r12) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r11 = this;
            hd.l r0 = r11.f23534d
            r1 = 0
            r2 = 1
            java.lang.Object r3 = p410xd.AbstractC11852j.m26283b(r1, r2, r1)
        L8:
            int r4 = kotlinx.coroutines.channels.BufferedChannelKt.f23556b
            int r4 = r4 - r2
        Lb:
            r5 = -1
            if (r5 >= r4) goto Lb3
            long r6 = r12.f28135e
            int r8 = kotlinx.coroutines.channels.BufferedChannelKt.f23556b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L16:
            java.lang.Object r8 = r12.m25344B(r4)
            xd.c0 r9 = kotlinx.coroutines.channels.BufferedChannelKt.m20691f()
            if (r8 == r9) goto Lbb
            xd.c0 r9 = kotlinx.coroutines.channels.BufferedChannelKt.f23558d
            if (r8 != r9) goto L48
            long r9 = r11.m20636h0()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            xd.c0 r9 = kotlinx.coroutines.channels.BufferedChannelKt.m20711z()
            boolean r8 = r12.m25350v(r4, r8, r9)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L40
            java.lang.Object r5 = r12.m25343A(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = p410xd.AbstractC11871v.m26350b(r0, r5, r1)
        L40:
            r12.m25351w(r4)
            r12.m26357t()
            goto Laf
        L48:
            xd.c0 r9 = kotlinx.coroutines.channels.BufferedChannelKt.m20696k()
            if (r8 == r9) goto La2
            if (r8 != 0) goto L51
            goto La2
        L51:
            boolean r9 = r8 instanceof sd.InterfaceC11144n2
            if (r9 != 0) goto L6e
            boolean r9 = r8 instanceof p365ud.C11398m
            if (r9 == 0) goto L5a
            goto L6e
        L5a:
            xd.c0 r9 = kotlinx.coroutines.channels.BufferedChannelKt.m20701p()
            if (r8 == r9) goto Lbb
            xd.c0 r9 = kotlinx.coroutines.channels.BufferedChannelKt.m20702q()
            if (r8 != r9) goto L67
            goto Lbb
        L67:
            xd.c0 r9 = kotlinx.coroutines.channels.BufferedChannelKt.m20701p()
            if (r8 == r9) goto L16
            goto Laf
        L6e:
            long r9 = r11.m20636h0()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            boolean r9 = r8 instanceof p365ud.C11398m
            if (r9 == 0) goto L80
            r9 = r8
            ud.m r9 = (p365ud.C11398m) r9
            sd.n2 r9 = r9.f27219a
            goto L83
        L80:
            r9 = r8
            sd.n2 r9 = (sd.InterfaceC11144n2) r9
        L83:
            xd.c0 r10 = kotlinx.coroutines.channels.BufferedChannelKt.m20711z()
            boolean r8 = r12.m25350v(r4, r8, r10)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L97
            java.lang.Object r5 = r12.m25343A(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = p410xd.AbstractC11871v.m26350b(r0, r5, r1)
        L97:
            java.lang.Object r3 = p410xd.AbstractC11852j.m26284c(r3, r9)
            r12.m25351w(r4)
            r12.m26357t()
            goto Laf
        La2:
            xd.c0 r9 = kotlinx.coroutines.channels.BufferedChannelKt.m20711z()
            boolean r8 = r12.m25350v(r4, r8, r9)
            if (r8 == 0) goto L16
            r12.m26357t()
        Laf:
            int r4 = r4 + (-1)
            goto Lb
        Lb3:
            xd.c r12 = r12.m26241h()
            ud.g r12 = (p365ud.C11392g) r12
            if (r12 != 0) goto L8
        Lbb:
            if (r3 == 0) goto Le1
            boolean r12 = r3 instanceof java.util.ArrayList
            if (r12 != 0) goto Lc7
            sd.n2 r3 = (sd.InterfaceC11144n2) r3
            r11.m20631d1(r3)
            goto Le1
        Lc7:
            java.lang.String r12 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>"
            kotlin.jvm.internal.AbstractC9979u.m20292e(r3, r12)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r12 = r3.size()
            int r12 = r12 - r2
        Ld3:
            if (r5 >= r12) goto Le1
            java.lang.Object r0 = r3.get(r12)
            sd.n2 r0 = (sd.InterfaceC11144n2) r0
            r11.m20631d1(r0)
            int r12 = r12 + (-1)
            goto Ld3
        Le1:
            if (r1 != 0) goto Le4
            return
        Le4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.m20628b1(ud.g):void");
    }

    /* renamed from: c1 */
    public final void m20629c1(InterfaceC11144n2 interfaceC11144n2) {
        m20633e1(interfaceC11144n2, true);
    }

    @Override // p365ud.InterfaceC11397l
    public final void cancel(CancellationException cancellationException) {
        m20602M(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC10005f
    public boolean close(Throwable th) {
        return m20607P(th, false);
    }

    @Override // p365ud.InterfaceC11397l
    /* renamed from: d */
    public Object mo20630d(InterfaceC11588c interfaceC11588c) {
        return m20552V0(this, interfaceC11588c);
    }

    /* renamed from: d1 */
    public final void m20631d1(InterfaceC11144n2 interfaceC11144n2) {
        m20633e1(interfaceC11144n2, false);
    }

    /* renamed from: e0 */
    public final Throwable m20632e0() {
        Throwable thM20627b0 = m20627b0();
        return thM20627b0 == null ? new ClosedReceiveChannelException("Channel was closed") : thM20627b0;
    }

    /* renamed from: e1 */
    public final void m20633e1(InterfaceC11144n2 interfaceC11144n2, boolean z10) {
        if (interfaceC11144n2 instanceof InterfaceC11125j) {
            InterfaceC11588c interfaceC11588c = (InterfaceC11588c) interfaceC11144n2;
            Result.C9921a c9921a = Result.f23263d;
            interfaceC11588c.resumeWith(Result.m20054c(AbstractC9924b.m20070a(z10 ? m20632e0() : m20639i0())));
        } else if (interfaceC11144n2 instanceof C11396k) {
            C9997c c9997c = ((C11396k) interfaceC11144n2).f27218c;
            Result.C9921a c9921a2 = Result.f23263d;
            c9997c.resumeWith(Result.m20054c(C10002c.m20724b(C10002c.f23583b.m20735a(m20627b0()))));
        } else if (interfaceC11144n2 instanceof C9998a) {
            ((C9998a) interfaceC11144n2).m20674j();
        } else {
            if (interfaceC11144n2 instanceof InterfaceC0115k) {
                ((InterfaceC0115k) interfaceC11144n2).mo287d(this, BufferedChannelKt.m20711z());
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + interfaceC11144n2).toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /* renamed from: g1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m20634g1(p365ud.C11392g r17, int r18, java.lang.Object r19, long r20, vc.InterfaceC11588c r22) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.m20634g1(ud.g, int, java.lang.Object, long, vc.c):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.InterfaceC10005f
    public InterfaceC0112h getOnSend() {
        BufferedChannel$onSend$1 bufferedChannel$onSend$1 = BufferedChannel$onSend$1.f23543c;
        AbstractC9979u.m20292e(bufferedChannel$onSend$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        InterfaceC9545q interfaceC9545q = (InterfaceC9545q) AbstractC9962d0.m20254e(bufferedChannel$onSend$1, 3);
        BufferedChannel$onSend$2 bufferedChannel$onSend$2 = BufferedChannel$onSend$2.f23544c;
        AbstractC9979u.m20292e(bufferedChannel$onSend$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new C0113i(this, interfaceC9545q, (InterfaceC9545q) AbstractC9962d0.m20254e(bufferedChannel$onSend$2, 3), null, 8, null);
    }

    @Override // p365ud.InterfaceC11397l
    /* renamed from: h */
    public InterfaceC0110f mo20635h() {
        BufferedChannel$onReceive$1 bufferedChannel$onReceive$1 = BufferedChannel$onReceive$1.f23539c;
        AbstractC9979u.m20292e(bufferedChannel$onReceive$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        InterfaceC9545q interfaceC9545q = (InterfaceC9545q) AbstractC9962d0.m20254e(bufferedChannel$onReceive$1, 3);
        BufferedChannel$onReceive$2 bufferedChannel$onReceive$2 = BufferedChannel$onReceive$2.f23540c;
        AbstractC9979u.m20292e(bufferedChannel$onReceive$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new C0111g(this, interfaceC9545q, (InterfaceC9545q) AbstractC9962d0.m20254e(bufferedChannel$onReceive$2, 3), this.f23535e);
    }

    /* renamed from: h0 */
    public final long m20636h0() {
        return f23525g.get(this);
    }

    /* renamed from: h1 */
    public final boolean m20637h1(long j10) {
        if (m20661v0(j10)) {
            return false;
        }
        return !m20600L(j10 & 1152921504606846975L);
    }

    @Override // p365ud.InterfaceC11397l
    /* renamed from: i */
    public InterfaceC0110f mo20638i() {
        BufferedChannel$onReceiveCatching$1 bufferedChannel$onReceiveCatching$1 = BufferedChannel$onReceiveCatching$1.f23541c;
        AbstractC9979u.m20292e(bufferedChannel$onReceiveCatching$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        InterfaceC9545q interfaceC9545q = (InterfaceC9545q) AbstractC9962d0.m20254e(bufferedChannel$onReceiveCatching$1, 3);
        BufferedChannel$onReceiveCatching$2 bufferedChannel$onReceiveCatching$2 = BufferedChannel$onReceiveCatching$2.f23542c;
        AbstractC9979u.m20292e(bufferedChannel$onReceiveCatching$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new C0111g(this, interfaceC9545q, (InterfaceC9545q) AbstractC9962d0.m20254e(bufferedChannel$onReceiveCatching$2, 3), this.f23535e);
    }

    /* renamed from: i0 */
    public final Throwable m20639i0() {
        Throwable thM20627b0 = m20627b0();
        return thM20627b0 == null ? new ClosedSendChannelException("Channel was closed") : thM20627b0;
    }

    /* renamed from: i1 */
    public final boolean m20640i1(Object obj, Object obj2) {
        if (obj instanceof InterfaceC0115k) {
            return ((InterfaceC0115k) obj).mo287d(this, obj2);
        }
        if (obj instanceof C11396k) {
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            C9997c c9997c = ((C11396k) obj).f27218c;
            C10002c c10002cM20724b = C10002c.m20724b(C10002c.f23583b.m20737c(obj2));
            InterfaceC9540l interfaceC9540l = this.f23534d;
            return BufferedChannelKt.m20684B(c9997c, c10002cM20724b, (InterfaceC9545q) (interfaceC9540l != null ? m20598K(interfaceC9540l) : null));
        }
        if (obj instanceof C9998a) {
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((C9998a) obj).m20673i(obj2);
        }
        if (obj instanceof InterfaceC11125j) {
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC11125j interfaceC11125j = (InterfaceC11125j) obj;
            InterfaceC9540l interfaceC9540l2 = this.f23534d;
            return BufferedChannelKt.m20684B(interfaceC11125j, obj2, (InterfaceC9545q) (interfaceC9540l2 != null ? m20595I(interfaceC9540l2) : null));
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    @Override // kotlinx.coroutines.channels.InterfaceC10005f
    public void invokeOnClose(InterfaceC9540l interfaceC9540l) {
        if (AbstractC3223a.m1395a(f23532n, this, null, interfaceC9540l)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23532n;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != BufferedChannelKt.f23571q) {
                if (obj == BufferedChannelKt.f23572r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        } while (!AbstractC3223a.m1395a(f23532n, this, BufferedChannelKt.f23571q, BufferedChannelKt.f23572r));
        interfaceC9540l.invoke(m20627b0());
    }

    @Override // kotlinx.coroutines.channels.InterfaceC10005f
    public boolean isClosedForSend() {
        return m20661v0(f23524f.get(this));
    }

    @Override // p365ud.InterfaceC11397l
    public InterfaceC11390e iterator() {
        return new C9998a();
    }

    @Override // p365ud.InterfaceC11397l
    /* renamed from: j */
    public Object mo20641j() {
        C11392g c11392gM20619W;
        long j10 = f23525g.get(this);
        long j11 = f23524f.get(this);
        if (m20660u0(j11)) {
            return C10002c.f23583b.m20735a(m20627b0());
        }
        if (j10 >= (j11 & 1152921504606846975L)) {
            return C10002c.f23583b.m20736b();
        }
        Object obj = BufferedChannelKt.f23565k;
        C11392g c11392g = (C11392g) m20562f0().get(this);
        while (!m20658t0()) {
            long andIncrement = m20565g0().getAndIncrement(this);
            int i10 = BufferedChannelKt.f23556b;
            long j12 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (c11392g.f28135e != j12) {
                c11392gM20619W = m20619W(j12, c11392g);
                if (c11392gM20619W == null) {
                    continue;
                }
            } else {
                c11392gM20619W = c11392g;
            }
            Object objM20648n1 = m20648n1(c11392gM20619W, i11, andIncrement, obj);
            if (objM20648n1 == BufferedChannelKt.f23567m) {
                InterfaceC11144n2 interfaceC11144n2 = obj instanceof InterfaceC11144n2 ? (InterfaceC11144n2) obj : null;
                if (interfaceC11144n2 != null) {
                    m20609Q0(interfaceC11144n2, c11392gM20619W, i11);
                }
                m20659t1(andIncrement);
                c11392gM20619W.m26357t();
                return C10002c.f23583b.m20736b();
            }
            if (objM20648n1 != BufferedChannelKt.f23569o) {
                if (objM20648n1 == BufferedChannelKt.f23568n) {
                    throw new IllegalStateException("unexpected");
                }
                c11392gM20619W.m26236c();
                return C10002c.f23583b.m20737c(objM20648n1);
            }
            if (andIncrement < m20644l0()) {
                c11392gM20619W.m26236c();
            }
            c11392g = c11392gM20619W;
        }
        return C10002c.f23583b.m20735a(m20627b0());
    }

    /* renamed from: j1 */
    public final boolean m20642j1(Object obj, C11392g c11392g, int i10) {
        if (obj instanceof InterfaceC11125j) {
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return BufferedChannelKt.m20685C((InterfaceC11125j) obj, C10786q.f26013a, null, 2, null);
        }
        if (!(obj instanceof InterfaceC0115k)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        TrySelectDetailedResult trySelectDetailedResultM20988x = ((SelectImplementation) obj).m20988x(this, C10786q.f26013a);
        if (trySelectDetailedResultM20988x == TrySelectDetailedResult.f24034d) {
            c11392g.m25351w(i10);
        }
        return trySelectDetailedResultM20988x == TrySelectDetailedResult.f24033c;
    }

    /* renamed from: k1 */
    public final Object m20643k1(Object obj) {
        C11392g c11392gM20620X;
        int i10;
        BufferedChannel bufferedChannel;
        Object obj2 = BufferedChannelKt.f23558d;
        C11392g c11392g = (C11392g) m20566j0().get(this);
        while (true) {
            long andIncrement = m20568k0().getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zM20661v0 = m20661v0(andIncrement);
            int i11 = BufferedChannelKt.f23556b;
            long j11 = j10 / i11;
            int i12 = (int) (j10 % i11);
            if (c11392g.f28135e != j11) {
                c11392gM20620X = m20620X(j11, c11392g);
                if (c11392gM20620X != null) {
                    bufferedChannel = this;
                    i10 = i12;
                } else if (zM20661v0) {
                    return C10002c.f23583b.m20735a(m20639i0());
                }
            } else {
                c11392gM20620X = c11392g;
                i10 = i12;
                bufferedChannel = this;
            }
            Object obj3 = obj;
            int iM20651p1 = bufferedChannel.m20651p1(c11392gM20620X, i10, obj3, j10, obj2, zM20661v0);
            c11392g = c11392gM20620X;
            if (iM20651p1 == 0) {
                c11392g.m26236c();
                return C10002c.f23583b.m20737c(C10786q.f26013a);
            }
            if (iM20651p1 == 1) {
                return C10002c.f23583b.m20737c(C10786q.f26013a);
            }
            if (iM20651p1 == 2) {
                if (zM20661v0) {
                    c11392g.m26357t();
                    return C10002c.f23583b.m20735a(m20639i0());
                }
                InterfaceC11144n2 interfaceC11144n2 = obj2 instanceof InterfaceC11144n2 ? (InterfaceC11144n2) obj2 : null;
                if (interfaceC11144n2 != null) {
                    m20611R0(interfaceC11144n2, c11392g, i10);
                }
                m20614T((c11392g.f28135e * i11) + i10);
                return C10002c.f23583b.m20737c(C10786q.f26013a);
            }
            if (iM20651p1 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iM20651p1 == 4) {
                if (j10 < m20636h0()) {
                    c11392g.m26236c();
                }
                return C10002c.f23583b.m20735a(m20639i0());
            }
            if (iM20651p1 == 5) {
                c11392g.m26236c();
            }
            obj = obj3;
        }
    }

    /* renamed from: l0 */
    public final long m20644l0() {
        return f23524f.get(this) & 1152921504606846975L;
    }

    /* renamed from: l1 */
    public final boolean m20645l1(C11392g c11392g, int i10, long j10) {
        Object objM25344B = c11392g.m25344B(i10);
        if (!(objM25344B instanceof InterfaceC11144n2) || j10 < f23525g.get(this) || !c11392g.m25350v(i10, objM25344B, BufferedChannelKt.f23561g)) {
            return m20646m1(c11392g, i10, j10);
        }
        if (m20642j1(objM25344B, c11392g, i10)) {
            c11392g.m25348F(i10, BufferedChannelKt.f23558d);
            return true;
        }
        c11392g.m25348F(i10, BufferedChannelKt.f23564j);
        c11392g.m25345C(i10, false);
        return false;
    }

    /* renamed from: m1 */
    public final boolean m20646m1(C11392g c11392g, int i10, long j10) {
        while (true) {
            Object objM25344B = c11392g.m25344B(i10);
            if (objM25344B instanceof InterfaceC11144n2) {
                if (j10 < f23525g.get(this)) {
                    if (c11392g.m25350v(i10, objM25344B, new C11398m((InterfaceC11144n2) objM25344B))) {
                        return true;
                    }
                } else if (c11392g.m25350v(i10, objM25344B, BufferedChannelKt.f23561g)) {
                    if (m20642j1(objM25344B, c11392g, i10)) {
                        c11392g.m25348F(i10, BufferedChannelKt.f23558d);
                        return true;
                    }
                    c11392g.m25348F(i10, BufferedChannelKt.f23564j);
                    c11392g.m25345C(i10, false);
                    return false;
                }
            } else {
                if (objM25344B == BufferedChannelKt.f23564j) {
                    return false;
                }
                if (objM25344B == null) {
                    if (c11392g.m25350v(i10, objM25344B, BufferedChannelKt.f23559e)) {
                        return true;
                    }
                } else {
                    if (objM25344B == BufferedChannelKt.f23558d || objM25344B == BufferedChannelKt.f23562h || objM25344B == BufferedChannelKt.f23563i || objM25344B == BufferedChannelKt.f23565k || objM25344B == BufferedChannelKt.m20711z()) {
                        return true;
                    }
                    if (objM25344B != BufferedChannelKt.f23560f) {
                        throw new IllegalStateException(("Unexpected cell state: " + objM25344B).toString());
                    }
                }
            }
        }
    }

    /* renamed from: n0 */
    public final boolean m20647n0() {
        while (true) {
            C11392g c11392gM20619W = (C11392g) f23529k.get(this);
            long jM20636h0 = m20636h0();
            if (m20644l0() <= jM20636h0) {
                return false;
            }
            int i10 = BufferedChannelKt.f23556b;
            long j10 = jM20636h0 / i10;
            if (c11392gM20619W.f28135e == j10 || (c11392gM20619W = m20619W(j10, c11392gM20619W)) != null) {
                c11392gM20619W.m26236c();
                if (m20654r0(c11392gM20619W, (int) (jM20636h0 % i10), jM20636h0)) {
                    return true;
                }
                f23525g.compareAndSet(this, jM20636h0, 1 + jM20636h0);
            } else if (((C11392g) f23529k.get(this)).f28135e < j10) {
                return false;
            }
        }
    }

    /* renamed from: n1 */
    public final Object m20648n1(C11392g c11392g, int i10, long j10, Object obj) {
        Object objM25344B = c11392g.m25344B(i10);
        if (objM25344B == null) {
            if (j10 >= (f23524f.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return BufferedChannelKt.f23568n;
                }
                if (c11392g.m25350v(i10, objM25344B, obj)) {
                    m20616U();
                    return BufferedChannelKt.f23567m;
                }
            }
        } else if (objM25344B == BufferedChannelKt.f23558d && c11392g.m25350v(i10, objM25344B, BufferedChannelKt.f23563i)) {
            m20616U();
            return c11392g.m25346D(i10);
        }
        return m20650o1(c11392g, i10, j10, obj);
    }

    /* renamed from: o0 */
    public final void m20649o0(long j10) {
        if ((f23527i.addAndGet(this, j10) & SieveCacheKt.NodeVisitedBit) != 0) {
            while ((f23527i.get(this) & SieveCacheKt.NodeVisitedBit) != 0) {
            }
        }
    }

    /* renamed from: o1 */
    public final Object m20650o1(C11392g c11392g, int i10, long j10, Object obj) {
        while (true) {
            Object objM25344B = c11392g.m25344B(i10);
            if (objM25344B == null || objM25344B == BufferedChannelKt.f23559e) {
                if (j10 < (f23524f.get(this) & 1152921504606846975L)) {
                    if (c11392g.m25350v(i10, objM25344B, BufferedChannelKt.f23562h)) {
                        m20616U();
                        return BufferedChannelKt.f23569o;
                    }
                } else {
                    if (obj == null) {
                        return BufferedChannelKt.f23568n;
                    }
                    if (c11392g.m25350v(i10, objM25344B, obj)) {
                        m20616U();
                        return BufferedChannelKt.f23567m;
                    }
                }
            } else {
                if (objM25344B != BufferedChannelKt.f23558d) {
                    if (objM25344B != BufferedChannelKt.f23564j && objM25344B != BufferedChannelKt.f23562h) {
                        if (objM25344B == BufferedChannelKt.m20711z()) {
                            m20616U();
                            return BufferedChannelKt.f23569o;
                        }
                        if (objM25344B != BufferedChannelKt.f23561g && c11392g.m25350v(i10, objM25344B, BufferedChannelKt.f23560f)) {
                            boolean z10 = objM25344B instanceof C11398m;
                            if (z10) {
                                objM25344B = ((C11398m) objM25344B).f27219a;
                            }
                            if (m20642j1(objM25344B, c11392g, i10)) {
                                c11392g.m25348F(i10, BufferedChannelKt.f23563i);
                                m20616U();
                                return c11392g.m25346D(i10);
                            }
                            c11392g.m25348F(i10, BufferedChannelKt.f23564j);
                            c11392g.m25345C(i10, false);
                            if (z10) {
                                m20616U();
                            }
                            return BufferedChannelKt.f23569o;
                        }
                    }
                    return BufferedChannelKt.f23569o;
                }
                if (c11392g.m25350v(i10, objM25344B, BufferedChannelKt.f23563i)) {
                    m20616U();
                    return c11392g.m25346D(i10);
                }
            }
        }
    }

    @Override // kotlinx.coroutines.channels.InterfaceC10005f
    public boolean offer(Object obj) {
        return InterfaceC10000a.a.m20719a(this, obj);
    }

    /* renamed from: p1 */
    public final int m20651p1(C11392g c11392g, int i10, Object obj, long j10, Object obj2, boolean z10) {
        c11392g.m25349G(i10, obj);
        if (z10) {
            return m20653q1(c11392g, i10, obj, j10, obj2, z10);
        }
        Object objM25344B = c11392g.m25344B(i10);
        if (objM25344B == null) {
            if (m20600L(j10)) {
                if (c11392g.m25350v(i10, null, BufferedChannelKt.f23558d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (c11392g.m25350v(i10, null, obj2)) {
                    return 2;
                }
            }
        } else if (objM25344B instanceof InterfaceC11144n2) {
            c11392g.m25351w(i10);
            if (m20640i1(objM25344B, obj)) {
                c11392g.m25348F(i10, BufferedChannelKt.f23563i);
                m20603M0();
                return 0;
            }
            if (c11392g.m25352x(i10, BufferedChannelKt.f23565k) == BufferedChannelKt.f23565k) {
                return 5;
            }
            c11392g.m25345C(i10, true);
            return 5;
        }
        return m20653q1(c11392g, i10, obj, j10, obj2, z10);
    }

    /* renamed from: q0 */
    public final void m20652q0() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23532n;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!AbstractC3223a.m1395a(atomicReferenceFieldUpdater, this, obj, obj == null ? BufferedChannelKt.f23571q : BufferedChannelKt.f23572r));
        if (obj == null) {
            return;
        }
        ((InterfaceC9540l) obj).invoke(m20627b0());
    }

    /* renamed from: q1 */
    public final int m20653q1(C11392g c11392g, int i10, Object obj, long j10, Object obj2, boolean z10) {
        while (true) {
            Object objM25344B = c11392g.m25344B(i10);
            if (objM25344B == null) {
                if (!m20600L(j10) || z10) {
                    if (z10) {
                        if (c11392g.m25350v(i10, null, BufferedChannelKt.f23564j)) {
                            c11392g.m25345C(i10, false);
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (c11392g.m25350v(i10, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (c11392g.m25350v(i10, null, BufferedChannelKt.f23558d)) {
                    return 1;
                }
            } else {
                if (objM25344B != BufferedChannelKt.f23559e) {
                    if (objM25344B == BufferedChannelKt.f23565k) {
                        c11392g.m25351w(i10);
                        return 5;
                    }
                    if (objM25344B == BufferedChannelKt.f23562h) {
                        c11392g.m25351w(i10);
                        return 5;
                    }
                    if (objM25344B == BufferedChannelKt.m20711z()) {
                        c11392g.m25351w(i10);
                        m20612S();
                        return 4;
                    }
                    c11392g.m25351w(i10);
                    if (objM25344B instanceof C11398m) {
                        objM25344B = ((C11398m) objM25344B).f27219a;
                    }
                    if (m20640i1(objM25344B, obj)) {
                        c11392g.m25348F(i10, BufferedChannelKt.f23563i);
                        m20603M0();
                        return 0;
                    }
                    if (c11392g.m25352x(i10, BufferedChannelKt.f23565k) != BufferedChannelKt.f23565k) {
                        c11392g.m25345C(i10, true);
                    }
                    return 5;
                }
                if (c11392g.m25350v(i10, objM25344B, BufferedChannelKt.f23558d)) {
                    return 1;
                }
            }
        }
    }

    /* renamed from: r0 */
    public final boolean m20654r0(C11392g c11392g, int i10, long j10) {
        Object objM25344B;
        do {
            objM25344B = c11392g.m25344B(i10);
            if (objM25344B != null && objM25344B != BufferedChannelKt.f23559e) {
                if (objM25344B == BufferedChannelKt.f23558d) {
                    return true;
                }
                if (objM25344B == BufferedChannelKt.f23564j || objM25344B == BufferedChannelKt.m20711z() || objM25344B == BufferedChannelKt.f23563i || objM25344B == BufferedChannelKt.f23562h) {
                    return false;
                }
                if (objM25344B == BufferedChannelKt.f23561g) {
                    return true;
                }
                return objM25344B != BufferedChannelKt.f23560f && j10 == m20636h0();
            }
        } while (!c11392g.m25350v(i10, objM25344B, BufferedChannelKt.f23562h));
        m20616U();
        return false;
    }

    /* renamed from: r1 */
    public final void m20655r1(long j10) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f23525g;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(this);
            if (j11 >= j10) {
                return;
            }
            long j12 = j10;
            if (f23525g.compareAndSet(this, j11, j12)) {
                return;
            } else {
                j10 = j12;
            }
        }
    }

    /* renamed from: s0 */
    public final boolean m20656s0(long j10, boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i10 = (int) (j10 >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            m20610R(j10 & 1152921504606846975L);
            return (z10 && m20647n0()) ? false : true;
        }
        if (i10 == 3) {
            m20608Q(j10 & 1152921504606846975L);
            return true;
        }
        throw new IllegalStateException(("unexpected close status: " + i10).toString());
    }

    /* renamed from: s1 */
    public final void m20657s1(long j10) {
        long j11;
        long j12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f23524f;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            j12 = 1152921504606846975L & j11;
            if (j12 >= j10) {
                return;
            }
        } while (!f23524f.compareAndSet(this, j11, BufferedChannelKt.m20708w(j12, (int) (j11 >> 60))));
    }

    @Override // kotlinx.coroutines.channels.InterfaceC10005f
    public Object send(Object obj, InterfaceC11588c interfaceC11588c) {
        return m20563f1(this, obj, interfaceC11588c);
    }

    /* renamed from: t0 */
    public boolean m20658t0() {
        return m20660u0(f23524f.get(this));
    }

    /* renamed from: t1 */
    public final void m20659t1(long j10) {
        BufferedChannel bufferedChannel = this;
        if (bufferedChannel.m20663x0()) {
            return;
        }
        while (bufferedChannel.m20623Z() <= j10) {
            bufferedChannel = this;
        }
        int i10 = BufferedChannelKt.f23557c;
        for (int i11 = 0; i11 < i10; i11++) {
            long jM20623Z = bufferedChannel.m20623Z();
            if (jM20623Z == (4611686018427387903L & f23527i.get(bufferedChannel)) && jM20623Z == bufferedChannel.m20623Z()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f23527i;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(bufferedChannel);
            if (atomicLongFieldUpdater.compareAndSet(bufferedChannel, j11, BufferedChannelKt.m20707v(j11 & 4611686018427387903L, true))) {
                break;
            } else {
                bufferedChannel = this;
            }
        }
        while (true) {
            long jM20623Z2 = bufferedChannel.m20623Z();
            long j12 = f23527i.get(bufferedChannel);
            long j13 = j12 & 4611686018427387903L;
            boolean z10 = (SieveCacheKt.NodeVisitedBit & j12) != 0;
            if (jM20623Z2 == j13 && jM20623Z2 == bufferedChannel.m20623Z()) {
                break;
            }
            if (z10) {
                bufferedChannel = this;
            } else {
                bufferedChannel = this;
                f23527i.compareAndSet(bufferedChannel, j12, BufferedChannelKt.m20707v(j13, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f23527i;
        while (true) {
            long j14 = atomicLongFieldUpdater2.get(bufferedChannel);
            boolean zCompareAndSet = atomicLongFieldUpdater2.compareAndSet(bufferedChannel, j14, BufferedChannelKt.m20707v(j14 & 4611686018427387903L, false));
            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
            if (zCompareAndSet) {
                return;
            }
            atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
            bufferedChannel = this;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01d7, code lost:
    
        r16 = r7;
        r3 = (p365ud.C11392g) r3.m26239f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01e0, code lost:
    
        if (r3 != null) goto L92;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.toString():java.lang.String");
    }

    @Override // kotlinx.coroutines.channels.InterfaceC10005f
    /* renamed from: trySend-JP2dKIU */
    public Object mo33808trySendJP2dKIU(Object obj) {
        Object obj2;
        int i10;
        C11392g c11392g;
        BufferedChannel bufferedChannel;
        if (m20637h1(f23524f.get(this))) {
            return C10002c.f23583b.m20736b();
        }
        Object obj3 = BufferedChannelKt.f23564j;
        C11392g c11392g2 = (C11392g) m20566j0().get(this);
        while (true) {
            long andIncrement = m20568k0().getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zM20661v0 = m20661v0(andIncrement);
            int i11 = BufferedChannelKt.f23556b;
            long j11 = j10 / i11;
            int i12 = (int) (j10 % i11);
            if (c11392g2.f28135e != j11) {
                C11392g c11392gM20620X = m20620X(j11, c11392g2);
                if (c11392gM20620X != null) {
                    i10 = i12;
                    c11392g = c11392gM20620X;
                    bufferedChannel = this;
                    obj2 = obj;
                } else if (zM20661v0) {
                    return C10002c.f23583b.m20735a(m20639i0());
                }
            } else {
                obj2 = obj;
                i10 = i12;
                c11392g = c11392g2;
                bufferedChannel = this;
            }
            int iM20651p1 = bufferedChannel.m20651p1(c11392g, i10, obj2, j10, obj3, zM20661v0);
            c11392g2 = c11392g;
            if (iM20651p1 == 0) {
                c11392g2.m26236c();
                return C10002c.f23583b.m20737c(C10786q.f26013a);
            }
            if (iM20651p1 == 1) {
                return C10002c.f23583b.m20737c(C10786q.f26013a);
            }
            if (iM20651p1 == 2) {
                if (zM20661v0) {
                    c11392g2.m26357t();
                    return C10002c.f23583b.m20735a(m20639i0());
                }
                InterfaceC11144n2 interfaceC11144n2 = obj3 instanceof InterfaceC11144n2 ? (InterfaceC11144n2) obj3 : null;
                if (interfaceC11144n2 != null) {
                    m20611R0(interfaceC11144n2, c11392g2, i10);
                }
                c11392g2.m26357t();
                return C10002c.f23583b.m20736b();
            }
            if (iM20651p1 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iM20651p1 == 4) {
                if (j10 < m20636h0()) {
                    c11392g2.m26236c();
                }
                return C10002c.f23583b.m20735a(m20639i0());
            }
            if (iM20651p1 == 5) {
                c11392g2.m26236c();
            }
            obj = obj2;
        }
    }

    /* renamed from: u0 */
    public final boolean m20660u0(long j10) {
        return m20656s0(j10, true);
    }

    /* renamed from: v0 */
    public final boolean m20661v0(long j10) {
        return m20656s0(j10, false);
    }

    /* renamed from: w0 */
    public boolean mo20662w0() {
        return false;
    }

    /* renamed from: x0 */
    public final boolean m20663x0() {
        long jM20623Z = m20623Z();
        return jM20623Z == 0 || jM20623Z == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r8 = (p365ud.C11392g) r8.m26241h();
     */
    /* renamed from: y0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m20664y0(p365ud.C11392g r8) {
        /*
            r7 = this;
        L0:
            int r0 = kotlinx.coroutines.channels.BufferedChannelKt.f23556b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3c
            long r3 = r8.f28135e
            int r5 = kotlinx.coroutines.channels.BufferedChannelKt.f23556b
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r7.m20636h0()
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L1a
            return r1
        L1a:
            java.lang.Object r1 = r8.m25344B(r0)
            if (r1 == 0) goto L2c
            xd.c0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.m20696k()
            if (r1 != r2) goto L27
            goto L2c
        L27:
            xd.c0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.f23558d
            if (r1 != r2) goto L39
            return r3
        L2c:
            xd.c0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.m20711z()
            boolean r1 = r8.m25350v(r0, r1, r2)
            if (r1 == 0) goto L1a
            r8.m26357t()
        L39:
            int r0 = r0 + (-1)
            goto L4
        L3c:
            xd.c r8 = r8.m26241h()
            ud.g r8 = (p365ud.C11392g) r8
            if (r8 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.m20664y0(ud.g):long");
    }

    /* renamed from: z0 */
    public final void m20665z0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f23524f;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if (((int) (j10 >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, BufferedChannelKt.m20708w(1152921504606846975L & j10, 1)));
    }
}
