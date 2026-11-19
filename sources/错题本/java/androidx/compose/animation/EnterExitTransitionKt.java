package androidx.compose.animation;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.graphics.TransformOrigin;
import androidx.compose.p011ui.graphics.TransformOriginKt;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC5785e0;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001c\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001c\u0010\u0003\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001H\u0080\u0004¢\u0006\u0004\b\u0003\u0010\u0006\u001a)\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\n\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a)\u0010\u000e\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\r\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aB\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00100\u0011H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001aB\u0010\u001a\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00100\u0011H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a6\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a6\u0010%\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\"\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001aX\u0010+\u001a\u00020\u00002\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020(2#\b\u0002\u0010*\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00120\u0011H\u0007¢\u0006\u0004\b+\u0010,\u001aX\u0010/\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\b\b\u0002\u0010-\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020(2#\b\u0002\u0010.\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00120\u0011H\u0007¢\u0006\u0004\b/\u00100\u001aX\u00105\u001a\u00020\u00002\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\b\b\u0002\u0010'\u001a\u0002012\b\b\u0002\u0010)\u001a\u00020(2#\b\u0002\u00104\u001a\u001d\u0012\u0013\u0012\u001102¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(3\u0012\u0004\u0012\u0002020\u0011H\u0007¢\u0006\u0004\b5\u00106\u001aX\u0010:\u001a\u00020\u00002\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\b\b\u0002\u0010'\u001a\u0002072\b\b\u0002\u0010)\u001a\u00020(2#\b\u0002\u00109\u001a\u001d\u0012\u0013\u0012\u001102¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(8\u0012\u0004\u0012\u0002020\u0011H\u0007¢\u0006\u0004\b:\u0010;\u001aX\u0010=\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\b\b\u0002\u0010-\u001a\u0002012\b\b\u0002\u0010)\u001a\u00020(2#\b\u0002\u0010<\u001a\u001d\u0012\u0013\u0012\u001102¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(3\u0012\u0004\u0012\u0002020\u0011H\u0007¢\u0006\u0004\b=\u0010>\u001aX\u0010@\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\b\b\u0002\u0010-\u001a\u0002072\b\b\u0002\u0010)\u001a\u00020(2#\b\u0002\u0010?\u001a\u001d\u0012\u0013\u0012\u001102¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(8\u0012\u0004\u0012\u0002020\u0011H\u0007¢\u0006\u0004\b@\u0010A\u001aD\u0010C\u001a\u00020\u00002\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072#\b\u0002\u0010B\u001a\u001d\u0012\u0013\u0012\u001102¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(3\u0012\u0004\u0012\u0002020\u0011H\u0007¢\u0006\u0004\bC\u0010\u0018\u001aD\u0010E\u001a\u00020\u00002\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072#\b\u0002\u0010D\u001a\u001d\u0012\u0013\u0012\u001102¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(8\u0012\u0004\u0012\u0002020\u0011H\u0007¢\u0006\u0004\bE\u0010\u0018\u001aD\u0010G\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072#\b\u0002\u0010F\u001a\u001d\u0012\u0013\u0012\u001102¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(3\u0012\u0004\u0012\u0002020\u0011H\u0007¢\u0006\u0004\bG\u0010\u001b\u001aD\u0010I\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072#\b\u0002\u0010H\u001a\u001d\u0012\u0013\u0012\u001102¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(8\u0012\u0004\u0012\u0002020\u0011H\u0007¢\u0006\u0004\bI\u0010\u001b\u001a\u0013\u0010J\u001a\u00020&*\u000201H\u0002¢\u0006\u0004\bJ\u0010K\u001a\u0013\u0010J\u001a\u00020&*\u000207H\u0002¢\u0006\u0004\bJ\u0010L\u001a.\u0010P\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010M*\u00020\u0001*\u00020\u00002\f\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000NH\u0080\u0002¢\u0006\u0004\bP\u0010Q\u001a.\u0010P\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010M*\u00020\u0001*\u00020\u00052\f\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000NH\u0080\u0002¢\u0006\u0004\bP\u0010R\u001aA\u0010\\\u001a\u00020[*\b\u0012\u0004\u0012\u00020T0S2\u0006\u0010U\u001a\u00020\u00002\u0006\u0010V\u001a\u00020\u00052\u000e\b\u0002\u0010X\u001a\b\u0012\u0004\u0012\u00020(0W2\u0006\u0010Z\u001a\u00020YH\u0001¢\u0006\u0004\b\\\u0010]\u001a!\u0010^\u001a\u00020\u0000*\b\u0012\u0004\u0012\u00020T0S2\u0006\u0010U\u001a\u00020\u0000H\u0001¢\u0006\u0004\b^\u0010_\u001a!\u0010`\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020T0S2\u0006\u0010V\u001a\u00020\u0005H\u0001¢\u0006\u0004\b`\u0010a\u001a1\u0010c\u001a\u00020b*\b\u0012\u0004\u0012\u00020T0S2\u0006\u0010U\u001a\u00020\u00002\u0006\u0010V\u001a\u00020\u00052\u0006\u0010Z\u001a\u00020YH\u0003¢\u0006\u0004\bc\u0010d\" \u0010g\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020f0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010h\"\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00020\b0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010k\"\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00100i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010k\"\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00120i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010k\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006p²\u0006\u000e\u0010n\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010o\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, m5110d2 = {"Landroidx/compose/animation/EnterTransition;", "Landroidx/compose/animation/TransitionEffect;", "effect", "withEffect", "(Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/TransitionEffect;)Landroidx/compose/animation/EnterTransition;", "Landroidx/compose/animation/ExitTransition;", "(Landroidx/compose/animation/ExitTransition;Landroidx/compose/animation/TransitionEffect;)Landroidx/compose/animation/ExitTransition;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "animationSpec", "initialAlpha", "fadeIn", "(Landroidx/compose/animation/core/FiniteAnimationSpec;F)Landroidx/compose/animation/EnterTransition;", "targetAlpha", "fadeOut", "(Landroidx/compose/animation/core/FiniteAnimationSpec;F)Landroidx/compose/animation/ExitTransition;", "Landroidx/compose/ui/unit/IntOffset;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "fullSize", "initialOffset", "slideIn", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Lr6/c;)Landroidx/compose/animation/EnterTransition;", "targetOffset", "slideOut", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Lr6/c;)Landroidx/compose/animation/ExitTransition;", "initialScale", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "scaleIn-L8ZKh-E", "(Landroidx/compose/animation/core/FiniteAnimationSpec;FJ)Landroidx/compose/animation/EnterTransition;", "scaleIn", "targetScale", "scaleOut-L8ZKh-E", "(Landroidx/compose/animation/core/FiniteAnimationSpec;FJ)Landroidx/compose/animation/ExitTransition;", "scaleOut", "Landroidx/compose/ui/Alignment;", "expandFrom", "", "clip", "initialSize", "expandIn", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment;ZLr6/c;)Landroidx/compose/animation/EnterTransition;", "shrinkTowards", "targetSize", "shrinkOut", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment;ZLr6/c;)Landroidx/compose/animation/ExitTransition;", "Landroidx/compose/ui/Alignment$Horizontal;", "", "fullWidth", "initialWidth", "expandHorizontally", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Horizontal;ZLr6/c;)Landroidx/compose/animation/EnterTransition;", "Landroidx/compose/ui/Alignment$Vertical;", "fullHeight", "initialHeight", "expandVertically", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Vertical;ZLr6/c;)Landroidx/compose/animation/EnterTransition;", "targetWidth", "shrinkHorizontally", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Horizontal;ZLr6/c;)Landroidx/compose/animation/ExitTransition;", "targetHeight", "shrinkVertically", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Vertical;ZLr6/c;)Landroidx/compose/animation/ExitTransition;", "initialOffsetX", "slideInHorizontally", "initialOffsetY", "slideInVertically", "targetOffsetX", "slideOutHorizontally", "targetOffsetY", "slideOutVertically", "toAlignment", "(Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/ui/Alignment;", "(Landroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/ui/Alignment;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/TransitionEffectKey;", "key", "get", "(Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/TransitionEffectKey;)Landroidx/compose/animation/TransitionEffect;", "(Landroidx/compose/animation/ExitTransition;Landroidx/compose/animation/TransitionEffectKey;)Landroidx/compose/animation/TransitionEffect;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "enter", "exit", "Lkotlin/Function0;", "isEnabled", "", "label", "Landroidx/compose/ui/Modifier;", "createModifier", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lr6/a;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "trackActiveEnter", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/EnterTransition;", "trackActiveExit", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/ExitTransition;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/ExitTransition;", "Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "createGraphicsLayerBlock", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/animation/core/AnimationVector2D;", "TransformOriginVectorConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/animation/core/SpringSpec;", "DefaultAlphaAndScaleSpring", "Landroidx/compose/animation/core/SpringSpec;", "DefaultOffsetAnimationSpec", "DefaultSizeAnimationSpec", "activeEnter", "activeExit", "animation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1274:1\n1247#2,6:1275\n1247#2,6:1281\n1247#2,6:1287\n1247#2,6:1293\n1247#2,6:1299\n1247#2,6:1305\n1247#2,6:1311\n1247#2,6:1317\n1247#2,6:1323\n85#3:1329\n113#3,2:1330\n85#3:1332\n113#3,2:1333\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt\n*L\n871#1:1275,6\n877#1:1281,6\n884#1:1287,6\n893#1:1293,6\n914#1:1299,6\n934#1:1305,6\n969#1:1311,6\n977#1:1317,6\n989#1:1323,6\n914#1:1329\n914#1:1330,2\n934#1:1332\n934#1:1333,2\n*E\n"})
/* loaded from: classes.dex */
public final class EnterExitTransitionKt {

