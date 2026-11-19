package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC8721a
/* loaded from: classes2.dex */
final class CommonRippleIndicationInstance extends RippleIndicationInstance implements RememberObserver {
    private final boolean bounded;
    private final State<Color> color;
    private final float radius;
    private final State<RippleAlpha> rippleAlpha;
    private final SnapshotStateMap<PressInteraction.Press, RippleAnimation> ripples;
    private float targetRadius;

    @InterfaceC9539d(m17800c = "androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2", m17801f = "CommonRipple.kt", m17802l = {141}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2 */
    public static final class C19922 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ PressInteraction.Press $interaction;
        final /* synthetic */ RippleAnimation $rippleAnimation;
        int label;
        final /* synthetic */ CommonRippleIndicationInstance this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19922(RippleAnimation rippleAnimation, CommonRippleIndicationInstance commonRippleIndicationInstance, PressInteraction.Press press, InterfaceC9324c<? super C19922> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$rippleAnimation = rippleAnimation;
            this.this$0 = commonRippleIndicationInstance;
            this.$interaction = press;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C19922(this.$rippleAnimation, this.this$0, this.$interaction, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C19922) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    RippleAnimation rippleAnimation = this.$rippleAnimation;
                    this.label = 1;
                    if (rippleAnimation.animate(this) == objM17291f) {
                        return objM17291f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                }
                this.this$0.ripples.remove(this.$interaction);
                return C8736p.f16368a;
            } catch (Throwable th) {
                this.this$0.ripples.remove(this.$interaction);
                throw th;
            }
        }
    }

    public /* synthetic */ CommonRippleIndicationInstance(boolean z10, float f10, State state, State state2, AbstractC9126n abstractC9126n) {
        this(z10, f10, state, state2);
    }

    /* renamed from: drawRipples-4WTKRHQ, reason: not valid java name */
    private final void m21714drawRipples4WTKRHQ(DrawScope drawScope, long j10) {
        long j11;
        Iterator<Map.Entry<PressInteraction.Press, RippleAnimation>> it = this.ripples.entrySet().iterator();
        while (it.hasNext()) {
            RippleAnimation value = it.next().getValue();
            float pressedAlpha = this.rippleAlpha.getValue().getPressedAlpha();
            if (pressedAlpha == 0.0f) {
                j11 = j10;
            } else {
                j11 = j10;
                value.m21716draw4WTKRHQ(drawScope, Color.m24275copywmQWz5c$default(j11, pressedAlpha, 0.0f, 0.0f, 0.0f, 14, null));
            }
            j10 = j11;
        }
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void addRipple(PressInteraction.Press press, InterfaceC8822b0 interfaceC8822b0) {
        Iterator<Map.Entry<PressInteraction.Press, RippleAnimation>> it = this.ripples.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().finish();
        }
        RippleAnimation rippleAnimation = new RippleAnimation(this.bounded ? Offset.m24024boximpl(press.m20678getPressPositionF1C5BW0()) : null, this.targetRadius, this.bounded, null);
        this.ripples.put(press, rippleAnimation);
        AbstractC8839h.m14861d(interfaceC8822b0, null, null, new C19922(rippleAnimation, this, press, null), 3, null);
    }

    @Override // androidx.compose.foundation.IndicationInstance
    public void drawIndication(ContentDrawScope contentDrawScope) throws Throwable {
        this.targetRadius = Float.isNaN(this.radius) ? RippleAnimationKt.m21717getRippleEndRadiuscSwnlzA(contentDrawScope, this.bounded, contentDrawScope.mo24827getSizeNHjbRc()) : contentDrawScope.mo20497toPx0680j_4(this.radius);
        long jM24286unboximpl = this.color.getValue().m24286unboximpl();
        contentDrawScope.drawContent();
        m21721drawStateLayerH2RKhps(contentDrawScope, this.radius, jM24286unboximpl);
        m21714drawRipples4WTKRHQ(contentDrawScope, jM24286unboximpl);
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
