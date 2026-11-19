package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC10770a
/* loaded from: classes2.dex */
final class CommonRippleIndicationInstance extends RippleIndicationInstance implements RememberObserver {
    private final boolean bounded;
    private final State<Color> color;
    private final float radius;
    private final State<RippleAlpha> rippleAlpha;
    private final SnapshotStateMap<PressInteraction.Press, RippleAnimation> ripples;
    private float targetRadius;

    @InterfaceC11829d(m26210c = "androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2", m26211f = "CommonRipple.kt", m26212l = {141}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2 */
    public static final class C20222 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ PressInteraction.Press $interaction;
        final /* synthetic */ RippleAnimation $rippleAnimation;
        int label;
        final /* synthetic */ CommonRippleIndicationInstance this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20222(RippleAnimation rippleAnimation, CommonRippleIndicationInstance commonRippleIndicationInstance, PressInteraction.Press press, InterfaceC11588c<? super C20222> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$rippleAnimation = rippleAnimation;
            this.this$0 = commonRippleIndicationInstance;
            this.$interaction = press;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C20222(this.$rippleAnimation, this.this$0, this.$interaction, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    RippleAnimation rippleAnimation = this.$rippleAnimation;
                    this.label = 1;
                    if (rippleAnimation.animate(this) == objM25952f) {
                        return objM25952f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9924b.m20071b(obj);
                }
                this.this$0.ripples.remove(this.$interaction);
                return C10786q.f26013a;
            } catch (Throwable th) {
                this.this$0.ripples.remove(this.$interaction);
                throw th;
            }
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C20222) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public /* synthetic */ CommonRippleIndicationInstance(boolean z10, float f10, State state, State state2, AbstractC9972n abstractC9972n) {
        this(z10, f10, state, state2);
    }

    /* renamed from: drawRipples-4WTKRHQ, reason: not valid java name */
    private final void m28316drawRipples4WTKRHQ(DrawScope drawScope, long j10) {
        long j11;
        Iterator<Map.Entry<PressInteraction.Press, RippleAnimation>> it = this.ripples.entrySet().iterator();
        while (it.hasNext()) {
            RippleAnimation value = it.next().getValue();
            float pressedAlpha = this.rippleAlpha.getValue().getPressedAlpha();
            if (pressedAlpha == 0.0f) {
                j11 = j10;
            } else {
                j11 = j10;
                value.m28318draw4WTKRHQ(drawScope, Color.m30877copywmQWz5c$default(j11, pressedAlpha, 0.0f, 0.0f, 0.0f, 14, null));
            }
            j10 = j11;
        }
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void addRipple(PressInteraction.Press press, InterfaceC11122i0 interfaceC11122i0) {
        Iterator<Map.Entry<PressInteraction.Press, RippleAnimation>> it = this.ripples.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().finish();
        }
        RippleAnimation rippleAnimation = new RippleAnimation(this.bounded ? Offset.m30626boximpl(press.m27280getPressPositionF1C5BW0()) : null, this.targetRadius, this.bounded, null);
        this.ripples.put(press, rippleAnimation);
        AbstractC11117h.m24726d(interfaceC11122i0, null, null, new C20222(rippleAnimation, this, press, null), 3, null);
    }

    @Override // androidx.compose.foundation.IndicationInstance
    public void drawIndication(ContentDrawScope contentDrawScope) throws Throwable {
        this.targetRadius = Float.isNaN(this.radius) ? RippleAnimationKt.m28319getRippleEndRadiuscSwnlzA(contentDrawScope, this.bounded, contentDrawScope.mo31429getSizeNHjbRc()) : contentDrawScope.mo27099toPx0680j_4(this.radius);
        long jM30888unboximpl = this.color.getValue().m30888unboximpl();
        contentDrawScope.drawContent();
        m28323drawStateLayerH2RKhps(contentDrawScope, this.radius, jM30888unboximpl);
        m28316drawRipples4WTKRHQ(contentDrawScope, jM30888unboximpl);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        this.ripples.clear();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        this.ripples.clear();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void removeRipple(PressInteraction.Press press) {
        RippleAnimation rippleAnimation = this.ripples.get(press);
        if (rippleAnimation != null) {
            rippleAnimation.finish();
        }
    }

    private CommonRippleIndicationInstance(boolean z10, float f10, State<Color> state, State<RippleAlpha> state2) {
        super(z10, state2);
        this.bounded = z10;
        this.radius = f10;
        this.color = state;
        this.rippleAlpha = state2;
        this.ripples = SnapshotStateKt.mutableStateMapOf();
        this.targetRadius = Float.NaN;
    }
}
