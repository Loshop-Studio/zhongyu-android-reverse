package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.BasicTooltipDefaults;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p011ui.platform.InspectableValueKt;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.jvm.internal.C5825f;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u001an\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a-\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a-\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a#\u0010\u001d\u001a\u00020\n*\u00020\n2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\fH\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a!\u0010!\u001a\u00020\n*\u00020\n2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u001fH\u0000¢\u0006\u0004\b!\u0010\"\"\u001a\u0010$\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u001a\u0010(\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'\"\u001a\u0010*\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'\"\u001a\u0010,\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010'\"\u0014\u0010.\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010%\"\u0014\u0010/\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010%\"\u001a\u00101\u001a\u0002008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u001a\u00105\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u0010%\u001a\u0004\b6\u0010'\"\u001a\u00107\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u0010%\u001a\u0004\b8\u0010'\"\u001a\u00109\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u0010%\u001a\u0004\b:\u0010'\"\u0014\u0010;\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010%\"\u0014\u0010<\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010%\"\u001a\u0010=\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010%\u001a\u0004\b>\u0010'\"\u001a\u0010?\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010%\u001a\u0004\b@\u0010'\"\u0014\u0010B\u001a\u00020A8\u0000X\u0080T¢\u0006\u0006\n\u0004\bB\u0010C\"\u0014\u0010D\u001a\u00020A8\u0000X\u0080T¢\u0006\u0006\n\u0004\bD\u0010C¨\u0006H²\u0006\f\u0010F\u001a\u00020E8\nX\u008a\u0084\u0002²\u0006\f\u0010G\u001a\u00020E8\nX\u008a\u0084\u0002"}, m5110d2 = {"Landroidx/compose/ui/window/PopupPositionProvider;", "positionProvider", "Lkotlin/Function1;", "Landroidx/compose/material3/TooltipScope;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "tooltip", "Landroidx/compose/material3/TooltipState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "", "focusable", "enableUserInput", "Lkotlin/Function0;", "content", "TooltipBox", "(Landroidx/compose/ui/window/PopupPositionProvider;Lr6/f;Landroidx/compose/material3/TooltipState;Landroidx/compose/ui/Modifier;ZZLr6/e;Landroidx/compose/runtime/Composer;II)V", "initialIsVisible", "isPersistent", "Landroidx/compose/foundation/MutatorMutex;", "mutatorMutex", "rememberTooltipState", "(ZZLandroidx/compose/foundation/MutatorMutex;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TooltipState;", "TooltipState", "(ZZLandroidx/compose/foundation/MutatorMutex;)Landroidx/compose/material3/TooltipState;", "subheadExists", "actionExists", "textVerticalPadding", "(Landroidx/compose/ui/Modifier;ZZ)Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/core/Transition;", "transition", "animateTooltip", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/Transition;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "SpacingBetweenTooltipAndAnchor", "F", "getSpacingBetweenTooltipAndAnchor", "()F", "TooltipMinHeight", "getTooltipMinHeight", "TooltipMinWidth", "getTooltipMinWidth", "PlainTooltipMaxWidth", "getPlainTooltipMaxWidth", "PlainTooltipVerticalPadding", "PlainTooltipHorizontalPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "PlainTooltipContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getPlainTooltipContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "RichTooltipMaxWidth", "getRichTooltipMaxWidth", "RichTooltipHorizontalPadding", "getRichTooltipHorizontalPadding", "HeightToSubheadFirstLine", "getHeightToSubheadFirstLine", "HeightFromSubheadToTextFirstLine", "TextBottomPadding", "ActionLabelMinHeight", "getActionLabelMinHeight", "ActionLabelBottomPadding", "getActionLabelBottomPadding", "", "TooltipFadeInDuration", "I", "TooltipFadeOutDuration", "", "scale", "alpha", "material3_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,645:1\n1223#2,6:646\n1223#2,6:652\n1223#2,6:658\n135#3:664\n148#4:665\n148#4:666\n148#4:667\n148#4:668\n148#4:669\n148#4:670\n148#4:671\n148#4:672\n148#4:673\n148#4:674\n148#4:675\n148#4:676\n148#4:677\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt\n*L\n135#1:646,6\n136#1:652,6\n437#1:658,6\n580#1:664\n626#1:665\n627#1:666\n628#1:667\n629#1:668\n630#1:669\n631#1:670\n634#1:671\n635#1:672\n636#1:673\n637#1:674\n638#1:675\n639#1:676\n640#1:677\n*E\n"})
/* loaded from: classes.dex */
public final class TooltipKt {
    private static final float ActionLabelBottomPadding;
    private static final float ActionLabelMinHeight;
    private static final float HeightFromSubheadToTextFirstLine;
    private static final float HeightToSubheadFirstLine;

