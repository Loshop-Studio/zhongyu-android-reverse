package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9100d;
import kotlinx.coroutines.AbstractC9165e;
import kotlinx.coroutines.InterfaceC9212n;
import kotlinx.coroutines.JobKt__JobKt;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p135i8.InterfaceC8822b0;
import p135i8.InterfaceC8878u;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public final class EffectsKt {
    private static final String DisposableEffectNoParamError = "DisposableEffect must provide one or more 'key' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.";
    private static final DisposableEffectScope InternalDisposableEffectScope = new DisposableEffectScope();
    private static final String LaunchedEffectNoParamError = "LaunchedEffect must provide one or more 'key' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    @Composable
    @InterfaceC8721a
    public static final void DisposableEffect(InterfaceC10570l interfaceC10570l, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-904483903, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:118)");
        }
        throw new IllegalStateException(DisposableEffectNoParamError);
    }

    @Composable
    @InterfaceC8721a
    public static final void LaunchedEffect(final InterfaceC10574p interfaceC10574p, Composer composer, final int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-805415771);
        int i11 = i10 & 1;
        if (composerStartRestartGroup.shouldExecute(i11 != 0, i11)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-805415771, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:300)");
            }
            throw new IllegalStateException(LaunchedEffectNoParamError);
        }
        composerStartRestartGroup.skipToGroupEnd();
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC10574p() { // from class: androidx.compose.runtime.EffectsKt.LaunchedEffect.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p300x7.InterfaceC10574p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C8736p.f16368a;
                }

                public final void invoke(Composer composer2, int i12) {
                    EffectsKt.LaunchedEffect(interfaceC10574p, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    @Composable
    public static final void SideEffect(InterfaceC10559a interfaceC10559a, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1288466761, i10, -1, "androidx.compose.runtime.SideEffect (Effects.kt:49)");
        }
        composer.recordSideEffect(interfaceC10559a);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final InterfaceC8822b0 createCompositionCoroutineScope(InterfaceC9100d interfaceC9100d, Composer composer) {
        if (interfaceC9100d.get(InterfaceC9212n.f18095c0) == null) {
            return new RememberedCoroutineScope(composer.getApplyCoroutineContext(), interfaceC9100d);
        }
        InterfaceC8878u interfaceC8878uM16233b = JobKt__JobKt.m16233b(null, 1, null);
        interfaceC8878uM16233b.mo14802a(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
        return AbstractC9165e.m16552a(interfaceC8878uM16233b);
    }

    @Composable
    public static final InterfaceC8822b0 rememberCoroutineScope(InterfaceC10559a interfaceC10559a, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            interfaceC10559a = new InterfaceC10559a() { // from class: androidx.compose.runtime.EffectsKt.rememberCoroutineScope.1
                @Override // p300x7.InterfaceC10559a
                public final EmptyCoroutineContext invoke() {
                    return EmptyCoroutineContext.f17438a;
                }
            };
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = createCompositionCoroutineScope((InterfaceC9100d) interfaceC10559a.invoke(), composer);
            composer.updateRememberedValue(objRememberedValue);
        }
        return (InterfaceC8822b0) objRememberedValue;
    }

    @Composable
    public static final void DisposableEffect(Object obj, InterfaceC10570l interfaceC10570l, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1371986847, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:148)");
        }
        boolean zChanged = composer.changed(obj);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new DisposableEffectImpl(interfaceC10570l);
            composer.updateRememberedValue(objRememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    public static final void LaunchedEffect(Object obj, InterfaceC10574p interfaceC10574p, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1179185413, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:316)");
        }
        InterfaceC9100d applyCoroutineContext = composer.getApplyCoroutineContext();
        boolean zChanged = composer.changed(obj);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new LaunchedEffectImpl(applyCoroutineContext, interfaceC10574p);
            composer.updateRememberedValue(objRememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    public static final void DisposableEffect(Object obj, Object obj2, InterfaceC10570l interfaceC10570l, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1429097729, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:185)");
        }
        boolean zChanged = composer.changed(obj) | composer.changed(obj2);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new DisposableEffectImpl(interfaceC10570l);
            composer.updateRememberedValue(objRememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    public static final void LaunchedEffect(Object obj, Object obj2, InterfaceC10574p interfaceC10574p, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(590241125, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:335)");
        }
        InterfaceC9100d applyCoroutineContext = composer.getApplyCoroutineContext();
        boolean zChanged = composer.changed(obj) | composer.changed(obj2);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new LaunchedEffectImpl(applyCoroutineContext, interfaceC10574p);
            composer.updateRememberedValue(objRememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    public static final void DisposableEffect(Object obj, Object obj2, Object obj3, InterfaceC10570l interfaceC10570l, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1239538271, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:223)");
        }
        boolean zChanged = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new DisposableEffectImpl(interfaceC10570l);
            composer.updateRememberedValue(objRememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    public static final void LaunchedEffect(Object obj, Object obj2, Object obj3, InterfaceC10574p interfaceC10574p, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-54093371, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:354)");
        }
        InterfaceC9100d applyCoroutineContext = composer.getApplyCoroutineContext();
        boolean zChanged = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new LaunchedEffectImpl(applyCoroutineContext, interfaceC10574p);
            composer.updateRememberedValue(objRememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    public static final void DisposableEffect(Object[] objArr, InterfaceC10570l interfaceC10570l, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1307627122, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:259)");
        }
        boolean zChanged = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zChanged |= composer.changed(obj);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(interfaceC10570l));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    public static final void LaunchedEffect(Object[] objArr, InterfaceC10574p interfaceC10574p, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-139560008, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:377)");
        }
        InterfaceC9100d applyCoroutineContext = composer.getApplyCoroutineContext();
        boolean zChanged = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zChanged |= composer.changed(obj);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, interfaceC10574p));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
