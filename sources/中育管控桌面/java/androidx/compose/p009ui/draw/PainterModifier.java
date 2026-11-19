package androidx.compose.p009ui.draw;

import androidx.compose.p009ui.Alignment;
import androidx.compose.p009ui.Modifier;
import androidx.compose.p009ui.geometry.InlineClassHelperKt;
import androidx.compose.p009ui.geometry.Size;
import androidx.compose.p009ui.graphics.ColorFilter;
import androidx.compose.p009ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p009ui.graphics.painter.Painter;
import androidx.compose.p009ui.layout.ContentScale;
import androidx.compose.p009ui.layout.IntrinsicMeasurable;
import androidx.compose.p009ui.layout.IntrinsicMeasureScope;
import androidx.compose.p009ui.layout.Measurable;
import androidx.compose.p009ui.layout.MeasureResult;
import androidx.compose.p009ui.layout.MeasureScope;
import androidx.compose.p009ui.layout.Placeable;
import androidx.compose.p009ui.layout.ScaleFactorKt;
import androidx.compose.p009ui.node.DrawModifierNode;
import androidx.compose.p009ui.node.LayoutModifierNode;
import androidx.compose.p009ui.unit.Constraints;
import androidx.compose.p009ui.unit.ConstraintsKt;
import androidx.compose.p009ui.unit.IntOffset;
import androidx.compose.p009ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B?\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u001a\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.H\u0002ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u001a\u00102\u001a\u0002032\u0006\u00104\u001a\u000203H\u0002ø\u0001\u0000¢\u0006\u0004\b5\u00101J\b\u00106\u001a\u000207H\u0016J\f\u00108\u001a\u000209*\u00020:H\u0016J\u0016\u0010;\u001a\u00020\u0007*\u00020.H\u0002ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\u0016\u0010>\u001a\u00020\u0007*\u00020.H\u0002ø\u0001\u0000¢\u0006\u0004\b?\u0010=J\u001c\u0010@\u001a\u00020A*\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020AH\u0016J\u001c\u0010F\u001a\u00020A*\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010G\u001a\u00020AH\u0016J&\u0010H\u001a\u00020I*\u00020J2\u0006\u0010C\u001a\u00020K2\u0006\u00104\u001a\u000203H\u0016ø\u0001\u0000¢\u0006\u0004\bL\u0010MJ\u001c\u0010N\u001a\u00020A*\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020AH\u0016J\u001c\u0010O\u001a\u00020A*\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010G\u001a\u00020AH\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010'\"\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006P"}, m7880d2 = {"Landroidx/compose/ui/draw/PainterNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "sizeToIntrinsics", "", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "(Landroidx/compose/ui/graphics/painter/Painter;ZLandroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;)V", "getAlignment", "()Landroidx/compose/ui/Alignment;", "setAlignment", "(Landroidx/compose/ui/Alignment;)V", "getAlpha", "()F", "setAlpha", "(F)V", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "setContentScale", "(Landroidx/compose/ui/layout/ContentScale;)V", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "setPainter", "(Landroidx/compose/ui/graphics/painter/Painter;)V", "shouldAutoInvalidate", "getShouldAutoInvalidate", "()Z", "getSizeToIntrinsics", "setSizeToIntrinsics", "(Z)V", "useIntrinsicSize", "getUseIntrinsicSize", "calculateScaledSize", "Landroidx/compose/ui/geometry/Size;", "dstSize", "calculateScaledSize-E7KxVPU", "(J)J", "modifyConstraints", "Landroidx/compose/ui/unit/Constraints;", "constraints", "modifyConstraints-ZezNO4M", "toString", "", "draw", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "hasSpecifiedAndFiniteHeight", "hasSpecifiedAndFiniteHeight-uvyYCjk", "(J)Z", "hasSpecifiedAndFiniteWidth", "hasSpecifiedAndFiniteWidth-uvyYCjk", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nPainterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PainterModifier.kt\nandroidx/compose/ui/draw/PainterNode\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 7 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,364:1\n148#2:365\n33#2:378\n33#2:401\n33#2:431\n57#3:366\n57#3:369\n61#3:372\n61#3:375\n57#3:382\n61#3:385\n57#3:387\n61#3:394\n57#3:405\n61#3:412\n57#3:419\n57#3:422\n61#3:425\n61#3:428\n57#3:435\n61#3:438\n57#3:440\n61#3:447\n57#3:451\n61#3:458\n57#3:469\n61#3:473\n60#4:367\n60#4:370\n70#4:373\n70#4:376\n53#4,3:379\n60#4:383\n70#4:386\n60#4:388\n70#4:395\n53#4,3:402\n60#4:406\n70#4:413\n60#4:420\n60#4:423\n70#4:426\n70#4:429\n53#4,3:432\n60#4:436\n70#4:439\n60#4:441\n70#4:448\n80#4:450\n60#4:452\n70#4:459\n80#4:461\n60#4:470\n70#4:474\n22#5:368\n22#5:371\n22#5:374\n22#5:377\n22#5:384\n22#5,5:389\n22#5,5:396\n22#5,5:407\n22#5,5:414\n22#5:421\n22#5:424\n22#5:427\n22#5:430\n22#5:437\n22#5,5:442\n22#5,5:453\n22#5:471\n22#5:475\n30#6:449\n30#6:460\n120#7,3:462\n124#7,3:466\n1#8:465\n139#9:472\n139#9:476\n*S KotlinDebug\n*F\n+ 1 PainterModifier.kt\nandroidx/compose/ui/draw/PainterNode\n*L\n162#1:365\n245#1:378\n289#1:401\n318#1:431\n233#1:366\n235#1:369\n240#1:372\n242#1:375\n246#1:382\n246#1:385\n272#1:387\n279#1:394\n297#1:405\n298#1:412\n306#1:419\n308#1:422\n313#1:425\n315#1:428\n323#1:435\n323#1:438\n331#1:440\n331#1:447\n332#1:451\n332#1:458\n351#1:469\n354#1:473\n233#1:367\n235#1:370\n240#1:373\n242#1:376\n245#1:379,3\n246#1:383\n246#1:386\n272#1:388\n279#1:395\n289#1:402,3\n297#1:406\n298#1:413\n306#1:420\n308#1:423\n313#1:426\n315#1:429\n318#1:432,3\n323#1:436\n323#1:439\n331#1:441\n331#1:448\n331#1:450\n332#1:452\n332#1:459\n332#1:461\n351#1:470\n354#1:474\n233#1:368\n235#1:371\n240#1:374\n242#1:377\n246#1:384\n272#1:389,5\n279#1:396,5\n297#1:407,5\n298#1:414,5\n306#1:421\n308#1:424\n313#1:427\n315#1:430\n323#1:437\n331#1:442,5\n332#1:453,5\n351#1:471\n354#1:475\n331#1:449\n332#1:460\n343#1:462,3\n343#1:466,3\n351#1:472\n354#1:476\n*E\n"})
/* renamed from: androidx.compose.ui.draw.PainterNode, reason: from toString */
/* loaded from: classes2.dex */
final class PainterModifier extends Modifier.Node implements LayoutModifierNode, DrawModifierNode {
    private Alignment alignment;
    private float alpha;
    private ColorFilter colorFilter;
    private ContentScale contentScale;
    private Painter painter;
    private boolean sizeToIntrinsics;

