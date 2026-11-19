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
public final class SelectableChipElevation {
    public static final int $stable = 0;
    private final float disabledElevation;
    private final float draggedElevation;
    private final float elevation;
    private final float focusedElevation;
    private final float hoveredElevation;
    private final float pressedElevation;

    public /* synthetic */ SelectableChipElevation(float f10, float f11, float f12, float f13, float f14, float f15, AbstractC9126n abstractC9126n) {
        this(f10, f11, f12, f13, f14, f15);
    }

    @Composable
    private final State<C3156Dp> animateElevation(boolean z10, InteractionSource interactionSource, Composer composer, int i10) {
        Animatable animatable;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(664514136, i10, -1, "androidx.compose.material3.SelectableChipElevation.animateElevation (Chip.kt:2318)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateListOf();
            composer.updateRememberedValue(objRememberedValue);
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        MutableState mutableState = (MutableState) objRememberedValue2;
        boolean z11 = true;
        boolean z12 = (((i10 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) ^ 48) > 32 && composer.changed(interactionSource)) || (i10 & 48) == 32;
        Object objRememberedValue3 = composer.rememberedValue();
        if (z12 || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new SelectableChipElevation$animateElevation$1$1(interactionSource, snapshotStateList, null);
            composer.updateRememberedValue(objRememberedValue3);
        }
        EffectsKt.LaunchedEffect(interactionSource, (InterfaceC10574p) objRememberedValue3, composer, (i10 >> 3) & 14);
        Interaction interaction = (Interaction) AbstractC8778f0.m14579y0(snapshotStateList);
        float f10 = !z10 ? this.disabledElevation : interaction instanceof PressInteraction.Press ? this.pressedElevation : interaction instanceof HoverInteraction.Enter ? this.hoveredElevation : interaction instanceof FocusInteraction.Focus ? this.focusedElevation : interaction instanceof DragInteraction.Start ? this.draggedElevation : this.elevation;
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            Object animatable2 = new Animatable(C3156Dp.m26897boximpl(f10), VectorConvertersKt.getVectorConverter(C3156Dp.Companion), null, null, 12, null);
            composer.updateRememberedValue(animatable2);
            objRememberedValue4 = animatable2;
        }
        Animatable animatable3 = (Animatable) objRememberedValue4;
        C3156Dp c3156DpM26897boximpl = C3156Dp.m26897boximpl(f10);
        boolean zChangedInstance = composer.changedInstance(animatable3) | composer.changed(f10);
        if ((((i10 & 14) ^ 6) <= 4 || !composer.changed(z10)) && (i10 & 6) != 4) {
            z11 = false;
        }
        boolean zChangedInstance2 = zChangedInstance | z11 | composer.changedInstance(interaction);
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue5 == companion.getEmpty()) {
            animatable = animatable3;
            Object selectableChipElevation$animateElevation$2$1 = new SelectableChipElevation$animateElevation$2$1(animatable, f10, z10, interaction, mutableState, null);
            composer.updateRememberedValue(selectableChipElevation$animateElevation$2$1);
            objRememberedValue5 = selectableChipElevation$animateElevation$2$1;
        } else {
            animatable = animatable3;
        }
        EffectsKt.LaunchedEffect(c3156DpM26897boximpl, (InterfaceC10574p) objRememberedValue5, composer, 0);
        State<C3156Dp> stateAsState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAsState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Interaction animateElevation$lambda$2(MutableState<Interaction> mutableState) {
        return mutableState.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SelectableChipElevation)) {
            return false;
        }
        SelectableChipElevation selectableChipElevation = (SelectableChipElevation) obj;
        return C3156Dp.m26904equalsimpl0(this.elevation, selectableChipElevation.elevation) && C3156Dp.m26904equalsimpl0(this.pressedElevation, selectableChipElevation.pressedElevation) && C3156Dp.m26904equalsimpl0(this.focusedElevation, selectableChipElevation.focusedElevation) && C3156Dp.m26904equalsimpl0(this.hoveredElevation, selectableChipElevation.hoveredElevation) && C3156Dp.m26904equalsimpl0(this.disabledElevation, selectableChipElevation.disabledElevation);
    }

    /* renamed from: getDisabledElevation-D9Ej5fM, reason: not valid java name */
    public final float m22465getDisabledElevationD9Ej5fM() {
        return this.disabledElevation;
    }

    /* renamed from: getDraggedElevation-D9Ej5fM, reason: not valid java name */
    public final float m22466getDraggedElevationD9Ej5fM() {
        return this.draggedElevation;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m22467getElevationD9Ej5fM() {
        return this.elevation;
    }

    /* renamed from: getFocusedElevation-D9Ej5fM, reason: not valid java name */
    public final float m22468getFocusedElevationD9Ej5fM() {
        return this.focusedElevation;
    }

    /* renamed from: getHoveredElevation-D9Ej5fM, reason: not valid java name */
    public final float m22469getHoveredElevationD9Ej5fM() {
        return this.hoveredElevation;
    }

    /* renamed from: getPressedElevation-D9Ej5fM, reason: not valid java name */
    public final float m22470getPressedElevationD9Ej5fM() {
        return this.pressedElevation;
    }

    public int hashCode() {
        return (((((((C3156Dp.m26905hashCodeimpl(this.elevation) * 31) + C3156Dp.m26905hashCodeimpl(this.pressedElevation)) * 31) + C3156Dp.m26905hashCodeimpl(this.focusedElevation)) * 31) + C3156Dp.m26905hashCodeimpl(this.hoveredElevation)) * 31) + C3156Dp.m26905hashCodeimpl(this.disabledElevation);
    }

    @Composable
    public final State<C3156Dp> shadowElevation$material3_release(boolean z10, InteractionSource interactionSource, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1888175651, i10, -1, "androidx.compose.material3.SelectableChipElevation.shadowElevation (Chip.kt:2310)");
        }
        State<C3156Dp> stateAnimateElevation = animateElevation(z10, interactionSource, composer, i10 & 1022);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateElevation;
    }

    private SelectableChipElevation(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.elevation = f10;
        this.pressedElevation = f11;
        this.focusedElevation = f12;
        this.hoveredElevation = f13;
        this.draggedElevation = f14;
        this.disabledElevation = f15;
    }
}
