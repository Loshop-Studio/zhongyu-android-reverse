package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.graphics.ClipOp;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.drawscope.DrawContext;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import com.tencent.smtt.sdk.TbsListener;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8778f0;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
final class StateLayer {
    private final boolean bounded;
    private Interaction currentInteraction;
    private final InterfaceC10559a rippleAlpha;
    private final Animatable<Float, AnimationVector1D> animatedAlpha = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
    private final List<Interaction> interactions = new ArrayList();

    public StateLayer(boolean z10, InterfaceC10559a interfaceC10559a) {
        this.bounded = z10;
        this.rippleAlpha = interfaceC10559a;
    }

    /* renamed from: drawStateLayer-mxwnekA, reason: not valid java name */
    public final void m21729drawStateLayermxwnekA(DrawScope drawScope, float f10, long j10) throws Throwable {
        long j11;
        float fFloatValue = this.animatedAlpha.getValue().floatValue();
        if (fFloatValue <= 0.0f) {
            return;
        }
        long jM24275copywmQWz5c$default = Color.m24275copywmQWz5c$default(j10, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!this.bounded) {
            DrawScope.m24808drawCircleVaOC9Bg$default(drawScope, jM24275copywmQWz5c$default, f10, 0L, 0.0f, null, null, 0, TbsListener.ErrorCode.DOWNLOAD_REDIRECT_EMPTY, null);
            return;
        }
        float fM24104getWidthimpl = Size.m24104getWidthimpl(drawScope.mo24827getSizeNHjbRc());
        float fM24101getHeightimpl = Size.m24101getHeightimpl(drawScope.mo24827getSizeNHjbRc());
        int iM24265getIntersectrtfAjoo = ClipOp.Companion.m24265getIntersectrtfAjoo();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo24748getSizeNHjbRc = drawContext.mo24748getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo24751clipRectN_I0leg(0.0f, 0.0f, fM24104getWidthimpl, fM24101getHeightimpl, iM24265getIntersectrtfAjoo);
            j11 = jMo24748getSizeNHjbRc;
            try {
                DrawScope.m24808drawCircleVaOC9Bg$default(drawScope, jM24275copywmQWz5c$default, f10, 0L, 0.0f, null, null, 0, TbsListener.ErrorCode.DOWNLOAD_REDIRECT_EMPTY, null);
                drawContext.getCanvas().restore();
                drawContext.mo24749setSizeuvyYCjk(j11);
            } catch (Throwable th) {
                th = th;
                drawContext.getCanvas().restore();
                drawContext.mo24749setSizeuvyYCjk(j11);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            j11 = jMo24748getSizeNHjbRc;
        }
    }

    public final void handleInteraction$material_ripple_release(Interaction interaction, InterfaceC8822b0 interfaceC8822b0) {
        boolean z10 = interaction instanceof HoverInteraction.Enter;
        if (z10) {
            this.interactions.add(interaction);
        } else if (interaction instanceof HoverInteraction.Exit) {
            this.interactions.remove(((HoverInteraction.Exit) interaction).getEnter());
        } else if (interaction instanceof FocusInteraction.Focus) {
            this.interactions.add(interaction);
        } else if (interaction instanceof FocusInteraction.Unfocus) {
            this.interactions.remove(((FocusInteraction.Unfocus) interaction).getFocus());
        } else if (interaction instanceof DragInteraction.Start) {
            this.interactions.add(interaction);
        } else if (interaction instanceof DragInteraction.Stop) {
            this.interactions.remove(((DragInteraction.Stop) interaction).getStart());
        } else if (!(interaction instanceof DragInteraction.Cancel)) {
            return;
        } else {
            this.interactions.remove(((DragInteraction.Cancel) interaction).getStart());
        }
        Interaction interaction2 = (Interaction) AbstractC8778f0.m14579y0(this.interactions);
        if (AbstractC9133u.m16128b(this.currentInteraction, interaction2)) {
            return;
        }
        if (interaction2 != null) {
            RippleAlpha rippleAlpha = (RippleAlpha) this.rippleAlpha.invoke();
            AbstractC8839h.m14861d(interfaceC8822b0, null, null, new StateLayer$handleInteraction$1(this, z10 ? rippleAlpha.getHoveredAlpha() : interaction instanceof FocusInteraction.Focus ? rippleAlpha.getFocusedAlpha() : interaction instanceof DragInteraction.Start ? rippleAlpha.getDraggedAlpha() : 0.0f, RippleKt.incomingStateLayerAnimationSpecFor(interaction2), null), 3, null);
        } else {
            AbstractC8839h.m14861d(interfaceC8822b0, null, null, new StateLayer$handleInteraction$2(this, RippleKt.outgoingStateLayerAnimationSpecFor(this.currentInteraction), null), 3, null);
        }
        this.currentInteraction = interaction2;
    }
}