    @NotNull
    private static final PaddingValues PlainTooltipContentPadding;
    private static final float PlainTooltipHorizontalPadding;
    private static final float PlainTooltipVerticalPadding;
    private static final float RichTooltipHorizontalPadding;
    private static final float RichTooltipMaxWidth;
    private static final float SpacingBetweenTooltipAndAnchor;
    private static final float TextBottomPadding;
    public static final int TooltipFadeInDuration = 150;
    public static final int TooltipFadeOutDuration = 75;
    private static final float TooltipMinHeight;
    private static final float TooltipMinWidth = C2331Dp.m13305constructorimpl(40);
    private static final float PlainTooltipMaxWidth = C2331Dp.m13305constructorimpl(200);

    static {
        float f = 4;
        SpacingBetweenTooltipAndAnchor = C2331Dp.m13305constructorimpl(f);
        float f7 = 24;
        TooltipMinHeight = C2331Dp.m13305constructorimpl(f7);
        float fM13305constructorimpl = C2331Dp.m13305constructorimpl(f);
        PlainTooltipVerticalPadding = fM13305constructorimpl;
        float f8 = 8;
        float fM13305constructorimpl2 = C2331Dp.m13305constructorimpl(f8);
        PlainTooltipHorizontalPadding = fM13305constructorimpl2;
        PlainTooltipContentPadding = PaddingKt.m7256PaddingValuesYgX7TsA(fM13305constructorimpl2, fM13305constructorimpl);
        RichTooltipMaxWidth = C2331Dp.m13305constructorimpl(320);
        float f9 = 16;
        RichTooltipHorizontalPadding = C2331Dp.m13305constructorimpl(f9);
        HeightToSubheadFirstLine = C2331Dp.m13305constructorimpl(28);
        HeightFromSubheadToTextFirstLine = C2331Dp.m13305constructorimpl(f7);
        TextBottomPadding = C2331Dp.m13305constructorimpl(f9);
        ActionLabelMinHeight = C2331Dp.m13305constructorimpl(36);
        ActionLabelBottomPadding = C2331Dp.m13305constructorimpl(f8);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011d  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TooltipBox(@org.jetbrains.annotations.NotNull final androidx.compose.p011ui.window.PopupPositionProvider r17, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6474f r18, @org.jetbrains.annotations.NotNull final androidx.compose.material3.TooltipState r19, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r20, boolean r21, boolean r22, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r23, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r24, final int r25, final int r26) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TooltipKt.TooltipBox(androidx.compose.ui.window.PopupPositionProvider, r6.f, androidx.compose.material3.TooltipState, androidx.compose.ui.Modifier, boolean, boolean, r6.e, androidx.compose.runtime.Composer, int, int):void");
    }

    @ExperimentalMaterial3Api
    @NotNull
    public static final TooltipState TooltipState(boolean z8, boolean z9, @NotNull MutatorMutex mutatorMutex) {
        return new TooltipStateImpl(z8, z9, mutatorMutex);
    }

    public static /* synthetic */ TooltipState TooltipState$default(boolean z8, boolean z9, MutatorMutex mutatorMutex, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = false;
        }
        if ((i & 2) != 0) {
            z9 = true;
        }
        if ((i & 4) != 0) {
            mutatorMutex = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        return TooltipState(z8, z9, mutatorMutex);
    }

