package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9544p;

@Stable
/* loaded from: classes2.dex */
public class FloatingActionButtonElevation {
    public static final int $stable = 0;
    private final float defaultElevation;
    private final float focusedElevation;
    private final float hoveredElevation;
    private final float pressedElevation;

    public /* synthetic */ FloatingActionButtonElevation(float f10, float f11, float f12, float f13, AbstractC9972n abstractC9972n) {
        this(f10, f11, f12, f13);
    }

    @Composable
    private final State<C3186Dp> animateElevation(InteractionSource interactionSource, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1845106002, i10, -1, "androidx.compose.material3.FloatingActionButtonElevation.animateElevation (FloatingActionButton.kt:525)");
        }
        int i11 = i10 & 14;
        int i12 = i11 ^ 6;
        boolean z10 = (i12 > 4 && composer.changed(interactionSource)) || (i10 & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
            Object floatingActionButtonElevationAnimatable = new FloatingActionButtonElevationAnimatable(this.defaultElevation, this.pressedElevation, this.hoveredElevation, this.focusedElevation, null);
            composer.updateRememberedValue(floatingActionButtonElevationAnimatable);
            objRememberedValue = floatingActionButtonElevationAnimatable;
        }
        FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable2 = (FloatingActionButtonElevationAnimatable) objRememberedValue;
        boolean zChangedInstance = composer.changedInstance(floatingActionButtonElevationAnimatable2) | ((((i10 & 112) ^ 48) > 32 && composer.changed(this)) || (i10 & 48) == 32);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new FloatingActionButtonElevation$animateElevation$1$1(floatingActionButtonElevationAnimatable2, this, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        EffectsKt.LaunchedEffect(this, (InterfaceC9544p) objRememberedValue2, composer, (i10 >> 3) & 14);
        boolean zChangedInstance2 = composer.changedInstance(floatingActionButtonElevationAnimatable2) | ((i12 > 4 && composer.changed(interactionSource)) || (i10 & 6) == 4);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = new FloatingActionButtonElevation$animateElevation$2$1(interactionSource, floatingActionButtonElevationAnimatable2, null);
            composer.updateRememberedValue(objRememberedValue3);
        }
        EffectsKt.LaunchedEffect(interactionSource, (InterfaceC9544p) objRememberedValue3, composer, i11);
        State<C3186Dp> stateAsState = floatingActionButtonElevationAnimatable2.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAsState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FloatingActionButtonElevation)) {
            return false;
        }
        FloatingActionButtonElevation floatingActionButtonElevation = (FloatingActionButtonElevation) obj;
        if (C3186Dp.m33506equalsimpl0(this.defaultElevation, floatingActionButtonElevation.defaultElevation) && C3186Dp.m33506equalsimpl0(this.pressedElevation, floatingActionButtonElevation.pressedElevation) && C3186Dp.m33506equalsimpl0(this.focusedElevation, floatingActionButtonElevation.focusedElevation)) {
            return C3186Dp.m33506equalsimpl0(this.hoveredElevation, floatingActionButtonElevation.hoveredElevation);
        }
        return false;
    }

    public int hashCode() {
        return (((((C3186Dp.m33507hashCodeimpl(this.defaultElevation) * 31) + C3186Dp.m33507hashCodeimpl(this.pressedElevation)) * 31) + C3186Dp.m33507hashCodeimpl(this.focusedElevation)) * 31) + C3186Dp.m33507hashCodeimpl(this.hoveredElevation);
    }

    @Composable
    public final State<C3186Dp> shadowElevation$material3_release(InteractionSource interactionSource, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-424810125, i10, -1, "androidx.compose.material3.FloatingActionButtonElevation.shadowElevation (FloatingActionButton.kt:516)");
        }
        State<C3186Dp> stateAnimateElevation = animateElevation(interactionSource, composer, i10 & Opcodes.IAND);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateElevation;
    }

    /* renamed from: tonalElevation-D9Ej5fM$material3_release, reason: not valid java name */
    public final float m28716tonalElevationD9Ej5fM$material3_release() {
        return this.defaultElevation;
    }

    private FloatingActionButtonElevation(float f10, float f11, float f12, float f13) {
        this.defaultElevation = f10;
        this.pressedElevation = f11;
        this.focusedElevation = f12;
        this.hoveredElevation = f13;
    }
}
