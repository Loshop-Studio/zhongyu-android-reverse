package kotlinx.coroutines.internal;

import androidx.concurrent.futures.AbstractC3223a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.PropertyReference0Impl;
import p410xd.C11858m;
import p410xd.C11872w;
import sd.AbstractC11126j0;

/* loaded from: classes6.dex */
public class LockFreeLinkedListNode {

    /* renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23980c = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_next$volatile");

    /* renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23981d = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_prev$volatile");

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f23982e = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* renamed from: c */
    public final boolean m20908c(LockFreeLinkedListNode lockFreeLinkedListNode, int i10) {
        LockFreeLinkedListNode lockFreeLinkedListNodeM20917l;
        do {
            lockFreeLinkedListNodeM20917l = m20917l();
            if (lockFreeLinkedListNodeM20917l instanceof C11858m) {
                return (((C11858m) lockFreeLinkedListNodeM20917l).f28110f & i10) == 0 && lockFreeLinkedListNodeM20917l.m20908c(lockFreeLinkedListNode, i10);
            }
        } while (!lockFreeLinkedListNodeM20917l.m20909d(lockFreeLinkedListNode, this));
        return true;
    }

    /* renamed from: d */
    public final boolean m20909d(LockFreeLinkedListNode lockFreeLinkedListNode, LockFreeLinkedListNode lockFreeLinkedListNode2) {
        f23981d.set(lockFreeLinkedListNode, this);
        f23980c.set(lockFreeLinkedListNode, lockFreeLinkedListNode2);
        if (!AbstractC3223a.m1395a(f23980c, this, lockFreeLinkedListNode2, lockFreeLinkedListNode)) {
            return false;
        }
        lockFreeLinkedListNode.m20914i(lockFreeLinkedListNode2);
        return true;
    }

    /* renamed from: e */
    public final boolean m20910e(LockFreeLinkedListNode lockFreeLinkedListNode) {
        f23981d.set(lockFreeLinkedListNode, this);
        f23980c.set(lockFreeLinkedListNode, this);
        while (m20915j() == this) {
            if (AbstractC3223a.m1395a(f23980c, this, this, lockFreeLinkedListNode)) {
                lockFreeLinkedListNode.m20914i(this);
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void m20911f(int i10) {
        m20908c(new C11858m(i10), i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (androidx.concurrent.futures.AbstractC3223a.m1395a(kotlinx.coroutines.internal.LockFreeLinkedListNode.f23980c, r3, r2, ((p410xd.C11872w) r4).f28132a) != false) goto L21;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.internal.LockFreeLinkedListNode m20912g() {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = m20906n()
            java.lang.Object r0 = r0.get(r7)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r1 = 0
            r2 = r0
        Lc:
            r3 = r1
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = m20905m()
            java.lang.Object r4 = r4.get(r2)
            if (r4 != r7) goto L26
            if (r0 != r2) goto L1a
            goto L25
        L1a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = m20906n()
            boolean r0 = androidx.concurrent.futures.AbstractC3223a.m1395a(r1, r7, r0, r2)
            if (r0 != 0) goto L25
            goto L0
        L25:
            return r2
        L26:
            boolean r5 = r7.mo20918p()
            if (r5 == 0) goto L2d
            return r1
        L2d:
            boolean r5 = r4 instanceof p410xd.C11872w
            if (r5 == 0) goto L4f
            if (r3 == 0) goto L44
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = m20905m()
            xd.w r4 = (p410xd.C11872w) r4
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = r4.f28132a
            boolean r2 = androidx.concurrent.futures.AbstractC3223a.m1395a(r5, r3, r2, r4)
            if (r2 != 0) goto L42
            goto L0
        L42:
            r2 = r3
            goto Lc
        L44:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = m20906n()
            java.lang.Object r2 = r4.get(r2)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r2
            goto Ld
        L4f:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.AbstractC9979u.m20292e(r4, r3)
            r3 = r4
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.LockFreeLinkedListNode.m20912g():kotlinx.coroutines.internal.LockFreeLinkedListNode");
    }

    /* renamed from: h */
    public final LockFreeLinkedListNode m20913h(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.mo20918p()) {
            lockFreeLinkedListNode = (LockFreeLinkedListNode) f23981d.get(lockFreeLinkedListNode);
        }
        return lockFreeLinkedListNode;
    }

    /* renamed from: i */
    public final void m20914i(LockFreeLinkedListNode lockFreeLinkedListNode) {
        LockFreeLinkedListNode lockFreeLinkedListNode2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23981d;
        do {
            lockFreeLinkedListNode2 = (LockFreeLinkedListNode) atomicReferenceFieldUpdater.get(lockFreeLinkedListNode);
            if (m20915j() != lockFreeLinkedListNode) {
                return;
            }
        } while (!AbstractC3223a.m1395a(f23981d, lockFreeLinkedListNode, lockFreeLinkedListNode2, this));
        if (mo20918p()) {
            lockFreeLinkedListNode.m20912g();
        }
    }

    /* renamed from: j */
    public final Object m20915j() {
        return f23980c.get(this);
    }

    /* renamed from: k */
    public final LockFreeLinkedListNode m20916k() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        Object objM20915j = m20915j();
        C11872w c11872w = objM20915j instanceof C11872w ? (C11872w) objM20915j : null;
        if (c11872w != null && (lockFreeLinkedListNode = c11872w.f28132a) != null) {
            return lockFreeLinkedListNode;
        }
        AbstractC9979u.m20292e(objM20915j, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (LockFreeLinkedListNode) objM20915j;
    }

    /* renamed from: l */
    public final LockFreeLinkedListNode m20917l() {
        LockFreeLinkedListNode lockFreeLinkedListNodeM20912g = m20912g();
        return lockFreeLinkedListNodeM20912g == null ? m20913h((LockFreeLinkedListNode) f23981d.get(this)) : lockFreeLinkedListNodeM20912g;
    }

    /* renamed from: p */
    public boolean mo20918p() {
        return m20915j() instanceof C11872w;
    }

    /* renamed from: q */
    public boolean m20919q() {
        return m20920r() == null;
    }

    /* renamed from: r */
    public final LockFreeLinkedListNode m20920r() {
        Object objM20915j;
        LockFreeLinkedListNode lockFreeLinkedListNode;
        do {
            objM20915j = m20915j();
            if (objM20915j instanceof C11872w) {
                return ((C11872w) objM20915j).f28132a;
            }
            if (objM20915j == this) {
                return (LockFreeLinkedListNode) objM20915j;
            }
            AbstractC9979u.m20292e(objM20915j, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            lockFreeLinkedListNode = (LockFreeLinkedListNode) objM20915j;
        } while (!AbstractC3223a.m1395a(f23980c, this, objM20915j, lockFreeLinkedListNode.m20921s()));
        lockFreeLinkedListNode.m20912g();
        return null;
    }

    /* renamed from: s */
    public final C11872w m20921s() {
        C11872w c11872w = (C11872w) f23982e.get(this);
        if (c11872w != null) {
            return c11872w;
        }
        C11872w c11872w2 = new C11872w(this);
        f23982e.set(this, c11872w2);
        return c11872w2;
    }

    public String toString() {
        return new PropertyReference0Impl(this) { // from class: kotlinx.coroutines.internal.LockFreeLinkedListNode.toString.1
            @Override // kotlin.jvm.internal.PropertyReference0Impl, p280od.InterfaceC10479m
            public Object get() {
                return AbstractC11126j0.m24738a(this.receiver);
            }
        } + '@' + AbstractC11126j0.m24739b(this);
    }
}
