package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import com.alibaba.fastjson.asm.Opcodes;
import p181hd.InterfaceC9540l;
import p309qc.InterfaceC10770a;

/* loaded from: classes.dex */
public final class SingleValueAnimationKt {
    private static final SpringSpec<Color> colorDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);

    /* renamed from: Animatable-8_81llA, reason: not valid java name */
    public static final Animatable<Color, AnimationVector4D> m26821Animatable8_81llA(long j10) {
        return new Animatable<>(Color.m30868boximpl(j10), (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(Color.m30882getColorSpaceimpl(j10)), null, null, 12, null);
    }

    @Composable
    @InterfaceC10770a
    /* renamed from: animateColorAsState-KTwxG1Y, reason: not valid java name */
    public static final /* synthetic */ State m26822animateColorAsStateKTwxG1Y(long j10, AnimationSpec animationSpec, InterfaceC9540l interfaceC9540l, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            animationSpec = colorDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i11 & 4) != 0) {
            interfaceC9540l = null;
        }
        InterfaceC9540l interfaceC9540l2 = interfaceC9540l;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1942442407, i10, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:81)");
        }
        State<Color> stateM26823animateColorAsStateeuL9pac = m26823animateColorAsStateeuL9pac(j10, animationSpec2, null, interfaceC9540l2, composer, (i10 & Opcodes.IAND) | ((i10 << 3) & 7168), 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateM26823animateColorAsStateeuL9pac;
    }

    @Composable
    /* renamed from: animateColorAsState-euL9pac, reason: not valid java name */
    public static final State<Color> m26823animateColorAsStateeuL9pac(long j10, AnimationSpec<Color> animationSpec, String str, InterfaceC9540l interfaceC9540l, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            animationSpec = colorDefaultSpring;
        }
        AnimationSpec<Color> animationSpec2 = animationSpec;
        if ((i11 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            interfaceC9540l = null;
        }
        InterfaceC9540l interfaceC9540l2 = interfaceC9540l;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-451899108, i10, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:60)");
        }
        boolean zChanged = composer.changed(Color.m30882getColorSpaceimpl(j10));
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(Color.m30882getColorSpaceimpl(j10));
            composer.updateRememberedValue(objRememberedValue);
        }
        int i12 = i10 << 6;
        State<Color> stateAnimateValueAsState = AnimateAsStateKt.animateValueAsState(Color.m30868boximpl(j10), (TwoWayConverter) objRememberedValue, animationSpec2, null, str2, interfaceC9540l2, composer, (i10 & 14) | ((i10 << 3) & 896) | (57344 & i12) | (i12 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }
}
