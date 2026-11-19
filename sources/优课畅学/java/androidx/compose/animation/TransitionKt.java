package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.colorspace.ColorSpace;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import com.tencent.smtt.sdk.TbsListener;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10575q;

/* loaded from: classes.dex */
public final class TransitionKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<Color> animateColor(Transition<S> transition, InterfaceC10575q interfaceC10575q, String str, InterfaceC10575q interfaceC10575q2, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            interfaceC10575q = new InterfaceC10575q() { // from class: androidx.compose.animation.TransitionKt.animateColor.1
                @Override // p300x7.InterfaceC10575q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
                }

                @Composable
                public final SpringSpec<Color> invoke(Transition.Segment<S> segment, Composer composer2, int i12) {
                    composer2.startReplaceGroup(-1457805428);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1457805428, i12, -1, "androidx.compose.animation.animateColor.<anonymous> (Transition.kt:62)");
                    }
                    SpringSpec<Color> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return springSpecSpring$default;
                }
            };
        }
        if ((i11 & 2) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        ColorSpace colorSpaceM24280getColorSpaceimpl = Color.m24280getColorSpaceimpl(((Color) interfaceC10575q2.invoke(transition.getTargetState(), composer, Integer.valueOf((i10 >> 6) & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW))).m24286unboximpl());
        boolean zChanged = composer.changed(colorSpaceM24280getColorSpaceimpl);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(colorSpaceM24280getColorSpaceimpl);
            composer.updateRememberedValue(objRememberedValue);
        }
        TwoWayConverter twoWayConverter = (TwoWayConverter) objRememberedValue;
        int i12 = i10 & 14;
        int i13 = i10 << 3;
        int i14 = i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344);
        S currentState = transition.getCurrentState();
        int i15 = (i14 >> 9) & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW;
        return androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, interfaceC10575q2.invoke(currentState, composer, Integer.valueOf(i15)), interfaceC10575q2.invoke(transition.getTargetState(), composer, Integer.valueOf(i15)), (FiniteAnimationSpec) interfaceC10575q.invoke(transition.getSegment(), composer, Integer.valueOf((i14 >> 3) & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW)), twoWayConverter, str2, composer, (i14 & 14) | ((i14 << 6) & 458752));
    }

    @Composable
    /* renamed from: animateColor-DTcfvLk, reason: not valid java name */
    public static final State<Color> m20231animateColorDTcfvLk(InfiniteTransition infiniteTransition, long j10, long j11, InfiniteRepeatableSpec<Color> infiniteRepeatableSpec, String str, Composer composer, int i10, int i11) {
        Composer composer2;
        String str2 = (i11 & 8) != 0 ? "ColorAnimation" : str;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1901963533, i10, -1, "androidx.compose.animation.animateColor (Transition.kt:97)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(Color.m24280getColorSpaceimpl(j11));
            composer2 = composer;
            composer2.updateRememberedValue(objRememberedValue);
        } else {
            composer2 = composer;
        }
        int i12 = i10 << 3;
        State<Color> stateAnimateValue = InfiniteTransitionKt.animateValue(infiniteTransition, Color.m24266boximpl(j10), Color.m24266boximpl(j11), (TwoWayConverter) objRememberedValue, infiniteRepeatableSpec, str2, composer2, InfiniteTransition.$stable | (i10 & 14) | (i10 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) | (i10 & 896) | (InfiniteRepeatableSpec.$stable << 12) | (57344 & i12) | (i12 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValue;
    }

    @Composable
    @InterfaceC8721a
    /* renamed from: animateColor-RIQooxk, reason: not valid java name */
    public static final /* synthetic */ State m20232animateColorRIQooxk(InfiniteTransition infiniteTransition, long j10, long j11, InfiniteRepeatableSpec infiniteRepeatableSpec, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1400583834, i10, -1, "androidx.compose.animation.animateColor (Transition.kt:112)");
        }
        State<Color> stateM20231animateColorDTcfvLk = m20231animateColorDTcfvLk(infiniteTransition, j10, j11, infiniteRepeatableSpec, "ColorAnimation", composer, InfiniteTransition.$stable | 24576 | (i10 & 14) | (i10 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) | (i10 & 896) | (InfiniteRepeatableSpec.$stable << 9) | (i10 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateM20231animateColorDTcfvLk;
    }
}
