package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.foundation.lazy.layout.LazyNearestItemsRangeKt;
import androidx.compose.foundation.lazy.staggeredgrid.C0760x6d2c3253;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

@Metadata(m5174d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, m5175d2 = {"rememberStaggeredGridItemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "foundation_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridItemProvider.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProviderKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,73:1\n36#2:74\n1114#3,6:75\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridItemProvider.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProviderKt\n*L\n46#1:74\n46#1:75,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridItemProviderKt {
    @Composable
    @ExperimentalFoundationApi
    public static final LazyStaggeredGridItemProvider rememberStaggeredGridItemProvider(final LazyStaggeredGridState state, Function1<? super LazyStaggeredGridScope, Unit> content, Composer composer, int i4) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(2039920307);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2039920307, i4, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProvider (LazyStaggeredGridItemProvider.kt:35)");
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, composer, (i4 >> 3) & 14);
        final State<IntRange> stateRememberLazyNearestItemsRangeState = LazyNearestItemsRangeKt.rememberLazyNearestItemsRangeState(new Function0<Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$nearestItemsRangeState$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return Integer.valueOf(state.getFirstVisibleItemIndex());
            }
        }, new Function0<Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$nearestItemsRangeState$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return 90;
            }
        }, new Function0<Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$nearestItemsRangeState$3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return 200;
            }
        }, composer, 432);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(state);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new C0759x329c90aa(SnapshotStateKt.derivedStateOf(new Function0<C0760x6d2c3253.AnonymousClass1>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$1$itemProviderState$1

                @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt$rememberStaggeredGridItemProvider$1$itemProviderState$1$1, reason: invalid class name */
                public static final class AnonymousClass1 implements LazyLayoutItemProvider, LazyStaggeredGridItemProvider {
                    private final /* synthetic */ LazyLayoutItemProvider $$delegate_0;
                    private final LazyStaggeredGridSpanProvider spanProvider;

                    public AnonymousClass1(LazyStaggeredGridScopeImpl lazyStaggeredGridScopeImpl, State<IntRange> state, final LazyStaggeredGridState lazyStaggeredGridState) {
                        this.$$delegate_0 = LazyLayoutItemProviderKt.LazyLayoutItemProvider(lazyStaggeredGridScopeImpl.getIntervals(), state.getValue(), ComposableLambdaKt.composableLambdaInstance(-364721306, true, new Function4<IntervalList.Interval<? extends LazyStaggeredGridIntervalContent>, Integer, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProvider.1.itemProviderState.1.1.1
                            {
                                super(4);
                            }

                            @Override // kotlin.jvm.functions.Function4
                            public /* bridge */ /* synthetic */ Unit invoke(IntervalList.Interval<? extends LazyStaggeredGridIntervalContent> interval, Integer num, Composer composer, Integer num2) {
                                invoke((IntervalList.Interval<LazyStaggeredGridIntervalContent>) interval, num.intValue(), composer, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(final IntervalList.Interval<LazyStaggeredGridIntervalContent> interval, int i4, Composer composer, int i5) {
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
                                    ComposerKt.traceEventStart(-364721306, i6, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProvider.<anonymous>.<anonymous>.<no name provided>.$$delegate_0.<anonymous> (LazyStaggeredGridItemProvider.kt:51)");
                                }
                                final int startIndex = i4 - interval.getStartIndex();
                                Function1<Integer, Object> key = interval.getValue().getKey();
                                LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(key != null ? key.invoke(Integer.valueOf(startIndex)) : null, i4, lazyStaggeredGridState.getPinnedItems(), ComposableLambdaKt.composableLambda(composer, 1181040114, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProvider.1.itemProviderState.1.1.1.1
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
                                            ComposerKt.traceEventStart(1181040114, i7, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProvider.<anonymous>.<anonymous>.<no name provided>.$$delegate_0.<anonymous>.<anonymous> (LazyStaggeredGridItemProvider.kt:57)");
                                        }
                                        interval.getValue().getItem().invoke(LazyStaggeredGridItemScopeImpl.INSTANCE, Integer.valueOf(startIndex), composer2, 6);
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
                        this.spanProvider = new LazyStaggeredGridSpanProvider(lazyStaggeredGridScopeImpl.getIntervals());
                    }

                    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
                    @Composable
                    public void Item(int i4, Composer composer, int i5) {
                        composer.startReplaceableGroup(1163616889);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1163616889, i5, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProvider.<anonymous>.<anonymous>.<no name provided>.Item (LazyStaggeredGridItemProvider.kt:-1)");
                        }
                        this.$$delegate_0.Item(i4, composer, i5 & 14);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer.endReplaceableGroup();
                    }

                    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
                    public Object getContentType(int i4) {
                        return this.$$delegate_0.getContentType(i4);
                    }

                    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
                    public int getItemCount() {
                        return this.$$delegate_0.getItemCount();
                    }

                    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
                    public Object getKey(int i4) {
                        return this.$$delegate_0.getKey(i4);
                    }

                    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
                    public Map<Object, Integer> getKeyToIndexMap() {
                        return this.$$delegate_0.getKeyToIndexMap();
                    }

                    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider
                    public LazyStaggeredGridSpanProvider getSpanProvider() {
                        return this.spanProvider;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final AnonymousClass1 invoke() {
                    LazyStaggeredGridScopeImpl lazyStaggeredGridScopeImpl = new LazyStaggeredGridScopeImpl();
                    stateRememberUpdatedState.getValue().invoke(lazyStaggeredGridScopeImpl);
                    return new AnonymousClass1(lazyStaggeredGridScopeImpl, stateRememberLazyNearestItemsRangeState, state);
                }
            }));
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        C0759x329c90aa c0759x329c90aa = (C0759x329c90aa) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return c0759x329c90aa;
    }
}
