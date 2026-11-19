package androidx.compose.material.ripple;

import android.view.View;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p014ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p014ui.graphics.Canvas;
import androidx.compose.p014ui.graphics.ColorProducer;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p014ui.node.DrawModifierNodeKt;
import androidx.compose.p014ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p211jd.AbstractC9719c;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class AndroidRippleNode extends RippleNode implements RippleHostKey {
    public static final int $stable = 8;
    private RippleContainer rippleContainer;
    private RippleHostView rippleHostView;

    public /* synthetic */ AndroidRippleNode(InteractionSource interactionSource, boolean z10, float f10, ColorProducer colorProducer, InterfaceC9529a interfaceC9529a, AbstractC9972n abstractC9972n) {
        this(interactionSource, z10, f10, colorProducer, interfaceC9529a);
    }

    private final RippleContainer getOrCreateRippleContainer() {
        RippleContainer rippleContainer = this.rippleContainer;
        if (rippleContainer != null) {
            AbstractC9979u.m20291d(rippleContainer);
            return rippleContainer;
        }
        RippleContainer rippleContainerCreateAndAttachRippleContainerIfNeeded = Ripple_androidKt.createAndAttachRippleContainerIfNeeded(Ripple_androidKt.findNearestViewGroup((View) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, AndroidCompositionLocals_androidKt.getLocalView())));
        this.rippleContainer = rippleContainerCreateAndAttachRippleContainerIfNeeded;
        AbstractC9979u.m20291d(rippleContainerCreateAndAttachRippleContainerIfNeeded);
        return rippleContainerCreateAndAttachRippleContainerIfNeeded;
    }

    private final void setRippleHostView(RippleHostView rippleHostView) {
        this.rippleHostView = rippleHostView;
        DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    /* renamed from: addRipple-12SF9DM, reason: not valid java name */
    public void mo28313addRipple12SF9DM(PressInteraction.Press press, long j10, float f10) {
        RippleHostView rippleHostView = getOrCreateRippleContainer().getRippleHostView(this);
        rippleHostView.m28321addRippleKOepWvA(press, getBounded(), j10, AbstractC9719c.m19282d(f10), m28326getRippleColor0d7_KjU(), ((RippleAlpha) getRippleAlpha().invoke()).getPressedAlpha(), new InterfaceC9529a() { // from class: androidx.compose.material.ripple.AndroidRippleNode$addRipple$1$1$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m28314invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m28314invoke() {
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
            rippleHostView.m28322setRipplePropertiesbiQXAtU(m28327getRippleSizeNHjbRc(), AbstractC9719c.m19282d(getTargetRadius()), m28326getRippleColor0d7_KjU(), ((RippleAlpha) getRippleAlpha().invoke()).getPressedAlpha());
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
    public void removeRipple(PressInteraction.Press press) {
        RippleHostView rippleHostView = this.rippleHostView;
        if (rippleHostView != null) {
            rippleHostView.removeRipple();
        }
    }

    private AndroidRippleNode(InteractionSource interactionSource, boolean z10, float f10, ColorProducer colorProducer, InterfaceC9529a interfaceC9529a) {
        super(interactionSource, z10, f10, colorProducer, interfaceC9529a, null);
    }
}