    public /* synthetic */ PainterModifier(Painter painter, boolean z6, Alignment alignment, ContentScale contentScale, float f6, ColorFilter colorFilter, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(painter, z6, (i6 & 4) != 0 ? Alignment.INSTANCE.getCenter() : alignment, (i6 & 8) != 0 ? ContentScale.INSTANCE.getInside() : contentScale, (i6 & 16) != 0 ? 1.0f : f6, (i6 & 32) != 0 ? null : colorFilter);
    }

    /* renamed from: calculateScaledSize-E7KxVPU, reason: not valid java name */
    private final long m13521calculateScaledSizeE7KxVPU(long dstSize) {
        if (!getUseIntrinsicSize()) {
            return dstSize;
        }
        long jM13718constructorimpl = Size.m13718constructorimpl((Float.floatToRawIntBits(!m13523hasSpecifiedAndFiniteWidthuvyYCjk(this.painter.getIntrinsicSize()) ? Float.intBitsToFloat((int) (dstSize >> 32)) : Float.intBitsToFloat((int) (this.painter.getIntrinsicSize() >> 32))) << 32) | (Float.floatToRawIntBits(!m13522hasSpecifiedAndFiniteHeightuvyYCjk(this.painter.getIntrinsicSize()) ? Float.intBitsToFloat((int) (dstSize & 4294967295L)) : Float.intBitsToFloat((int) (this.painter.getIntrinsicSize() & 4294967295L))) & 4294967295L));
        return (Float.intBitsToFloat((int) (dstSize >> 32)) == 0.0f || Float.intBitsToFloat((int) (dstSize & 4294967295L)) == 0.0f) ? Size.INSTANCE.m13736getZeroNHjbRc() : ScaleFactorKt.m15351timesUQTWf7w(jM13718constructorimpl, this.contentScale.mo15240computeScaleFactorH7hwNQA(jM13718constructorimpl, dstSize));
    }

