package coil3.compose.internal;

import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.InlineClassHelperKt;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawContext;
import androidx.compose.p011ui.graphics.drawscope.DrawTransform;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.IntrinsicMeasurable;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.layout.ScaleFactorKt;
import androidx.compose.p011ui.node.DrawModifierNode;
import androidx.compose.p011ui.node.LayoutModifierNode;
import androidx.compose.p011ui.node.SemanticsModifierNode;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.ConstraintsKt;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import coil3.compose.AsyncImagePainter;
import coil3.compose.C3254k;
import coil3.compose.ConstraintsSizeResolver;
import coil3.compose.InterfaceC3252i;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.SourceDebugExtension;
import p110m.AbstractC6077e;
import p169t6.AbstractC6600a;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, m5110d2 = {"Lcoil3/compose/internal/AbstractContentPainterNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "coil-compose-core_release"}, m5111k = 1, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nContentPainterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentPainterModifier.kt\ncoil3/compose/internal/AbstractContentPainterNode\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 utils.kt\ncoil3/compose/internal/UtilsKt\n+ 7 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactor\n+ 8 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 9 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,467:1\n148#2:468\n148#2:469\n148#2:470\n148#2:471\n153#2:472\n33#2:481\n153#2:490\n33#2:498\n57#3:473\n61#3:477\n63#3:491\n57#3:492\n65#3:495\n61#3:496\n63#3:502\n57#3:503\n65#3:506\n61#3:507\n60#4:474\n70#4:478\n53#4,3:482\n60#4:486\n70#4:489\n60#4:493\n70#4:497\n53#4,3:499\n60#4:504\n70#4:508\n22#5:475\n22#5:479\n22#5:487\n22#5:494\n22#5:505\n207#6:476\n207#6:480\n41#7:485\n46#7:488\n61#8,3:509\n249#9,14:512\n*S KotlinDebug\n*F\n+ 1 ContentPainterModifier.kt\ncoil3/compose/internal/AbstractContentPainterNode\n*L\n302#1:468\n318#1:469\n334#1:470\n350#1:471\n365#1:472\n369#1:481\n393#1:490\n429#1:498\n370#1:473\n371#1:477\n417#1:491\n417#1:492\n417#1:495\n417#1:496\n429#1:502\n429#1:503\n429#1:506\n429#1:507\n370#1:474\n371#1:478\n369#1:482,3\n374#1:486\n374#1:489\n417#1:493\n417#1:497\n429#1:499,3\n429#1:504\n429#1:508\n370#1:475\n371#1:479\n374#1:487\n417#1:494\n429#1:505\n370#1:476\n371#1:480\n374#1:485\n374#1:488\n438#1:509,3\n444#1:512,14\n*E\n"})
/* loaded from: classes2.dex */
public abstract class AbstractContentPainterNode extends Modifier.Node implements DrawModifierNode, LayoutModifierNode, SemanticsModifierNode {

    /* renamed from: a */
    public Alignment f1859a;

    /* renamed from: b */
    public ContentScale f1860b;

    /* renamed from: c */
    public float f1861c;

    /* renamed from: d */
    public boolean f1862d;

    /* renamed from: e */
    public ConstraintsSizeResolver f1863e;

    public AbstractContentPainterNode(Alignment alignment, ContentScale contentScale, float f, boolean z8, ConstraintsSizeResolver constraintsSizeResolver) {
        this.f1859a = alignment;
        this.f1860b = contentScale;
        this.f1861c = f;
        this.f1862d = z8;
        this.f1863e = constraintsSizeResolver;
    }

