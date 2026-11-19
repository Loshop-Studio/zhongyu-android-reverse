package androidx.compose.foundation.lazy.staggeredgrid;

import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;
import p181hd.InterfaceC9546r;

@LazyStaggeredGridScopeMarker
/* loaded from: classes.dex */
public interface LazyStaggeredGridScope {
    static /* synthetic */ void item$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object obj, Object obj2, StaggeredGridItemSpan staggeredGridItemSpan, InterfaceC9545q interfaceC9545q, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            obj2 = null;
        }
        if ((i10 & 4) != 0) {
            staggeredGridItemSpan = null;
        }
        lazyStaggeredGridScope.item(obj, obj2, staggeredGridItemSpan, interfaceC9545q);
    }

    static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, int i10, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9546r interfaceC9546r, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i11 & 2) != 0) {
            interfaceC9540l = null;
        }
        if ((i11 & 4) != 0) {
            interfaceC9540l2 = new InterfaceC9540l() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope.items.1
                public final Void invoke(int i12) {
                    return null;
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        if ((i11 & 8) != 0) {
            interfaceC9540l3 = null;
        }
        lazyStaggeredGridScope.items(i10, interfaceC9540l, interfaceC9540l2, interfaceC9540l3, interfaceC9546r);
    }

    void item(Object obj, Object obj2, StaggeredGridItemSpan staggeredGridItemSpan, InterfaceC9545q interfaceC9545q);

    void items(int i10, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9546r interfaceC9546r);
}
