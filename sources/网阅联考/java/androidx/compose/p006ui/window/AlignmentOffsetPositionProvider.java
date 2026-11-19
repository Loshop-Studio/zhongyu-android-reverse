package androidx.compose.p006ui.window;

import androidx.compose.p006ui.Alignment;
import androidx.compose.p006ui.unit.IntOffset;
import androidx.compose.p006ui.unit.IntOffsetKt;
import androidx.compose.p006ui.unit.IntRect;
import androidx.compose.p006ui.unit.IntSize;
import androidx.compose.p006ui.unit.IntSizeKt;
import androidx.compose.p006ui.unit.LayoutDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006J5\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, m5175d2 = {"Landroidx/compose/ui/window/AlignmentOffsetPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "alignment", "Landroidx/compose/ui/Alignment;", "offset", "Landroidx/compose/ui/unit/IntOffset;", "(Landroidx/compose/ui/Alignment;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAlignment", "()Landroidx/compose/ui/Alignment;", "getOffset-nOcc-ac", "()J", "J", "calculatePosition", "anchorBounds", "Landroidx/compose/ui/unit/IntRect;", "windowSize", "Landroidx/compose/ui/unit/IntSize;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "popupContentSize", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Popup.kt\nandroidx/compose/ui/window/AlignmentOffsetPositionProvider\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,102:1\n86#2:103\n86#2:104\n79#2:105\n86#2:106\n*S KotlinDebug\n*F\n+ 1 Popup.kt\nandroidx/compose/ui/window/AlignmentOffsetPositionProvider\n*L\n84#1:103\n87#1:104\n90#1:105\n97#1:106\n*E\n"})
/* loaded from: classes.dex */
public final class AlignmentOffsetPositionProvider implements PopupPositionProvider {
    private final Alignment alignment;
    private final long offset;

    public /* synthetic */ AlignmentOffsetPositionProvider(Alignment alignment, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(alignment, j4);
    }

    @Override // androidx.compose.p006ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo7705calculatePositionllwVHH4(IntRect anchorBounds, long windowSize, LayoutDirection layoutDirection, long popupContentSize) {
        Intrinsics.checkNotNullParameter(anchorBounds, "anchorBounds");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        long jIntOffset = IntOffsetKt.IntOffset(0, 0);
        Alignment alignment = this.alignment;
        IntSize.Companion companion = IntSize.INSTANCE;
        long jMo8841alignKFBX0sM = alignment.mo8841alignKFBX0sM(companion.m11690getZeroYbymL2g(), IntSizeKt.IntSize(anchorBounds.getWidth(), anchorBounds.getHeight()), layoutDirection);
        long jMo8841alignKFBX0sM2 = this.alignment.mo8841alignKFBX0sM(companion.m11690getZeroYbymL2g(), IntSizeKt.IntSize(IntSize.m11685getWidthimpl(popupContentSize), IntSize.m11684getHeightimpl(popupContentSize)), layoutDirection);
        long jIntOffset2 = IntOffsetKt.IntOffset(anchorBounds.getLeft(), anchorBounds.getTop());
        long jIntOffset3 = IntOffsetKt.IntOffset(IntOffset.m11643getXimpl(jIntOffset) + IntOffset.m11643getXimpl(jIntOffset2), IntOffset.m11644getYimpl(jIntOffset) + IntOffset.m11644getYimpl(jIntOffset2));
        long jIntOffset4 = IntOffsetKt.IntOffset(IntOffset.m11643getXimpl(jIntOffset3) + IntOffset.m11643getXimpl(jMo8841alignKFBX0sM), IntOffset.m11644getYimpl(jIntOffset3) + IntOffset.m11644getYimpl(jMo8841alignKFBX0sM));
        long jIntOffset5 = IntOffsetKt.IntOffset(IntOffset.m11643getXimpl(jMo8841alignKFBX0sM2), IntOffset.m11644getYimpl(jMo8841alignKFBX0sM2));
        long jIntOffset6 = IntOffsetKt.IntOffset(IntOffset.m11643getXimpl(jIntOffset4) - IntOffset.m11643getXimpl(jIntOffset5), IntOffset.m11644getYimpl(jIntOffset4) - IntOffset.m11644getYimpl(jIntOffset5));
        long jIntOffset7 = IntOffsetKt.IntOffset(IntOffset.m11643getXimpl(this.offset) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1), IntOffset.m11644getYimpl(this.offset));
        return IntOffsetKt.IntOffset(IntOffset.m11643getXimpl(jIntOffset6) + IntOffset.m11643getXimpl(jIntOffset7), IntOffset.m11644getYimpl(jIntOffset6) + IntOffset.m11644getYimpl(jIntOffset7));
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    /* renamed from: getOffset-nOcc-ac, reason: not valid java name and from getter */
    public final long getOffset() {
        return this.offset;
    }

    private AlignmentOffsetPositionProvider(Alignment alignment, long j4) {
        this.alignment = alignment;
        this.offset = j4;
    }
}
