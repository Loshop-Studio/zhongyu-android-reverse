package androidx.compose.foundation.lazy.layout;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.umeng.analytics.pro.C3335ai;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

@ExperimentalFoundationApi
@Metadata(m5174d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B^\u0012A\u0010\u0004\u001a=\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\u0002\b\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u0015\u0010 \u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0002\u0010!J*\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\n0\u001c2\u0006\u0010#\u001a\u00020\u00112\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0003J\u0012\u0010%\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\nH\u0016JT\u0010'\u001a\u0002H(\"\u0004\b\u0001\u0010(2\u0006\u0010\u000b\u001a\u00020\n26\u0010)\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(*\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(+\u0012\u0004\u0012\u0002H(0\u0005H\u0082\b¢\u0006\u0002\u0010,R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014RN\u0010\u0004\u001a=\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\u0002\b\r¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\n0\u001cX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006-"}, m5175d2 = {"Landroidx/compose/foundation/lazy/layout/DefaultLazyLayoutItemsProvider;", "IntervalContent", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemContentProvider", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, C3335ai.f1677aR, "", "index", "", "Landroidx/compose/runtime/Composable;", "intervals", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "nearestItemsRange", "Lkotlin/ranges/IntRange;", "(Lkotlin/jvm/functions/Function4;Landroidx/compose/foundation/lazy/layout/IntervalList;Lkotlin/ranges/IntRange;)V", "getIntervals", "()Landroidx/compose/foundation/lazy/layout/IntervalList;", "getItemContentProvider", "()Lkotlin/jvm/functions/Function4;", "Lkotlin/jvm/functions/Function4;", "itemCount", "getItemCount", "()I", "keyToIndexMap", "", "", "getKeyToIndexMap", "()Ljava/util/Map;", "Item", "(ILandroidx/compose/runtime/Composer;I)V", "generateKeyToIndexMap", "range", "list", "getContentType", "getKey", "withLocalIntervalIndex", ExifInterface.GPS_DIRECTION_TRUE, "block", "localIndex", "content", "(ILkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foundation_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyLayoutItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemProvider.kt\nandroidx/compose/foundation/lazy/layout/DefaultLazyLayoutItemsProvider\n*L\n1#1,231:1\n135#1,3:232\n135#1,3:235\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemProvider.kt\nandroidx/compose/foundation/lazy/layout/DefaultLazyLayoutItemsProvider\n*L\n122#1:232,3\n127#1:235,3\n*E\n"})
/* loaded from: classes.dex */
final class DefaultLazyLayoutItemsProvider<IntervalContent extends LazyLayoutIntervalContent> implements LazyLayoutItemProvider {
    private final IntervalList<IntervalContent> intervals;
    private final Function4<IntervalList.Interval<? extends IntervalContent>, Integer, Composer, Integer, Unit> itemContentProvider;
    private final Map<Object, Integer> keyToIndexMap;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultLazyLayoutItemsProvider(Function4<? super IntervalList.Interval<? extends IntervalContent>, ? super Integer, ? super Composer, ? super Integer, Unit> itemContentProvider, IntervalList<? extends IntervalContent> intervals, IntRange nearestItemsRange) {
        Intrinsics.checkNotNullParameter(itemContentProvider, "itemContentProvider");
        Intrinsics.checkNotNullParameter(intervals, "intervals");
        Intrinsics.checkNotNullParameter(nearestItemsRange, "nearestItemsRange");
        this.itemContentProvider = itemContentProvider;
        this.intervals = intervals;
        this.keyToIndexMap = generateKeyToIndexMap(nearestItemsRange, intervals);
    }

    @ExperimentalFoundationApi
    private final Map<Object, Integer> generateKeyToIndexMap(IntRange range, IntervalList<? extends LazyLayoutIntervalContent> list) {
        final int first = range.getFirst();
        if (!(first >= 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        final int iMin = Math.min(range.getLast(), list.getSize() - 1);
        if (iMin < first) {
            return MapsKt__MapsKt.emptyMap();
        }
        final HashMap map = new HashMap();
        list.forEach(first, iMin, new Function1<IntervalList.Interval<? extends LazyLayoutIntervalContent>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.DefaultLazyLayoutItemsProvider$generateKeyToIndexMap$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IntervalList.Interval<? extends LazyLayoutIntervalContent> interval) {
                invoke2(interval);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(IntervalList.Interval<? extends LazyLayoutIntervalContent> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.getValue().getKey() == null) {
                    return;
                }
                Function1<Integer, Object> key = it.getValue().getKey();
                if (key == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                int iMax = Math.max(first, it.getStartIndex());
                int iMin2 = Math.min(iMin, (it.getStartIndex() + it.getSize()) - 1);
                if (iMax > iMin2) {
                    return;
                }
                while (true) {
                    map.put(key.invoke(Integer.valueOf(iMax - it.getStartIndex())), Integer.valueOf(iMax));
                    if (iMax == iMin2) {
                        return;
                    } else {
                        iMax++;
                    }
                }
            }
        });
        return map;
    }

    private final <T> T withLocalIntervalIndex(int index, Function2<? super Integer, ? super IntervalContent, ? extends T> block) {
        IntervalList.Interval<IntervalContent> interval = this.intervals.get(index);
        return block.invoke(Integer.valueOf(index - interval.getStartIndex()), interval.getValue());
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    @Composable
    public void Item(final int i4, Composer composer, final int i5) {
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1877726744);
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
                ComposerKt.traceEventStart(-1877726744, i6, -1, "androidx.compose.foundation.lazy.layout.DefaultLazyLayoutItemsProvider.Item (LazyLayoutItemProvider.kt:116)");
            }
            this.itemContentProvider.invoke(this.intervals.get(i4), Integer.valueOf(i4), composerStartRestartGroup, Integer.valueOf((i6 << 3) & UMErrorCode.E_UM_BE_DEFLATE_FAILED));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>(this) { // from class: androidx.compose.foundation.lazy.layout.DefaultLazyLayoutItemsProvider.Item.1
            final /* synthetic */ DefaultLazyLayoutItemsProvider<IntervalContent> $tmp0_rcvr;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
                this.$tmp0_rcvr = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i7) {
                this.$tmp0_rcvr.Item(i4, composer2, RecomposeScopeImplKt.updateChangedFlags(i5 | 1));
            }
        });
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Object getContentType(int index) {
        IntervalList.Interval<IntervalContent> interval = this.intervals.get(index);
        return interval.getValue().getType().invoke(Integer.valueOf(index - interval.getStartIndex()));
    }

    public final IntervalList<IntervalContent> getIntervals() {
        return this.intervals;
    }

    public final Function4<IntervalList.Interval<? extends IntervalContent>, Integer, Composer, Integer, Unit> getItemContentProvider() {
        return this.itemContentProvider;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getItemCount() {
        return this.intervals.getSize();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Object getKey(int index) {
        Object objInvoke;
        IntervalList.Interval<IntervalContent> interval = this.intervals.get(index);
        int startIndex = index - interval.getStartIndex();
        Function1<Integer, Object> key = interval.getValue().getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(startIndex))) == null) ? Lazy_androidKt.getDefaultLazyLayoutKey(index) : objInvoke;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Map<Object, Integer> getKeyToIndexMap() {
        return this.keyToIndexMap;
    }
}