    private final boolean getUseIntrinsicSize() {
        return this.sizeToIntrinsics && this.painter.getIntrinsicSize() != InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: hasSpecifiedAndFiniteHeight-uvyYCjk, reason: not valid java name */
    private final boolean m13522hasSpecifiedAndFiniteHeightuvyYCjk(long j6) {
        return !Size.m13723equalsimpl0(j6, Size.INSTANCE.m13735getUnspecifiedNHjbRc()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j6 & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* renamed from: hasSpecifiedAndFiniteWidth-uvyYCjk, reason: not valid java name */
    private final boolean m13523hasSpecifiedAndFiniteWidthuvyYCjk(long j6) {
        return !Size.m13723equalsimpl0(j6, Size.INSTANCE.m13735getUnspecifiedNHjbRc()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j6 >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    private final long m13524modifyConstraintsZezNO4M(long constraints) {
        boolean z6 = false;
        boolean z7 = Constraints.m16433getHasBoundedWidthimpl(constraints) && Constraints.m16432getHasBoundedHeightimpl(constraints);
        if (Constraints.m16435getHasFixedWidthimpl(constraints) && Constraints.m16434getHasFixedHeightimpl(constraints)) {
            z6 = true;
        }
        if ((!getUseIntrinsicSize() && z7) || z6) {
            return Constraints.m16427copyZbe2FdA$default(constraints, Constraints.m16437getMaxWidthimpl(constraints), 0, Constraints.m16436getMaxHeightimpl(constraints), 0, 10, null);
        }
        long jMo14570getIntrinsicSizeNHjbRc = this.painter.getIntrinsicSize();
        int iRound = m13523hasSpecifiedAndFiniteWidthuvyYCjk(jMo14570getIntrinsicSizeNHjbRc) ? Math.round(Float.intBitsToFloat((int) (jMo14570getIntrinsicSizeNHjbRc >> 32))) : Constraints.m16439getMinWidthimpl(constraints);
        int iRound2 = m13522hasSpecifiedAndFiniteHeightuvyYCjk(jMo14570getIntrinsicSizeNHjbRc) ? Math.round(Float.intBitsToFloat((int) (jMo14570getIntrinsicSizeNHjbRc & 4294967295L))) : Constraints.m16438getMinHeightimpl(constraints);
        int iM16454constrainWidthK40F9xA = ConstraintsKt.m16454constrainWidthK40F9xA(constraints, iRound);
        long jM13521calculateScaledSizeE7KxVPU = m13521calculateScaledSizeE7KxVPU(Size.m13718constructorimpl((Float.floatToRawIntBits(ConstraintsKt.m16453constrainHeightK40F9xA(constraints, iRound2)) & 4294967295L) | (Float.floatToRawIntBits(iM16454constrainWidthK40F9xA) << 32)));
        return Constraints.m16427copyZbe2FdA$default(constraints, ConstraintsKt.m16454constrainWidthK40F9xA(constraints, Math.round(Float.intBitsToFloat((int) (jM13521calculateScaledSizeE7KxVPU >> 32)))), 0, ConstraintsKt.m16453constrainHeightK40F9xA(constraints, Math.round(Float.intBitsToFloat((int) (jM13521calculateScaledSizeE7KxVPU & 4294967295L)))), 0, 10, null);
    }

    @Override // androidx.compose.p009ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        long jMo14570getIntrinsicSizeNHjbRc = this.painter.getIntrinsicSize();
        float fIntBitsToFloat = m13523hasSpecifiedAndFiniteWidthuvyYCjk(jMo14570getIntrinsicSizeNHjbRc) ? Float.intBitsToFloat((int) (jMo14570getIntrinsicSizeNHjbRc >> 32)) : Float.intBitsToFloat((int) (contentDrawScope.mo14450getSizeNHjbRc() >> 32));
        float fIntBitsToFloat2 = m13522hasSpecifiedAndFiniteHeightuvyYCjk(jMo14570getIntrinsicSizeNHjbRc) ? Float.intBitsToFloat((int) (jMo14570getIntrinsicSizeNHjbRc & 4294967295L)) : Float.intBitsToFloat((int) (contentDrawScope.mo14450getSizeNHjbRc() & 4294967295L));
        long jM13718constructorimpl = Size.m13718constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
        long jM13736getZeroNHjbRc = (Float.intBitsToFloat((int) (contentDrawScope.mo14450getSizeNHjbRc() >> 32)) == 0.0f || Float.intBitsToFloat((int) (contentDrawScope.mo14450getSizeNHjbRc() & 4294967295L)) == 0.0f) ? Size.INSTANCE.m13736getZeroNHjbRc() : ScaleFactorKt.m15351timesUQTWf7w(jM13718constructorimpl, this.contentScale.mo15240computeScaleFactorH7hwNQA(jM13718constructorimpl, contentDrawScope.mo14450getSizeNHjbRc()));
        long jMo13475alignKFBX0sM = this.alignment.mo13475alignKFBX0sM(IntSize.m16650constructorimpl((Math.round(Float.intBitsToFloat((int) (jM13736getZeroNHjbRc & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (jM13736getZeroNHjbRc >> 32))) << 32)), IntSize.m16650constructorimpl((Math.round(Float.intBitsToFloat((int) (contentDrawScope.mo14450getSizeNHjbRc() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (contentDrawScope.mo14450getSizeNHjbRc() & 4294967295L))) & 4294967295L)), contentDrawScope.getLayoutDirection());
        float fM16612getXimpl = IntOffset.m16612getXimpl(jMo13475alignKFBX0sM);
        float fM16613getYimpl = IntOffset.m16613getYimpl(jMo13475alignKFBX0sM);
        contentDrawScope.getDrawContext().getTransform().translate(fM16612getXimpl, fM16613getYimpl);
        try {
            this.painter.m14576drawx_KDEd0(contentDrawScope, jM13736getZeroNHjbRc, this.alpha, this.colorFilter);
            contentDrawScope.getDrawContext().getTransform().translate(-fM16612getXimpl, -fM16613getYimpl);
            contentDrawScope.drawContent();
        } catch (Throwable th) {
            contentDrawScope.getDrawContext().getTransform().translate(-fM16612getXimpl, -fM16613getYimpl);
            throw th;
        }
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

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    @Override // androidx.compose.p009ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i6) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.maxIntrinsicHeight(i6);
        }
        long jM13524modifyConstraintsZezNO4M = m13524modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i6, 0, 0, 13, null));
        return Math.max(Constraints.m16438getMinHeightimpl(jM13524modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicHeight(i6));
    }

    @Override // androidx.compose.p009ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i6) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.maxIntrinsicWidth(i6);
        }
        long jM13524modifyConstraintsZezNO4M = m13524modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i6, 7, null));
        return Math.max(Constraints.m16439getMinWidthimpl(jM13524modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicWidth(i6));
    }

    @Override // androidx.compose.p009ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo9939measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j6) {
        final Placeable placeableMo15247measureBRTryo0 = measurable.mo15247measureBRTryo0(m13524modifyConstraintsZezNO4M(j6));
        return MeasureScope.layout$default(measureScope, placeableMo15247measureBRTryo0.getWidth(), placeableMo15247measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.draw.PainterNode$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo15247measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.p009ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i6) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.minIntrinsicHeight(i6);
        }
        long jM13524modifyConstraintsZezNO4M = m13524modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i6, 0, 0, 13, null));
        return Math.max(Constraints.m16438getMinHeightimpl(jM13524modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicHeight(i6));
    }

    @Override // androidx.compose.p009ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i6) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.minIntrinsicWidth(i6);
        }
        long jM13524modifyConstraintsZezNO4M = m13524modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i6, 7, null));
        return Math.max(Constraints.m16439getMinWidthimpl(jM13524modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicWidth(i6));
    }

    public final void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public final void setAlpha(float f6) {
        this.alpha = f6;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    public final void setContentScale(ContentScale contentScale) {
        this.contentScale = contentScale;
    }

    public final void setPainter(Painter painter) {
        this.painter = painter;
    }

    public final void setSizeToIntrinsics(boolean z6) {
        this.sizeToIntrinsics = z6;
    }

    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    public PainterModifier(Painter painter, boolean z6, Alignment alignment, ContentScale contentScale, float f6, ColorFilter colorFilter) {
        this.painter = painter;
        this.sizeToIntrinsics = z6;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f6;
        this.colorFilter = colorFilter;
    }
}
