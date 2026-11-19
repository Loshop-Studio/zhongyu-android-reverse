package androidx.compose.material.ripple;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorProducer;
import androidx.compose.p013ui.node.DelegatableNode;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import com.tencent.smtt.sdk.TbsListener;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
public final class RippleKt {
    private static final TweenSpec<Float> DefaultTweenSpec = new TweenSpec<>(15, 0, EasingKt.getLinearEasing(), 2, null);

    /* renamed from: createRippleModifierNode-TDGSqEk, reason: not valid java name */
    public static final DelegatableNode m21722createRippleModifierNodeTDGSqEk(InteractionSource interactionSource, boolean z10, float f10, ColorProducer colorProducer, InterfaceC10559a interfaceC10559a) {
        return Ripple_androidKt.m21728createPlatformRippleNodeTDGSqEk(interactionSource, z10, f10, colorProducer, interfaceC10559a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimationSpec<Float> incomingStateLayerAnimationSpecFor(Interaction interaction) {
        return interaction instanceof HoverInteraction.Enter ? DefaultTweenSpec : interaction instanceof FocusInteraction.Focus ? new TweenSpec(45, 0, EasingKt.getLinearEasing(), 2, null) : interaction instanceof DragInteraction.Start ? new TweenSpec(45, 0, EasingKt.getLinearEasing(), 2, null) : DefaultTweenSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimationSpec<Float> outgoingStateLayerAnimationSpecFor(Interaction interaction) {
        return interaction instanceof HoverInteraction.Enter ? DefaultTweenSpec : interaction instanceof FocusInteraction.Focus ? DefaultTweenSpec : interaction instanceof DragInteraction.Start ? new TweenSpec(150, 0, EasingKt.getLinearEasing(), 2, null) : DefaultTweenSpec;
    }

    @Composable
    @InterfaceC8721a
    /* renamed from: rememberRipple-9IZ8Weo, reason: not valid java name */
    public static final Indication m21723rememberRipple9IZ8Weo(boolean z10, float f10, long j10, Composer composer, int i10, int i11) {
        boolean z11 = true;
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 2) != 0) {
            f10 = C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM();
        }
        if ((i11 & 4) != 0) {
            j10 = Color.Companion.m24312getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1635163520, i10, -1, "androidx.compose.material.ripple.rememberRipple (Ripple.kt:144)");
        }
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m24266boximpl(j10), composer, (i10 >> 6) & 14);
        boolean z12 = (((i10 & 14) ^ 6) > 4 && composer.changed(z10)) || (i10 & 6) == 4;
        if ((((i10 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) ^ 48) <= 32 || !composer.changed(f10)) && (i10 & 48) != 32) {
            z11 = false;
        }
        boolean z13 = z12 | z11;
        Object objRememberedValue = composer.rememberedValue();
        if (z13 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new PlatformRipple(z10, f10, stateRememberUpdatedState, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        PlatformRipple platformRipple = (PlatformRipple) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return platformRipple;
    }
}
