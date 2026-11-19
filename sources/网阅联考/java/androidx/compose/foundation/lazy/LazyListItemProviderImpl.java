package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@ExperimentalFoundationApi
@Metadata(m5174d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B9\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\nH\u0097\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001e\u001a\u00020\nH\u0096\u0001J\u0011\u0010!\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\nH\u0096\u0001R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\nX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\n0\u00188VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\""}, m5175d2 = {"Landroidx/compose/foundation/lazy/LazyListItemProviderImpl;", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "intervals", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "Landroidx/compose/foundation/lazy/LazyListIntervalContent;", "nearestItemsRange", "Lkotlin/ranges/IntRange;", "headerIndexes", "", "", "itemScope", "Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "(Landroidx/compose/foundation/lazy/layout/IntervalList;Lkotlin/ranges/IntRange;Ljava/util/List;Landroidx/compose/foundation/lazy/LazyItemScopeImpl;Landroidx/compose/foundation/lazy/LazyListState;)V", "getHeaderIndexes", "()Ljava/util/List;", "itemCount", "getItemCount", "()I", "getItemScope", "()Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", "keyToIndexMap", "", "", "getKeyToIndexMap", "()Ljava/util/Map;", "Item", "", "index", "(ILandroidx/compose/runtime/Composer;I)V", "getContentType", "getKey", "foundation_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class LazyListItemProviderImpl implements LazyListItemProvider, LazyLayoutItemProvider {
    private final /* synthetic */ LazyLayoutItemProvider $$delegate_0;
    private final List<Integer> headerIndexes;
    private final LazyItemScopeImpl itemScope;

    public LazyListItemProviderImpl(IntervalList<LazyListIntervalContent> intervals, IntRange nearestItemsRange, List<Integer> headerIndexes, final LazyItemScopeImpl itemScope, final LazyListState state) {
        Intrinsics.checkNotNullParameter(intervals, "intervals");
        Intrinsics.checkNotNullParameter(nearestItemsRange, "nearestItemsRange");
        Intrinsics.checkNotNullParameter(headerIndexes, "headerIndexes");
        Intrinsics.checkNotNullParameter(itemScope, "itemScope");
        Intrinsics.checkNotNullParameter(state, "state");
        this.headerIndexes = headerIndexes;
        this.itemScope = itemScope;
        this.$$delegate_0 = LazyLayoutItemProviderKt.LazyLayoutItemProvider(intervals, nearestItemsRange, ComposableLambdaKt.composableLambdaInstance(2070454083, true, new Function4<IntervalList.Interval<? extends LazyListIntervalContent>, Integer, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderImpl.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(IntervalList.Interval<? extends LazyListIntervalContent> interval, Integer num, Composer composer, Integer num2) {
                invoke((IntervalList.Interval<LazyListIntervalContent>) interval, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(final IntervalList.Interval<LazyListIntervalContent> interval, int i4, Composer composer, int i5) {
                int i6;
                Intrinsics.checkNotNullParameter(interval, "interval");
                if ((i5 & 14) == 0) {
                    i6 = (composer.changed(interval) ? 4 : 2) | i5;
                } else {
                    i6 = i5;
                }
                if ((i5 & UMErrorCode.E_UM_BE_DEFLATE_FAILED) == 0) {
                    i6 |= composer.changed(i4) ? 32 : 16;
                }
                if ((i6 & 731) == 146 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2070454083, i6, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.$$delegate_0.<anonymous> (LazyListItemProvider.kt:81)");
                }
                final int startIndex = i4 - interval.getStartIndex();
                Function1<Integer, Object> key = interval.getValue().getKey();
                Object objInvoke = key != null ? key.invoke(Integer.valueOf(startIndex)) : null;
                LazyLayoutPinnedItemList pinnedItems = state.getPinnedItems();
                final LazyItemScopeImpl lazyItemScopeImpl = itemScope;
                LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(objInvoke, i4, pinnedItems, ComposableLambdaKt.composableLambda(composer, 1210565839, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderImpl.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1210565839, i7, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.$$delegate_0.<anonymous>.<anonymous> (LazyListItemProvider.kt:87)");
                        }
                        interval.getValue().getItem().invoke(lazyItemScopeImpl, Integer.valueOf(startIndex), composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer, (i6 & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | 3592);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Composable
    public void Item(final int i4, Composer composer, final int i5) {
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1645068522);
        if ((i5 & 14) == 0) {
            i6 = (composerStartRestartGroup.changed(i4) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & UMErrorCode.E_UM_BE_DEFLATE_FAILED) == 0) {
            i6 |= composerStartRestartGroup.changed(this) ? 32 : 16;
        }
        if ((i6 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1645068522, i6, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:-1)");
            }
            this.$$delegate_0.Item(i4, composerStartRestartGroup, i6 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i7) {
                LazyListItemProviderImpl.this.Item(i4, composer2, RecomposeScopeImplKt.updateChangedFlags(i5 | 1));
            }
        });
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Object getContentType(int index) {
        return this.$$delegate_0.getContentType(index);
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    public List<Integer> getHeaderIndexes() {
        return this.headerIndexes;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getItemCount() {
        return this.$$delegate_0.getItemCount();
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    public LazyItemScopeImpl getItemScope() {
        return this.itemScope;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Object getKey(int index) {
        return this.$$delegate_0.getKey(index);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Map<Object, Integer> getKeyToIndexMap() {
        return this.$$delegate_0.getKeyToIndexMap();
    }
}
