package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p300x7.InterfaceC10574p;

/* loaded from: classes.dex */
public /* synthetic */ class LazyStaggeredGridState$scrollPosition$1 extends FunctionReferenceImpl implements InterfaceC10574p {
    public LazyStaggeredGridState$scrollPosition$1(Object obj) {
        super(2, obj, LazyStaggeredGridState.class, "fillNearestIndices", "fillNearestIndices(II)[I", 0);
    }

    @Override // p300x7.InterfaceC10574p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), ((Number) obj2).intValue());
    }

    public final int[] invoke(int i10, int i11) {
        return ((LazyStaggeredGridState) this.receiver).fillNearestIndices(i10, i11);
    }
}
