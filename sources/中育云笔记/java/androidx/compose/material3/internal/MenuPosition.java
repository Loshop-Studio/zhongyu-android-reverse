package androidx.compose.material3.internal;

import androidx.compose.material3.internal.AnchorAlignmentOffsetPosition;
import androidx.compose.material3.internal.WindowAlignmentMarginPosition;
import androidx.compose.p014ui.AbsoluteAlignment;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.unit.IntRect;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;

@Stable
/* loaded from: classes2.dex */
public final class MenuPosition {
    public static final int $stable = 0;
    public static final MenuPosition INSTANCE = new MenuPosition();

    @Stable
    public interface Horizontal {
        /* renamed from: position-95KtPRI */
        int mo29503position95KtPRI(IntRect intRect, long j10, int i10, LayoutDirection layoutDirection);
    }

    @Stable
    public interface Vertical {
        /* renamed from: position-JVtK1S4 */
        int mo29504positionJVtK1S4(IntRect intRect, long j10, int i10);
    }

    private MenuPosition() {
    }

    public static /* synthetic */ Vertical bottomToAnchorTop$default(MenuPosition menuPosition, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return menuPosition.bottomToAnchorTop(i10);
    }

    public static /* synthetic */ Vertical bottomToWindowBottom$default(MenuPosition menuPosition, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return menuPosition.bottomToWindowBottom(i10);
    }

    public static /* synthetic */ Vertical centerToAnchorTop$default(MenuPosition menuPosition, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return menuPosition.centerToAnchorTop(i10);
    }

    public static /* synthetic */ Horizontal endToAnchorEnd$default(MenuPosition menuPosition, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return menuPosition.endToAnchorEnd(i10);
    }

    public static /* synthetic */ Horizontal leftToWindowLeft$default(MenuPosition menuPosition, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return menuPosition.leftToWindowLeft(i10);
    }

    public static /* synthetic */ Horizontal rightToWindowRight$default(MenuPosition menuPosition, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return menuPosition.rightToWindowRight(i10);
    }

    public static /* synthetic */ Horizontal startToAnchorStart$default(MenuPosition menuPosition, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return menuPosition.startToAnchorStart(i10);
    }

    public static /* synthetic */ Vertical topToAnchorBottom$default(MenuPosition menuPosition, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return menuPosition.topToAnchorBottom(i10);
    }

    public static /* synthetic */ Vertical topToWindowTop$default(MenuPosition menuPosition, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return menuPosition.topToWindowTop(i10);
    }

    public final Vertical bottomToAnchorTop(int i10) {
        Alignment.Companion companion = Alignment.Companion;
        return new AnchorAlignmentOffsetPosition.Vertical(companion.getBottom(), companion.getTop(), i10);
    }

    public final Vertical bottomToWindowBottom(int i10) {
        return new WindowAlignmentMarginPosition.Vertical(Alignment.Companion.getBottom(), i10);
    }

    public final Vertical centerToAnchorTop(int i10) {
        Alignment.Companion companion = Alignment.Companion;
        return new AnchorAlignmentOffsetPosition.Vertical(companion.getCenterVertically(), companion.getTop(), i10);
    }

    public final Horizontal endToAnchorEnd(int i10) {
        Alignment.Companion companion = Alignment.Companion;
        return new AnchorAlignmentOffsetPosition.Horizontal(companion.getEnd(), companion.getEnd(), i10);
    }

    public final Horizontal leftToWindowLeft(int i10) {
        return new WindowAlignmentMarginPosition.Horizontal(AbsoluteAlignment.INSTANCE.getLeft(), i10);
    }

    public final Horizontal rightToWindowRight(int i10) {
        return new WindowAlignmentMarginPosition.Horizontal(AbsoluteAlignment.INSTANCE.getRight(), i10);
    }

    public final Horizontal startToAnchorStart(int i10) {
        Alignment.Companion companion = Alignment.Companion;
        return new AnchorAlignmentOffsetPosition.Horizontal(companion.getStart(), companion.getStart(), i10);
    }

    public final Vertical topToAnchorBottom(int i10) {
        Alignment.Companion companion = Alignment.Companion;
        return new AnchorAlignmentOffsetPosition.Vertical(companion.getTop(), companion.getBottom(), i10);
    }

    public final Vertical topToWindowTop(int i10) {
        return new WindowAlignmentMarginPosition.Vertical(Alignment.Companion.getTop(), i10);
    }
}
