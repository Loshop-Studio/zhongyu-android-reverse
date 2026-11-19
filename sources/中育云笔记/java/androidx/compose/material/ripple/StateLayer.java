package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.graphics.ClipOp;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.drawscope.DrawContext;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p325rc.AbstractC10947g0;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;

/* loaded from: classes2.dex */
final class StateLayer {
    private final boolean bounded;
    private Interaction currentInteraction;
    private final InterfaceC9529a rippleAlpha;
    private final Animatable<Float, AnimationVector1D> animatedAlpha = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
    private final List<Interaction> interactions = new ArrayList();

    public StateLayer(boolean z10, InterfaceC9529a interfaceC9529a) {
        this.bounded = z10;
        this.rippleAlpha = interfaceC9529a;
    }

    /* renamed from: drawStateLayer-mxwnekA, reason: not valid java name */
    public final void m28331drawStateLayermxwnekA(DrawScope drawScope, float f10, long j10) throws Throwable {
        long j11;
        float fFloatValue = this.animatedAlpha.getValue().floatValue();
        if (fFloatValue <= 0.0f) {
            return;
        }
        long jM30877copywmQWz5c$default = Color.m30877copywmQWz5c$default(j10, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!this.bounded) {
            DrawScope.m31410drawCircleVaOC9Bg$default(drawScope, jM30877copywmQWz5c$default, f10, 0L, 0.0f, null, null, 0, 124, null);
            return;
        }
        float fM30706getWidthimpl = Size.m30706getWidthimpl(drawScope.mo31429getSizeNHjbRc());
        float fM30703getHeightimpl = Size.m30703getHeightimpl(drawScope.mo31429getSizeNHjbRc());
        int iM30867getIntersectrtfAjoo = ClipOp.Companion.m30867getIntersectrtfAjoo();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo31350getSizeNHjbRc = drawContext.mo31350getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo31353clipRectN_I0leg(0.0f, 0.0f, fM30706getWidthimpl, fM30703getHeightimpl, iM30867getIntersectrtfAjoo);
            j11 = jMo31350getSizeNHjbRc;
            try {
                DrawScope.m31410drawCircleVaOC9Bg$default(drawScope, jM30877copywmQWz5c$default, f10, 0L, 0.0f, null, null, 0, 124, null);
                drawContext.getCanvas().restore();
                drawContext.mo31351setSizeuvyYCjk(j11);
            } catch (Throwable th) {
                th = th;
                drawContext.getCanvas().restore();
                drawContext.mo31351setSizeuvyYCjk(j11);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            j11 = jMo31350getSizeNHjbRc;
        }
    }

    public final void handleInteraction$material_ripple_release(Interaction interaction, InterfaceC11122i0 interfaceC11122i0) {
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
        Interaction interaction2 = (Interaction) AbstractC10947g0.m23957z0(this.interactions);
        if (AbstractC9979u.m20289b(this.currentInteraction, interaction2)) {
            return;
        }
        if (interaction2 != null) {
            RippleAlpha rippleAlpha = (RippleAlpha) this.rippleAlpha.invoke();
            AbstractC11117h.m24726d(interfaceC11122i0, null, null, new StateLayer$handleInteraction$1(this, z10 ? rippleAlpha.getHoveredAlpha() : interaction instanceof FocusInteraction.Focus ? rippleAlpha.getFocusedAlpha() : interaction instanceof DragInteraction.Start ? rippleAlpha.getDraggedAlpha() : 0.0f, RippleKt.incomingStateLayerAnimationSpecFor(interaction2), null), 3, null);
        } else {
            AbstractC11117h.m24726d(interfaceC11122i0, null, null, new StateLayer$handleInteraction$2(this, RippleKt.outgoingStateLayerAnimationSpecFor(this.currentInteraction), null), 3, null);
        }
        this.currentInteraction = interaction2;
    }
}
