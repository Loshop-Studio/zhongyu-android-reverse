package androidx.compose.material3;

import androidx.autofill.HintConstants;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Stable
@Metadata(m13557d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u00128\b\u0002\u0010\n\u001a2\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0002\u0010\u0011J2\u0010%\u001a\u00020&2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020(H\u0016ø\u0001\u0000¢\u0006\u0004\b,\u0010-R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000RA\u0010\n\u001a2\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006."}, m13558d2 = {"Landroidx/compose/material3/ExposedDropdownMenuPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "density", "Landroidx/compose/ui/unit/Density;", "topWindowInsets", "", "keyboardSignalState", "Landroidx/compose/runtime/State;", "", "verticalMargin", "onPositionCalculated", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntRect;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "anchorBounds", "menuBounds", "(Landroidx/compose/ui/unit/Density;ILandroidx/compose/runtime/State;ILkotlin/jvm/functions/Function2;)V", "bottomToAnchorTop", "Landroidx/compose/material3/internal/MenuPosition$Vertical;", "bottomToWindowBottom", "getDensity", "()Landroidx/compose/ui/unit/Density;", "endToAnchorEnd", "Landroidx/compose/material3/internal/MenuPosition$Horizontal;", "getKeyboardSignalState", "()Landroidx/compose/runtime/State;", "leftToWindowLeft", "getOnPositionCalculated", "()Lkotlin/jvm/functions/Function2;", "rightToWindowRight", "startToAnchorStart", "topToAnchorBottom", "topToWindowTop", "getTopWindowInsets", "()I", "getVerticalMargin", "calculatePosition", "Landroidx/compose/ui/unit/IntOffset;", "windowSize", "Landroidx/compose/ui/unit/IntSize;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "popupContentSize", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "material3_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenuPositionProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1490:1\n1#2:1491\n*E\n"})
/* loaded from: classes2.dex */
public final class ExposedDropdownMenuPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final MenuPosition.Vertical bottomToAnchorTop;
    private final MenuPosition.Vertical bottomToWindowBottom;
    private final Density density;
    private final MenuPosition.Horizontal endToAnchorEnd;
    private final State<Unit> keyboardSignalState;
    private final MenuPosition.Horizontal leftToWindowLeft;
    private final Function2<IntRect, IntRect, Unit> onPositionCalculated;
    private final MenuPosition.Horizontal rightToWindowRight;
    private final MenuPosition.Horizontal startToAnchorStart;
    private final MenuPosition.Vertical topToAnchorBottom;
    private final MenuPosition.Vertical topToWindowTop;
    private final int topWindowInsets;
    private final int verticalMargin;

    /* JADX WARN: Multi-variable type inference failed */
    public ExposedDropdownMenuPositionProvider(Density density, int i10, State<Unit> state, int i11, Function2<? super IntRect, ? super IntRect, Unit> function2) {
        this.density = density;
        this.topWindowInsets = i10;
        this.keyboardSignalState = state;
        this.verticalMargin = i11;
        this.onPositionCalculated = function2;
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
    public long mo17301calculatePositionllwVHH4(IntRect anchorBounds, long windowSize, LayoutDirection layoutDirection, long popupContentSize) {
        int iMo19627position95KtPRI;
        State<Unit> state = this.keyboardSignalState;
        if (state != null) {
            state.getValue();
        }
        long jIntSize = IntSizeKt.IntSize(IntSize.m23732getWidthimpl(windowSize), IntSize.m23731getHeightimpl(windowSize) + this.topWindowInsets);
        int i10 = 0;
        List listListOf = CollectionsKt.listOf((Object[]) new MenuPosition.Horizontal[]{this.startToAnchorStart, this.endToAnchorEnd, IntOffset.m23689getXimpl(anchorBounds.m23713getCenternOccac()) < IntSize.m23732getWidthimpl(jIntSize) / 2 ? this.leftToWindowLeft : this.rightToWindowRight});
        int size = listListOf.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                iMo19627position95KtPRI = 0;
                break;
            }
            iMo19627position95KtPRI = ((MenuPosition.Horizontal) listListOf.get(i11)).mo19627position95KtPRI(anchorBounds, jIntSize, IntSize.m23732getWidthimpl(popupContentSize), layoutDirection);
            if (i11 == CollectionsKt.getLastIndex(listListOf) || (iMo19627position95KtPRI >= 0 && IntSize.m23732getWidthimpl(popupContentSize) + iMo19627position95KtPRI <= IntSize.m23732getWidthimpl(jIntSize))) {
                break;
            }
            i11++;
        }
        List listListOf2 = CollectionsKt.listOf((Object[]) new MenuPosition.Vertical[]{this.topToAnchorBottom, this.bottomToAnchorTop, IntOffset.m23690getYimpl(anchorBounds.m23713getCenternOccac()) < IntSize.m23731getHeightimpl(jIntSize) / 2 ? this.topToWindowTop : this.bottomToWindowBottom});
        int size2 = listListOf2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            int iMo19628positionJVtK1S4 = ((MenuPosition.Vertical) listListOf2.get(i12)).mo19628positionJVtK1S4(anchorBounds, jIntSize, IntSize.m23731getHeightimpl(popupContentSize));
            if (i12 == CollectionsKt.getLastIndex(listListOf2) || (iMo19628positionJVtK1S4 >= 0 && IntSize.m23731getHeightimpl(popupContentSize) + iMo19628positionJVtK1S4 <= IntSize.m23731getHeightimpl(jIntSize))) {
                i10 = iMo19628positionJVtK1S4;
                break;
            }
        }
        long jIntOffset = IntOffsetKt.IntOffset(iMo19627position95KtPRI, i10);
        this.onPositionCalculated.invoke(anchorBounds, IntRectKt.m23722IntRectVbeCjmY(jIntOffset, popupContentSize));
        return jIntOffset;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final State<Unit> getKeyboardSignalState() {
        return this.keyboardSignalState;
    }

    public final Function2<IntRect, IntRect, Unit> getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    public final int getTopWindowInsets() {
        return this.topWindowInsets;
    }

    public final int getVerticalMargin() {
        return this.verticalMargin;
    }

    public /* synthetic */ ExposedDropdownMenuPositionProvider(Density density, int i10, State state, int i11, Function2 function2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(density, i10, (i12 & 4) != 0 ? null : state, (i12 & 8) != 0 ? density.mo17326roundToPx0680j_4(MenuKt.getMenuVerticalMargin()) : i11, (i12 & 16) != 0 ? new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuPositionProvider.2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(IntRect intRect, IntRect intRect2) {
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                invoke2(intRect, intRect2);
                return Unit.INSTANCE;
            }
        } : function2);
    }
}
