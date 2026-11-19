package androidx.compose.foundation.lazy.grid;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;
import p152r6.InterfaceC6475g;

@LazyGridScopeMarker
@Metadata(m5109d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001Jb\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u001b\b\u0002\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\b\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0002\b\u000b¢\u0006\u0002\b\u0006H&¢\u0006\u0004\b\r\u0010\u000eJÊ\u0001\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2%\b\u0002\u0010\u0002\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000320\b\u0002\u0010\u0007\u001a*\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0014¢\u0006\u0002\b\u00062%\b\u0002\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000321\u0010\u0015\u001a-\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\n0\u0014¢\u0006\u0002\b\u000b¢\u0006\u0002\b\u0006H&¢\u0006\u0004\b\u0016\u0010\u0017JK\u0010\u0018\u001a\u00020\n2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\"\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u0014¢\u0006\u0002\b\u000b¢\u0006\u0002\b\u0006H&¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0001\u0001\u001aø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, m5110d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "", "key", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "Lkotlin/ExtensionFunctionType;", "span", "contentType", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "content", "item", "(Ljava/lang/Object;Lr6/c;Ljava/lang/Object;Lr6/f;)V", "", "count", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "index", "Lkotlin/Function2;", "itemContent", "items", "(ILr6/c;Lr6/e;Lr6/c;Lr6/g;)V", "stickyHeader", "(Ljava/lang/Object;Ljava/lang/Object;Lr6/g;)V", "Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface LazyGridScope {
    static /* synthetic */ void item$default(LazyGridScope lazyGridScope, Object obj, InterfaceC6471c interfaceC6471c, Object obj2, InterfaceC6474f interfaceC6474f, int i, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            interfaceC6471c = null;
        }
        if ((i & 4) != 0) {
            obj2 = null;
        }
        lazyGridScope.item(obj, interfaceC6471c, obj2, interfaceC6474f);
    }

    static /* synthetic */ void items$default(LazyGridScope lazyGridScope, int i, InterfaceC6471c interfaceC6471c, InterfaceC6473e interfaceC6473e, InterfaceC6471c interfaceC6471c2, InterfaceC6475g interfaceC6475g, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i8 & 2) != 0) {
            interfaceC6471c = null;
        }
        if ((i8 & 4) != 0) {
            interfaceC6473e = null;
        }
        if ((i8 & 8) != 0) {
            interfaceC6471c2 = new InterfaceC6471c() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScope.items.1
                public final Void invoke(int i9) {
                    return null;
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        lazyGridScope.items(i, interfaceC6471c, interfaceC6473e, interfaceC6471c2, interfaceC6475g);
    }

    static /* synthetic */ void stickyHeader$default(LazyGridScope lazyGridScope, Object obj, Object obj2, InterfaceC6475g interfaceC6475g, int i, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        lazyGridScope.stickyHeader(obj, obj2, interfaceC6475g);
    }

    void item(@Nullable Object key, @Nullable InterfaceC6471c span, @Nullable Object contentType, @NotNull InterfaceC6474f content);

    void items(int count, @Nullable InterfaceC6471c key, @Nullable InterfaceC6473e span, @NotNull InterfaceC6471c contentType, @NotNull InterfaceC6475g itemContent);

    void stickyHeader(@Nullable Object key, @Nullable Object contentType, @NotNull InterfaceC6475g content);
}
