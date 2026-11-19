package androidx.compose.material.ripple;

import android.view.ViewGroup;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p014ui.graphics.Canvas;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p211jd.AbstractC9719c;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import sd.InterfaceC11122i0;

@StabilityInferred(parameters = 0)
@InterfaceC10770a
/* loaded from: classes2.dex */
public final class AndroidRippleIndicationInstance extends RippleIndicationInstance implements RememberObserver, RippleHostKey {
    public static final int $stable = 8;
    private final boolean bounded;
    private final State<Color> color;
    private final MutableState invalidateTick$delegate;
    private final InterfaceC9529a onInvalidateRipple;
    private final float radius;
    private final State<RippleAlpha> rippleAlpha;
    private RippleContainer rippleContainer;
    private final MutableState rippleHostView$delegate;
    private int rippleRadius;
    private long rippleSize;
    private final ViewGroup view;

    public /* synthetic */ AndroidRippleIndicationInstance(boolean z10, float f10, State state, State state2, ViewGroup viewGroup, AbstractC9972n abstractC9972n) {
        this(z10, f10, state, state2, viewGroup);
    }

    private final void dispose() {
        RippleContainer rippleContainer = this.rippleContainer;
        if (rippleContainer != null) {
            rippleContainer.disposeRippleIfNeeded(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getInvalidateTick() {
        return ((Boolean) this.invalidateTick$delegate.getValue()).booleanValue();
    }

    private final RippleContainer getOrCreateRippleContainer() {
        RippleContainer rippleContainer = this.rippleContainer;
        if (rippleContainer != null) {
            AbstractC9979u.m20291d(rippleContainer);
            return rippleContainer;
        }
        RippleContainer rippleContainerCreateAndAttachRippleContainerIfNeeded = Ripple_androidKt.createAndAttachRippleContainerIfNeeded(this.view);
        this.rippleContainer = rippleContainerCreateAndAttachRippleContainerIfNeeded;
        AbstractC9979u.m20291d(rippleContainerCreateAndAttachRippleContainerIfNeeded);
        return rippleContainerCreateAndAttachRippleContainerIfNeeded;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final RippleHostView getRippleHostView() {
        return (RippleHostView) this.rippleHostView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInvalidateTick(boolean z10) {
        this.invalidateTick$delegate.setValue(Boolean.valueOf(z10));
    }

    private final void setRippleHostView(RippleHostView rippleHostView) {
        this.rippleHostView$delegate.setValue(rippleHostView);
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void addRipple(PressInteraction.Press press, InterfaceC11122i0 interfaceC11122i0) {
        RippleHostView rippleHostView = getOrCreateRippleContainer().getRippleHostView(this);
        rippleHostView.m28321addRippleKOepWvA(press, this.bounded, this.rippleSize, this.rippleRadius, this.color.getValue().m30888unboximpl(), this.rippleAlpha.getValue().getPressedAlpha(), this.onInvalidateRipple);
        setRippleHostView(rippleHostView);
    }

    @Override // androidx.compose.foundation.IndicationInstance
    public void drawIndication(ContentDrawScope contentDrawScope) throws Throwable {
        this.rippleSize = contentDrawScope.mo31429getSizeNHjbRc();
        this.rippleRadius = Float.isNaN(this.radius) ? AbstractC9719c.m19282d(RippleAnimationKt.m28319getRippleEndRadiuscSwnlzA(contentDrawScope, this.bounded, contentDrawScope.mo31429getSizeNHjbRc())) : contentDrawScope.mo27093roundToPx0680j_4(this.radius);
        long jM30888unboximpl = this.color.getValue().m30888unboximpl();
        float pressedAlpha = this.rippleAlpha.getValue().getPressedAlpha();
        contentDrawScope.drawContent();
        m28323drawStateLayerH2RKhps(contentDrawScope, this.radius, jM30888unboximpl);
        Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
        getInvalidateTick();
        RippleHostView rippleHostView = getRippleHostView();
        if (rippleHostView != null) {
            rippleHostView.m28322setRipplePropertiesbiQXAtU(contentDrawScope.mo31429getSizeNHjbRc(), this.rippleRadius, jM30888unboximpl, pressedAlpha);
            rippleHostView.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas));
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        dispose();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        dispose();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }

    @Override // androidx.compose.material.ripple.RippleHostKey
    public void onResetRippleHostView() {
        setRippleHostView(null);
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void removeRipple(PressInteraction.Press press) {
        RippleHostView rippleHostView = getRippleHostView();
        if (rippleHostView != null) {
            rippleHostView.removeRipple();
        }
    }

    private AndroidRippleIndicationInstance(boolean z10, float f10, State<Color> state, State<RippleAlpha> state2, ViewGroup viewGroup) {
        super(z10, state2);
        this.bounded = z10;
        this.radius = f10;
        this.color = state;
        this.rippleAlpha = state2;
        this.view = viewGroup;
        this.rippleHostView$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.invalidateTick$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.rippleSize = Size.Companion.m30715getZeroNHjbRc();
        this.rippleRadius = -1;
        this.onInvalidateRipple = new InterfaceC9529a() { // from class: androidx.compose.material.ripple.AndroidRippleIndicationInstance$onInvalidateRipple$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m28312invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m28312invoke() {
                this.this$0.setInvalidateTick(!r0.getInvalidateTick());
            }
        };
    }
}