    @NotNull
    private static final TwoWayConverter<TransformOrigin, AnimationVector2D> TransformOriginVectorConverter = VectorConvertersKt.TwoWayConverter(new InterfaceC6471c() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$1
        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m6592invoke__ExYCQ(((TransformOrigin) obj).getPackedValue());
        }

        /* renamed from: invoke-__ExYCQ, reason: not valid java name */
        public final AnimationVector2D m6592invoke__ExYCQ(long j7) {
            return new AnimationVector2D(TransformOrigin.m11068getPivotFractionXimpl(j7), TransformOrigin.m11069getPivotFractionYimpl(j7));
        }
    }, new InterfaceC6471c() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$2
        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return TransformOrigin.m11060boximpl(m6593invokeLIALnN8((AnimationVector2D) obj));
        }

        /* renamed from: invoke-LIALnN8, reason: not valid java name */
        public final long m6593invokeLIALnN8(AnimationVector2D animationVector2D) {
            return TransformOriginKt.TransformOrigin(animationVector2D.getV1(), animationVector2D.getV2());
        }
    });

    @NotNull
    private static final SpringSpec<Float> DefaultAlphaAndScaleSpring = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);

    @NotNull
    private static final SpringSpec<IntOffset> DefaultOffsetAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m13424boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);

    @NotNull
    private static final SpringSpec<IntSize> DefaultSizeAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m13468boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);

    /* JADX WARN: Removed duplicated region for block: B:43:0x011c A[PHI: r1
      0x011c: PHI (r1v11 androidx.compose.animation.EnterTransition) = (r1v9 androidx.compose.animation.EnterTransition), (r1v12 androidx.compose.animation.EnterTransition) binds: [B:42:0x011a, B:38:0x0113] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0137 A[PHI: r2
      0x0137: PHI (r2v10 androidx.compose.animation.ExitTransition) = (r2v8 androidx.compose.animation.ExitTransition), (r2v11 androidx.compose.animation.ExitTransition) binds: [B:52:0x0135, B:48:0x012e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0185  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final androidx.compose.animation.GraphicsLayerBlockForEnterExit createGraphicsLayerBlock(androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r20, androidx.compose.animation.EnterTransition r21, androidx.compose.animation.ExitTransition r22, java.lang.String r23, androidx.compose.runtime.Composer r24, int r25) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt.createGraphicsLayerBlock(androidx.compose.animation.core.Transition, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, androidx.compose.runtime.Composer, int):androidx.compose.animation.GraphicsLayerBlockForEnterExit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p152r6.InterfaceC6471c createGraphicsLayerBlock$lambda$13$lambda$12(androidx.compose.animation.core.Transition.DeferredAnimation r3, androidx.compose.animation.core.Transition.DeferredAnimation r4, androidx.compose.animation.core.Transition r5, final androidx.compose.animation.EnterTransition r6, final androidx.compose.animation.ExitTransition r7, androidx.compose.animation.core.Transition.DeferredAnimation r8) {
        /*
            r0 = 0
            if (r3 == 0) goto L12
            androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$1 r1 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$1
            r1.<init>()
            androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2 r2 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2
            r2.<init>()
            androidx.compose.runtime.State r3 = r3.animate(r1, r2)
            goto L13
        L12:
            r3 = r0
        L13:
            if (r4 == 0) goto L24
            androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$1 r1 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$1
            r1.<init>()
            androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$2 r2 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$2
            r2.<init>()
            androidx.compose.runtime.State r4 = r4.animate(r1, r2)
            goto L25
        L24:
            r4 = r0
        L25:
            java.lang.Object r5 = r5.getCurrentState()
            androidx.compose.animation.EnterExitState r1 = androidx.compose.animation.EnterExitState.PreEnter
            if (r5 != r1) goto L4d
            androidx.compose.animation.TransitionData r5 = r6.getData()
            androidx.compose.animation.Scale r5 = r5.getScale()
            if (r5 == 0) goto L40
        L37:
            long r1 = r5.m6616getTransformOriginSzJe1aQ()
            androidx.compose.ui.graphics.TransformOrigin r5 = androidx.compose.p011ui.graphics.TransformOrigin.m11060boximpl(r1)
            goto L6b
        L40:
            androidx.compose.animation.TransitionData r5 = r7.getData()
            androidx.compose.animation.Scale r5 = r5.getScale()
            if (r5 == 0) goto L4b
            goto L37
        L4b:
            r5 = r0
            goto L6b
        L4d:
            androidx.compose.animation.TransitionData r5 = r7.getData()
            androidx.compose.animation.Scale r5 = r5.getScale()
            if (r5 == 0) goto L60
        L57:
            long r1 = r5.m6616getTransformOriginSzJe1aQ()
            androidx.compose.ui.graphics.TransformOrigin r5 = androidx.compose.p011ui.graphics.TransformOrigin.m11060boximpl(r1)
            goto L6b
        L60:
            androidx.compose.animation.TransitionData r5 = r6.getData()
            androidx.compose.animation.Scale r5 = r5.getScale()
            if (r5 == 0) goto L4b
            goto L57
        L6b:
            if (r8 == 0) goto L78
            androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1 r0 = new p152r6.InterfaceC6471c() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1
                static {
                    /*
                        androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1 r0 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1) androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1.INSTANCE androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.C0629x3f929be8.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.C0629x3f929be8.<init>():void");
                }

                @Override // p152r6.InterfaceC6471c
                public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.p011ui.graphics.TransformOrigin> invoke(androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState> r3) {
                    /*
                        r2 = this;
                        r3 = 0
                        r0 = 7
                        r1 = 0
                        androidx.compose.animation.core.SpringSpec r3 = androidx.compose.animation.core.AnimationSpecKt.spring$default(r1, r1, r3, r0, r3)
                        return r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.C0629x3f929be8.invoke(androidx.compose.animation.core.Transition$Segment):androidx.compose.animation.core.FiniteAnimationSpec");
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                    /*
                        r0 = this;
                        androidx.compose.animation.core.Transition$Segment r1 = (androidx.compose.animation.core.Transition.Segment) r1
                        androidx.compose.animation.core.FiniteAnimationSpec r1 = r0.invoke(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.C0629x3f929be8.invoke(java.lang.Object):java.lang.Object");
                }
            }
            androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2 r1 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2
            r1.<init>()
            androidx.compose.runtime.State r0 = r8.animate(r0, r1)
        L78:
            androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$block$1 r5 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$block$1
            r5.<init>()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt.createGraphicsLayerBlock$lambda$13$lambda$12(androidx.compose.animation.core.Transition$DeferredAnimation, androidx.compose.animation.core.Transition$DeferredAnimation, androidx.compose.animation.core.Transition, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, androidx.compose.animation.core.Transition$DeferredAnimation):r6.c");
    }

    @Composable
    @NotNull
    public static final Modifier createModifier(@NotNull Transition<EnterExitState> transition, @NotNull EnterTransition enterTransition, @NotNull ExitTransition exitTransition, @Nullable InterfaceC6469a interfaceC6469a, @NotNull String str, @Nullable Composer composer, int i, int i8) {
        Transition.DeferredAnimation deferredAnimation;
        Transition.DeferredAnimation deferredAnimation2;
        ChangeSize changeSize;
        final InterfaceC6469a interfaceC6469a2 = (i8 & 4) != 0 ? new InterfaceC6469a() { // from class: androidx.compose.animation.EnterExitTransitionKt.createModifier.1
            @Override // p152r6.InterfaceC6469a
            public final Boolean invoke() {
                return Boolean.TRUE;
            }
        } : interfaceC6469a;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(28261782, i, -1, "androidx.compose.animation.createModifier (EnterExitTransition.kt:860)");
        }
        int i9 = i & 14;
        EnterTransition enterTransitionTrackActiveEnter = trackActiveEnter(transition, enterTransition, composer, i & 126);
        int i10 = i >> 3;
        ExitTransition exitTransitionTrackActiveExit = trackActiveExit(transition, exitTransition, composer, (i10 & 112) | i9);
        boolean z8 = true;
        boolean z9 = (enterTransitionTrackActiveEnter.getData().getSlide() == null && exitTransitionTrackActiveExit.getData().getSlide() == null) ? false : true;
        boolean z10 = (enterTransitionTrackActiveEnter.getData().getChangeSize() == null && exitTransitionTrackActiveExit.getData().getChangeSize() == null) ? false : true;
        Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation = null;
        if (z9) {
            composer.startReplaceGroup(-821159459);
            TwoWayConverter<IntOffset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(IntOffset.INSTANCE);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = str + " slide";
                composer.updateRememberedValue(objRememberedValue);
            }
            Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation2 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, vectorConverter, (String) objRememberedValue, composer, i9 | 384, 0);
            composer.endReplaceGroup();
            deferredAnimation = deferredAnimationCreateDeferredAnimation2;
        } else {
            composer.startReplaceGroup(-821053656);
            composer.endReplaceGroup();
            deferredAnimation = null;
        }
        if (z10) {
            composer.startReplaceGroup(-820961865);
            TwoWayConverter<IntSize, AnimationVector2D> vectorConverter2 = VectorConvertersKt.getVectorConverter(IntSize.INSTANCE);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = str + " shrink/expand";
                composer.updateRememberedValue(objRememberedValue2);
            }
            Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation3 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, vectorConverter2, (String) objRememberedValue2, composer, i9 | 384, 0);
            composer.endReplaceGroup();
            deferredAnimation2 = deferredAnimationCreateDeferredAnimation3;
        } else {
            composer.startReplaceGroup(-820851041);
            composer.endReplaceGroup();
            deferredAnimation2 = null;
        }
        if (z10) {
            composer.startReplaceGroup(-820777446);
            TwoWayConverter<IntOffset, AnimationVector2D> vectorConverter3 = VectorConvertersKt.getVectorConverter(IntOffset.INSTANCE);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = str + " InterruptionHandlingOffset";
                composer.updateRememberedValue(objRememberedValue3);
            }
            deferredAnimationCreateDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, vectorConverter3, (String) objRememberedValue3, composer, i9 | 384, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-820608001);
            composer.endReplaceGroup();
        }
        ChangeSize changeSize2 = enterTransitionTrackActiveEnter.getData().getChangeSize();
        final boolean z11 = ((changeSize2 == null || changeSize2.getClip()) && ((changeSize = exitTransitionTrackActiveExit.getData().getChangeSize()) == null || changeSize.getClip()) && z10) ? false : true;
        GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExitCreateGraphicsLayerBlock = createGraphicsLayerBlock(transition, enterTransitionTrackActiveEnter, exitTransitionTrackActiveExit, str, composer, i9 | (i10 & 7168));
        Modifier.Companion companion = Modifier.INSTANCE;
        boolean zChanged = composer.changed(z11);
        if ((((i & 7168) ^ 3072) <= 2048 || !composer.changed(interfaceC6469a2)) && (i & 3072) != 2048) {
            z8 = false;
        }
        boolean z12 = zChanged | z8;
        Object objRememberedValue4 = composer.rememberedValue();
        if (z12 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue4 = new InterfaceC6471c() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((GraphicsLayerScope) obj);
                    return C5443s.f8405a;
                }

                public final void invoke(GraphicsLayerScope graphicsLayerScope) {
                    graphicsLayerScope.setClip(!z11 && ((Boolean) interfaceC6469a2.invoke()).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        Modifier modifierThen = GraphicsLayerModifierKt.graphicsLayer(companion, (InterfaceC6471c) objRememberedValue4).then(new EnterExitTransitionElement(transition, deferredAnimation2, deferredAnimationCreateDeferredAnimation, deferredAnimation, enterTransitionTrackActiveEnter, exitTransitionTrackActiveExit, interfaceC6469a2, graphicsLayerBlockForEnterExitCreateGraphicsLayerBlock));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return modifierThen;
    }

    @Stable
    @NotNull
    public static final EnterTransition expandHorizontally(@NotNull FiniteAnimationSpec<IntSize> finiteAnimationSpec, @NotNull Alignment.Horizontal horizontal, boolean z8, @NotNull final InterfaceC6471c interfaceC6471c) {
        return expandIn(finiteAnimationSpec, toAlignment(horizontal), z8, new InterfaceC6471c() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandHorizontally.2
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return IntSize.m13468boximpl(m6595invokemzRDjE0(((IntSize) obj).m13480unboximpl()));
            }

            /* renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m6595invokemzRDjE0(long j7) {
                return IntSize.m13471constructorimpl((((int) (j7 & 4294967295L)) & 4294967295L) | (((Number) interfaceC6471c.invoke(Integer.valueOf((int) (j7 >> 32)))).intValue() << 32));
            }
        });
    }

    public static /* synthetic */ EnterTransition expandHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z8, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m13468boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            horizontal = Alignment.INSTANCE.getEnd();
        }
        if ((i & 4) != 0) {
            z8 = true;
        }
        if ((i & 8) != 0) {
            interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandHorizontally.1
                public final Integer invoke(int i8) {
                    return 0;
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        return expandHorizontally(finiteAnimationSpec, horizontal, z8, interfaceC6471c);
    }

    @Stable
    @NotNull
    public static final EnterTransition expandIn(@NotNull FiniteAnimationSpec<IntSize> finiteAnimationSpec, @NotNull Alignment alignment, boolean z8, @NotNull InterfaceC6471c interfaceC6471c) {
        return new EnterTransitionImpl(new TransitionData(null, null, new ChangeSize(alignment, interfaceC6471c, finiteAnimationSpec, z8), null, false, null, 59, null));
    }

    public static /* synthetic */ EnterTransition expandIn$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z8, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m13468boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            alignment = Alignment.INSTANCE.getBottomEnd();
        }
        if ((i & 4) != 0) {
            z8 = true;
        }
        if ((i & 8) != 0) {
            interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandIn.1
                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return IntSize.m13468boximpl(m6596invokemzRDjE0(((IntSize) obj2).m13480unboximpl()));
                }

                /* renamed from: invoke-mzRDjE0, reason: not valid java name */
                public final long m6596invokemzRDjE0(long j7) {
                    long j8 = 0;
                    return IntSize.m13471constructorimpl((j8 & 4294967295L) | (j8 << 32));
                }
            };
        }
        return expandIn(finiteAnimationSpec, alignment, z8, interfaceC6471c);
    }

    @Stable
    @NotNull
    public static final EnterTransition expandVertically(@NotNull FiniteAnimationSpec<IntSize> finiteAnimationSpec, @NotNull Alignment.Vertical vertical, boolean z8, @NotNull final InterfaceC6471c interfaceC6471c) {
        return expandIn(finiteAnimationSpec, toAlignment(vertical), z8, new InterfaceC6471c() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandVertically.2
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return IntSize.m13468boximpl(m6597invokemzRDjE0(((IntSize) obj).m13480unboximpl()));
            }

            /* renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m6597invokemzRDjE0(long j7) {
                return IntSize.m13471constructorimpl((((Number) interfaceC6471c.invoke(Integer.valueOf((int) (j7 & 4294967295L)))).intValue() & 4294967295L) | (((int) (j7 >> 32)) << 32));
            }
        });
    }

    public static /* synthetic */ EnterTransition expandVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z8, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m13468boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            vertical = Alignment.INSTANCE.getBottom();
        }
        if ((i & 4) != 0) {
            z8 = true;
        }
        if ((i & 8) != 0) {
            interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.animation.EnterExitTransitionKt.expandVertically.1
                public final Integer invoke(int i8) {
                    return 0;
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        return expandVertically(finiteAnimationSpec, vertical, z8, interfaceC6471c);
    }

    @Stable
    @NotNull
    public static final EnterTransition fadeIn(@NotNull FiniteAnimationSpec<Float> finiteAnimationSpec, float f) {
        return new EnterTransitionImpl(new TransitionData(new Fade(f, finiteAnimationSpec), null, null, null, false, null, 62, null));
    }

    public static /* synthetic */ EnterTransition fadeIn$default(FiniteAnimationSpec finiteAnimationSpec, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return fadeIn(finiteAnimationSpec, f);
    }

    @Stable
    @NotNull
    public static final ExitTransition fadeOut(@NotNull FiniteAnimationSpec<Float> finiteAnimationSpec, float f) {
        return new ExitTransitionImpl(new TransitionData(new Fade(f, finiteAnimationSpec), null, null, null, false, null, 62, null));
    }

    public static /* synthetic */ ExitTransition fadeOut$default(FiniteAnimationSpec finiteAnimationSpec, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return fadeOut(finiteAnimationSpec, f);
    }

    @Nullable
    public static final <T extends TransitionEffect> T get(@NotNull EnterTransition enterTransition, @NotNull TransitionEffectKey<T> transitionEffectKey) {
        TransitionEffect transitionEffect = enterTransition.getData().getEffectsMap().get(transitionEffectKey);
        if (transitionEffect instanceof TransitionEffect) {
            return (T) transitionEffect;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Stable
    @NotNull
    /* renamed from: scaleIn-L8ZKh-E, reason: not valid java name */
    public static final EnterTransition m6588scaleInL8ZKhE(@NotNull FiniteAnimationSpec<Float> finiteAnimationSpec, float f, long j7) {
        return new EnterTransitionImpl(new TransitionData(null, null, null, new Scale(f, j7, finiteAnimationSpec, null), false, 0 == true ? 1 : 0, 55, null));
    }

    /* renamed from: scaleIn-L8ZKh-E$default, reason: not valid java name */
    public static /* synthetic */ EnterTransition m6589scaleInL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f, long j7, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            j7 = TransformOrigin.INSTANCE.m11073getCenterSzJe1aQ();
        }
        return m6588scaleInL8ZKhE(finiteAnimationSpec, f, j7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Stable
    @NotNull
    /* renamed from: scaleOut-L8ZKh-E, reason: not valid java name */
    public static final ExitTransition m6590scaleOutL8ZKhE(@NotNull FiniteAnimationSpec<Float> finiteAnimationSpec, float f, long j7) {
        return new ExitTransitionImpl(new TransitionData(null, null, null, new Scale(f, j7, finiteAnimationSpec, null), false, 0 == true ? 1 : 0, 55, null));
    }

    /* renamed from: scaleOut-L8ZKh-E$default, reason: not valid java name */
    public static /* synthetic */ ExitTransition m6591scaleOutL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f, long j7, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            j7 = TransformOrigin.INSTANCE.m11073getCenterSzJe1aQ();
        }
        return m6590scaleOutL8ZKhE(finiteAnimationSpec, f, j7);
    }

    @Stable
    @NotNull
    public static final ExitTransition shrinkHorizontally(@NotNull FiniteAnimationSpec<IntSize> finiteAnimationSpec, @NotNull Alignment.Horizontal horizontal, boolean z8, @NotNull final InterfaceC6471c interfaceC6471c) {
        return shrinkOut(finiteAnimationSpec, toAlignment(horizontal), z8, new InterfaceC6471c() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkHorizontally.2
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return IntSize.m13468boximpl(m6598invokemzRDjE0(((IntSize) obj).m13480unboximpl()));
            }

            /* renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m6598invokemzRDjE0(long j7) {
                return IntSize.m13471constructorimpl((((int) (j7 & 4294967295L)) & 4294967295L) | (((Number) interfaceC6471c.invoke(Integer.valueOf((int) (j7 >> 32)))).intValue() << 32));
            }
        });
    }

    public static /* synthetic */ ExitTransition shrinkHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z8, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m13468boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            horizontal = Alignment.INSTANCE.getEnd();
        }
        if ((i & 4) != 0) {
            z8 = true;
        }
        if ((i & 8) != 0) {
            interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkHorizontally.1
                public final Integer invoke(int i8) {
                    return 0;
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        return shrinkHorizontally(finiteAnimationSpec, horizontal, z8, interfaceC6471c);
    }

    @Stable
    @NotNull
    public static final ExitTransition shrinkOut(@NotNull FiniteAnimationSpec<IntSize> finiteAnimationSpec, @NotNull Alignment alignment, boolean z8, @NotNull InterfaceC6471c interfaceC6471c) {
        return new ExitTransitionImpl(new TransitionData(null, null, new ChangeSize(alignment, interfaceC6471c, finiteAnimationSpec, z8), null, false, null, 59, null));
    }

    public static /* synthetic */ ExitTransition shrinkOut$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z8, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m13468boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            alignment = Alignment.INSTANCE.getBottomEnd();
        }
        if ((i & 4) != 0) {
            z8 = true;
        }
        if ((i & 8) != 0) {
            interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkOut.1
                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return IntSize.m13468boximpl(m6599invokemzRDjE0(((IntSize) obj2).m13480unboximpl()));
                }

                /* renamed from: invoke-mzRDjE0, reason: not valid java name */
                public final long m6599invokemzRDjE0(long j7) {
                    long j8 = 0;
                    return IntSize.m13471constructorimpl((j8 & 4294967295L) | (j8 << 32));
                }
            };
        }
        return shrinkOut(finiteAnimationSpec, alignment, z8, interfaceC6471c);
    }

    @Stable
    @NotNull
    public static final ExitTransition shrinkVertically(@NotNull FiniteAnimationSpec<IntSize> finiteAnimationSpec, @NotNull Alignment.Vertical vertical, boolean z8, @NotNull final InterfaceC6471c interfaceC6471c) {
        return shrinkOut(finiteAnimationSpec, toAlignment(vertical), z8, new InterfaceC6471c() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkVertically.2
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return IntSize.m13468boximpl(m6600invokemzRDjE0(((IntSize) obj).m13480unboximpl()));
            }

            /* renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m6600invokemzRDjE0(long j7) {
                return IntSize.m13471constructorimpl((((Number) interfaceC6471c.invoke(Integer.valueOf((int) (j7 & 4294967295L)))).intValue() & 4294967295L) | (((int) (j7 >> 32)) << 32));
            }
        });
    }

    public static /* synthetic */ ExitTransition shrinkVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z8, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m13468boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            vertical = Alignment.INSTANCE.getBottom();
        }
        if ((i & 4) != 0) {
            z8 = true;
        }
        if ((i & 8) != 0) {
            interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.animation.EnterExitTransitionKt.shrinkVertically.1
                public final Integer invoke(int i8) {
                    return 0;
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        return shrinkVertically(finiteAnimationSpec, vertical, z8, interfaceC6471c);
    }

    @Stable
    @NotNull
    public static final EnterTransition slideIn(@NotNull FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @NotNull InterfaceC6471c interfaceC6471c) {
        return new EnterTransitionImpl(new TransitionData(null, new Slide(interfaceC6471c, finiteAnimationSpec), null, null, false, null, 61, null));
    }

    public static /* synthetic */ EnterTransition slideIn$default(FiniteAnimationSpec finiteAnimationSpec, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m13424boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        return slideIn(finiteAnimationSpec, interfaceC6471c);
    }

    @Stable
    @NotNull
    public static final EnterTransition slideInHorizontally(@NotNull FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @NotNull final InterfaceC6471c interfaceC6471c) {
        return slideIn(finiteAnimationSpec, new InterfaceC6471c() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideInHorizontally.2
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return IntOffset.m13424boximpl(m6601invokemHKZG7I(((IntSize) obj).m13480unboximpl()));
            }

            /* renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m6601invokemHKZG7I(long j7) {
                return IntOffset.m13427constructorimpl((((Number) interfaceC6471c.invoke(Integer.valueOf((int) (j7 >> 32)))).intValue() << 32) | (0 & 4294967295L));
            }
        });
    }

    public static /* synthetic */ EnterTransition slideInHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m13424boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideInHorizontally.1
                public final Integer invoke(int i8) {
                    return Integer.valueOf((-i8) / 2);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        return slideInHorizontally(finiteAnimationSpec, interfaceC6471c);
    }

    @Stable
    @NotNull
    public static final EnterTransition slideInVertically(@NotNull FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @NotNull final InterfaceC6471c interfaceC6471c) {
        return slideIn(finiteAnimationSpec, new InterfaceC6471c() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideInVertically.2
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return IntOffset.m13424boximpl(m6602invokemHKZG7I(((IntSize) obj).m13480unboximpl()));
            }

            /* renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m6602invokemHKZG7I(long j7) {
                return IntOffset.m13427constructorimpl((((Number) interfaceC6471c.invoke(Integer.valueOf((int) (j7 & 4294967295L)))).intValue() & 4294967295L) | (0 << 32));
            }
        });
    }

    public static /* synthetic */ EnterTransition slideInVertically$default(FiniteAnimationSpec finiteAnimationSpec, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m13424boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideInVertically.1
                public final Integer invoke(int i8) {
                    return Integer.valueOf((-i8) / 2);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        return slideInVertically(finiteAnimationSpec, interfaceC6471c);
    }

    @Stable
    @NotNull
    public static final ExitTransition slideOut(@NotNull FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @NotNull InterfaceC6471c interfaceC6471c) {
        return new ExitTransitionImpl(new TransitionData(null, new Slide(interfaceC6471c, finiteAnimationSpec), null, null, false, null, 61, null));
    }

    public static /* synthetic */ ExitTransition slideOut$default(FiniteAnimationSpec finiteAnimationSpec, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m13424boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        return slideOut(finiteAnimationSpec, interfaceC6471c);
    }

    @Stable
    @NotNull
    public static final ExitTransition slideOutHorizontally(@NotNull FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @NotNull final InterfaceC6471c interfaceC6471c) {
        return slideOut(finiteAnimationSpec, new InterfaceC6471c() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideOutHorizontally.2
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return IntOffset.m13424boximpl(m6603invokemHKZG7I(((IntSize) obj).m13480unboximpl()));
            }

            /* renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m6603invokemHKZG7I(long j7) {
                return IntOffset.m13427constructorimpl((((Number) interfaceC6471c.invoke(Integer.valueOf((int) (j7 >> 32)))).intValue() << 32) | (0 & 4294967295L));
            }
        });
    }

    public static /* synthetic */ ExitTransition slideOutHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m13424boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideOutHorizontally.1
                public final Integer invoke(int i8) {
                    return Integer.valueOf((-i8) / 2);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        return slideOutHorizontally(finiteAnimationSpec, interfaceC6471c);
    }

    @Stable
    @NotNull
    public static final ExitTransition slideOutVertically(@NotNull FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @NotNull final InterfaceC6471c interfaceC6471c) {
        return slideOut(finiteAnimationSpec, new InterfaceC6471c() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideOutVertically.2
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return IntOffset.m13424boximpl(m6604invokemHKZG7I(((IntSize) obj).m13480unboximpl()));
            }

            /* renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m6604invokemHKZG7I(long j7) {
                return IntOffset.m13427constructorimpl((((Number) interfaceC6471c.invoke(Integer.valueOf((int) (j7 & 4294967295L)))).intValue() & 4294967295L) | (0 << 32));
            }
        });
    }

    public static /* synthetic */ ExitTransition slideOutVertically$default(FiniteAnimationSpec finiteAnimationSpec, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m13424boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.animation.EnterExitTransitionKt.slideOutVertically.1
                public final Integer invoke(int i8) {
                    return Integer.valueOf((-i8) / 2);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        return slideOutVertically(finiteAnimationSpec, interfaceC6471c);
    }

    private static final Alignment toAlignment(Alignment.Horizontal horizontal) {
        Alignment.Companion companion = Alignment.INSTANCE;
        return AbstractC5830k.m5325b(horizontal, companion.getStart()) ? companion.getCenterStart() : AbstractC5830k.m5325b(horizontal, companion.getEnd()) ? companion.getCenterEnd() : companion.getCenter();
    }

    @Composable
    @NotNull
    public static final EnterTransition trackActiveEnter(@NotNull Transition<EnterExitState> transition, @NotNull EnterTransition enterTransition, @Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(21614502, i, -1, "androidx.compose.animation.trackActiveEnter (EnterExitTransition.kt:908)");
        }
        boolean z8 = (((i & 14) ^ 6) > 4 && composer.changed(transition)) || (i & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z8 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(enterTransition, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        if (transition.getCurrentState() == transition.getTargetState() && transition.getCurrentState() == EnterExitState.Visible) {
            if (transition.isSeeking()) {
                mutableState.setValue(enterTransition);
            } else {
                mutableState.setValue(EnterTransition.INSTANCE.getNone());
            }
        } else if (transition.getTargetState() == EnterExitState.Visible) {
            mutableState.setValue(trackActiveEnter$lambda$5(mutableState).plus(enterTransition));
        }
        EnterTransition enterTransitionTrackActiveEnter$lambda$5 = trackActiveEnter$lambda$5(mutableState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return enterTransitionTrackActiveEnter$lambda$5;
    }

    private static final EnterTransition trackActiveEnter$lambda$5(MutableState<EnterTransition> mutableState) {
        return mutableState.getValue();
    }

    @Composable
    @NotNull
    public static final ExitTransition trackActiveExit(@NotNull Transition<EnterExitState> transition, @NotNull ExitTransition exitTransition, @Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1363864804, i, -1, "androidx.compose.animation.trackActiveExit (EnterExitTransition.kt:928)");
        }
        boolean z8 = (((i & 14) ^ 6) > 4 && composer.changed(transition)) || (i & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z8 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(exitTransition, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        if (transition.getCurrentState() == transition.getTargetState() && transition.getCurrentState() == EnterExitState.Visible) {
            if (transition.isSeeking()) {
                mutableState.setValue(exitTransition);
            } else {
                mutableState.setValue(ExitTransition.INSTANCE.getNone());
            }
        } else if (transition.getTargetState() != EnterExitState.Visible) {
            mutableState.setValue(trackActiveExit$lambda$8(mutableState).plus(exitTransition));
        }
        ExitTransition exitTransitionTrackActiveExit$lambda$8 = trackActiveExit$lambda$8(mutableState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return exitTransitionTrackActiveExit$lambda$8;
    }

    private static final ExitTransition trackActiveExit$lambda$8(MutableState<ExitTransition> mutableState) {
        return mutableState.getValue();
    }

    @NotNull
    public static final EnterTransition withEffect(@NotNull EnterTransition enterTransition, @NotNull TransitionEffect transitionEffect) {
        return new EnterTransitionImpl(new TransitionData(null, null, null, null, false, AbstractC5785e0.m5150D(new Pair(transitionEffect.getKey$animation_release(), transitionEffect)), 31, null));
    }

    @Nullable
    public static final <T extends TransitionEffect> T get(@NotNull ExitTransition exitTransition, @NotNull TransitionEffectKey<T> transitionEffectKey) {
        TransitionEffect transitionEffect = exitTransition.getData().getEffectsMap().get(transitionEffectKey);
        if (transitionEffect instanceof TransitionEffect) {
            return (T) transitionEffect;
        }
        return null;
    }

    private static final Alignment toAlignment(Alignment.Vertical vertical) {
        Alignment.Companion companion = Alignment.INSTANCE;
        return AbstractC5830k.m5325b(vertical, companion.getTop()) ? companion.getTopCenter() : AbstractC5830k.m5325b(vertical, companion.getBottom()) ? companion.getBottomCenter() : companion.getCenter();
    }

    @NotNull
    public static final ExitTransition withEffect(@NotNull ExitTransition exitTransition, @NotNull TransitionEffect transitionEffect) {
        return new ExitTransitionImpl(new TransitionData(null, null, null, null, false, AbstractC5785e0.m5150D(new Pair(transitionEffect.getKey$animation_release(), transitionEffect)), 31, null));
    }
}
