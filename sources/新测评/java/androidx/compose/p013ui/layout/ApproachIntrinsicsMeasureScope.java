package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.unit.DpRect;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J`\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001c0\u001f2\u0019\u0010!\u001a\u0015\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0018\u00010\"¢\u0006\u0002\b%2\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020$0\"¢\u0006\u0002\b%H\u0016J\u0017\u0010(\u001a\u00020\u001c*\u00020)H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u0017\u0010(\u001a\u00020\u001c*\u00020,H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020)*\u00020,H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u001a\u0010/\u001a\u00020)*\u00020\bH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u001a\u0010/\u001a\u00020)*\u00020\u001cH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u00104J\u0017\u00105\u001a\u000206*\u000207H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\b*\u00020)H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b;\u00103J\u0017\u0010:\u001a\u00020\b*\u00020,H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b<\u00101J\r\u0010=\u001a\u00020>*\u00020?H\u0097\u0001J\u0017\u0010@\u001a\u000207*\u000206H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bA\u00109J\u0017\u0010B\u001a\u00020,*\u00020)H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010DJ\u001a\u0010B\u001a\u00020,*\u00020\bH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bE\u0010DJ\u001a\u0010B\u001a\u00020,*\u00020\u001cH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bE\u0010FR\u0014\u0010\u0007\u001a\u00020\b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u00020\u0013X\u0096\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u00020\u0017X\u0096\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006G"}, m13558d2 = {"Landroidx/compose/ui/layout/ApproachIntrinsicsMeasureScope;", "Landroidx/compose/ui/layout/ApproachMeasureScope;", "Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;", "intrinsicMeasureScope", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Landroidx/compose/ui/layout/ApproachIntrinsicMeasureScope;Landroidx/compose/ui/unit/LayoutDirection;)V", "density", "", "getDensity", "()F", "fontScale", "getFontScale", "isLookingAhead", "", "()Z", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "lookaheadConstraints", "Landroidx/compose/ui/unit/Constraints;", "getLookaheadConstraints-msEJaDk", "()J", "lookaheadSize", "Landroidx/compose/ui/unit/IntSize;", "getLookaheadSize-YbymL2g", "layout", "Landroidx/compose/ui/layout/MeasureResult;", "width", "", "height", "alignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "rulers", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "", "Lkotlin/ExtensionFunctionType;", "placementBlock", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "roundToPx", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-GaN1DYA", "(J)F", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/ApproachIntrinsicsMeasureScope\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,415:1\n105#2:416\n105#2:417\n361#3:418\n362#3,2:422\n365#3:425\n56#4,3:419\n60#4:424\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/ApproachIntrinsicsMeasureScope\n*L\n393#1:416\n394#1:417\n395#1:418\n395#1:422,2\n395#1:425\n395#1:419,3\n395#1:424\n*E\n"})
/* loaded from: classes2.dex */
public final class ApproachIntrinsicsMeasureScope implements ApproachMeasureScope, ApproachIntrinsicMeasureScope {
    public static final int $stable = 0;
    private final /* synthetic */ ApproachIntrinsicMeasureScope $$delegate_0;
    private final LayoutDirection layoutDirection;

    public ApproachIntrinsicsMeasureScope(ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
        this.$$delegate_0 = approachIntrinsicMeasureScope;
    }

    @Override // androidx.compose.p013ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.p013ui.unit.FontScaling
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    @Override // androidx.compose.p013ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // androidx.compose.p013ui.layout.ApproachIntrinsicMeasureScope
    /* renamed from: getLookaheadConstraints-msEJaDk */
    public long mo22300getLookaheadConstraintsmsEJaDk() {
        return this.$$delegate_0.mo22300getLookaheadConstraintsmsEJaDk();
    }

    @Override // androidx.compose.p013ui.layout.ApproachIntrinsicMeasureScope
    /* renamed from: getLookaheadSize-YbymL2g */
    public long mo22301getLookaheadSizeYbymL2g() {
        return this.$$delegate_0.mo22301getLookaheadSizeYbymL2g();
    }

    @Override // androidx.compose.p013ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return this.$$delegate_0.isLookingAhead();
    }

    @Override // androidx.compose.p013ui.layout.MeasureScope
    public MeasureResult layout(final int width, final int height, final Map<AlignmentLine, Integer> alignmentLines, final Function1<? super RulerScope, Unit> rulers, Function1<? super Placeable.PlacementScope, Unit> placementBlock) {
        boolean z9 = false;
        if (width < 0) {
            width = 0;
        }
        if (height < 0) {
            height = 0;
        }
        if ((width & ViewCompat.MEASURED_STATE_MASK) == 0 && ((-16777216) & height) == 0) {
            z9 = true;
        }
        if (!z9) {
            InlineClassHelperKt.throwIllegalStateException("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult() { // from class: androidx.compose.ui.layout.ApproachIntrinsicsMeasureScope.layout.1
            @Override // androidx.compose.p013ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return alignmentLines;
            }

            @Override // androidx.compose.p013ui.layout.MeasureResult
            /* renamed from: getHeight, reason: from getter */
            public int getF1431$h() {
                return height;
            }

            @Override // androidx.compose.p013ui.layout.MeasureResult
            public Function1<RulerScope, Unit> getRulers() {
                return rulers;
            }

            @Override // androidx.compose.p013ui.layout.MeasureResult
            /* renamed from: getWidth, reason: from getter */
            public int getF1432$w() {
                return width;
            }

            @Override // androidx.compose.p013ui.layout.MeasureResult
            public void placeChildren() {
            }
        };
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo17325roundToPxR2X_6o(long j10) {
        return this.$$delegate_0.mo17325roundToPxR2X_6o(j10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo17326roundToPx0680j_4(float f10) {
        return this.$$delegate_0.mo17326roundToPx0680j_4(f10);
    }

    @Override // androidx.compose.p013ui.unit.FontScaling
    @Stable
    /* renamed from: toDp-GaN1DYA */
    public float mo17327toDpGaN1DYA(long j10) {
        return this.$$delegate_0.mo17327toDpGaN1DYA(j10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo17328toDpu2uoSUM(float f10) {
        return this.$$delegate_0.mo17328toDpu2uoSUM(f10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    public long mo17330toDpSizekrfVVM(long j10) {
        return this.$$delegate_0.mo17330toDpSizekrfVVM(j10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo17331toPxR2X_6o(long j10) {
        return this.$$delegate_0.mo17331toPxR2X_6o(j10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo17332toPx0680j_4(float f10) {
        return this.$$delegate_0.mo17332toPx0680j_4(f10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    public Rect toRect(DpRect dpRect) {
        return this.$$delegate_0.toRect(dpRect);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    public long mo17333toSizeXkaWNTQ(long j10) {
        return this.$$delegate_0.mo17333toSizeXkaWNTQ(j10);
    }

    @Override // androidx.compose.p013ui.unit.FontScaling
    @Stable
    /* renamed from: toSp-0xMU5do */
    public long mo17334toSp0xMU5do(float f10) {
        return this.$$delegate_0.mo17334toSp0xMU5do(f10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo17335toSpkPz2Gy4(float f10) {
        return this.$$delegate_0.mo17335toSpkPz2Gy4(f10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo17329toDpu2uoSUM(int i10) {
        return this.$$delegate_0.mo17329toDpu2uoSUM(i10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo17336toSpkPz2Gy4(int i10) {
        return this.$$delegate_0.mo17336toSpkPz2Gy4(i10);
    }
}
