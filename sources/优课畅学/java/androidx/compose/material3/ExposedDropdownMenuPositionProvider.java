package androidx.compose.material3;

import androidx.compose.material3.internal.MenuPosition;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntOffsetKt;
import androidx.compose.p013ui.unit.IntRect;
import androidx.compose.p013ui.unit.IntRectKt;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.p013ui.unit.IntSizeKt;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.p013ui.window.PopupPositionProvider;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import p123h7.C8736p;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10574p;

@Stable
/* loaded from: classes2.dex */
public final class ExposedDropdownMenuPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final MenuPosition.Vertical bottomToAnchorTop;
    private final MenuPosition.Vertical bottomToWindowBottom;
    private final Density density;
    private final MenuPosition.Horizontal endToAnchorEnd;
    private final State<C8736p> keyboardSignalState;
    private final MenuPosition.Horizontal leftToWindowLeft;
    private final InterfaceC10574p onPositionCalculated;
    private final MenuPosition.Horizontal rightToWindowRight;
    private final MenuPosition.Horizontal startToAnchorStart;
    private final MenuPosition.Vertical topToAnchorBottom;
    private final MenuPosition.Vertical topToWindowTop;
    private final int topWindowInsets;
    private final int verticalMargin;

    public ExposedDropdownMenuPositionProvider(Density density, int i10, State<C8736p> state, int i11, InterfaceC10574p interfaceC10574p) {
        this.density = density;
        this.topWindowInsets = i10;
        this.keyboardSignalState = state;
        this.verticalMargin = i11;
        this.onPositionCalculated = interfaceC10574p;
        MenuPosition menuPosition = MenuPosition.INSTANCE;
        this.startToAnchorStart = MenuPosition.startToAnchorStart$default(menuPosition, 0, 1, null);
        this.endToAnchorEnd = MenuPosition.endToAnchorEnd$default(menuPosition, 0, 1, null);
        this.leftToWindowLeft = MenuPosition.leftToWindowLeft$default(menuPosition, 0, 1, null);
        this.rightToWindowRight = MenuPosition.rightToWindowRight$default(menuPosition, 0, 1, null);
        this.topToAnchorBottom = MenuPosition.topToAnchorBottom$default(menuPosition, 0, 1, null);
        this.bottomToAnchorTop = MenuPosition.bottomToAnchorTop$default(menuPosition, 0, 1, null);
        this.topToWindowTop = menuPosition.topToWindowTop(i11);
        this.bottomToWindowBottom = menuPosition.bottomToWindowBottom(i11);
    }

    @Override // androidx.compose.p013ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo20465calculatePositionllwVHH4(IntRect intRect, long j10, LayoutDirection layoutDirection, long j11) {
        int iMo22901position95KtPRI;
        State<C8736p> state = this.keyboardSignalState;
        if (state != null) {
            state.getValue();
        }
        long jIntSize = IntSizeKt.IntSize(IntSize.m27070getWidthimpl(j10), IntSize.m27069getHeightimpl(j10) + this.topWindowInsets);
        int i10 = 0;
        List listM14774q = AbstractC8809v.m14774q(this.startToAnchorStart, this.endToAnchorEnd, IntOffset.m27027getXimpl(intRect.m27051getCenternOccac()) < IntSize.m27070getWidthimpl(jIntSize) / 2 ? this.leftToWindowLeft : this.rightToWindowRight);
        int size = listM14774q.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                iMo22901position95KtPRI = 0;
                break;
            }
            iMo22901position95KtPRI = ((MenuPosition.Horizontal) listM14774q.get(i11)).mo22901position95KtPRI(intRect, jIntSize, IntSize.m27070getWidthimpl(j11), layoutDirection);
            if (i11 == AbstractC8809v.m14773p(listM14774q) || (iMo22901position95KtPRI >= 0 && IntSize.m27070getWidthimpl(j11) + iMo22901position95KtPRI <= IntSize.m27070getWidthimpl(jIntSize))) {
                break;
            }
            i11++;
        }
        List listM14774q2 = AbstractC8809v.m14774q(this.topToAnchorBottom, this.bottomToAnchorTop, IntOffset.m27028getYimpl(intRect.m27051getCenternOccac()) < IntSize.m27069getHeightimpl(jIntSize) / 2 ? this.topToWindowTop : this.bottomToWindowBottom);
        int size2 = listM14774q2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            int iMo22902positionJVtK1S4 = ((MenuPosition.Vertical) listM14774q2.get(i12)).mo22902positionJVtK1S4(intRect, jIntSize, IntSize.m27069getHeightimpl(j11));
            if (i12 == AbstractC8809v.m14773p(listM14774q2) || (iMo22902positionJVtK1S4 >= 0 && IntSize.m27069getHeightimpl(j11) + iMo22902positionJVtK1S4 <= IntSize.m27069getHeightimpl(jIntSize))) {
                i10 = iMo22902positionJVtK1S4;
                break;
            }
        }
        long jIntOffset = IntOffsetKt.IntOffset(iMo22901position95KtPRI, i10);
        this.onPositionCalculated.invoke(intRect, IntRectKt.m27060IntRectVbeCjmY(jIntOffset, j11));
        return jIntOffset;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final State<C8736p> getKeyboardSignalState() {
        return this.keyboardSignalState;
    }

    public final InterfaceC10574p getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    public final int getTopWindowInsets() {
        return this.topWindowInsets;
    }

    public final int getVerticalMargin() {
        return this.verticalMargin;
    }

    public /* synthetic */ ExposedDropdownMenuPositionProvider(Density density, int i10, State state, int i11, InterfaceC10574p interfaceC10574p, int i12, AbstractC9126n abstractC9126n) {
        this(density, i10, (i12 & 4) != 0 ? null : state, (i12 & 8) != 0 ? density.mo20491roundToPx0680j_4(MenuKt.getMenuVerticalMargin()) : i11, (i12 & 16) != 0 ? new InterfaceC10574p() { // from class: androidx.compose.material3.ExposedDropdownMenuPositionProvider.2
            public final void invoke(IntRect intRect, IntRect intRect2) {
            }

            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((IntRect) obj, (IntRect) obj2);
                return C8736p.f16368a;
            }
        } : interfaceC10574p);
    }
}
