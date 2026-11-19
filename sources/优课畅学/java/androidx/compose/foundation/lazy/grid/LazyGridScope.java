package androidx.compose.foundation.lazy.grid;

import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;
import p300x7.InterfaceC10576r;

@LazyGridScopeMarker
/* loaded from: classes.dex */
public interface LazyGridScope {
    static /* synthetic */ void item$default(LazyGridScope lazyGridScope, Object obj, InterfaceC10570l interfaceC10570l, Object obj2, InterfaceC10575q interfaceC10575q, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            interfaceC10570l = null;
        }
        if ((i10 & 4) != 0) {
            obj2 = null;
        }
        lazyGridScope.item(obj, interfaceC10570l, obj2, interfaceC10575q);
    }

    static /* synthetic */ void items$default(LazyGridScope lazyGridScope, int i10, InterfaceC10570l interfaceC10570l, InterfaceC10574p interfaceC10574p, InterfaceC10570l interfaceC10570l2, InterfaceC10576r interfaceC10576r, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i11 & 2) != 0) {
            interfaceC10570l = null;
        }
        if ((i11 & 4) != 0) {
            interfaceC10574p = null;
        }
        if ((i11 & 8) != 0) {
            interfaceC10570l2 = new InterfaceC10570l() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScope.items.1
                public final Void invoke(int i12) {
                    return null;
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        lazyGridScope.items(i10, interfaceC10570l, interfaceC10574p, interfaceC10570l2, interfaceC10576r);
    }

    static /* synthetic */ void stickyHeader$default(LazyGridScope lazyGridScope, Object obj, Object obj2, InterfaceC10576r interfaceC10576r, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            obj2 = null;
        }
        lazyGridScope.stickyHeader(obj, obj2, interfaceC10576r);
    }

    void item(Object obj, InterfaceC10570l interfaceC10570l, Object obj2, InterfaceC10575q interfaceC10575q);

    void items(int i10, InterfaceC10570l interfaceC10570l, InterfaceC10574p interfaceC10574p, InterfaceC10570l interfaceC10570l2, InterfaceC10576r interfaceC10576r);

    void stickyHeader(Object obj, Object obj2, InterfaceC10576r interfaceC10576r);
}
