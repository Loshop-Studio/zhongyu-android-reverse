package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.jvm.internal.AbstractC9126n;
import p134i7.AbstractC8778f0;
import p300x7.InterfaceC10574p;

@Immutable
/* loaded from: classes2.dex */
public final class CardElevation {
    public static final int $stable = 0;
    private final float defaultElevation;
    private final float disabledElevation;
    private final float draggedElevation;
    private final float focusedElevation;
    private final float hoveredElevation;
    private final float pressedElevation;

    public /* synthetic */ CardElevation(float f10, float f11, float f12, float f13, float f14, float f15, AbstractC9126n abstractC9126n) {
        this(f10, f11, f12, f13, f14, f15);
    }

    @Composable
    private final State<C3156Dp> animateElevation(boolean z10, InteractionSource interactionSource, Composer composer, int i10) {
        Animatable animatable;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1421890746, i10, -1, "androidx.compose.material3.CardElevation.animateElevation (Card.kt:670)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateListOf();
            composer.updateRememberedValue(objRememberedValue);
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
        boolean z11 = true;
        boolean z12 = (((i10 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) ^ 48) > 32 && composer.changed(interactionSource)) || (i10 & 48) == 32;
        Object objRememberedValue2 = composer.rememberedValue();
        if (z12 || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new CardElevation$animateElevation$1$1(interactionSource, snapshotStateList, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        EffectsKt.LaunchedEffect(interactionSource, (InterfaceC10574p) objRememberedValue2, composer, (i10 >> 3) & 14);
        Interaction interaction = (Interaction) AbstractC8778f0.m14579y0(snapshotStateList);
        float f10 = !z10 ? this.disabledElevation : interaction instanceof PressInteraction.Press ? this.pressedElevation : interaction instanceof HoverInteraction.Enter ? this.hoveredElevation : interaction instanceof FocusInteraction.Focus ? this.focusedElevation : interaction instanceof DragInteraction.Start ? this.draggedElevation : this.defaultElevation;
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            Object animatable2 = new Animatable(C3156Dp.m26897boximpl(f10), VectorConvertersKt.getVectorConverter(C3156Dp.Companion), null, null, 12, null);
            composer.updateRememberedValue(animatable2);
            objRememberedValue3 = animatable2;
        }
        Animatable animatable3 = (Animatable) objRememberedValue3;
        C3156Dp c3156DpM26897boximpl = C3156Dp.m26897boximpl(f10);
        boolean zChangedInstance = composer.changedInstance(animatable3) | composer.changed(f10) | ((((i10 & 14) ^ 6) > 4 && composer.changed(z10)) || (i10 & 6) == 4);
        if ((((i10 & 896) ^ 384) <= 256 || !composer.changed(this)) && (i10 & 384) != 256) {
            z11 = false;
        }
        boolean zChangedInstance2 = zChangedInstance | z11 | composer.changedInstance(interaction);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
            animatable = animatable3;
            Object cardElevation$animateElevation$2$1 = new CardElevation$animateElevation$2$1(animatable, f10, z10, this, interaction, null);
            composer.updateRememberedValue(cardElevation$animateElevation$2$1);
            objRememberedValue4 = cardElevation$animateElevation$2$1;
        } else {
            animatable = animatable3;
        }
        EffectsKt.LaunchedEffect(c3156DpM26897boximpl, (InterfaceC10574p) objRememberedValue4, composer, 0);
        State<C3156Dp> stateAsState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAsState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CardElevation)) {
            return false;
        }
        CardElevation cardElevation = (CardElevation) obj;
        return C3156Dp.m26904equalsimpl0(this.defaultElevation, cardElevation.defaultElevation) && C3156Dp.m26904equalsimpl0(this.pressedElevation, cardElevation.pressedElevation) && C3156Dp.m26904equalsimpl0(this.focusedElevation, cardElevation.focusedElevation) && C3156Dp.m26904equalsimpl0(this.hoveredElevation, cardElevation.hoveredElevation) && C3156Dp.m26904equalsimpl0(this.disabledElevation, cardElevation.disabledElevation);
    }

    public int hashCode() {
        return (((((((C3156Dp.m26905hashCodeimpl(this.defaultElevation) * 31) + C3156Dp.m26905hashCodeimpl(this.pressedElevation)) * 31) + C3156Dp.m26905hashCodeimpl(this.focusedElevation)) * 31) + C3156Dp.m26905hashCodeimpl(this.hoveredElevation)) * 31) + C3156Dp.m26905hashCodeimpl(this.disabledElevation);
    }

    @Composable
    public final State<C3156Dp> shadowElevation$material3_release(boolean z10, InteractionSource interactionSource, Composer composer, int i10) {
        composer.startReplaceGroup(-1763481333);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1763481333, i10, -1, "androidx.compose.material3.CardElevation.shadowElevation (Card.kt:659)");
        }
        composer.startReplaceGroup(-734838460);
        if (interactionSource != null) {
            composer.endReplaceGroup();
            State<C3156Dp> stateAnimateElevation = animateElevation(z10, interactionSource, composer, i10 & 1022);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return stateAnimateElevation;
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(C3156Dp.m26897boximpl(this.defaultElevation), null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return mutableState;
    }

    private CardElevation(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.defaultElevation = f10;
        this.pressedElevation = f11;
        this.focusedElevation = f12;
        this.hoveredElevation = f13;
        this.draggedElevation = f14;
        this.disabledElevation = f15;
    }
}
