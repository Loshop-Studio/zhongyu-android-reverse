package androidx.compose.foundation.lazy;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6474f;
import p152r6.InterfaceC6475g;

@LazyScopeMarker
@Metadata(m5109d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001JE\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0002\b\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0002\b\bH\u0017¢\u0006\u0004\b\n\u0010\fJ\u0098\u0001\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2%\b\u0002\u0010\u0002\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042%\b\u0002\u0010\u0003\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000421\u0010\u0013\u001a-\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00060\u0012¢\u0006\u0002\b\u0007¢\u0006\u0002\b\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015Jq\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2%\b\u0002\u0010\u0002\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000421\u0010\u0013\u001a-\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00060\u0012¢\u0006\u0002\b\u0007¢\u0006\u0002\b\bH\u0017¢\u0006\u0004\b\u0014\u0010\u0016JE\u0010\u0017\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0002\b\bH\u0017¢\u0006\u0004\b\u0017\u0010\u000bJK\u0010\u0017\u001a\u00020\u00062\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\"\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u0012¢\u0006\u0002\b\u0007¢\u0006\u0002\b\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0003"}, m5110d2 = {"Landroidx/compose/foundation/lazy/LazyListScope;", "", "key", "contentType", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "item", "(Ljava/lang/Object;Ljava/lang/Object;Lr6/f;)V", "(Ljava/lang/Object;Lr6/f;)V", "", "count", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "index", "Lkotlin/Function2;", "itemContent", "items", "(ILr6/c;Lr6/c;Lr6/g;)V", "(ILr6/c;Lr6/g;)V", "stickyHeader", "(Ljava/lang/Object;Ljava/lang/Object;Lr6/g;)V", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface LazyListScope {

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        @Deprecated
        public static void item(@NotNull LazyListScope lazyListScope, @Nullable Object obj, @Nullable Object obj2, @NotNull InterfaceC6474f interfaceC6474f) {
            LazyListScope.super.item(obj, obj2, interfaceC6474f);
        }

        @Deprecated
        public static void items(@NotNull LazyListScope lazyListScope, int i, @Nullable InterfaceC6471c interfaceC6471c, @NotNull InterfaceC6471c interfaceC6471c2, @NotNull InterfaceC6475g interfaceC6475g) {
            LazyListScope.super.items(i, interfaceC6471c, interfaceC6471c2, interfaceC6475g);
        }

        @Deprecated
        public static void stickyHeader(@NotNull LazyListScope lazyListScope, @Nullable Object obj, @Nullable Object obj2, @NotNull InterfaceC6475g interfaceC6475g) {
            LazyListScope.super.stickyHeader(obj, obj2, interfaceC6475g);
        }
    }

    static /* synthetic */ void item$default(LazyListScope lazyListScope, Object obj, Object obj2, InterfaceC6474f interfaceC6474f, int i, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        lazyListScope.item(obj, obj2, interfaceC6474f);
    }

    static /* synthetic */ void items$default(LazyListScope lazyListScope, int i, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6475g interfaceC6475g, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i8 & 2) != 0) {
            interfaceC6471c = null;
        }
        if ((i8 & 4) != 0) {
            interfaceC6471c2 = new InterfaceC6471c() { // from class: androidx.compose.foundation.lazy.LazyListScope.items.1
                public final Void invoke(int i9) {
                    return null;
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        lazyListScope.items(i, interfaceC6471c, interfaceC6471c2, interfaceC6475g);
    }

    static /* synthetic */ void stickyHeader$default(LazyListScope lazyListScope, Object obj, Object obj2, InterfaceC6474f interfaceC6474f, int i, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        lazyListScope.stickyHeader(obj, obj2, interfaceC6474f);
    }

    default void item(@Nullable Object key, @Nullable Object contentType, @NotNull InterfaceC6474f content) {
        throw new IllegalStateException("The method is not implemented");
    }

    default void items(int count, @Nullable InterfaceC6471c key, @NotNull InterfaceC6471c contentType, @NotNull InterfaceC6475g itemContent) {
        throw new IllegalStateException("The method is not implemented");
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use the overload with indexing capabilities.", replaceWith = @ReplaceWith(expression = "stickyHeader(key, contentType, { _ -> content() })", imports = {}))
    /* synthetic */ default void stickyHeader(Object key, Object contentType, final InterfaceC6474f content) {
        stickyHeader(key, contentType, (InterfaceC6475g) ComposableLambdaKt.composableLambdaInstance(-447767093, true, new InterfaceC6475g() { // from class: androidx.compose.foundation.lazy.LazyListScope.stickyHeader.1
            {
                super(4);
            }

            @Override // p152r6.InterfaceC6475g
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                return C5443s.f8405a;
            }

            @Composable
            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i8) {
                if ((i8 & 6) == 0) {
                    i8 |= composer.changed(lazyItemScope) ? 4 : 2;
                }
                if (!composer.shouldExecute((i8 & 131) != 130, i8 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-447767093, i8, -1, "androidx.compose.foundation.lazy.LazyListScope.stickyHeader.<anonymous> (LazyDsl.kt:122)");
                }
                content.invoke(lazyItemScope, composer, Integer.valueOf(i8 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    static /* synthetic */ void item$default(LazyListScope lazyListScope, Object obj, InterfaceC6474f interfaceC6474f, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        lazyListScope.item(obj, interfaceC6474f);
    }

    static /* synthetic */ void stickyHeader$default(LazyListScope lazyListScope, Object obj, Object obj2, InterfaceC6475g interfaceC6475g, int i, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        lazyListScope.stickyHeader(obj, obj2, interfaceC6475g);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /* synthetic */ default void item(Object key, InterfaceC6474f content) {
        item(key, null, content);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /* synthetic */ default void items(int count, InterfaceC6471c key, InterfaceC6475g itemContent) {
        items(count, key, new InterfaceC6471c() { // from class: androidx.compose.foundation.lazy.LazyListScope.items.2
            public final Object invoke(int i) {
                return null;
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, itemContent);
    }

    default void stickyHeader(@Nullable Object key, @Nullable Object contentType, @NotNull final InterfaceC6475g content) {
        item(key, contentType, ComposableLambdaKt.composableLambdaInstance(628101784, true, new InterfaceC6474f() { // from class: androidx.compose.foundation.lazy.LazyListScope.stickyHeader.2
            {
                super(3);
            }

            @Override // p152r6.InterfaceC6474f
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((LazyItemScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return C5443s.f8405a;
            }

            @Composable
            public final void invoke(LazyItemScope lazyItemScope, Composer composer, int i) {
                if ((i & 6) == 0) {
                    i |= composer.changed(lazyItemScope) ? 4 : 2;
                }
                if (!composer.shouldExecute((i & 19) != 18, i & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(628101784, i, -1, "androidx.compose.foundation.lazy.LazyListScope.stickyHeader.<anonymous> (LazyDsl.kt:148)");
                }
                content.invoke(lazyItemScope, 0, composer, Integer.valueOf((i & 14) | 48));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    static /* synthetic */ void items$default(LazyListScope lazyListScope, int i, InterfaceC6471c interfaceC6471c, InterfaceC6475g interfaceC6475g, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i8 & 2) != 0) {
            interfaceC6471c = null;
        }
        lazyListScope.items(i, interfaceC6471c, interfaceC6475g);
    }
}
