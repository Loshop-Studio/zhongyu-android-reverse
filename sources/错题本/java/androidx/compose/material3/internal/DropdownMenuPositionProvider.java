package androidx.compose.material3.internal;

import androidx.autofill.HintConstants;
import androidx.collection.AbstractC0584a;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.internal.MenuPosition;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.DpOffset;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntOffsetKt;
import androidx.compose.p011ui.unit.IntRect;
import androidx.compose.p011ui.unit.IntRectKt;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.p011ui.window.PopupPositionProvider;
import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6473e;

@Immutable
@Metadata(m5109d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u00128\b\u0002\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\u0004\b\u0010\u0010\u0011J2\u0010\u001a\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001d\u001a\u00020\u0002HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J@\u0010\"\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\bHÆ\u0003¢\u0006\u0004\b\"\u0010#Jk\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u000628\b\u0002\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\bHÆ\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b*\u0010!J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010!RG\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\b8\u0006¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b7\u0010#R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010:R\u0014\u0010<\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010:R\u0014\u0010=\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010:R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010@R\u0014\u0010B\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010@R\u0014\u0010C\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010@R\u0014\u0010D\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010@\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006E"}, m5110d2 = {"Landroidx/compose/material3/internal/DropdownMenuPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "Landroidx/compose/ui/unit/DpOffset;", "contentOffset", "Landroidx/compose/ui/unit/Density;", "density", "", "verticalMargin", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntRect;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "anchorBounds", "menuBounds", "Ld6/s;", "onPositionCalculated", "<init>", "(JLandroidx/compose/ui/unit/Density;ILr6/e;Lkotlin/jvm/internal/e;)V", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "Landroidx/compose/ui/unit/IntOffset;", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "calculatePosition", "component1-RKDOV3M", "()J", "component1", "component2", "()Landroidx/compose/ui/unit/Density;", "component3", "()I", "component4", "()Lr6/e;", "copy-uVxBXkw", "(JLandroidx/compose/ui/unit/Density;ILr6/e;)Landroidx/compose/material3/internal/DropdownMenuPositionProvider;", "copy", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getContentOffset-RKDOV3M", "Landroidx/compose/ui/unit/Density;", "getDensity", "I", "getVerticalMargin", "Lr6/e;", "getOnPositionCalculated", "Landroidx/compose/material3/internal/MenuPosition$Horizontal;", "startToAnchorStart", "Landroidx/compose/material3/internal/MenuPosition$Horizontal;", "endToAnchorEnd", "leftToWindowLeft", "rightToWindowRight", "Landroidx/compose/material3/internal/MenuPosition$Vertical;", "topToAnchorBottom", "Landroidx/compose/material3/internal/MenuPosition$Vertical;", "bottomToAnchorTop", "centerToAnchorTop", "topToWindowTop", "bottomToWindowBottom", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMenuPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuPosition.kt\nandroidx/compose/material3/internal/DropdownMenuPositionProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n1#2:433\n*E\n"})
/* loaded from: classes.dex */
public final /* data */ class DropdownMenuPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;

    @NotNull
    private final MenuPosition.Vertical bottomToAnchorTop;

    @NotNull
    private final MenuPosition.Vertical bottomToWindowBottom;

    @NotNull
    private final MenuPosition.Vertical centerToAnchorTop;
    private final long contentOffset;

    @NotNull
    private final Density density;

    @NotNull
    private final MenuPosition.Horizontal endToAnchorEnd;

    @NotNull
    private final MenuPosition.Horizontal leftToWindowLeft;

    @NotNull
    private final InterfaceC6473e onPositionCalculated;

    @NotNull
    private final MenuPosition.Horizontal rightToWindowRight;

    @NotNull
    private final MenuPosition.Horizontal startToAnchorStart;

    @NotNull
    private final MenuPosition.Vertical topToAnchorBottom;

    @NotNull
    private final MenuPosition.Vertical topToWindowTop;
    private final int verticalMargin;

    public /* synthetic */ DropdownMenuPositionProvider(long j7, Density density, int i, InterfaceC6473e interfaceC6473e, AbstractC5824e abstractC5824e) {
        this(j7, density, i, interfaceC6473e);
    }

    /* renamed from: copy-uVxBXkw$default, reason: not valid java name */
    public static /* synthetic */ DropdownMenuPositionProvider m9315copyuVxBXkw$default(DropdownMenuPositionProvider dropdownMenuPositionProvider, long j7, Density density, int i, InterfaceC6473e interfaceC6473e, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j7 = dropdownMenuPositionProvider.contentOffset;
        }
        long j8 = j7;
        if ((i8 & 2) != 0) {
            density = dropdownMenuPositionProvider.density;
        }
        Density density2 = density;
        if ((i8 & 4) != 0) {
            i = dropdownMenuPositionProvider.verticalMargin;
        }
        int i9 = i;
        if ((i8 & 8) != 0) {
            interfaceC6473e = dropdownMenuPositionProvider.onPositionCalculated;
        }
        return dropdownMenuPositionProvider.m9317copyuVxBXkw(j8, density2, i9, interfaceC6473e);
    }

    @Override // androidx.compose.p011ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo6871calculatePositionllwVHH4(@NotNull IntRect anchorBounds, long windowSize, @NotNull LayoutDirection layoutDirection, long popupContentSize) {
        int iMo9307position95KtPRI;
        int i = 0;
        List listM5287z = AbstractC5806u.m5287z(this.startToAnchorStart, this.endToAnchorEnd, IntOffset.m13433getXimpl(anchorBounds.m13457getCenternOccac()) < IntSize.m13476getWidthimpl(windowSize) / 2 ? this.leftToWindowLeft : this.rightToWindowRight);
        int size = listM5287z.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                iMo9307position95KtPRI = 0;
                break;
            }
            iMo9307position95KtPRI = ((MenuPosition.Horizontal) listM5287z.get(i8)).mo9307position95KtPRI(anchorBounds, windowSize, IntSize.m13476getWidthimpl(popupContentSize), layoutDirection);
            if (i8 == AbstractC5806u.m5282u(listM5287z) || (iMo9307position95KtPRI >= 0 && IntSize.m13476getWidthimpl(popupContentSize) + iMo9307position95KtPRI <= IntSize.m13476getWidthimpl(windowSize))) {
                break;
            }
            i8++;
        }
        List listM5287z2 = AbstractC5806u.m5287z(this.topToAnchorBottom, this.bottomToAnchorTop, this.centerToAnchorTop, IntOffset.m13434getYimpl(anchorBounds.m13457getCenternOccac()) < IntSize.m13475getHeightimpl(windowSize) / 2 ? this.topToWindowTop : this.bottomToWindowBottom);
        int size2 = listM5287z2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            int iMo9308positionJVtK1S4 = ((MenuPosition.Vertical) listM5287z2.get(i9)).mo9308positionJVtK1S4(anchorBounds, windowSize, IntSize.m13475getHeightimpl(popupContentSize));
            if (i9 == AbstractC5806u.m5282u(listM5287z2) || (iMo9308positionJVtK1S4 >= this.verticalMargin && IntSize.m13475getHeightimpl(popupContentSize) + iMo9308positionJVtK1S4 <= IntSize.m13475getHeightimpl(windowSize) - this.verticalMargin)) {
                i = iMo9308positionJVtK1S4;
                break;
            }
        }
        long jIntOffset = IntOffsetKt.IntOffset(iMo9307position95KtPRI, i);
        this.onPositionCalculated.invoke(anchorBounds, IntRectKt.m13466IntRectVbeCjmY(jIntOffset, popupContentSize));
        return jIntOffset;
    }

    /* renamed from: component1-RKDOV3M, reason: not valid java name and from getter */
    public final long getContentOffset() {
        return this.contentOffset;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    /* renamed from: component3, reason: from getter */
    public final int getVerticalMargin() {
        return this.verticalMargin;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final InterfaceC6473e getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    @NotNull
    /* renamed from: copy-uVxBXkw, reason: not valid java name */
    public final DropdownMenuPositionProvider m9317copyuVxBXkw(long contentOffset, @NotNull Density density, int verticalMargin, @NotNull InterfaceC6473e onPositionCalculated) {
        return new DropdownMenuPositionProvider(contentOffset, density, verticalMargin, onPositionCalculated, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DropdownMenuPositionProvider)) {
            return false;
        }
        DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) other;
        return DpOffset.m13365equalsimpl0(this.contentOffset, dropdownMenuPositionProvider.contentOffset) && AbstractC5830k.m5325b(this.density, dropdownMenuPositionProvider.density) && this.verticalMargin == dropdownMenuPositionProvider.verticalMargin && AbstractC5830k.m5325b(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated);
    }

    /* renamed from: getContentOffset-RKDOV3M, reason: not valid java name */
    public final long m9318getContentOffsetRKDOV3M() {
        return this.contentOffset;
    }

    @NotNull
    public final Density getDensity() {
        return this.density;
    }

    @NotNull
    public final InterfaceC6473e getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    public final int getVerticalMargin() {
        return this.verticalMargin;
    }

    public int hashCode() {
        return this.onPositionCalculated.hashCode() + AbstractC0584a.m902c(this.verticalMargin, (this.density.hashCode() + (DpOffset.m13370hashCodeimpl(this.contentOffset) * 31)) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) DpOffset.m13373toStringimpl(this.contentOffset)) + ", density=" + this.density + ", verticalMargin=" + this.verticalMargin + ", onPositionCalculated=" + this.onPositionCalculated + ')';
    }

    private DropdownMenuPositionProvider(long j7, Density density, int i, InterfaceC6473e interfaceC6473e) {
        this.contentOffset = j7;
        this.density = density;
        this.verticalMargin = i;
        this.onPositionCalculated = interfaceC6473e;
        int iMo6897roundToPx0680j_4 = density.mo6897roundToPx0680j_4(DpOffset.m13366getXD9Ej5fM(j7));
        MenuPosition menuPosition = MenuPosition.INSTANCE;
        this.startToAnchorStart = menuPosition.startToAnchorStart(iMo6897roundToPx0680j_4);
        this.endToAnchorEnd = menuPosition.endToAnchorEnd(iMo6897roundToPx0680j_4);
        this.leftToWindowLeft = menuPosition.leftToWindowLeft(0);
        this.rightToWindowRight = menuPosition.rightToWindowRight(0);
        int iMo6897roundToPx0680j_42 = density.mo6897roundToPx0680j_4(DpOffset.m13368getYD9Ej5fM(j7));
        this.topToAnchorBottom = menuPosition.topToAnchorBottom(iMo6897roundToPx0680j_42);
        this.bottomToAnchorTop = menuPosition.bottomToAnchorTop(iMo6897roundToPx0680j_42);
        this.centerToAnchorTop = menuPosition.centerToAnchorTop(iMo6897roundToPx0680j_42);
        this.topToWindowTop = menuPosition.topToWindowTop(i);
        this.bottomToWindowBottom = menuPosition.bottomToWindowBottom(i);
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j7, Density density, int i, InterfaceC6473e interfaceC6473e, int i8, AbstractC5824e abstractC5824e) {
        this(j7, density, (i8 & 4) != 0 ? density.mo6897roundToPx0680j_4(MenuKt.getMenuVerticalMargin()) : i, (i8 & 8) != 0 ? new InterfaceC6473e() { // from class: androidx.compose.material3.internal.DropdownMenuPositionProvider.2
            public final void invoke(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
            }

            @Override // p152r6.InterfaceC6473e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((IntRect) obj, (IntRect) obj2);
                return C5443s.f8405a;
            }
        } : interfaceC6473e, null);
    }
}
