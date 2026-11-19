package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class SingleValueAnimationKt {
    private static final SpringSpec<Color> colorDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);

    /* renamed from: Animatable-8_81llA, reason: not valid java name */
    public static final Animatable<Color, AnimationVector4D> m20219Animatable8_81llA(long j10) {
        return new Animatable<>(Color.m24266boximpl(j10), (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(Color.m24280getColorSpaceimpl(j10)), null, null, 12, null);
    }

    @Composable
    @InterfaceC8721a
    /* renamed from: animateColorAsState-KTwxG1Y, reason: not valid java name */
    public static final /* synthetic */ State m20220animateColorAsStateKTwxG1Y(long j10, AnimationSpec animationSpec, InterfaceC10570l interfaceC10570l, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            animationSpec = colorDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i11 & 4) != 0) {
            interfaceC10570l = null;
        }
        InterfaceC10570l interfaceC10570l2 = interfaceC10570l;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1942442407, i10, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:81)");
        }
        State<Color> stateM20221animateColorAsStateeuL9pac = m20221animateColorAsStateeuL9pac(j10, animationSpec2, null, interfaceC10570l2, composer, (i10 & 126) | ((i10 << 3) & 7168), 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateM20221animateColorAsStateeuL9pac;
    }

    @Composable
    /* renamed from: animateColorAsState-euL9pac, reason: not valid java name */
    public static final State<Color> m20221animateColorAsStateeuL9pac(long j10, AnimationSpec<Color> animationSpec, String str, InterfaceC10570l interfaceC10570l, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            animationSpec = colorDefaultSpring;
        }
        AnimationSpec<Color> animationSpec2 = animationSpec;
        if ((i11 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            interfaceC10570l = null;
        }
        InterfaceC10570l interfaceC10570l2 = interfaceC10570l;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-451899108, i10, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:60)");
        }
        boolean zChanged = composer.changed(Color.m24280getColorSpaceimpl(j10));
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(Color.m24280getColorSpaceimpl(j10));
            composer.updateRememberedValue(objRememberedValue);
        }
        int i12 = i10 << 6;
        State<Color> stateAnimateValueAsState = AnimateAsStateKt.animateValueAsState(Color.m24266boximpl(j10), (TwoWayConverter) objRememberedValue, animationSpec2, null, str2, interfaceC10570l2, composer, (i10 & 14) | ((i10 << 3) & 896) | (57344 & i12) | (i12 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }
}
