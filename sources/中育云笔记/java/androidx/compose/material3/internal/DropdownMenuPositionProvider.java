package androidx.compose.material3.internal;

import androidx.compose.material3.MenuKt;
import androidx.compose.material3.internal.MenuPosition;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.DpOffset;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.IntOffsetKt;
import androidx.compose.p014ui.unit.IntRect;
import androidx.compose.p014ui.unit.IntRectKt;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.p014ui.window.PopupPositionProvider;
import androidx.compose.runtime.Immutable;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p325rc.AbstractC10978w;

@Immutable
/* loaded from: classes2.dex */
public final class DropdownMenuPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final MenuPosition.Vertical bottomToAnchorTop;
    private final MenuPosition.Vertical bottomToWindowBottom;
    private final MenuPosition.Vertical centerToAnchorTop;
    private final long contentOffset;
    private final Density density;
    private final MenuPosition.Horizontal endToAnchorEnd;
    private final MenuPosition.Horizontal leftToWindowLeft;
    private final InterfaceC9544p onPositionCalculated;
    private final MenuPosition.Horizontal rightToWindowRight;
    private final MenuPosition.Horizontal startToAnchorStart;
    private final MenuPosition.Vertical topToAnchorBottom;
    private final MenuPosition.Vertical topToWindowTop;
    private final int verticalMargin;

    public /* synthetic */ DropdownMenuPositionProvider(long j10, Density density, int i10, InterfaceC9544p interfaceC9544p, AbstractC9972n abstractC9972n) {
        this(j10, density, i10, interfaceC9544p);
    }

    /* renamed from: copy-uVxBXkw$default, reason: not valid java name */
    public static /* synthetic */ DropdownMenuPositionProvider m29511copyuVxBXkw$default(DropdownMenuPositionProvider dropdownMenuPositionProvider, long j10, Density density, int i10, InterfaceC9544p interfaceC9544p, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = dropdownMenuPositionProvider.contentOffset;
        }
        long j11 = j10;
        if ((i11 & 2) != 0) {
            density = dropdownMenuPositionProvider.density;
        }
        Density density2 = density;
        if ((i11 & 4) != 0) {
            i10 = dropdownMenuPositionProvider.verticalMargin;
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            interfaceC9544p = dropdownMenuPositionProvider.onPositionCalculated;
        }
        return dropdownMenuPositionProvider.m29513copyuVxBXkw(j11, density2, i12, interfaceC9544p);
    }

    @Override // androidx.compose.p014ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo27067calculatePositionllwVHH4(IntRect intRect, long j10, LayoutDirection layoutDirection, long j11) {
        int iMo29503position95KtPRI;
        int i10 = 0;
        List listM24139q = AbstractC10978w.m24139q(this.startToAnchorStart, this.endToAnchorEnd, IntOffset.m33629getXimpl(intRect.m33653getCenternOccac()) < IntSize.m33672getWidthimpl(j10) / 2 ? this.leftToWindowLeft : this.rightToWindowRight);
        int size = listM24139q.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                iMo29503position95KtPRI = 0;
                break;
            }
            iMo29503position95KtPRI = ((MenuPosition.Horizontal) listM24139q.get(i11)).mo29503position95KtPRI(intRect, j10, IntSize.m33672getWidthimpl(j11), layoutDirection);
            if (i11 == AbstractC10978w.m24138p(listM24139q) || (iMo29503position95KtPRI >= 0 && IntSize.m33672getWidthimpl(j11) + iMo29503position95KtPRI <= IntSize.m33672getWidthimpl(j10))) {
                break;
            }
            i11++;
        }
        List listM24139q2 = AbstractC10978w.m24139q(this.topToAnchorBottom, this.bottomToAnchorTop, this.centerToAnchorTop, IntOffset.m33630getYimpl(intRect.m33653getCenternOccac()) < IntSize.m33671getHeightimpl(j10) / 2 ? this.topToWindowTop : this.bottomToWindowBottom);
        int size2 = listM24139q2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            int iMo29504positionJVtK1S4 = ((MenuPosition.Vertical) listM24139q2.get(i12)).mo29504positionJVtK1S4(intRect, j10, IntSize.m33671getHeightimpl(j11));
            if (i12 == AbstractC10978w.m24138p(listM24139q2) || (iMo29504positionJVtK1S4 >= this.verticalMargin && IntSize.m33671getHeightimpl(j11) + iMo29504positionJVtK1S4 <= IntSize.m33671getHeightimpl(j10) - this.verticalMargin)) {
                i10 = iMo29504positionJVtK1S4;
                break;
            }
        }
        long jIntOffset = IntOffsetKt.IntOffset(iMo29503position95KtPRI, i10);
        this.onPositionCalculated.invoke(intRect, IntRectKt.m33662IntRectVbeCjmY(jIntOffset, j11));
        return jIntOffset;
    }

    /* renamed from: component1-RKDOV3M, reason: not valid java name */
    public final long m29512component1RKDOV3M() {
        return this.contentOffset;
    }

    public final Density component2() {
        return this.density;
    }

    public final int component3() {
        return this.verticalMargin;
    }

    public final InterfaceC9544p component4() {
        return this.onPositionCalculated;
    }

    /* renamed from: copy-uVxBXkw, reason: not valid java name */
    public final DropdownMenuPositionProvider m29513copyuVxBXkw(long j10, Density density, int i10, InterfaceC9544p interfaceC9544p) {
        return new DropdownMenuPositionProvider(j10, density, i10, interfaceC9544p, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DropdownMenuPositionProvider)) {
            return false;
        }
        DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) obj;
        return DpOffset.m33561equalsimpl0(this.contentOffset, dropdownMenuPositionProvider.contentOffset) && AbstractC9979u.m20289b(this.density, dropdownMenuPositionProvider.density) && this.verticalMargin == dropdownMenuPositionProvider.verticalMargin && AbstractC9979u.m20289b(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated);
    }

    /* renamed from: getContentOffset-RKDOV3M, reason: not valid java name */
    public final long m29514getContentOffsetRKDOV3M() {
        return this.contentOffset;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final InterfaceC9544p getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    public final int getVerticalMargin() {
        return this.verticalMargin;
    }

    public int hashCode() {
        return (((((DpOffset.m33566hashCodeimpl(this.contentOffset) * 31) + this.density.hashCode()) * 31) + Integer.hashCode(this.verticalMargin)) * 31) + this.onPositionCalculated.hashCode();
    }

    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) DpOffset.m33569toStringimpl(this.contentOffset)) + ", density=" + this.density + ", verticalMargin=" + this.verticalMargin + ", onPositionCalculated=" + this.onPositionCalculated + ')';
    }

    private DropdownMenuPositionProvider(long j10, Density density, int i10, InterfaceC9544p interfaceC9544p) {
        this.contentOffset = j10;
        this.density = density;
        this.verticalMargin = i10;
        this.onPositionCalculated = interfaceC9544p;
        int iMo27093roundToPx0680j_4 = density.mo27093roundToPx0680j_4(DpOffset.m33562getXD9Ej5fM(j10));
        MenuPosition menuPosition = MenuPosition.INSTANCE;
        this.startToAnchorStart = menuPosition.startToAnchorStart(iMo27093roundToPx0680j_4);
        this.endToAnchorEnd = menuPosition.endToAnchorEnd(iMo27093roundToPx0680j_4);
        this.leftToWindowLeft = menuPosition.leftToWindowLeft(0);
        this.rightToWindowRight = menuPosition.rightToWindowRight(0);
        int iMo27093roundToPx0680j_42 = density.mo27093roundToPx0680j_4(DpOffset.m33564getYD9Ej5fM(j10));
        this.topToAnchorBottom = menuPosition.topToAnchorBottom(iMo27093roundToPx0680j_42);
        this.bottomToAnchorTop = menuPosition.bottomToAnchorTop(iMo27093roundToPx0680j_42);
        this.centerToAnchorTop = menuPosition.centerToAnchorTop(iMo27093roundToPx0680j_42);
        this.topToWindowTop = menuPosition.topToWindowTop(i10);
        this.bottomToWindowBottom = menuPosition.bottomToWindowBottom(i10);
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j10, Density density, int i10, InterfaceC9544p interfaceC9544p, int i11, AbstractC9972n abstractC9972n) {
        this(j10, density, (i11 & 4) != 0 ? density.mo27093roundToPx0680j_4(MenuKt.getMenuVerticalMargin()) : i10, (i11 & 8) != 0 ? new InterfaceC9544p() { // from class: androidx.compose.material3.internal.DropdownMenuPositionProvider.2
            public final void invoke(IntRect intRect, IntRect intRect2) {
            }

            @Override // p181hd.InterfaceC9544p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((IntRect) obj, (IntRect) obj2);
                return C10786q.f26013a;
            }
        } : interfaceC9544p, null);
    }
}
