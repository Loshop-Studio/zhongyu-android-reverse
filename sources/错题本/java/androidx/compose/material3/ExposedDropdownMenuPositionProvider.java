package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.compose.material3.internal.MenuPosition;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntOffsetKt;
import androidx.compose.p011ui.unit.IntRect;
import androidx.compose.p011ui.unit.IntRectKt;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.IntSizeKt;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.p011ui.window.PopupPositionProvider;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6473e;

@Stable
@Metadata(m5109d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u00128\b\u0002\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0004\b\u0011\u0010\u0012J2\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b%\u0010!RG\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00070\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010-\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u0014\u0010.\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010+R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00101R\u0014\u00103\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101R\u0014\u00104\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00101\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065"}, m5110d2 = {"Landroidx/compose/material3/ExposedDropdownMenuPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "Landroidx/compose/ui/unit/Density;", "density", "", "topWindowInsets", "Landroidx/compose/runtime/State;", "Ld6/s;", "keyboardSignalState", "verticalMargin", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntRect;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "anchorBounds", "menuBounds", "onPositionCalculated", "<init>", "(Landroidx/compose/ui/unit/Density;ILandroidx/compose/runtime/State;ILr6/e;)V", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "Landroidx/compose/ui/unit/IntOffset;", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "calculatePosition", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "I", "getTopWindowInsets", "()I", "Landroidx/compose/runtime/State;", "getKeyboardSignalState", "()Landroidx/compose/runtime/State;", "getVerticalMargin", "Lr6/e;", "getOnPositionCalculated", "()Lr6/e;", "Landroidx/compose/material3/internal/MenuPosition$Horizontal;", "startToAnchorStart", "Landroidx/compose/material3/internal/MenuPosition$Horizontal;", "endToAnchorEnd", "leftToWindowLeft", "rightToWindowRight", "Landroidx/compose/material3/internal/MenuPosition$Vertical;", "topToAnchorBottom", "Landroidx/compose/material3/internal/MenuPosition$Vertical;", "bottomToAnchorTop", "topToWindowTop", "bottomToWindowBottom", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenuPositionProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1490:1\n1#2:1491\n*E\n"})
/* loaded from: classes.dex */
public final class ExposedDropdownMenuPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;

    @NotNull
    private final MenuPosition.Vertical bottomToAnchorTop;

    @NotNull
    private final MenuPosition.Vertical bottomToWindowBottom;

    @NotNull
    private final Density density;

    @NotNull
    private final MenuPosition.Horizontal endToAnchorEnd;

    @Nullable
    private final State<C5443s> keyboardSignalState;

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
    private final int topWindowInsets;
    private final int verticalMargin;

    public ExposedDropdownMenuPositionProvider(@NotNull Density density, int i, @Nullable State<C5443s> state, int i8, @NotNull InterfaceC6473e interfaceC6473e) {
        this.density = density;
        this.topWindowInsets = i;
        this.keyboardSignalState = state;
        this.verticalMargin = i8;
        this.onPositionCalculated = interfaceC6473e;
        MenuPosition menuPosition = MenuPosition.INSTANCE;
        this.startToAnchorStart = MenuPosition.startToAnchorStart$default(menuPosition, 0, 1, null);
        this.endToAnchorEnd = MenuPosition.endToAnchorEnd$default(menuPosition, 0, 1, null);
        this.leftToWindowLeft = MenuPosition.leftToWindowLeft$default(menuPosition, 0, 1, null);
        this.rightToWindowRight = MenuPosition.rightToWindowRight$default(menuPosition, 0, 1, null);
        this.topToAnchorBottom = MenuPosition.topToAnchorBottom$default(menuPosition, 0, 1, null);
        this.bottomToAnchorTop = MenuPosition.bottomToAnchorTop$default(menuPosition, 0, 1, null);
        this.topToWindowTop = menuPosition.topToWindowTop(i8);
        this.bottomToWindowBottom = menuPosition.bottomToWindowBottom(i8);
    }

    @Override // androidx.compose.p011ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo6871calculatePositionllwVHH4(@NotNull IntRect anchorBounds, long windowSize, @NotNull LayoutDirection layoutDirection, long popupContentSize) {
        int iMo9307position95KtPRI;
        State<C5443s> state = this.keyboardSignalState;
        if (state != null) {
            state.getValue();
        }
        long jIntSize = IntSizeKt.IntSize(IntSize.m13476getWidthimpl(windowSize), IntSize.m13475getHeightimpl(windowSize) + this.topWindowInsets);
        int i = 0;
        List listM5287z = AbstractC5806u.m5287z(this.startToAnchorStart, this.endToAnchorEnd, IntOffset.m13433getXimpl(anchorBounds.m13457getCenternOccac()) < IntSize.m13476getWidthimpl(jIntSize) / 2 ? this.leftToWindowLeft : this.rightToWindowRight);
        int size = listM5287z.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                iMo9307position95KtPRI = 0;
                break;
            }
            iMo9307position95KtPRI = ((MenuPosition.Horizontal) listM5287z.get(i8)).mo9307position95KtPRI(anchorBounds, jIntSize, IntSize.m13476getWidthimpl(popupContentSize), layoutDirection);
            if (i8 == AbstractC5806u.m5282u(listM5287z) || (iMo9307position95KtPRI >= 0 && IntSize.m13476getWidthimpl(popupContentSize) + iMo9307position95KtPRI <= IntSize.m13476getWidthimpl(jIntSize))) {
                break;
            }
            i8++;
        }
        List listM5287z2 = AbstractC5806u.m5287z(this.topToAnchorBottom, this.bottomToAnchorTop, IntOffset.m13434getYimpl(anchorBounds.m13457getCenternOccac()) < IntSize.m13475getHeightimpl(jIntSize) / 2 ? this.topToWindowTop : this.bottomToWindowBottom);
        int size2 = listM5287z2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            int iMo9308positionJVtK1S4 = ((MenuPosition.Vertical) listM5287z2.get(i9)).mo9308positionJVtK1S4(anchorBounds, jIntSize, IntSize.m13475getHeightimpl(popupContentSize));
            if (i9 == AbstractC5806u.m5282u(listM5287z2) || (iMo9308positionJVtK1S4 >= 0 && IntSize.m13475getHeightimpl(popupContentSize) + iMo9308positionJVtK1S4 <= IntSize.m13475getHeightimpl(jIntSize))) {
                i = iMo9308positionJVtK1S4;
                break;
            }
        }
        long jIntOffset = IntOffsetKt.IntOffset(iMo9307position95KtPRI, i);
        this.onPositionCalculated.invoke(anchorBounds, IntRectKt.m13466IntRectVbeCjmY(jIntOffset, popupContentSize));
        return jIntOffset;
    }

    @NotNull
    public final Density getDensity() {
        return this.density;
    }

    @Nullable
    public final State<C5443s> getKeyboardSignalState() {
        return this.keyboardSignalState;
    }

    @NotNull
    public final InterfaceC6473e getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    public final int getTopWindowInsets() {
        return this.topWindowInsets;
    }

    public final int getVerticalMargin() {
        return this.verticalMargin;
    }

    public /* synthetic */ ExposedDropdownMenuPositionProvider(Density density, int i, State state, int i8, InterfaceC6473e interfaceC6473e, int i9, AbstractC5824e abstractC5824e) {
        this(density, i, (i9 & 4) != 0 ? null : state, (i9 & 8) != 0 ? density.mo6897roundToPx0680j_4(MenuKt.getMenuVerticalMargin()) : i8, (i9 & 16) != 0 ? new InterfaceC6473e() { // from class: androidx.compose.material3.ExposedDropdownMenuPositionProvider.2
            public final void invoke(@NotNull IntRect intRect, @NotNull IntRect intRect2) {
            }

            @Override // p152r6.InterfaceC6473e
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((IntRect) obj, (IntRect) obj2);
                return C5443s.f8405a;
            }
        } : interfaceC6473e);
    }
}
