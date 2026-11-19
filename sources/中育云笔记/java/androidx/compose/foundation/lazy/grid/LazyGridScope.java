package androidx.compose.foundation.lazy.grid;

import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p181hd.InterfaceC9546r;

@LazyGridScopeMarker
/* loaded from: classes.dex */
public interface LazyGridScope {
    static /* synthetic */ void item$default(LazyGridScope lazyGridScope, Object obj, InterfaceC9540l interfaceC9540l, Object obj2, InterfaceC9545q interfaceC9545q, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            interfaceC9540l = null;
        }
        if ((i10 & 4) != 0) {
            obj2 = null;
        }
        lazyGridScope.item(obj, interfaceC9540l, obj2, interfaceC9545q);
    }

    static /* synthetic */ void items$default(LazyGridScope lazyGridScope, int i10, InterfaceC9540l interfaceC9540l, InterfaceC9544p interfaceC9544p, InterfaceC9540l interfaceC9540l2, InterfaceC9546r interfaceC9546r, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i11 & 2) != 0) {
            interfaceC9540l = null;
        }
        if ((i11 & 4) != 0) {
            interfaceC9544p = null;
        }
        if ((i11 & 8) != 0) {
            interfaceC9540l2 = new InterfaceC9540l() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScope.items.1
                public final Void invoke(int i12) {
                    return null;
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        lazyGridScope.items(i10, interfaceC9540l, interfaceC9544p, interfaceC9540l2, interfaceC9546r);
    }

    static /* synthetic */ void stickyHeader$default(LazyGridScope lazyGridScope, Object obj, Object obj2, InterfaceC9546r interfaceC9546r, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            obj2 = null;
        }
        lazyGridScope.stickyHeader(obj, obj2, interfaceC9546r);
    }

    void item(Object obj, InterfaceC9540l interfaceC9540l, Object obj2, InterfaceC9545q interfaceC9545q);

    void items(int i10, InterfaceC9540l interfaceC9540l, InterfaceC9544p interfaceC9544p, InterfaceC9540l interfaceC9540l2, InterfaceC9546r interfaceC9546r);

    void stickyHeader(Object obj, Object obj2, InterfaceC9546r interfaceC9546r);
}
