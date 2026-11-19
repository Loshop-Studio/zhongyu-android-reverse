package androidx.constraintlayout.compose;

import android.annotation.SuppressLint;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.p012ui.Alignment;
import androidx.compose.p012ui.ComposedModifierKt;
import androidx.compose.p012ui.Modifier;
import androidx.compose.p012ui.draw.ScaleKt;
import androidx.compose.p012ui.graphics.GraphicsLayerScope;
import androidx.compose.p012ui.graphics.TransformOriginKt;
import androidx.compose.p012ui.layout.LayoutIdKt;
import androidx.compose.p012ui.layout.LayoutKt;
import androidx.compose.p012ui.layout.Measurable;
import androidx.compose.p012ui.layout.MeasurePolicy;
import androidx.compose.p012ui.layout.Placeable;
import androidx.compose.p012ui.node.ComposeUiNode;
import androidx.compose.p012ui.node.Ref;
import androidx.compose.p012ui.platform.CompositionLocalsKt;
import androidx.compose.p012ui.semantics.SemanticsModifierKt;
import androidx.compose.p012ui.unit.Density;
import androidx.compose.p012ui.unit.IntOffset;
import androidx.compose.p012ui.unit.IntOffsetKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

@Metadata(m13412d1 = {"\u0000º\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001af\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0010\b\n\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00182\u001e\b\u0004\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\b\u001c¢\u0006\u0002\b\u001dH\u0087\b¢\u0006\u0002\u0010\u001e\u001an\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u001f\u001a\u00020\u00012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0010\b\n\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00182\u001e\b\u0004\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\b\u001c¢\u0006\u0002\b\u001dH\u0087\b¢\u0006\u0002\u0010!\u001ac\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020#2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0010\b\n\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00182\u0013\b\u0004\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u000f0\u0018¢\u0006\u0002\b\u001cH\u0087\b¢\u0006\u0002\u0010$\u001ak\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020#2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u001f\u001a\u00020\u00012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0010\b\n\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00182\u0013\b\u0004\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u000f0\u0018¢\u0006\u0002\b\u001cH\u0087\b¢\u0006\u0002\u0010%\u001a'\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020#2\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\b\u001d\u001a\u0018\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020#2\b\b\u0001\u0010*\u001a\u00020+\u001a\u001f\u0010&\u001a\u00020#2\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u000f0\u001a¢\u0006\u0002\b\u001d\u001a\u0010\u0010&\u001a\u00020#2\b\b\u0001\u0010*\u001a\u00020+\u001a#\u0010&\u001a\u00020#2\b\b\u0001\u0010\u0019\u001a\u00020+2\n\b\u0003\u0010,\u001a\u0004\u0018\u00010+H\u0007¢\u0006\u0002\u0010-\u001a\u001e\u0010.\u001a\u00020\u000f2\u0006\u0010/\u001a\u0002002\f\u00101\u001a\b\u0012\u0004\u0012\u00020302H\u0000\u001a\b\u00104\u001a\u000205H\u0000\u001a\u001c\u00106\u001a\u00020\u0003*\u00020\u00042\u0006\u00107\u001a\u000208ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a\u001c\u00106\u001a\u00020\u0007*\u00020\b2\u0006\u00107\u001a\u000208ø\u0001\u0000¢\u0006\u0004\b9\u0010;\u001a\u001e\u0010\u0002\u001a\u00020\u0007*\u00020\b2\u0006\u00107\u001a\u000208H\u0007ø\u0001\u0000¢\u0006\u0004\b<\u0010;\u001a\u001c\u0010=\u001a\u00020\b*\u00020\u00042\u0006\u00107\u001a\u000208ø\u0001\u0000¢\u0006\u0004\b>\u0010?\u001a\u001c\u0010=\u001a\u00020\u0007*\u00020\u00032\u0006\u00107\u001a\u000208ø\u0001\u0000¢\u0006\u0004\b>\u0010@\u001a0\u0010A\u001a\u00020\u000f*\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\b\b\u0002\u0010G\u001a\u00020HH\u0000ø\u0001\u0000¢\u0006\u0004\bI\u0010J\u001a\f\u0010K\u001a\u00020+*\u00020LH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0003*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0015\u0010\u0002\u001a\u00020\u0007*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\t\"\u0015\u0010\n\u001a\u00020\b*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0015\u0010\n\u001a\u00020\u0007*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\r*\f\b\u0000\u0010M\"\u00020N2\u00020N*\f\b\u0000\u0010O\"\u00020P2\u00020P\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Q²\u0006\n\u0010R\u001a\u00020#X\u008a\u008e\u0002²\u0006\n\u0010S\u001a\u00020#X\u008a\u008e\u0002"}, m13413d2 = {"DEBUG", "", "atLeastWrapContent", "Landroidx/constraintlayout/compose/Dimension$MaxCoercible;", "Landroidx/constraintlayout/compose/Dimension$Coercible;", "getAtLeastWrapContent", "(Landroidx/constraintlayout/compose/Dimension$Coercible;)Landroidx/constraintlayout/compose/Dimension$MaxCoercible;", "Landroidx/constraintlayout/compose/Dimension;", "Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "(Landroidx/constraintlayout/compose/Dimension$MinCoercible;)Landroidx/constraintlayout/compose/Dimension;", "atMostWrapContent", "getAtMostWrapContent", "(Landroidx/constraintlayout/compose/Dimension$Coercible;)Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "(Landroidx/constraintlayout/compose/Dimension$MaxCoercible;)Landroidx/constraintlayout/compose/Dimension;", "ConstraintLayout", "", "modifier", "Landroidx/compose/ui/Modifier;", "optimizationLevel", "", "animateChangesSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "finishedAnimationListener", "Lkotlin/Function0;", "content", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/ConstraintLayoutScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;ILandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "animateChanges", "animationSpec", "(Landroidx/compose/ui/Modifier;IZLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "constraintSet", "Landroidx/constraintlayout/compose/ConstraintSet;", "(Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/compose/ui/Modifier;ILandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/compose/ui/Modifier;IZLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ConstraintSet", "extendConstraintSet", "description", "Landroidx/constraintlayout/compose/ConstraintSetScope;", "jsonContent", "", "overrideVariables", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/constraintlayout/compose/ConstraintSet;", "buildMapping", "state", "Landroidx/constraintlayout/compose/State;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "createId", "", "atLeast", "dp", "Landroidx/compose/ui/unit/Dp;", "atLeast-3ABfNKs", "(Landroidx/constraintlayout/compose/Dimension$Coercible;F)Landroidx/constraintlayout/compose/Dimension$MaxCoercible;", "(Landroidx/constraintlayout/compose/Dimension$MinCoercible;F)Landroidx/constraintlayout/compose/Dimension;", "atLeastWrapContent-3ABfNKs", "atMost", "atMost-3ABfNKs", "(Landroidx/constraintlayout/compose/Dimension$Coercible;F)Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "(Landroidx/constraintlayout/compose/Dimension$MaxCoercible;F)Landroidx/constraintlayout/compose/Dimension;", "placeWithFrameTransform", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placeable", "Landroidx/compose/ui/layout/Placeable;", TypedValues.AttributesType.S_FRAME, "Landroidx/constraintlayout/core/state/WidgetFrame;", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/unit/IntOffset;", "placeWithFrameTransform-Ktjjmr4", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;Landroidx/constraintlayout/core/state/WidgetFrame;J)V", "toDebugString", "Landroidx/constraintlayout/core/widgets/ConstraintWidget;", "SolverDimension", "Landroidx/constraintlayout/core/state/Dimension;", "SolverState", "Landroidx/constraintlayout/core/state/State;", "constraintlayout-compose_release", "startConstraint", "endConstraint"}, m13414k = 2, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 MotionLayout.kt\nandroidx/constraintlayout/compose/MotionLayoutKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2303:1\n359#1,2:2390\n361#1,2:2398\n363#1,7:2401\n401#1,10:2408\n400#1:2418\n412#1,4:2419\n416#1,7:2424\n446#1,12:2431\n472#1:2443\n768#1,3:2604\n771#1,8:2613\n796#1,3:2621\n795#1:2624\n802#1,5:2659\n807#1,2:2665\n829#1,9:2667\n838#1,7:2713\n845#1,16:2724\n1225#2,6:2304\n1225#2,6:2310\n1225#2,3:2316\n1228#2,3:2320\n1225#2,6:2323\n1225#2,6:2329\n1225#2,6:2335\n1225#2,6:2342\n1225#2,6:2348\n1225#2,6:2354\n1225#2,6:2360\n1225#2,6:2366\n1225#2,6:2372\n1225#2,6:2378\n1225#2,6:2384\n1225#2,6:2392\n1225#2,6:2444\n1225#2,6:2450\n1225#2,6:2456\n1225#2,6:2462\n1225#2,6:2468\n1225#2,6:2474\n1225#2,6:2480\n1225#2,6:2500\n1225#2,6:2526\n1225#2,6:2532\n1225#2,6:2539\n1225#2,6:2545\n1225#2,6:2588\n1225#2,6:2598\n1225#2,6:2607\n1225#2,6:2740\n1#3:2319\n1#3:2400\n1#3:2508\n1#3:2641\n77#4:2341\n77#4:2423\n77#4:2538\n77#4:2664\n139#5:2486\n134#5,13:2487\n147#5,2:2506\n152#5:2509\n168#5,14:2510\n167#5:2524\n183#5:2525\n139#5:2625\n134#5,15:2626\n152#5:2642\n168#5,14:2643\n167#5:2657\n183#5:2658\n71#6:2551\n67#6,7:2552\n74#6:2587\n78#6:2597\n71#6:2676\n67#6,7:2677\n74#6:2712\n78#6:2723\n79#7,6:2559\n86#7,4:2574\n90#7,2:2584\n94#7:2596\n79#7,6:2684\n86#7,4:2699\n90#7,2:2709\n94#7:2722\n368#8,9:2565\n377#8:2586\n378#8,2:2594\n368#8,9:2690\n377#8:2711\n378#8,2:2720\n4034#9,6:2578\n4034#9,6:2703\n33#10,6:2746\n81#11:2752\n107#11,2:2753\n81#11:2755\n107#11,2:2756\n*S KotlinDebug\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n*L\n496#1:2390,2\n496#1:2398,2\n496#1:2401,7\n496#1:2408,10\n496#1:2418\n496#1:2419,4\n496#1:2424,7\n496#1:2431,12\n496#1:2443\n886#1:2604,3\n886#1:2613,8\n886#1:2621,3\n886#1:2624\n886#1:2659,5\n886#1:2665,2\n886#1:2667,9\n886#1:2713,7\n886#1:2724,16\n360#1:2304,6\n361#1:2310,6\n362#1:2316,3\n362#1:2320,3\n363#1:2323,6\n364#1:2329,6\n367#1:2335,6\n416#1:2342,6\n417#1:2348,6\n418#1:2354,6\n419#1:2360,6\n420#1:2366,6\n422#1:2372,6\n446#1:2378,6\n455#1:2384,6\n496#1:2392,6\n770#1:2444,6\n771#1:2450,6\n772#1:2456,6\n773#1:2462,6\n774#1:2468,6\n776#1:2474,6\n778#1:2480,6\n795#1:2500,6\n803#1:2526,6\n805#1:2532,6\n807#1:2539,6\n808#1:2545,6\n840#1:2588,6\n848#1:2598,6\n886#1:2607,6\n1350#1:2740,6\n496#1:2400\n795#1:2508\n886#1:2641\n415#1:2341\n496#1:2423\n806#1:2538\n886#1:2664\n795#1:2486\n795#1:2487,13\n795#1:2506,2\n795#1:2509\n795#1:2510,14\n795#1:2524\n795#1:2525\n886#1:2625\n886#1:2626,15\n886#1:2642\n886#1:2643,14\n886#1:2657\n886#1:2658\n837#1:2551\n837#1:2552,7\n837#1:2587\n837#1:2597\n886#1:2676\n886#1:2677,7\n886#1:2712\n886#1:2723\n837#1:2559,6\n837#1:2574,4\n837#1:2584,2\n837#1:2596\n886#1:2684,6\n886#1:2699,4\n886#1:2709,2\n886#1:2722\n837#1:2565,9\n837#1:2586\n837#1:2594,2\n886#1:2690,9\n886#1:2711\n886#1:2720,2\n837#1:2578,6\n886#1:2703,6\n2274#1:2746,6\n770#1:2752\n770#1:2753,2\n771#1:2755\n771#1:2756,2\n*E\n"})
/* loaded from: classes2.dex */
public final class ConstraintLayoutKt {
    private static final boolean DEBUG = false;

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m13413d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = 176)
    /* renamed from: androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$2 */
    public static final class C31562 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function3<ConstraintLayoutScope, Composer, Integer, Unit> $content;
        final /* synthetic */ MutableState<Unit> $contentTracker;
        final /* synthetic */ Function0<Unit> $onHelpersChanged;
        final /* synthetic */ ConstraintLayoutScope $scope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C31562(MutableState<Unit> mutableState, ConstraintLayoutScope constraintLayoutScope, Function3<? super ConstraintLayoutScope, ? super Composer, ? super Integer, Unit> function3, Function0<Unit> function0) {
            super(2);
            this.$contentTracker = mutableState;
            this.$scope = constraintLayoutScope;
            this.$content = function3;
            this.$onHelpersChanged = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(Composer composer, int i9) {
            if ((i9 & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1200550679, i9, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
            }
            this.$contentTracker.setValue(Unit.INSTANCE);
            int helpersHashCode = this.$scope.getHelpersHashCode();
            this.$scope.reset();
            this.$content.invoke(this.$scope, composer, 0);
            if (this.$scope.getHelpersHashCode() != helpersHashCode) {
                EffectsKt.SideEffect(this.$onHelpersChanged, composer, 6);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m13413d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = 176)
    /* renamed from: androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$8 */
    public static final class C31578 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;
        final /* synthetic */ MutableState<Unit> $contentTracker;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C31578(MutableState<Unit> mutableState, Function2<? super Composer, ? super Integer, Unit> function2) {
            super(2);
            this.$contentTracker = mutableState;
            this.$content = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(Composer composer, int i9) {
            if ((i9 & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-207512644, i9, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:853)");
            }
            this.$contentTracker.setValue(Unit.INSTANCE);
            this.$content.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ConstraintLayout(Modifier modifier, int i9, AnimationSpec<Float> animationSpec, Function0<Unit> function0, Function3<? super ConstraintLayoutScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i10, int i11) {
        composer.startReplaceGroup(-1003410150);
        Modifier modifier2 = (i11 & 1) != 0 ? Modifier.INSTANCE : modifier;
        int i12 = (i11 & 2) != 0 ? 257 : i9;
        AnimationSpec<Float> animationSpec2 = (i11 & 4) != 0 ? null : animationSpec;
        Function0<Unit> function02 = (i11 & 8) != 0 ? null : function0;
        composer.startReplaceGroup(212064437);
        if (animationSpec2 != null) {
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            Object objRememberedValue3 = composer.rememberedValue();
            Object obj = objRememberedValue3;
            if (objRememberedValue3 == companion.getEmpty()) {
                ConstraintLayoutScope constraintLayoutScope = new ConstraintLayoutScope();
                constraintLayoutScope.setAnimateChanges(true);
                composer.updateRememberedValue(constraintLayoutScope);
                obj = constraintLayoutScope;
            }
            ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) obj;
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                composer.updateRememberedValue(objRememberedValue4);
            }
            MutableState mutableState3 = (MutableState) objRememberedValue4;
            Object objRememberedValue5 = composer.rememberedValue();
            Object obj2 = objRememberedValue5;
            if (objRememberedValue5 == companion.getEmpty()) {
                Ref ref = new Ref();
                ref.setValue(CompositionSource.Unknown);
                composer.updateRememberedValue(ref);
                obj2 = ref;
            }
            Ref ref2 = (Ref) obj2;
            Object objRememberedValue6 = composer.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = ChannelKt.Channel$default(-1, null, null, 6, null);
                composer.updateRememberedValue(objRememberedValue6);
            }
            Channel channel = (Channel) objRememberedValue6;
            LateMotionLayoutKt.LateMotionLayout(mutableState, mutableState2, animationSpec2, channel, mutableState3, ref2, i12, function02, modifier2, ComposableLambdaKt.rememberComposableLambda(-74958949, true, new ConstraintLayoutKt$ConstraintLayout$contentDelegate$1(mutableState3, ref2, constraintLayoutScope2, function3, channel, mutableState, mutableState2), composer, 54), composer, (i10 & 896) | 805330998 | (Ref.$stable << 15) | ((i10 << 15) & 3670016) | ((i10 << 12) & 29360128) | ((i10 << 24) & 234881024));
            composer.endReplaceGroup();
            composer.endReplaceGroup();
            return;
        }
        composer.endReplaceGroup();
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object objRememberedValue7 = composer.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue7 == companion2.getEmpty()) {
            objRememberedValue7 = new Measurer2(density);
            composer.updateRememberedValue(objRememberedValue7);
        }
        Measurer2 measurer2 = (Measurer2) objRememberedValue7;
        Object objRememberedValue8 = composer.rememberedValue();
        if (objRememberedValue8 == companion2.getEmpty()) {
            objRememberedValue8 = new ConstraintLayoutScope();
            composer.updateRememberedValue(objRememberedValue8);
        }
        ConstraintLayoutScope constraintLayoutScope3 = (ConstraintLayoutScope) objRememberedValue8;
        Object objRememberedValue9 = composer.rememberedValue();
        if (objRememberedValue9 == companion2.getEmpty()) {
            objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue9);
        }
        MutableState mutableState4 = (MutableState) objRememberedValue9;
        Object objRememberedValue10 = composer.rememberedValue();
        if (objRememberedValue10 == companion2.getEmpty()) {
            objRememberedValue10 = new ConstraintSetForInlineDsl(constraintLayoutScope3);
            composer.updateRememberedValue(objRememberedValue10);
        }
        ConstraintSetForInlineDsl constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue10;
        Object objRememberedValue11 = composer.rememberedValue();
        if (objRememberedValue11 == companion2.getEmpty()) {
            objRememberedValue11 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
            composer.updateRememberedValue(objRememberedValue11);
        }
        MutableState mutableState5 = (MutableState) objRememberedValue11;
        boolean zChangedInstance = ((((i10 & 112) ^ 48) > 32 && composer.changed(i12)) || (i10 & 48) == 32) | composer.changedInstance(measurer2);
        Object objRememberedValue12 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue12 == companion2.getEmpty()) {
            Object constraintLayoutKt$ConstraintLayout$measurePolicy$1$1 = new ConstraintLayoutKt$ConstraintLayout$measurePolicy$1$1(mutableState5, measurer2, constraintSetForInlineDsl, i12, mutableState4);
            composer.updateRememberedValue(constraintLayoutKt$ConstraintLayout$measurePolicy$1$1);
            objRememberedValue12 = constraintLayoutKt$ConstraintLayout$measurePolicy$1$1;
        }
        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue12;
        Object objRememberedValue13 = composer.rememberedValue();
        if (objRememberedValue13 == companion2.getEmpty()) {
            objRememberedValue13 = new ConstraintLayoutKt$ConstraintLayout$onHelpersChanged$1$1(mutableState4, constraintSetForInlineDsl);
            composer.updateRememberedValue(objRememberedValue13);
        }
        Function0 function03 = (Function0) objRememberedValue13;
        boolean zChangedInstance2 = composer.changedInstance(measurer2);
        Object objRememberedValue14 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue14 == companion2.getEmpty()) {
            objRememberedValue14 = new ConstraintLayoutKt$ConstraintLayout$1$1(measurer2);
            composer.updateRememberedValue(objRememberedValue14);
        }
        LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, (Function1) objRememberedValue14, 1, null), ComposableLambdaKt.rememberComposableLambda(1200550679, true, new C31562(mutableState5, constraintLayoutScope3, function3, function03), composer, 54), measurePolicy, composer, 48, 0);
        composer.endReplaceGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ConstraintLayout$lambda-17, reason: not valid java name */
    public static final ConstraintSet m24322ConstraintLayout$lambda17(MutableState<ConstraintSet> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ConstraintLayout$lambda-20, reason: not valid java name */
    public static final ConstraintSet m24324ConstraintLayout$lambda20(MutableState<ConstraintSet> mutableState) {
        return mutableState.getValue();
    }

    @Composable
    @SuppressLint({"ComposableNaming"})
    public static final ConstraintSet ConstraintSet(String str, String str2, Composer composer, int i9, int i10) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1420317079, i9, -1, "androidx.constraintlayout.compose.ConstraintSet (ConstraintLayout.kt:1347)");
        }
        boolean z9 = ((((i9 & 14) ^ 6) > 4 && composer.changed(str)) || (i9 & 6) == 4) | ((((i9 & 112) ^ 48) > 32 && composer.changed(str3)) || (i9 & 48) == 32);
        Object objRememberedValue = composer.rememberedValue();
        if (z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            JSONConstraintSet jSONConstraintSet = new JSONConstraintSet(str, str3, null, 4, null);
            composer.updateRememberedValue(jSONConstraintSet);
            objRememberedValue = jSONConstraintSet;
        }
        JSONConstraintSet jSONConstraintSet2 = (JSONConstraintSet) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jSONConstraintSet2;
    }

    /* renamed from: atLeast-3ABfNKs, reason: not valid java name */
    public static final Dimension.MaxCoercible m24330atLeast3ABfNKs(Dimension.Coercible coercible, float f10) {
        Intrinsics.checkNotNull(coercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) coercible;
        dimensionDescription.getMin().m24353update0680j_4(f10);
        return dimensionDescription;
    }

    @Deprecated(message = "Unintended method name, use atLeast(dp) instead", replaceWith = @ReplaceWith(expression = "this.atLeast(dp)", imports = {"androidx.constraintlayout.compose.atLeast"}))
    /* renamed from: atLeastWrapContent-3ABfNKs, reason: not valid java name */
    public static final Dimension m24332atLeastWrapContent3ABfNKs(Dimension.MinCoercible minCoercible, float f10) {
        Intrinsics.checkNotNull(minCoercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) minCoercible;
        dimensionDescription.getMin().m24353update0680j_4(f10);
        return dimensionDescription;
    }

    /* renamed from: atMost-3ABfNKs, reason: not valid java name */
    public static final Dimension.MinCoercible m24333atMost3ABfNKs(Dimension.Coercible coercible, float f10) {
        Intrinsics.checkNotNull(coercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) coercible;
        dimensionDescription.getMax().m24353update0680j_4(f10);
        return dimensionDescription;
    }

    public static final void buildMapping(State state, List<? extends Measurable> list) {
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            Measurable measurable = list.get(i9);
            Object layoutId = LayoutIdKt.getLayoutId(measurable);
            if (layoutId == null && (layoutId = ConstraintLayoutTagKt.getConstraintLayoutId(measurable)) == null) {
                layoutId = createId();
            }
            state.map(layoutId.toString(), measurable);
            Object constraintLayoutTag = ConstraintLayoutTagKt.getConstraintLayoutTag(measurable);
            if (constraintLayoutTag != null && (constraintLayoutTag instanceof String) && (layoutId instanceof String)) {
                state.setTag((String) layoutId, (String) constraintLayoutTag);
            }
        }
    }

    public static final Object createId() {
        return new Object() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt.createId.1
        };
    }

    public static final Dimension.MaxCoercible getAtLeastWrapContent(Dimension.Coercible coercible) {
        Intrinsics.checkNotNull(coercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) coercible;
        dimensionDescription.getMin().update("wrap");
        return dimensionDescription;
    }

    public static final Dimension.MinCoercible getAtMostWrapContent(Dimension.Coercible coercible) {
        Intrinsics.checkNotNull(coercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) coercible;
        dimensionDescription.getMax().update("wrap");
        return dimensionDescription;
    }

    /* renamed from: placeWithFrameTransform-Ktjjmr4, reason: not valid java name */
    public static final void m24335placeWithFrameTransformKtjjmr4(Placeable.PlacementScope placementScope, Placeable placeable, final WidgetFrame widgetFrame, long j9) {
        if (widgetFrame.visibility == 8) {
            return;
        }
        if (widgetFrame.isDefaultTransform()) {
            Placeable.PlacementScope.m22821place70tqf50$default(placementScope, placeable, IntOffsetKt.IntOffset(widgetFrame.left - IntOffset.m24122getXimpl(j9), widgetFrame.f18127top - IntOffset.m24123getYimpl(j9)), 0.0f, 2, null);
        } else {
            placementScope.placeWithLayer(placeable, widgetFrame.left - IntOffset.m24122getXimpl(j9), widgetFrame.f18127top - IntOffset.m24123getYimpl(j9), Float.isNaN(widgetFrame.translationZ) ? 0.0f : widgetFrame.translationZ, new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$placeWithFrameTransform$layerBlock$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                    invoke2(graphicsLayerScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                    if (!Float.isNaN(widgetFrame.pivotX) || !Float.isNaN(widgetFrame.pivotY)) {
                        graphicsLayerScope.mo21601setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(Float.isNaN(widgetFrame.pivotX) ? 0.5f : widgetFrame.pivotX, Float.isNaN(widgetFrame.pivotY) ? 0.5f : widgetFrame.pivotY));
                    }
                    if (!Float.isNaN(widgetFrame.rotationX)) {
                        graphicsLayerScope.setRotationX(widgetFrame.rotationX);
                    }
                    if (!Float.isNaN(widgetFrame.rotationY)) {
                        graphicsLayerScope.setRotationY(widgetFrame.rotationY);
                    }
                    if (!Float.isNaN(widgetFrame.rotationZ)) {
                        graphicsLayerScope.setRotationZ(widgetFrame.rotationZ);
                    }
                    if (!Float.isNaN(widgetFrame.translationX)) {
                        graphicsLayerScope.setTranslationX(widgetFrame.translationX);
                    }
                    if (!Float.isNaN(widgetFrame.translationY)) {
                        graphicsLayerScope.setTranslationY(widgetFrame.translationY);
                    }
                    if (!Float.isNaN(widgetFrame.translationZ)) {
                        graphicsLayerScope.setShadowElevation(widgetFrame.translationZ);
                    }
                    if (!Float.isNaN(widgetFrame.scaleX) || !Float.isNaN(widgetFrame.scaleY)) {
                        graphicsLayerScope.setScaleX(Float.isNaN(widgetFrame.scaleX) ? 1.0f : widgetFrame.scaleX);
                        graphicsLayerScope.setScaleY(Float.isNaN(widgetFrame.scaleY) ? 1.0f : widgetFrame.scaleY);
                    }
                    if (Float.isNaN(widgetFrame.alpha)) {
                        return;
                    }
                    graphicsLayerScope.setAlpha(widgetFrame.alpha);
                }
            });
        }
    }

    /* renamed from: placeWithFrameTransform-Ktjjmr4$default, reason: not valid java name */
    public static /* synthetic */ void m24336placeWithFrameTransformKtjjmr4$default(Placeable.PlacementScope placementScope, Placeable placeable, WidgetFrame widgetFrame, long j9, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            j9 = IntOffset.INSTANCE.m24133getZeronOccac();
        }
        m24335placeWithFrameTransformKtjjmr4(placementScope, placeable, widgetFrame, j9);
    }

    public static final String toDebugString(ConstraintWidget constraintWidget) {
        return constraintWidget.getDebugName() + " width " + constraintWidget.getWidth() + " minWidth " + constraintWidget.getMinWidth() + " maxWidth " + constraintWidget.getMaxWidth() + " height " + constraintWidget.getHeight() + " minHeight " + constraintWidget.getMinHeight() + " maxHeight " + constraintWidget.getMaxHeight() + " HDB " + constraintWidget.getHorizontalDimensionBehaviour() + " VDB " + constraintWidget.getVerticalDimensionBehaviour() + " MCW " + constraintWidget.mMatchConstraintDefaultWidth + " MCH " + constraintWidget.mMatchConstraintDefaultHeight + " percentW " + constraintWidget.mMatchConstraintPercentWidth + " percentH " + constraintWidget.mMatchConstraintPercentHeight;
    }

    /* renamed from: atLeast-3ABfNKs, reason: not valid java name */
    public static final Dimension m24331atLeast3ABfNKs(Dimension.MinCoercible minCoercible, float f10) {
        Intrinsics.checkNotNull(minCoercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) minCoercible;
        dimensionDescription.getMin().m24353update0680j_4(f10);
        return dimensionDescription;
    }

    /* renamed from: atMost-3ABfNKs, reason: not valid java name */
    public static final Dimension m24334atMost3ABfNKs(Dimension.MaxCoercible maxCoercible, float f10) {
        Intrinsics.checkNotNull(maxCoercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) maxCoercible;
        dimensionDescription.getMax().m24353update0680j_4(f10);
        return dimensionDescription;
    }

    public static final Dimension getAtLeastWrapContent(Dimension.MinCoercible minCoercible) {
        Intrinsics.checkNotNull(minCoercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) minCoercible;
        dimensionDescription.getMin().update("wrap");
        return dimensionDescription;
    }

    public static final Dimension getAtMostWrapContent(Dimension.MaxCoercible maxCoercible) {
        Intrinsics.checkNotNull(maxCoercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) maxCoercible;
        dimensionDescription.getMax().update("wrap");
        return dimensionDescription;
    }

    public static final ConstraintSet ConstraintSet(String str) {
        return new JSONConstraintSet(str, null, null, 6, null);
    }

    public static final ConstraintSet ConstraintSet(ConstraintSet constraintSet, String str) {
        return new JSONConstraintSet(str, null, constraintSet, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ConstraintSet ConstraintSet(Function1<? super ConstraintSetScope, Unit> function1) {
        return new DslConstraintSet(function1, null, 2, 0 == true ? 1 : 0);
    }

    public static final ConstraintSet ConstraintSet(ConstraintSet constraintSet, Function1<? super ConstraintSetScope, Unit> function1) {
        return new DslConstraintSet(function1, constraintSet);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Prefer version that takes a nullable AnimationSpec to animate changes.", replaceWith = @ReplaceWith(expression = "ConstraintLayout(modifier = modifier, optimizationLevel = optimizationLevel, animateChangesSpec = animationSpec, finishedAnimationListener = finishedAnimationListener) { content() }", imports = {}))
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ConstraintLayout(Modifier modifier, int i9, boolean z9, AnimationSpec<Float> animationSpec, Function0<Unit> function0, Function3<? super ConstraintLayoutScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i10, int i11) {
        Measurer2 measurer2;
        MutableState mutableState;
        Object constraintLayoutKt$ConstraintLayout$measurePolicy$1$1;
        Modifier modifier2 = (i11 & 1) != 0 ? Modifier.INSTANCE : modifier;
        int i12 = (i11 & 2) != 0 ? 257 : i9;
        boolean z10 = (i11 & 4) != 0 ? false : z9;
        AnimationSpec<Float> animationSpecTween$default = (i11 & 8) != 0 ? AnimationSpecKt.tween$default(0, 0, null, 7, null) : animationSpec;
        Function0<Unit> function02 = (i11 & 16) != 0 ? null : function0;
        if (!z10) {
            animationSpecTween$default = null;
        }
        int i13 = i10 >> 3;
        int i14 = (i10 & 126) | (i13 & 7168) | (i13 & 57344);
        composer.startReplaceGroup(-1003410150);
        composer.startReplaceGroup(212064437);
        if (animationSpecTween$default != null) {
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState3 = (MutableState) objRememberedValue2;
            Object objRememberedValue3 = composer.rememberedValue();
            Object obj = objRememberedValue3;
            if (objRememberedValue3 == companion.getEmpty()) {
                ConstraintLayoutScope constraintLayoutScope = new ConstraintLayoutScope();
                constraintLayoutScope.setAnimateChanges(true);
                composer.updateRememberedValue(constraintLayoutScope);
                obj = constraintLayoutScope;
            }
            ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) obj;
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                composer.updateRememberedValue(objRememberedValue4);
            }
            MutableState mutableState4 = (MutableState) objRememberedValue4;
            Object objRememberedValue5 = composer.rememberedValue();
            Object obj2 = objRememberedValue5;
            if (objRememberedValue5 == companion.getEmpty()) {
                Ref ref = new Ref();
                ref.setValue(CompositionSource.Unknown);
                composer.updateRememberedValue(ref);
                obj2 = ref;
            }
            Ref ref2 = (Ref) obj2;
            Object objRememberedValue6 = composer.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = ChannelKt.Channel$default(-1, null, null, 6, null);
                composer.updateRememberedValue(objRememberedValue6);
            }
            Channel channel = (Channel) objRememberedValue6;
            LateMotionLayoutKt.LateMotionLayout(mutableState2, mutableState3, animationSpecTween$default, channel, mutableState4, ref2, i12, function02, modifier2, ComposableLambdaKt.rememberComposableLambda(-74958949, true, new ConstraintLayoutKt$ConstraintLayout$contentDelegate$1(mutableState4, ref2, constraintLayoutScope2, function3, channel, mutableState2, mutableState3), composer, 54), composer, (Ref.$stable << 15) | 805330998 | ((i14 << 15) & 3670016) | ((i14 << 12) & 29360128) | ((i14 << 24) & 234881024));
            composer.endReplaceGroup();
            composer.endReplaceGroup();
            return;
        }
        composer.endReplaceGroup();
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object objRememberedValue7 = composer.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue7 == companion2.getEmpty()) {
            objRememberedValue7 = new Measurer2(density);
            composer.updateRememberedValue(objRememberedValue7);
        }
        Measurer2 measurer22 = (Measurer2) objRememberedValue7;
        Object objRememberedValue8 = composer.rememberedValue();
        if (objRememberedValue8 == companion2.getEmpty()) {
            objRememberedValue8 = new ConstraintLayoutScope();
            composer.updateRememberedValue(objRememberedValue8);
        }
        ConstraintLayoutScope constraintLayoutScope3 = (ConstraintLayoutScope) objRememberedValue8;
        Object objRememberedValue9 = composer.rememberedValue();
        if (objRememberedValue9 == companion2.getEmpty()) {
            objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue9);
        }
        MutableState mutableState5 = (MutableState) objRememberedValue9;
        Object objRememberedValue10 = composer.rememberedValue();
        if (objRememberedValue10 == companion2.getEmpty()) {
            objRememberedValue10 = new ConstraintSetForInlineDsl(constraintLayoutScope3);
            composer.updateRememberedValue(objRememberedValue10);
        }
        ConstraintSetForInlineDsl constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue10;
        Object objRememberedValue11 = composer.rememberedValue();
        if (objRememberedValue11 == companion2.getEmpty()) {
            objRememberedValue11 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
            composer.updateRememberedValue(objRememberedValue11);
        }
        MutableState mutableState6 = (MutableState) objRememberedValue11;
        boolean zChangedInstance = ((((i14 & 112) ^ 48) > 32 && composer.changed(i12)) || (i14 & 48) == 32) | composer.changedInstance(measurer22);
        Object objRememberedValue12 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue12 == companion2.getEmpty()) {
            measurer2 = measurer22;
            mutableState = mutableState6;
            constraintLayoutKt$ConstraintLayout$measurePolicy$1$1 = new ConstraintLayoutKt$ConstraintLayout$measurePolicy$1$1(mutableState, measurer2, constraintSetForInlineDsl, i12, mutableState5);
            composer.updateRememberedValue(constraintLayoutKt$ConstraintLayout$measurePolicy$1$1);
        } else {
            mutableState = mutableState6;
            constraintLayoutKt$ConstraintLayout$measurePolicy$1$1 = objRememberedValue12;
            measurer2 = measurer22;
        }
        MeasurePolicy measurePolicy = (MeasurePolicy) constraintLayoutKt$ConstraintLayout$measurePolicy$1$1;
        Object objRememberedValue13 = composer.rememberedValue();
        if (objRememberedValue13 == companion2.getEmpty()) {
            objRememberedValue13 = new ConstraintLayoutKt$ConstraintLayout$onHelpersChanged$1$1(mutableState5, constraintSetForInlineDsl);
            composer.updateRememberedValue(objRememberedValue13);
        }
        Function0 function03 = (Function0) objRememberedValue13;
        boolean zChangedInstance2 = composer.changedInstance(measurer2);
        Object objRememberedValue14 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue14 == companion2.getEmpty()) {
            objRememberedValue14 = new ConstraintLayoutKt$ConstraintLayout$1$1(measurer2);
            composer.updateRememberedValue(objRememberedValue14);
        }
        LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, (Function1) objRememberedValue14, 1, null), ComposableLambdaKt.rememberComposableLambda(1200550679, true, new C31562(mutableState, constraintLayoutScope3, function3, function03), composer, 54), measurePolicy, composer, 48, 0);
        composer.endReplaceGroup();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ConstraintLayout(ConstraintSet constraintSet, Modifier modifier, int i9, AnimationSpec<Float> animationSpec, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10, int i11) {
        Animatable animatable;
        Modifier modifier2 = (i11 & 2) != 0 ? Modifier.INSTANCE : modifier;
        int i12 = (i11 & 4) != 0 ? 257 : i9;
        AnimationSpec<Float> animationSpec2 = (i11 & 8) != 0 ? null : animationSpec;
        Function0<Unit> function02 = (i11 & 16) != 0 ? null : function0;
        if (animationSpec2 != null) {
            composer.startReplaceGroup(-2000135165);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(constraintSet, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(constraintSet, null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composer.updateRememberedValue(objRememberedValue3);
            }
            Animatable animatable2 = (Animatable) objRememberedValue3;
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = ChannelKt.Channel$default(-1, null, null, 6, null);
                composer.updateRememberedValue(objRememberedValue4);
            }
            Channel channel = (Channel) objRememberedValue4;
            Object objRememberedValue5 = composer.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotIntStateKt.mutableIntStateOf(1);
                composer.updateRememberedValue(objRememberedValue5);
            }
            MutableIntState mutableIntState = (MutableIntState) objRememberedValue5;
            boolean zChangedInstance = composer.changedInstance(channel) | (((6 ^ (i10 & 14)) > 4 && composer.changed(constraintSet)) || (i10 & 6) == 4);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new ConstraintLayoutKt$ConstraintLayout$3$1(channel, constraintSet);
                composer.updateRememberedValue(objRememberedValue6);
            }
            EffectsKt.SideEffect((Function0) objRememberedValue6, composer, 0);
            boolean zChangedInstance2 = composer.changedInstance(channel) | composer.changedInstance(animatable2) | composer.changedInstance(animationSpec2) | ((((57344 & i10) ^ 24576) > 16384 && composer.changed(function02)) || (i10 & 24576) == 16384);
            Object objRememberedValue7 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue7 == companion.getEmpty()) {
                animatable = animatable2;
                Object constraintLayoutKt$ConstraintLayout$4$1 = new ConstraintLayoutKt$ConstraintLayout$4$1(channel, mutableIntState, animatable, animationSpec2, function02, mutableState, mutableState2, null);
                composer.updateRememberedValue(constraintLayoutKt$ConstraintLayout$4$1);
                objRememberedValue7 = constraintLayoutKt$ConstraintLayout$4$1;
            } else {
                animatable = animatable2;
            }
            EffectsKt.LaunchedEffect(channel, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composer, 0);
            ConstraintSet constraintSetM24322ConstraintLayout$lambda17 = m24322ConstraintLayout$lambda17(mutableState);
            ConstraintSet constraintSetM24324ConstraintLayout$lambda20 = m24324ConstraintLayout$lambda20(mutableState2);
            float fFloatValue = ((Number) animatable.getValue()).floatValue();
            int i13 = (i10 << 6) & 7168;
            int iM24350getNonebfy_xzQ = DebugFlags.INSTANCE.m24350getNonebfy_xzQ();
            InvalidationStrategy defaultInvalidationStrategy = InvalidationStrategy.INSTANCE.getDefaultInvalidationStrategy();
            Object objRememberedValue8 = composer.rememberedValue();
            if (objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                composer.updateRememberedValue(objRememberedValue8);
            }
            MutableState mutableState3 = (MutableState) objRememberedValue8;
            Object objRememberedValue9 = composer.rememberedValue();
            Object obj = objRememberedValue9;
            if (objRememberedValue9 == companion.getEmpty()) {
                Ref ref = new Ref();
                ref.setValue(CompositionSource.Unknown);
                composer.updateRememberedValue(ref);
                obj = ref;
            }
            Ref ref2 = (Ref) obj;
            MotionLayoutKt.MotionLayoutCore(constraintSetM24322ConstraintLayout$lambda17, constraintSetM24324ConstraintLayout$lambda20, null, fFloatValue, null, 257, DebugFlags.m24343getShowBoundsimpl(iM24350getNonebfy_xzQ), DebugFlags.m24345getShowPathsimpl(iM24350getNonebfy_xzQ), DebugFlags.m24344getShowKeyPositionsimpl(iM24350getNonebfy_xzQ), modifier2, mutableState3, ref2, defaultInvalidationStrategy, ComposableLambdaKt.rememberComposableLambda(284503157, true, new C3155x96520c53(mutableState3, defaultInvalidationStrategy, ref2, function2, i10), composer, 54), composer, 24576 | ((i13 << 18) & 1879048192), (Ref.$stable << 3) | 3078);
            composer.endReplaceGroup();
            return;
        }
        composer.startReplaceGroup(-1998673515);
        Object objRememberedValue10 = composer.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue10 == companion2.getEmpty()) {
            objRememberedValue10 = SnapshotLongStateKt.mutableLongStateOf(0L);
            composer.updateRememberedValue(objRememberedValue10);
        }
        MutableLongState mutableLongState = (MutableLongState) objRememberedValue10;
        Object objRememberedValue11 = composer.rememberedValue();
        if (objRememberedValue11 == companion2.getEmpty()) {
            objRememberedValue11 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
            composer.updateRememberedValue(objRememberedValue11);
        }
        MutableState mutableState4 = (MutableState) objRememberedValue11;
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object objRememberedValue12 = composer.rememberedValue();
        if (objRememberedValue12 == companion2.getEmpty()) {
            objRememberedValue12 = new Measurer2(density);
            composer.updateRememberedValue(objRememberedValue12);
        }
        Measurer2 measurer2 = (Measurer2) objRememberedValue12;
        boolean zChangedInstance3 = ((((i10 & 896) ^ 384) > 256 && composer.changed(i12)) || (i10 & 384) == 256) | composer.changedInstance(measurer2) | ((((i10 & 14) ^ 6) > 4 && composer.changed(constraintSet)) || (i10 & 6) == 4);
        Object objRememberedValue13 = composer.rememberedValue();
        if (zChangedInstance3 || objRememberedValue13 == companion2.getEmpty()) {
            objRememberedValue13 = new ConstraintLayoutKt$ConstraintLayout$measurePolicy$2$1(mutableState4, measurer2, constraintSet, i12);
            composer.updateRememberedValue(objRememberedValue13);
        }
        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue13;
        if (constraintSet instanceof EditableJSONLayout) {
            ((EditableJSONLayout) constraintSet).setUpdateFlag(mutableLongState);
        }
        measurer2.addLayoutInformationReceiver(constraintSet instanceof LayoutInformationReceiver ? (LayoutInformationReceiver) constraintSet : null);
        if (!Float.isNaN(measurer2.getForcedScaleFactor())) {
            composer.startReplaceGroup(-1997256040);
            Modifier modifierScale = ScaleKt.scale(modifier2, measurer2.getForcedScaleFactor());
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion3);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM20851constructorimpl = Updater.m20851constructorimpl(composer);
            Updater.m20858setimpl(composerM20851constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m20858setimpl(composerM20851constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM20851constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20851constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20851constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20851constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20858setimpl(composerM20851constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            boolean zChangedInstance4 = composer.changedInstance(measurer2);
            Object objRememberedValue14 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue14 == companion2.getEmpty()) {
                objRememberedValue14 = new ConstraintLayoutKt$ConstraintLayout$6$1$1(measurer2);
                composer.updateRememberedValue(objRememberedValue14);
            }
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierScale, false, (Function1) objRememberedValue14, 1, null), ComposableLambdaKt.rememberComposableLambda(1131308473, true, new ConstraintLayoutKt$ConstraintLayout$6$2(function2), composer, 54), measurePolicy, composer, 48, 0);
            composer.endNode();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1996827620);
            boolean zChangedInstance5 = composer.changedInstance(measurer2);
            Object objRememberedValue15 = composer.rememberedValue();
            if (zChangedInstance5 || objRememberedValue15 == companion2.getEmpty()) {
                objRememberedValue15 = new ConstraintLayoutKt$ConstraintLayout$7$1(measurer2);
                composer.updateRememberedValue(objRememberedValue15);
            }
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, (Function1) objRememberedValue15, 1, null), ComposableLambdaKt.rememberComposableLambda(-207512644, true, new C31578(mutableState4, function2), composer, 54), measurePolicy, composer, 48, 0);
            composer.endReplaceGroup();
        }
        composer.endReplaceGroup();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated(level = DeprecationLevel.WARNING, message = "Prefer version that takes a nullable AnimationSpec to animate changes.", replaceWith = @ReplaceWith(expression = "ConstraintLayout(constraintSet = constraintSet, modifier = modifier, optimizationLevel = optimizationLevel, animateChangesSpec = animationSpec, finishedAnimationListener = finishedAnimationListener) { content() }", imports = {}))
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ConstraintLayout(ConstraintSet constraintSet, Modifier modifier, int i9, boolean z9, AnimationSpec<Float> animationSpec, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10, int i11) {
        Animatable animatable;
        Modifier modifier2 = (i11 & 2) != 0 ? Modifier.INSTANCE : modifier;
        int i12 = (i11 & 4) != 0 ? 257 : i9;
        boolean z10 = (i11 & 8) != 0 ? false : z9;
        AnimationSpec<Float> animationSpecTween$default = (i11 & 16) != 0 ? AnimationSpecKt.tween$default(0, 0, null, 7, null) : animationSpec;
        Function0<Unit> function02 = (i11 & 32) != 0 ? null : function0;
        if (!z10) {
            animationSpecTween$default = null;
        }
        int i13 = i10 >> 3;
        int i14 = (i13 & 458752) | (i10 & 1022) | (i13 & 57344);
        if (animationSpecTween$default != null) {
            composer.startReplaceGroup(-2000135165);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(constraintSet, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(constraintSet, null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composer.updateRememberedValue(objRememberedValue3);
            }
            Animatable animatable2 = (Animatable) objRememberedValue3;
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = ChannelKt.Channel$default(-1, null, null, 6, null);
                composer.updateRememberedValue(objRememberedValue4);
            }
            Channel channel = (Channel) objRememberedValue4;
            Object objRememberedValue5 = composer.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotIntStateKt.mutableIntStateOf(1);
                composer.updateRememberedValue(objRememberedValue5);
            }
            MutableIntState mutableIntState = (MutableIntState) objRememberedValue5;
            boolean zChangedInstance = composer.changedInstance(channel) | (((6 ^ (i14 & 14)) > 4 && composer.changed(constraintSet)) || (i14 & 6) == 4);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new ConstraintLayoutKt$ConstraintLayout$3$1(channel, constraintSet);
                composer.updateRememberedValue(objRememberedValue6);
            }
            EffectsKt.SideEffect((Function0) objRememberedValue6, composer, 0);
            boolean zChangedInstance2 = composer.changedInstance(channel) | composer.changedInstance(animatable2) | composer.changedInstance(animationSpecTween$default) | ((((i14 & 57344) ^ 24576) > 16384 && composer.changed(function02)) || (i14 & 24576) == 16384);
            Object objRememberedValue7 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue7 == companion.getEmpty()) {
                animatable = animatable2;
                Object constraintLayoutKt$ConstraintLayout$4$1 = new ConstraintLayoutKt$ConstraintLayout$4$1(channel, mutableIntState, animatable, animationSpecTween$default, function02, mutableState, mutableState2, null);
                composer.updateRememberedValue(constraintLayoutKt$ConstraintLayout$4$1);
                objRememberedValue7 = constraintLayoutKt$ConstraintLayout$4$1;
            } else {
                animatable = animatable2;
            }
            EffectsKt.LaunchedEffect(channel, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composer, 0);
            ConstraintSet constraintSetM24322ConstraintLayout$lambda17 = m24322ConstraintLayout$lambda17(mutableState);
            ConstraintSet constraintSetM24324ConstraintLayout$lambda20 = m24324ConstraintLayout$lambda20(mutableState2);
            float fFloatValue = ((Number) animatable.getValue()).floatValue();
            int i15 = (i14 << 6) & 7168;
            int iM24350getNonebfy_xzQ = DebugFlags.INSTANCE.m24350getNonebfy_xzQ();
            InvalidationStrategy defaultInvalidationStrategy = InvalidationStrategy.INSTANCE.getDefaultInvalidationStrategy();
            Object objRememberedValue8 = composer.rememberedValue();
            if (objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                composer.updateRememberedValue(objRememberedValue8);
            }
            MutableState mutableState3 = (MutableState) objRememberedValue8;
            Object objRememberedValue9 = composer.rememberedValue();
            Object obj = objRememberedValue9;
            if (objRememberedValue9 == companion.getEmpty()) {
                Ref ref = new Ref();
                ref.setValue(CompositionSource.Unknown);
                composer.updateRememberedValue(ref);
                obj = ref;
            }
            Ref ref2 = (Ref) obj;
            MotionLayoutKt.MotionLayoutCore(constraintSetM24322ConstraintLayout$lambda17, constraintSetM24324ConstraintLayout$lambda20, null, fFloatValue, null, 257, DebugFlags.m24343getShowBoundsimpl(iM24350getNonebfy_xzQ), DebugFlags.m24345getShowPathsimpl(iM24350getNonebfy_xzQ), DebugFlags.m24344getShowKeyPositionsimpl(iM24350getNonebfy_xzQ), modifier2, mutableState3, ref2, defaultInvalidationStrategy, ComposableLambdaKt.rememberComposableLambda(284503157, true, new C3155x96520c53(mutableState3, defaultInvalidationStrategy, ref2, function2, i14), composer, 54), composer, 24576 | ((i15 << 18) & 1879048192), (Ref.$stable << 3) | 3078);
            composer.endReplaceGroup();
            return;
        }
        composer.startReplaceGroup(-1998673515);
        Object objRememberedValue10 = composer.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue10 == companion2.getEmpty()) {
            objRememberedValue10 = SnapshotLongStateKt.mutableLongStateOf(0L);
            composer.updateRememberedValue(objRememberedValue10);
        }
        MutableLongState mutableLongState = (MutableLongState) objRememberedValue10;
        Object objRememberedValue11 = composer.rememberedValue();
        if (objRememberedValue11 == companion2.getEmpty()) {
            objRememberedValue11 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
            composer.updateRememberedValue(objRememberedValue11);
        }
        MutableState mutableState4 = (MutableState) objRememberedValue11;
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object objRememberedValue12 = composer.rememberedValue();
        if (objRememberedValue12 == companion2.getEmpty()) {
            objRememberedValue12 = new Measurer2(density);
            composer.updateRememberedValue(objRememberedValue12);
        }
        Measurer2 measurer2 = (Measurer2) objRememberedValue12;
        boolean zChangedInstance3 = composer.changedInstance(measurer2) | ((((i14 & 14) ^ 6) > 4 && composer.changed(constraintSet)) || (i14 & 6) == 4) | ((((i14 & 896) ^ 384) > 256 && composer.changed(i12)) || (i14 & 384) == 256);
        Object objRememberedValue13 = composer.rememberedValue();
        if (zChangedInstance3 || objRememberedValue13 == companion2.getEmpty()) {
            objRememberedValue13 = new ConstraintLayoutKt$ConstraintLayout$measurePolicy$2$1(mutableState4, measurer2, constraintSet, i12);
            composer.updateRememberedValue(objRememberedValue13);
        }
        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue13;
        if (constraintSet instanceof EditableJSONLayout) {
            ((EditableJSONLayout) constraintSet).setUpdateFlag(mutableLongState);
        }
        measurer2.addLayoutInformationReceiver(constraintSet instanceof LayoutInformationReceiver ? (LayoutInformationReceiver) constraintSet : null);
        if (!Float.isNaN(measurer2.getForcedScaleFactor())) {
            composer.startReplaceGroup(-1997256040);
            Modifier modifierScale = ScaleKt.scale(modifier2, measurer2.getForcedScaleFactor());
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion3);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM20851constructorimpl = Updater.m20851constructorimpl(composer);
            Updater.m20858setimpl(composerM20851constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m20858setimpl(composerM20851constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM20851constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20851constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20851constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20851constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20858setimpl(composerM20851constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            boolean zChangedInstance4 = composer.changedInstance(measurer2);
            Object objRememberedValue14 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue14 == companion2.getEmpty()) {
                objRememberedValue14 = new ConstraintLayoutKt$ConstraintLayout$6$1$1(measurer2);
                composer.updateRememberedValue(objRememberedValue14);
            }
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierScale, false, (Function1) objRememberedValue14, 1, null), ComposableLambdaKt.rememberComposableLambda(1131308473, true, new ConstraintLayoutKt$ConstraintLayout$6$2(function2), composer, 54), measurePolicy, composer, 48, 0);
            composer.endNode();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1996827620);
            boolean zChangedInstance5 = composer.changedInstance(measurer2);
            Object objRememberedValue15 = composer.rememberedValue();
            if (zChangedInstance5 || objRememberedValue15 == companion2.getEmpty()) {
                objRememberedValue15 = new ConstraintLayoutKt$ConstraintLayout$7$1(measurer2);
                composer.updateRememberedValue(objRememberedValue15);
            }
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, (Function1) objRememberedValue15, 1, null), ComposableLambdaKt.rememberComposableLambda(-207512644, true, new C31578(mutableState4, function2), composer, 54), measurePolicy, composer, 48, 0);
            composer.endReplaceGroup();
        }
        composer.endReplaceGroup();
    }
}
