package androidx.compose.material.ripple;

import android.view.View;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p013ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p013ui.graphics.Canvas;
import androidx.compose.p013ui.graphics.ColorProducer;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p013ui.node.DrawModifierNodeKt;
import androidx.compose.p013ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u000eJ*\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010 \u001a\u00020\u0010H\u0002J\b\u0010!\u001a\u00020\u0017H\u0016J\b\u0010\"\u001a\u00020\u0017H\u0016J\u0010\u0010#\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\f\u0010$\u001a\u00020\u0017*\u00020%H\u0016R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, m13558d2 = {"Landroidx/compose/material/ripple/AndroidRippleNode;", "Landroidx/compose/material/ripple/RippleNode;", "Landroidx/compose/material/ripple/RippleHostKey;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "bounded", "", "radius", "Landroidx/compose/ui/unit/Dp;", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/ColorProducer;", "rippleAlpha", "Lkotlin/Function0;", "Landroidx/compose/material/ripple/RippleAlpha;", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "rippleContainer", "Landroidx/compose/material/ripple/RippleContainer;", "value", "Landroidx/compose/material/ripple/RippleHostView;", "rippleHostView", "setRippleHostView", "(Landroidx/compose/material/ripple/RippleHostView;)V", "addRipple", "", "interaction", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "size", "Landroidx/compose/ui/geometry/Size;", "targetRadius", "", "addRipple-12SF9DM", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;JF)V", "getOrCreateRippleContainer", "onDetach", "onResetRippleHostView", "removeRipple", "drawRipples", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "material-ripple_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nRipple.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/AndroidRippleNode\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,362:1\n256#2:363\n1#3:364\n*S KotlinDebug\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/AndroidRippleNode\n*L\n120#1:363\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidRippleNode extends RippleNode implements RippleHostKey {
    public static final int $stable = 8;
    private RippleContainer rippleContainer;
    private RippleHostView rippleHostView;

    public /* synthetic */ AndroidRippleNode(InteractionSource interactionSource, boolean z9, float f10, ColorProducer colorProducer, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(interactionSource, z9, f10, colorProducer, function0);
    }

    private final RippleContainer getOrCreateRippleContainer() {
        RippleContainer rippleContainer = this.rippleContainer;
        if (rippleContainer != null) {
            Intrinsics.checkNotNull(rippleContainer);
            return rippleContainer;
        }
        RippleContainer rippleContainerCreateAndAttachRippleContainerIfNeeded = Ripple_androidKt.createAndAttachRippleContainerIfNeeded(Ripple_androidKt.findNearestViewGroup((View) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, AndroidCompositionLocals_androidKt.getLocalView())));
        this.rippleContainer = rippleContainerCreateAndAttachRippleContainerIfNeeded;
        Intrinsics.checkNotNull(rippleContainerCreateAndAttachRippleContainerIfNeeded);
        return rippleContainerCreateAndAttachRippleContainerIfNeeded;
    }

    private final void setRippleHostView(RippleHostView rippleHostView) {
        this.rippleHostView = rippleHostView;
        DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    /* renamed from: addRipple-12SF9DM, reason: not valid java name */
    public void mo18472addRipple12SF9DM(PressInteraction.Press interaction, long size, float targetRadius) {
        RippleHostView rippleHostView = getOrCreateRippleContainer().getRippleHostView(this);
        rippleHostView.m18479addRippleKOepWvA(interaction, getBounded(), size, MathKt.roundToInt(targetRadius), m18484getRippleColor0d7_KjU(), getRippleAlpha().invoke().getPressedAlpha(), new Function0<Unit>() { // from class: androidx.compose.material.ripple.AndroidRippleNode$addRipple$1$1$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                DrawModifierNodeKt.invalidateDraw(this.this$0);
            }
        });
        setRippleHostView(rippleHostView);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void drawRipples(DrawScope drawScope) {
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        RippleHostView rippleHostView = this.rippleHostView;
        if (rippleHostView != null) {
            rippleHostView.m18480setRipplePropertiesbiQXAtU(getRippleSize(), MathKt.roundToInt(getTargetRadius()), m18484getRippleColor0d7_KjU(), getRippleAlpha().invoke().getPressedAlpha());
            rippleHostView.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas));
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        RippleContainer rippleContainer = this.rippleContainer;
        if (rippleContainer != null) {
            rippleContainer.disposeRippleIfNeeded(this);
        }
    }

    @Override // androidx.compose.material.ripple.RippleHostKey
    public void onResetRippleHostView() {
        setRippleHostView(null);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void removeRipple(PressInteraction.Press interaction) {
        RippleHostView rippleHostView = this.rippleHostView;
        if (rippleHostView != null) {
            rippleHostView.removeRipple();
        }
    }

    private AndroidRippleNode(InteractionSource interactionSource, boolean z9, float f10, ColorProducer colorProducer, Function0<RippleAlpha> function0) {
        super(interactionSource, z9, f10, colorProducer, function0, null);
    }
}