    @Override // androidx.compose.p011ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    /* renamed from: calculateScaledSize-E7KxVPU, reason: not valid java name */
    public final long m13725calculateScaledSizeE7KxVPU(long j7) {
        if (Size.m10512isEmptyimpl(j7)) {
            return Size.INSTANCE.m10519getZeroNHjbRc();
        }
        long jMo11353getIntrinsicSizeNHjbRc = getPainter().mo11353getIntrinsicSizeNHjbRc();
        if (jMo11353getIntrinsicSizeNHjbRc == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return j7;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo11353getIntrinsicSizeNHjbRc >> 32));
        if (Math.abs(fIntBitsToFloat) > Float.MAX_VALUE) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo11353getIntrinsicSizeNHjbRc & 4294967295L));
        if (Math.abs(fIntBitsToFloat2) > Float.MAX_VALUE) {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
        }
        long jM10501constructorimpl = Size.m10501constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
        long jMo12026computeScaleFactorH7hwNQA = this.f1860b.mo12026computeScaleFactorH7hwNQA(jM10501constructorimpl, j7);
        return (Math.abs(Float.intBitsToFloat((int) (jMo12026computeScaleFactorH7hwNQA >> 32))) > Float.MAX_VALUE || Math.abs(Float.intBitsToFloat((int) (4294967295L & jMo12026computeScaleFactorH7hwNQA))) > Float.MAX_VALUE) ? j7 : ScaleFactorKt.m12138timesmw2e94(jMo12026computeScaleFactorH7hwNQA, jM10501constructorimpl);
    }

    @Override // androidx.compose.p011ui.node.DrawModifierNode
    public final void draw(ContentDrawScope contentDrawScope) {
        long jM13725calculateScaledSizeE7KxVPU = m13725calculateScaledSizeE7KxVPU(contentDrawScope.mo11233getSizeNHjbRc());
        long jMo10250alignKFBX0sM = this.f1859a.mo10250alignKFBX0sM(AbstractC6077e.m5792d(jM13725calculateScaledSizeE7KxVPU), AbstractC6077e.m5792d(contentDrawScope.mo11233getSizeNHjbRc()), contentDrawScope.getLayoutDirection());
        int iM13433getXimpl = IntOffset.m13433getXimpl(jMo10250alignKFBX0sM);
        int iM13434getYimpl = IntOffset.m13434getYimpl(jMo10250alignKFBX0sM);
        DrawContext drawContext = contentDrawScope.getDrawContext();
        long jMo11154getSizeNHjbRc = drawContext.mo11154getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            if (this.f1862d) {
                DrawTransform.m11290clipRectN_I0leg$default(transform, 0.0f, 0.0f, 0.0f, 0.0f, 0, 31, null);
            }
            transform.translate(iM13433getXimpl, iM13434getYimpl);
            getPainter().m11359drawx_KDEd0(contentDrawScope, jM13725calculateScaledSizeE7KxVPU, this.f1861c, null);
            drawContext.getCanvas().restore();
            drawContext.mo11155setSizeuvyYCjk(jMo11154getSizeNHjbRc);
            contentDrawScope.drawContent();
        } catch (Throwable th) {
            AbstractC0584a.m921v(drawContext, jMo11154getSizeNHjbRc);
            throw th;
        }
    }

    public abstract Painter getPainter();

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        long jConstraints$default = ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null);
        ConstraintsSizeResolver constraintsSizeResolver = this.f1863e;
        if (constraintsSizeResolver != null) {
            constraintsSizeResolver.m2181b(jConstraints$default);
        }
        if (getPainter().mo11353getIntrinsicSizeNHjbRc() == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return intrinsicMeasurable.maxIntrinsicHeight(i);
        }
        long jM13726modifyConstraintsZezNO4M = m13726modifyConstraintsZezNO4M(jConstraints$default);
        return Math.max(Constraints.m13259getMinHeightimpl(jM13726modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicHeight(i));
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        long jConstraints$default = ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null);
        ConstraintsSizeResolver constraintsSizeResolver = this.f1863e;
        if (constraintsSizeResolver != null) {
            constraintsSizeResolver.m2181b(jConstraints$default);
        }
        if (getPainter().mo11353getIntrinsicSizeNHjbRc() == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return intrinsicMeasurable.maxIntrinsicWidth(i);
        }
        long jM13726modifyConstraintsZezNO4M = m13726modifyConstraintsZezNO4M(jConstraints$default);
        return Math.max(Constraints.m13260getMinWidthimpl(jM13726modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicWidth(i));
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo6573measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j7) {
        ConstraintsSizeResolver constraintsSizeResolver = this.f1863e;
        if (constraintsSizeResolver != null) {
            constraintsSizeResolver.m2181b(j7);
        }
        Placeable placeableMo12033measureBRTryo0 = measurable.mo12033measureBRTryo0(m13726modifyConstraintsZezNO4M(j7));
        return MeasureScope.layout$default(measureScope, placeableMo12033measureBRTryo0.getWidth(), placeableMo12033measureBRTryo0.getHeight(), null, new C3254k(placeableMo12033measureBRTryo0, 1), 4, null);
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        long jConstraints$default = ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null);
        ConstraintsSizeResolver constraintsSizeResolver = this.f1863e;
        if (constraintsSizeResolver != null) {
            constraintsSizeResolver.m2181b(jConstraints$default);
        }
        if (getPainter().mo11353getIntrinsicSizeNHjbRc() == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return intrinsicMeasurable.minIntrinsicHeight(i);
        }
        long jM13726modifyConstraintsZezNO4M = m13726modifyConstraintsZezNO4M(jConstraints$default);
        return Math.max(Constraints.m13259getMinHeightimpl(jM13726modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicHeight(i));
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        long jConstraints$default = ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null);
        ConstraintsSizeResolver constraintsSizeResolver = this.f1863e;
        if (constraintsSizeResolver != null) {
            constraintsSizeResolver.m2181b(jConstraints$default);
        }
        if (getPainter().mo11353getIntrinsicSizeNHjbRc() == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return intrinsicMeasurable.minIntrinsicWidth(i);
        }
        long jM13726modifyConstraintsZezNO4M = m13726modifyConstraintsZezNO4M(jConstraints$default);
        return Math.max(Constraints.m13260getMinWidthimpl(jM13726modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicWidth(i));
    }

    /* renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    public final long m13726modifyConstraintsZezNO4M(long j7) {
        float fM13260getMinWidthimpl;
        int iM13259getMinHeightimpl;
        float fM5273l;
        boolean zM13256getHasFixedWidthimpl = Constraints.m13256getHasFixedWidthimpl(j7);
        boolean zM13255getHasFixedHeightimpl = Constraints.m13255getHasFixedHeightimpl(j7);
        if (zM13256getHasFixedWidthimpl && zM13255getHasFixedHeightimpl) {
            return j7;
        }
        Painter painter = getPainter();
        boolean z8 = Constraints.m13254getHasBoundedWidthimpl(j7) && Constraints.m13253getHasBoundedHeightimpl(j7);
        long jMo11353getIntrinsicSizeNHjbRc = painter.mo11353getIntrinsicSizeNHjbRc();
        if (jMo11353getIntrinsicSizeNHjbRc == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return z8 ? ((painter instanceof AsyncImagePainter) && ((InterfaceC3252i) ((AsyncImagePainter) painter).f1834p.f9347a.getValue()).mo2186a() == null) ? j7 : Constraints.m13248copyZbe2FdA$default(j7, Constraints.m13258getMaxWidthimpl(j7), 0, Constraints.m13257getMaxHeightimpl(j7), 0, 10, null) : j7;
        }
        if (z8 && (zM13256getHasFixedWidthimpl || zM13255getHasFixedHeightimpl)) {
            fM13260getMinWidthimpl = Constraints.m13258getMaxWidthimpl(j7);
            iM13259getMinHeightimpl = Constraints.m13257getMaxHeightimpl(j7);
        } else {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo11353getIntrinsicSizeNHjbRc >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo11353getIntrinsicSizeNHjbRc & 4294967295L));
            if (Math.abs(fIntBitsToFloat) <= Float.MAX_VALUE) {
                int i = AbstractC6077e.f9679b;
                fM13260getMinWidthimpl = AbstractC5806u.m5273l(fIntBitsToFloat, Constraints.m13260getMinWidthimpl(j7), Constraints.m13258getMaxWidthimpl(j7));
            } else {
                fM13260getMinWidthimpl = Constraints.m13260getMinWidthimpl(j7);
            }
            if (Math.abs(fIntBitsToFloat2) <= Float.MAX_VALUE) {
                int i8 = AbstractC6077e.f9679b;
                fM5273l = AbstractC5806u.m5273l(fIntBitsToFloat2, Constraints.m13259getMinHeightimpl(j7), Constraints.m13257getMaxHeightimpl(j7));
                long jM13725calculateScaledSizeE7KxVPU = m13725calculateScaledSizeE7KxVPU(Size.m10501constructorimpl((Float.floatToRawIntBits(fM5273l) & 4294967295L) | (Float.floatToRawIntBits(fM13260getMinWidthimpl) << 32)));
                return Constraints.m13248copyZbe2FdA$default(j7, ConstraintsKt.m13275constrainWidthK40F9xA(j7, AbstractC6600a.m6241q(Float.intBitsToFloat((int) (jM13725calculateScaledSizeE7KxVPU >> 32)))), 0, ConstraintsKt.m13274constrainHeightK40F9xA(j7, AbstractC6600a.m6241q(Float.intBitsToFloat((int) (jM13725calculateScaledSizeE7KxVPU & 4294967295L)))), 0, 10, null);
            }
            iM13259getMinHeightimpl = Constraints.m13259getMinHeightimpl(j7);
        }
        fM5273l = iM13259getMinHeightimpl;
        long jM13725calculateScaledSizeE7KxVPU2 = m13725calculateScaledSizeE7KxVPU(Size.m10501constructorimpl((Float.floatToRawIntBits(fM5273l) & 4294967295L) | (Float.floatToRawIntBits(fM13260getMinWidthimpl) << 32)));
        return Constraints.m13248copyZbe2FdA$default(j7, ConstraintsKt.m13275constrainWidthK40F9xA(j7, AbstractC6600a.m6241q(Float.intBitsToFloat((int) (jM13725calculateScaledSizeE7KxVPU2 >> 32)))), 0, ConstraintsKt.m13274constrainHeightK40F9xA(j7, AbstractC6600a.m6241q(Float.intBitsToFloat((int) (jM13725calculateScaledSizeE7KxVPU2 & 4294967295L)))), 0, 10, null);
    }
}
