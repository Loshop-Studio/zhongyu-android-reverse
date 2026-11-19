package androidx.compose.material3;

import androidx.activity.BackEventCompat;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.material3.internal.MutableWindowInsets;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.ComposedModifierKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.ZIndexModifierKt;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.layout.LayoutIdKt;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.ComposeUiNode;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.ConstraintsKt;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.p014ui.util.MathHelpersKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p211jd.AbstractC9719c;
import p265nd.AbstractC10410o;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class SearchBar_androidKt {
    private static final int AnimationDelayMillis = 100;
    private static final int AnimationEnterDurationMillis = 600;
    private static final CubicBezierEasing AnimationEnterEasing;
    private static final FiniteAnimationSpec<Float> AnimationEnterFloatSpec;
    private static final FiniteAnimationSpec<IntSize> AnimationEnterSizeSpec;
    private static final int AnimationExitDurationMillis = 350;
    private static final CubicBezierEasing AnimationExitEasing;
    private static final FiniteAnimationSpec<Float> AnimationExitFloatSpec;
    private static final FiniteAnimationSpec<IntSize> AnimationExitSizeSpec;
    private static final FiniteAnimationSpec<Float> AnimationPredictiveBackExitFloatSpec;
    private static final EnterTransition DockedEnterTransition;
    private static final ExitTransition DockedExitTransition;
    private static final float DockedExpandedTableMaxHeightScreenRatio = 0.6666667f;
    private static final float DockedExpandedTableMinHeight;
    private static final String LayoutIdInputField = "InputField";
    private static final String LayoutIdSearchContent = "Content";
    private static final String LayoutIdSurface = "Surface";
    private static final float SearchBarCornerRadius;
    private static final float SearchBarIconOffsetX;
    private static final float SearchBarMaxWidth;
    private static final float SearchBarMinWidth;
    private static final float SearchBarPredictiveBackMaxOffsetXRatio = 0.05f;
    private static final float SearchBarPredictiveBackMaxOffsetY;
    private static final float SearchBarPredictiveBackMinMargin;
    private static final float SearchBarPredictiveBackMinScale = 0.9f;
    private static final float SearchBarVerticalPadding;
    private static final TextFieldColors UnspecifiedTextFieldColors;

    static {
        Color.Companion companion = Color.Companion;
        UnspecifiedTextFieldColors = new TextFieldColors(companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), new TextSelectionColors(companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), null), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), companion.m30914getUnspecified0d7_KjU(), null);
        SearchBarCornerRadius = C3186Dp.m33501constructorimpl(SearchBarDefaults.INSTANCE.m29020getInputFieldHeightD9Ej5fM() / 2);
        DockedExpandedTableMinHeight = C3186Dp.m33501constructorimpl(240);
        SearchBarMinWidth = C3186Dp.m33501constructorimpl(360);
        SearchBarMaxWidth = C3186Dp.m33501constructorimpl(720);
        float f10 = 8;
        SearchBarVerticalPadding = C3186Dp.m33501constructorimpl(f10);
        SearchBarIconOffsetX = C3186Dp.m33501constructorimpl(4);
        SearchBarPredictiveBackMinMargin = C3186Dp.m33501constructorimpl(f10);
        SearchBarPredictiveBackMaxOffsetY = C3186Dp.m33501constructorimpl(24);
        CubicBezierEasing easingEmphasizedDecelerateCubicBezier = MotionTokens.INSTANCE.getEasingEmphasizedDecelerateCubicBezier();
        AnimationEnterEasing = easingEmphasizedDecelerateCubicBezier;
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.0f, 1.0f, 0.0f, 1.0f);
        AnimationExitEasing = cubicBezierEasing;
        TweenSpec tweenSpecTween = AnimationSpecKt.tween(600, 100, easingEmphasizedDecelerateCubicBezier);
        AnimationEnterFloatSpec = tweenSpecTween;
        TweenSpec tweenSpecTween2 = AnimationSpecKt.tween(AnimationExitDurationMillis, 100, cubicBezierEasing);
        AnimationExitFloatSpec = tweenSpecTween2;
        AnimationPredictiveBackExitFloatSpec = AnimationSpecKt.tween$default(AnimationExitDurationMillis, 0, cubicBezierEasing, 2, null);
        TweenSpec tweenSpecTween3 = AnimationSpecKt.tween(600, 100, easingEmphasizedDecelerateCubicBezier);
        AnimationEnterSizeSpec = tweenSpecTween3;
        TweenSpec tweenSpecTween4 = AnimationSpecKt.tween(AnimationExitDurationMillis, 100, cubicBezierEasing);
        AnimationExitSizeSpec = tweenSpecTween4;
        DockedEnterTransition = EnterExitTransitionKt.fadeIn$default(tweenSpecTween, 0.0f, 2, null).plus(EnterExitTransitionKt.expandVertically$default(tweenSpecTween3, null, false, null, 14, null));
        DockedExitTransition = EnterExitTransitionKt.fadeOut$default(tweenSpecTween2, 0.0f, 2, null).plus(EnterExitTransitionKt.shrinkVertically$default(tweenSpecTween4, null, false, null, 14, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0109  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: DockedSearchBar-EQC0FA8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m29025DockedSearchBarEQC0FA8(final p181hd.InterfaceC9544p r26, final boolean r27, final p181hd.InterfaceC9540l r28, androidx.compose.p014ui.Modifier r29, androidx.compose.p014ui.graphics.Shape r30, androidx.compose.material3.SearchBarColors r31, float r32, float r33, final p181hd.InterfaceC9545q r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBar_androidKt.m29025DockedSearchBarEQC0FA8(hd.p, boolean, hd.l, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SearchBarColors, float, float, hd.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:235:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0129  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /* renamed from: DockedSearchBar-eWTbjVg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m29026DockedSearchBareWTbjVg(final java.lang.String r34, final p181hd.InterfaceC9540l r35, final p181hd.InterfaceC9540l r36, final boolean r37, final p181hd.InterfaceC9540l r38, androidx.compose.p014ui.Modifier r39, boolean r40, p181hd.InterfaceC9544p r41, p181hd.InterfaceC9544p r42, p181hd.InterfaceC9544p r43, androidx.compose.p014ui.graphics.Shape r44, androidx.compose.material3.SearchBarColors r45, float r46, float r47, androidx.compose.foundation.interaction.MutableInteractionSource r48, final p181hd.InterfaceC9545q r49, androidx.compose.runtime.Composer r50, final int r51, final int r52, final int r53) {
        /*
            Method dump skipped, instructions count: 917
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBar_androidKt.m29026DockedSearchBareWTbjVg(java.lang.String, hd.l, hd.l, boolean, hd.l, androidx.compose.ui.Modifier, boolean, hd.p, hd.p, hd.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SearchBarColors, float, float, androidx.compose.foundation.interaction.MutableInteractionSource, hd.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:253:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0129  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /* renamed from: SearchBar-WuY5d9Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m29027SearchBarWuY5d9Q(final java.lang.String r35, final p181hd.InterfaceC9540l r36, final p181hd.InterfaceC9540l r37, final boolean r38, final p181hd.InterfaceC9540l r39, androidx.compose.p014ui.Modifier r40, boolean r41, p181hd.InterfaceC9544p r42, p181hd.InterfaceC9544p r43, p181hd.InterfaceC9544p r44, androidx.compose.p014ui.graphics.Shape r45, androidx.compose.material3.SearchBarColors r46, float r47, float r48, androidx.compose.foundation.layout.WindowInsets r49, androidx.compose.foundation.interaction.MutableInteractionSource r50, final p181hd.InterfaceC9545q r51, androidx.compose.runtime.Composer r52, final int r53, final int r54, final int r55) {
        /*
            Method dump skipped, instructions count: 971
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBar_androidKt.m29027SearchBarWuY5d9Q(java.lang.String, hd.l, hd.l, boolean, hd.l, androidx.compose.ui.Modifier, boolean, hd.p, hd.p, hd.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SearchBarColors, float, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.foundation.interaction.MutableInteractionSource, hd.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0104  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: SearchBar-Y92LkZI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m29028SearchBarY92LkZI(final p181hd.InterfaceC9544p r29, final boolean r30, final p181hd.InterfaceC9540l r31, androidx.compose.p014ui.Modifier r32, androidx.compose.p014ui.graphics.Shape r33, androidx.compose.material3.SearchBarColors r34, float r35, float r36, androidx.compose.foundation.layout.WindowInsets r37, final p181hd.InterfaceC9545q r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBar_androidKt.m29028SearchBarY92LkZI(hd.p, boolean, hd.l, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SearchBarColors, float, float, androidx.compose.foundation.layout.WindowInsets, hd.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0103  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: SearchBarImpl-j1jLAyQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m29029SearchBarImplj1jLAyQ(final androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r27, final androidx.compose.runtime.MutableFloatState r28, final androidx.compose.runtime.MutableState<androidx.activity.BackEventCompat> r29, final androidx.compose.runtime.MutableState<androidx.activity.BackEventCompat> r30, androidx.compose.p014ui.Modifier r31, final p181hd.InterfaceC9544p r32, androidx.compose.p014ui.graphics.Shape r33, androidx.compose.material3.SearchBarColors r34, float r35, float r36, androidx.compose.foundation.layout.WindowInsets r37, final p181hd.InterfaceC9545q r38, androidx.compose.runtime.Composer r39, final int r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 925
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBar_androidKt.m29029SearchBarImplj1jLAyQ(androidx.compose.animation.core.Animatable, androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.ui.Modifier, hd.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SearchBarColors, float, float, androidx.compose.foundation.layout.WindowInsets, hd.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    private static final boolean SearchBarImpl_j1jLAyQ$lambda$12(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean SearchBarImpl_j1jLAyQ$lambda$9(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void SearchBarLayout(final Animatable<Float, AnimationVector1D> animatable, final MutableFloatState mutableFloatState, final MutableState<BackEventCompat> mutableState, final MutableState<BackEventCompat> mutableState2, final Modifier modifier, final WindowInsets windowInsets, final InterfaceC9544p interfaceC9544p, final InterfaceC9544p interfaceC9544p2, final InterfaceC9544p interfaceC9544p3, Composer composer, final int i10) {
        int i11;
        final MutableFloatState mutableFloatState2;
        MutableState<BackEventCompat> mutableState3;
        MutableState<BackEventCompat> mutableState4;
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(70029564);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.changed(animatable) : composerStartRestartGroup.changedInstance(animatable) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            mutableFloatState2 = mutableFloatState;
            i11 |= composerStartRestartGroup.changed(mutableFloatState2) ? 32 : 16;
        } else {
            mutableFloatState2 = mutableFloatState;
        }
        if ((i10 & 384) == 0) {
            mutableState3 = mutableState;
            i11 |= composerStartRestartGroup.changed(mutableState3) ? 256 : 128;
        } else {
            mutableState3 = mutableState;
        }
        if ((i10 & 3072) == 0) {
            mutableState4 = mutableState2;
            i11 |= composerStartRestartGroup.changed(mutableState4) ? 2048 : 1024;
        } else {
            mutableState4 = mutableState2;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(windowInsets) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p2) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9544p3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((38347923 & i11) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(70029564, i11, -1, "androidx.compose.material3.SearchBarLayout (SearchBar.android.kt:941)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new MutableWindowInsets(null, 1, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableWindowInsets mutableWindowInsets = (MutableWindowInsets) objRememberedValue;
            Modifier modifierZIndex = ZIndexModifierKt.zIndex(modifier, 1.0f);
            boolean z10 = (i11 & 458752) == 131072;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z10 || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new InterfaceC9540l() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((WindowInsets) obj);
                        return C10786q.f26013a;
                    }

                    public final void invoke(WindowInsets windowInsets2) {
                        mutableWindowInsets.setInsets(WindowInsetsKt.exclude(windowInsets, windowInsets2));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierConsumeWindowInsets = WindowInsetsPaddingKt.consumeWindowInsets(WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(modifierZIndex, (InterfaceC9540l) objRememberedValue2), windowInsets);
            boolean z11 = ((i11 & 7168) == 2048) | ((i11 & 14) == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.changedInstance(animatable))) | ((i11 & 112) == 32) | ((i11 & 896) == 256);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z11 || objRememberedValue3 == companion.getEmpty()) {
                final MutableState<BackEventCompat> mutableState5 = mutableState3;
                final MutableState<BackEventCompat> mutableState6 = mutableState4;
                i12 = i11;
                MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarLayout$2$1
                    @Override // androidx.compose.p014ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo26741measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, final long j10) {
                        Measurable measurable;
                        final Placeable placeableMo32229measureBRTryo0;
                        int i13;
                        int iM33453getMaxHeightimpl;
                        MeasureScope measureScope2 = measureScope;
                        long j11 = j10;
                        final float fFloatValue = animatable.getValue().floatValue();
                        int size = list.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Measurable measurable2 = list.get(i14);
                            if (AbstractC9979u.m20289b(LayoutIdKt.getLayoutId(measurable2), "InputField")) {
                                int size2 = list.size();
                                int i15 = 0;
                                while (i15 < size2) {
                                    Measurable measurable3 = list.get(i15);
                                    if (AbstractC9979u.m20289b(LayoutIdKt.getLayoutId(measurable3), "Surface")) {
                                        int size3 = list.size();
                                        int i16 = 0;
                                        while (true) {
                                            if (i16 >= size3) {
                                                measurable = null;
                                                break;
                                            }
                                            measurable = list.get(i16);
                                            if (AbstractC9979u.m20289b(LayoutIdKt.getLayoutId(measurable), "Content")) {
                                                break;
                                            }
                                            i16++;
                                        }
                                        Measurable measurable4 = measurable;
                                        final int top2 = mutableWindowInsets.getTop(measureScope2) + measureScope2.mo27093roundToPx0680j_4(SearchBar_androidKt.getSearchBarVerticalPadding());
                                        int iMo27093roundToPx0680j_4 = measureScope2.mo27093roundToPx0680j_4(SearchBar_androidKt.getSearchBarVerticalPadding());
                                        int iM33471constrainWidthK40F9xA = ConstraintsKt.m33471constrainWidthK40F9xA(j11, measurable2.maxIntrinsicWidth(Constraints.m33453getMaxHeightimpl(j11)));
                                        int iM33470constrainHeightK40F9xA = ConstraintsKt.m33470constrainHeightK40F9xA(j11, measurable2.minIntrinsicHeight(Constraints.m33454getMaxWidthimpl(j11)));
                                        int iM19282d = AbstractC9719c.m19282d(Constraints.m33454getMaxWidthimpl(j11) * 0.9f);
                                        int iM19282d2 = AbstractC9719c.m19282d(Constraints.m33453getMaxHeightimpl(j11) * 0.9f);
                                        final float fCalculatePredictiveBackMultiplier = SearchBar_androidKt.calculatePredictiveBackMultiplier(mutableState6.getValue(), fFloatValue, mutableFloatState2.getFloatValue());
                                        int iLerp = MathHelpersKt.lerp(iM33471constrainWidthK40F9xA, iM19282d, fCalculatePredictiveBackMultiplier);
                                        int i17 = top2 + iM33470constrainHeightK40F9xA;
                                        int iLerp2 = MathHelpersKt.lerp(i17, iM19282d2, fCalculatePredictiveBackMultiplier);
                                        int iM33454getMaxWidthimpl = Constraints.m33454getMaxWidthimpl(j11);
                                        int iM33453getMaxHeightimpl2 = Constraints.m33453getMaxHeightimpl(j11);
                                        int iLerp3 = MathHelpersKt.lerp(iLerp, iM33454getMaxWidthimpl, fFloatValue);
                                        final int iLerp4 = MathHelpersKt.lerp(iLerp2, iM33453getMaxHeightimpl2, fFloatValue);
                                        final int iLerp5 = MathHelpersKt.lerp(top2, 0, fFloatValue);
                                        final int iLerp6 = MathHelpersKt.lerp(0, iMo27093roundToPx0680j_4, fFloatValue);
                                        final Placeable placeableMo32229measureBRTryo02 = measurable2.mo32229measureBRTryo0(ConstraintsKt.Constraints(iLerp3, iM33454getMaxWidthimpl, iM33470constrainHeightK40F9xA, iM33470constrainHeightK40F9xA));
                                        int width = placeableMo32229measureBRTryo02.getWidth();
                                        final Placeable placeableMo32229measureBRTryo03 = measurable3.mo32229measureBRTryo0(Constraints.Companion.m33464fixedJhjzzOo(width, iLerp4 - iLerp5));
                                        if (measurable4 != null) {
                                            if (Constraints.m33449getHasBoundedHeightimpl(j10)) {
                                                i13 = 0;
                                                iM33453getMaxHeightimpl = AbstractC10410o.m21752e(Constraints.m33453getMaxHeightimpl(j10) - (i17 + iMo27093roundToPx0680j_4), 0);
                                            } else {
                                                i13 = 0;
                                                iM33453getMaxHeightimpl = Constraints.m33453getMaxHeightimpl(j10);
                                            }
                                            placeableMo32229measureBRTryo0 = measurable4.mo32229measureBRTryo0(ConstraintsKt.Constraints(width, width, i13, iM33453getMaxHeightimpl));
                                        } else {
                                            placeableMo32229measureBRTryo0 = null;
                                        }
                                        final MutableState<BackEventCompat> mutableState7 = mutableState6;
                                        final MutableState<BackEventCompat> mutableState8 = mutableState5;
                                        return MeasureScope.layout$default(measureScope, width, iLerp4, null, new InterfaceC9540l() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarLayout$2$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // p181hd.InterfaceC9540l
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                invoke((Placeable.PlacementScope) obj);
                                                return C10786q.f26013a;
                                            }

                                            public final void invoke(Placeable.PlacementScope placementScope) {
                                                int iMo27093roundToPx0680j_42 = measureScope.mo27093roundToPx0680j_4(SearchBar_androidKt.SearchBarPredictiveBackMinMargin);
                                                int iM29032calculatePredictiveBackOffsetXrOvwMX4 = SearchBar_androidKt.m29032calculatePredictiveBackOffsetXrOvwMX4(j10, iMo27093roundToPx0680j_42, mutableState7.getValue(), measureScope.getLayoutDirection(), fFloatValue, fCalculatePredictiveBackMultiplier);
                                                int iM29033calculatePredictiveBackOffsetYdzo92Q0 = SearchBar_androidKt.m29033calculatePredictiveBackOffsetYdzo92Q0(j10, iMo27093roundToPx0680j_42, mutableState7.getValue(), mutableState8.getValue(), iLerp4, measureScope.mo27093roundToPx0680j_4(SearchBar_androidKt.SearchBarPredictiveBackMaxOffsetY), fCalculatePredictiveBackMultiplier);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo32229measureBRTryo03, iM29032calculatePredictiveBackOffsetXrOvwMX4, iM29033calculatePredictiveBackOffsetYdzo92Q0 + iLerp5, 0.0f, 4, null);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo32229measureBRTryo02, iM29032calculatePredictiveBackOffsetXrOvwMX4, iM29033calculatePredictiveBackOffsetYdzo92Q0 + top2, 0.0f, 4, null);
                                                Placeable placeable = placeableMo32229measureBRTryo0;
                                                if (placeable != null) {
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable, iM29032calculatePredictiveBackOffsetXrOvwMX4, iM29033calculatePredictiveBackOffsetYdzo92Q0 + top2 + placeableMo32229measureBRTryo02.getHeight() + iLerp6, 0.0f, 4, null);
                                                }
                                            }
                                        }, 4, null);
                                    }
                                    i15++;
                                    measureScope2 = measureScope;
                                    j11 = j10;
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            i14++;
                            measureScope2 = measureScope;
                            j11 = j10;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(measurePolicy);
                objRememberedValue3 = measurePolicy;
            } else {
                i12 = i11;
            }
            MeasurePolicy measurePolicy2 = (MeasurePolicy) objRememberedValue3;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierConsumeWindowInsets);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            InterfaceC9529a constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM30305constructorimpl = Updater.m30305constructorimpl(composerStartRestartGroup);
            Updater.m30312setimpl(composerM30305constructorimpl, measurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM30305constructorimpl.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM30305constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM30305constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m30312setimpl(composerM30305constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifierLayoutId = LayoutIdKt.layoutId(companion3, LayoutIdSurface);
            Alignment.Companion companion4 = Alignment.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), true);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId);
            InterfaceC9529a constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM30305constructorimpl2 = Updater.m30305constructorimpl(composerStartRestartGroup);
            Updater.m30312setimpl(composerM30305constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM30305constructorimpl2.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM30305constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM30305constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m30312setimpl(composerM30305constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            interfaceC9544p2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 21) & 14));
            composerStartRestartGroup.endNode();
            Modifier modifierLayoutId2 = LayoutIdKt.layoutId(companion3, LayoutIdInputField);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), true);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId2);
            InterfaceC9529a constructor3 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM30305constructorimpl3 = Updater.m30305constructorimpl(composerStartRestartGroup);
            Updater.m30312setimpl(composerM30305constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m30312setimpl(composerM30305constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
            InterfaceC9544p setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
            if (composerM30305constructorimpl3.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM30305constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM30305constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m30312setimpl(composerM30305constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
            interfaceC9544p.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 18) & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.startReplaceGroup(-1107184481);
            if (interfaceC9544p3 != null) {
                Modifier modifierLayoutId3 = LayoutIdKt.layoutId(companion3, LayoutIdSearchContent);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), true);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId3);
                InterfaceC9529a constructor4 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM30305constructorimpl4 = Updater.m30305constructorimpl(composerStartRestartGroup);
                Updater.m30312setimpl(composerM30305constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, companion2.getSetMeasurePolicy());
                Updater.m30312setimpl(composerM30305constructorimpl4, currentCompositionLocalMap4, companion2.getSetResolvedCompositionLocals());
                InterfaceC9544p setCompositeKeyHash4 = companion2.getSetCompositeKeyHash();
                if (composerM30305constructorimpl4.getInserting() || !AbstractC9979u.m20289b(composerM30305constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM30305constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM30305constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m30312setimpl(composerM30305constructorimpl4, modifierMaterializeModifier4, companion2.getSetModifier());
                interfaceC9544p3.invoke(composerStartRestartGroup, 0);
                composerStartRestartGroup.endNode();
                C10786q c10786q = C10786q.f26013a;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.SearchBar_androidKt.SearchBarLayout.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i13) {
                    SearchBar_androidKt.SearchBarLayout(animatable, mutableFloatState, mutableState, mutableState2, modifier, windowInsets, interfaceC9544p, interfaceC9544p2, interfaceC9544p3, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculatePredictiveBackMultiplier(BackEventCompat backEventCompat, float f10, float f11) {
        if (backEventCompat == null) {
            return 0.0f;
        }
        if (Float.isNaN(f11)) {
            return 1.0f;
        }
        if (f11 <= 0.0f) {
            return 0.0f;
        }
        return f10 / f11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculatePredictiveBackOffsetX-rOvwMX4, reason: not valid java name */
    public static final int m29032calculatePredictiveBackOffsetXrOvwMX4(long j10, int i10, BackEventCompat backEventCompat, LayoutDirection layoutDirection, float f10, float f11) {
        if (backEventCompat == null || f11 == 0.0f) {
            return 0;
        }
        return AbstractC9719c.m19282d(((Constraints.m33454getMaxWidthimpl(j10) * SearchBarPredictiveBackMaxOffsetXRatio) - i10) * (1 - f10) * f11 * (backEventCompat.getSwipeEdge() == 0 ? 1 : -1) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculatePredictiveBackOffsetY-dzo92Q0, reason: not valid java name */
    public static final int m29033calculatePredictiveBackOffsetYdzo92Q0(long j10, int i10, BackEventCompat backEventCompat, BackEventCompat backEventCompat2, int i11, int i12, float f10) {
        if (backEventCompat2 == null || backEventCompat == null || f10 == 0.0f) {
            return 0;
        }
        int iMin = Math.min(Math.max(0, ((Constraints.m33453getMaxHeightimpl(j10) - i11) / 2) - i10), i12);
        float touchY = backEventCompat.getTouchY() - backEventCompat2.getTouchY();
        float fAbs = Math.abs(touchY) / Constraints.m33453getMaxHeightimpl(j10);
        return AbstractC9719c.m19282d(MathHelpersKt.lerp(0, iMin, fAbs) * f10 * Math.signum(touchY));
    }

    public static final float getDockedExpandedTableMinHeight() {
        return DockedExpandedTableMinHeight;
    }

    private static /* synthetic */ void getSearchBarCornerRadius$annotations() {
    }

    public static final float getSearchBarMinWidth() {
        return SearchBarMinWidth;
    }

    public static final float getSearchBarVerticalPadding() {
        return SearchBarVerticalPadding;
    }
}
