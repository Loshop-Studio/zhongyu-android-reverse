package androidx.compose.material.ripple;

import androidx.collection.AbstractC0584a;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.ClipOp;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.DrawContext;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0018\u001a\u00020\r*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, m5110d2 = {"Landroidx/compose/material/ripple/StateLayer;", "", "", "bounded", "Lkotlin/Function0;", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "<init>", "(ZLr6/a;)V", "Landroidx/compose/foundation/interaction/Interaction;", "interaction", "Lkotlinx/coroutines/v;", "scope", "Ld6/s;", "handleInteraction$material_ripple_release", "(Landroidx/compose/foundation/interaction/Interaction;Lkotlinx/coroutines/v;)V", "handleInteraction", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "radius", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "drawStateLayer-mxwnekA", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJ)V", "drawStateLayer", "Z", "Lr6/a;", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "animatedAlpha", "Landroidx/compose/animation/core/Animatable;", "", "interactions", "Ljava/util/List;", "currentInteraction", "Landroidx/compose/foundation/interaction/Interaction;", "material-ripple_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/StateLayer\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,530:1\n225#2,8:531\n272#2,14:539\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/StateLayer\n*L\n497#1:531,8\n497#1:539,14\n*E\n"})
/* loaded from: classes.dex */
final class StateLayer {
    private final boolean bounded;

    @Nullable
    private Interaction currentInteraction;

    @NotNull
    private final InterfaceC6469a rippleAlpha;

    @NotNull
    private final Animatable<Float, AnimationVector1D> animatedAlpha = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);

    @NotNull
    private final List<Interaction> interactions = new ArrayList();

    public StateLayer(boolean z8, @NotNull InterfaceC6469a interfaceC6469a) {
        this.bounded = z8;
        this.rippleAlpha = interfaceC6469a;
    }

    /* renamed from: drawStateLayer-mxwnekA, reason: not valid java name */
    public final void m8135drawStateLayermxwnekA(@NotNull DrawScope drawScope, float f, long j7) throws Throwable {
        long j8;
        float fFloatValue = this.animatedAlpha.getValue().floatValue();
        if (fFloatValue <= 0.0f) {
            return;
        }
        long jM10681copywmQWz5c$default = Color.m10681copywmQWz5c$default(j7, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!this.bounded) {
            DrawScope.m11214drawCircleVaOC9Bg$default(drawScope, jM10681copywmQWz5c$default, f, 0L, 0.0f, null, null, 0, 124, null);
            return;
        }
        float fM10510getWidthimpl = Size.m10510getWidthimpl(drawScope.mo11233getSizeNHjbRc());
        float fM10507getHeightimpl = Size.m10507getHeightimpl(drawScope.mo11233getSizeNHjbRc());
        int iM10671getIntersectrtfAjoo = ClipOp.INSTANCE.m10671getIntersectrtfAjoo();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo11154getSizeNHjbRc = drawContext.mo11154getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo11157clipRectN_I0leg(0.0f, 0.0f, fM10510getWidthimpl, fM10507getHeightimpl, iM10671getIntersectrtfAjoo);
            j8 = jMo11154getSizeNHjbRc;
            try {
                DrawScope.m11214drawCircleVaOC9Bg$default(drawScope, jM10681copywmQWz5c$default, f, 0L, 0.0f, null, null, 0, 124, null);
                AbstractC0584a.m921v(drawContext, j8);
            } catch (Throwable th) {
                th = th;
                AbstractC0584a.m921v(drawContext, j8);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            j8 = jMo11154getSizeNHjbRc;
        }
    }

    public final void handleInteraction$material_ripple_release(@NotNull Interaction interaction, @NotNull InterfaceC6009v scope) {
        boolean z8 = interaction instanceof HoverInteraction.Enter;
        if (z8) {
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
        Interaction interaction2 = (Interaction) AbstractC5805t.m5236p0(this.interactions);
        if (AbstractC5830k.m5325b(this.currentInteraction, interaction2)) {
            return;
        }
        if (interaction2 != null) {
            RippleAlpha rippleAlpha = (RippleAlpha) this.rippleAlpha.invoke();
            AbstractC6014x.m5651v(scope, null, null, new StateLayer$handleInteraction$1(this, z8 ? rippleAlpha.getHoveredAlpha() : interaction instanceof FocusInteraction.Focus ? rippleAlpha.getFocusedAlpha() : interaction instanceof DragInteraction.Start ? rippleAlpha.getDraggedAlpha() : 0.0f, RippleKt.incomingStateLayerAnimationSpecFor(interaction2), null), 3);
        } else {
            AbstractC6014x.m5651v(scope, null, null, new StateLayer$handleInteraction$2(this, RippleKt.outgoingStateLayerAnimationSpecFor(this.currentInteraction), null), 3);
        }
        this.currentInteraction = interaction2;
    }
}
