package kotlinx.coroutines;

import androidx.compose.animation.core.AnimationKt;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC5830k;
import p054e7.C5478j;
import p054e7.C5486r;
import p054e7.C5489u;
import p075h6.InterfaceC5636h;

/* renamed from: kotlinx.coroutines.n0 */
/* loaded from: classes4.dex */
public abstract class AbstractC5984n0 extends AbstractC5987o0 implements InterfaceC5870c0 {

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9472e = AtomicReferenceFieldUpdater.newUpdater(AbstractC5984n0.class, Object.class, "_queue$volatile");

    /* renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9473f = AtomicReferenceFieldUpdater.newUpdater(AbstractC5984n0.class, Object.class, "_delayed$volatile");

    /* renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9474g = AtomicIntegerFieldUpdater.newUpdater(AbstractC5984n0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // kotlinx.coroutines.InterfaceC5870c0
    /* renamed from: a */
    public InterfaceC5962g0 mo4815a(long j7, RunnableC5994q1 runnableC5994q1, InterfaceC5636h interfaceC5636h) {
        return AbstractC6018z.f9531a.mo4815a(j7, runnableC5994q1, interfaceC5636h);
    }

    @Override // kotlinx.coroutines.InterfaceC5870c0
    /* renamed from: b */
    public final void mo4816b(long j7, C5961g c5961g) {
        long j8 = j7 > 0 ? j7 >= 9223372036854L ? Long.MAX_VALUE : AnimationKt.MillisToNanos * j7 : 0L;
        if (j8 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            C5972j0 c5972j0 = new C5972j0(this, j8 + jNanoTime, c5961g);
            m5601v(jNanoTime, c5972j0);
            c5961g.m5586w(new C5892e(c5972j0, 1));
        }
    }

