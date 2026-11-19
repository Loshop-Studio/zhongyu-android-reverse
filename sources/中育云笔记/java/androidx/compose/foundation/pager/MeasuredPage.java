package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class MeasuredPage implements PageInfo {
    public static final int $stable = 8;
    private final int crossAxisSize;
    private final Alignment.Horizontal horizontalAlignment;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private int offset;
    private final int[] placeableOffsets;
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private final int size;
    private final Alignment.Vertical verticalAlignment;
    private final long visualOffset;

    public /* synthetic */ MeasuredPage(int i10, int i11, List list, long j10, Object obj, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z10, AbstractC9972n abstractC9972n) {
        this(i10, i11, list, j10, obj, orientation, horizontal, vertical, layoutDirection, z10);
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m27701copy4Tuh3kE(long j10, InterfaceC9540l interfaceC9540l) {
        int iM33629getXimpl = this.isVertical ? IntOffset.m33629getXimpl(j10) : ((Number) interfaceC9540l.invoke(Integer.valueOf(IntOffset.m33629getXimpl(j10)))).intValue();
        boolean z10 = this.isVertical;
        int iM33630getYimpl = IntOffset.m33630getYimpl(j10);
        if (z10) {
            iM33630getYimpl = ((Number) interfaceC9540l.invoke(Integer.valueOf(iM33630getYimpl))).intValue();
        }
        return IntOffset.m33623constructorimpl((iM33629getXimpl << 32) | (iM33630getYimpl & 4294967295L));
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }

    /* renamed from: getOffset-Bjo55l4, reason: not valid java name */
    private final long m27702getOffsetBjo55l4(int i10) {
        int[] iArr = this.placeableOffsets;
        int i11 = i10 * 2;
        return IntOffset.m33623constructorimpl((iArr[i11] << 32) | (iArr[i11 + 1] & 4294967295L));
    }

    public final void applyScrollDelta(int i10) {
        this.offset = getOffset() + i10;
        int length = this.placeableOffsets.length;
        for (int i11 = 0; i11 < length; i11++) {
            boolean z10 = this.isVertical;
            if ((z10 && i11 % 2 == 1) || (!z10 && i11 % 2 == 0)) {
                int[] iArr = this.placeableOffsets;
                iArr[i11] = iArr[i11] + i10;
            }
        }
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public int getOffset() {
        return this.offset;
    }

    public final int getSize() {
        return this.size;
    }

    public final void place(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope placementScope2;
        int i10 = 0;
        if (!(this.mainAxisLayoutSize != Integer.MIN_VALUE)) {
            InlineClassHelperKt.throwIllegalArgumentException("position() should be called first");
        }
        int size = this.placeables.size();
        while (i10 < size) {
            Placeable placeable = this.placeables.get(i10);
            long jM27702getOffsetBjo55l4 = m27702getOffsetBjo55l4(i10);
            if (this.reverseLayout) {
                jM27702getOffsetBjo55l4 = IntOffset.m33623constructorimpl(((this.isVertical ? IntOffset.m33629getXimpl(jM27702getOffsetBjo55l4) : (this.mainAxisLayoutSize - IntOffset.m33629getXimpl(jM27702getOffsetBjo55l4)) - getMainAxisSize(placeable)) << 32) | ((this.isVertical ? (this.mainAxisLayoutSize - IntOffset.m33630getYimpl(jM27702getOffsetBjo55l4)) - getMainAxisSize(placeable) : IntOffset.m33630getYimpl(jM27702getOffsetBjo55l4)) & 4294967295L));
            }
            long jM33633plusqkQi6aY = IntOffset.m33633plusqkQi6aY(jM27702getOffsetBjo55l4, this.visualOffset);
            if (this.isVertical) {
                placementScope2 = placementScope;
                Placeable.PlacementScope.m32297placeWithLayeraW9wM$default(placementScope2, placeable, jM33633plusqkQi6aY, 0.0f, (InterfaceC9540l) null, 6, (Object) null);
            } else {
                placementScope2 = placementScope;
                Placeable.PlacementScope.m32295placeRelativeWithLayeraW9wM$default(placementScope2, placeable, jM33633plusqkQi6aY, 0.0f, (InterfaceC9540l) null, 6, (Object) null);
            }
            i10++;
            placementScope = placementScope2;
        }
    }

    public final void position(int i10, int i11, int i12) {
        int width;
        this.offset = i10;
        this.mainAxisLayoutSize = this.isVertical ? i12 : i11;
        List<Placeable> list = this.placeables;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            Placeable placeable = list.get(i13);
            int i14 = i13 * 2;
            if (this.isVertical) {
                int[] iArr = this.placeableOffsets;
                Alignment.Horizontal horizontal = this.horizontalAlignment;
                if (horizontal == null) {
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null horizontalAlignment");
                    throw new KotlinNothingValueException();
                }
                iArr[i14] = horizontal.align(placeable.getWidth(), i11, this.layoutDirection);
                this.placeableOffsets[i14 + 1] = i10;
                width = placeable.getHeight();
            } else {
                int[] iArr2 = this.placeableOffsets;
                iArr2[i14] = i10;
                int i15 = i14 + 1;
                Alignment.Vertical vertical = this.verticalAlignment;
                if (vertical == null) {
                    InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null verticalAlignment");
                    throw new KotlinNothingValueException();
                }
                iArr2[i15] = vertical.align(placeable.getHeight(), i12);
                width = placeable.getWidth();
            }
            i10 += width;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private MeasuredPage(int i10, int i11, List<? extends Placeable> list, long j10, Object obj, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z10) {
        this.index = i10;
        this.size = i11;
        this.placeables = list;
        this.visualOffset = j10;
        this.key = obj;
        this.horizontalAlignment = horizontal;
        this.verticalAlignment = vertical;
        this.layoutDirection = layoutDirection;
        this.reverseLayout = z10;
        this.isVertical = orientation == Orientation.Vertical;
        int size = list.size();
        int iMax = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Placeable placeable = (Placeable) list.get(i12);
            iMax = Math.max(iMax, !this.isVertical ? placeable.getHeight() : placeable.getWidth());
        }
        this.crossAxisSize = iMax;
        this.placeableOffsets = new int[this.placeables.size() * 2];
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
    }
}
