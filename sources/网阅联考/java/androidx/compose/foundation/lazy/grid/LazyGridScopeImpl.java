package androidx.compose.foundation.lazy.grid;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J]\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0019\u0010\u0018\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0019¢\u0006\u0002\b\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u001c\u0010\u001b\u001a\u0018\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00150\u0019¢\u0006\u0002\b\u001d¢\u0006\u0002\b\bH\u0016ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ¶\u0001\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00062#\u0010\u0016\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00192\u001f\u0010\u0018\u001a\u001b\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004¢\u0006\u0002\b\b2#\u0010\u001a\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u001921\u0010$\u001a-\u0012\u0004\u0012\u00020\u001c\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00150\u0004¢\u0006\u0002\b\u001d¢\u0006\u0002\b\bH\u0016ø\u0001\u0000¢\u0006\u0002\u0010%R(\u0010\u0003\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0002\b\bX\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, m5175d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridScopeImpl;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "()V", "DefaultSpan", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "Lkotlin/ExtensionFunctionType;", "hasCustomSpans", "", "getHasCustomSpans$foundation_release", "()Z", "setHasCustomSpans$foundation_release", "(Z)V", "intervals", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "getIntervals$foundation_release", "()Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "item", "", "key", "", "span", "Lkotlin/Function1;", "contentType", "content", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "items", "count", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "index", "itemContent", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "foundation_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyGridScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridScopeImpl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridScopeImpl implements LazyGridScope {
    private boolean hasCustomSpans;
    private final MutableIntervalList<LazyGridIntervalContent> intervals = new MutableIntervalList<>();
    private final Function2<LazyGridItemSpanScope, Integer, GridItemSpan> DefaultSpan = new Function2<LazyGridItemSpanScope, Integer, GridItemSpan>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScopeImpl$DefaultSpan$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
            return GridItemSpan.m7440boximpl(m7483invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
        }

        /* renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m7483invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i4) {
            Intrinsics.checkNotNullParameter(lazyGridItemSpanScope, "$this$null");
            return LazyGridSpanKt.GridItemSpan(1);
        }
    };

    /* renamed from: getHasCustomSpans$foundation_release, reason: from getter */
    public final boolean getHasCustomSpans() {
        return this.hasCustomSpans;
    }

    public final MutableIntervalList<LazyGridIntervalContent> getIntervals$foundation_release() {
        return this.intervals;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public void item(final Object key, final Function1<? super LazyGridItemSpanScope, GridItemSpan> span, final Object contentType, final Function3<? super LazyGridItemScope, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.intervals.addInterval(1, new LazyGridIntervalContent(key != null ? new Function1<Integer, Object>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScopeImpl$item$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Object invoke(int i4) {
                return key;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }
        } : null, span != null ? new Function2<LazyGridItemSpanScope, Integer, GridItemSpan>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScopeImpl$item$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
                return GridItemSpan.m7440boximpl(m7484invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
            }

            /* renamed from: invoke-_-orMbw, reason: not valid java name */
            public final long m7484invoke_orMbw(LazyGridItemSpanScope lazyGridItemSpanScope, int i4) {
                Intrinsics.checkNotNullParameter(lazyGridItemSpanScope, "$this$null");
                return span.invoke(lazyGridItemSpanScope).getPackedValue();
            }
        } : this.DefaultSpan, new Function1<Integer, Object>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScopeImpl.item.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i4) {
                return contentType;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1504808184, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScopeImpl.item.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(LazyGridItemScope $receiver, int i4, Composer composer, int i5) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                if ((i5 & 14) == 0) {
                    i5 |= composer.changed($receiver) ? 4 : 2;
                }
                if ((i5 & 651) == 130 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1504808184, i5, -1, "androidx.compose.foundation.lazy.grid.LazyGridScopeImpl.item.<anonymous> (LazyGridScopeImpl.kt:42)");
                }
                content.invoke($receiver, composer, Integer.valueOf(i5 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        })));
        if (span != null) {
            this.hasCustomSpans = true;
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public void items(int count, Function1<? super Integer, ? extends Object> key, Function2<? super LazyGridItemSpanScope, ? super Integer, GridItemSpan> span, Function1<? super Integer, ? extends Object> contentType, Function4<? super LazyGridItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        this.intervals.addInterval(count, new LazyGridIntervalContent(key, span == null ? this.DefaultSpan : span, contentType, itemContent));
        if (span != null) {
            this.hasCustomSpans = true;
        }
    }

    public final void setHasCustomSpans$foundation_release(boolean z3) {
        this.hasCustomSpans = z3;
    }
}
