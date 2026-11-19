package androidx.compose.p011ui.draw;

import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.InlineClassHelperKt;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
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
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.ConstraintsKt;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntSize;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b%\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BA\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0015J\u0016\u0010\u001d\u001a\u00020\u0006*\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001f\u001a\u00020\u0006*\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001cJ&\u0010&\u001a\u00020#*\u00020 2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016ø\u0001\u0000¢\u0006\u0004\b$\u0010%J#\u0010+\u001a\u00020)*\u00020'2\u0006\u0010\"\u001a\u00020(2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J#\u0010-\u001a\u00020)*\u00020'2\u0006\u0010\"\u001a\u00020(2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b-\u0010,J#\u0010/\u001a\u00020)*\u00020'2\u0006\u0010\"\u001a\u00020(2\u0006\u0010.\u001a\u00020)H\u0016¢\u0006\u0004\b/\u0010,J#\u00100\u001a\u00020)*\u00020'2\u0006\u0010\"\u001a\u00020(2\u0006\u0010.\u001a\u00020)H\u0016¢\u0006\u0004\b0\u0010,J\u0013\u00103\u001a\u000202*\u000201H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010?R\u0014\u0010Y\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010?\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Z"}, m5110d2 = {"Landroidx/compose/ui/draw/PainterNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "", "sizeToIntrinsics", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;ZLandroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;)V", "Landroidx/compose/ui/geometry/Size;", "dstSize", "calculateScaledSize-E7KxVPU", "(J)J", "calculateScaledSize", "Landroidx/compose/ui/unit/Constraints;", "constraints", "modifyConstraints-ZezNO4M", "modifyConstraints", "hasSpecifiedAndFiniteWidth-uvyYCjk", "(J)Z", "hasSpecifiedAndFiniteWidth", "hasSpecifiedAndFiniteHeight-uvyYCjk", "hasSpecifiedAndFiniteHeight", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Ld6/s;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/graphics/painter/Painter;", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "setPainter", "(Landroidx/compose/ui/graphics/painter/Painter;)V", "Z", "getSizeToIntrinsics", "()Z", "setSizeToIntrinsics", "(Z)V", "Landroidx/compose/ui/Alignment;", "getAlignment", "()Landroidx/compose/ui/Alignment;", "setAlignment", "(Landroidx/compose/ui/Alignment;)V", "Landroidx/compose/ui/layout/ContentScale;", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "setContentScale", "(Landroidx/compose/ui/layout/ContentScale;)V", "F", "getAlpha", "()F", "setAlpha", "(F)V", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "getUseIntrinsicSize", "useIntrinsicSize", "getShouldAutoInvalidate", "shouldAutoInvalidate", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPainterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PainterModifier.kt\nandroidx/compose/ui/draw/PainterNode\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 7 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,364:1\n148#2:365\n33#2:378\n33#2:401\n33#2:431\n57#3:366\n57#3:369\n61#3:372\n61#3:375\n57#3:382\n61#3:385\n57#3:387\n61#3:394\n57#3:405\n61#3:412\n57#3:419\n57#3:422\n61#3:425\n61#3:428\n57#3:435\n61#3:438\n57#3:440\n61#3:447\n57#3:451\n61#3:458\n57#3:469\n61#3:473\n60#4:367\n60#4:370\n70#4:373\n70#4:376\n53#4,3:379\n60#4:383\n70#4:386\n60#4:388\n70#4:395\n53#4,3:402\n60#4:406\n70#4:413\n60#4:420\n60#4:423\n70#4:426\n70#4:429\n53#4,3:432\n60#4:436\n70#4:439\n60#4:441\n70#4:448\n80#4:450\n60#4:452\n70#4:459\n80#4:461\n60#4:470\n70#4:474\n22#5:368\n22#5:371\n22#5:374\n22#5:377\n22#5:384\n22#5,5:389\n22#5,5:396\n22#5,5:407\n22#5,5:414\n22#5:421\n22#5:424\n22#5:427\n22#5:430\n22#5:437\n22#5,5:442\n22#5,5:453\n22#5:471\n22#5:475\n30#6:449\n30#6:460\n120#7,3:462\n124#7,3:466\n1#8:465\n139#9:472\n139#9:476\n*S KotlinDebug\n*F\n+ 1 PainterModifier.kt\nandroidx/compose/ui/draw/PainterNode\n*L\n162#1:365\n245#1:378\n289#1:401\n318#1:431\n233#1:366\n235#1:369\n240#1:372\n242#1:375\n246#1:382\n246#1:385\n272#1:387\n279#1:394\n297#1:405\n298#1:412\n306#1:419\n308#1:422\n313#1:425\n315#1:428\n323#1:435\n323#1:438\n331#1:440\n331#1:447\n332#1:451\n332#1:458\n351#1:469\n354#1:473\n233#1:367\n235#1:370\n240#1:373\n242#1:376\n245#1:379,3\n246#1:383\n246#1:386\n272#1:388\n279#1:395\n289#1:402,3\n297#1:406\n298#1:413\n306#1:420\n308#1:423\n313#1:426\n315#1:429\n318#1:432,3\n323#1:436\n323#1:439\n331#1:441\n331#1:448\n331#1:450\n332#1:452\n332#1:459\n332#1:461\n351#1:470\n354#1:474\n233#1:368\n235#1:371\n240#1:374\n242#1:377\n246#1:384\n272#1:389,5\n279#1:396,5\n297#1:407,5\n298#1:414,5\n306#1:421\n308#1:424\n313#1:427\n315#1:430\n323#1:437\n331#1:442,5\n332#1:453,5\n351#1:471\n354#1:475\n331#1:449\n332#1:460\n343#1:462,3\n343#1:466,3\n351#1:472\n354#1:476\n*E\n"})
/* loaded from: classes.dex */
final class PainterNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode {

