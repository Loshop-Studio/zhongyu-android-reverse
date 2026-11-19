package androidx.room;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;

/* loaded from: classes3.dex */
public /* synthetic */ class RoomDatabase$closeBarrier$1 extends FunctionReferenceImpl implements InterfaceC9529a {
    public RoomDatabase$closeBarrier$1(Object obj) {
        super(0, obj, RoomDatabase.class, "onClosed", "onClosed()V", 0);
    }

    @Override // p181hd.InterfaceC9529a
    public /* bridge */ /* synthetic */ Object invoke() {
        m33810invoke();
        return C10786q.f26013a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m33810invoke() {
        ((RoomDatabase) this.receiver).onClosed();
    }
}
