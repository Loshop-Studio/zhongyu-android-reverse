package androidx.compose.foundation.lazy;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10575q;
import p300x7.InterfaceC10576r;

@LazyScopeMarker
/* loaded from: classes.dex */
public interface LazyListScope {

    public static final class DefaultImpls {
        @Deprecated
        public static void item(LazyListScope lazyListScope, Object obj, Object obj2, InterfaceC10575q interfaceC10575q) {
            LazyListScope.super.item(obj, obj2, interfaceC10575q);
        }

        @Deprecated
        public static void items(LazyListScope lazyListScope, int i10, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, InterfaceC10576r interfaceC10576r) {
            LazyListScope.super.items(i10, interfaceC10570l, interfaceC10570l2, interfaceC10576r);
        }

        @Deprecated
        public static void stickyHeader(LazyListScope lazyListScope, Object obj, Object obj2, InterfaceC10576r interfaceC10576r) {
            LazyListScope.super.stickyHeader(obj, obj2, interfaceC10576r);
        }
    }

    static /* synthetic */ void item$default(LazyListScope lazyListScope, Object obj, Object obj2, InterfaceC10575q interfaceC10575q, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            obj2 = null;
        }
        lazyListScope.item(obj, obj2, interfaceC10575q);
    }

    static /* synthetic */ void items$default(LazyListScope lazyListScope, int i10, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, InterfaceC10576r interfaceC10576r, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i11 & 2) != 0) {
            interfaceC10570l = null;
        }
        if ((i11 & 4) != 0) {
            interfaceC10570l2 = new InterfaceC10570l() { // from class: androidx.compose.foundation.lazy.LazyListScope.items.1
                public final Void invoke(int i12) {
                    return null;
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        lazyListScope.items(i10, interfaceC10570l, interfaceC10570l2, interfaceC10576r);
    }

    static /* synthetic */ void stickyHeader$default(LazyListScope lazyListScope, Object obj, Object obj2, InterfaceC10575q interfaceC10575q, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            obj2 = null;
        }
        lazyListScope.stickyHeader(obj, obj2, interfaceC10575q);
    }

    default void item(Object obj, Object obj2, InterfaceC10575q interfaceC10575q) {
        throw new IllegalStateException("The method is not implemented");
    }

    default void items(int i10, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, InterfaceC10576r interfaceC10576r) {
        throw new IllegalStateException("The method is not implemented");
    }

    @InterfaceC8721a
    /* synthetic */ default void stickyHeader(Object obj, Object obj2, final InterfaceC10575q interfaceC10575q) {
        stickyHeader(obj, obj2, (InterfaceC10576r) ComposableLambdaKt.composableLambdaInstance(-447767093, true, new InterfaceC10576r() { // from class: androidx.compose.foundation.lazy.LazyListScope.stickyHeader.1
            {
                super(4);
            }

            @Override // p300x7.InterfaceC10576r
            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                invoke((LazyItemScope) obj3, ((Number) obj4).intValue(), (Composer) obj5, ((Number) obj6).intValue());
                return C8736p.f16368a;
            }

            @Composable
            public final void invoke(LazyItemScope lazyItemScope, int i10, Composer composer, int i11) {
                if ((i11 & 6) == 0) {
                    i11 |= composer.changed(lazyItemScope) ? 4 : 2;
                }
                if (!composer.shouldExecute((i11 & 131) != 130, i11 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-447767093, i11, -1, "androidx.compose.foundation.lazy.LazyListScope.stickyHeader.<anonymous> (LazyDsl.kt:122)");
                }
                interfaceC10575q.invoke(lazyItemScope, composer, Integer.valueOf(i11 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    static /* synthetic */ void item$default(LazyListScope lazyListScope, Object obj, InterfaceC10575q interfaceC10575q, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        lazyListScope.item(obj, interfaceC10575q);
    }

    static /* synthetic */ void stickyHeader$default(LazyListScope lazyListScope, Object obj, Object obj2, InterfaceC10576r interfaceC10576r, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            obj2 = null;
        }
        lazyListScope.stickyHeader(obj, obj2, interfaceC10576r);
    }

    @InterfaceC8721a
    /* synthetic */ default void item(Object obj, InterfaceC10575q interfaceC10575q) {
        item(obj, null, interfaceC10575q);
    }

    @InterfaceC8721a
    /* synthetic */ default void items(int i10, InterfaceC10570l interfaceC10570l, InterfaceC10576r interfaceC10576r) {
        items(i10, interfaceC10570l, new InterfaceC10570l() { // from class: androidx.compose.foundation.lazy.LazyListScope.items.2
            public final Object invoke(int i11) {
                return null;
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, interfaceC10576r);
    }

    default void stickyHeader(Object obj, Object obj2, final InterfaceC10576r interfaceC10576r) {
        item(obj, obj2, ComposableLambdaKt.composableLambdaInstance(628101784, true, new InterfaceC10575q() { // from class: androidx.compose.foundation.lazy.LazyListScope.stickyHeader.2
            {
                super(3);
            }

            @Override // p300x7.InterfaceC10575q
            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                invoke((LazyItemScope) obj3, (Composer) obj4, ((Number) obj5).intValue());
                return C8736p.f16368a;
            }

            @Composable
            public final void invoke(LazyItemScope lazyItemScope, Composer composer, int i10) {
                if ((i10 & 6) == 0) {
                    i10 |= composer.changed(lazyItemScope) ? 4 : 2;
                }
                if (!composer.shouldExecute((i10 & 19) != 18, i10 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(628101784, i10, -1, "androidx.compose.foundation.lazy.LazyListScope.stickyHeader.<anonymous> (LazyDsl.kt:148)");
                }
                interfaceC10576r.invoke(lazyItemScope, 0, composer, Integer.valueOf((i10 & 14) | 48));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    static /* synthetic */ void items$default(LazyListScope lazyListScope, int i10, InterfaceC10570l interfaceC10570l, InterfaceC10576r interfaceC10576r, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i11 & 2) != 0) {
            interfaceC10570l = null;
        }
        lazyListScope.items(i10, interfaceC10570l, interfaceC10576r);
    }
}
