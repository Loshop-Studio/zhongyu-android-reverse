package androidx.compose.p006ui.draw;

import androidx.compose.p006ui.Alignment;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.geometry.Size;
import androidx.compose.p006ui.geometry.SizeKt;
import androidx.compose.p006ui.graphics.ColorFilter;
import androidx.compose.p006ui.graphics.painter.Painter;
import androidx.compose.p006ui.layout.ContentScale;
import androidx.compose.p006ui.layout.IntrinsicMeasurable;
import androidx.compose.p006ui.layout.IntrinsicMeasureScope;
import androidx.compose.p006ui.layout.Measurable;
import androidx.compose.p006ui.layout.MeasureResult;
import androidx.compose.p006ui.layout.MeasureScope;
import androidx.compose.p006ui.layout.Placeable;
import androidx.compose.p006ui.layout.ScaleFactorKt;
import androidx.compose.p006ui.node.AbstractC1453a;
import androidx.compose.p006ui.node.AbstractC1455c;
import androidx.compose.p006ui.node.DrawModifierNode;
import androidx.compose.p006ui.node.LayoutModifierNode;
import androidx.compose.p006ui.unit.Constraints;
import androidx.compose.p006ui.unit.ConstraintsKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;

@Metadata(m5174d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B?\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u001d\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/J\u001d\u00100\u001a\u0002012\u0006\u00102\u001a\u000201H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u0010/J\b\u00104\u001a\u000205H\u0016J\f\u00106\u001a\u000207*\u000208H\u0016J\u0019\u00109\u001a\u00020\u0007*\u00020,H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u0010;J\u0019\u0010<\u001a\u00020\u0007*\u00020,H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b=\u0010;J\u001c\u0010>\u001a\u00020?*\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020?H\u0016J\u001c\u0010D\u001a\u00020?*\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010E\u001a\u00020?H\u0016J)\u0010F\u001a\u00020G*\u00020H2\u0006\u0010A\u001a\u00020I2\u0006\u00102\u001a\u000201H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bJ\u0010KJ\u001c\u0010L\u001a\u00020?*\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020?H\u0016J\u001c\u0010M\u001a\u00020?*\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010E\u001a\u00020?H\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006N"}, m5175d2 = {"Landroidx/compose/ui/draw/PainterModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "sizeToIntrinsics", "", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "(Landroidx/compose/ui/graphics/painter/Painter;ZLandroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;)V", "getAlignment", "()Landroidx/compose/ui/Alignment;", "setAlignment", "(Landroidx/compose/ui/Alignment;)V", "getAlpha", "()F", "setAlpha", "(F)V", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "setContentScale", "(Landroidx/compose/ui/layout/ContentScale;)V", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "setPainter", "(Landroidx/compose/ui/graphics/painter/Painter;)V", "getSizeToIntrinsics", "()Z", "setSizeToIntrinsics", "(Z)V", "useIntrinsicSize", "getUseIntrinsicSize", "calculateScaledSize", "Landroidx/compose/ui/geometry/Size;", "dstSize", "calculateScaledSize-E7KxVPU", "(J)J", "modifyConstraints", "Landroidx/compose/ui/unit/Constraints;", "constraints", "modifyConstraints-ZezNO4M", "toString", "", "draw", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "hasSpecifiedAndFiniteHeight", "hasSpecifiedAndFiniteHeight-uvyYCjk", "(J)Z", "hasSpecifiedAndFiniteWidth", "hasSpecifiedAndFiniteWidth-uvyYCjk", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPainterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PainterModifier.kt\nandroidx/compose/ui/draw/PainterModifierNode\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,366:1\n152#2:367\n120#3,4:368\n*S KotlinDebug\n*F\n+ 1 PainterModifier.kt\nandroidx/compose/ui/draw/PainterModifierNode\n*L\n170#1:367\n345#1:368,4\n*E\n"})
/* renamed from: androidx.compose.ui.draw.PainterModifierNode, reason: from toString */
/* loaded from: classes.dex */
final class PainterModifier extends Modifier.Node implements LayoutModifierNode, DrawModifierNode {
    private Alignment alignment;
    private float alpha;
    private ColorFilter colorFilter;
    private ContentScale contentScale;
    private Painter painter;
    private boolean sizeToIntrinsics;

    public /* synthetic */ PainterModifier(Painter painter, boolean z3, Alignment alignment, ContentScale contentScale, float f4, ColorFilter colorFilter, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(painter, z3, (i4 & 4) != 0 ? Alignment.INSTANCE.getCenter() : alignment, (i4 & 8) != 0 ? ContentScale.INSTANCE.getInside() : contentScale, (i4 & 16) != 0 ? 1.0f : f4, (i4 & 32) != 0 ? null : colorFilter);
    }

