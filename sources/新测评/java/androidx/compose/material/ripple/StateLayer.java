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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u001d\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0015J$\u0010\u0016\u001a\u00020\u0011*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001aø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, m13558d2 = {"Landroidx/compose/material/ripple/StateLayer;", "", "bounded", "", "rippleAlpha", "Lkotlin/Function0;", "Landroidx/compose/material/ripple/RippleAlpha;", "(ZLkotlin/jvm/functions/Function0;)V", "animatedAlpha", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "currentInteraction", "Landroidx/compose/foundation/interaction/Interaction;", "interactions", "", "handleInteraction", "", "interaction", "scope", "Lkotlinx/coroutines/CoroutineScope;", "handleInteraction$material_ripple_release", "drawStateLayer", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "radius", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Color;", "drawStateLayer-mxwnekA", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJ)V", "material-ripple_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/StateLayer\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,530:1\n225#2,8:531\n272#2,14:539\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/StateLayer\n*L\n497#1:531,8\n497#1:539,14\n*E\n"})
/* loaded from: classes2.dex */
final class StateLayer {
    private final boolean bounded;
    private Interaction currentInteraction;
    private final Function0<RippleAlpha> rippleAlpha;
    private final Animatable<Float, AnimationVector1D> animatedAlpha = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
    private final List<Interaction> interactions = new ArrayList();

    public StateLayer(boolean z9, Function0<RippleAlpha> function0) {
        this.bounded = z9;
        this.rippleAlpha = function0;
    }

    /* renamed from: drawStateLayer-mxwnekA, reason: not valid java name */
    public final void m18489drawStateLayermxwnekA(DrawScope drawScope, float f10, long j10) throws Throwable {
        long j11;
        float fFloatValue = this.animatedAlpha.getValue().floatValue();
        if (fFloatValue <= 0.0f) {
            return;
        }
        long jM20975copywmQWz5c$default = Color.m20975copywmQWz5c$default(j10, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!this.bounded) {
            DrawScope.m21508drawCircleVaOC9Bg$default(drawScope, jM20975copywmQWz5c$default, f10, 0L, 0.0f, null, null, 0, 124, null);
            return;
        }
        float fM20804getWidthimpl = Size.m20804getWidthimpl(drawScope.mo21527getSizeNHjbRc());
        float fM20801getHeightimpl = Size.m20801getHeightimpl(drawScope.mo21527getSizeNHjbRc());
        int iM20965getIntersectrtfAjoo = ClipOp.INSTANCE.m20965getIntersectrtfAjoo();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo21448getSizeNHjbRc = drawContext.mo21448getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo21451clipRectN_I0leg(0.0f, 0.0f, fM20804getWidthimpl, fM20801getHeightimpl, iM20965getIntersectrtfAjoo);
            j11 = jMo21448getSizeNHjbRc;
            try {
                DrawScope.m21508drawCircleVaOC9Bg$default(drawScope, jM20975copywmQWz5c$default, f10, 0L, 0.0f, null, null, 0, 124, null);
                drawContext.getCanvas().restore();
                drawContext.mo21449setSizeuvyYCjk(j11);
            } catch (Throwable th) {
                th = th;
                drawContext.getCanvas().restore();
                drawContext.mo21449setSizeuvyYCjk(j11);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            j11 = jMo21448getSizeNHjbRc;
        }
    }

    public final void handleInteraction$material_ripple_release(Interaction interaction, CoroutineScope scope) {
        boolean z9 = interaction instanceof HoverInteraction.Enter;
        if (z9) {
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
        Interaction interaction2 = (Interaction) CollectionsKt.lastOrNull((List) this.interactions);
        if (Intrinsics.areEqual(this.currentInteraction, interaction2)) {
            return;
        }
        if (interaction2 != null) {
            RippleAlpha rippleAlphaInvoke = this.rippleAlpha.invoke();
            BuildersKt__Builders_commonKt.launch$default(scope, null, null, new StateLayer$handleInteraction$1(this, z9 ? rippleAlphaInvoke.getHoveredAlpha() : interaction instanceof FocusInteraction.Focus ? rippleAlphaInvoke.getFocusedAlpha() : interaction instanceof DragInteraction.Start ? rippleAlphaInvoke.getDraggedAlpha() : 0.0f, RippleKt.incomingStateLayerAnimationSpecFor(interaction2), null), 3, null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(scope, null, null, new StateLayer$handleInteraction$2(this, RippleKt.outgoingStateLayerAnimationSpecFor(this.currentInteraction), null), 3, null);
        }
        this.currentInteraction = interaction2;
    }
}
