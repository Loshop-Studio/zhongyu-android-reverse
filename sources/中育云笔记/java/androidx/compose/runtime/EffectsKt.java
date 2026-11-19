package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9945d;
import kotlinx.coroutines.AbstractC10006d;
import kotlinx.coroutines.InterfaceC10045g;
import kotlinx.coroutines.JobKt__JobKt;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import sd.InterfaceC11122i0;
import sd.InterfaceC11168v;

/* loaded from: classes2.dex */
public final class EffectsKt {
    private static final String DisposableEffectNoParamError = "DisposableEffect must provide one or more 'key' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.";
    private static final DisposableEffectScope InternalDisposableEffectScope = new DisposableEffectScope();
    private static final String LaunchedEffectNoParamError = "LaunchedEffect must provide one or more 'key' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    @Composable
    @InterfaceC10770a
    public static final void DisposableEffect(InterfaceC9540l interfaceC9540l, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-904483903, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:118)");
        }
        throw new IllegalStateException(DisposableEffectNoParamError);
    }

    @Composable
    @InterfaceC10770a
    public static final void LaunchedEffect(final InterfaceC9544p interfaceC9544p, Composer composer, final int i10) {
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
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC9544p() { // from class: androidx.compose.runtime.EffectsKt.LaunchedEffect.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C10786q.f26013a;
                }

                public final void invoke(Composer composer2, int i12) {
                    EffectsKt.LaunchedEffect(interfaceC9544p, composer2, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
                }
            });
        }
    }

    @Composable
    public static final void SideEffect(InterfaceC9529a interfaceC9529a, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1288466761, i10, -1, "androidx.compose.runtime.SideEffect (Effects.kt:49)");
        }
        composer.recordSideEffect(interfaceC9529a);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final InterfaceC11122i0 createCompositionCoroutineScope(InterfaceC9945d interfaceC9945d, Composer composer) {
        if (interfaceC9945d.get(InterfaceC10045g.f23976b0) == null) {
            return new RememberedCoroutineScope(composer.getApplyCoroutineContext(), interfaceC9945d);
        }
        InterfaceC11168v interfaceC11168vM20385b = JobKt__JobKt.m20385b(null, 1, null);
        interfaceC11168vM20385b.mo24765a(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
        return AbstractC10006d.m20744a(interfaceC11168vM20385b);
    }

    @Composable
    public static final InterfaceC11122i0 rememberCoroutineScope(InterfaceC9529a interfaceC9529a, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            interfaceC9529a = new InterfaceC9529a() { // from class: androidx.compose.runtime.EffectsKt.rememberCoroutineScope.1
                @Override // p181hd.InterfaceC9529a
                public final EmptyCoroutineContext invoke() {
                    return EmptyCoroutineContext.f23351c;
                }
            };
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = createCompositionCoroutineScope((InterfaceC9945d) interfaceC9529a.invoke(), composer);
            composer.updateRememberedValue(objRememberedValue);
        }
        return (InterfaceC11122i0) objRememberedValue;
    }

    @Composable
    public static final void DisposableEffect(Object obj, InterfaceC9540l interfaceC9540l, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1371986847, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:148)");
        }
        boolean zChanged = composer.changed(obj);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new DisposableEffectImpl(interfaceC9540l);
            composer.updateRememberedValue(objRememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    public static final void LaunchedEffect(Object obj, InterfaceC9544p interfaceC9544p, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1179185413, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:316)");
        }
        InterfaceC9945d applyCoroutineContext = composer.getApplyCoroutineContext();
        boolean zChanged = composer.changed(obj);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new LaunchedEffectImpl(applyCoroutineContext, interfaceC9544p);
            composer.updateRememberedValue(objRememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    public static final void DisposableEffect(Object obj, Object obj2, InterfaceC9540l interfaceC9540l, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1429097729, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:185)");
        }
        boolean zChanged = composer.changed(obj) | composer.changed(obj2);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new DisposableEffectImpl(interfaceC9540l);
            composer.updateRememberedValue(objRememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    public static final void LaunchedEffect(Object obj, Object obj2, InterfaceC9544p interfaceC9544p, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(590241125, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:335)");
        }
        InterfaceC9945d applyCoroutineContext = composer.getApplyCoroutineContext();
        boolean zChanged = composer.changed(obj) | composer.changed(obj2);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new LaunchedEffectImpl(applyCoroutineContext, interfaceC9544p);
            composer.updateRememberedValue(objRememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    public static final void DisposableEffect(Object obj, Object obj2, Object obj3, InterfaceC9540l interfaceC9540l, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1239538271, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:223)");
        }
        boolean zChanged = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new DisposableEffectImpl(interfaceC9540l);
            composer.updateRememberedValue(objRememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    public static final void LaunchedEffect(Object obj, Object obj2, Object obj3, InterfaceC9544p interfaceC9544p, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-54093371, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:354)");
        }
        InterfaceC9945d applyCoroutineContext = composer.getApplyCoroutineContext();
        boolean zChanged = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new LaunchedEffectImpl(applyCoroutineContext, interfaceC9544p);
            composer.updateRememberedValue(objRememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    public static final void DisposableEffect(Object[] objArr, InterfaceC9540l interfaceC9540l, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1307627122, i10, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:259)");
        }
        boolean zChanged = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zChanged |= composer.changed(obj);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(interfaceC9540l));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    public static final void LaunchedEffect(Object[] objArr, InterfaceC9544p interfaceC9544p, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-139560008, i10, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:377)");
        }
        InterfaceC9945d applyCoroutineContext = composer.getApplyCoroutineContext();
        boolean zChanged = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zChanged |= composer.changed(obj);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, interfaceC9544p));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
