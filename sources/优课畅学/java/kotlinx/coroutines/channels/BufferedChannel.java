package kotlinx.coroutines.channels;

import androidx.collection.SieveCacheKt;
import androidx.concurrent.futures.AbstractC3193a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.AbstractC9079b;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.AbstractC9116d0;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.C9155c;
import kotlinx.coroutines.channels.InterfaceC9158a;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import p123h7.AbstractC8722b;
import p123h7.C8736p;
import p135i8.AbstractC8851l;
import p135i8.InterfaceC8845j;
import p135i8.InterfaceC8895z1;
import p157k8.C9068d;
import p157k8.C9072h;
import p157k8.C9074j;
import p157k8.InterfaceC9066b;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p191n8.AbstractC9436a0;
import p191n8.AbstractC9438b0;
import p191n8.AbstractC9440c0;
import p191n8.AbstractC9441d;
import p191n8.AbstractC9443e;
import p191n8.AbstractC9457l;
import p201o7.AbstractC9536a;
import p201o7.AbstractC9541f;
import p224q8.C9850f;
import p224q8.C9852h;
import p224q8.InterfaceC9849e;
import p224q8.InterfaceC9851g;
import p224q8.InterfaceC9854j;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

/* loaded from: classes5.dex */
public class BufferedChannel implements InterfaceC9158a {