    @NotNull
    private Alignment alignment;
    private float alpha;

    @Nullable
    private ColorFilter colorFilter;

    @NotNull
    private ContentScale contentScale;

    @NotNull
    private Painter painter;
    private boolean sizeToIntrinsics;

    public /* synthetic */ PainterNode(Painter painter, boolean z8, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, AbstractC5824e abstractC5824e) {
        this(painter, z8, (i & 4) != 0 ? Alignment.INSTANCE.getCenter() : alignment, (i & 8) != 0 ? ContentScale.INSTANCE.getInside() : contentScale, (i & 16) != 0 ? 1.0f : f, (i & 32) != 0 ? null : colorFilter);
    }

    /* renamed from: calculateScaledSize-E7KxVPU, reason: not valid java name */
    private final long m10297calculateScaledSizeE7KxVPU(long dstSize) {
        if (!getUseIntrinsicSize()) {
            return dstSize;
        }
        long jM10501constructorimpl = Size.m10501constructorimpl((Float.floatToRawIntBits(!m10299hasSpecifiedAndFiniteWidthuvyYCjk(this.painter.getIntrinsicSize()) ? Float.intBitsToFloat((int) (dstSize >> 32)) : Float.intBitsToFloat((int) (this.painter.getIntrinsicSize() >> 32))) << 32) | (Float.floatToRawIntBits(!m10298hasSpecifiedAndFiniteHeightuvyYCjk(this.painter.getIntrinsicSize()) ? Float.intBitsToFloat((int) (dstSize & 4294967295L)) : Float.intBitsToFloat((int) (this.painter.getIntrinsicSize() & 4294967295L))) & 4294967295L));
        return (Float.intBitsToFloat((int) (dstSize >> 32)) == 0.0f || Float.intBitsToFloat((int) (dstSize & 4294967295L)) == 0.0f) ? Size.INSTANCE.m10519getZeroNHjbRc() : ScaleFactorKt.m12137timesUQTWf7w(jM10501constructorimpl, this.contentScale.mo12026computeScaleFactorH7hwNQA(jM10501constructorimpl, dstSize));
    }

