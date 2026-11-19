package androidx.compose.foundation.lazy;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.taobao.sophix.PatchStatus;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9545q;
import p181hd.InterfaceC9546r;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;

@LazyScopeMarker
/* loaded from: classes.dex */
public interface LazyListScope {

    public static final class DefaultImpls {
        @Deprecated
        public static void item(LazyListScope lazyListScope, Object obj, Object obj2, InterfaceC9545q interfaceC9545q) {
            LazyListScope.super.item(obj, obj2, interfaceC9545q);
        }

        @Deprecated
        public static void items(LazyListScope lazyListScope, int i10, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9546r interfaceC9546r) {
            LazyListScope.super.items(i10, interfaceC9540l, interfaceC9540l2, interfaceC9546r);
        }

        @Deprecated
        public static void stickyHeader(LazyListScope lazyListScope, Object obj, Object obj2, InterfaceC9546r interfaceC9546r) {
            LazyListScope.super.stickyHeader(obj, obj2, interfaceC9546r);
        }
    }

    static /* synthetic */ void item$default(LazyListScope lazyListScope, Object obj, Object obj2, InterfaceC9545q interfaceC9545q, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            obj2 = null;
        }
        lazyListScope.item(obj, obj2, interfaceC9545q);
    }

    static /* synthetic */ void items$default(LazyListScope lazyListScope, int i10, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9546r interfaceC9546r, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i11 & 2) != 0) {
            interfaceC9540l = null;
        }
        if ((i11 & 4) != 0) {
            interfaceC9540l2 = new InterfaceC9540l() { // from class: androidx.compose.foundation.lazy.LazyListScope.items.1
                public final Void invoke(int i12) {
                    return null;
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        lazyListScope.items(i10, interfaceC9540l, interfaceC9540l2, interfaceC9546r);
    }

    static /* synthetic */ void stickyHeader$default(LazyListScope lazyListScope, Object obj, Object obj2, InterfaceC9545q interfaceC9545q, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            obj2 = null;
        }
        lazyListScope.stickyHeader(obj, obj2, interfaceC9545q);
    }

    default void item(Object obj, Object obj2, InterfaceC9545q interfaceC9545q) {
        throw new IllegalStateException("The method is not implemented");
    }

    default void items(int i10, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9546r interfaceC9546r) {
        throw new IllegalStateException("The method is not implemented");
    }

    @InterfaceC10770a
    /* synthetic */ default void stickyHeader(Object obj, Object obj2, final InterfaceC9545q interfaceC9545q) {
        stickyHeader(obj, obj2, (InterfaceC9546r) ComposableLambdaKt.composableLambdaInstance(-447767093, true, new InterfaceC9546r() { // from class: androidx.compose.foundation.lazy.LazyListScope.stickyHeader.1
            {
                super(4);
            }

            @Override // p181hd.InterfaceC9546r
            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                invoke((LazyItemScope) obj3, ((Number) obj4).intValue(), (Composer) obj5, ((Number) obj6).intValue());
                return C10786q.f26013a;
            }

            @Composable
            public final void invoke(LazyItemScope lazyItemScope, int i10, Composer composer, int i11) {
                if ((i11 & 6) == 0) {
                    i11 |= composer.changed(lazyItemScope) ? 4 : 2;
                }
                if (!composer.shouldExecute((i11 & PatchStatus.CODE_LOAD_LIB_UNDEFINED) != 130, i11 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-447767093, i11, -1, "androidx.compose.foundation.lazy.LazyListScope.stickyHeader.<anonymous> (LazyDsl.kt:122)");
                }
                interfaceC9545q.invoke(lazyItemScope, composer, Integer.valueOf(i11 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    static /* synthetic */ void item$default(LazyListScope lazyListScope, Object obj, InterfaceC9545q interfaceC9545q, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        lazyListScope.item(obj, interfaceC9545q);
    }

    static /* synthetic */ void stickyHeader$default(LazyListScope lazyListScope, Object obj, Object obj2, InterfaceC9546r interfaceC9546r, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            obj2 = null;
        }
        lazyListScope.stickyHeader(obj, obj2, interfaceC9546r);
    }

    @InterfaceC10770a
    /* synthetic */ default void item(Object obj, InterfaceC9545q interfaceC9545q) {
        item(obj, null, interfaceC9545q);
    }

    @InterfaceC10770a
    /* synthetic */ default void items(int i10, InterfaceC9540l interfaceC9540l, InterfaceC9546r interfaceC9546r) {
        items(i10, interfaceC9540l, new InterfaceC9540l() { // from class: androidx.compose.foundation.lazy.LazyListScope.items.2
            public final Object invoke(int i11) {
                return null;
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, interfaceC9546r);
    }

    default void stickyHeader(Object obj, Object obj2, final InterfaceC9546r interfaceC9546r) {
        item(obj, obj2, ComposableLambdaKt.composableLambdaInstance(628101784, true, new InterfaceC9545q() { // from class: androidx.compose.foundation.lazy.LazyListScope.stickyHeader.2
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                invoke((LazyItemScope) obj3, (Composer) obj4, ((Number) obj5).intValue());
                return C10786q.f26013a;
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
                interfaceC9546r.invoke(lazyItemScope, 0, composer, Integer.valueOf((i10 & 14) | 48));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    static /* synthetic */ void items$default(LazyListScope lazyListScope, int i10, InterfaceC9540l interfaceC9540l, InterfaceC9546r interfaceC9546r, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i11 & 2) != 0) {
            interfaceC9540l = null;
        }
        lazyListScope.items(i10, interfaceC9540l, interfaceC9546r);
    }
}