    @Override // kotlinx.coroutines.AbstractC5995r
    public final void dispatch(InterfaceC5636h interfaceC5636h, Runnable runnable) {
        mo5597r(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r7 = null;
     */
    @Override // kotlinx.coroutines.AbstractC5987o0
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo5596n() {
        /*
            r10 = this;
            e7.r r0 = kotlinx.coroutines.AbstractC6014x.f9519c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.AbstractC5984n0.f9472e
            boolean r2 = r10.m5606o()
            r3 = 0
            if (r2 == 0) goto Le
            goto Lb4
        Le:
            r10.m5598s()
        L11:
            java.lang.Object r2 = r1.get(r10)
            r5 = 0
            if (r2 != 0) goto L1a
        L18:
            r7 = r5
            goto L4a
        L1a:
            boolean r6 = r2 instanceof p054e7.C5478j
            if (r6 == 0) goto L3e
            r6 = r2
            e7.j r6 = (p054e7.C5478j) r6
            java.lang.Object r7 = r6.m4854d()
            e7.r r8 = p054e7.C5478j.f8466g
            if (r7 == r8) goto L2c
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L4a
        L2c:
            e7.j r6 = r6.m4853c()
        L30:
            boolean r5 = r1.compareAndSet(r10, r2, r6)
            if (r5 == 0) goto L37
            goto L11
        L37:
            java.lang.Object r5 = r1.get(r10)
            if (r5 == r2) goto L30
            goto L11
        L3e:
            if (r2 != r0) goto L41
            goto L18
        L41:
            boolean r6 = r1.compareAndSet(r10, r2, r5)
            if (r6 == 0) goto Lb9
            r7 = r2
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L4a:
            if (r7 == 0) goto L50
            r7.run()
            return r3
        L50:
            kotlin.collections.p r2 = r10.f9483c
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 != 0) goto L5b
        L59:
            r8 = r6
            goto L63
        L5b:
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L62
            goto L59
        L62:
            r8 = r3
        L63:
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 != 0) goto L68
            goto Lb4
        L68:
            java.lang.Object r1 = r1.get(r10)
            if (r1 == 0) goto L90
            boolean r2 = r1 instanceof p054e7.C5478j
            if (r2 == 0) goto L8d
            e7.j r1 = (p054e7.C5478j) r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p054e7.C5478j.f8465f
            long r0 = r0.get(r1)
            r8 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r8 = r8 & r0
            int r2 = (int) r8
            r8 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r8
            r8 = 30
            long r0 = r0 >> r8
            int r0 = (int) r0
            if (r2 != r0) goto L8c
            goto L90
        L8c:
            return r3
        L8d:
            if (r1 != r0) goto Lb4
            goto Lb8
        L90:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.AbstractC5984n0.f9473f
            java.lang.Object r0 = r0.get(r10)
            kotlinx.coroutines.m0 r0 = (kotlinx.coroutines.C5981m0) r0
            if (r0 == 0) goto Lb8
            monitor-enter(r0)
            kotlinx.coroutines.l0[] r1 = r0.f8485a     // Catch: java.lang.Throwable -> La3
            if (r1 == 0) goto La5
            r2 = 0
            r5 = r1[r2]     // Catch: java.lang.Throwable -> La3
            goto La5
        La3:
            r1 = move-exception
            goto Lb6
        La5:
            monitor-exit(r0)
            if (r5 != 0) goto La9
            goto Lb8
        La9:
            long r0 = r5.f9468a
            long r5 = java.lang.System.nanoTime()
            long r0 = r0 - r5
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto Lb5
        Lb4:
            return r3
        Lb5:
            return r0
        Lb6:
            monitor-exit(r0)
            throw r1
        Lb8:
            return r6
        Lb9:
            java.lang.Object r6 = r1.get(r10)
            if (r6 == r2) goto L41
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.AbstractC5984n0.mo5596n():long");
    }

    /* renamed from: r */
    public void mo5597r(Runnable runnable) {
        m5598s();
        if (!m5599t(runnable)) {
            RunnableC6016y.f9528h.mo5597r(runnable);
            return;
        }
        Thread threadMo5514l = mo5514l();
        if (Thread.currentThread() != threadMo5514l) {
            LockSupport.unpark(threadMo5514l);
        }
    }

    /* renamed from: s */
    public final void m5598s() {
        AbstractRunnableC5978l0 abstractRunnableC5978l0M4868b;
        C5981m0 c5981m0 = (C5981m0) f9473f.get(this);
        if (c5981m0 == null || C5489u.f8484b.get(c5981m0) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (c5981m0) {
                try {
                    AbstractRunnableC5978l0[] abstractRunnableC5978l0Arr = c5981m0.f8485a;
                    AbstractRunnableC5978l0 abstractRunnableC5978l0 = abstractRunnableC5978l0Arr != null ? abstractRunnableC5978l0Arr[0] : null;
                    if (abstractRunnableC5978l0 != null) {
                        abstractRunnableC5978l0M4868b = ((jNanoTime - abstractRunnableC5978l0.f9468a) > 0L ? 1 : ((jNanoTime - abstractRunnableC5978l0.f9468a) == 0L ? 0 : -1)) >= 0 ? m5599t(abstractRunnableC5978l0) : false ? c5981m0.m4868b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (abstractRunnableC5978l0M4868b != null);
    }

    @Override // kotlinx.coroutines.AbstractC5987o0
    public void shutdown() {
        AbstractRunnableC5978l0 abstractRunnableC5978l0M4868b;
        AbstractC5988o1.f9484a.set(null);
        f9474g.set(this, 1);
        C5486r c5486r = AbstractC6014x.f9519c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9472e;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof C5478j)) {
                    if (obj != c5486r) {
                        C5478j c5478j = new C5478j(8, true);
                        c5478j.m4851a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c5478j)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((C5478j) obj).m4852b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c5486r)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (mo5596n() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            C5981m0 c5981m0 = (C5981m0) f9473f.get(this);
            if (c5981m0 == null) {
                return;
            }
            synchronized (c5981m0) {
                abstractRunnableC5978l0M4868b = C5489u.f8484b.get(c5981m0) > 0 ? c5981m0.m4868b(0) : null;
            }
            if (abstractRunnableC5978l0M4868b == null) {
                return;
            } else {
                mo5607q(jNanoTime, abstractRunnableC5978l0M4868b);
            }
        }
    }

    /* renamed from: t */
    public final boolean m5599t(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9472e;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f9474g.get(this) != 1) {
                if (obj != null) {
                    if (!(obj instanceof C5478j)) {
                        if (obj != AbstractC6014x.f9519c) {
                            C5478j c5478j = new C5478j(8, true);
                            c5478j.m4851a((Runnable) obj);
                            c5478j.m4851a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c5478j)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        return false;
                    }
                    C5478j c5478j2 = (C5478j) obj;
                    int iM4851a = c5478j2.m4851a(runnable);
                    if (iM4851a == 0) {
                        break;
                    }
                    if (iM4851a == 1) {
                        C5478j c5478jM4853c = c5478j2.m4853c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c5478jM4853c) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (iM4851a == 2) {
                        return false;
                    }
                } else {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    }
                    break loop0;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m5600u() {
        /*
            r7 = this;
            kotlin.collections.p r0 = r7.f9483c
            r1 = 1
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            goto Lb
        La:
            r0 = r1
        Lb:
            r2 = 0
            if (r0 != 0) goto Lf
            goto L54
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.AbstractC5984n0.f9473f
            java.lang.Object r0 = r0.get(r7)
            kotlinx.coroutines.m0 r0 = (kotlinx.coroutines.C5981m0) r0
            if (r0 == 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = p054e7.C5489u.f8484b
            int r0 = r3.get(r0)
            if (r0 != 0) goto L23
            r0 = r1
            goto L24
        L23:
            r0 = r2
        L24:
            if (r0 != 0) goto L27
            goto L54
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.AbstractC5984n0.f9472e
            java.lang.Object r0 = r0.get(r7)
            if (r0 != 0) goto L30
            goto L53
        L30:
            boolean r3 = r0 instanceof p054e7.C5478j
            if (r3 == 0) goto L4f
            e7.j r0 = (p054e7.C5478j) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = p054e7.C5478j.f8465f
            long r3 = r3.get(r0)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            int r0 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r5
            r5 = 30
            long r3 = r3 >> r5
            int r3 = (int) r3
            if (r0 != r3) goto L4e
            return r1
        L4e:
            return r2
        L4f:
            e7.r r3 = kotlinx.coroutines.AbstractC6014x.f9519c
            if (r0 != r3) goto L54
        L53:
            return r1
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.AbstractC5984n0.m5600u():boolean");
    }

    /* renamed from: v */
    public final void m5601v(long j7, AbstractRunnableC5978l0 abstractRunnableC5978l0) {
        int iM5594b;
        Thread threadMo5514l;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9473f;
        if (f9474g.get(this) == 1) {
            iM5594b = 1;
        } else {
            C5981m0 c5981m0 = (C5981m0) atomicReferenceFieldUpdater.get(this);
            if (c5981m0 == null) {
                C5981m0 c5981m02 = new C5981m0();
                c5981m02.f9471c = j7;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c5981m02) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                AbstractC5830k.m5327d(obj);
                c5981m0 = (C5981m0) obj;
            }
            iM5594b = abstractRunnableC5978l0.m5594b(j7, c5981m0, this);
        }
        if (iM5594b != 0) {
            if (iM5594b == 1) {
                mo5607q(j7, abstractRunnableC5978l0);
                return;
            } else {
                if (iM5594b != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        C5981m0 c5981m03 = (C5981m0) atomicReferenceFieldUpdater.get(this);
        if (c5981m03 != null) {
            synchronized (c5981m03) {
                AbstractRunnableC5978l0[] abstractRunnableC5978l0Arr = c5981m03.f8485a;
                abstractRunnableC5978l0 = abstractRunnableC5978l0Arr != null ? abstractRunnableC5978l0Arr[0] : null;
            }
        }
        if (abstractRunnableC5978l0 != abstractRunnableC5978l0 || Thread.currentThread() == (threadMo5514l = mo5514l())) {
            return;
        }
        LockSupport.unpark(threadMo5514l);
    }
}
