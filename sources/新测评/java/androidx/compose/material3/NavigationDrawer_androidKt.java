package androidx.compose.material3;

import androidx.activity.compose.PredictiveBackHandlerKt;
import androidx.compose.p013ui.platform.CompositionLocalsKt;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0002\b\u0010H\u0001¢\u0006\u0002\u0010\u0011\"\u0016\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0005\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0003\"\u0016\u0010\u0007\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\b\u0010\u0003¨\u0006\u0012"}, m13558d2 = {"PredictiveBackDrawerMaxScaleXDistanceGrow", "Landroidx/compose/ui/unit/Dp;", "getPredictiveBackDrawerMaxScaleXDistanceGrow", "()F", "F", "PredictiveBackDrawerMaxScaleXDistanceShrink", "getPredictiveBackDrawerMaxScaleXDistanceShrink", "PredictiveBackDrawerMaxScaleYDistance", "getPredictiveBackDrawerMaxScaleYDistance", "DrawerPredictiveBackHandler", "", "drawerState", "Landroidx/compose/material3/DrawerState;", "content", "Lkotlin/Function1;", "Landroidx/compose/material3/DrawerPredictiveBackState;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/material3/DrawerState;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "material3_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nNavigationDrawer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.android.kt\nandroidx/compose/material3/NavigationDrawer_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,102:1\n1223#2,6:103\n1223#2,3:114\n1226#2,3:120\n1223#2,6:126\n1223#2,6:132\n488#3:109\n487#3,4:110\n491#3,2:117\n495#3:123\n487#4:119\n77#5:124\n77#5:125\n148#6:138\n148#6:139\n148#6:140\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.android.kt\nandroidx/compose/material3/NavigationDrawer_androidKt\n*L\n46#1:103,6\n47#1:114,3\n47#1:120,3\n58#1:126,6\n90#1:132,6\n47#1:109\n47#1:110,4\n47#1:117,2\n47#1:123\n47#1:119\n48#1:124\n52#1:125\n99#1:138\n100#1:139\n101#1:140\n*E\n"})
/* loaded from: classes2.dex */
public final class NavigationDrawer_androidKt {
    private static final float PredictiveBackDrawerMaxScaleXDistanceGrow = C3127Dp.m23561constructorimpl(12);
    private static final float PredictiveBackDrawerMaxScaleXDistanceShrink = C3127Dp.m23561constructorimpl(24);
    private static final float PredictiveBackDrawerMaxScaleYDistance = C3127Dp.m23561constructorimpl(48);

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void DrawerPredictiveBackHandler(final DrawerState drawerState, final Function3<? super DrawerPredictiveBackState, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i10) {
        int i11;
        Object navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1;
        boolean z9;
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(1444817207);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(drawerState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        int i14 = i11;
        if ((i14 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1444817207, i14, -1, "androidx.compose.material3.DrawerPredictiveBackHandler (NavigationDrawer.android.kt:44)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new DrawerPredictiveBackState();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            DrawerPredictiveBackState drawerPredictiveBackState = (DrawerPredictiveBackState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue2 = compositionScopedCoroutineScopeCanceller;
            }
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
            boolean z10 = composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
            Ref.FloatRef floatRef = new Ref.FloatRef();
            Ref.FloatRef floatRef2 = new Ref.FloatRef();
            Ref.FloatRef floatRef3 = new Ref.FloatRef();
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            floatRef.element = density.mo17332toPx0680j_4(PredictiveBackDrawerMaxScaleXDistanceGrow);
            floatRef2.element = density.mo17332toPx0680j_4(PredictiveBackDrawerMaxScaleXDistanceShrink);
            floatRef3.element = density.mo17332toPx0680j_4(PredictiveBackDrawerMaxScaleYDistance);
            boolean zIsOpen = drawerState.isOpen();
            int i15 = i14 & 14;
            boolean zChanged = composerStartRestartGroup.changed(z10) | composerStartRestartGroup.changed(floatRef.element) | composerStartRestartGroup.changed(floatRef2.element) | composerStartRestartGroup.changed(floatRef3.element) | composerStartRestartGroup.changedInstance(coroutineScope) | (i15 == 4);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                z9 = zIsOpen;
                i12 = i14;
                i13 = 0;
                navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1 = new NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1(drawerPredictiveBackState, coroutineScope, drawerState, z10, floatRef, floatRef2, floatRef3, null);
                composerStartRestartGroup.updateRememberedValue(navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1);
            } else {
                z9 = zIsOpen;
                navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1 = objRememberedValue3;
                i12 = i14;
                i13 = 0;
            }
            PredictiveBackHandlerKt.PredictiveBackHandler(z9, (Function2) navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1, composerStartRestartGroup, i13, i13);
            Boolean boolValueOf = Boolean.valueOf(drawerState.isClosed());
            int i16 = i15 == 4 ? 1 : i13;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (i16 != 0 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new NavigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1(drawerState, drawerPredictiveBackState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, i13);
            function3.invoke(drawerPredictiveBackState, composerStartRestartGroup, Integer.valueOf((i12 & 112) | 6));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawer_androidKt.DrawerPredictiveBackHandler.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i17) {
                    NavigationDrawer_androidKt.DrawerPredictiveBackHandler(drawerState, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    public static final float getPredictiveBackDrawerMaxScaleXDistanceGrow() {
        return PredictiveBackDrawerMaxScaleXDistanceGrow;
    }

    public static final float getPredictiveBackDrawerMaxScaleXDistanceShrink() {
        return PredictiveBackDrawerMaxScaleXDistanceShrink;
    }

    public static final float getPredictiveBackDrawerMaxScaleYDistance() {
        return PredictiveBackDrawerMaxScaleYDistance;
    }
}
