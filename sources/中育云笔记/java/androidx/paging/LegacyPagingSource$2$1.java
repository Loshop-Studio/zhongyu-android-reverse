package androidx.paging;

import androidx.paging.DataSource;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.InterfaceC9975q;
import p309qc.InterfaceC10772c;

/* loaded from: classes3.dex */
public final /* synthetic */ class LegacyPagingSource$2$1 implements DataSource.InvalidatedCallback, InterfaceC9975q {
    final /* synthetic */ LegacyPagingSource<Key, Value> $tmp0;

    public LegacyPagingSource$2$1(LegacyPagingSource<Key, Value> legacyPagingSource) {
        this.$tmp0 = legacyPagingSource;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof DataSource.InvalidatedCallback) && (obj instanceof InterfaceC9975q)) {
            return AbstractC9979u.m20289b(getFunctionDelegate(), ((InterfaceC9975q) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC9975q
    public final InterfaceC10772c getFunctionDelegate() {
        return new FunctionReferenceImpl(0, this.$tmp0, LegacyPagingSource.class, "invalidate", "invalidate()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.paging.DataSource.InvalidatedCallback
    public final void onInvalidated() {
        this.$tmp0.invalidate();
    }
}
