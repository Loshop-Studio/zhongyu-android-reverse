package androidx.constraintlayout.compose;

import android.os.Build;
import android.view.View;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.p009ui.Modifier;
import androidx.compose.p009ui.draw.DrawModifierKt;
import androidx.compose.p009ui.draw.ScaleKt;
import androidx.compose.p009ui.graphics.drawscope.DrawScope;
import androidx.compose.p009ui.layout.LayoutKt;
import androidx.compose.p009ui.layout.Measurable;
import androidx.compose.p009ui.layout.MeasurePolicy;
import androidx.compose.p009ui.layout.MeasureResult;
import androidx.compose.p009ui.layout.MeasureScope;
import androidx.compose.p009ui.layout.Placeable;
import androidx.compose.p009ui.node.Ref;
import androidx.compose.p009ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p009ui.platform.CompositionLocalsKt;
import androidx.compose.p009ui.semantics.SemanticsModifierKt;
import androidx.compose.p009ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p009ui.unit.Density;
import androidx.compose.p009ui.unit.IntSize;
import androidx.compose.p009ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.constraintlayout.motion.widget.Key;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000¦\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u007f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u001e\b\u0004\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001au\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u001e\b\u0004\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u008d\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060 2\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\n\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\"2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u001e\b\u0004\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010#\u001a£\u0001\u0010$\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(2\u0006\u0010\u0007\u001a\u00020\b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00010,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u0010\u000f\u001a\u00020\u00102\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0001¢\u0006\u0002\u00100\u001a\u0084\u0001\u0010$\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00010,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u0010\u000f\u001a\u00020\u00102\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0001ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a¤\u0001\u0010$\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060 2\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\"2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00010,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u0010\u000f\u001a\u00020\u00102\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u0015H\u0001ø\u0001\u0000¢\u0006\u0004\b3\u00104\u001a\u001f\u00105\u001a\u00020\u00012\u0006\u00106\u001a\u0002072\b\u0010%\u001a\u0004\u0018\u00010&H\u0001¢\u0006\u0002\u00108\u001a\u0015\u00109\u001a\u0002072\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010:\u001a\\\u0010;\u001a\u00020<2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00010=2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u0010>\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020@2\u0006\u00106\u001a\u0002072\u0006\u0010A\u001a\u00020B2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0001\u001a4\u0010C\u001a\u00020\b*\u00020\b2\u0006\u0010A\u001a\u00020B2\u0006\u0010D\u001a\u00020\u00062\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(H\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006E²\u0006\n\u0010\u0002\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010\u0004\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010F\u001a\u00020(X\u008a\u008e\u0002"}, m7880d2 = {"MotionLayout", "", "start", "Landroidx/constraintlayout/compose/ConstraintSet;", "end", "progress", "", "modifier", "Landroidx/compose/ui/Modifier;", "transition", "Landroidx/constraintlayout/compose/Transition;", "debugFlags", "Landroidx/constraintlayout/compose/DebugFlags;", "optimizationLevel", "", "invalidationStrategy", "Landroidx/constraintlayout/compose/InvalidationStrategy;", "content", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/MotionLayoutScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "MotionLayout-T3LJ6Qw", "(Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;FLandroidx/compose/ui/Modifier;Landroidx/constraintlayout/compose/Transition;IILandroidx/constraintlayout/compose/InvalidationStrategy;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "motionScene", "Landroidx/constraintlayout/compose/MotionScene;", "transitionName", "", "MotionLayout-6oYECBM", "(Landroidx/constraintlayout/compose/MotionScene;FLandroidx/compose/ui/Modifier;Ljava/lang/String;IILandroidx/constraintlayout/compose/InvalidationStrategy;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "constraintSetName", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "finishedAnimationListener", "Lkotlin/Function0;", "(Landroidx/constraintlayout/compose/MotionScene;Ljava/lang/String;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;IILandroidx/constraintlayout/compose/InvalidationStrategy;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "MotionLayoutCore", "informationReceiver", "Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "showBounds", "", "showPaths", "showKeyPositions", "contentTracker", "Landroidx/compose/runtime/MutableState;", "compositionSource", "Landroidx/compose/ui/node/Ref;", "Landroidx/constraintlayout/compose/CompositionSource;", "(Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/Transition;FLandroidx/constraintlayout/compose/LayoutInformationReceiver;IZZZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/node/Ref;Landroidx/constraintlayout/compose/InvalidationStrategy;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "MotionLayoutCore-SehEMGo", "(Landroidx/constraintlayout/compose/MotionScene;FLjava/lang/String;IILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/node/Ref;Landroidx/constraintlayout/compose/InvalidationStrategy;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "MotionLayoutCore-TEds9UA", "(Landroidx/constraintlayout/compose/MotionScene;Ljava/lang/String;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/MutableState;Landroidx/compose/ui/node/Ref;Landroidx/constraintlayout/compose/InvalidationStrategy;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "UpdateWithForcedIfNoUserChange", Key.MOTIONPROGRESS, "Landroidx/compose/runtime/MutableFloatState;", "(Landroidx/compose/runtime/MutableFloatState;Landroidx/constraintlayout/compose/LayoutInformationReceiver;Landroidx/compose/runtime/Composer;I)V", "createAndUpdateMotionProgress", "(FLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/MutableFloatState;", "motionLayoutMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/runtime/State;", "constraintSetStart", "constraintSetEnd", "Landroidx/constraintlayout/compose/TransitionImpl;", "measurer", "Landroidx/constraintlayout/compose/MotionMeasurer;", "motionDebug", "scaleFactor", "constraintlayout-compose_release", "animateToEnd"}, m7881k = 2, m7882mv = {1, 8, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nMotionLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionLayout.kt\nandroidx/constraintlayout/compose/MotionLayoutKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1651:1\n1225#2,6:1652\n1225#2,3:1658\n1228#2,3:1662\n1225#2,6:1665\n1225#2,6:1671\n1225#2,6:1677\n1225#2,6:1683\n1225#2,6:1689\n1225#2,6:1695\n1225#2,6:1701\n1225#2,6:1707\n1225#2,6:1713\n1225#2,6:1719\n1225#2,6:1725\n1225#2,6:1731\n1225#2,6:1737\n1225#2,6:1743\n1225#2,6:1749\n1225#2,6:1755\n1225#2,6:1761\n1225#2,6:1767\n1225#2,6:1773\n1225#2,6:1779\n1225#2,6:1787\n1225#2,6:1793\n1225#2,6:1799\n1225#2,6:1805\n1225#2,6:1812\n1225#2,6:1818\n1225#2,6:1824\n1225#2,6:1830\n1#3:1661\n77#4:1785\n77#4:1786\n77#4:1811\n81#5:1836\n107#5,2:1837\n81#5:1839\n107#5,2:1840\n81#5:1842\n107#5,2:1843\n*S KotlinDebug\n*F\n+ 1 MotionLayout.kt\nandroidx/constraintlayout/compose/MotionLayoutKt\n*L\n146#1:1652,6\n147#1:1658,3\n147#1:1662,3\n256#1:1665,6\n257#1:1671,6\n382#1:1677,6\n383#1:1683,6\n435#1:1689,6\n438#1:1695,6\n443#1:1701,6\n448#1:1707,6\n457#1:1713,6\n458#1:1719,6\n461#1:1725,6\n465#1:1731,6\n467#1:1737,6\n469#1:1743,6\n472#1:1749,6\n474#1:1755,6\n526#1:1761,6\n529#1:1767,6\n534#1:1773,6\n582#1:1779,6\n593#1:1787,6\n594#1:1793,6\n596#1:1799,6\n609#1:1805,6\n676#1:1812,6\n1028#1:1818,6\n1048#1:1824,6\n1049#1:1830,6\n591#1:1785\n592#1:1786\n655#1:1811\n457#1:1836\n457#1:1837,2\n458#1:1839\n458#1:1840,2\n467#1:1842\n467#1:1843,2\n*E\n"})
/* loaded from: classes2.dex */
public final class MotionLayoutKt {
    @Composable
    @ExperimentalMotionApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
    /* renamed from: MotionLayout-6oYECBM, reason: not valid java name */
    public static final void m16899MotionLayout6oYECBM(MotionScene motionScene, float f6, Modifier modifier, String str, int i6, int i7, InvalidationStrategy invalidationStrategy, final Function3<? super MotionLayoutScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i8, int i9) {
        if ((i9 & 4) != 0) {
            modifier = Modifier.INSTANCE;
        }
        Modifier modifier2 = modifier;
        if ((i9 & 8) != 0) {
            str = "default";
        }
        String str2 = str;
        int iM16840getNonebfy_xzQ = (i9 & 16) != 0 ? DebugFlags.INSTANCE.m16840getNonebfy_xzQ() : i6;
        int i10 = (i9 & 32) != 0 ? 257 : i7;
        final InvalidationStrategy defaultInvalidationStrategy = (i9 & 64) != 0 ? InvalidationStrategy.INSTANCE.getDefaultInvalidationStrategy() : invalidationStrategy;
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
            composer.updateRememberedValue(objRememberedValue);
        }
        final MutableState mutableState = (MutableState) objRememberedValue;
        Object objRememberedValue2 = composer.rememberedValue();
        Object obj = objRememberedValue2;
        if (objRememberedValue2 == companion.getEmpty()) {
            Ref ref = new Ref();
            ref.setValue(CompositionSource.Unknown);
            composer.updateRememberedValue(ref);
            obj = ref;
        }
        final Ref ref2 = (Ref) obj;
        m16902MotionLayoutCoreSehEMGo(motionScene, f6, str2, i10, iM16840getNonebfy_xzQ, modifier2, mutableState, ref2, defaultInvalidationStrategy, ComposableLambdaKt.rememberComposableLambda(-23317463, true, new Function3<MotionLayoutScope, Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayout$contentDelegate$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(MotionLayoutScope motionLayoutScope, Composer composer2, Integer num) {
                invoke(motionLayoutScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(MotionLayoutScope motionLayoutScope, Composer composer2, int i11) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-23317463, i11, -1, "androidx.constraintlayout.compose.MotionLayout.<anonymous> (MotionLayout.kt:264)");
                }
                mutableState.setValue(Unit.INSTANCE);
                if (defaultInvalidationStrategy.getOnObservedStateChange() == null && ref2.getValue() == CompositionSource.Unknown) {
                    ref2.setValue(CompositionSource.Content);
                }
                function3.invoke(motionLayoutScope, composer2, Integer.valueOf(i11 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, (i8 & 14) | 806879232 | (i8 & 112) | ((i8 >> 3) & 896) | ((i8 >> 6) & 7168) | (i8 & 57344) | ((i8 << 9) & 458752) | (Ref.$stable << 21) | (234881024 & (i8 << 6)));
    }

    @Composable
    @ExperimentalMotionApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
    /* renamed from: MotionLayout-T3LJ6Qw, reason: not valid java name */
    public static final void m16900MotionLayoutT3LJ6Qw(ConstraintSet constraintSet, ConstraintSet constraintSet2, float f6, Modifier modifier, Transition transition, int i6, int i7, InvalidationStrategy invalidationStrategy, final Function3<? super MotionLayoutScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i8, int i9) {
        Modifier modifier2 = (i9 & 8) != 0 ? Modifier.INSTANCE : modifier;
        Transition transition2 = (i9 & 16) != 0 ? null : transition;
        int iM16840getNonebfy_xzQ = (i9 & 32) != 0 ? DebugFlags.INSTANCE.m16840getNonebfy_xzQ() : i6;
        int i10 = (i9 & 64) != 0 ? 257 : i7;
        final InvalidationStrategy defaultInvalidationStrategy = (i9 & 128) != 0 ? InvalidationStrategy.INSTANCE.getDefaultInvalidationStrategy() : invalidationStrategy;
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
            composer.updateRememberedValue(objRememberedValue);
        }
        final MutableState mutableState = (MutableState) objRememberedValue;
        Object objRememberedValue2 = composer.rememberedValue();
        Object obj = objRememberedValue2;
        if (objRememberedValue2 == companion.getEmpty()) {
            Ref ref = new Ref();
            ref.setValue(CompositionSource.Unknown);
            composer.updateRememberedValue(ref);
            obj = ref;
        }
        final Ref ref2 = (Ref) obj;
        MotionLayoutCore(constraintSet, constraintSet2, transition2, f6, null, i10, DebugFlags.m16833getShowBoundsimpl(iM16840getNonebfy_xzQ), DebugFlags.m16835getShowPathsimpl(iM16840getNonebfy_xzQ), DebugFlags.m16834getShowKeyPositionsimpl(iM16840getNonebfy_xzQ), modifier2, mutableState, ref2, defaultInvalidationStrategy, ComposableLambdaKt.rememberComposableLambda(284503157, true, new Function3<MotionLayoutScope, Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayout$contentDelegate$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(MotionLayoutScope motionLayoutScope, Composer composer2, Integer num) {
                invoke(motionLayoutScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(MotionLayoutScope motionLayoutScope, Composer composer2, int i11) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(284503157, i11, -1, "androidx.constraintlayout.compose.MotionLayout.<anonymous> (MotionLayout.kt:154)");
                }
                mutableState.setValue(Unit.INSTANCE);
                if (defaultInvalidationStrategy.getOnObservedStateChange() == null && ref2.getValue() == CompositionSource.Unknown) {
                    ref2.setValue(CompositionSource.Content);
                }
                function3.invoke(motionLayoutScope, composer2, Integer.valueOf(i11 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, (i8 & 14) | 24576 | (i8 & 112) | ((i8 >> 6) & 896) | ((i8 << 3) & 7168) | ((i8 >> 3) & 458752) | ((i8 << 18) & 1879048192), (Ref.$stable << 3) | 3078 | ((i8 >> 15) & 896));
    }

    @ExperimentalMotionApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @Composable
    @PublishedApi
    public static final void MotionLayoutCore(final ConstraintSet constraintSet, final ConstraintSet constraintSet2, final Transition transition, final float f6, final LayoutInformationReceiver layoutInformationReceiver, final int i6, final boolean z6, final boolean z7, final boolean z8, final Modifier modifier, final MutableState<Unit> mutableState, final Ref<CompositionSource> ref, final InvalidationStrategy invalidationStrategy, final Function3<? super MotionLayoutScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i7, final int i8) {
        int i9;
        ConstraintSet constraintSet3;
        int i10;
        int i11;
        TransitionImpl transitionImpl;
        Composer composer2;
        boolean z9;
        boolean z10;
        boolean z11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-657259923);
        if ((i7 & 6) == 0) {
            i9 = (composerStartRestartGroup.changed(constraintSet) ? 4 : 2) | i7;
        } else {
            i9 = i7;
        }
        if ((i7 & 48) == 0) {
            constraintSet3 = constraintSet2;
            i9 |= composerStartRestartGroup.changed(constraintSet3) ? 32 : 16;
        } else {
            constraintSet3 = constraintSet2;
        }
        if ((i7 & 384) == 0) {
            i9 |= composerStartRestartGroup.changed(transition) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i9 |= composerStartRestartGroup.changed(f6) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i9 |= (32768 & i7) == 0 ? composerStartRestartGroup.changed(layoutInformationReceiver) : composerStartRestartGroup.changedInstance(layoutInformationReceiver) ? 16384 : 8192;
        }
        if ((196608 & i7) == 0) {
            i10 = i6;
            i9 |= composerStartRestartGroup.changed(i10) ? 131072 : 65536;
        } else {
            i10 = i6;
        }
        if ((i7 & 1572864) == 0) {
            i9 |= composerStartRestartGroup.changed(z6) ? 1048576 : 524288;
        }
        if ((i7 & 12582912) == 0) {
            i9 |= composerStartRestartGroup.changed(z7) ? 8388608 : 4194304;
        }
        if ((i7 & 100663296) == 0) {
            i9 |= composerStartRestartGroup.changed(z8) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i7 & 805306368) == 0) {
            i9 |= composerStartRestartGroup.changed(modifier) ? 536870912 : 268435456;
        }
        if ((i8 & 6) == 0) {
            i11 = i8 | (composerStartRestartGroup.changed(mutableState) ? 4 : 2);
        } else {
            i11 = i8;
        }
        if ((i8 & 48) == 0) {
            i11 |= (i8 & 64) == 0 ? composerStartRestartGroup.changed(ref) : composerStartRestartGroup.changedInstance(ref) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(invalidationStrategy) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        int i12 = i11;
        if ((i9 & 306783379) == 306783378 && (i12 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-657259923, i9, i12, "androidx.constraintlayout.compose.MotionLayoutCore (MotionLayout.kt:577)");
            }
            int i13 = i9 >> 9;
            MutableFloatState mutableFloatStateCreateAndUpdateMotionProgress = createAndUpdateMotionProgress(f6, composerStartRestartGroup, i13 & 14);
            TransitionImpl eMPTY$constraintlayout_compose_release = transition instanceof TransitionImpl ? (TransitionImpl) transition : null;
            if (eMPTY$constraintlayout_compose_release == null) {
                eMPTY$constraintlayout_compose_release = TransitionImpl.INSTANCE.getEMPTY$constraintlayout_compose_release();
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotLongStateKt.mutableLongStateOf(0L);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableLongState mutableLongState = (MutableLongState) objRememberedValue;
            mutableLongState.getLongValue();
            if (layoutInformationReceiver != null) {
                layoutInformationReceiver.setUpdateFlag(mutableLongState);
            }
            UpdateWithForcedIfNoUserChange(mutableFloatStateCreateAndUpdateMotionProgress, layoutInformationReceiver, composerStartRestartGroup, i13 & 112);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new MotionMeasurer(density);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MotionMeasurer motionMeasurer = (MotionMeasurer) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new MotionLayoutScope(motionMeasurer, mutableFloatStateCreateAndUpdateMotionProgress);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final MotionLayoutScope motionLayoutScope = (MotionLayoutScope) objRememberedValue3;
            boolean z12 = ((i9 & 14) == 4) | ((i9 & 112) == 32) | ((i9 & 896) == 256);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z12 || objRememberedValue4 == companion.getEmpty()) {
                transitionImpl = eMPTY$constraintlayout_compose_release;
                motionMeasurer.initWith(constraintSet, constraintSet3, layoutDirection, transitionImpl, mutableFloatStateCreateAndUpdateMotionProgress.getFloatValue());
                objRememberedValue4 = Boolean.TRUE;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                transitionImpl = eMPTY$constraintlayout_compose_release;
            }
            ((Boolean) objRememberedValue4).getClass();
            composerStartRestartGroup.startReplaceGroup(-487863565);
            if (invalidationStrategy.getOnObservedStateChange() != null) {
                Snapshot.Companion companion2 = Snapshot.INSTANCE;
                boolean z13 = ((i12 & 14) == 4) | ((i12 & 112) == 32 || ((i12 & 64) != 0 && composerStartRestartGroup.changedInstance(ref)));
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (z13 || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new Function1<Object, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$8$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                            invoke2(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Object obj) {
                            mutableState.setValue(Unit.INSTANCE);
                            if (ref.getValue() == CompositionSource.Unknown) {
                                ref.setValue(CompositionSource.Content);
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                Snapshot.Companion.observe$default(companion2, (Function1) objRememberedValue5, null, invalidationStrategy.getOnObservedStateChange(), 2, null);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            MeasurePolicy measurePolicyMotionLayoutMeasurePolicy = motionLayoutMeasurePolicy(mutableState, ref, constraintSet, constraintSet2, transitionImpl, mutableFloatStateCreateAndUpdateMotionProgress, motionMeasurer, i10, invalidationStrategy);
            motionMeasurer.addLayoutInformationReceiver(layoutInformationReceiver);
            MotionLayoutDebugFlags forcedDrawDebug = layoutInformationReceiver != null ? layoutInformationReceiver.getForcedDrawDebug() : null;
            float forcedScaleFactor = motionMeasurer.getForcedScaleFactor();
            if (forcedDrawDebug == null || forcedDrawDebug == MotionLayoutDebugFlags.UNKNOWN) {
                z9 = z6;
                z10 = z7;
                z11 = z8;
            } else {
                z9 = forcedDrawDebug == MotionLayoutDebugFlags.SHOW_ALL;
                z10 = z9;
                z11 = z10;
            }
            composer2.startReplaceGroup(-487805395);
            boolean z14 = Build.VERSION.SDK_INT >= 30 && Api30Impl.isShowingLayoutBounds((View) composer2.consume(AndroidCompositionLocals_androidKt.getLocalView()));
            composer2.endReplaceGroup();
            Modifier modifierMotionPointerInput = MotionDragHandlerKt.motionPointerInput(motionDebug(modifier, motionMeasurer, forcedScaleFactor, z14 ? true : z9, z10, z11), transition == null ? TransitionImpl.INSTANCE.getEMPTY$constraintlayout_compose_release() : transition, mutableFloatStateCreateAndUpdateMotionProgress, motionMeasurer);
            boolean zChangedInstance = composer2.changedInstance(motionMeasurer);
            Object objRememberedValue6 = composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$9$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        ToolingUtilsKt.setDesignInfoProvider(semanticsPropertyReceiver, motionMeasurer);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue6);
            }
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierMotionPointerInput, false, (Function1) objRememberedValue6, 1, null), ComposableLambdaKt.rememberComposableLambda(1008059664, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore.10
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer3, int i14) {
                    if ((i14 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1008059664, i14, -1, "androidx.constraintlayout.compose.MotionLayoutCore.<anonymous> (MotionLayout.kt:677)");
                    }
                    function3.invoke(motionLayoutScope, composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), measurePolicyMotionLayoutMeasurePolicy, composer2, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore.11
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i14) {
                    MotionLayoutKt.MotionLayoutCore(constraintSet, constraintSet2, transition, f6, layoutInformationReceiver, i6, z6, z7, z8, modifier, mutableState, ref, invalidationStrategy, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i7 | 1), RecomposeScopeImplKt.updateChangedFlags(i8));
                }
            });
        }
    }

    @ExperimentalMotionApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @Composable
    @PublishedApi
    /* renamed from: MotionLayoutCore-SehEMGo, reason: not valid java name */
    public static final void m16902MotionLayoutCoreSehEMGo(final MotionScene motionScene, final float f6, final String str, final int i6, final int i7, final Modifier modifier, final MutableState<Unit> mutableState, final Ref<CompositionSource> ref, final InvalidationStrategy invalidationStrategy, final Function3<? super MotionLayoutScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i8) {
        int i9;
        float f7;
        int i10;
        int i11;
        Function3<? super MotionLayoutScope, ? super Composer, ? super Integer, Unit> function32;
        String startConstraintSetId;
        String endConstraintSetId;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1160212844);
        if ((i8 & 6) == 0) {
            i9 = (composerStartRestartGroup.changed(motionScene) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 48) == 0) {
            f7 = f6;
            i9 |= composerStartRestartGroup.changed(f7) ? 32 : 16;
        } else {
            f7 = f6;
        }
        if ((i8 & 384) == 0) {
            i9 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            i10 = i6;
            i9 |= composerStartRestartGroup.changed(i10) ? 2048 : 1024;
        } else {
            i10 = i6;
        }
        if ((i8 & 24576) == 0) {
            i11 = i7;
            i9 |= composerStartRestartGroup.changed(i11) ? 16384 : 8192;
        } else {
            i11 = i7;
        }
        if ((196608 & i8) == 0) {
            i9 |= composerStartRestartGroup.changed(modifier) ? 131072 : 65536;
        }
        if ((1572864 & i8) == 0) {
            i9 |= composerStartRestartGroup.changed(mutableState) ? 1048576 : 524288;
        }
        if ((12582912 & i8) == 0) {
            i9 |= (16777216 & i8) == 0 ? composerStartRestartGroup.changed(ref) : composerStartRestartGroup.changedInstance(ref) ? 8388608 : 4194304;
        }
        if ((100663296 & i8) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(invalidationStrategy) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((805306368 & i8) == 0) {
            function32 = function3;
            i9 |= composerStartRestartGroup.changedInstance(function32) ? 536870912 : 268435456;
        } else {
            function32 = function3;
        }
        if ((i9 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1160212844, i9, -1, "androidx.constraintlayout.compose.MotionLayoutCore (MotionLayout.kt:523)");
            }
            int i12 = i9 & 14;
            boolean z6 = ((i9 & 896) == 256) | (i12 == 4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z6 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = motionScene.getTransitionInstance(str);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Transition transition = (Transition) objRememberedValue;
            boolean zChanged = (i12 == 4) | composerStartRestartGroup.changed(transition);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                if (transition == null || (startConstraintSetId = transition.getStartConstraintSetId()) == null) {
                    startConstraintSetId = "start";
                }
                objRememberedValue2 = motionScene.getConstraintSetInstance(startConstraintSetId);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ConstraintSet constraintSet = (ConstraintSet) objRememberedValue2;
            boolean zChanged2 = (i12 == 4) | composerStartRestartGroup.changed(transition);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                if (transition == null || (endConstraintSetId = transition.getEndConstraintSetId()) == null) {
                    endConstraintSetId = "end";
                }
                objRememberedValue3 = motionScene.getConstraintSetInstance(endConstraintSetId);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            ConstraintSet constraintSet2 = (ConstraintSet) objRememberedValue3;
            if (constraintSet == null || constraintSet2 == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore.5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i13) {
                            MotionLayoutKt.m16902MotionLayoutCoreSehEMGo(motionScene, f6, str, i6, i7, modifier, mutableState, ref, invalidationStrategy, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i8 | 1));
                        }
                    });
                    return;
                }
                return;
            }
            composer2 = composerStartRestartGroup;
            int i13 = ((i9 << 6) & 465920) | ((i9 << 12) & 1879048192);
            int i14 = i9 >> 18;
            MotionLayoutCore(constraintSet, constraintSet2, transition, f7, motionScene instanceof LayoutInformationReceiver ? (LayoutInformationReceiver) motionScene : null, i10, DebugFlags.m16833getShowBoundsimpl(i11), DebugFlags.m16835getShowPathsimpl(i7), DebugFlags.m16834getShowKeyPositionsimpl(i7), modifier, mutableState, ref, invalidationStrategy, function32, composer2, i13, (i14 & 14) | (Ref.$stable << 3) | (i14 & 112) | (i14 & 896) | (i14 & 7168));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore.6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i15) {
                    MotionLayoutKt.m16902MotionLayoutCoreSehEMGo(motionScene, f6, str, i6, i7, modifier, mutableState, ref, invalidationStrategy, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i8 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:276:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f4  */
    @androidx.constraintlayout.compose.ExperimentalMotionApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    @kotlin.PublishedApi
    /* renamed from: MotionLayoutCore-TEds9UA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m16903MotionLayoutCoreTEds9UA(final androidx.constraintlayout.compose.MotionScene r25, final java.lang.String r26, final androidx.compose.animation.core.AnimationSpec<java.lang.Float> r27, androidx.compose.p009ui.Modifier r28, kotlin.jvm.functions.Function0<kotlin.Unit> r29, int r30, int r31, final androidx.compose.runtime.MutableState<kotlin.Unit> r32, final androidx.compose.p009ui.node.Ref<androidx.constraintlayout.compose.CompositionSource> r33, final androidx.constraintlayout.compose.InvalidationStrategy r34, final kotlin.jvm.functions.Function3<? super androidx.constraintlayout.compose.MotionLayoutScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r35, androidx.compose.runtime.Composer r36, final int r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 1131
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionLayoutKt.m16903MotionLayoutCoreTEds9UA(androidx.constraintlayout.compose.MotionScene, java.lang.String, androidx.compose.animation.core.AnimationSpec, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, int, int, androidx.compose.runtime.MutableState, androidx.compose.ui.node.Ref, androidx.constraintlayout.compose.InvalidationStrategy, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConstraintSet MotionLayoutCore_TEds9UA$lambda$14(MutableState<ConstraintSet> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConstraintSet MotionLayoutCore_TEds9UA$lambda$17(MutableState<ConstraintSet> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MotionLayoutCore_TEds9UA$lambda$23(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MotionLayoutCore_TEds9UA$lambda$24(MutableState<Boolean> mutableState, boolean z6) {
        mutableState.setValue(Boolean.valueOf(z6));
    }

    @Composable
    public static final void UpdateWithForcedIfNoUserChange(final MutableFloatState mutableFloatState, final LayoutInformationReceiver layoutInformationReceiver, Composer composer, final int i6) {
        int i7;
        Composer composerStartRestartGroup = composer.startRestartGroup(1501096015);
        if ((i6 & 6) == 0) {
            i7 = (composerStartRestartGroup.changed(mutableFloatState) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= (i6 & 64) == 0 ? composerStartRestartGroup.changed(layoutInformationReceiver) : composerStartRestartGroup.changedInstance(layoutInformationReceiver) ? 32 : 16;
        }
        if ((i7 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1501096015, i7, -1, "androidx.constraintlayout.compose.UpdateWithForcedIfNoUserChange (MotionLayout.kt:1019)");
            }
            if (layoutInformationReceiver == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt.UpdateWithForcedIfNoUserChange.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i8) {
                            MotionLayoutKt.UpdateWithForcedIfNoUserChange(mutableFloatState, layoutInformationReceiver, composer2, RecomposeScopeImplKt.updateChangedFlags(i6 | 1));
                        }
                    });
                    return;
                }
                return;
            }
            float floatValue = mutableFloatState.getFloatValue();
            float forcedProgress = layoutInformationReceiver.getForcedProgress();
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Object obj = objRememberedValue;
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Ref ref = new Ref();
                ref.setValue(Float.valueOf(floatValue));
                composerStartRestartGroup.updateRememberedValue(ref);
                obj = ref;
            }
            Ref ref2 = (Ref) obj;
            if (Float.isNaN(forcedProgress) || !Intrinsics.areEqual((Float) ref2.getValue(), floatValue)) {
                layoutInformationReceiver.resetForcedProgress();
            } else {
                mutableFloatState.setFloatValue(forcedProgress);
            }
            ref2.setValue(Float.valueOf(floatValue));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt.UpdateWithForcedIfNoUserChange.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i8) {
                    MotionLayoutKt.UpdateWithForcedIfNoUserChange(mutableFloatState, layoutInformationReceiver, composer2, RecomposeScopeImplKt.updateChangedFlags(i6 | 1));
                }
            });
        }
    }

    @Composable
    public static final MutableFloatState createAndUpdateMotionProgress(float f6, Composer composer, int i6) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1721363510, i6, -1, "androidx.constraintlayout.compose.createAndUpdateMotionProgress (MotionLayout.kt:1046)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(f6);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableFloatState mutableFloatState = (MutableFloatState) objRememberedValue;
        Object objRememberedValue2 = composer.rememberedValue();
        Object obj = objRememberedValue2;
        if (objRememberedValue2 == companion.getEmpty()) {
            Ref.FloatRef floatRef = new Ref.FloatRef();
            floatRef.element = f6;
            composer.updateRememberedValue(floatRef);
            obj = floatRef;
        }
        Ref.FloatRef floatRef2 = (Ref.FloatRef) obj;
        if (floatRef2.element != f6) {
            floatRef2.element = f6;
            mutableFloatState.setFloatValue(f6);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableFloatState;
    }

    @ExperimentalMotionApi
    public static final Modifier motionDebug(Modifier modifier, final MotionMeasurer motionMeasurer, float f6, final boolean z6, final boolean z7, final boolean z8) {
        if (!Float.isNaN(f6)) {
            modifier = ScaleKt.scale(modifier, f6);
        }
        return (z6 || z8 || z7) ? DrawModifierKt.drawBehind(modifier, new Function1<DrawScope, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt.motionDebug.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope drawScope) {
                motionMeasurer.drawDebug(drawScope, z6, z7, z8);
            }
        }) : modifier;
    }

    @ExperimentalMotionApi
    public static final MeasurePolicy motionLayoutMeasurePolicy(final androidx.compose.runtime.State<Unit> state, final androidx.compose.p009ui.node.Ref<CompositionSource> ref, final ConstraintSet constraintSet, final ConstraintSet constraintSet2, final TransitionImpl transitionImpl, final MutableFloatState mutableFloatState, final MotionMeasurer motionMeasurer, final int i6, final InvalidationStrategy invalidationStrategy) {
        return new MeasurePolicy() { // from class: androidx.constraintlayout.compose.MotionLayoutKt.motionLayoutMeasurePolicy.1
            @Override // androidx.compose.p009ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo9911measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j6) {
                final LinkedHashMap linkedHashMap = new LinkedHashMap();
                state.getValue();
                MotionMeasurer motionMeasurer2 = motionMeasurer;
                LayoutDirection layoutDirection = measureScope.getLayoutDirection();
                ConstraintSet constraintSet3 = constraintSet;
                ConstraintSet constraintSet4 = constraintSet2;
                TransitionImpl transitionImpl2 = transitionImpl;
                int i7 = i6;
                float floatValue = mutableFloatState.getFloatValue();
                CompositionSource value = ref.getValue();
                if (value == null) {
                    value = CompositionSource.Unknown;
                }
                long jM16926performInterpolationMeasureLzAeyeM = motionMeasurer2.m16926performInterpolationMeasureLzAeyeM(j6, layoutDirection, constraintSet3, constraintSet4, transitionImpl2, list, linkedHashMap, i7, floatValue, value, invalidationStrategy.getShouldInvalidate());
                ref.setValue(CompositionSource.Unknown);
                int iM16655getWidthimpl = IntSize.m16655getWidthimpl(jM16926performInterpolationMeasureLzAeyeM);
                int iM16654getHeightimpl = IntSize.m16654getHeightimpl(jM16926performInterpolationMeasureLzAeyeM);
                final MotionMeasurer motionMeasurer3 = motionMeasurer;
                return MeasureScope.layout$default(measureScope, iM16655getWidthimpl, iM16654getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt.motionLayoutMeasurePolicy.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Placeable.PlacementScope placementScope) {
                        motionMeasurer3.performLayout(placementScope, list, linkedHashMap);
                    }
                }, 4, null);
            }
        };
    }

    @Composable
    @ExperimentalMotionApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
    /* renamed from: MotionLayout-T3LJ6Qw, reason: not valid java name */
    public static final void m16901MotionLayoutT3LJ6Qw(MotionScene motionScene, String str, AnimationSpec<Float> animationSpec, Modifier modifier, Function0<Unit> function0, int i6, int i7, InvalidationStrategy invalidationStrategy, final Function3<? super MotionLayoutScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i8, int i9) {
        Modifier modifier2 = (i9 & 8) != 0 ? Modifier.INSTANCE : modifier;
        Function0<Unit> function02 = (i9 & 16) != 0 ? null : function0;
        int iM16840getNonebfy_xzQ = (i9 & 32) != 0 ? DebugFlags.INSTANCE.m16840getNonebfy_xzQ() : i6;
        int i10 = (i9 & 64) != 0 ? 257 : i7;
        final InvalidationStrategy defaultInvalidationStrategy = (i9 & 128) != 0 ? InvalidationStrategy.INSTANCE.getDefaultInvalidationStrategy() : invalidationStrategy;
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
            composer.updateRememberedValue(objRememberedValue);
        }
        final MutableState mutableState = (MutableState) objRememberedValue;
        Object objRememberedValue2 = composer.rememberedValue();
        Object obj = objRememberedValue2;
        if (objRememberedValue2 == companion.getEmpty()) {
            androidx.compose.p009ui.node.Ref ref = new androidx.compose.p009ui.node.Ref();
            ref.setValue(CompositionSource.Unknown);
            composer.updateRememberedValue(ref);
            obj = ref;
        }
        final androidx.compose.p009ui.node.Ref ref2 = (androidx.compose.p009ui.node.Ref) obj;
        m16903MotionLayoutCoreTEds9UA(motionScene, str, animationSpec, modifier2, function02, iM16840getNonebfy_xzQ, i10, mutableState, ref2, defaultInvalidationStrategy, ComposableLambdaKt.rememberComposableLambda(1064705982, true, new Function3<MotionLayoutScope, Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayout$contentDelegate$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(MotionLayoutScope motionLayoutScope, Composer composer2, Integer num) {
                invoke(motionLayoutScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(MotionLayoutScope motionLayoutScope, Composer composer2, int i11) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1064705982, i11, -1, "androidx.constraintlayout.compose.MotionLayout.<anonymous> (MotionLayout.kt:390)");
                }
                mutableState.setValue(Unit.INSTANCE);
                if (defaultInvalidationStrategy.getOnObservedStateChange() == null && ref2.getValue() == CompositionSource.Unknown) {
                    ref2.setValue(CompositionSource.Content);
                }
                function3.invoke(motionLayoutScope, composer2, Integer.valueOf(i11 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, (i8 & 14) | 12582912 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (57344 & i8) | (458752 & i8) | (3670016 & i8) | (androidx.compose.p009ui.node.Ref.$stable << 24) | ((i8 << 6) & 1879048192), 6, 0);
    }
}
