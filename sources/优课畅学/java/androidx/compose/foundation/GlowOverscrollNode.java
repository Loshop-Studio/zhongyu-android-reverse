package androidx.compose.foundation;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p013ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.node.DelegatableNode;
import androidx.compose.p013ui.node.DelegatingNode;
import androidx.compose.p013ui.node.DrawModifierNode;
import p322z7.AbstractC10729c;

/* loaded from: classes.dex */
final class GlowOverscrollNode extends DelegatingNode implements DrawModifierNode {
    private final EdgeEffectWrapper edgeEffectWrapper;
    private final PaddingValues glowDrawPadding;
    private final AndroidEdgeEffectOverscrollEffect overscrollEffect;

    public GlowOverscrollNode(DelegatableNode delegatableNode, AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, EdgeEffectWrapper edgeEffectWrapper, PaddingValues paddingValues) {
        this.overscrollEffect = androidEdgeEffectOverscrollEffect;
        this.edgeEffectWrapper = edgeEffectWrapper;
        this.glowDrawPadding = paddingValues;
        delegate(delegatableNode);
    }

    private final boolean drawBottomGlow(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        float fMo20497toPx0680j_4 = drawScope.mo20497toPx0680j_4(this.glowDrawPadding.mo20805calculateBottomPaddingD9Ej5fM());
        float f10 = -Float.intBitsToFloat((int) (drawScope.mo24827getSizeNHjbRc() >> 32));
        float f11 = (-Float.intBitsToFloat((int) (drawScope.mo24827getSizeNHjbRc() & 4294967295L))) + fMo20497toPx0680j_4;
        return m20406drawWithRotationAndOffsetubNVwUQ(180.0f, Offset.m24027constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L)), edgeEffect, canvas);
    }

    private final boolean drawLeftGlow(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        float f10 = -Float.intBitsToFloat((int) (drawScope.mo24827getSizeNHjbRc() & 4294967295L));
        float fMo20497toPx0680j_4 = drawScope.mo20497toPx0680j_4(this.glowDrawPadding.mo20806calculateLeftPaddingu2uoSUM(drawScope.getLayoutDirection()));
        return m20406drawWithRotationAndOffsetubNVwUQ(270.0f, Offset.m24027constructorimpl((Float.floatToRawIntBits(f10) << 32) | (4294967295L & Float.floatToRawIntBits(fMo20497toPx0680j_4))), edgeEffect, canvas);
    }

    private final boolean drawRightGlow(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        float fMo20497toPx0680j_4 = (-AbstractC10729c.m20035d(Float.intBitsToFloat((int) (drawScope.mo24827getSizeNHjbRc() >> 32)))) + drawScope.mo20497toPx0680j_4(this.glowDrawPadding.mo20807calculateRightPaddingu2uoSUM(drawScope.getLayoutDirection()));
        return m20406drawWithRotationAndOffsetubNVwUQ(90.0f, Offset.m24027constructorimpl((Float.floatToRawIntBits(fMo20497toPx0680j_4) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32)), edgeEffect, canvas);
    }

    private final boolean drawTopGlow(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        float fMo20497toPx0680j_4 = drawScope.mo20497toPx0680j_4(this.glowDrawPadding.mo20808calculateTopPaddingD9Ej5fM());
        return m20406drawWithRotationAndOffsetubNVwUQ(0.0f, Offset.m24027constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fMo20497toPx0680j_4) & 4294967295L)), edgeEffect, canvas);
    }

    /* renamed from: drawWithRotationAndOffset-ubNVwUQ, reason: not valid java name */
    private final boolean m20406drawWithRotationAndOffsetubNVwUQ(float f10, long j10, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f10);
        canvas.translate(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // androidx.compose.p013ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        this.overscrollEffect.m20329updateSizeuvyYCjk$foundation_release(contentDrawScope.mo24827getSizeNHjbRc());
        if (Size.m24106isEmptyimpl(contentDrawScope.mo24827getSizeNHjbRc())) {
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
