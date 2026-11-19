package androidx.compose.material3;

import androidx.compose.material3.internal.MenuPosition;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.IntOffsetKt;
import androidx.compose.p014ui.unit.IntRect;
import androidx.compose.p014ui.unit.IntRectKt;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.p014ui.unit.IntSizeKt;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.p014ui.window.PopupPositionProvider;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p325rc.AbstractC10978w;

@Stable
/* loaded from: classes2.dex */
public final class ExposedDropdownMenuPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final MenuPosition.Vertical bottomToAnchorTop;
    private final MenuPosition.Vertical bottomToWindowBottom;
    private final Density density;
    private final MenuPosition.Horizontal endToAnchorEnd;
    private final State<C10786q> keyboardSignalState;
    private final MenuPosition.Horizontal leftToWindowLeft;
    private final InterfaceC9544p onPositionCalculated;
    private final MenuPosition.Horizontal rightToWindowRight;
    private final MenuPosition.Horizontal startToAnchorStart;
    private final MenuPosition.Vertical topToAnchorBottom;
    private final MenuPosition.Vertical topToWindowTop;
    private final int topWindowInsets;
    private final int verticalMargin;

    public ExposedDropdownMenuPositionProvider(Density density, int i10, State<C10786q> state, int i11, InterfaceC9544p interfaceC9544p) {
        this.density = density;
        this.topWindowInsets = i10;
        this.keyboardSignalState = state;
        this.verticalMargin = i11;
        this.onPositionCalculated = interfaceC9544p;
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

    @Override // androidx.compose.p014ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo27067calculatePositionllwVHH4(IntRect intRect, long j10, LayoutDirection layoutDirection, long j11) {
        int iMo29503position95KtPRI;
        State<C10786q> state = this.keyboardSignalState;
        if (state != null) {
            state.getValue();
        }
        long jIntSize = IntSizeKt.IntSize(IntSize.m33672getWidthimpl(j10), IntSize.m33671getHeightimpl(j10) + this.topWindowInsets);
        int i10 = 0;
        List listM24139q = AbstractC10978w.m24139q(this.startToAnchorStart, this.endToAnchorEnd, IntOffset.m33629getXimpl(intRect.m33653getCenternOccac()) < IntSize.m33672getWidthimpl(jIntSize) / 2 ? this.leftToWindowLeft : this.rightToWindowRight);
        int size = listM24139q.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                iMo29503position95KtPRI = 0;
                break;
            }
            iMo29503position95KtPRI = ((MenuPosition.Horizontal) listM24139q.get(i11)).mo29503position95KtPRI(intRect, jIntSize, IntSize.m33672getWidthimpl(j11), layoutDirection);
            if (i11 == AbstractC10978w.m24138p(listM24139q) || (iMo29503position95KtPRI >= 0 && IntSize.m33672getWidthimpl(j11) + iMo29503position95KtPRI <= IntSize.m33672getWidthimpl(jIntSize))) {
                break;
            }
            i11++;
        }
        List listM24139q2 = AbstractC10978w.m24139q(this.topToAnchorBottom, this.bottomToAnchorTop, IntOffset.m33630getYimpl(intRect.m33653getCenternOccac()) < IntSize.m33671getHeightimpl(jIntSize) / 2 ? this.topToWindowTop : this.bottomToWindowBottom);
        int size2 = listM24139q2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            int iMo29504positionJVtK1S4 = ((MenuPosition.Vertical) listM24139q2.get(i12)).mo29504positionJVtK1S4(intRect, jIntSize, IntSize.m33671getHeightimpl(j11));
            if (i12 == AbstractC10978w.m24138p(listM24139q2) || (iMo29504positionJVtK1S4 >= 0 && IntSize.m33671getHeightimpl(j11) + iMo29504positionJVtK1S4 <= IntSize.m33671getHeightimpl(jIntSize))) {
                i10 = iMo29504positionJVtK1S4;
                break;
            }
        }
        long jIntOffset = IntOffsetKt.IntOffset(iMo29503position95KtPRI, i10);
        this.onPositionCalculated.invoke(intRect, IntRectKt.m33662IntRectVbeCjmY(jIntOffset, j11));
        return jIntOffset;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final State<C10786q> getKeyboardSignalState() {
        return this.keyboardSignalState;
    }

    public final InterfaceC9544p getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    public final int getTopWindowInsets() {
        return this.topWindowInsets;
    }

    public final int getVerticalMargin() {
        return this.verticalMargin;
    }

    public /* synthetic */ ExposedDropdownMenuPositionProvider(Density density, int i10, State state, int i11, InterfaceC9544p interfaceC9544p, int i12, AbstractC9972n abstractC9972n) {
        this(density, i10, (i12 & 4) != 0 ? null : state, (i12 & 8) != 0 ? density.mo27093roundToPx0680j_4(MenuKt.getMenuVerticalMargin()) : i11, (i12 & 16) != 0 ? new InterfaceC9544p() { // from class: androidx.compose.material3.ExposedDropdownMenuPositionProvider.2
            public final void invoke(IntRect intRect, IntRect intRect2) {
            }

            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((IntRect) obj, (IntRect) obj2);
                return C10786q.f26013a;
            }
        } : interfaceC9544p);
    }
}
