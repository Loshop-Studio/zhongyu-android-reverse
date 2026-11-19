package androidx.compose.animation.core;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.C9128p;
import kotlin.jvm.internal.C9132t;
import kotlinx.coroutines.channels.AbstractC9159b;
import kotlinx.coroutines.channels.InterfaceC9158a;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes.dex */
public final class AnimateAsStateKt {
    private static final SpringSpec<Float> defaultAnimation = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
    private static final SpringSpec<C3156Dp> dpDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, C3156Dp.m26897boximpl(VisibilityThresholdsKt.getVisibilityThreshold(C3156Dp.Companion)), 3, null);
    private static final SpringSpec<Size> sizeDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Size.m24092boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Size.Companion)), 3, null);
    private static final SpringSpec<Offset> offsetDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Offset.m24024boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Offset.Companion)), 3, null);
    private static final SpringSpec<Rect> rectDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion), 3, null);
    private static final SpringSpec<Integer> intDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Integer.valueOf(VisibilityThresholdsKt.getVisibilityThreshold(C9132t.f17496a)), 3, null);
    private static final SpringSpec<IntOffset> intOffsetDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m27018boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 3, null);
    private static final SpringSpec<IntSize> intSizeDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m27062boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 3, null);

    @Composable
    /* renamed from: animateDpAsState-AjpBEmI, reason: not valid java name */
    public static final State<C3156Dp> m20233animateDpAsStateAjpBEmI(float f10, AnimationSpec<C3156Dp> animationSpec, String str, InterfaceC10570l interfaceC10570l, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            animationSpec = dpDefaultSpring;
        }
        AnimationSpec<C3156Dp> animationSpec2 = animationSpec;
        if ((i11 & 4) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            interfaceC10570l = null;
        }
        InterfaceC10570l interfaceC10570l2 = interfaceC10570l;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1407150062, i10, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:111)");
        }
        int i12 = i10 << 6;
        State<C3156Dp> stateAnimateValueAsState = animateValueAsState(C3156Dp.m26897boximpl(f10), VectorConvertersKt.getVectorConverter(C3156Dp.Companion), animationSpec2, null, str2, interfaceC10570l2, composer, (i10 & 14) | ((i10 << 3) & 896) | (57344 & i12) | (i12 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    @Composable
    @InterfaceC8721a
    /* renamed from: animateDpAsState-Kz89ssw, reason: not valid java name */
    public static final /* synthetic */ State m20234animateDpAsStateKz89ssw(float f10, AnimationSpec animationSpec, InterfaceC10570l interfaceC10570l, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            animationSpec = dpDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i11 & 4) != 0) {
            interfaceC10570l = null;
        }
        InterfaceC10570l interfaceC10570l2 = interfaceC10570l;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(704104481, i10, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:462)");
        }
        State stateAnimateValueAsState = animateValueAsState(C3156Dp.m26897boximpl(f10), VectorConvertersKt.getVectorConverter(C3156Dp.Companion), animationSpec2, null, null, interfaceC10570l2, composer, (i10 & 14) | ((i10 << 3) & 896) | ((i10 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    @Composable
    public static final State<Float> animateFloatAsState(float f10, AnimationSpec<Float> animationSpec, float f11, String str, InterfaceC10570l interfaceC10570l, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            animationSpec = defaultAnimation;
        }
        if ((i11 & 4) != 0) {
            f11 = 0.01f;
        }
        if ((i11 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        InterfaceC10570l interfaceC10570l2 = (i11 & 16) != 0 ? null : interfaceC10570l;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(668842840, i10, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:67)");
        }
        if (animationSpec == defaultAnimation) {
            composer.startReplaceGroup(1125558999);
            boolean z10 = (((i10 & 896) ^ 384) > 256 && composer.changed(f11)) || (i10 & 384) == 256;
            Object objRememberedValue = composer.rememberedValue();
            if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = AnimationSpecKt.spring$default(0.0f, 0.0f, Float.valueOf(f11), 3, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            animationSpec = (SpringSpec) objRememberedValue;
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1125668925);
            composer.endReplaceGroup();
        }
        AnimationSpec<Float> animationSpec2 = animationSpec;
        Float fValueOf = Float.valueOf(f10);
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(C9128p.f17495a);
        Float fValueOf2 = Float.valueOf(f11);
        int i12 = i10 << 3;
        State<Float> stateAnimateValueAsState = animateValueAsState(fValueOf, vectorConverter, animationSpec2, fValueOf2, str2, interfaceC10570l2, composer, (i10 & 14) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    @Composable
    public static final State<Integer> animateIntAsState(int i10, AnimationSpec<Integer> animationSpec, String str, InterfaceC10570l interfaceC10570l, Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            animationSpec = intDefaultSpring;
        }
        AnimationSpec<Integer> animationSpec2 = animationSpec;
        if ((i12 & 4) != 0) {
            str = "IntAnimation";
        }
        String str2 = str;
        if ((i12 & 8) != 0) {
            interfaceC10570l = null;
        }
        InterfaceC10570l interfaceC10570l2 = interfaceC10570l;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(428074472, i11, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:270)");
        }
        int i13 = i11 << 6;
        State<Integer> stateAnimateValueAsState = animateValueAsState(Integer.valueOf(i10), VectorConvertersKt.getVectorConverter(C9132t.f17496a), animationSpec2, null, str2, interfaceC10570l2, composer, (i11 & 14) | ((i11 << 3) & 896) | (57344 & i13) | (i13 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    @Composable
    @InterfaceC8721a
    /* renamed from: animateIntOffsetAsState-8f6pmRE, reason: not valid java name */
    public static final /* synthetic */ State m20235animateIntOffsetAsState8f6pmRE(long j10, AnimationSpec animationSpec, InterfaceC10570l interfaceC10570l, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            animationSpec = intOffsetDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i11 & 4) != 0) {
            interfaceC10570l = null;
        }
        InterfaceC10570l interfaceC10570l2 = interfaceC10570l;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1010307371, i10, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:552)");
        }
        State stateAnimateValueAsState = animateValueAsState(IntOffset.m27018boximpl(j10), VectorConvertersKt.getVectorConverter(IntOffset.Companion), animationSpec2, null, null, interfaceC10570l2, composer, (i10 & 14) | ((i10 << 3) & 896) | ((i10 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    @Composable
    /* renamed from: animateIntOffsetAsState-HyPO7BM, reason: not valid java name */
    public static final State<IntOffset> m20236animateIntOffsetAsStateHyPO7BM(long j10, AnimationSpec<IntOffset> animationSpec, String str, InterfaceC10570l interfaceC10570l, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            animationSpec = intOffsetDefaultSpring;
        }
        AnimationSpec<IntOffset> animationSpec2 = animationSpec;
        if ((i11 & 4) != 0) {
            str = "IntOffsetAnimation";
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            interfaceC10570l = null;
        }
        InterfaceC10570l interfaceC10570l2 = interfaceC10570l;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-696782904, i10, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:309)");
        }
        int i12 = i10 << 6;
        State<IntOffset> stateAnimateValueAsState = animateValueAsState(IntOffset.m27018boximpl(j10), VectorConvertersKt.getVectorConverter(IntOffset.Companion), animationSpec2, null, str2, interfaceC10570l2, composer, (i10 & 14) | ((i10 << 3) & 896) | (57344 & i12) | (i12 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    @Composable
    /* renamed from: animateIntSizeAsState-4goxYXU, reason: not valid java name */
    public static final State<IntSize> m20237animateIntSizeAsState4goxYXU(long j10, AnimationSpec<IntSize> animationSpec, String str, InterfaceC10570l interfaceC10570l, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            animationSpec = intSizeDefaultSpring;
        }
        AnimationSpec<IntSize> animationSpec2 = animationSpec;
        if ((i11 & 4) != 0) {
            str = "IntSizeAnimation";
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            interfaceC10570l = null;
        }
        InterfaceC10570l interfaceC10570l2 = interfaceC10570l;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(582576328, i10, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:347)");
        }
        int i12 = i10 << 6;
        State<IntSize> stateAnimateValueAsState = animateValueAsState(IntSize.m27062boximpl(j10), VectorConvertersKt.getVectorConverter(IntSize.Companion), animationSpec2, null, str2, interfaceC10570l2, composer, (i10 & 14) | ((i10 << 3) & 896) | (57344 & i12) | (i12 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    @Composable
    @InterfaceC8721a
    /* renamed from: animateIntSizeAsState-zTRF_AQ, reason: not valid java name */
    public static final /* synthetic */ State m20238animateIntSizeAsStatezTRF_AQ(long j10, AnimationSpec animationSpec, InterfaceC10570l interfaceC10570l, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            animationSpec = intSizeDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i11 & 4) != 0) {
            interfaceC10570l = null;
        }
        InterfaceC10570l interfaceC10570l2 = interfaceC10570l;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1749239765, i10, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:570)");
        }
        State stateAnimateValueAsState = animateValueAsState(IntSize.m27062boximpl(j10), VectorConvertersKt.getVectorConverter(IntSize.Companion), animationSpec2, null, null, interfaceC10570l2, composer, (i10 & 14) | ((i10 << 3) & 896) | ((i10 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    @Composable
    /* renamed from: animateOffsetAsState-7362WCg, reason: not valid java name */
    public static final State<Offset> m20239animateOffsetAsState7362WCg(long j10, AnimationSpec<Offset> animationSpec, String str, InterfaceC10570l interfaceC10570l, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            animationSpec = offsetDefaultSpring;
        }
        AnimationSpec<Offset> animationSpec2 = animationSpec;
        if ((i11 & 4) != 0) {
            str = "OffsetAnimation";
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            interfaceC10570l = null;
        }
        InterfaceC10570l interfaceC10570l2 = interfaceC10570l;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(357896800, i10, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:191)");
        }
        int i12 = i10 << 6;
        State<Offset> stateAnimateValueAsState = animateValueAsState(Offset.m24024boximpl(j10), VectorConvertersKt.getVectorConverter(Offset.Companion), animationSpec2, null, str2, interfaceC10570l2, composer, (i10 & 14) | ((i10 << 3) & 896) | (57344 & i12) | (i12 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    @Composable
    @InterfaceC8721a
    /* renamed from: animateOffsetAsState-N6fFfp4, reason: not valid java name */
    public static final /* synthetic */ State m20240animateOffsetAsStateN6fFfp4(long j10, AnimationSpec animationSpec, InterfaceC10570l interfaceC10570l, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            animationSpec = offsetDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i11 & 4) != 0) {
            interfaceC10570l = null;
        }
        InterfaceC10570l interfaceC10570l2 = interfaceC10570l;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-456513133, i10, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:498)");
        }
        State stateAnimateValueAsState = animateValueAsState(Offset.m24024boximpl(j10), VectorConvertersKt.getVectorConverter(Offset.Companion), animationSpec2, null, null, interfaceC10570l2, composer, (i10 & 14) | ((i10 << 3) & 896) | ((i10 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    @Composable
    public static final State<Rect> animateRectAsState(Rect rect, AnimationSpec<Rect> animationSpec, String str, InterfaceC10570l interfaceC10570l, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            animationSpec = rectDefaultSpring;
        }
        AnimationSpec<Rect> animationSpec2 = animationSpec;
        if ((i11 & 4) != 0) {
            str = "RectAnimation";
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            interfaceC10570l = null;
        }
        InterfaceC10570l interfaceC10570l2 = interfaceC10570l;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(536062978, i10, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:232)");
        }
        int i12 = i10 << 6;
        State<Rect> stateAnimateValueAsState = animateValueAsState(rect, VectorConvertersKt.getVectorConverter(Rect.Companion), animationSpec2, null, str2, interfaceC10570l2, composer, (i10 & 14) | ((i10 << 3) & 896) | (57344 & i12) | (i12 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    @Composable
    @InterfaceC8721a
    /* renamed from: animateSizeAsState-LjSzlW0, reason: not valid java name */
    public static final /* synthetic */ State m20241animateSizeAsStateLjSzlW0(long j10, AnimationSpec animationSpec, InterfaceC10570l interfaceC10570l, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            animationSpec = sizeDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i11 & 4) != 0) {
            interfaceC10570l = null;
        }
        InterfaceC10570l interfaceC10570l2 = interfaceC10570l;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(875212471, i10, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:480)");
        }
        State stateAnimateValueAsState = animateValueAsState(Size.m24092boximpl(j10), VectorConvertersKt.getVectorConverter(Size.Companion), animationSpec2, null, null, interfaceC10570l2, composer, (i10 & 14) | ((i10 << 3) & 896) | ((i10 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    @Composable
    /* renamed from: animateSizeAsState-YLp_XPw, reason: not valid java name */
    public static final State<Size> m20242animateSizeAsStateYLp_XPw(long j10, AnimationSpec<Size> animationSpec, String str, InterfaceC10570l interfaceC10570l, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            animationSpec = sizeDefaultSpring;
        }
        AnimationSpec<Size> animationSpec2 = animationSpec;
        if ((i11 & 4) != 0) {
            str = "SizeAnimation";
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            interfaceC10570l = null;
        }
        InterfaceC10570l interfaceC10570l2 = interfaceC10570l;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1374633148, i10, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:152)");
        }
        int i12 = i10 << 6;
        State<Size> stateAnimateValueAsState = animateValueAsState(Size.m24092boximpl(j10), VectorConvertersKt.getVectorConverter(Size.Companion), animationSpec2, null, str2, interfaceC10570l2, composer, (i10 & 14) | ((i10 << 3) & 896) | (57344 & i12) | (i12 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    @Composable
    public static final <T, V extends AnimationVector> State<T> animateValueAsState(final T t10, TwoWayConverter<T, V> twoWayConverter, AnimationSpec<T> animationSpec, T t11, String str, InterfaceC10570l interfaceC10570l, Composer composer, int i10, int i11) {
        AnimationSpec<T> animationSpecSpring;
        InterfaceC9158a interfaceC9158a;
        if ((i11 & 4) != 0) {
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            animationSpecSpring = (SpringSpec) objRememberedValue;
        } else {
            animationSpecSpring = animationSpec;
        }
        T t12 = (i11 & 8) != 0 ? null : t11;
        String str2 = (i11 & 16) != 0 ? "ValueAnimation" : str;
        InterfaceC10570l interfaceC10570l2 = (i11 & 32) != 0 ? null : interfaceC10570l;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1994373980, i10, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:395)");
        }
        Object objRememberedValue2 = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        MutableState mutableState = (MutableState) objRememberedValue2;
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Animatable(t10, twoWayConverter, t12, str2);
            composer.updateRememberedValue(objRememberedValue3);
        }
        Animatable animatable = (Animatable) objRememberedValue3;
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(interfaceC10570l2, composer, (i10 >> 15) & 14);
        if (t12 != null && (animationSpecSpring instanceof SpringSpec)) {
            SpringSpec springSpec = (SpringSpec) animationSpecSpring;
            if (!AbstractC9133u.m16128b(springSpec.getVisibilityThreshold(), t12)) {
                animationSpecSpring = AnimationSpecKt.spring(springSpec.getDampingRatio(), springSpec.getStiffness(), t12);
            }
        }
        State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(animationSpecSpring, composer, 0);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = AbstractC9159b.m16529b(-1, null, null, 6, null);
            composer.updateRememberedValue(objRememberedValue4);
        }
        final InterfaceC9158a interfaceC9158a2 = (InterfaceC9158a) objRememberedValue4;
        boolean zChangedInstance = ((((i10 & 14) ^ 6) > 4 && composer.changedInstance(t10)) || (i10 & 6) == 4) | composer.changedInstance(interfaceC9158a2);
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new InterfaceC10559a() { // from class: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p300x7.InterfaceC10559a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m20243invoke();
                    return C8736p.f16368a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m20243invoke() {
                    interfaceC9158a2.mo27213trySendJP2dKIU(t10);
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        EffectsKt.SideEffect((InterfaceC10559a) objRememberedValue5, composer, 0);
        boolean zChangedInstance2 = composer.changedInstance(interfaceC9158a2) | composer.changedInstance(animatable) | composer.changed(stateRememberUpdatedState2) | composer.changed(stateRememberUpdatedState);
        Object objRememberedValue6 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue6 == companion.getEmpty()) {
            interfaceC9158a = interfaceC9158a2;
            Object animateAsStateKt$animateValueAsState$3$1 = new AnimateAsStateKt$animateValueAsState$3$1(interfaceC9158a, animatable, stateRememberUpdatedState2, stateRememberUpdatedState, null);
            composer.updateRememberedValue(animateAsStateKt$animateValueAsState$3$1);
            objRememberedValue6 = animateAsStateKt$animateValueAsState$3$1;
        } else {
            interfaceC9158a = interfaceC9158a2;
        }
        EffectsKt.LaunchedEffect(interfaceC9158a, (InterfaceC10574p) objRememberedValue6, composer, 0);
        State<T> stateAsState = (State) mutableState.getValue();
        if (stateAsState == null) {
            stateAsState = animatable.asState();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAsState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> InterfaceC10570l animateValueAsState$lambda$4(State<? extends InterfaceC10570l> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> AnimationSpec<T> animateValueAsState$lambda$6(State<? extends AnimationSpec<T>> state) {
        return state.getValue();
    }

    @Composable
    @InterfaceC8721a
    public static final /* synthetic */ State animateRectAsState(Rect rect, AnimationSpec animationSpec, InterfaceC10570l interfaceC10570l, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            animationSpec = rectDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i11 & 4) != 0) {
            interfaceC10570l = null;
        }
        InterfaceC10570l interfaceC10570l2 = interfaceC10570l;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-782613967, i10, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:516)");
        }
        State stateAnimateValueAsState = animateValueAsState(rect, VectorConvertersKt.getVectorConverter(Rect.Companion), animationSpec2, null, null, interfaceC10570l2, composer, (i10 & 14) | ((i10 << 3) & 896) | ((i10 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    @Composable
    @InterfaceC8721a
    public static final /* synthetic */ State animateIntAsState(int i10, AnimationSpec animationSpec, InterfaceC10570l interfaceC10570l, Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            animationSpec = intDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i12 & 4) != 0) {
            interfaceC10570l = null;
        }
        InterfaceC10570l interfaceC10570l2 = interfaceC10570l;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-842612981, i11, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:534)");
        }
        State stateAnimateValueAsState = animateValueAsState(Integer.valueOf(i10), VectorConvertersKt.getVectorConverter(C9132t.f17496a), animationSpec2, null, null, interfaceC10570l2, composer, (i11 & 14) | ((i11 << 3) & 896) | ((i11 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    @Composable
    @InterfaceC8721a
    public static final /* synthetic */ State animateFloatAsState(float f10, AnimationSpec animationSpec, float f11, InterfaceC10570l interfaceC10570l, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            animationSpec = defaultAnimation;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i11 & 4) != 0) {
            f11 = 0.01f;
        }
        float f12 = f11;
        if ((i11 & 8) != 0) {
            interfaceC10570l = null;
        }
        InterfaceC10570l interfaceC10570l2 = interfaceC10570l;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1091643291, i10, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:446)");
        }
        State<Float> stateAnimateFloatAsState = animateFloatAsState(f10, animationSpec2, f12, null, interfaceC10570l2, composer, (i10 & 1022) | ((i10 << 3) & 57344), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateFloatAsState;
    }

    @Composable
    @InterfaceC8721a
    public static final /* synthetic */ State animateValueAsState(Object obj, TwoWayConverter twoWayConverter, AnimationSpec animationSpec, Object obj2, InterfaceC10570l interfaceC10570l, Composer composer, int i10, int i11) {
        Composer composer2;
        if ((i11 & 4) != 0) {
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                composer2 = composer;
                composer2.updateRememberedValue(objRememberedValue);
            } else {
                composer2 = composer;
            }
            animationSpec = (SpringSpec) objRememberedValue;
        } else {
            composer2 = composer;
        }
        AnimationSpec animationSpec2 = animationSpec;
        Object obj3 = (i11 & 8) != 0 ? null : obj2;
        InterfaceC10570l interfaceC10570l2 = (i11 & 16) != 0 ? null : interfaceC10570l;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-846382129, i10, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:591)");
        }
        int i12 = i10 & 8;
        State stateAnimateValueAsState = animateValueAsState(obj, twoWayConverter, animationSpec2, obj3, "ValueAnimation", interfaceC10570l2, composer2, (i12 << 9) | i12 | 24576 | (i10 & 14) | (i10 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) | (i10 & 896) | (i10 & 7168) | ((i10 << 3) & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }
}
