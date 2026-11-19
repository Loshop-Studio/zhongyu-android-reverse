package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.p006ui.layout.Placeable;
import androidx.compose.p006ui.unit.IntOffset;
import androidx.compose.p006ui.unit.IntOffsetKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.C3380c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001BN\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\b\u0010$\u001a\u00020%H\u0016J.\u0010&\u001a\u00020\u0003*\u00020\u00032\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050(H\u0082\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\t\u001a\u00020\nX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u001b\u001a\u00020\u0005*\u00020\r8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, m5175d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridPositionedItem;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", "offset", "Landroidx/compose/ui/unit/IntOffset;", "index", "", "lane", "key", "", "size", "Landroidx/compose/ui/unit/IntSize;", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "isVertical", "", "mainAxisLayoutSize", "(JIILjava/lang/Object;JLjava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getIndex", "()I", "getKey", "()Ljava/lang/Object;", "getLane", "getOffset-nOcc-ac", "()J", "J", "getSize-YbymL2g", "mainAxisSize", "getMainAxisSize", "(Landroidx/compose/ui/layout/Placeable;)I", "place", "", "scope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", C3380c.f1965R, "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "toString", "", "copy", "mainAxisMap", "Lkotlin/Function1;", "copy-4Tuh3kE", "(JLkotlin/jvm/functions/Function1;)J", "foundation_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridPositionedItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,1097:1\n1088#1:1102\n1086#1:1103\n33#2,4:1098\n38#2:1105\n86#3:1104\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridPositionedItem\n*L\n1074#1:1102\n1075#1:1103\n1072#1:1098,4\n1072#1:1105\n1081#1:1104\n*E\n"})
/* loaded from: classes.dex */
final class LazyStaggeredGridPositionedItem implements LazyStaggeredGridItemInfo {
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final int lane;
    private final int mainAxisLayoutSize;
    private final long offset;
    private final List<Placeable> placeables;
    private final long size;

    public /* synthetic */ LazyStaggeredGridPositionedItem(long j4, int i4, int i5, Object obj, long j5, List list, boolean z3, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j4, i4, i5, obj, j5, list, z3, i6);
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m7541copy4Tuh3kE(long j4, Function1<? super Integer, Integer> function1) {
        int iM11643getXimpl = this.isVertical ? IntOffset.m11643getXimpl(j4) : function1.invoke(Integer.valueOf(IntOffset.m11643getXimpl(j4))).intValue();
        boolean z3 = this.isVertical;
        int iM11644getYimpl = IntOffset.m11644getYimpl(j4);
        if (z3) {
            iM11644getYimpl = function1.invoke(Integer.valueOf(iM11644getYimpl)).intValue();
        }
        return IntOffsetKt.IntOffset(iM11643getXimpl, iM11644getYimpl);
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public int getLane() {
        return this.lane;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* renamed from: getOffset-nOcc-ac, reason: from getter */
    public long getOffset() {
        return this.offset;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* renamed from: getSize-YbymL2g, reason: from getter */
    public long getSize() {
        return this.size;
    }

    public final void place(Placeable.PlacementScope scope, LazyStaggeredGridMeasureContext context) {
        long offset;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(context, "context");
        List<Placeable> list = this.placeables;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            Placeable placeable = list.get(i4);
            if (context.getReverseLayout()) {
                long offset2 = getOffset();
                offset = IntOffsetKt.IntOffset(this.isVertical ? IntOffset.m11643getXimpl(offset2) : (this.mainAxisLayoutSize - IntOffset.m11643getXimpl(offset2)) - (this.isVertical ? placeable.getHeight() : placeable.getWidth()), this.isVertical ? (this.mainAxisLayoutSize - IntOffset.m11644getYimpl(offset2)) - (this.isVertical ? placeable.getHeight() : placeable.getWidth()) : IntOffset.m11644getYimpl(offset2));
            } else {
                offset = getOffset();
            }
            long jM7530getContentOffsetnOccac = context.getContentOffset();
            Placeable.PlacementScope.m10622placeRelativeWithLayeraW9wM$default(scope, placeable, IntOffsetKt.IntOffset(IntOffset.m11643getXimpl(offset) + IntOffset.m11643getXimpl(jM7530getContentOffsetnOccac), IntOffset.m11644getYimpl(offset) + IntOffset.m11644getYimpl(jM7530getContentOffsetnOccac)), 0.0f, null, 6, null);
        }
    }

    public String toString() {
        return super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LazyStaggeredGridPositionedItem(long j4, int i4, int i5, Object obj, long j5, List<? extends Placeable> list, boolean z3, int i6) {
        this.offset = j4;
        this.index = i4;
        this.lane = i5;
        this.key = obj;
        this.size = j5;
        this.placeables = list;
        this.isVertical = z3;
        this.mainAxisLayoutSize = i6;
    }
}
