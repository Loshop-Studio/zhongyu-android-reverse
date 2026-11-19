package androidx.room;

import java.util.Set;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public /* synthetic */ class InvalidationTracker$implementation$1 extends FunctionReferenceImpl implements InterfaceC10570l {
    public InvalidationTracker$implementation$1(Object obj) {
        super(1, obj, InvalidationTracker.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0);
    }

    @Override // p300x7.InterfaceC10570l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Set<Integer>) obj);
        return C8736p.f16368a;
    }

    public final void invoke(Set<Integer> p02) {
        AbstractC9133u.m16133g(p02, "p0");
        ((InvalidationTracker) this.receiver).notifyInvalidatedObservers(p02);
    }
}
