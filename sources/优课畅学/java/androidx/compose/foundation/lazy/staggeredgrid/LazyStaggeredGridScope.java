package androidx.compose.foundation.lazy.staggeredgrid;

import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10575q;
import p300x7.InterfaceC10576r;

@LazyStaggeredGridScopeMarker
/* loaded from: classes.dex */
public interface LazyStaggeredGridScope {
    static /* synthetic */ void item$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object obj, Object obj2, StaggeredGridItemSpan staggeredGridItemSpan, InterfaceC10575q interfaceC10575q, int i10, Object obj3) {
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
        lazyStaggeredGridScope.item(obj, obj2, staggeredGridItemSpan, interfaceC10575q);
    }

    static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, int i10, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, InterfaceC10570l interfaceC10570l3, InterfaceC10576r interfaceC10576r, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i11 & 2) != 0) {
            interfaceC10570l = null;
        }
        if ((i11 & 4) != 0) {
            interfaceC10570l2 = new InterfaceC10570l() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope.items.1
                public final Void invoke(int i12) {
                    return null;
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        if ((i11 & 8) != 0) {
            interfaceC10570l3 = null;
        }
        lazyStaggeredGridScope.items(i10, interfaceC10570l, interfaceC10570l2, interfaceC10570l3, interfaceC10576r);
    }

    void item(Object obj, Object obj2, StaggeredGridItemSpan staggeredGridItemSpan, InterfaceC10575q interfaceC10575q);

    void items(int i10, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, InterfaceC10570l interfaceC10570l3, InterfaceC10576r interfaceC10576r);
}