    /* renamed from: calculateScaledSize-E7KxVPU, reason: not valid java name */
    private final long m8858calculateScaledSizeE7KxVPU(long dstSize) {
        if (!getUseIntrinsicSize()) {
            return dstSize;
        }
        long jSize = SizeKt.Size(!m8860hasSpecifiedAndFiniteWidthuvyYCjk(this.painter.getIntrinsicSize()) ? Size.m9014getWidthimpl(dstSize) : Size.m9014getWidthimpl(this.painter.getIntrinsicSize()), !m8859hasSpecifiedAndFiniteHeightuvyYCjk(this.painter.getIntrinsicSize()) ? Size.m9011getHeightimpl(dstSize) : Size.m9011getHeightimpl(this.painter.getIntrinsicSize()));
        if (!(Size.m9014getWidthimpl(dstSize) == 0.0f)) {
            if (!(Size.m9011getHeightimpl(dstSize) == 0.0f)) {
                return ScaleFactorKt.m10654timesUQTWf7w(jSize, this.contentScale.mo10576computeScaleFactorH7hwNQA(jSize, dstSize));
            }
        }
        return Size.INSTANCE.m9023getZeroNHjbRc();
    }

    private final boolean getUseIntrinsicSize() {
        if (this.sizeToIntrinsics) {
            return (this.painter.getIntrinsicSize() > Size.INSTANCE.m9022getUnspecifiedNHjbRc() ? 1 : (this.painter.getIntrinsicSize() == Size.INSTANCE.m9022getUnspecifiedNHjbRc() ? 0 : -1)) != 0;
        }
        return false;
    }

    /* renamed from: hasSpecifiedAndFiniteHeight-uvyYCjk, reason: not valid java name */
    private final boolean m8859hasSpecifiedAndFiniteHeightuvyYCjk(long j4) {
        if (Size.m9010equalsimpl0(j4, Size.INSTANCE.m9022getUnspecifiedNHjbRc())) {
            return false;
        }
        float fM9011getHeightimpl = Size.m9011getHeightimpl(j4);
        return !Float.isInfinite(fM9011getHeightimpl) && !Float.isNaN(fM9011getHeightimpl);
    }

    /* renamed from: hasSpecifiedAndFiniteWidth-uvyYCjk, reason: not valid java name */
    private final boolean m8860hasSpecifiedAndFiniteWidthuvyYCjk(long j4) {
        if (Size.m9010equalsimpl0(j4, Size.INSTANCE.m9022getUnspecifiedNHjbRc())) {
            return false;
        }
        float fM9014getWidthimpl = Size.m9014getWidthimpl(j4);
        return !Float.isInfinite(fM9014getWidthimpl) && !Float.isNaN(fM9014getWidthimpl);
    }

