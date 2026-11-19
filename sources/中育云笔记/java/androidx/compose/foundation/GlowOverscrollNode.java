package androidx.compose.foundation;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p014ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.node.DelegatableNode;
import androidx.compose.p014ui.node.DelegatingNode;
import androidx.compose.p014ui.node.DrawModifierNode;
import p211jd.AbstractC9719c;

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
        float fMo27099toPx0680j_4 = drawScope.mo27099toPx0680j_4(this.glowDrawPadding.mo27407calculateBottomPaddingD9Ej5fM());
        float f10 = -Float.intBitsToFloat((int) (drawScope.mo31429getSizeNHjbRc() >> 32));
        float f11 = (-Float.intBitsToFloat((int) (drawScope.mo31429getSizeNHjbRc() & 4294967295L))) + fMo27099toPx0680j_4;
        return m27008drawWithRotationAndOffsetubNVwUQ(180.0f, Offset.m30629constructorimpl((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L)), edgeEffect, canvas);
    }

    private final boolean drawLeftGlow(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        float f10 = -Float.intBitsToFloat((int) (drawScope.mo31429getSizeNHjbRc() & 4294967295L));
        float fMo27099toPx0680j_4 = drawScope.mo27099toPx0680j_4(this.glowDrawPadding.mo27408calculateLeftPaddingu2uoSUM(drawScope.getLayoutDirection()));
        return m27008drawWithRotationAndOffsetubNVwUQ(270.0f, Offset.m30629constructorimpl((Float.floatToRawIntBits(f10) << 32) | (4294967295L & Float.floatToRawIntBits(fMo27099toPx0680j_4))), edgeEffect, canvas);
    }

    private final boolean drawRightGlow(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        float fMo27099toPx0680j_4 = (-AbstractC9719c.m19282d(Float.intBitsToFloat((int) (drawScope.mo31429getSizeNHjbRc() >> 32)))) + drawScope.mo27099toPx0680j_4(this.glowDrawPadding.mo27409calculateRightPaddingu2uoSUM(drawScope.getLayoutDirection()));
        return m27008drawWithRotationAndOffsetubNVwUQ(90.0f, Offset.m30629constructorimpl((Float.floatToRawIntBits(fMo27099toPx0680j_4) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32)), edgeEffect, canvas);
    }

    private final boolean drawTopGlow(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        float fMo27099toPx0680j_4 = drawScope.mo27099toPx0680j_4(this.glowDrawPadding.mo27410calculateTopPaddingD9Ej5fM());
        return m27008drawWithRotationAndOffsetubNVwUQ(0.0f, Offset.m30629constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fMo27099toPx0680j_4) & 4294967295L)), edgeEffect, canvas);
    }

    /* renamed from: drawWithRotationAndOffset-ubNVwUQ, reason: not valid java name */
    private final boolean m27008drawWithRotationAndOffsetubNVwUQ(float f10, long j10, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f10);
        canvas.translate(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // androidx.compose.p014ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        this.overscrollEffect.m26931updateSizeuvyYCjk$foundation_release(contentDrawScope.mo31429getSizeNHjbRc());
        if (Size.m30708isEmptyimpl(contentDrawScope.mo31429getSizeNHjbRc())) {
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
