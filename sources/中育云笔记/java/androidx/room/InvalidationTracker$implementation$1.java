package androidx.room;

import java.util.Set;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes3.dex */
public /* synthetic */ class InvalidationTracker$implementation$1 extends FunctionReferenceImpl implements InterfaceC9540l {
    public InvalidationTracker$implementation$1(Object obj) {
        super(1, obj, InvalidationTracker.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0);
    }

    @Override // p181hd.InterfaceC9540l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Set<Integer>) obj);
        return C10786q.f26013a;
    }

    public final void invoke(Set<Integer> p02) {
        AbstractC9979u.m20294g(p02, "p0");
        ((InvalidationTracker) this.receiver).notifyInvalidatedObservers(p02);
    }
}