    @NotNull
    public static final Modifier animateTooltip(@NotNull Modifier modifier, @NotNull final Transition<Boolean> transition) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC6471c() { // from class: androidx.compose.material3.TooltipKt$animateTooltip$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C5443s.f8405a;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo) {
                inspectorInfo.setName("animateTooltip");
                inspectorInfo.getProperties().set("transition", transition);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC6474f() { // from class: androidx.compose.material3.TooltipKt.animateTooltip.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            private static final float invoke$lambda$1(State<Float> state) {
                return state.getValue().floatValue();
            }

            private static final float invoke$lambda$3(State<Float> state) {
                return state.getValue().floatValue();
            }

            @Override // p152r6.InterfaceC6474f
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier2, @Nullable Composer composer, int i) {
                composer.startReplaceGroup(-1498516085);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1498516085, i, -1, "androidx.compose.material3.animateTooltip.<anonymous> (Tooltip.kt:584)");
                }
                Transition<Boolean> transition2 = transition;
                TooltipKt$animateTooltip$2$scale$2 tooltipKt$animateTooltip$2$scale$2 = new InterfaceC6474f() { // from class: androidx.compose.material3.TooltipKt$animateTooltip$2$scale$2
                    @Override // p152r6.InterfaceC6474f
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        return invoke((Transition.Segment<Boolean>) obj, (Composer) obj2, ((Number) obj3).intValue());
                    }

                    @Composable
                    @NotNull
                    public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<Boolean> segment, @Nullable Composer composer2, int i8) {
                        composer2.startReplaceGroup(386845748);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(386845748, i8, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:587)");
                        }
                        TweenSpec tweenSpecTween$default = segment.isTransitioningTo(Boolean.FALSE, Boolean.TRUE) ? AnimationSpecKt.tween$default(150, 0, EasingKt.getLinearOutSlowInEasing(), 2, null) : AnimationSpecKt.tween$default(75, 0, EasingKt.getLinearOutSlowInEasing(), 2, null);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceGroup();
                        return tweenSpecTween$default;
                    }
                };
                C5825f c5825f = C5825f.f9219a;
                TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(c5825f);
                boolean zBooleanValue = transition2.getCurrentState().booleanValue();
                composer.startReplaceGroup(-1553362193);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1553362193, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:603)");
                }
                float f = zBooleanValue ? 1.0f : 0.8f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                Float fValueOf = Float.valueOf(f);
                boolean zBooleanValue2 = transition2.getTargetState().booleanValue();
                composer.startReplaceGroup(-1553362193);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1553362193, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:603)");
                }
                float f7 = zBooleanValue2 ? 1.0f : 0.8f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                State stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transition2, fValueOf, Float.valueOf(f7), (FiniteAnimationSpec) tooltipKt$animateTooltip$2$scale$2.invoke((Object) transition2.getSegment(), (Object) composer, (Object) 0), vectorConverter, "tooltip transition: scaling", composer, ProfileVerifier.CompilationStatus.f1352xf2722a21);
                Transition<Boolean> transition3 = transition;
                TooltipKt$animateTooltip$2$alpha$2 tooltipKt$animateTooltip$2$alpha$2 = new InterfaceC6474f() { // from class: androidx.compose.material3.TooltipKt$animateTooltip$2$alpha$2
                    @Override // p152r6.InterfaceC6474f
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        return invoke((Transition.Segment<Boolean>) obj, (Composer) obj2, ((Number) obj3).intValue());
                    }

                    @Composable
                    @NotNull
                    public final FiniteAnimationSpec<Float> invoke(@NotNull Transition.Segment<Boolean> segment, @Nullable Composer composer2, int i8) {
                        composer2.startReplaceGroup(-281714272);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-281714272, i8, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:609)");
                        }
                        TweenSpec tweenSpecTween$default = segment.isTransitioningTo(Boolean.FALSE, Boolean.TRUE) ? AnimationSpecKt.tween$default(150, 0, EasingKt.getLinearEasing(), 2, null) : AnimationSpecKt.tween$default(75, 0, EasingKt.getLinearEasing(), 2, null);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2.endReplaceGroup();
                        return tweenSpecTween$default;
                    }
                };
                TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(c5825f);
                boolean zBooleanValue3 = transition3.getCurrentState().booleanValue();
                composer.startReplaceGroup(2073045083);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2073045083, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:619)");
                }
                float f8 = zBooleanValue3 ? 1.0f : 0.0f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                Float fValueOf2 = Float.valueOf(f8);
                boolean zBooleanValue4 = transition3.getTargetState().booleanValue();
                composer.startReplaceGroup(2073045083);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2073045083, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:619)");
                }
                float f9 = zBooleanValue4 ? 1.0f : 0.0f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                Modifier modifierM10842graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m10842graphicsLayerAp8cVGQ$default(modifier2, invoke$lambda$1(stateCreateTransitionAnimation), invoke$lambda$1(stateCreateTransitionAnimation), invoke$lambda$3(TransitionKt.createTransitionAnimation(transition3, fValueOf2, Float.valueOf(f9), (FiniteAnimationSpec) tooltipKt$animateTooltip$2$alpha$2.invoke((Object) transition3.getSegment(), (Object) composer, (Object) 0), vectorConverter2, "tooltip transition: alpha", composer, ProfileVerifier.CompilationStatus.f1352xf2722a21)), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131064, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierM10842graphicsLayerAp8cVGQ$default;
            }
        });
    }

    public static final float getActionLabelBottomPadding() {
        return ActionLabelBottomPadding;
    }

    public static final float getActionLabelMinHeight() {
        return ActionLabelMinHeight;
    }

    public static final float getHeightToSubheadFirstLine() {
        return HeightToSubheadFirstLine;
    }

    @NotNull
    public static final PaddingValues getPlainTooltipContentPadding() {
        return PlainTooltipContentPadding;
    }

    public static final float getPlainTooltipMaxWidth() {
        return PlainTooltipMaxWidth;
    }

    public static final float getRichTooltipHorizontalPadding() {
        return RichTooltipHorizontalPadding;
    }

    public static final float getRichTooltipMaxWidth() {
        return RichTooltipMaxWidth;
    }

    public static final float getSpacingBetweenTooltipAndAnchor() {
        return SpacingBetweenTooltipAndAnchor;
    }

    public static final float getTooltipMinHeight() {
        return TooltipMinHeight;
    }

    public static final float getTooltipMinWidth() {
        return TooltipMinWidth;
    }

    @Composable
    @ExperimentalMaterial3Api
    @NotNull
    public static final TooltipState rememberTooltipState(boolean z8, boolean z9, @Nullable MutatorMutex mutatorMutex, @Nullable Composer composer, int i, int i8) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        if ((i8 & 2) != 0) {
            z9 = false;
        }
        if ((i8 & 4) != 0) {
            mutatorMutex = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1413230530, i, -1, "androidx.compose.material3.rememberTooltipState (Tooltip.kt:436)");
        }
        boolean z10 = ((((i & 112) ^ 48) > 32 && composer.changed(z9)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(mutatorMutex)) || (i & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (z10 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new TooltipStateImpl(z8, z9, mutatorMutex);
            composer.updateRememberedValue(objRememberedValue);
        }
        TooltipStateImpl tooltipStateImpl = (TooltipStateImpl) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return tooltipStateImpl;
    }

    @Stable
    @NotNull
    public static final Modifier textVerticalPadding(@NotNull Modifier modifier, boolean z8, boolean z9) {
        return (z8 || z9) ? PaddingKt.m7266paddingqDBjuR0$default(AlignmentLineKt.m7118paddingFromBaselineVpY3zN4$default(modifier, HeightFromSubheadToTextFirstLine, 0.0f, 2, null), 0.0f, 0.0f, 0.0f, TextBottomPadding, 7, null) : PaddingKt.m7264paddingVpY3zN4$default(modifier, 0.0f, PlainTooltipVerticalPadding, 1, null);
    }
}
