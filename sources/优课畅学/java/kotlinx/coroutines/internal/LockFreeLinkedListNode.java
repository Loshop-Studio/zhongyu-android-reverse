package kotlinx.coroutines.internal;

import androidx.concurrent.futures.AbstractC3193a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.PropertyReference0Impl;
import p135i8.AbstractC8825c0;
import p191n8.AbstractC9437b;
import p191n8.AbstractC9470w;
import p191n8.C9471x;

/* loaded from: classes5.dex */
public class LockFreeLinkedListNode {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18069a = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_next$volatile");

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18070b = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_prev$volatile");

    /* renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18071c = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* renamed from: kotlinx.coroutines.internal.LockFreeLinkedListNode$a */
    public static abstract class AbstractC9206a extends AbstractC9437b {

        /* renamed from: b */
        public final LockFreeLinkedListNode f18072b;

        /* renamed from: c */
        public LockFreeLinkedListNode f18073c;

        public AbstractC9206a(LockFreeLinkedListNode lockFreeLinkedListNode) {
            this.f18072b = lockFreeLinkedListNode;
        }

        @Override // p191n8.AbstractC9437b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo16741b(LockFreeLinkedListNode lockFreeLinkedListNode, Object obj) {
            boolean z10 = obj == null;
            LockFreeLinkedListNode lockFreeLinkedListNode2 = z10 ? this.f18072b : this.f18073c;
            if (lockFreeLinkedListNode2 != null && AbstractC3193a.m1318a(LockFreeLinkedListNode.m16726l(), lockFreeLinkedListNode, this, lockFreeLinkedListNode2) && z10) {
                LockFreeLinkedListNode lockFreeLinkedListNode3 = this.f18072b;
                LockFreeLinkedListNode lockFreeLinkedListNode4 = this.f18073c;
                AbstractC9133u.m16130d(lockFreeLinkedListNode4);
                lockFreeLinkedListNode3.m16732h(lockFreeLinkedListNode4);
            }
        }
    }

    /* renamed from: l */
    public static final /* synthetic */ AtomicReferenceFieldUpdater m16726l() {
        return f18069a;
    }

    /* renamed from: e */
    public final boolean m16729e(LockFreeLinkedListNode lockFreeLinkedListNode) {
        f18070b.set(lockFreeLinkedListNode, this);
        f18069a.set(lockFreeLinkedListNode, this);
        while (m16733i() == this) {
            if (AbstractC3193a.m1318a(f18069a, this, this, lockFreeLinkedListNode)) {
                lockFreeLinkedListNode.m16732h(this);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (androidx.concurrent.futures.AbstractC3193a.m1318a(kotlinx.coroutines.internal.LockFreeLinkedListNode.f18069a, r3, r2, ((p191n8.C9471x) r4).f18692a) != false) goto L25;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.internal.LockFreeLinkedListNode m16730f(p191n8.AbstractC9470w r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = m16727m()
            java.lang.Object r0 = r0.get(r7)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r1 = 0
            r2 = r0
        Lc:
            r3 = r1
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = m16726l()
            java.lang.Object r4 = r4.get(r2)
            if (r4 != r7) goto L25
            if (r0 != r2) goto L1a
            goto L2e
        L1a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = m16727m()
            boolean r0 = androidx.concurrent.futures.AbstractC3193a.m1318a(r1, r7, r0, r2)
            if (r0 != 0) goto L2e
            goto L0
        L25:
            boolean r5 = r7.mo16736o()
            if (r5 == 0) goto L2c
            return r1
        L2c:
            if (r4 != r8) goto L2f
        L2e:
            return r2
        L2f:
            boolean r5 = r4 instanceof p191n8.AbstractC9470w
            if (r5 == 0) goto L39
            n8.w r4 = (p191n8.AbstractC9470w) r4
            r4.mo17298a(r2)
            goto L0
        L39:
            boolean r5 = r4 instanceof p191n8.C9471x
            if (r5 == 0) goto L5b
            if (r3 == 0) goto L50
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = m16726l()
            n8.x r4 = (p191n8.C9471x) r4
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = r4.f18692a
            boolean r2 = androidx.concurrent.futures.AbstractC3193a.m1318a(r5, r3, r2, r4)
            if (r2 != 0) goto L4e
            goto L0
        L4e:
            r2 = r3
            goto Lc
        L50:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = m16727m()
            java.lang.Object r2 = r4.get(r2)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r2
            goto Ld
        L5b:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.AbstractC9133u.m16131e(r4, r3)
            r3 = r4
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.LockFreeLinkedListNode.m16730f(n8.w):kotlinx.coroutines.internal.LockFreeLinkedListNode");
    }

    /* renamed from: g */
    public final LockFreeLinkedListNode m16731g(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.mo16736o()) {
            lockFreeLinkedListNode = (LockFreeLinkedListNode) f18070b.get(lockFreeLinkedListNode);
        }
        return lockFreeLinkedListNode;
    }

    /* renamed from: h */
    public final void m16732h(LockFreeLinkedListNode lockFreeLinkedListNode) {
        LockFreeLinkedListNode lockFreeLinkedListNode2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18070b;
        do {
            lockFreeLinkedListNode2 = (LockFreeLinkedListNode) atomicReferenceFieldUpdater.get(lockFreeLinkedListNode);
            if (m16733i() != lockFreeLinkedListNode) {
                return;
            }
        } while (!AbstractC3193a.m1318a(f18070b, lockFreeLinkedListNode, lockFreeLinkedListNode2, this));
        if (mo16736o()) {
            lockFreeLinkedListNode.m16730f(null);
        }
    }

    /* renamed from: i */
    public final Object m16733i() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18069a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof AbstractC9470w)) {
                return obj;
            }
            ((AbstractC9470w) obj).mo17298a(this);
        }
    }

    /* renamed from: j */
    public final LockFreeLinkedListNode m16734j() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        Object objM16733i = m16733i();
        C9471x c9471x = objM16733i instanceof C9471x ? (C9471x) objM16733i : null;
        if (c9471x != null && (lockFreeLinkedListNode = c9471x.f18692a) != null) {
            return lockFreeLinkedListNode;
        }
        AbstractC9133u.m16131e(objM16733i, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (LockFreeLinkedListNode) objM16733i;
    }

    /* renamed from: k */
    public final LockFreeLinkedListNode m16735k() {
        LockFreeLinkedListNode lockFreeLinkedListNodeM16730f = m16730f(null);
        return lockFreeLinkedListNodeM16730f == null ? m16731g((LockFreeLinkedListNode) f18070b.get(this)) : lockFreeLinkedListNodeM16730f;
    }

    /* renamed from: o */
    public boolean mo16736o() {
        return m16733i() instanceof C9471x;
    }

    /* renamed from: p */
    public boolean m16737p() {
        return m16738q() == null;
    }

    /* renamed from: q */
    public final LockFreeLinkedListNode m16738q() {
        Object objM16733i;
        LockFreeLinkedListNode lockFreeLinkedListNode;
        do {
            objM16733i = m16733i();
            if (objM16733i instanceof C9471x) {
                return ((C9471x) objM16733i).f18692a;
            }
            if (objM16733i == this) {
                return (LockFreeLinkedListNode) objM16733i;
            }
            AbstractC9133u.m16131e(objM16733i, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            lockFreeLinkedListNode = (LockFreeLinkedListNode) objM16733i;
        } while (!AbstractC3193a.m1318a(f18069a, this, objM16733i, lockFreeLinkedListNode.m16739r()));
        lockFreeLinkedListNode.m16730f(null);
        return null;
    }

    /* renamed from: r */
    public final C9471x m16739r() {
        C9471x c9471x = (C9471x) f18071c.get(this);
        if (c9471x != null) {
            return c9471x;
        }
        C9471x c9471x2 = new C9471x(this);
        f18071c.set(this, c9471x2);
        return c9471x2;
    }

    /* renamed from: s */
    public final int m16740s(LockFreeLinkedListNode lockFreeLinkedListNode, LockFreeLinkedListNode lockFreeLinkedListNode2, AbstractC9206a abstractC9206a) {
        f18070b.set(lockFreeLinkedListNode, this);
        f18069a.set(lockFreeLinkedListNode, lockFreeLinkedListNode2);
        abstractC9206a.f18073c = lockFreeLinkedListNode2;
        if (AbstractC3193a.m1318a(f18069a, this, lockFreeLinkedListNode2, abstractC9206a)) {
            return abstractC9206a.mo17298a(this) == null ? 1 : 2;
        }
        return 0;
    }

    public String toString() {
        return new PropertyReference0Impl(this) { // from class: kotlinx.coroutines.internal.LockFreeLinkedListNode.toString.1
            @Override // kotlin.jvm.internal.PropertyReference0Impl, p089e8.InterfaceC8384l
            public Object get() {
                return AbstractC8825c0.m14820a(this.receiver);
            }
        } + '@' + AbstractC8825c0.m14821b(this);
    }
}
