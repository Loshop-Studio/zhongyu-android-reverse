package androidx.compose.p011ui.layout;

import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.internal.InlineClassHelperKt;
import androidx.compose.p011ui.unit.DpRect;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\f\u001a\u00020\t*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t*\u00020\rH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b*\u00020\rH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\b*\u00020\u0013H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0012\u001a\u00020\b*\u00020\tH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u0018*\u00020\u0017H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u0013*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0015J\u0017\u0010\u001d\u001a\u00020\u0013*\u00020\rH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0011J\u0014\u0010!\u001a\u00020 *\u00020\u001fH\u0097\u0001¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u0017*\u00020\u0018H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010\u001aJ\u0017\u0010'\u001a\u00020\r*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u001a\u0010'\u001a\u00020\r*\u00020\u0013H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010&J\u001a\u0010'\u001a\u00020\r*\u00020\tH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)Jg\u00107\u001a\u0002062\u0006\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\t2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\t0,2\u0019\u00103\u001a\u0015\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u000201\u0018\u00010/¢\u0006\u0002\b22\u0017\u00105\u001a\u0013\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u0002010/¢\u0006\u0002\b2H\u0016¢\u0006\u0004\b7\u00108R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\u00138\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\u00138\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b?\u0010=R\u0014\u0010B\u001a\u00020A8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bB\u0010C\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006D"}, m5110d2 = {"Landroidx/compose/ui/layout/IntrinsicsMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "intrinsicMeasureScope", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "<init>", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/unit/Dp;", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "(J)F", "toDp", "", "toDp-u2uoSUM", "(F)F", "(I)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "toSize-XkaWNTQ", "toSize", "toSp-0xMU5do", "(F)J", "toSp", "toSp-kPz2Gy4", "(I)J", "width", "height", "", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "rulers", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placementBlock", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "(IILjava/util/Map;Lr6/c;Lr6/c;)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "getDensity", "()F", "density", "getFontScale", "fontScale", "", "isLookingAhead", "()Z", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/IntrinsicsMeasureScope\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,415:1\n105#2:416\n105#2:417\n361#3:418\n362#3,2:422\n365#3:425\n56#4,3:419\n60#4:424\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/IntrinsicsMeasureScope\n*L\n359#1:416\n360#1:417\n361#1:418\n361#1:422,2\n361#1:425\n361#1:419,3\n361#1:424\n*E\n"})
/* loaded from: classes2.dex */
public final class IntrinsicsMeasureScope implements MeasureScope, IntrinsicMeasureScope {
    public static final int $stable = 0;
    private final /* synthetic */ IntrinsicMeasureScope $$delegate_0;

    @NotNull
    private final LayoutDirection layoutDirection;

    public IntrinsicsMeasureScope(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
        this.$$delegate_0 = intrinsicMeasureScope;
    }

    @Override // androidx.compose.p011ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.p011ui.unit.FontScaling
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    @Override // androidx.compose.p011ui.layout.IntrinsicMeasureScope
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // androidx.compose.p011ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return this.$$delegate_0.isLookingAhead();
    }

    @Override // androidx.compose.p011ui.layout.MeasureScope
    @NotNull
    public MeasureResult layout(final int width, final int height, @NotNull final Map<AlignmentLine, Integer> alignmentLines, @Nullable final InterfaceC6471c rulers, @NotNull InterfaceC6471c placementBlock) {
        boolean z8 = false;
        if (width < 0) {
            width = 0;
        }
        if (height < 0) {
            height = 0;
        }
        if ((width & ViewCompat.MEASURED_STATE_MASK) == 0 && ((-16777216) & height) == 0) {
            z8 = true;
        }
        if (!z8) {
            InlineClassHelperKt.throwIllegalStateException("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult() { // from class: androidx.compose.ui.layout.IntrinsicsMeasureScope.layout.1
            @Override // androidx.compose.p011ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return alignmentLines;
            }

            @Override // androidx.compose.p011ui.layout.MeasureResult
            /* renamed from: getHeight, reason: from getter */
            public int getF906$h() {
                return height;
            }

            @Override // androidx.compose.p011ui.layout.MeasureResult
            /* renamed from: getRulers, reason: from getter */
            public InterfaceC6471c get$rulers() {
                return rulers;
            }

            @Override // androidx.compose.p011ui.layout.MeasureResult
            /* renamed from: getWidth, reason: from getter */
            public int getF907$w() {
                return width;
            }

            @Override // androidx.compose.p011ui.layout.MeasureResult
            public void placeChildren() {
            }
        };
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo6896roundToPxR2X_6o(long j7) {
        return this.$$delegate_0.mo6896roundToPxR2X_6o(j7);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo6897roundToPx0680j_4(float f) {
        return this.$$delegate_0.mo6897roundToPx0680j_4(f);
    }

    @Override // androidx.compose.p011ui.unit.FontScaling
    @Stable
    /* renamed from: toDp-GaN1DYA */
    public float mo6898toDpGaN1DYA(long j7) {
        return this.$$delegate_0.mo6898toDpGaN1DYA(j7);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo6899toDpu2uoSUM(float f) {
        return this.$$delegate_0.mo6899toDpu2uoSUM(f);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    public long mo6901toDpSizekrfVVM(long j7) {
        return this.$$delegate_0.mo6901toDpSizekrfVVM(j7);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo6902toPxR2X_6o(long j7) {
        return this.$$delegate_0.mo6902toPxR2X_6o(j7);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo6903toPx0680j_4(float f) {
        return this.$$delegate_0.mo6903toPx0680j_4(f);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    @NotNull
    public Rect toRect(@NotNull DpRect dpRect) {
        return this.$$delegate_0.toRect(dpRect);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    public long mo6904toSizeXkaWNTQ(long j7) {
        return this.$$delegate_0.mo6904toSizeXkaWNTQ(j7);
    }

    @Override // androidx.compose.p011ui.unit.FontScaling
    @Stable
    /* renamed from: toSp-0xMU5do */
    public long mo6905toSp0xMU5do(float f) {
        return this.$$delegate_0.mo6905toSp0xMU5do(f);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo6906toSpkPz2Gy4(float f) {
        return this.$$delegate_0.mo6906toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo6900toDpu2uoSUM(int i) {
        return this.$$delegate_0.mo6900toDpu2uoSUM(i);
    }

    @Override // androidx.compose.p011ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo6907toSpkPz2Gy4(int i) {
        return this.$$delegate_0.mo6907toSpkPz2Gy4(i);
    }
}
