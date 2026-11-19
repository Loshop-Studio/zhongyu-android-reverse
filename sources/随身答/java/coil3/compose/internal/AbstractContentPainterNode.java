package coil3.compose.internal;

import androidx.compose.p012ui.Alignment;
import androidx.compose.p012ui.Modifier;
import androidx.compose.p012ui.geometry.InlineClassHelperKt;
import androidx.compose.p012ui.geometry.Size;
import androidx.compose.p012ui.graphics.ColorFilter;
import androidx.compose.p012ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p012ui.graphics.drawscope.DrawContext;
import androidx.compose.p012ui.graphics.drawscope.DrawTransform;
import androidx.compose.p012ui.graphics.painter.Painter;
import androidx.compose.p012ui.layout.ContentScale;
import androidx.compose.p012ui.layout.IntrinsicMeasurable;
import androidx.compose.p012ui.layout.IntrinsicMeasureScope;
import androidx.compose.p012ui.layout.Measurable;
import androidx.compose.p012ui.layout.MeasureResult;
import androidx.compose.p012ui.layout.MeasureScope;
import androidx.compose.p012ui.layout.Placeable;
import androidx.compose.p012ui.layout.ScaleFactorKt;
import androidx.compose.p012ui.node.DrawModifierNode;
import androidx.compose.p012ui.node.LayoutModifierNode;
import androidx.compose.p012ui.node.SemanticsModifierNode;
import androidx.compose.p012ui.semantics.Role;
import androidx.compose.p012ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p012ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p012ui.unit.Constraints;
import androidx.compose.p012ui.unit.ConstraintsKt;
import androidx.compose.p012ui.unit.IntOffset;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import coil3.compose.AsyncImagePainter;
import coil3.compose.ConstraintsSizeResolver;
import coil3.compose.internal.AbstractContentPainterNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import p173m.AbstractC8937j;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0006\b!\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BE\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u001d\u001a\u00020\u001a*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\"\u001a\u00020 *\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J#\u0010$\u001a\u00020 *\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010#J#\u0010&\u001a\u00020 *\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020 H\u0016¢\u0006\u0004\b&\u0010#J#\u0010'\u001a\u00020 *\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020 H\u0016¢\u0006\u0004\b'\u0010#J\u0013\u0010*\u001a\u00020)*\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0013\u0010-\u001a\u00020)*\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00103\u001a\u00020/2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b4\u00102R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bN\u0010RR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bB\u0010U\"\u0004\bV\u0010WR$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010X\u001a\u0004\b<\u0010Y\"\u0004\bS\u0010ZR\u0014\u0010^\u001a\u00020[8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0014\u0010`\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010Q¨\u0006a"}, m13413d2 = {"Lcoil3/compose/internal/AbstractContentPainterNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "", "clipToBounds", "", "contentDescription", "Lcoil3/compose/ConstraintsSizeResolver;", "constraintSizeResolver", "<init>", "(Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ZLjava/lang/String;Lcoil3/compose/ConstraintsSizeResolver;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "Landroidx/compose/ui/geometry/Size;", "dstSize", "calculateScaledSize-E7KxVPU", "(J)J", "calculateScaledSize", "modifyConstraints-ZezNO4M", "modifyConstraints", "a", "Landroidx/compose/ui/Alignment;", "getAlignment", "()Landroidx/compose/ui/Alignment;", "setAlignment", "(Landroidx/compose/ui/Alignment;)V", "b", "Landroidx/compose/ui/layout/ContentScale;", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "setContentScale", "(Landroidx/compose/ui/layout/ContentScale;)V", "c", "F", "getAlpha", "()F", "setAlpha", "(F)V", "d", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "e", "Z", "getClipToBounds", "()Z", "(Z)V", "f", "Ljava/lang/String;", "()Ljava/lang/String;", "g", "(Ljava/lang/String;)V", "Lcoil3/compose/ConstraintsSizeResolver;", "()Lcoil3/compose/ConstraintsSizeResolver;", "(Lcoil3/compose/ConstraintsSizeResolver;)V", "Landroidx/compose/ui/graphics/painter/Painter;", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "painter", "getShouldAutoInvalidate", "shouldAutoInvalidate", "coil-compose-core_release"}, m13414k = 1, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nContentPainterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentPainterModifier.kt\ncoil3/compose/internal/AbstractContentPainterNode\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 utils.kt\ncoil3/compose/internal/UtilsKt\n+ 7 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactor\n+ 8 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 9 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,467:1\n148#2:468\n148#2:469\n148#2:470\n148#2:471\n153#2:472\n33#2:481\n153#2:490\n33#2:498\n57#3:473\n61#3:477\n63#3:491\n57#3:492\n65#3:495\n61#3:496\n63#3:502\n57#3:503\n65#3:506\n61#3:507\n60#4:474\n70#4:478\n53#4,3:482\n60#4:486\n70#4:489\n60#4:493\n70#4:497\n53#4,3:499\n60#4:504\n70#4:508\n22#5:475\n22#5:479\n22#5:487\n22#5:494\n22#5:505\n207#6:476\n207#6:480\n41#7:485\n46#7:488\n61#8,3:509\n249#9,14:512\n*S KotlinDebug\n*F\n+ 1 ContentPainterModifier.kt\ncoil3/compose/internal/AbstractContentPainterNode\n*L\n302#1:468\n318#1:469\n334#1:470\n350#1:471\n365#1:472\n369#1:481\n393#1:490\n429#1:498\n370#1:473\n371#1:477\n417#1:491\n417#1:492\n417#1:495\n417#1:496\n429#1:502\n429#1:503\n429#1:506\n429#1:507\n370#1:474\n371#1:478\n369#1:482,3\n374#1:486\n374#1:489\n417#1:493\n417#1:497\n429#1:499,3\n429#1:504\n429#1:508\n370#1:475\n371#1:479\n374#1:487\n417#1:494\n429#1:505\n370#1:476\n371#1:480\n374#1:485\n374#1:488\n438#1:509,3\n444#1:512,14\n*E\n"})
/* loaded from: classes3.dex */
public abstract class AbstractContentPainterNode extends Modifier.Node implements DrawModifierNode, LayoutModifierNode, SemanticsModifierNode {

    /* renamed from: a, reason: from kotlin metadata */
    public Alignment alignment;

    /* renamed from: b, reason: from kotlin metadata */
    public ContentScale contentScale;

    /* renamed from: c, reason: from kotlin metadata */
    public float alpha;

    /* renamed from: d, reason: from kotlin metadata */
    public ColorFilter colorFilter;

    /* renamed from: e, reason: from kotlin metadata */
    public boolean clipToBounds;

    /* renamed from: f, reason: from kotlin metadata */
    public String contentDescription;

    /* renamed from: g, reason: from kotlin metadata */
    public ConstraintsSizeResolver constraintSizeResolver;

    public AbstractContentPainterNode(Alignment alignment, ContentScale contentScale, float f10, ColorFilter colorFilter, boolean z9, String str, ConstraintsSizeResolver constraintsSizeResolver) {
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f10;
        this.colorFilter = colorFilter;
        this.clipToBounds = z9;
        this.contentDescription = str;
        this.constraintSizeResolver = constraintsSizeResolver;
    }

    /* renamed from: d */
    public static final Unit m2675d(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.p012ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        String str = this.contentDescription;
        if (str != null) {
            SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
            SemanticsPropertiesKt.m23243setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m23228getImageo7Vup1c());
        }
    }

    /* renamed from: b, reason: from getter */
    public final ConstraintsSizeResolver getConstraintSizeResolver() {
        return this.constraintSizeResolver;
    }

    /* renamed from: c, reason: from getter */
    public final String getContentDescription() {
        return this.contentDescription;
    }

    /* renamed from: calculateScaledSize-E7KxVPU, reason: not valid java name */
    public final long m24659calculateScaledSizeE7KxVPU(long dstSize) {
        if (Size.m21239isEmptyimpl(dstSize)) {
            return Size.INSTANCE.m21246getZeroNHjbRc();
        }
        long intrinsicSize = getPainter().getIntrinsicSize();
        if (intrinsicSize == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return dstSize;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (intrinsicSize >> 32));
        if (Math.abs(fIntBitsToFloat) > Float.MAX_VALUE) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (dstSize >> 32));
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (intrinsicSize & 4294967295L));
        if (Math.abs(fIntBitsToFloat2) > Float.MAX_VALUE) {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (dstSize & 4294967295L));
        }
        long jM21228constructorimpl = Size.m21228constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
        long jMo22750computeScaleFactorH7hwNQA = this.contentScale.mo22750computeScaleFactorH7hwNQA(jM21228constructorimpl, dstSize);
        return (Math.abs(Float.intBitsToFloat((int) (jMo22750computeScaleFactorH7hwNQA >> 32))) > Float.MAX_VALUE || Math.abs(Float.intBitsToFloat((int) (4294967295L & jMo22750computeScaleFactorH7hwNQA))) > Float.MAX_VALUE) ? dstSize : ScaleFactorKt.m22862timesmw2e94(jMo22750computeScaleFactorH7hwNQA, jM21228constructorimpl);
    }

    @Override // androidx.compose.p012ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        long jM24659calculateScaledSizeE7KxVPU = m24659calculateScaledSizeE7KxVPU(contentDrawScope.mo21960getSizeNHjbRc());
        long jMo20985alignKFBX0sM = this.alignment.mo20985alignKFBX0sM(AbstractC8937j.m14239n(jM24659calculateScaledSizeE7KxVPU), AbstractC8937j.m14239n(contentDrawScope.mo21960getSizeNHjbRc()), contentDrawScope.getLayoutDirection());
        int iM24122getXimpl = IntOffset.m24122getXimpl(jMo20985alignKFBX0sM);
        int iM24123getYimpl = IntOffset.m24123getYimpl(jMo20985alignKFBX0sM);
        DrawContext drawContext = contentDrawScope.getDrawContext();
        long jMo21881getSizeNHjbRc = drawContext.mo21881getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            if (this.clipToBounds) {
                DrawTransform.m22017clipRectN_I0leg$default(transform, 0.0f, 0.0f, 0.0f, 0.0f, 0, 31, null);
            }
            transform.translate(iM24122getXimpl, iM24123getYimpl);
            getPainter().m22086drawx_KDEd0(contentDrawScope, jM24659calculateScaledSizeE7KxVPU, this.alpha, this.colorFilter);
            drawContext.getCanvas().restore();
            drawContext.mo21882setSizeuvyYCjk(jMo21881getSizeNHjbRc);
            contentDrawScope.drawContent();
        } catch (Throwable th) {
            drawContext.getCanvas().restore();
            drawContext.mo21882setSizeuvyYCjk(jMo21881getSizeNHjbRc);
            throw th;
        }
    }

    /* renamed from: e */
    public final void m2678e(boolean z9) {
        this.clipToBounds = z9;
    }

    /* renamed from: f */
    public final void m2679f(ConstraintsSizeResolver constraintsSizeResolver) {
        this.constraintSizeResolver = constraintsSizeResolver;
    }

    /* renamed from: g */
    public final void m2680g(String str) {
        this.contentDescription = str;
    }

    public abstract Painter getPainter();

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.p012ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i9) {
        long jConstraints$default = ConstraintsKt.Constraints$default(0, i9, 0, 0, 13, null);
        ConstraintsSizeResolver constraintsSizeResolver = this.constraintSizeResolver;
        if (constraintsSizeResolver != null) {
            constraintsSizeResolver.m2662k(jConstraints$default);
        }
        if (getPainter().getIntrinsicSize() == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return intrinsicMeasurable.maxIntrinsicHeight(i9);
        }
        long jM24660modifyConstraintsZezNO4M = m24660modifyConstraintsZezNO4M(jConstraints$default);
        return Math.max(Constraints.m23948getMinHeightimpl(jM24660modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicHeight(i9));
    }

    @Override // androidx.compose.p012ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i9) {
        long jConstraints$default = ConstraintsKt.Constraints$default(0, 0, 0, i9, 7, null);
        ConstraintsSizeResolver constraintsSizeResolver = this.constraintSizeResolver;
        if (constraintsSizeResolver != null) {
            constraintsSizeResolver.m2662k(jConstraints$default);
        }
        if (getPainter().getIntrinsicSize() == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return intrinsicMeasurable.maxIntrinsicWidth(i9);
        }
        long jM24660modifyConstraintsZezNO4M = m24660modifyConstraintsZezNO4M(jConstraints$default);
        return Math.max(Constraints.m23949getMinWidthimpl(jM24660modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicWidth(i9));
    }

    @Override // androidx.compose.p012ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo17449measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j9) {
        ConstraintsSizeResolver constraintsSizeResolver = this.constraintSizeResolver;
        if (constraintsSizeResolver != null) {
            constraintsSizeResolver.m2662k(j9);
        }
        final Placeable placeableMo22757measureBRTryo0 = measurable.mo22757measureBRTryo0(m24660modifyConstraintsZezNO4M(j9));
        return MeasureScope.layout$default(measureScope, placeableMo22757measureBRTryo0.getWidth(), placeableMo22757measureBRTryo0.getHeight(), null, new Function1() { // from class: m.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractContentPainterNode.m2675d(placeableMo22757measureBRTryo0, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.p012ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i9) {
        long jConstraints$default = ConstraintsKt.Constraints$default(0, i9, 0, 0, 13, null);
        ConstraintsSizeResolver constraintsSizeResolver = this.constraintSizeResolver;
        if (constraintsSizeResolver != null) {
            constraintsSizeResolver.m2662k(jConstraints$default);
        }
        if (getPainter().getIntrinsicSize() == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return intrinsicMeasurable.minIntrinsicHeight(i9);
        }
        long jM24660modifyConstraintsZezNO4M = m24660modifyConstraintsZezNO4M(jConstraints$default);
        return Math.max(Constraints.m23948getMinHeightimpl(jM24660modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicHeight(i9));
    }

    @Override // androidx.compose.p012ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i9) {
        long jConstraints$default = ConstraintsKt.Constraints$default(0, 0, 0, i9, 7, null);
        ConstraintsSizeResolver constraintsSizeResolver = this.constraintSizeResolver;
        if (constraintsSizeResolver != null) {
            constraintsSizeResolver.m2662k(jConstraints$default);
        }
        if (getPainter().getIntrinsicSize() == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return intrinsicMeasurable.minIntrinsicWidth(i9);
        }
        long jM24660modifyConstraintsZezNO4M = m24660modifyConstraintsZezNO4M(jConstraints$default);
        return Math.max(Constraints.m23949getMinWidthimpl(jM24660modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicWidth(i9));
    }

    /* renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    public final long m24660modifyConstraintsZezNO4M(long constraints) {
        float fM14229d;
        int iM23948getMinHeightimpl;
        float fM14228c;
        boolean zM23945getHasFixedWidthimpl = Constraints.m23945getHasFixedWidthimpl(constraints);
        boolean zM23944getHasFixedHeightimpl = Constraints.m23944getHasFixedHeightimpl(constraints);
        if (zM23945getHasFixedWidthimpl && zM23944getHasFixedHeightimpl) {
            return constraints;
        }
        Painter painter = getPainter();
        boolean z9 = Constraints.m23943getHasBoundedWidthimpl(constraints) && Constraints.m23942getHasBoundedHeightimpl(constraints);
        long intrinsicSize = painter.getIntrinsicSize();
        if (intrinsicSize == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return z9 ? ((painter instanceof AsyncImagePainter) && ((AsyncImagePainter.InterfaceC5307c) ((AsyncImagePainter) painter).getState().getValue()).mo2651a() == null) ? constraints : Constraints.m23937copyZbe2FdA$default(constraints, Constraints.m23947getMaxWidthimpl(constraints), 0, Constraints.m23946getMaxHeightimpl(constraints), 0, 10, null) : constraints;
        }
        if (z9 && (zM23945getHasFixedWidthimpl || zM23944getHasFixedHeightimpl)) {
            fM14229d = Constraints.m23947getMaxWidthimpl(constraints);
            iM23948getMinHeightimpl = Constraints.m23946getMaxHeightimpl(constraints);
        } else {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (intrinsicSize >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (intrinsicSize & 4294967295L));
            fM14229d = Math.abs(fIntBitsToFloat) <= Float.MAX_VALUE ? AbstractC8937j.m14229d(constraints, fIntBitsToFloat) : Constraints.m23949getMinWidthimpl(constraints);
            if (Math.abs(fIntBitsToFloat2) <= Float.MAX_VALUE) {
                fM14228c = AbstractC8937j.m14228c(constraints, fIntBitsToFloat2);
                long jM24659calculateScaledSizeE7KxVPU = m24659calculateScaledSizeE7KxVPU(Size.m21228constructorimpl((Float.floatToRawIntBits(fM14228c) & 4294967295L) | (Float.floatToRawIntBits(fM14229d) << 32)));
                return Constraints.m23937copyZbe2FdA$default(constraints, ConstraintsKt.m23964constrainWidthK40F9xA(constraints, MathKt.roundToInt(Float.intBitsToFloat((int) (jM24659calculateScaledSizeE7KxVPU >> 32)))), 0, ConstraintsKt.m23963constrainHeightK40F9xA(constraints, MathKt.roundToInt(Float.intBitsToFloat((int) (jM24659calculateScaledSizeE7KxVPU & 4294967295L)))), 0, 10, null);
            }
            iM23948getMinHeightimpl = Constraints.m23948getMinHeightimpl(constraints);
        }
        fM14228c = iM23948getMinHeightimpl;
        long jM24659calculateScaledSizeE7KxVPU2 = m24659calculateScaledSizeE7KxVPU(Size.m21228constructorimpl((Float.floatToRawIntBits(fM14228c) & 4294967295L) | (Float.floatToRawIntBits(fM14229d) << 32)));
        return Constraints.m23937copyZbe2FdA$default(constraints, ConstraintsKt.m23964constrainWidthK40F9xA(constraints, MathKt.roundToInt(Float.intBitsToFloat((int) (jM24659calculateScaledSizeE7KxVPU2 >> 32)))), 0, ConstraintsKt.m23963constrainHeightK40F9xA(constraints, MathKt.roundToInt(Float.intBitsToFloat((int) (jM24659calculateScaledSizeE7KxVPU2 & 4294967295L)))), 0, 10, null);
    }

    public final void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public final void setAlpha(float f10) {
        this.alpha = f10;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    public final void setContentScale(ContentScale contentScale) {
        this.contentScale = contentScale;
    }
}
