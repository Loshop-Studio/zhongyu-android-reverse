package androidx.compose.material3;

import android.view.compose.PredictiveBackHandlerKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a0\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u001a\u0010\u000e\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r\"\u001a\u0010\u0010\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r¨\u0006\u0012"}, m5110d2 = {"Landroidx/compose/material3/DrawerState;", "drawerState", "Lkotlin/Function1;", "Landroidx/compose/material3/DrawerPredictiveBackState;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "content", "DrawerPredictiveBackHandler", "(Landroidx/compose/material3/DrawerState;Lr6/f;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/unit/Dp;", "PredictiveBackDrawerMaxScaleXDistanceGrow", "F", "getPredictiveBackDrawerMaxScaleXDistanceGrow", "()F", "PredictiveBackDrawerMaxScaleXDistanceShrink", "getPredictiveBackDrawerMaxScaleXDistanceShrink", "PredictiveBackDrawerMaxScaleYDistance", "getPredictiveBackDrawerMaxScaleYDistance", "material3_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavigationDrawer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.android.kt\nandroidx/compose/material3/NavigationDrawer_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,102:1\n1223#2,6:103\n1223#2,3:114\n1226#2,3:120\n1223#2,6:126\n1223#2,6:132\n488#3:109\n487#3,4:110\n491#3,2:117\n495#3:123\n487#4:119\n77#5:124\n77#5:125\n148#6:138\n148#6:139\n148#6:140\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.android.kt\nandroidx/compose/material3/NavigationDrawer_androidKt\n*L\n46#1:103,6\n47#1:114,3\n47#1:120,3\n58#1:126,6\n90#1:132,6\n47#1:109\n47#1:110,4\n47#1:117,2\n47#1:123\n47#1:119\n48#1:124\n52#1:125\n99#1:138\n100#1:139\n101#1:140\n*E\n"})
/* loaded from: classes.dex */
public final class NavigationDrawer_androidKt {
    private static final float PredictiveBackDrawerMaxScaleXDistanceGrow = C2331Dp.m13305constructorimpl(12);
    private static final float PredictiveBackDrawerMaxScaleXDistanceShrink = C2331Dp.m13305constructorimpl(24);
    private static final float PredictiveBackDrawerMaxScaleYDistance = C2331Dp.m13305constructorimpl(48);

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void DrawerPredictiveBackHandler(@NotNull final DrawerState drawerState, @NotNull final InterfaceC6474f interfaceC6474f, @Nullable Composer composer, final int i) {
        int i8;
        Object navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1;
        boolean z8;
        int i9;
        int i10;
        Composer composerStartRestartGroup = composer.startRestartGroup(1444817207);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(drawerState) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6474f) ? 32 : 16;
        }
        int i11 = i8;
        if ((i11 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1444817207, i11, -1, "androidx.compose.material3.DrawerPredictiveBackHandler (NavigationDrawer.android.kt:44)");
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
            InterfaceC6009v coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
            boolean z9 = composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
            Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
            Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
            Ref$FloatRef ref$FloatRef3 = new Ref$FloatRef();
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ref$FloatRef.element = density.mo6903toPx0680j_4(PredictiveBackDrawerMaxScaleXDistanceGrow);
            ref$FloatRef2.element = density.mo6903toPx0680j_4(PredictiveBackDrawerMaxScaleXDistanceShrink);
            ref$FloatRef3.element = density.mo6903toPx0680j_4(PredictiveBackDrawerMaxScaleYDistance);
            boolean zIsOpen = drawerState.isOpen();
            int i12 = i11 & 14;
            boolean zChanged = composerStartRestartGroup.changed(z9) | composerStartRestartGroup.changed(ref$FloatRef.element) | composerStartRestartGroup.changed(ref$FloatRef2.element) | composerStartRestartGroup.changed(ref$FloatRef3.element) | composerStartRestartGroup.changedInstance(coroutineScope) | (i12 == 4);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                z8 = zIsOpen;
                i9 = i11;
                i10 = 0;
                navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1 = new NavigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1(drawerPredictiveBackState, coroutineScope, drawerState, z9, ref$FloatRef, ref$FloatRef2, ref$FloatRef3, null);
                composerStartRestartGroup.updateRememberedValue(navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1);
            } else {
                z8 = zIsOpen;
                navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1 = objRememberedValue3;
                i9 = i11;
                i10 = 0;
            }
            PredictiveBackHandlerKt.PredictiveBackHandler(z8, (InterfaceC6473e) navigationDrawer_androidKt$DrawerPredictiveBackHandler$2$1, composerStartRestartGroup, i10, i10);
            Boolean boolValueOf = Boolean.valueOf(drawerState.isClosed());
            int i13 = i12 == 4 ? 1 : i10;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (i13 != 0 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new NavigationDrawer_androidKt$DrawerPredictiveBackHandler$3$1(drawerState, drawerPredictiveBackState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.LaunchedEffect(boolValueOf, (InterfaceC6473e) objRememberedValue4, composerStartRestartGroup, i10);
            interfaceC6474f.invoke(drawerPredictiveBackState, composerStartRestartGroup, Integer.valueOf((i9 & 112) | 6));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.NavigationDrawer_androidKt.DrawerPredictiveBackHandler.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer2, int i14) {
                    NavigationDrawer_androidKt.DrawerPredictiveBackHandler(drawerState, interfaceC6474f, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
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
