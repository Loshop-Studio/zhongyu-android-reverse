package androidx.compose.foundation;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.node.DelegatableNode;
import androidx.compose.p011ui.node.DelegatingNode;
import androidx.compose.p011ui.node.DrawModifierNode;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p169t6.AbstractC6600a;

@Metadata(m5109d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0014\u001a\u00020\u0013*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\u00020\u0013*\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J'\u0010\u0019\u001a\u00020\u0013*\u00020\r2\u0006\u0010\u0018\u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u0015J'\u0010\u001b\u001a\u00020\u0013*\u00020\r2\u0006\u0010\u001a\u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u0015J6\u0010#\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0013\u0010&\u001a\u00020%*\u00020$H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010)R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010*\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006+"}, m5110d2 = {"Landroidx/compose/foundation/GlowOverscrollNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/DelegatableNode;", "pointerInputNode", "Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "overscrollEffect", "Landroidx/compose/foundation/EdgeEffectWrapper;", "edgeEffectWrapper", "Landroidx/compose/foundation/layout/PaddingValues;", "glowDrawPadding", "<init>", "(Landroidx/compose/ui/node/DelegatableNode;Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;Landroidx/compose/foundation/EdgeEffectWrapper;Landroidx/compose/foundation/layout/PaddingValues;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroid/widget/EdgeEffect;", "left", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "canvas", "", "drawLeftGlow", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "top", "drawTopGlow", "right", "drawRightGlow", "bottom", "drawBottomGlow", "", "rotationDegrees", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "edgeEffect", "drawWithRotationAndOffset-ubNVwUQ", "(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "drawWithRotationAndOffset", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Ld6/s;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "Landroidx/compose/foundation/EdgeEffectWrapper;", "Landroidx/compose/foundation/layout/PaddingValues;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/GlowOverscrollNode\n+ 2 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n1#1,1073:1\n61#2:1074\n57#2:1085\n57#2:1092\n61#2:1095\n70#3:1075\n53#3,3:1078\n53#3,3:1082\n60#3:1086\n53#3,3:1089\n60#3:1093\n70#3:1096\n53#3,3:1098\n60#3:1102\n70#3:1105\n22#4:1076\n22#4:1087\n22#4:1094\n22#4:1103\n30#5:1077\n30#5:1081\n30#5:1088\n30#5:1097\n65#6:1101\n69#6:1104\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/GlowOverscrollNode\n*L\n461#1:1074\n481#1:1085\n494#1:1092\n494#1:1095\n461#1:1075\n461#1:1078,3\n471#1:1082,3\n481#1:1086\n483#1:1089,3\n494#1:1093\n494#1:1096\n494#1:1098,3\n511#1:1102\n511#1:1105\n461#1:1076\n481#1:1087\n494#1:1094\n511#1:1103\n461#1:1077\n471#1:1081\n483#1:1088\n494#1:1097\n511#1:1101\n511#1:1104\n*E\n"})
/* loaded from: classes.dex */
final class GlowOverscrollNode extends DelegatingNode implements DrawModifierNode {

    @NotNull
    private final EdgeEffectWrapper edgeEffectWrapper;

    @NotNull
    private final PaddingValues glowDrawPadding;

    @NotNull
    private final AndroidEdgeEffectOverscrollEffect overscrollEffect;

    public GlowOverscrollNode(@NotNull DelegatableNode delegatableNode, @NotNull AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, @NotNull EdgeEffectWrapper edgeEffectWrapper, @NotNull PaddingValues paddingValues) {
        this.overscrollEffect = androidEdgeEffectOverscrollEffect;
        this.edgeEffectWrapper = edgeEffectWrapper;
        this.glowDrawPadding = paddingValues;
        delegate(delegatableNode);
    }

    private final boolean drawBottomGlow(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        float fMo6903toPx0680j_4 = drawScope.mo6903toPx0680j_4(this.glowDrawPadding.getBottom());
        float f = -Float.intBitsToFloat((int) (drawScope.mo11233getSizeNHjbRc() >> 32));
        float f7 = (-Float.intBitsToFloat((int) (drawScope.mo11233getSizeNHjbRc() & 4294967295L))) + fMo6903toPx0680j_4;
        return m6812drawWithRotationAndOffsetubNVwUQ(180.0f, Offset.m10433constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L)), edgeEffect, canvas);
    }

    private final boolean drawLeftGlow(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        float f = -Float.intBitsToFloat((int) (drawScope.mo11233getSizeNHjbRc() & 4294967295L));
        float fMo6903toPx0680j_4 = drawScope.mo6903toPx0680j_4(this.glowDrawPadding.mo7212calculateLeftPaddingu2uoSUM(drawScope.getLayoutDirection()));
        return m6812drawWithRotationAndOffsetubNVwUQ(270.0f, Offset.m10433constructorimpl((Float.floatToRawIntBits(f) << 32) | (4294967295L & Float.floatToRawIntBits(fMo6903toPx0680j_4))), edgeEffect, canvas);
    }

    private final boolean drawRightGlow(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        float fMo6903toPx0680j_4 = drawScope.mo6903toPx0680j_4(this.glowDrawPadding.mo7213calculateRightPaddingu2uoSUM(drawScope.getLayoutDirection())) + (-AbstractC6600a.m6241q(Float.intBitsToFloat((int) (drawScope.mo11233getSizeNHjbRc() >> 32))));
        return m6812drawWithRotationAndOffsetubNVwUQ(90.0f, Offset.m10433constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fMo6903toPx0680j_4) & 4294967295L)), edgeEffect, canvas);
    }

    private final boolean drawTopGlow(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        float fMo6903toPx0680j_4 = drawScope.mo6903toPx0680j_4(this.glowDrawPadding.getTop());
        return m6812drawWithRotationAndOffsetubNVwUQ(0.0f, Offset.m10433constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fMo6903toPx0680j_4) & 4294967295L)), edgeEffect, canvas);
    }

    /* renamed from: drawWithRotationAndOffset-ubNVwUQ, reason: not valid java name */
    private final boolean m6812drawWithRotationAndOffsetubNVwUQ(float rotationDegrees, long offset, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(rotationDegrees);
        canvas.translate(Float.intBitsToFloat((int) (offset >> 32)), Float.intBitsToFloat((int) (offset & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // androidx.compose.p011ui.node.DrawModifierNode
    public void draw(@NotNull ContentDrawScope contentDrawScope) {
        this.overscrollEffect.m6735updateSizeuvyYCjk$foundation_release(contentDrawScope.mo11233getSizeNHjbRc());
        if (Size.m10512isEmptyimpl(contentDrawScope.mo11233getSizeNHjbRc())) {
            contentDrawScope.drawContent();
            return;
        }
        contentDrawScope.drawContent();
        this.overscrollEffect.getRedrawSignal$foundation_release().getValue();
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(contentDrawScope.getDrawContext().getCanvas());
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        boolean zDrawLeftGlow = edgeEffectWrapper.isLeftAnimating() ? drawLeftGlow(contentDrawScope, edgeEffectWrapper.getOrCreateLeftEffect(), nativeCanvas) : false;
        if (edgeEffectWrapper.isTopAnimating()) {
            zDrawLeftGlow = drawTopGlow(contentDrawScope, edgeEffectWrapper.getOrCreateTopEffect(), nativeCanvas) || zDrawLeftGlow;
        }
        if (edgeEffectWrapper.isRightAnimating()) {
            zDrawLeftGlow = drawRightGlow(contentDrawScope, edgeEffectWrapper.getOrCreateRightEffect(), nativeCanvas) || zDrawLeftGlow;
        }
        if (edgeEffectWrapper.isBottomAnimating()) {
            zDrawLeftGlow = drawBottomGlow(contentDrawScope, edgeEffectWrapper.getOrCreateBottomEffect(), nativeCanvas) || zDrawLeftGlow;
        }
        if (zDrawLeftGlow) {
            this.overscrollEffect.invalidateOverscroll$foundation_release();
        }
    }
}
