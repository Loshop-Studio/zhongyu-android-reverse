package androidx.compose.material3.internal;

import androidx.compose.material3.MenuKt;
import androidx.compose.material3.internal.MenuPosition;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.DpOffset;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntOffsetKt;
import androidx.compose.p013ui.unit.IntRect;
import androidx.compose.p013ui.unit.IntRectKt;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.p013ui.window.PopupPositionProvider;
import androidx.compose.runtime.Immutable;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10574p;

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
    private final InterfaceC10574p onPositionCalculated;
    private final MenuPosition.Horizontal rightToWindowRight;
    private final MenuPosition.Horizontal startToAnchorStart;
    private final MenuPosition.Vertical topToAnchorBottom;
    private final MenuPosition.Vertical topToWindowTop;
    private final int verticalMargin;

    public /* synthetic */ DropdownMenuPositionProvider(long j10, Density density, int i10, InterfaceC10574p interfaceC10574p, AbstractC9126n abstractC9126n) {
        this(j10, density, i10, interfaceC10574p);
    }

    /* renamed from: copy-uVxBXkw$default, reason: not valid java name */
    public static /* synthetic */ DropdownMenuPositionProvider m22909copyuVxBXkw$default(DropdownMenuPositionProvider dropdownMenuPositionProvider, long j10, Density density, int i10, InterfaceC10574p interfaceC10574p, int i11, Object obj) {
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
            interfaceC10574p = dropdownMenuPositionProvider.onPositionCalculated;
        }
        return dropdownMenuPositionProvider.m22911copyuVxBXkw(j11, density2, i12, interfaceC10574p);
    }

    @Override // androidx.compose.p013ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo20465calculatePositionllwVHH4(IntRect intRect, long j10, LayoutDirection layoutDirection, long j11) {
        int iMo22901position95KtPRI;
        int i10 = 0;
        List listM14774q = AbstractC8809v.m14774q(this.startToAnchorStart, this.endToAnchorEnd, IntOffset.m27027getXimpl(intRect.m27051getCenternOccac()) < IntSize.m27070getWidthimpl(j10) / 2 ? this.leftToWindowLeft : this.rightToWindowRight);
        int size = listM14774q.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                iMo22901position95KtPRI = 0;
                break;
            }
            iMo22901position95KtPRI = ((MenuPosition.Horizontal) listM14774q.get(i11)).mo22901position95KtPRI(intRect, j10, IntSize.m27070getWidthimpl(j11), layoutDirection);
            if (i11 == AbstractC8809v.m14773p(listM14774q) || (iMo22901position95KtPRI >= 0 && IntSize.m27070getWidthimpl(j11) + iMo22901position95KtPRI <= IntSize.m27070getWidthimpl(j10))) {
                break;
            }
            i11++;
        }
        List listM14774q2 = AbstractC8809v.m14774q(this.topToAnchorBottom, this.bottomToAnchorTop, this.centerToAnchorTop, IntOffset.m27028getYimpl(intRect.m27051getCenternOccac()) < IntSize.m27069getHeightimpl(j10) / 2 ? this.topToWindowTop : this.bottomToWindowBottom);
        int size2 = listM14774q2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            int iMo22902positionJVtK1S4 = ((MenuPosition.Vertical) listM14774q2.get(i12)).mo22902positionJVtK1S4(intRect, j10, IntSize.m27069getHeightimpl(j11));
            if (i12 == AbstractC8809v.m14773p(listM14774q2) || (iMo22902positionJVtK1S4 >= this.verticalMargin && IntSize.m27069getHeightimpl(j11) + iMo22902positionJVtK1S4 <= IntSize.m27069getHeightimpl(j10) - this.verticalMargin)) {
                i10 = iMo22902positionJVtK1S4;
                break;
            }
        }
        long jIntOffset = IntOffsetKt.IntOffset(iMo22901position95KtPRI, i10);
        this.onPositionCalculated.invoke(intRect, IntRectKt.m27060IntRectVbeCjmY(jIntOffset, j11));
        return jIntOffset;
    }

    /* renamed from: component1-RKDOV3M, reason: not valid java name */
    public final long m22910component1RKDOV3M() {
        return this.contentOffset;
    }

    public final Density component2() {
        return this.density;
    }

    public final int component3() {
        return this.verticalMargin;
    }

    public final InterfaceC10574p component4() {
        return this.onPositionCalculated;
    }

    /* renamed from: copy-uVxBXkw, reason: not valid java name */
    public final DropdownMenuPositionProvider m22911copyuVxBXkw(long j10, Density density, int i10, InterfaceC10574p interfaceC10574p) {
        return new DropdownMenuPositionProvider(j10, density, i10, interfaceC10574p, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DropdownMenuPositionProvider)) {
            return false;
        }
        DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) obj;
        return DpOffset.m26959equalsimpl0(this.contentOffset, dropdownMenuPositionProvider.contentOffset) && AbstractC9133u.m16128b(this.density, dropdownMenuPositionProvider.density) && this.verticalMargin == dropdownMenuPositionProvider.verticalMargin && AbstractC9133u.m16128b(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated);
    }

    /* renamed from: getContentOffset-RKDOV3M, reason: not valid java name */
    public final long m22912getContentOffsetRKDOV3M() {
        return this.contentOffset;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final InterfaceC10574p getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    public final int getVerticalMargin() {
        return this.verticalMargin;
    }

    public int hashCode() {
        return (((((DpOffset.m26964hashCodeimpl(this.contentOffset) * 31) + this.density.hashCode()) * 31) + Integer.hashCode(this.verticalMargin)) * 31) + this.onPositionCalculated.hashCode();
    }

    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) DpOffset.m26967toStringimpl(this.contentOffset)) + ", density=" + this.density + ", verticalMargin=" + this.verticalMargin + ", onPositionCalculated=" + this.onPositionCalculated + ')';
    }

    private DropdownMenuPositionProvider(long j10, Density density, int i10, InterfaceC10574p interfaceC10574p) {
        this.contentOffset = j10;
        this.density = density;
        this.verticalMargin = i10;
        this.onPositionCalculated = interfaceC10574p;
        int iMo20491roundToPx0680j_4 = density.mo20491roundToPx0680j_4(DpOffset.m26960getXD9Ej5fM(j10));
        MenuPosition menuPosition = MenuPosition.INSTANCE;
        this.startToAnchorStart = menuPosition.startToAnchorStart(iMo20491roundToPx0680j_4);
        this.endToAnchorEnd = menuPosition.endToAnchorEnd(iMo20491roundToPx0680j_4);
        this.leftToWindowLeft = menuPosition.leftToWindowLeft(0);
        this.rightToWindowRight = menuPosition.rightToWindowRight(0);
        int iMo20491roundToPx0680j_42 = density.mo20491roundToPx0680j_4(DpOffset.m26962getYD9Ej5fM(j10));
        this.topToAnchorBottom = menuPosition.topToAnchorBottom(iMo20491roundToPx0680j_42);
        this.bottomToAnchorTop = menuPosition.bottomToAnchorTop(iMo20491roundToPx0680j_42);
        this.centerToAnchorTop = menuPosition.centerToAnchorTop(iMo20491roundToPx0680j_42);
        this.topToWindowTop = menuPosition.topToWindowTop(i10);
        this.bottomToWindowBottom = menuPosition.bottomToWindowBottom(i10);
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j10, Density density, int i10, InterfaceC10574p interfaceC10574p, int i11, AbstractC9126n abstractC9126n) {
        this(j10, density, (i11 & 4) != 0 ? density.mo20491roundToPx0680j_4(MenuKt.getMenuVerticalMargin()) : i10, (i11 & 8) != 0 ? new InterfaceC10574p() { // from class: androidx.compose.material3.internal.DropdownMenuPositionProvider.2
            public final void invoke(IntRect intRect, IntRect intRect2) {
            }

            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((IntRect) obj, (IntRect) obj2);
                return C8736p.f16368a;
            }
        } : interfaceC10574p, null);
    }
}
