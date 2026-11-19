package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m13558d2 = {"LazyLayoutScrollScope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "scrollScope", "Landroidx/compose/foundation/gestures/ScrollScope;", "foundation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
public final class LazyListScrollScopeKt {

    @Metadata(m13557d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0011\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0096\u0001J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006¨\u0006\u0017"}, m13558d2 = {"androidx/compose/foundation/lazy/LazyListScrollScopeKt$LazyLayoutScrollScope$1", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;", "Landroidx/compose/foundation/gestures/ScrollScope;", "firstVisibleItemIndex", "", "getFirstVisibleItemIndex", "()I", "firstVisibleItemScrollOffset", "getFirstVisibleItemScrollOffset", "itemCount", "getItemCount", "lastVisibleItemIndex", "getLastVisibleItemIndex", "calculateDistanceTo", "targetIndex", "targetOffset", "scrollBy", "", "pixels", "snapToItem", "", "index", TypedValues.CycleType.S_WAVE_OFFSET, "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    @SourceDebugExtension({"SMAP\nLazyListScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListScrollScope.kt\nandroidx/compose/foundation/lazy/LazyListScrollScopeKt$LazyLayoutScrollScope$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,67:1\n117#2,2:68\n34#2,6:70\n119#2:76\n*S KotlinDebug\n*F\n+ 1 LazyListScrollScope.kt\nandroidx/compose/foundation/lazy/LazyListScrollScopeKt$LazyLayoutScrollScope$1\n*L\n61#1:68,2\n61#1:70,6\n61#1:76\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.LazyListScrollScopeKt$LazyLayoutScrollScope$1 */
    public static final class C14691 implements LazyLayoutScrollScope, ScrollScope {
        private final /* synthetic */ ScrollScope $$delegate_0;
        final /* synthetic */ LazyListState $state;

        public C14691(ScrollScope scrollScope, LazyListState lazyListState) {
            this.$state = lazyListState;
            this.$$delegate_0 = scrollScope;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int calculateDistanceTo(int targetIndex, int targetOffset) {
            LazyListItemInfo lazyListItemInfo;
            LazyListLayoutInfo layoutInfo = this.$state.getLayoutInfo();
            int iVisibleItemsAverageSize = 0;
            if (layoutInfo.getVisibleItemsInfo().isEmpty()) {
                return 0;
            }
            int firstVisibleItemIndex = getFirstVisibleItemIndex();
            if (targetIndex > getLastVisibleItemIndex() || firstVisibleItemIndex > targetIndex) {
                iVisibleItemsAverageSize = (LazyListLayoutInfoKt.visibleItemsAverageSize(layoutInfo) * (targetIndex - getFirstVisibleItemIndex())) - getFirstVisibleItemScrollOffset();
            } else {
                List<LazyListItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
                int size = visibleItemsInfo.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        lazyListItemInfo = null;
                        break;
                    }
                    lazyListItemInfo = visibleItemsInfo.get(i10);
                    if (lazyListItemInfo.getIndex() == targetIndex) {
                        break;
                    }
                    i10++;
                }
                LazyListItemInfo lazyListItemInfo2 = lazyListItemInfo;
                if (lazyListItemInfo2 != null) {
                    iVisibleItemsAverageSize = lazyListItemInfo2.getOffset();
                }
            }
            return iVisibleItemsAverageSize + targetOffset;
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
            LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.lastOrNull((List) this.$state.getLayoutInfo().getVisibleItemsInfo());
            if (lazyListItemInfo != null) {
                return lazyListItemInfo.getIndex();
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

    public static final LazyLayoutScrollScope LazyLayoutScrollScope(LazyListState lazyListState, ScrollScope scrollScope) {
        return new C14691(scrollScope, lazyListState);
    }
}