    /* renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    private final long m8861modifyConstraintsZezNO4M(long constraints) {
        boolean z3 = Constraints.m11489getHasBoundedWidthimpl(constraints) && Constraints.m11488getHasBoundedHeightimpl(constraints);
        boolean z4 = Constraints.m11491getHasFixedWidthimpl(constraints) && Constraints.m11490getHasFixedHeightimpl(constraints);
        if ((!getUseIntrinsicSize() && z3) || z4) {
            return Constraints.m11484copyZbe2FdA$default(constraints, Constraints.m11493getMaxWidthimpl(constraints), 0, Constraints.m11492getMaxHeightimpl(constraints), 0, 10, null);
        }
        long jMo9707getIntrinsicSizeNHjbRc = this.painter.getIntrinsicSize();
        long jM8858calculateScaledSizeE7KxVPU = m8858calculateScaledSizeE7KxVPU(SizeKt.Size(ConstraintsKt.m11507constrainWidthK40F9xA(constraints, m8860hasSpecifiedAndFiniteWidthuvyYCjk(jMo9707getIntrinsicSizeNHjbRc) ? MathKt__MathJVMKt.roundToInt(Size.m9014getWidthimpl(jMo9707getIntrinsicSizeNHjbRc)) : Constraints.m11495getMinWidthimpl(constraints)), ConstraintsKt.m11506constrainHeightK40F9xA(constraints, m8859hasSpecifiedAndFiniteHeightuvyYCjk(jMo9707getIntrinsicSizeNHjbRc) ? MathKt__MathJVMKt.roundToInt(Size.m9011getHeightimpl(jMo9707getIntrinsicSizeNHjbRc)) : Constraints.m11494getMinHeightimpl(constraints))));
        return Constraints.m11484copyZbe2FdA$default(constraints, ConstraintsKt.m11507constrainWidthK40F9xA(constraints, MathKt__MathJVMKt.roundToInt(Size.m9014getWidthimpl(jM8858calculateScaledSizeE7KxVPU))), 0, ConstraintsKt.m11506constrainHeightK40F9xA(constraints, MathKt__MathJVMKt.roundToInt(Size.m9011getHeightimpl(jM8858calculateScaledSizeE7KxVPU))), 0, 10, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    @Override // androidx.compose.p006ui.node.DrawModifierNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(androidx.compose.p006ui.graphics.drawscope.ContentDrawScope r13) {
        /*
            r12 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            androidx.compose.ui.graphics.painter.Painter r0 = r12.painter
            long r0 = r0.getIntrinsicSize()
            boolean r2 = r12.m8860hasSpecifiedAndFiniteWidthuvyYCjk(r0)
            if (r2 == 0) goto L16
            float r2 = androidx.compose.p006ui.geometry.Size.m9014getWidthimpl(r0)
            goto L1e
        L16:
            long r2 = r13.mo9614getSizeNHjbRc()
            float r2 = androidx.compose.p006ui.geometry.Size.m9014getWidthimpl(r2)
        L1e:
            boolean r3 = r12.m8859hasSpecifiedAndFiniteHeightuvyYCjk(r0)
            if (r3 == 0) goto L29
            float r0 = androidx.compose.p006ui.geometry.Size.m9011getHeightimpl(r0)
            goto L31
        L29:
            long r0 = r13.mo9614getSizeNHjbRc()
            float r0 = androidx.compose.p006ui.geometry.Size.m9011getHeightimpl(r0)
        L31:
            long r0 = androidx.compose.p006ui.geometry.SizeKt.Size(r2, r0)
            long r2 = r13.mo9614getSizeNHjbRc()
            float r2 = androidx.compose.p006ui.geometry.Size.m9014getWidthimpl(r2)
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r4 = 1
            r5 = 0
            if (r2 != 0) goto L46
            r2 = r4
            goto L47
        L46:
            r2 = r5
        L47:
            if (r2 != 0) goto L68
            long r6 = r13.mo9614getSizeNHjbRc()
            float r2 = androidx.compose.p006ui.geometry.Size.m9011getHeightimpl(r6)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L56
            goto L57
        L56:
            r4 = r5
        L57:
            if (r4 != 0) goto L68
            androidx.compose.ui.layout.ContentScale r2 = r12.contentScale
            long r3 = r13.mo9614getSizeNHjbRc()
            long r2 = r2.mo10576computeScaleFactorH7hwNQA(r0, r3)
            long r0 = androidx.compose.p006ui.layout.ScaleFactorKt.m10654timesUQTWf7w(r0, r2)
            goto L6e
        L68:
            androidx.compose.ui.geometry.Size$Companion r0 = androidx.compose.p006ui.geometry.Size.INSTANCE
            long r0 = r0.m9023getZeroNHjbRc()
        L6e:
            r4 = r0
            androidx.compose.ui.Alignment r6 = r12.alignment
            float r0 = androidx.compose.p006ui.geometry.Size.m9014getWidthimpl(r4)
            int r0 = kotlin.math.MathKt.roundToInt(r0)
            float r1 = androidx.compose.p006ui.geometry.Size.m9011getHeightimpl(r4)
            int r1 = kotlin.math.MathKt.roundToInt(r1)
            long r7 = androidx.compose.p006ui.unit.IntSizeKt.IntSize(r0, r1)
            long r0 = r13.mo9614getSizeNHjbRc()
            float r0 = androidx.compose.p006ui.geometry.Size.m9014getWidthimpl(r0)
            int r0 = kotlin.math.MathKt.roundToInt(r0)
            long r1 = r13.mo9614getSizeNHjbRc()
            float r1 = androidx.compose.p006ui.geometry.Size.m9011getHeightimpl(r1)
            int r1 = kotlin.math.MathKt.roundToInt(r1)
            long r9 = androidx.compose.p006ui.unit.IntSizeKt.IntSize(r0, r1)
            androidx.compose.ui.unit.LayoutDirection r11 = r13.getLayoutDirection()
            long r0 = r6.mo8841alignKFBX0sM(r7, r9, r11)
            int r2 = androidx.compose.p006ui.unit.IntOffset.m11643getXimpl(r0)
            float r8 = (float) r2
            int r0 = androidx.compose.p006ui.unit.IntOffset.m11644getYimpl(r0)
            float r0 = (float) r0
            androidx.compose.ui.graphics.drawscope.DrawContext r1 = r13.getDrawContext()
            androidx.compose.ui.graphics.drawscope.DrawTransform r1 = r1.getTransform()
            r1.translate(r8, r0)
            androidx.compose.ui.graphics.painter.Painter r2 = r12.painter
            float r6 = r12.alpha
            androidx.compose.ui.graphics.ColorFilter r7 = r12.colorFilter
            r3 = r13
            r2.m9713drawx_KDEd0(r3, r4, r6, r7)
            androidx.compose.ui.graphics.drawscope.DrawContext r1 = r13.getDrawContext()
            androidx.compose.ui.graphics.drawscope.DrawTransform r1 = r1.getTransform()
            float r2 = -r8
            float r0 = -r0
            r1.translate(r2, r0)
            r13.drawContent()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p006ui.draw.PainterModifier.draw(androidx.compose.ui.graphics.drawscope.ContentDrawScope):void");
    }

    @Override // androidx.compose.p006ui.node.LayoutModifierNode, androidx.compose.p006ui.layout.Remeasurement
    public /* synthetic */ void forceRemeasure() {
        AbstractC1455c.m717a(this);
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public final ContentScale getContentScale() {
        return this.contentScale;
    }

    public final Painter getPainter() {
        return this.painter;
    }

    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    @Override // androidx.compose.p006ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i4) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (!getUseIntrinsicSize()) {
            return measurable.maxIntrinsicHeight(i4);
        }
        long jM8861modifyConstraintsZezNO4M = m8861modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i4, 0, 0, 13, null));
        return Math.max(Constraints.m11494getMinHeightimpl(jM8861modifyConstraintsZezNO4M), measurable.maxIntrinsicHeight(i4));
    }

    @Override // androidx.compose.p006ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i4) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (!getUseIntrinsicSize()) {
            return measurable.maxIntrinsicWidth(i4);
        }
        long jM8861modifyConstraintsZezNO4M = m8861modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i4, 7, null));
        return Math.max(Constraints.m11495getMinWidthimpl(jM8861modifyConstraintsZezNO4M), measurable.maxIntrinsicWidth(i4));
    }

    @Override // androidx.compose.p006ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public MeasureResult mo8862measure3p2s80s(MeasureScope measure, Measurable measurable, long j4) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        final Placeable placeableMo10585measureBRTryo0 = measurable.mo10585measureBRTryo0(m8861modifyConstraintsZezNO4M(j4));
        return MeasureScope.CC.m634p(measure, placeableMo10585measureBRTryo0.getWidth(), placeableMo10585measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.draw.PainterModifierNode$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Placeable.PlacementScope.placeRelative$default(layout, placeableMo10585measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.p006ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i4) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (!getUseIntrinsicSize()) {
            return measurable.minIntrinsicHeight(i4);
        }
        long jM8861modifyConstraintsZezNO4M = m8861modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i4, 0, 0, 13, null));
        return Math.max(Constraints.m11494getMinHeightimpl(jM8861modifyConstraintsZezNO4M), measurable.minIntrinsicHeight(i4));
    }

    @Override // androidx.compose.p006ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i4) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (!getUseIntrinsicSize()) {
            return measurable.minIntrinsicWidth(i4);
        }
        long jM8861modifyConstraintsZezNO4M = m8861modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i4, 7, null));
        return Math.max(Constraints.m11495getMinWidthimpl(jM8861modifyConstraintsZezNO4M), measurable.minIntrinsicWidth(i4));
    }

    @Override // androidx.compose.p006ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
        AbstractC1453a.m713a(this);
    }

    public final void setAlignment(Alignment alignment) {
        Intrinsics.checkNotNullParameter(alignment, "<set-?>");
        this.alignment = alignment;
    }

    public final void setAlpha(float f4) {
        this.alpha = f4;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    public final void setContentScale(ContentScale contentScale) {
        Intrinsics.checkNotNullParameter(contentScale, "<set-?>");
        this.contentScale = contentScale;
    }

    public final void setPainter(Painter painter) {
        Intrinsics.checkNotNullParameter(painter, "<set-?>");
        this.painter = painter;
    }

    public final void setSizeToIntrinsics(boolean z3) {
        this.sizeToIntrinsics = z3;
    }

    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    public PainterModifier(Painter painter, boolean z3, Alignment alignment, ContentScale contentScale, float f4, ColorFilter colorFilter) {
        Intrinsics.checkNotNullParameter(painter, "painter");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(contentScale, "contentScale");
        this.painter = painter;
        this.sizeToIntrinsics = z3;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f4;
        this.colorFilter = colorFilter;
    }
}
