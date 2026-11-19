package androidx.compose.foundation.gestures;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.AndroidOverscroll_androidKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.node.DelegatableNode;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.p014ui.unit.Velocity;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import p393wc.AbstractC11725a;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ScrollableDefaults {
    public static final int $stable = 0;
    public static final ScrollableDefaults INSTANCE = new ScrollableDefaults();

    public static final class NoOpOverscrollEffect implements OverscrollEffect {
        public static final NoOpOverscrollEffect INSTANCE = new NoOpOverscrollEffect();

        private NoOpOverscrollEffect() {
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        /* renamed from: applyToFling-BMRW4eQ */
        public Object mo26928applyToFlingBMRW4eQ(long j10, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            Object objInvoke = interfaceC9544p.invoke(Velocity.m33730boximpl(j10), interfaceC11588c);
            return objInvoke == AbstractC11725a.m25952f() ? objInvoke : C10786q.f26013a;
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        /* renamed from: applyToScroll-Rhakbz0 */
        public long mo26929applyToScrollRhakbz0(long j10, int i10, InterfaceC9540l interfaceC9540l) {
            return ((Offset) interfaceC9540l.invoke(Offset.m30626boximpl(j10))).m30647unboximpl();
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        public DelegatableNode getNode() {
            return new Modifier.Node() { // from class: androidx.compose.foundation.gestures.ScrollableDefaults$NoOpOverscrollEffect$node$1
            };
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        public boolean isInProgress() {
            return false;
        }
    }

    private ScrollableDefaults() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Composable
    public final FlingBehavior flingBehavior(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1107739818, i10, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:536)");
        }
        DecayAnimationSpec decayAnimationSpecRememberSplineBasedDecay = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        boolean zChanged = composer.changed(decayAnimationSpecRememberSplineBasedDecay);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new DefaultFlingBehavior(decayAnimationSpecRememberSplineBasedDecay, null, 2, 0 == true ? 1 : 0);
            composer.updateRememberedValue(objRememberedValue);
        }
        DefaultFlingBehavior defaultFlingBehavior = (DefaultFlingBehavior) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultFlingBehavior;
    }

    @Composable
    @InterfaceC10770a
    public final OverscrollEffect overscrollEffect(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1809802212, i10, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.overscrollEffect (Scrollable.kt:556)");
        }
        OverscrollEffect overscrollEffectRememberPlatformOverscrollEffect = AndroidOverscroll_androidKt.rememberPlatformOverscrollEffect(composer, 0);
        if (overscrollEffectRememberPlatformOverscrollEffect == null) {
            overscrollEffectRememberPlatformOverscrollEffect = NoOpOverscrollEffect.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return overscrollEffectRememberPlatformOverscrollEffect;
    }

    public final boolean reverseDirection(LayoutDirection layoutDirection, Orientation orientation, boolean z10) {
        return (layoutDirection != LayoutDirection.Rtl || orientation == Orientation.Vertical) ? !z10 : z10;
    }
}
