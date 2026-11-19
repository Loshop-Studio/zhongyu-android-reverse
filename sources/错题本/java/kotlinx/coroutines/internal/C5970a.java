package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlinx.coroutines.AbstractC6014x;
import p054e7.C5475g;
import p054e7.C5481m;

/* renamed from: kotlinx.coroutines.internal.a */
/* loaded from: classes4.dex */
public class C5970a {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9461a = AtomicReferenceFieldUpdater.newUpdater(C5970a.class, Object.class, "_next$volatile");

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9462b = AtomicReferenceFieldUpdater.newUpdater(C5970a.class, Object.class, "_prev$volatile");

    /* renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9463c = AtomicReferenceFieldUpdater.newUpdater(C5970a.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* renamed from: c */
    public final boolean m5590c(C5970a c5970a, int i) {
        while (true) {
            C5970a c5970aM5591d = m5591d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9462b;
            if (c5970aM5591d == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    c5970aM5591d = (C5970a) obj;
                    if (!c5970aM5591d.mo5519g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c5970aM5591d);
                }
            }
            if (c5970aM5591d instanceof C5475g) {
                return (((C5475g) c5970aM5591d).f8461d & i) == 0 && c5970aM5591d.m5590c(c5970a, i);
            }
            atomicReferenceFieldUpdater.set(c5970a, c5970aM5591d);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f9461a;
            atomicReferenceFieldUpdater2.set(c5970a, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(c5970aM5591d, this, c5970a)) {
                if (atomicReferenceFieldUpdater2.get(c5970aM5591d) != this) {
                    break;
                }
            }
            c5970a.m5592e(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        r6 = ((p054e7.C5481m) r6).f8475a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.internal.C5970a m5591d() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.C5970a.f9462b
            java.lang.Object r1 = r0.get(r9)
            kotlinx.coroutines.internal.a r1 = (kotlinx.coroutines.internal.C5970a) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.internal.C5970a.f9461a
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            return r3
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.mo5519g()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            boolean r7 = r6 instanceof p054e7.C5481m
            if (r7 == 0) goto L4b
            if (r4 == 0) goto L44
            e7.m r6 = (p054e7.C5481m) r6
            kotlinx.coroutines.internal.a r6 = r6.f8475a
        L35:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L3d
            r3 = r4
            goto La
        L3d:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L35
            goto L0
        L44:
            java.lang.Object r3 = r0.get(r3)
            kotlinx.coroutines.internal.a r3 = (kotlinx.coroutines.internal.C5970a) r3
            goto Lb
        L4b:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.AbstractC5830k.m5328e(r6, r4)
            r4 = r6
            kotlinx.coroutines.internal.a r4 = (kotlinx.coroutines.internal.C5970a) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C5970a.m5591d():kotlinx.coroutines.internal.a");
    }

    /* renamed from: e */
    public final void m5592e(C5970a c5970a) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9462b;
            C5970a c5970a2 = (C5970a) atomicReferenceFieldUpdater.get(c5970a);
            if (f9461a.get(this) != c5970a) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(c5970a, c5970a2, this)) {
                if (atomicReferenceFieldUpdater.get(c5970a) != c5970a2) {
                    break;
                }
            }
            if (mo5519g()) {
                c5970a.m5591d();
                return;
            }
            return;
        }
    }

    /* renamed from: f */
    public final C5970a m5593f() {
        C5970a c5970a;
        Object obj = f9461a.get(this);
        C5481m c5481m = obj instanceof C5481m ? (C5481m) obj : null;
        if (c5481m != null && (c5970a = c5481m.f8475a) != null) {
            return c5970a;
        }
        AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (C5970a) obj;
    }

    /* renamed from: g */
    public boolean mo5519g() {
        return f9461a.get(this) instanceof C5481m;
    }

    public String toString() {
        return new PropertyReference0Impl(this) { // from class: kotlinx.coroutines.internal.LockFreeLinkedListNode$toString$1
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.jvm.internal.PropertyReference0
            public Object get() {
                return this.receiver.getClass().getSimpleName();
            }
        } + '@' + AbstractC6014x.m5642m(this);
    }
}
