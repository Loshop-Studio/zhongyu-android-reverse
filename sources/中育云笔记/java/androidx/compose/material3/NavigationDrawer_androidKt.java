package androidx.compose.material3;

import androidx.activity.compose.PredictiveBackHandlerKt;
import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref$FloatRef;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import sd.InterfaceC11122i0;

/* loaded from: classes2.dex */
public final class NavigationDrawer_androidKt {
    private static final float PredictiveBackDrawerMaxScaleXDistanceGrow = C3186Dp.m33501constructorimpl(12);
    private static final float PredictiveBackDrawerMaxScaleXDistanceShrink = C3186Dp.m33501constructorimpl(24);
    private static final float PredictiveBackDrawerMaxScaleYDistance = C3186Dp.m33501constructorimpl(48);

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void DrawerPredictiveBackHandler(final DrawerState drawerState, final InterfaceC9545q interfaceC9545q, Composer composer, final int i10) {
        int i11;
        Object navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1;
        boolean z10;
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(1444817207);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(drawerState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(interfaceC9545q) ? 32 : 16;
        }
        int i14 = i11;
        if ((i14 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1444817207, i14, -1, "androidx.compose.material3.DrawerPredictiveBackHandler (NavigationDrawer.android.kt:44)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new DrawerPredictiveBackState();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            DrawerPredictiveBackState drawerPredictiveBackState = (DrawerPredictiveBackState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f23351c, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue2 = compositionScopedCoroutineScopeCanceller;
            }
            InterfaceC11122i0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
            boolean z11 = composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
            Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
            Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
            Ref$FloatRef ref$FloatRef3 = new Ref$FloatRef();
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ref$FloatRef.f23399c = density.mo27099toPx0680j_4(PredictiveBackDrawerMaxScaleXDistanceGrow);
            ref$FloatRef2.f23399c = density.mo27099toPx0680j_4(PredictiveBackDrawerMaxScaleXDistanceShrink);
            ref$FloatRef3.f23399c = density.mo27099toPx0680j_4(PredictiveBackDrawerMaxScaleYDistance);
            boolean zIsOpen = drawerState.isOpen();
            int i15 = i14 & 14;
            boolean zChanged = composerStartRestartGroup.changed(z11) | composerStartRestartGroup.changed(ref$FloatRef.f23399c) | composerStartRestartGroup.changed(ref$FloatRef2.f23399c) | composerStartRestartGroup.changed(ref$FloatRef3.f23399c) | composerStartRestartGroup.changedInstance(coroutineScope) | (i15 == 4);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                z10 = zIsOpen;
                i12 = i14;
                i13 = 0;
                navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1 = new NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1(drawerPredictiveBackState, coroutineScope, drawerState, z11, ref$FloatRef, ref$FloatRef2, ref$FloatRef3, null);
                composerStartRestartGroup.updateRememberedValue(navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1);
            } else {
                z10 = zIsOpen;
                navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1 = objRememberedValue3;
                i12 = i14;
                i13 = 0;
            }
            PredictiveBackHandlerKt.PredictiveBackHandler(z10, (InterfaceC9544p) navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1, composerStartRestartGroup, i13, i13);
            Boolean boolValueOf = Boolean.valueOf(drawerState.isClosed());
            int i16 = i15 == 4 ? 1 : i13;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (i16 != 0 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new NavigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1(drawerState, drawerPredictiveBackState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.LaunchedEffect(boolValueOf, (InterfaceC9544p) objRememberedValue4, composerStartRestartGroup, i13);
            interfaceC9545q.invoke(drawerPredictiveBackState, composerStartRestartGroup, Integer.valueOf((i12 & 112) | 6));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.material3.NavigationDrawer_androidKt.DrawerPredictiveBackHandler.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i17) {
                    NavigationDrawer_androidKt.DrawerPredictiveBackHandler(drawerState, interfaceC9545q, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
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