    private final boolean getUseIntrinsicSize() {
        return this.sizeToIntrinsics && this.painter.getIntrinsicSize() != InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: hasSpecifiedAndFiniteHeight-uvyYCjk, reason: not valid java name */
    private final boolean m10298hasSpecifiedAndFiniteHeightuvyYCjk(long j7) {
        return !Size.m10506equalsimpl0(j7, Size.INSTANCE.m10518getUnspecifiedNHjbRc()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j7 & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* renamed from: hasSpecifiedAndFiniteWidth-uvyYCjk, reason: not valid java name */
    private final boolean m10299hasSpecifiedAndFiniteWidthuvyYCjk(long j7) {
        return !Size.m10506equalsimpl0(j7, Size.INSTANCE.m10518getUnspecifiedNHjbRc()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j7 >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    private final long m10300modifyConstraintsZezNO4M(long constraints) {
        boolean z8 = false;
        boolean z9 = Constraints.m13254getHasBoundedWidthimpl(constraints) && Constraints.m13253getHasBoundedHeightimpl(constraints);
        if (Constraints.m13256getHasFixedWidthimpl(constraints) && Constraints.m13255getHasFixedHeightimpl(constraints)) {
            z8 = true;
        }
        if ((!getUseIntrinsicSize() && z9) || z8) {
            return Constraints.m13248copyZbe2FdA$default(constraints, Constraints.m13258getMaxWidthimpl(constraints), 0, Constraints.m13257getMaxHeightimpl(constraints), 0, 10, null);
        }
        long jMo11353getIntrinsicSizeNHjbRc = this.painter.getIntrinsicSize();
        int iRound = m10299hasSpecifiedAndFiniteWidthuvyYCjk(jMo11353getIntrinsicSizeNHjbRc) ? Math.round(Float.intBitsToFloat((int) (jMo11353getIntrinsicSizeNHjbRc >> 32))) : Constraints.m13260getMinWidthimpl(constraints);
        int iRound2 = m10298hasSpecifiedAndFiniteHeightuvyYCjk(jMo11353getIntrinsicSizeNHjbRc) ? Math.round(Float.intBitsToFloat((int) (jMo11353getIntrinsicSizeNHjbRc & 4294967295L))) : Constraints.m13259getMinHeightimpl(constraints);
        int iM13275constrainWidthK40F9xA = ConstraintsKt.m13275constrainWidthK40F9xA(constraints, iRound);
        long jM10297calculateScaledSizeE7KxVPU = m10297calculateScaledSizeE7KxVPU(Size.m10501constructorimpl((Float.floatToRawIntBits(ConstraintsKt.m13274constrainHeightK40F9xA(constraints, iRound2)) & 4294967295L) | (Float.floatToRawIntBits(iM13275constrainWidthK40F9xA) << 32)));
        return Constraints.m13248copyZbe2FdA$default(constraints, ConstraintsKt.m13275constrainWidthK40F9xA(constraints, Math.round(Float.intBitsToFloat((int) (jM10297calculateScaledSizeE7KxVPU >> 32)))), 0, ConstraintsKt.m13274constrainHeightK40F9xA(constraints, Math.round(Float.intBitsToFloat((int) (jM10297calculateScaledSizeE7KxVPU & 4294967295L)))), 0, 10, null);
    }

    @Override // androidx.compose.p011ui.node.DrawModifierNode
    public void draw(@NotNull ContentDrawScope contentDrawScope) {
        long jMo11353getIntrinsicSizeNHjbRc = this.painter.getIntrinsicSize();
        float fIntBitsToFloat = m10299hasSpecifiedAndFiniteWidthuvyYCjk(jMo11353getIntrinsicSizeNHjbRc) ? Float.intBitsToFloat((int) (jMo11353getIntrinsicSizeNHjbRc >> 32)) : Float.intBitsToFloat((int) (contentDrawScope.mo11233getSizeNHjbRc() >> 32));
        float fIntBitsToFloat2 = m10298hasSpecifiedAndFiniteHeightuvyYCjk(jMo11353getIntrinsicSizeNHjbRc) ? Float.intBitsToFloat((int) (jMo11353getIntrinsicSizeNHjbRc & 4294967295L)) : Float.intBitsToFloat((int) (contentDrawScope.mo11233getSizeNHjbRc() & 4294967295L));
        long jM10501constructorimpl = Size.m10501constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
        long jM10519getZeroNHjbRc = (Float.intBitsToFloat((int) (contentDrawScope.mo11233getSizeNHjbRc() >> 32)) == 0.0f || Float.intBitsToFloat((int) (contentDrawScope.mo11233getSizeNHjbRc() & 4294967295L)) == 0.0f) ? Size.INSTANCE.m10519getZeroNHjbRc() : ScaleFactorKt.m12137timesUQTWf7w(jM10501constructorimpl, this.contentScale.mo12026computeScaleFactorH7hwNQA(jM10501constructorimpl, contentDrawScope.mo11233getSizeNHjbRc()));
        long jMo10250alignKFBX0sM = this.alignment.mo10250alignKFBX0sM(IntSize.m13471constructorimpl((Math.round(Float.intBitsToFloat((int) (jM10519getZeroNHjbRc & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (jM10519getZeroNHjbRc >> 32))) << 32)), IntSize.m13471constructorimpl((Math.round(Float.intBitsToFloat((int) (contentDrawScope.mo11233getSizeNHjbRc() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (contentDrawScope.mo11233getSizeNHjbRc() & 4294967295L))) & 4294967295L)), contentDrawScope.getLayoutDirection());
        float fM13433getXimpl = IntOffset.m13433getXimpl(jMo10250alignKFBX0sM);
        float fM13434getYimpl = IntOffset.m13434getYimpl(jMo10250alignKFBX0sM);
        contentDrawScope.getDrawContext().getTransform().translate(fM13433getXimpl, fM13434getYimpl);
        try {
            this.painter.m11359drawx_KDEd0(contentDrawScope, jM10519getZeroNHjbRc, this.alpha, this.colorFilter);
            contentDrawScope.getDrawContext().getTransform().translate(-fM13433getXimpl, -fM13434getYimpl);
            contentDrawScope.drawContent();
        } catch (Throwable th) {
            contentDrawScope.getDrawContext().getTransform().translate(-fM13433getXimpl, -fM13434getYimpl);
            throw th;
        }
    }

    @NotNull
    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    @Nullable
    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    @NotNull
    public final ContentScale getContentScale() {
        return this.contentScale;
    }

    @NotNull
    public final Painter getPainter() {
        return this.painter;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.maxIntrinsicHeight(i);
        }
        long jM10300modifyConstraintsZezNO4M = m10300modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
        return Math.max(Constraints.m13259getMinHeightimpl(jM10300modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicHeight(i));
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.maxIntrinsicWidth(i);
        }
        long jM10300modifyConstraintsZezNO4M = m10300modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
        return Math.max(Constraints.m13260getMinWidthimpl(jM10300modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicWidth(i));
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo6573measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j7) {
        final Placeable placeableMo12033measureBRTryo0 = measurable.mo12033measureBRTryo0(m10300modifyConstraintsZezNO4M(j7));
        return MeasureScope.layout$default(measureScope, placeableMo12033measureBRTryo0.getWidth(), placeableMo12033measureBRTryo0.getHeight(), null, new InterfaceC6471c() { // from class: androidx.compose.ui.draw.PainterNode$measure$1
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12033measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.minIntrinsicHeight(i);
        }
        long jM10300modifyConstraintsZezNO4M = m10300modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
        return Math.max(Constraints.m13259getMinHeightimpl(jM10300modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicHeight(i));
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.minIntrinsicWidth(i);
        }
        long jM10300modifyConstraintsZezNO4M = m10300modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
        return Math.max(Constraints.m13260getMinWidthimpl(jM10300modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicWidth(i));
    }

    public final void setAlignment(@NotNull Alignment alignment) {
        this.alignment = alignment;
    }

    public final void setAlpha(float f) {
        this.alpha = f;
    }

    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    public final void setContentScale(@NotNull ContentScale contentScale) {
        this.contentScale = contentScale;
    }

    public final void setPainter(@NotNull Painter painter) {
        this.painter = painter;
    }

    public final void setSizeToIntrinsics(boolean z8) {
        this.sizeToIntrinsics = z8;
    }

    @NotNull
    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    public PainterNode(@NotNull Painter painter, boolean z8, @NotNull Alignment alignment, @NotNull ContentScale contentScale, float f, @Nullable ColorFilter colorFilter) {
        this.painter = painter;
        this.sizeToIntrinsics = z8;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f;
        this.colorFilter = colorFilter;
    }
}