    /* renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f17608d = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "sendersAndCloseStatus$volatile");

    /* renamed from: e */
    public static final /* synthetic */ AtomicLongFieldUpdater f17609e = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "receivers$volatile");

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f17610f = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "bufferEnd$volatile");

    /* renamed from: g */
    public static final /* synthetic */ AtomicLongFieldUpdater f17611g = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f17612h = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "sendSegment$volatile");

    /* renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f17613i = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "receiveSegment$volatile");

    /* renamed from: j */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f17614j = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: k */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f17615k = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "_closeCause$volatile");

    /* renamed from: l */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f17616l = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* renamed from: a */
    public final int f17617a;

    /* renamed from: b */
    public final InterfaceC10570l f17618b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* renamed from: c */
    public final InterfaceC10575q f17619c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* renamed from: kotlinx.coroutines.channels.BufferedChannel$a */
    public final class C9156a implements InterfaceC9066b, InterfaceC8895z1 {

        /* renamed from: a */
        public Object f17620a = BufferedChannelKt.f17656p;

        /* renamed from: b */
        public C9155c f17621b;

        public C9156a() {
        }

        @Override // p157k8.InterfaceC9066b
        /* renamed from: a */
        public Object mo15880a(InterfaceC9324c interfaceC9324c) {
            BufferedChannel bufferedChannel = BufferedChannel.this;
            C9068d c9068d = (C9068d) BufferedChannel.m16383R().get(bufferedChannel);
            while (!bufferedChannel.m16453f0()) {
                long andIncrement = BufferedChannel.m16384S().getAndIncrement(bufferedChannel);
                int i10 = BufferedChannelKt.f17642b;
                long j10 = andIncrement / i10;
                int i11 = (int) (andIncrement % i10);
                if (c9068d.f18641c != j10) {
                    C9068d c9068dM16422I = bufferedChannel.m16422I(j10, c9068d);
                    if (c9068dM16422I == null) {
                        continue;
                    } else {
                        c9068d = c9068dM16422I;
                    }
                }
                Object objM16440U0 = bufferedChannel.m16440U0(c9068d, i11, andIncrement, null);
                if (objM16440U0 == BufferedChannelKt.f17653m) {
                    throw new IllegalStateException("unreachable");
                }
                if (objM16440U0 != BufferedChannelKt.f17655o) {
                    if (objM16440U0 == BufferedChannelKt.f17654n) {
                        return m16480f(c9068d, i11, andIncrement, interfaceC9324c);
                    }
                    c9068d.m17311c();
                    this.f17620a = objM16440U0;
                    return AbstractC9536a.m17796a(true);
                }
                if (andIncrement < bufferedChannel.m16443X()) {
                    c9068d.m17311c();
                }
            }
            return AbstractC9536a.m17796a(m16481g());
        }

        @Override // p135i8.InterfaceC8895z1
        /* renamed from: c */
        public void mo14938c(AbstractC9436a0 abstractC9436a0, int i10) {
            C9155c c9155c = this.f17621b;
            if (c9155c != null) {
                c9155c.mo14938c(abstractC9436a0, i10);
            }
        }

        /* renamed from: f */
        public final Object m16480f(C9068d c9068d, int i10, long j10, InterfaceC9324c interfaceC9324c) throws Throwable {
            Boolean boolM17796a;
            C9068d c9068dM16422I;
            BufferedChannel bufferedChannel = BufferedChannel.this;
            C9155c c9155cM14879b = AbstractC8851l.m14879b(IntrinsicsKt__IntrinsicsJvmKt.m16079d(interfaceC9324c));
            try {
                this.f17621b = c9155cM14879b;
                try {
                    Object objM16440U0 = bufferedChannel.m16440U0(c9068d, i10, j10, this);
                    if (objM16440U0 == BufferedChannelKt.f17653m) {
                        bufferedChannel.m16474y0(this, c9068d, i10);
                    } else {
                        InterfaceC10570l interfaceC10570lM16743a = null;
                        if (objM16440U0 == BufferedChannelKt.f17655o) {
                            if (j10 < bufferedChannel.m16443X()) {
                                c9068d.m17311c();
                            }
                            C9068d c9068d2 = (C9068d) BufferedChannel.m16383R().get(bufferedChannel);
                            while (true) {
                                if (bufferedChannel.m16453f0()) {
                                    m16482h();
                                    break;
                                }
                                long andIncrement = BufferedChannel.m16384S().getAndIncrement(bufferedChannel);
                                int i11 = BufferedChannelKt.f17642b;
                                long j11 = andIncrement / i11;
                                int i12 = (int) (andIncrement % i11);
                                if (c9068d2.f18641c != j11) {
                                    c9068dM16422I = bufferedChannel.m16422I(j11, c9068d2);
                                    if (c9068dM16422I == null) {
                                    }
                                } else {
                                    c9068dM16422I = c9068d2;
                                }
                                Object objM16440U02 = bufferedChannel.m16440U0(c9068dM16422I, i12, andIncrement, this);
                                if (objM16440U02 == BufferedChannelKt.f17653m) {
                                    bufferedChannel.m16474y0(this, c9068dM16422I, i12);
                                    break;
                                }
                                if (objM16440U02 == BufferedChannelKt.f17655o) {
                                    if (andIncrement < bufferedChannel.m16443X()) {
                                        c9068dM16422I.m17311c();
                                    }
                                    c9068d2 = c9068dM16422I;
                                } else {
                                    if (objM16440U02 == BufferedChannelKt.f17654n) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    c9068dM16422I.m17311c();
                                    this.f17620a = objM16440U02;
                                    this.f17621b = null;
                                    boolM17796a = AbstractC9536a.m17796a(true);
                                    InterfaceC10570l interfaceC10570l = bufferedChannel.f17618b;
                                    if (interfaceC10570l != null) {
                                        interfaceC10570lM16743a = OnUndeliveredElementKt.m16743a(interfaceC10570l, objM16440U02, c9155cM14879b.getContext());
                                    }
                                }
                            }
                        } else {
                            c9068d.m17311c();
                            this.f17620a = objM16440U0;
                            this.f17621b = null;
                            boolM17796a = AbstractC9536a.m17796a(true);
                            InterfaceC10570l interfaceC10570l2 = bufferedChannel.f17618b;
                            if (interfaceC10570l2 != null) {
                                interfaceC10570lM16743a = OnUndeliveredElementKt.m16743a(interfaceC10570l2, objM16440U0, c9155cM14879b.getContext());
                            }
                        }
                        c9155cM14879b.mo14870g(boolM17796a, interfaceC10570lM16743a);
                    }
                    Object objM16372x = c9155cM14879b.m16372x();
                    if (objM16372x == AbstractC9434a.m17291f()) {
                        AbstractC9541f.m17811c(interfaceC9324c);
                    }
                    return objM16372x;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    c9155cM14879b.m16351M();
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        /* renamed from: g */
        public final boolean m16481g() throws Throwable {
            this.f17620a = BufferedChannelKt.m16518z();
            Throwable thM16429N = BufferedChannel.this.m16429N();
            if (thM16429N == null) {
                return false;
            }
            throw AbstractC9440c0.m17304a(thM16429N);
        }

        /* renamed from: h */
        public final void m16482h() {
            C9155c c9155c = this.f17621b;
            AbstractC9133u.m16130d(c9155c);
            this.f17621b = null;
            this.f17620a = BufferedChannelKt.m16518z();
            Throwable thM16429N = BufferedChannel.this.m16429N();
            if (thM16429N == null) {
                Result.C9076a c9076a = Result.f17350b;
                c9155c.resumeWith(Result.m15909b(Boolean.FALSE));
            } else {
                Result.C9076a c9076a2 = Result.f17350b;
                c9155c.resumeWith(Result.m15909b(AbstractC9079b.m15925a(thM16429N)));
            }
        }

        /* renamed from: i */
        public final boolean m16483i(Object obj) {
            C9155c c9155c = this.f17621b;
            AbstractC9133u.m16130d(c9155c);
            this.f17621b = null;
            this.f17620a = obj;
            Boolean bool = Boolean.TRUE;
            InterfaceC10570l interfaceC10570l = BufferedChannel.this.f17618b;
            return BufferedChannelKt.m16491B(c9155c, bool, interfaceC10570l != null ? OnUndeliveredElementKt.m16743a(interfaceC10570l, obj, c9155c.getContext()) : null);
        }

        /* renamed from: j */
        public final void m16484j() {
            C9155c c9155c = this.f17621b;
            AbstractC9133u.m16130d(c9155c);
            this.f17621b = null;
            this.f17620a = BufferedChannelKt.m16518z();
            Throwable thM16429N = BufferedChannel.this.m16429N();
            if (thM16429N == null) {
                Result.C9076a c9076a = Result.f17350b;
                c9155c.resumeWith(Result.m15909b(Boolean.FALSE));
            } else {
                Result.C9076a c9076a2 = Result.f17350b;
                c9155c.resumeWith(Result.m15909b(AbstractC9079b.m15925a(thM16429N)));
            }
        }

        @Override // p157k8.InterfaceC9066b
        public Object next() throws Throwable {
            Object obj = this.f17620a;
            if (obj == BufferedChannelKt.f17656p) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.f17620a = BufferedChannelKt.f17656p;
            if (obj != BufferedChannelKt.m16518z()) {
                return obj;
            }
            throw AbstractC9440c0.m17304a(BufferedChannel.this.m16433Q());
        }
    }

    public BufferedChannel(int i10, InterfaceC10570l interfaceC10570l) {
        this.f17617a = i10;
        this.f17618b = interfaceC10570l;
        if (i10 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i10 + ", should be >=0").toString());
        }
        this.bufferEnd$volatile = BufferedChannelKt.m16490A(i10);
        this.completedExpandBuffersAndPauseFlag$volatile = m16427L();
        C9068d c9068d = new C9068d(0L, null, this, 3);
        this.sendSegment$volatile = c9068d;
        this.receiveSegment$volatile = c9068d;
        if (m16457j0()) {
            c9068d = BufferedChannelKt.f17641a;
            AbstractC9133u.m16131e(c9068d, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = c9068d;
        this.f17619c = interfaceC10570l != null ? new InterfaceC10575q() { // from class: kotlinx.coroutines.channels.BufferedChannel$onUndeliveredElementReceiveCancellationConstructor$1$1
            {
                super(3);
            }

            @Override // p300x7.InterfaceC10575q
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC10570l invoke(final InterfaceC9854j interfaceC9854j, Object obj, final Object obj2) {
                final BufferedChannel bufferedChannel = this.f17627a;
                return new InterfaceC10570l() { // from class: kotlinx.coroutines.channels.BufferedChannel$onUndeliveredElementReceiveCancellationConstructor$1$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p300x7.InterfaceC10570l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                        invoke((Throwable) obj3);
                        return C8736p.f16368a;
                    }

                    public final void invoke(Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                        if (obj2 != BufferedChannelKt.m16518z()) {
                            OnUndeliveredElementKt.m16744b(bufferedChannel.f17618b, obj2, interfaceC9854j.getContext());
                        }
                    }
                };
            }
        } : null;
        this._closeCause$volatile = BufferedChannelKt.f17659s;
    }

    /* renamed from: C0 */
    public static /* synthetic */ Object m16376C0(BufferedChannel bufferedChannel, InterfaceC9324c interfaceC9324c) throws Throwable {
        C9068d c9068d;
        C9068d c9068d2 = (C9068d) m16383R().get(bufferedChannel);
        while (!bufferedChannel.m16453f0()) {
            long andIncrement = m16384S().getAndIncrement(bufferedChannel);
            int i10 = BufferedChannelKt.f17642b;
            long j10 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (c9068d2.f18641c != j10) {
                C9068d c9068dM16422I = bufferedChannel.m16422I(j10, c9068d2);
                if (c9068dM16422I == null) {
                    continue;
                } else {
                    c9068d = c9068dM16422I;
                }
            } else {
                c9068d = c9068d2;
            }
            BufferedChannel bufferedChannel2 = bufferedChannel;
            Object objM16440U0 = bufferedChannel2.m16440U0(c9068d, i11, andIncrement, null);
            if (objM16440U0 == BufferedChannelKt.f17653m) {
                throw new IllegalStateException("unexpected");
            }
            if (objM16440U0 != BufferedChannelKt.f17655o) {
                if (objM16440U0 == BufferedChannelKt.f17654n) {
                    return bufferedChannel2.m16417F0(c9068d, i11, andIncrement, interfaceC9324c);
                }
                c9068d.m17311c();
                return objM16440U0;
            }
            if (andIncrement < bufferedChannel2.m16443X()) {
                c9068d.m17311c();
            }
            bufferedChannel = bufferedChannel2;
            c9068d2 = c9068d;
        }
        throw AbstractC9440c0.m17304a(bufferedChannel.m16433Q());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: D0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object m16377D0(kotlinx.coroutines.channels.BufferedChannel r13, p179m7.InterfaceC9324c r14) throws java.lang.Throwable {
        /*
            boolean r0 = r14 instanceof kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1
            if (r0 == 0) goto L14
            r0 = r14
            kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 r0 = (kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1) r0
            int r1 = r0.f17633c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f17633c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 r0 = new kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f17631a
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r6.f17633c
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            kotlin.AbstractC9079b.m15926b(r14)
            kotlinx.coroutines.channels.c r14 = (kotlinx.coroutines.channels.C9160c) r14
            java.lang.Object r13 = r14.m16541l()
            return r13
        L31:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L39:
            kotlin.AbstractC9079b.m15926b(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = m16392d()
            java.lang.Object r14 = r14.get(r13)
            k8.d r14 = (p157k8.C9068d) r14
        L46:
            boolean r1 = r13.m16453f0()
            if (r1 == 0) goto L57
            kotlinx.coroutines.channels.c$b r14 = kotlinx.coroutines.channels.C9160c.f17673b
            java.lang.Throwable r13 = r13.m16429N()
            java.lang.Object r13 = r14.m16542a(r13)
            return r13
        L57:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = m16393e()
            long r4 = r1.getAndIncrement(r13)
            int r1 = kotlinx.coroutines.channels.BufferedChannelKt.f17642b
            long r7 = (long) r1
            long r7 = r4 / r7
            long r9 = (long) r1
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r14.f18641c
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L77
            k8.d r1 = m16388a(r13, r7, r14)
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
            java.lang.Object r13 = m16406u(r7, r8, r9, r10, r12)
            r1 = r7
            n8.d0 r14 = kotlinx.coroutines.channels.BufferedChannelKt.m16510r()
            if (r13 == r14) goto Lb6
            n8.d0 r14 = kotlinx.coroutines.channels.BufferedChannelKt.m16500h()
            if (r13 != r14) goto L9b
            long r13 = r1.m16443X()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L98
            r8.m17311c()
        L98:
            r13 = r1
            r14 = r8
            goto L46
        L9b:
            n8.d0 r14 = kotlinx.coroutines.channels.BufferedChannelKt.m16511s()
            if (r13 != r14) goto Lac
            r6.f17633c = r2
            r2 = r8
            java.lang.Object r13 = r1.m16415E0(r2, r3, r4, r6)
            if (r13 != r0) goto Lab
            return r0
        Lab:
            return r13
        Lac:
            r8.m17311c()
            kotlinx.coroutines.channels.c$b r14 = kotlinx.coroutines.channels.C9160c.f17673b
            java.lang.Object r13 = r14.m16544c(r13)
            return r13
        Lb6:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.m16377D0(kotlinx.coroutines.channels.BufferedChannel, m7.c):java.lang.Object");
    }

    /* renamed from: M0 */
    public static /* synthetic */ Object m16380M0(BufferedChannel bufferedChannel, Object obj, InterfaceC9324c interfaceC9324c) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C9068d c9068d;
        C9068d c9068d2 = (C9068d) m16385V().get(bufferedChannel);
        while (true) {
            long andIncrement = m16386W().getAndIncrement(bufferedChannel);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zM16455h0 = bufferedChannel.m16455h0(andIncrement);
            int i10 = BufferedChannelKt.f17642b;
            long j11 = j10 / i10;
            int i11 = (int) (j10 % i10);
            if (c9068d2.f18641c != j11) {
                C9068d c9068dM16424J = bufferedChannel.m16424J(j11, c9068d2);
                if (c9068dM16424J != null) {
                    c9068d = c9068dM16424J;
                } else if (zM16455h0) {
                    Object objM16468u0 = bufferedChannel.m16468u0(obj, interfaceC9324c);
                    if (objM16468u0 == AbstractC9434a.m17291f()) {
                        return objM16468u0;
                    }
                }
            } else {
                c9068d = c9068d2;
            }
            BufferedChannel bufferedChannel2 = bufferedChannel;
            Object obj2 = obj;
            int iM16442W0 = bufferedChannel2.m16442W0(c9068d, i11, obj2, j10, null, zM16455h0);
            if (iM16442W0 == 0) {
                c9068d.m17311c();
                break;
            }
            if (iM16442W0 == 1) {
                break;
            }
            if (iM16442W0 != 2) {
                if (iM16442W0 == 3) {
                    Object objM16430N0 = bufferedChannel2.m16430N0(c9068d, i11, obj2, j10, interfaceC9324c);
                    if (objM16430N0 == AbstractC9434a.m17291f()) {
                        return objM16430N0;
                    }
                } else if (iM16442W0 != 4) {
                    if (iM16442W0 == 5) {
                        c9068d.m17311c();
                    }
                    bufferedChannel = bufferedChannel2;
                    c9068d2 = c9068d;
                    obj = obj2;
                } else {
                    if (j10 < bufferedChannel2.m16437T()) {
                        c9068d.m17311c();
                    }
                    Object objM16468u02 = bufferedChannel2.m16468u0(obj2, interfaceC9324c);
                    if (objM16468u02 == AbstractC9434a.m17291f()) {
                        return objM16468u02;
                    }
                }
            } else if (zM16455h0) {
                c9068d.m17295t();
                Object objM16468u03 = bufferedChannel2.m16468u0(obj2, interfaceC9324c);
                if (objM16468u03 == AbstractC9434a.m17291f()) {
                    return objM16468u03;
                }
            }
        }
        return C8736p.f16368a;
    }

    /* renamed from: R */
    public static final /* synthetic */ AtomicReferenceFieldUpdater m16383R() {
        return f17613i;
    }

    /* renamed from: S */
    public static final /* synthetic */ AtomicLongFieldUpdater m16384S() {
        return f17609e;
    }

    /* renamed from: V */
    public static final /* synthetic */ AtomicReferenceFieldUpdater m16385V() {
        return f17612h;
    }

    /* renamed from: W */
    public static final /* synthetic */ AtomicLongFieldUpdater m16386W() {
        return f17608d;
    }

    /* renamed from: b0 */
    public static /* synthetic */ void m16390b0(BufferedChannel bufferedChannel, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i10 & 1) != 0) {
            j10 = 1;
        }
        bufferedChannel.m16448a0(j10);
    }

    /* renamed from: A */
    public final C9068d m16408A() {
        Object obj = f17614j.get(this);
        C9068d c9068d = (C9068d) f17612h.get(this);
        if (c9068d.f18641c > ((C9068d) obj).f18641c) {
            obj = c9068d;
        }
        C9068d c9068d2 = (C9068d) f17613i.get(this);
        if (c9068d2.f18641c > ((C9068d) obj).f18641c) {
            obj = c9068d2;
        }
        return (C9068d) AbstractC9441d.m17306b((AbstractC9443e) obj);
    }

    /* renamed from: A0 */
    public final Object m16409A0(Object obj, Object obj2) {
        return C9160c.m16531b(obj2 == BufferedChannelKt.m16518z() ? C9160c.f17673b.m16542a(m16429N()) : C9160c.f17673b.m16544c(obj2));
    }

    /* renamed from: B */
    public boolean m16410B(Throwable th, boolean z10) {
        if (z10) {
            m16459l0();
        }
        boolean zM1318a = AbstractC3193a.m1318a(f17615k, this, BufferedChannelKt.f17659s, th);
        if (z10) {
            m16460m0();
        } else {
            m16461n0();
        }
        m16414E();
        m16463p0();
        if (zM1318a) {
            m16450c0();
        }
        return zM1318a;
    }

    /* renamed from: B0 */
    public final Object m16411B0(Object obj, Object obj2) throws Throwable {
        if (obj2 != BufferedChannelKt.m16518z()) {
            return this;
        }
        throw m16439U();
    }

    /* renamed from: C */
    public final void m16412C(long j10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        m16423I0(m16413D(j10));
    }

    /* renamed from: D */
    public final C9068d m16413D(long j10) {
        C9068d c9068dM16408A = m16408A();
        if (mo16456i0()) {
            long jM16458k0 = m16458k0(c9068dM16408A);
            if (jM16458k0 != -1) {
                m16416F(jM16458k0);
            }
        }
        m16475z(c9068dM16408A, j10);
        return c9068dM16408A;
    }

    /* renamed from: E */
    public final void m16414E() {
        isClosedForSend();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: E0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m16415E0(p157k8.C9068d r11, int r12, long r13, p179m7.InterfaceC9324c r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.m16415E0(k8.d, int, long, m7.c):java.lang.Object");
    }

    /* renamed from: F */
    public final void m16416F(long j10) {
        C9068d c9068dM16422I;
        UndeliveredElementException undeliveredElementExceptionM16746d;
        C9068d c9068d = (C9068d) f17613i.get(this);
        while (true) {
            long j11 = f17609e.get(this);
            if (j10 < Math.max(this.f17617a + j11, m16427L())) {
                return;
            }
            if (f17609e.compareAndSet(this, j11, 1 + j11)) {
                int i10 = BufferedChannelKt.f17642b;
                long j12 = j11 / i10;
                int i11 = (int) (j11 % i10);
                if (c9068d.f18641c != j12) {
                    c9068dM16422I = m16422I(j12, c9068d);
                    if (c9068dM16422I == null) {
                        continue;
                    }
                } else {
                    c9068dM16422I = c9068d;
                }
                Object objM16440U0 = m16440U0(c9068dM16422I, i11, j11, null);
                if (objM16440U0 != BufferedChannelKt.f17655o) {
                    c9068dM16422I.m17311c();
                    InterfaceC10570l interfaceC10570l = this.f17618b;
                    if (interfaceC10570l != null && (undeliveredElementExceptionM16746d = OnUndeliveredElementKt.m16746d(interfaceC10570l, objM16440U0, null, 2, null)) != null) {
                        throw undeliveredElementExceptionM16746d;
                    }
                } else if (j11 < m16443X()) {
                    c9068dM16422I.m17311c();
                }
                c9068d = c9068dM16422I;
            }
        }
    }

    /* renamed from: F0 */
    public final Object m16417F0(C9068d c9068d, int i10, long j10, InterfaceC9324c interfaceC9324c) {
        C9068d c9068d2;
        C9155c c9155cM14879b = AbstractC8851l.m14879b(IntrinsicsKt__IntrinsicsJvmKt.m16079d(interfaceC9324c));
        try {
            Object objM16440U0 = m16440U0(c9068d, i10, j10, c9155cM14879b);
            if (objM16440U0 == BufferedChannelKt.f17653m) {
                m16474y0(c9155cM14879b, c9068d, i10);
            } else {
                InterfaceC10570l interfaceC10570lM16743a = null;
                interfaceC10570lM16743a = null;
                if (objM16440U0 == BufferedChannelKt.f17655o) {
                    if (j10 < m16443X()) {
                        c9068d.m17311c();
                    }
                    C9068d c9068d3 = (C9068d) m16383R().get(this);
                    while (true) {
                        if (m16453f0()) {
                            m16465r0(c9155cM14879b);
                            break;
                        }
                        long andIncrement = m16384S().getAndIncrement(this);
                        int i11 = BufferedChannelKt.f17642b;
                        long j11 = andIncrement / i11;
                        int i12 = (int) (andIncrement % i11);
                        if (c9068d3.f18641c != j11) {
                            C9068d c9068dM16422I = m16422I(j11, c9068d3);
                            if (c9068dM16422I != null) {
                                c9068d2 = c9068dM16422I;
                            }
                        } else {
                            c9068d2 = c9068d3;
                        }
                        objM16440U0 = m16440U0(c9068d2, i12, andIncrement, c9155cM14879b);
                        C9068d c9068d4 = c9068d2;
                        if (objM16440U0 == BufferedChannelKt.f17653m) {
                            C9155c c9155c = c9155cM14879b != null ? c9155cM14879b : null;
                            if (c9155c != null) {
                                m16474y0(c9155c, c9068d4, i12);
                            }
                        } else if (objM16440U0 == BufferedChannelKt.f17655o) {
                            if (andIncrement < m16443X()) {
                                c9068d4.m17311c();
                            }
                            c9068d3 = c9068d4;
                        } else {
                            if (objM16440U0 == BufferedChannelKt.f17654n) {
                                throw new IllegalStateException("unexpected");
                            }
                            c9068d4.m17311c();
                            InterfaceC10570l interfaceC10570l = this.f17618b;
                            if (interfaceC10570l != null) {
                                interfaceC10570lM16743a = OnUndeliveredElementKt.m16743a(interfaceC10570l, objM16440U0, c9155cM14879b.getContext());
                            }
                        }
                    }
                } else {
                    c9068d.m17311c();
                    InterfaceC10570l interfaceC10570l2 = this.f17618b;
                    if (interfaceC10570l2 != null) {
                        interfaceC10570lM16743a = OnUndeliveredElementKt.m16743a(interfaceC10570l2, objM16440U0, c9155cM14879b.getContext());
                    }
                }
                c9155cM14879b.mo14870g(objM16440U0, interfaceC10570lM16743a);
            }
            Object objM16372x = c9155cM14879b.m16372x();
            if (objM16372x == AbstractC9434a.m17291f()) {
                AbstractC9541f.m17811c(interfaceC9324c);
            }
            return objM16372x;
        } catch (Throwable th) {
            c9155cM14879b.m16351M();
            throw th;
        }
    }

    /* renamed from: G */
    public final void m16418G() {
        if (m16457j0()) {
            return;
        }
        C9068d c9068d = (C9068d) f17614j.get(this);
        while (true) {
            long andIncrement = f17610f.getAndIncrement(this);
            int i10 = BufferedChannelKt.f17642b;
            long j10 = andIncrement / i10;
            if (m16443X() <= andIncrement) {
                if (c9068d.f18641c < j10 && c9068d.m17314f() != null) {
                    m16462o0(j10, c9068d);
                }
                m16390b0(this, 0L, 1, null);
                return;
            }
            if (c9068d.f18641c != j10) {
                C9068d c9068dM16420H = m16420H(j10, c9068d, andIncrement);
                if (c9068dM16420H == null) {
                    continue;
                } else {
                    c9068d = c9068dM16420H;
                }
            }
            if (m16436S0(c9068d, (int) (andIncrement % i10), andIncrement)) {
                m16390b0(this, 0L, 1, null);
                return;
            }
            m16390b0(this, 0L, 1, null);
        }
    }

    /* renamed from: G0 */
    public final void m16419G0(InterfaceC9854j interfaceC9854j, Object obj) {
        C9068d c9068d;
        C9068d c9068d2 = (C9068d) m16383R().get(this);
        while (!m16453f0()) {
            long andIncrement = m16384S().getAndIncrement(this);
            int i10 = BufferedChannelKt.f17642b;
            long j10 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (c9068d2.f18641c != j10) {
                C9068d c9068dM16422I = m16422I(j10, c9068d2);
                if (c9068dM16422I == null) {
                    continue;
                } else {
                    c9068d = c9068dM16422I;
                }
            } else {
                c9068d = c9068d2;
            }
            InterfaceC9854j interfaceC9854j2 = interfaceC9854j;
            Object objM16440U0 = m16440U0(c9068d, i11, andIncrement, interfaceC9854j2);
            c9068d2 = c9068d;
            if (objM16440U0 == BufferedChannelKt.f17653m) {
                InterfaceC8895z1 interfaceC8895z1 = interfaceC9854j2 instanceof InterfaceC8895z1 ? (InterfaceC8895z1) interfaceC9854j2 : null;
                if (interfaceC8895z1 != null) {
                    m16474y0(interfaceC8895z1, c9068d2, i11);
                    return;
                }
                return;
            }
            if (objM16440U0 != BufferedChannelKt.f17655o) {
                if (objM16440U0 == BufferedChannelKt.f17654n) {
                    throw new IllegalStateException("unexpected");
                }
                c9068d2.m17311c();
                interfaceC9854j2.mo16842e(objM16440U0);
                return;
            }
            if (andIncrement < m16443X()) {
                c9068d2.m17311c();
            }
            interfaceC9854j = interfaceC9854j2;
        }
        m16466s0(interfaceC9854j);
    }

    /* renamed from: H */
    public final C9068d m16420H(long j10, C9068d c9068d, long j11) {
        Object objM17307c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17614j;
        InterfaceC10574p interfaceC10574p = (InterfaceC10574p) BufferedChannelKt.m16517y();
        loop0: while (true) {
            objM17307c = AbstractC9441d.m17307c(c9068d, j10, interfaceC10574p);
            if (!AbstractC9438b0.m17302c(objM17307c)) {
                AbstractC9436a0 abstractC9436a0M17301b = AbstractC9438b0.m17301b(objM17307c);
                while (true) {
                    AbstractC9436a0 abstractC9436a0 = (AbstractC9436a0) atomicReferenceFieldUpdater.get(this);
                    if (abstractC9436a0.f18641c >= abstractC9436a0M17301b.f18641c) {
                        break loop0;
                    }
                    if (!abstractC9436a0M17301b.m17296u()) {
                        break;
                    }
                    if (AbstractC3193a.m1318a(atomicReferenceFieldUpdater, this, abstractC9436a0, abstractC9436a0M17301b)) {
                        if (abstractC9436a0.m17294p()) {
                            abstractC9436a0.m17319n();
                        }
                    } else if (abstractC9436a0M17301b.m17294p()) {
                        abstractC9436a0M17301b.m17319n();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC9438b0.m17302c(objM17307c)) {
            m16414E();
            m16462o0(j10, c9068d);
            m16390b0(this, 0L, 1, null);
            return null;
        }
        C9068d c9068d2 = (C9068d) AbstractC9438b0.m17301b(objM17307c);
        if (c9068d2.f18641c <= j10) {
            return c9068d2;
        }
        long j12 = c9068d2.f18641c;
        int i10 = BufferedChannelKt.f17642b;
        if (f17610f.compareAndSet(this, j11 + 1, j12 * i10)) {
            m16448a0((c9068d2.f18641c * i10) - j11);
        } else {
            m16390b0(this, 0L, 1, null);
        }
        return null;
    }

    /* renamed from: H0 */
    public void mo16421H0(InterfaceC9854j interfaceC9854j, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C9068d c9068d;
        C9068d c9068d2 = (C9068d) m16385V().get(this);
        while (true) {
            long andIncrement = m16386W().getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zM16455h0 = m16455h0(andIncrement);
            int i10 = BufferedChannelKt.f17642b;
            long j11 = j10 / i10;
            int i11 = (int) (j10 % i10);
            if (c9068d2.f18641c != j11) {
                C9068d c9068dM16424J = m16424J(j11, c9068d2);
                if (c9068dM16424J != null) {
                    c9068d = c9068dM16424J;
                } else if (zM16455h0) {
                    m16467t0(obj, interfaceC9854j);
                    return;
                }
            } else {
                c9068d = c9068d2;
            }
            InterfaceC9854j interfaceC9854j2 = interfaceC9854j;
            Object obj2 = obj;
            int iM16442W0 = m16442W0(c9068d, i11, obj2, j10, interfaceC9854j2, zM16455h0);
            c9068d2 = c9068d;
            if (iM16442W0 == 0) {
                c9068d2.m17311c();
                interfaceC9854j2.mo16842e(C8736p.f16368a);
                return;
            }
            if (iM16442W0 == 1) {
                interfaceC9854j2.mo16842e(C8736p.f16368a);
                return;
            }
            if (iM16442W0 == 2) {
                if (zM16455h0) {
                    c9068d2.m17295t();
                    m16467t0(obj2, interfaceC9854j2);
                    return;
                } else {
                    InterfaceC8895z1 interfaceC8895z1 = interfaceC9854j2 instanceof InterfaceC8895z1 ? (InterfaceC8895z1) interfaceC9854j2 : null;
                    if (interfaceC8895z1 != null) {
                        m16476z0(interfaceC8895z1, c9068d2, i11);
                        return;
                    }
                    return;
                }
            }
            if (iM16442W0 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iM16442W0 == 4) {
                if (j10 < m16437T()) {
                    c9068d2.m17311c();
                }
                m16467t0(obj2, interfaceC9854j2);
                return;
            } else {
                if (iM16442W0 == 5) {
                    c9068d2.m17311c();
                }
                obj = obj2;
                interfaceC9854j = interfaceC9854j2;
            }
        }
    }

    /* renamed from: I */
    public final C9068d m16422I(long j10, C9068d c9068d) {
        Object objM17307c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17613i;
        InterfaceC10574p interfaceC10574p = (InterfaceC10574p) BufferedChannelKt.m16517y();
        loop0: while (true) {
            objM17307c = AbstractC9441d.m17307c(c9068d, j10, interfaceC10574p);
            if (!AbstractC9438b0.m17302c(objM17307c)) {
                AbstractC9436a0 abstractC9436a0M17301b = AbstractC9438b0.m17301b(objM17307c);
                while (true) {
                    AbstractC9436a0 abstractC9436a0 = (AbstractC9436a0) atomicReferenceFieldUpdater.get(this);
                    if (abstractC9436a0.f18641c >= abstractC9436a0M17301b.f18641c) {
                        break loop0;
                    }
                    if (!abstractC9436a0M17301b.m17296u()) {
                        break;
                    }
                    if (AbstractC3193a.m1318a(atomicReferenceFieldUpdater, this, abstractC9436a0, abstractC9436a0M17301b)) {
                        if (abstractC9436a0.m17294p()) {
                            abstractC9436a0.m17319n();
                        }
                    } else if (abstractC9436a0M17301b.m17294p()) {
                        abstractC9436a0M17301b.m17319n();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC9438b0.m17302c(objM17307c)) {
            m16414E();
            if (c9068d.f18641c * BufferedChannelKt.f17642b < m16443X()) {
                c9068d.m17311c();
            }
            return null;
        }
        C9068d c9068d2 = (C9068d) AbstractC9438b0.m17301b(objM17307c);
        if (!m16457j0() && j10 <= m16427L() / BufferedChannelKt.f17642b) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f17614j;
            while (true) {
                AbstractC9436a0 abstractC9436a02 = (AbstractC9436a0) atomicReferenceFieldUpdater2.get(this);
                if (abstractC9436a02.f18641c >= c9068d2.f18641c || !c9068d2.m17296u()) {
                    break;
                }
                if (AbstractC3193a.m1318a(atomicReferenceFieldUpdater2, this, abstractC9436a02, c9068d2)) {
                    if (abstractC9436a02.m17294p()) {
                        abstractC9436a02.m17319n();
                    }
                } else if (c9068d2.m17294p()) {
                    c9068d2.m17319n();
                }
            }
        }
        long j11 = c9068d2.f18641c;
        if (j11 <= j10) {
            return c9068d2;
        }
        int i10 = BufferedChannelKt.f17642b;
        m16445Y0(j11 * i10);
        if (c9068d2.f18641c * i10 < m16443X()) {
            c9068d2.m17311c();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
    
        r12 = (p157k8.C9068d) r12.m17316h();
     */
    /* renamed from: I0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m16423I0(p157k8.C9068d r12) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r11 = this;
            x7.l r0 = r11.f17618b
            r1 = 0
            r2 = 1
            java.lang.Object r3 = p191n8.AbstractC9457l.m17371b(r1, r2, r1)
        L8:
            int r4 = kotlinx.coroutines.channels.BufferedChannelKt.f17642b
            int r4 = r4 - r2
        Lb:
            r5 = -1
            if (r5 >= r4) goto Lb3
            long r6 = r12.f18641c
            int r8 = kotlinx.coroutines.channels.BufferedChannelKt.f17642b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L16:
            java.lang.Object r8 = r12.m15883B(r4)
            n8.d0 r9 = kotlinx.coroutines.channels.BufferedChannelKt.m16498f()
            if (r8 == r9) goto Lbb
            n8.d0 r9 = kotlinx.coroutines.channels.BufferedChannelKt.f17644d
            if (r8 != r9) goto L48
            long r9 = r11.m16437T()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            n8.d0 r9 = kotlinx.coroutines.channels.BufferedChannelKt.m16518z()
            boolean r8 = r12.m15891v(r4, r8, r9)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L40
            java.lang.Object r5 = r12.m15882A(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.m16745c(r0, r5, r1)
        L40:
            r12.m15892w(r4)
            r12.m17295t()
            goto Laf
        L48:
            n8.d0 r9 = kotlinx.coroutines.channels.BufferedChannelKt.m16503k()
            if (r8 == r9) goto La2
            if (r8 != 0) goto L51
            goto La2
        L51:
            boolean r9 = r8 instanceof p135i8.InterfaceC8895z1
            if (r9 != 0) goto L6e
            boolean r9 = r8 instanceof p157k8.C9074j
            if (r9 == 0) goto L5a
            goto L6e
        L5a:
            n8.d0 r9 = kotlinx.coroutines.channels.BufferedChannelKt.m16508p()
            if (r8 == r9) goto Lbb
            n8.d0 r9 = kotlinx.coroutines.channels.BufferedChannelKt.m16509q()
            if (r8 != r9) goto L67
            goto Lbb
        L67:
            n8.d0 r9 = kotlinx.coroutines.channels.BufferedChannelKt.m16508p()
            if (r8 == r9) goto L16
            goto Laf
        L6e:
            long r9 = r11.m16437T()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            boolean r9 = r8 instanceof p157k8.C9074j
            if (r9 == 0) goto L80
            r9 = r8
            k8.j r9 = (p157k8.C9074j) r9
            i8.z1 r9 = r9.f17334a
            goto L83
        L80:
            r9 = r8
            i8.z1 r9 = (p135i8.InterfaceC8895z1) r9
        L83:
            n8.d0 r10 = kotlinx.coroutines.channels.BufferedChannelKt.m16518z()
            boolean r8 = r12.m15891v(r4, r8, r10)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L97
            java.lang.Object r5 = r12.m15882A(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.m16745c(r0, r5, r1)
        L97:
            java.lang.Object r3 = p191n8.AbstractC9457l.m17372c(r3, r9)
            r12.m15892w(r4)
            r12.m17295t()
            goto Laf
        La2:
            n8.d0 r9 = kotlinx.coroutines.channels.BufferedChannelKt.m16518z()
            boolean r8 = r12.m15891v(r4, r8, r9)
            if (r8 == 0) goto L16
            r12.m17295t()
        Laf:
            int r4 = r4 + (-1)
            goto Lb
        Lb3:
            n8.e r12 = r12.m17316h()
            k8.d r12 = (p157k8.C9068d) r12
            if (r12 != 0) goto L8
        Lbb:
            if (r3 == 0) goto Le1
            boolean r12 = r3 instanceof java.util.ArrayList
            if (r12 != 0) goto Lc7
            i8.z1 r3 = (p135i8.InterfaceC8895z1) r3
            r11.m16426K0(r3)
            goto Le1
        Lc7:
            java.lang.String r12 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            kotlin.jvm.internal.AbstractC9133u.m16131e(r3, r12)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r12 = r3.size()
            int r12 = r12 - r2
        Ld3:
            if (r5 >= r12) goto Le1
            java.lang.Object r0 = r3.get(r12)
            i8.z1 r0 = (p135i8.InterfaceC8895z1) r0
            r11.m16426K0(r0)
            int r12 = r12 + (-1)
            goto Ld3
        Le1:
            if (r1 != 0) goto Le4
            return
        Le4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.m16423I0(k8.d):void");
    }

    /* renamed from: J */
    public final C9068d m16424J(long j10, C9068d c9068d) {
        Object objM17307c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17612h;
        InterfaceC10574p interfaceC10574p = (InterfaceC10574p) BufferedChannelKt.m16517y();
        loop0: while (true) {
            objM17307c = AbstractC9441d.m17307c(c9068d, j10, interfaceC10574p);
            if (!AbstractC9438b0.m17302c(objM17307c)) {
                AbstractC9436a0 abstractC9436a0M17301b = AbstractC9438b0.m17301b(objM17307c);
                while (true) {
                    AbstractC9436a0 abstractC9436a0 = (AbstractC9436a0) atomicReferenceFieldUpdater.get(this);
                    if (abstractC9436a0.f18641c >= abstractC9436a0M17301b.f18641c) {
                        break loop0;
                    }
                    if (!abstractC9436a0M17301b.m17296u()) {
                        break;
                    }
                    if (AbstractC3193a.m1318a(atomicReferenceFieldUpdater, this, abstractC9436a0, abstractC9436a0M17301b)) {
                        if (abstractC9436a0.m17294p()) {
                            abstractC9436a0.m17319n();
                        }
                    } else if (abstractC9436a0M17301b.m17294p()) {
                        abstractC9436a0M17301b.m17319n();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC9438b0.m17302c(objM17307c)) {
            m16414E();
            if (c9068d.f18641c * BufferedChannelKt.f17642b < m16437T()) {
                c9068d.m17311c();
            }
            return null;
        }
        C9068d c9068d2 = (C9068d) AbstractC9438b0.m17301b(objM17307c);
        long j11 = c9068d2.f18641c;
        if (j11 <= j10) {
            return c9068d2;
        }
        int i10 = BufferedChannelKt.f17642b;
        m16447Z0(j11 * i10);
        if (c9068d2.f18641c * i10 < m16437T()) {
            c9068d2.m17311c();
        }
        return null;
    }

    /* renamed from: J0 */
    public final void m16425J0(InterfaceC8895z1 interfaceC8895z1) {
        m16428L0(interfaceC8895z1, true);
    }

    /* renamed from: K0 */
    public final void m16426K0(InterfaceC8895z1 interfaceC8895z1) {
        m16428L0(interfaceC8895z1, false);
    }

    /* renamed from: L */
    public final long m16427L() {
        return f17610f.get(this);
    }

    /* renamed from: L0 */
    public final void m16428L0(InterfaceC8895z1 interfaceC8895z1, boolean z10) {
        if (interfaceC8895z1 instanceof InterfaceC8845j) {
            InterfaceC9324c interfaceC9324c = (InterfaceC9324c) interfaceC8895z1;
            Result.C9076a c9076a = Result.f17350b;
            interfaceC9324c.resumeWith(Result.m15909b(AbstractC9079b.m15925a(z10 ? m16433Q() : m16439U())));
        } else if (interfaceC8895z1 instanceof C9072h) {
            C9155c c9155c = ((C9072h) interfaceC8895z1).f17333a;
            Result.C9076a c9076a2 = Result.f17350b;
            c9155c.resumeWith(Result.m15909b(C9160c.m16531b(C9160c.f17673b.m16542a(m16429N()))));
        } else if (interfaceC8895z1 instanceof C9156a) {
            ((C9156a) interfaceC8895z1).m16484j();
        } else {
            if (interfaceC8895z1 instanceof InterfaceC9854j) {
                ((InterfaceC9854j) interfaceC8895z1).mo16843f(this, BufferedChannelKt.m16518z());
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + interfaceC8895z1).toString());
        }
    }

    /* renamed from: N */
    public final Throwable m16429N() {
        return (Throwable) f17615k.get(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /* renamed from: N0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m16430N0(p157k8.C9068d r17, int r18, java.lang.Object r19, long r20, p179m7.InterfaceC9324c r22) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.m16430N0(k8.d, int, java.lang.Object, long, m7.c):java.lang.Object");
    }

    /* renamed from: O0 */
    public final boolean m16431O0(long j10) {
        if (m16455h0(j10)) {
            return false;
        }
        return !m16471x(j10 & 1152921504606846975L);
    }

    /* renamed from: P0 */
    public final boolean m16432P0(Object obj, Object obj2) {
        if (obj instanceof InterfaceC9854j) {
            return ((InterfaceC9854j) obj).mo16843f(this, obj2);
        }
        if (obj instanceof C9072h) {
            AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            C9072h c9072h = (C9072h) obj;
            C9155c c9155c = c9072h.f17333a;
            C9160c c9160cM16531b = C9160c.m16531b(C9160c.f17673b.m16544c(obj2));
            InterfaceC10570l interfaceC10570l = this.f17618b;
            return BufferedChannelKt.m16491B(c9155c, c9160cM16531b, interfaceC10570l != null ? OnUndeliveredElementKt.m16743a(interfaceC10570l, obj2, c9072h.f17333a.getContext()) : null);
        }
        if (obj instanceof C9156a) {
            AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((C9156a) obj).m16483i(obj2);
        }
        if (obj instanceof InterfaceC8845j) {
            AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC8845j interfaceC8845j = (InterfaceC8845j) obj;
            InterfaceC10570l interfaceC10570l2 = this.f17618b;
            return BufferedChannelKt.m16491B(interfaceC8845j, obj2, interfaceC10570l2 != null ? OnUndeliveredElementKt.m16743a(interfaceC10570l2, obj2, interfaceC8845j.getContext()) : null);
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    /* renamed from: Q */
    public final Throwable m16433Q() {
        Throwable thM16429N = m16429N();
        return thM16429N == null ? new ClosedReceiveChannelException("Channel was closed") : thM16429N;
    }

    /* renamed from: Q0 */
    public final boolean m16434Q0(Object obj, C9068d c9068d, int i10) {
        if (obj instanceof InterfaceC8845j) {
            AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return BufferedChannelKt.m16492C((InterfaceC8845j) obj, C8736p.f16368a, null, 2, null);
        }
        if (!(obj instanceof InterfaceC9854j)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        TrySelectDetailedResult trySelectDetailedResultM16853x = ((SelectImplementation) obj).m16853x(this, C8736p.f16368a);
        if (trySelectDetailedResultM16853x == TrySelectDetailedResult.f18161b) {
            c9068d.m15892w(i10);
        }
        return trySelectDetailedResultM16853x == TrySelectDetailedResult.f18160a;
    }

    /* renamed from: R0 */
    public final Object m16435R0(Object obj) {
        C9068d c9068dM16424J;
        int i10;
        BufferedChannel bufferedChannel;
        Object obj2 = BufferedChannelKt.f17644d;
        C9068d c9068d = (C9068d) m16385V().get(this);
        while (true) {
            long andIncrement = m16386W().getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zM16455h0 = m16455h0(andIncrement);
            int i11 = BufferedChannelKt.f17642b;
            long j11 = j10 / i11;
            int i12 = (int) (j10 % i11);
            if (c9068d.f18641c != j11) {
                c9068dM16424J = m16424J(j11, c9068d);
                if (c9068dM16424J != null) {
                    bufferedChannel = this;
                    i10 = i12;
                } else if (zM16455h0) {
                    return C9160c.f17673b.m16542a(m16439U());
                }
            } else {
                c9068dM16424J = c9068d;
                i10 = i12;
                bufferedChannel = this;
            }
            Object obj3 = obj;
            int iM16442W0 = bufferedChannel.m16442W0(c9068dM16424J, i10, obj3, j10, obj2, zM16455h0);
            c9068d = c9068dM16424J;
            if (iM16442W0 == 0) {
                c9068d.m17311c();
                return C9160c.f17673b.m16544c(C8736p.f16368a);
            }
            if (iM16442W0 == 1) {
                return C9160c.f17673b.m16544c(C8736p.f16368a);
            }
            if (iM16442W0 == 2) {
                if (zM16455h0) {
                    c9068d.m17295t();
                    return C9160c.f17673b.m16542a(m16439U());
                }
                InterfaceC8895z1 interfaceC8895z1 = obj2 instanceof InterfaceC8895z1 ? (InterfaceC8895z1) obj2 : null;
                if (interfaceC8895z1 != null) {
                    m16476z0(interfaceC8895z1, c9068d, i10);
                }
                m16416F((c9068d.f18641c * i11) + i10);
                return C9160c.f17673b.m16544c(C8736p.f16368a);
            }
            if (iM16442W0 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iM16442W0 == 4) {
                if (j10 < m16437T()) {
                    c9068d.m17311c();
                }
                return C9160c.f17673b.m16542a(m16439U());
            }
            if (iM16442W0 == 5) {
                c9068d.m17311c();
            }
            obj = obj3;
        }
    }

    /* renamed from: S0 */
    public final boolean m16436S0(C9068d c9068d, int i10, long j10) {
        Object objM15883B = c9068d.m15883B(i10);
        if (!(objM15883B instanceof InterfaceC8895z1) || j10 < f17609e.get(this) || !c9068d.m15891v(i10, objM15883B, BufferedChannelKt.f17647g)) {
            return m16438T0(c9068d, i10, j10);
        }
        if (m16434Q0(objM15883B, c9068d, i10)) {
            c9068d.m15887F(i10, BufferedChannelKt.f17644d);
            return true;
        }
        c9068d.m15887F(i10, BufferedChannelKt.f17650j);
        c9068d.m15884C(i10, false);
        return false;
    }

    /* renamed from: T */
    public final long m16437T() {
        return f17609e.get(this);
    }

    /* renamed from: T0 */
    public final boolean m16438T0(C9068d c9068d, int i10, long j10) {
        while (true) {
            Object objM15883B = c9068d.m15883B(i10);
            if (objM15883B instanceof InterfaceC8895z1) {
                if (j10 < f17609e.get(this)) {
                    if (c9068d.m15891v(i10, objM15883B, new C9074j((InterfaceC8895z1) objM15883B))) {
                        return true;
                    }
                } else if (c9068d.m15891v(i10, objM15883B, BufferedChannelKt.f17647g)) {
                    if (m16434Q0(objM15883B, c9068d, i10)) {
                        c9068d.m15887F(i10, BufferedChannelKt.f17644d);
                        return true;
                    }
                    c9068d.m15887F(i10, BufferedChannelKt.f17650j);
                    c9068d.m15884C(i10, false);
                    return false;
                }
            } else {
                if (objM15883B == BufferedChannelKt.f17650j) {
                    return false;
                }
                if (objM15883B == null) {
                    if (c9068d.m15891v(i10, objM15883B, BufferedChannelKt.f17645e)) {
                        return true;
                    }
                } else {
                    if (objM15883B == BufferedChannelKt.f17644d || objM15883B == BufferedChannelKt.f17648h || objM15883B == BufferedChannelKt.f17649i || objM15883B == BufferedChannelKt.f17651k || objM15883B == BufferedChannelKt.m16518z()) {
                        return true;
                    }
                    if (objM15883B != BufferedChannelKt.f17646f) {
                        throw new IllegalStateException(("Unexpected cell state: " + objM15883B).toString());
                    }
                }
            }
        }
    }

    /* renamed from: U */
    public final Throwable m16439U() {
        Throwable thM16429N = m16429N();
        return thM16429N == null ? new ClosedSendChannelException("Channel was closed") : thM16429N;
    }

    /* renamed from: U0 */
    public final Object m16440U0(C9068d c9068d, int i10, long j10, Object obj) {
        Object objM15883B = c9068d.m15883B(i10);
        if (objM15883B == null) {
            if (j10 >= (f17608d.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return BufferedChannelKt.f17654n;
                }
                if (c9068d.m15891v(i10, objM15883B, obj)) {
                    m16418G();
                    return BufferedChannelKt.f17653m;
                }
            }
        } else if (objM15883B == BufferedChannelKt.f17644d && c9068d.m15891v(i10, objM15883B, BufferedChannelKt.f17649i)) {
            m16418G();
            return c9068d.m15885D(i10);
        }
        return m16441V0(c9068d, i10, j10, obj);
    }

    /* renamed from: V0 */
    public final Object m16441V0(C9068d c9068d, int i10, long j10, Object obj) {
        while (true) {
            Object objM15883B = c9068d.m15883B(i10);
            if (objM15883B == null || objM15883B == BufferedChannelKt.f17645e) {
                if (j10 < (f17608d.get(this) & 1152921504606846975L)) {
                    if (c9068d.m15891v(i10, objM15883B, BufferedChannelKt.f17648h)) {
                        m16418G();
                        return BufferedChannelKt.f17655o;
                    }
                } else {
                    if (obj == null) {
                        return BufferedChannelKt.f17654n;
                    }
                    if (c9068d.m15891v(i10, objM15883B, obj)) {
                        m16418G();
                        return BufferedChannelKt.f17653m;
                    }
                }
            } else {
                if (objM15883B != BufferedChannelKt.f17644d) {
                    if (objM15883B != BufferedChannelKt.f17650j && objM15883B != BufferedChannelKt.f17648h) {
                        if (objM15883B == BufferedChannelKt.m16518z()) {
                            m16418G();
                            return BufferedChannelKt.f17655o;
                        }
                        if (objM15883B != BufferedChannelKt.f17647g && c9068d.m15891v(i10, objM15883B, BufferedChannelKt.f17646f)) {
                            boolean z10 = objM15883B instanceof C9074j;
                            if (z10) {
                                objM15883B = ((C9074j) objM15883B).f17334a;
                            }
                            if (m16434Q0(objM15883B, c9068d, i10)) {
                                c9068d.m15887F(i10, BufferedChannelKt.f17649i);
                                m16418G();
                                return c9068d.m15885D(i10);
                            }
                            c9068d.m15887F(i10, BufferedChannelKt.f17650j);
                            c9068d.m15884C(i10, false);
                            if (z10) {
                                m16418G();
                            }
                            return BufferedChannelKt.f17655o;
                        }
                    }
                    return BufferedChannelKt.f17655o;
                }
                if (c9068d.m15891v(i10, objM15883B, BufferedChannelKt.f17649i)) {
                    m16418G();
                    return c9068d.m15885D(i10);
                }
            }
        }
    }

    /* renamed from: W0 */
    public final int m16442W0(C9068d c9068d, int i10, Object obj, long j10, Object obj2, boolean z10) {
        c9068d.m15888G(i10, obj);
        if (z10) {
            return m16444X0(c9068d, i10, obj, j10, obj2, z10);
        }
        Object objM15883B = c9068d.m15883B(i10);
        if (objM15883B == null) {
            if (m16471x(j10)) {
                if (c9068d.m15891v(i10, null, BufferedChannelKt.f17644d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (c9068d.m15891v(i10, null, obj2)) {
                    return 2;
                }
            }
        } else if (objM15883B instanceof InterfaceC8895z1) {
            c9068d.m15892w(i10);
            if (m16432P0(objM15883B, obj)) {
                c9068d.m15887F(i10, BufferedChannelKt.f17649i);
                m16470w0();
                return 0;
            }
            if (c9068d.m15893x(i10, BufferedChannelKt.f17651k) == BufferedChannelKt.f17651k) {
                return 5;
            }
            c9068d.m15884C(i10, true);
            return 5;
        }
        return m16444X0(c9068d, i10, obj, j10, obj2, z10);
    }

    /* renamed from: X */
    public final long m16443X() {
        return f17608d.get(this) & 1152921504606846975L;
    }

    /* renamed from: X0 */
    public final int m16444X0(C9068d c9068d, int i10, Object obj, long j10, Object obj2, boolean z10) {
        while (true) {
            Object objM15883B = c9068d.m15883B(i10);
            if (objM15883B == null) {
                if (!m16471x(j10) || z10) {
                    if (z10) {
                        if (c9068d.m15891v(i10, null, BufferedChannelKt.f17650j)) {
                            c9068d.m15884C(i10, false);
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (c9068d.m15891v(i10, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (c9068d.m15891v(i10, null, BufferedChannelKt.f17644d)) {
                    return 1;
                }
            } else {
                if (objM15883B != BufferedChannelKt.f17645e) {
                    if (objM15883B == BufferedChannelKt.f17651k) {
                        c9068d.m15892w(i10);
                        return 5;
                    }
                    if (objM15883B == BufferedChannelKt.f17648h) {
                        c9068d.m15892w(i10);
                        return 5;
                    }
                    if (objM15883B == BufferedChannelKt.m16518z()) {
                        c9068d.m15892w(i10);
                        m16414E();
                        return 4;
                    }
                    c9068d.m15892w(i10);
                    if (objM15883B instanceof C9074j) {
                        objM15883B = ((C9074j) objM15883B).f17334a;
                    }
                    if (m16432P0(objM15883B, obj)) {
                        c9068d.m15887F(i10, BufferedChannelKt.f17649i);
                        m16470w0();
                        return 0;
                    }
                    if (c9068d.m15893x(i10, BufferedChannelKt.f17651k) != BufferedChannelKt.f17651k) {
                        c9068d.m15884C(i10, true);
                    }
                    return 5;
                }
                if (c9068d.m15891v(i10, objM15883B, BufferedChannelKt.f17644d)) {
                    return 1;
                }
            }
        }
    }

    /* renamed from: Y0 */
    public final void m16445Y0(long j10) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f17609e;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(this);
            if (j11 >= j10) {
                return;
            }
            long j12 = j10;
            if (f17609e.compareAndSet(this, j11, j12)) {
                return;
            } else {
                j10 = j12;
            }
        }
    }

    /* renamed from: Z */
    public final boolean m16446Z() {
        while (true) {
            C9068d c9068dM16422I = (C9068d) f17613i.get(this);
            long jM16437T = m16437T();
            if (m16443X() <= jM16437T) {
                return false;
            }
            int i10 = BufferedChannelKt.f17642b;
            long j10 = jM16437T / i10;
            if (c9068dM16422I.f18641c == j10 || (c9068dM16422I = m16422I(j10, c9068dM16422I)) != null) {
                c9068dM16422I.m17311c();
                if (m16451d0(c9068dM16422I, (int) (jM16437T % i10), jM16437T)) {
                    return true;
                }
                f17609e.compareAndSet(this, jM16437T, 1 + jM16437T);
            } else if (((C9068d) f17613i.get(this)).f18641c < j10) {
                return false;
            }
        }
    }

    /* renamed from: Z0 */
    public final void m16447Z0(long j10) {
        long j11;
        long j12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f17608d;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            j12 = 1152921504606846975L & j11;
            if (j12 >= j10) {
                return;
            }
        } while (!f17608d.compareAndSet(this, j11, BufferedChannelKt.m16515w(j12, (int) (j11 >> 60))));
    }

    /* renamed from: a0 */
    public final void m16448a0(long j10) {
        if ((f17611g.addAndGet(this, j10) & SieveCacheKt.NodeVisitedBit) != 0) {
            while ((f17611g.get(this) & SieveCacheKt.NodeVisitedBit) != 0) {
            }
        }
    }

    /* renamed from: a1 */
    public final void m16449a1(long j10) {
        BufferedChannel bufferedChannel = this;
        if (bufferedChannel.m16457j0()) {
            return;
        }
        while (bufferedChannel.m16427L() <= j10) {
            bufferedChannel = this;
        }
        int i10 = BufferedChannelKt.f17643c;
        for (int i11 = 0; i11 < i10; i11++) {
            long jM16427L = bufferedChannel.m16427L();
            if (jM16427L == (4611686018427387903L & f17611g.get(bufferedChannel)) && jM16427L == bufferedChannel.m16427L()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f17611g;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(bufferedChannel);
            if (atomicLongFieldUpdater.compareAndSet(bufferedChannel, j11, BufferedChannelKt.m16514v(j11 & 4611686018427387903L, true))) {
                break;
            } else {
                bufferedChannel = this;
            }
        }
        while (true) {
            long jM16427L2 = bufferedChannel.m16427L();
            long j12 = f17611g.get(bufferedChannel);
            long j13 = j12 & 4611686018427387903L;
            boolean z10 = (SieveCacheKt.NodeVisitedBit & j12) != 0;
            if (jM16427L2 == j13 && jM16427L2 == bufferedChannel.m16427L()) {
                break;
            }
            if (z10) {
                bufferedChannel = this;
            } else {
                bufferedChannel = this;
                f17611g.compareAndSet(bufferedChannel, j12, BufferedChannelKt.m16514v(j13, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f17611g;
        while (true) {
            long j14 = atomicLongFieldUpdater2.get(bufferedChannel);
            boolean zCompareAndSet = atomicLongFieldUpdater2.compareAndSet(bufferedChannel, j14, BufferedChannelKt.m16514v(j14 & 4611686018427387903L, false));
            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
            if (zCompareAndSet) {
                return;
            }
            atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
            bufferedChannel = this;
        }
    }

    /* renamed from: c0 */
    public final void m16450c0() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17616l;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!AbstractC3193a.m1318a(atomicReferenceFieldUpdater, this, obj, obj == null ? BufferedChannelKt.f17657q : BufferedChannelKt.f17658r));
        if (obj == null) {
            return;
        }
        ((InterfaceC10570l) obj).invoke(m16429N());
    }

    @Override // p157k8.InterfaceC9073i
    public final void cancel(CancellationException cancellationException) {
        m16473y(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC9163f
    public boolean close(Throwable th) {
        return m16410B(th, false);
    }

    /* renamed from: d0 */
    public final boolean m16451d0(C9068d c9068d, int i10, long j10) {
        Object objM15883B;
        do {
            objM15883B = c9068d.m15883B(i10);
            if (objM15883B != null && objM15883B != BufferedChannelKt.f17645e) {
                if (objM15883B == BufferedChannelKt.f17644d) {
                    return true;
                }
                if (objM15883B == BufferedChannelKt.f17650j || objM15883B == BufferedChannelKt.m16518z() || objM15883B == BufferedChannelKt.f17649i || objM15883B == BufferedChannelKt.f17648h) {
                    return false;
                }
                if (objM15883B == BufferedChannelKt.f17647g) {
                    return true;
                }
                return objM15883B != BufferedChannelKt.f17646f && j10 == m16437T();
            }
        } while (!c9068d.m15891v(i10, objM15883B, BufferedChannelKt.f17648h));
        m16418G();
        return false;
    }

    /* renamed from: e0 */
    public final boolean m16452e0(long j10, boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i10 = (int) (j10 >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            m16413D(j10 & 1152921504606846975L);
            return (z10 && m16446Z()) ? false : true;
        }
        if (i10 == 3) {
            m16412C(j10 & 1152921504606846975L);
            return true;
        }
        throw new IllegalStateException(("unexpected close status: " + i10).toString());
    }

    @Override // p157k8.InterfaceC9073i
    /* renamed from: f */
    public Object mo15876f(InterfaceC9324c interfaceC9324c) {
        return m16376C0(this, interfaceC9324c);
    }

    /* renamed from: f0 */
    public boolean m16453f0() {
        return m16454g0(f17608d.get(this));
    }

    /* renamed from: g0 */
    public final boolean m16454g0(long j10) {
        return m16452e0(j10, true);
    }

    @Override // kotlinx.coroutines.channels.InterfaceC9163f
    public InterfaceC9851g getOnSend() {
        BufferedChannel$onSend$1 bufferedChannel$onSend$1 = BufferedChannel$onSend$1.f17625a;
        AbstractC9133u.m16131e(bufferedChannel$onSend$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        InterfaceC10575q interfaceC10575q = (InterfaceC10575q) AbstractC9116d0.m16096e(bufferedChannel$onSend$1, 3);
        BufferedChannel$onSend$2 bufferedChannel$onSend$2 = BufferedChannel$onSend$2.f17626a;
        AbstractC9133u.m16131e(bufferedChannel$onSend$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new C9852h(this, interfaceC10575q, (InterfaceC10575q) AbstractC9116d0.m16096e(bufferedChannel$onSend$2, 3), null, 8, null);
    }

    /* renamed from: h0 */
    public final boolean m16455h0(long j10) {
        return m16452e0(j10, false);
    }

    /* renamed from: i0 */
    public boolean mo16456i0() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC9163f
    public void invokeOnClose(InterfaceC10570l interfaceC10570l) {
        if (AbstractC3193a.m1318a(f17616l, this, null, interfaceC10570l)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17616l;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != BufferedChannelKt.f17657q) {
                if (obj == BufferedChannelKt.f17658r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        } while (!AbstractC3193a.m1318a(f17616l, this, BufferedChannelKt.f17657q, BufferedChannelKt.f17658r));
        interfaceC10570l.invoke(m16429N());
    }

    @Override // kotlinx.coroutines.channels.InterfaceC9163f
    public boolean isClosedForSend() {
        return m16455h0(f17608d.get(this));
    }

    @Override // p157k8.InterfaceC9073i
    public InterfaceC9066b iterator() {
        return new C9156a();
    }

    /* renamed from: j0 */
    public final boolean m16457j0() {
        long jM16427L = m16427L();
        return jM16427L == 0 || jM16427L == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r8 = (p157k8.C9068d) r8.m17316h();
     */
    /* renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m16458k0(p157k8.C9068d r8) {
        /*
            r7 = this;
        L0:
            int r0 = kotlinx.coroutines.channels.BufferedChannelKt.f17642b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3c
            long r3 = r8.f18641c
            int r5 = kotlinx.coroutines.channels.BufferedChannelKt.f17642b
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r7.m16437T()
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L1a
            return r1
        L1a:
            java.lang.Object r1 = r8.m15883B(r0)
            if (r1 == 0) goto L2c
            n8.d0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.m16503k()
            if (r1 != r2) goto L27
            goto L2c
        L27:
            n8.d0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.f17644d
            if (r1 != r2) goto L39
            return r3
        L2c:
            n8.d0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.m16518z()
            boolean r1 = r8.m15891v(r0, r1, r2)
            if (r1 == 0) goto L1a
            r8.m17295t()
        L39:
            int r0 = r0 + (-1)
            goto L4
        L3c:
            n8.e r8 = r8.m17316h()
            k8.d r8 = (p157k8.C9068d) r8
            if (r8 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.m16458k0(k8.d):long");
    }

    /* renamed from: l0 */
    public final void m16459l0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f17608d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if (((int) (j10 >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, BufferedChannelKt.m16515w(1152921504606846975L & j10, 1)));
    }

    @Override // p157k8.InterfaceC9073i
    /* renamed from: m */
    public InterfaceC9849e mo15877m() {
        BufferedChannel$onReceiveCatching$1 bufferedChannel$onReceiveCatching$1 = BufferedChannel$onReceiveCatching$1.f17623a;
        AbstractC9133u.m16131e(bufferedChannel$onReceiveCatching$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        InterfaceC10575q interfaceC10575q = (InterfaceC10575q) AbstractC9116d0.m16096e(bufferedChannel$onReceiveCatching$1, 3);
        BufferedChannel$onReceiveCatching$2 bufferedChannel$onReceiveCatching$2 = BufferedChannel$onReceiveCatching$2.f17624a;
        AbstractC9133u.m16131e(bufferedChannel$onReceiveCatching$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new C9850f(this, interfaceC10575q, (InterfaceC10575q) AbstractC9116d0.m16096e(bufferedChannel$onReceiveCatching$2, 3), this.f17619c);
    }

    /* renamed from: m0 */
    public final void m16460m0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f17608d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, BufferedChannelKt.m16515w(1152921504606846975L & j10, 3)));
    }

    /* renamed from: n0 */
    public final void m16461n0() {
        long j10;
        long jM16515w;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f17608d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 >> 60);
            if (i10 == 0) {
                jM16515w = BufferedChannelKt.m16515w(1152921504606846975L & j10, 2);
            } else if (i10 != 1) {
                return;
            } else {
                jM16515w = BufferedChannelKt.m16515w(1152921504606846975L & j10, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, jM16515w));
    }

    @Override // p157k8.InterfaceC9073i
    /* renamed from: o */
    public Object mo15878o() {
        C9068d c9068dM16422I;
        long j10 = f17609e.get(this);
        long j11 = f17608d.get(this);
        if (m16454g0(j11)) {
            return C9160c.f17673b.m16542a(m16429N());
        }
        if (j10 >= (j11 & 1152921504606846975L)) {
            return C9160c.f17673b.m16543b();
        }
        Object obj = BufferedChannelKt.f17651k;
        C9068d c9068d = (C9068d) m16383R().get(this);
        while (!m16453f0()) {
            long andIncrement = m16384S().getAndIncrement(this);
            int i10 = BufferedChannelKt.f17642b;
            long j12 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (c9068d.f18641c != j12) {
                c9068dM16422I = m16422I(j12, c9068d);
                if (c9068dM16422I == null) {
                    continue;
                }
            } else {
                c9068dM16422I = c9068d;
            }
            Object objM16440U0 = m16440U0(c9068dM16422I, i11, andIncrement, obj);
            if (objM16440U0 == BufferedChannelKt.f17653m) {
                InterfaceC8895z1 interfaceC8895z1 = obj instanceof InterfaceC8895z1 ? (InterfaceC8895z1) obj : null;
                if (interfaceC8895z1 != null) {
                    m16474y0(interfaceC8895z1, c9068dM16422I, i11);
                }
                m16449a1(andIncrement);
                c9068dM16422I.m17295t();
                return C9160c.f17673b.m16543b();
            }
            if (objM16440U0 != BufferedChannelKt.f17655o) {
                if (objM16440U0 == BufferedChannelKt.f17654n) {
                    throw new IllegalStateException("unexpected");
                }
                c9068dM16422I.m17311c();
                return C9160c.f17673b.m16544c(objM16440U0);
            }
            if (andIncrement < m16443X()) {
                c9068dM16422I.m17311c();
            }
            c9068d = c9068dM16422I;
        }
        return C9160c.f17673b.m16542a(m16429N());
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /* renamed from: o0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m16462o0(long r5, p157k8.C9068d r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f18641c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            n8.e r0 = r7.m17314f()
            k8.d r0 = (p157k8.C9068d) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.mo17293k()
            if (r5 == 0) goto L22
            n8.e r5 = r7.m17314f()
            k8.d r5 = (p157k8.C9068d) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = m16379M()
        L26:
            java.lang.Object r6 = r5.get(r4)
            n8.a0 r6 = (p191n8.AbstractC9436a0) r6
            long r0 = r6.f18641c
            long r2 = r7.f18641c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L35
            return
        L35:
            boolean r0 = r7.m17296u()
            if (r0 != 0) goto L3c
            goto L11
        L3c:
            boolean r0 = androidx.concurrent.futures.AbstractC3193a.m1318a(r5, r4, r6, r7)
            if (r0 == 0) goto L4c
            boolean r5 = r6.m17294p()
            if (r5 == 0) goto L4b
            r6.m17319n()
        L4b:
            return
        L4c:
            boolean r6 = r7.m17294p()
            if (r6 == 0) goto L26
            r7.m17319n()
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.m16462o0(long, k8.d):void");
    }

    @Override // kotlinx.coroutines.channels.InterfaceC9163f
    public boolean offer(Object obj) {
        return InterfaceC9158a.a.m16526a(this, obj);
    }

    /* renamed from: p0 */
    public void m16463p0() {
    }

    /* renamed from: q0 */
    public final void m16464q0(InterfaceC8845j interfaceC8845j) {
        Result.C9076a c9076a = Result.f17350b;
        interfaceC8845j.resumeWith(Result.m15909b(C9160c.m16531b(C9160c.f17673b.m16542a(m16429N()))));
    }

    /* renamed from: r0 */
    public final void m16465r0(InterfaceC8845j interfaceC8845j) {
        Result.C9076a c9076a = Result.f17350b;
        interfaceC8845j.resumeWith(Result.m15909b(AbstractC9079b.m15925a(m16433Q())));
    }

    /* renamed from: s0 */
    public final void m16466s0(InterfaceC9854j interfaceC9854j) {
        interfaceC9854j.mo16842e(BufferedChannelKt.m16518z());
    }

    @Override // kotlinx.coroutines.channels.InterfaceC9163f
    public Object send(Object obj, InterfaceC9324c interfaceC9324c) {
        return m16380M0(this, obj, interfaceC9324c);
    }

    /* renamed from: t0 */
    public final void m16467t0(Object obj, InterfaceC9854j interfaceC9854j) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        InterfaceC10570l interfaceC10570l = this.f17618b;
        if (interfaceC10570l != null) {
            OnUndeliveredElementKt.m16744b(interfaceC10570l, obj, interfaceC9854j.getContext());
        }
        interfaceC9854j.mo16842e(BufferedChannelKt.m16518z());
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x01e9, code lost:
    
        r16 = r7;
        r3 = (p157k8.C9068d) r3.m17314f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01f2, code lost:
    
        if (r3 != null) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.toString():java.lang.String");
    }

    @Override // kotlinx.coroutines.channels.InterfaceC9163f
    /* renamed from: trySend-JP2dKIU */
    public Object mo27213trySendJP2dKIU(Object obj) {
        Object obj2;
        int i10;
        C9068d c9068d;
        BufferedChannel bufferedChannel;
        if (m16431O0(f17608d.get(this))) {
            return C9160c.f17673b.m16543b();
        }
        Object obj3 = BufferedChannelKt.f17650j;
        C9068d c9068d2 = (C9068d) m16385V().get(this);
        while (true) {
            long andIncrement = m16386W().getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zM16455h0 = m16455h0(andIncrement);
            int i11 = BufferedChannelKt.f17642b;
            long j11 = j10 / i11;
            int i12 = (int) (j10 % i11);
            if (c9068d2.f18641c != j11) {
                C9068d c9068dM16424J = m16424J(j11, c9068d2);
                if (c9068dM16424J != null) {
                    i10 = i12;
                    c9068d = c9068dM16424J;
                    bufferedChannel = this;
                    obj2 = obj;
                } else if (zM16455h0) {
                    return C9160c.f17673b.m16542a(m16439U());
                }
            } else {
                obj2 = obj;
                i10 = i12;
                c9068d = c9068d2;
                bufferedChannel = this;
            }
            int iM16442W0 = bufferedChannel.m16442W0(c9068d, i10, obj2, j10, obj3, zM16455h0);
            c9068d2 = c9068d;
            if (iM16442W0 == 0) {
                c9068d2.m17311c();
                return C9160c.f17673b.m16544c(C8736p.f16368a);
            }
            if (iM16442W0 == 1) {
                return C9160c.f17673b.m16544c(C8736p.f16368a);
            }
            if (iM16442W0 == 2) {
                if (zM16455h0) {
                    c9068d2.m17295t();
                    return C9160c.f17673b.m16542a(m16439U());
                }
                InterfaceC8895z1 interfaceC8895z1 = obj3 instanceof InterfaceC8895z1 ? (InterfaceC8895z1) obj3 : null;
                if (interfaceC8895z1 != null) {
                    m16476z0(interfaceC8895z1, c9068d2, i10);
                }
                c9068d2.m17295t();
                return C9160c.f17673b.m16543b();
            }
            if (iM16442W0 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iM16442W0 == 4) {
                if (j10 < m16437T()) {
                    c9068d2.m17311c();
                }
                return C9160c.f17673b.m16542a(m16439U());
            }
            if (iM16442W0 == 5) {
                c9068d2.m17311c();
            }
            obj = obj2;
        }
    }

    /* renamed from: u0 */
    public final Object m16468u0(Object obj, InterfaceC9324c interfaceC9324c) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        UndeliveredElementException undeliveredElementExceptionM16746d;
        C9155c c9155c = new C9155c(IntrinsicsKt__IntrinsicsJvmKt.m16079d(interfaceC9324c), 1);
        c9155c.m16343D();
        InterfaceC10570l interfaceC10570l = this.f17618b;
        if (interfaceC10570l == null || (undeliveredElementExceptionM16746d = OnUndeliveredElementKt.m16746d(interfaceC10570l, obj, null, 2, null)) == null) {
            Throwable thM16439U = m16439U();
            Result.C9076a c9076a = Result.f17350b;
            c9155c.resumeWith(Result.m15909b(AbstractC9079b.m15925a(thM16439U)));
        } else {
            AbstractC8722b.m14228a(undeliveredElementExceptionM16746d, m16439U());
            Result.C9076a c9076a2 = Result.f17350b;
            c9155c.resumeWith(Result.m15909b(AbstractC9079b.m15925a(undeliveredElementExceptionM16746d)));
        }
        Object objM16372x = c9155c.m16372x();
        if (objM16372x == AbstractC9434a.m17291f()) {
            AbstractC9541f.m17811c(interfaceC9324c);
        }
        return objM16372x == AbstractC9434a.m17291f() ? objM16372x : C8736p.f16368a;
    }

    @Override // p157k8.InterfaceC9073i
    /* renamed from: v */
    public Object mo15879v(InterfaceC9324c interfaceC9324c) {
        return m16377D0(this, interfaceC9324c);
    }

    /* renamed from: v0 */
    public final void m16469v0(Object obj, InterfaceC8845j interfaceC8845j) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        InterfaceC10570l interfaceC10570l = this.f17618b;
        if (interfaceC10570l != null) {
            OnUndeliveredElementKt.m16744b(interfaceC10570l, obj, interfaceC8845j.getContext());
        }
        Throwable thM16439U = m16439U();
        Result.C9076a c9076a = Result.f17350b;
        interfaceC8845j.resumeWith(Result.m15909b(AbstractC9079b.m15925a(thM16439U)));
    }

    /* renamed from: w0 */
    public void m16470w0() {
    }

    /* renamed from: x */
    public final boolean m16471x(long j10) {
        return j10 < m16427L() || j10 < m16437T() + ((long) this.f17617a);
    }

    /* renamed from: x0 */
    public void m16472x0() {
    }

    /* renamed from: y */
    public boolean m16473y(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return m16410B(th, true);
    }

    /* renamed from: y0 */
    public final void m16474y0(InterfaceC8895z1 interfaceC8895z1, C9068d c9068d, int i10) {
        m16472x0();
        interfaceC8895z1.mo14938c(c9068d, i10);
    }

    /* renamed from: z */
    public final void m16475z(C9068d c9068d, long j10) {
        Object objM17371b = AbstractC9457l.m17371b(null, 1, null);
        loop0: while (c9068d != null) {
            for (int i10 = BufferedChannelKt.f17642b - 1; -1 < i10; i10--) {
                if ((c9068d.f18641c * BufferedChannelKt.f17642b) + i10 < j10) {
                    break loop0;
                }
                while (true) {
                    Object objM15883B = c9068d.m15883B(i10);
                    if (objM15883B != null && objM15883B != BufferedChannelKt.f17645e) {
                        if (!(objM15883B instanceof C9074j)) {
                            if (!(objM15883B instanceof InterfaceC8895z1)) {
                                break;
                            }
                            if (c9068d.m15891v(i10, objM15883B, BufferedChannelKt.m16518z())) {
                                objM17371b = AbstractC9457l.m17372c(objM17371b, objM15883B);
                                c9068d.m15884C(i10, true);
                                break;
                            }
                        } else {
                            if (c9068d.m15891v(i10, objM15883B, BufferedChannelKt.m16518z())) {
                                objM17371b = AbstractC9457l.m17372c(objM17371b, ((C9074j) objM15883B).f17334a);
                                c9068d.m15884C(i10, true);
                                break;
                            }
                        }
                    } else {
                        if (c9068d.m15891v(i10, objM15883B, BufferedChannelKt.m16518z())) {
                            c9068d.m17295t();
                            break;
                        }
                    }
                }
            }
            c9068d = (C9068d) c9068d.m17316h();
        }
        if (objM17371b != null) {
            if (!(objM17371b instanceof ArrayList)) {
                m16425J0((InterfaceC8895z1) objM17371b);
                return;
            }
            AbstractC9133u.m16131e(objM17371b, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ArrayList arrayList = (ArrayList) objM17371b;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                m16425J0((InterfaceC8895z1) arrayList.get(size));
            }
        }
    }

    /* renamed from: z0 */
    public final void m16476z0(InterfaceC8895z1 interfaceC8895z1, C9068d c9068d, int i10) {
        interfaceC8895z1.mo14938c(c9068d, i10 + BufferedChannelKt.f17642b);
    }
}
