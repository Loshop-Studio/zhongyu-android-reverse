package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m5110d2 = {"LazyLayoutScrollScope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;", "state", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "scrollScope", "Landroidx/compose/foundation/gestures/ScrollScope;", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class LazyGridScrollScopeKt {

    @Metadata(m5109d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012¨\u0006\u001a"}, m5110d2 = {"androidx/compose/foundation/lazy/grid/LazyGridScrollScopeKt$LazyLayoutScrollScope$1", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;", "Landroidx/compose/foundation/gestures/ScrollScope;", "", "pixels", "scrollBy", "(F)F", "", "index", TypedValues.CycleType.S_WAVE_OFFSET, "Ld6/s;", "snapToItem", "(II)V", "targetIndex", "targetOffset", "calculateDistanceTo", "(II)I", "getFirstVisibleItemIndex", "()I", "firstVisibleItemIndex", "getFirstVisibleItemScrollOffset", "firstVisibleItemScrollOffset", "getLastVisibleItemIndex", "lastVisibleItemIndex", "getItemCount", "itemCount", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nLazyGridScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridScrollScope.kt\nandroidx/compose/foundation/lazy/grid/LazyGridScrollScopeKt$LazyLayoutScrollScope$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,75:1\n117#2,2:76\n34#2,6:78\n119#2:84\n*S KotlinDebug\n*F\n+ 1 LazyGridScrollScope.kt\nandroidx/compose/foundation/lazy/grid/LazyGridScrollScopeKt$LazyLayoutScrollScope$1\n*L\n65#1:76,2\n65#1:78,6\n65#1:84\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridScrollScopeKt$LazyLayoutScrollScope$1 */
    public static final class C11101 implements LazyLayoutScrollScope, ScrollScope {
        private final /* synthetic */ ScrollScope $$delegate_0;
        final /* synthetic */ LazyGridState $state;

        public C11101(ScrollScope scrollScope, LazyGridState lazyGridState) {
            this.$state = lazyGridState;
            this.$$delegate_0 = scrollScope;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int calculateDistanceTo(int targetIndex, int targetOffset) {
            Integer numValueOf;
            LazyGridItemInfo lazyGridItemInfo;
            LazyGridLayoutInfo layoutInfo = this.$state.getLayoutInfo();
            if (layoutInfo.getVisibleItemsInfo().isEmpty()) {
                return 0;
            }
            int firstVisibleItemIndex = getFirstVisibleItemIndex();
            if (targetIndex > getLastVisibleItemIndex() || firstVisibleItemIndex > targetIndex) {
                int slotsPerLine$foundation_release = this.$state.getSlotsPerLine$foundation_release();
                firstVisibleItemIndex = (((((slotsPerLine$foundation_release - 1) * ((targetIndex < getFirstVisibleItemIndex() ? 1 : 0) != 0 ? -1 : 1)) + (targetIndex - getFirstVisibleItemIndex())) / slotsPerLine$foundation_release) * LazyGridLayoutInfoKt.visibleLinesAverageMainAxisSize(layoutInfo)) - getFirstVisibleItemScrollOffset();
            } else {
                List<LazyGridItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
                int size = visibleItemsInfo.size();
                int i = 0;
                while (true) {
                    numValueOf = null;
                    if (i >= size) {
                        lazyGridItemInfo = null;
                        break;
                    }
                    lazyGridItemInfo = visibleItemsInfo.get(i);
                    if (lazyGridItemInfo.getIndex() == targetIndex) {
                        break;
                    }
                    i++;
                }
                LazyGridItemInfo lazyGridItemInfo2 = lazyGridItemInfo;
                if (layoutInfo.getOrientation() == Orientation.Vertical) {
                    if (lazyGridItemInfo2 != null) {
                        numValueOf = Integer.valueOf(IntOffset.m13434getYimpl(lazyGridItemInfo2.getOffset()));
                    }
                } else if (lazyGridItemInfo2 != null) {
                    numValueOf = Integer.valueOf(IntOffset.m13433getXimpl(lazyGridItemInfo2.getOffset()));
                }
                if (numValueOf != null) {
                    firstVisibleItemIndex = numValueOf.intValue();
                }
            }
            return firstVisibleItemIndex + targetOffset;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int getFirstVisibleItemIndex() {
            return this.$state.getFirstVisibleItemIndex();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int getFirstVisibleItemScrollOffset() {
            return this.$state.getFirstVisibleItemScrollOffset();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int getItemCount() {
            return this.$state.getLayoutInfo().getTotalItemsCount();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int getLastVisibleItemIndex() {
            LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) AbstractC5805t.m5236p0(this.$state.getLayoutInfo().getVisibleItemsInfo());
            if (lazyGridItemInfo != null) {
                return lazyGridItemInfo.getIndex();
            }
            return 0;
        }

        @Override // androidx.compose.foundation.gestures.ScrollScope
        public float scrollBy(float pixels) {
            return this.$$delegate_0.scrollBy(pixels);
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public void snapToItem(int index, int offset) {
            this.$state.snapToItemIndexInternal$foundation_release(index, offset, true);
        }
    }

    @NotNull
    public static final LazyLayoutScrollScope LazyLayoutScrollScope(@NotNull LazyGridState lazyGridState, @NotNull ScrollScope scrollScope) {
        return new C11101(scrollScope, lazyGridState);
    }
}
