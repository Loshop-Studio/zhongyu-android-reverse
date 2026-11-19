package androidx.compose.runtime;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.C5989p;
import kotlinx.coroutines.C6010v0;
import kotlinx.coroutines.C6015x0;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a(\u0010\t\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\t\u0010\n\u001a2\u0010\t\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\t\u0010\r\u001a<\u0010\t\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\t\u0010\u000f\u001aF\u0010\t\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\t\u0010\u0011\u001a@\u0010\t\u001a\u00020\u00012\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\u0012\"\u0004\u0018\u00010\u000b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\t\u0010\u0014\u001a8\u0010\u0019\u001a\u00020\u00012'\u0010\u0018\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0015¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001aB\u0010\u0019\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2'\u0010\u0018\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0015¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\u0019\u0010\u001b\u001aL\u0010\u0019\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2'\u0010\u0018\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0015¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\u0019\u0010\u001c\u001aV\u0010\u0019\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2'\u0010\u0018\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0015¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\u0019\u0010\u001d\u001aP\u0010\u0019\u001a\u00020\u00012\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\u0012\"\u0004\u0018\u00010\u000b2'\u0010\u0018\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0015¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\u0019\u0010\u001e\u001a\u001f\u0010#\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\b#\u0010$\u001a%\u0010'\u001a\u00020\u00162\u0013\b\u0006\u0010&\u001a\r\u0012\u0004\u0012\u00020\u001f0\u0000¢\u0006\u0002\b%H\u0087\b¢\u0006\u0004\b'\u0010(\"\u0014\u0010)\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*\"\u0014\u0010,\u001a\u00020+8\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010-\"\u0014\u0010.\u001a\u00020+8\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010-¨\u0006/"}, m5110d2 = {"Lkotlin/Function0;", "Ld6/s;", "effect", "SideEffect", "(Lr6/a;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function1;", "Landroidx/compose/runtime/DisposableEffectScope;", "Landroidx/compose/runtime/DisposableEffectResult;", "Lkotlin/ExtensionFunctionType;", "DisposableEffect", "(Lr6/c;Landroidx/compose/runtime/Composer;I)V", "", "key1", "(Ljava/lang/Object;Lr6/c;Landroidx/compose/runtime/Composer;I)V", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Lr6/c;Landroidx/compose/runtime/Composer;I)V", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lr6/c;Landroidx/compose/runtime/Composer;I)V", "", "keys", "([Ljava/lang/Object;Lr6/c;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function2;", "Lkotlinx/coroutines/v;", "Lh6/c;", "block", "LaunchedEffect", "(Lr6/e;Landroidx/compose/runtime/Composer;I)V", "(Ljava/lang/Object;Lr6/e;Landroidx/compose/runtime/Composer;I)V", "(Ljava/lang/Object;Ljava/lang/Object;Lr6/e;Landroidx/compose/runtime/Composer;I)V", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lr6/e;Landroidx/compose/runtime/Composer;I)V", "([Ljava/lang/Object;Lr6/e;Landroidx/compose/runtime/Composer;I)V", "Lh6/h;", "coroutineContext", "Landroidx/compose/runtime/Composer;", "composer", "createCompositionCoroutineScope", "(Lh6/h;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/v;", "Landroidx/compose/runtime/DisallowComposableCalls;", "getContext", "rememberCoroutineScope", "(Lr6/a;Landroidx/compose/runtime/Composer;II)Lkotlinx/coroutines/v;", "InternalDisposableEffectScope", "Landroidx/compose/runtime/DisposableEffectScope;", "", "DisposableEffectNoParamError", "Ljava/lang/String;", "LaunchedEffectNoParamError", "runtime_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,561:1\n1247#2,6:562\n1247#2,6:568\n1247#2,6:574\n1247#2,6:584\n1247#2,6:590\n1247#2,6:596\n1247#2,6:602\n1247#2,6:612\n1247#2,6:618\n82#3,4:580\n82#3,4:608\n*S KotlinDebug\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/EffectsKt\n*L\n150#1:562,6\n187#1:568,6\n225#1:574,6\n261#1:584,6\n319#1:590,6\n338#1:596,6\n357#1:602,6\n380#1:612,6\n559#1:618,6\n261#1:580,4\n380#1:608,4\n*E\n"})
/* loaded from: classes.dex */
public final class EffectsKt {

    @NotNull
    private static final String DisposableEffectNoParamError = "DisposableEffect must provide one or more 'key' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.";

    @NotNull
    private static final DisposableEffectScope InternalDisposableEffectScope = new DisposableEffectScope();

    @NotNull
    private static final String LaunchedEffectNoParamError = "LaunchedEffect must provide one or more 'key' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    @Deprecated(level = DeprecationLevel.ERROR, message = DisposableEffectNoParamError)
    @Composable
    public static final void DisposableEffect(@NotNull InterfaceC6471c interfaceC6471c, @Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-904483903, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:118)");
        }
        throw new IllegalStateException(DisposableEffectNoParamError);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = LaunchedEffectNoParamError)
    @Composable
    public static final void LaunchedEffect(@NotNull final InterfaceC6473e interfaceC6473e, @Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-805415771);
        int i8 = i & 1;
        if (composerStartRestartGroup.shouldExecute(i8 != 0, i8)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-805415771, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:300)");
            }
            throw new IllegalStateException(LaunchedEffectNoParamError);
        }
        composerStartRestartGroup.skipToGroupEnd();
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.runtime.EffectsKt.LaunchedEffect.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(Composer composer2, int i9) {
                    EffectsKt.LaunchedEffect(interfaceC6473e, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @Composable
    public static final void SideEffect(@NotNull InterfaceC6469a interfaceC6469a, @Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1288466761, i, -1, "androidx.compose.runtime.SideEffect (Effects.kt:49)");
        }
        composer.recordSideEffect(interfaceC6469a);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @PublishedApi
    @NotNull
    public static final InterfaceC6009v createCompositionCoroutineScope(@NotNull InterfaceC5636h interfaceC5636h, @NotNull Composer composer) {
        if (interfaceC5636h.get(C6010v0.f9513a) == null) {
            return new RememberedCoroutineScope(composer.getApplyCoroutineContext(), interfaceC5636h);
        }
        C6015x0 c6015x0M5631b = AbstractC6014x.m5631b();
        c6015x0M5631b.m5446N(new C5989p(false, new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job")));
        return AbstractC6014x.m5630a(c6015x0M5631b);
    }

    @Composable
    @NotNull
    public static final InterfaceC6009v rememberCoroutineScope(@Nullable InterfaceC6469a interfaceC6469a, @Nullable Composer composer, int i, int i8) {
        if ((i8 & 1) != 0) {
            interfaceC6469a = new InterfaceC6469a() { // from class: androidx.compose.runtime.EffectsKt.rememberCoroutineScope.1
                @Override // p152r6.InterfaceC6469a
                public final EmptyCoroutineContext invoke() {
                    return EmptyCoroutineContext.INSTANCE;
                }
            };
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = createCompositionCoroutineScope((InterfaceC5636h) interfaceC6469a.invoke(), composer);
            composer.updateRememberedValue(objRememberedValue);
        }
        return (InterfaceC6009v) objRememberedValue;
    }

    @Composable
    public static final void DisposableEffect(@Nullable Object obj, @NotNull InterfaceC6471c interfaceC6471c, @Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1371986847, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:148)");
        }
        boolean zChanged = composer.changed(obj);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new DisposableEffectImpl(interfaceC6471c);
            composer.updateRememberedValue(objRememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    public static final void LaunchedEffect(@Nullable Object obj, @NotNull InterfaceC6473e interfaceC6473e, @Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1179185413, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:316)");
        }
        InterfaceC5636h applyCoroutineContext = composer.getApplyCoroutineContext();
        boolean zChanged = composer.changed(obj);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new LaunchedEffectImpl(applyCoroutineContext, interfaceC6473e);
            composer.updateRememberedValue(objRememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    public static final void DisposableEffect(@Nullable Object obj, @Nullable Object obj2, @NotNull InterfaceC6471c interfaceC6471c, @Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1429097729, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:185)");
        }
        boolean zChanged = composer.changed(obj) | composer.changed(obj2);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new DisposableEffectImpl(interfaceC6471c);
            composer.updateRememberedValue(objRememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    public static final void LaunchedEffect(@Nullable Object obj, @Nullable Object obj2, @NotNull InterfaceC6473e interfaceC6473e, @Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(590241125, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:335)");
        }
        InterfaceC5636h applyCoroutineContext = composer.getApplyCoroutineContext();
        boolean zChanged = composer.changed(obj) | composer.changed(obj2);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new LaunchedEffectImpl(applyCoroutineContext, interfaceC6473e);
            composer.updateRememberedValue(objRememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    public static final void DisposableEffect(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @NotNull InterfaceC6471c interfaceC6471c, @Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1239538271, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:223)");
        }
        boolean zChanged = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new DisposableEffectImpl(interfaceC6471c);
            composer.updateRememberedValue(objRememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    public static final void LaunchedEffect(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @NotNull InterfaceC6473e interfaceC6473e, @Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-54093371, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:354)");
        }
        InterfaceC5636h applyCoroutineContext = composer.getApplyCoroutineContext();
        boolean zChanged = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new LaunchedEffectImpl(applyCoroutineContext, interfaceC6473e);
            composer.updateRememberedValue(objRememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    public static final void DisposableEffect(@NotNull Object[] objArr, @NotNull InterfaceC6471c interfaceC6471c, @Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1307627122, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:259)");
        }
        boolean zChanged = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zChanged |= composer.changed(obj);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(interfaceC6471c));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    public static final void LaunchedEffect(@NotNull Object[] objArr, @NotNull InterfaceC6473e interfaceC6473e, @Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-139560008, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:377)");
        }
        InterfaceC5636h applyCoroutineContext = composer.getApplyCoroutineContext();
        boolean zChanged = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zChanged |= composer.changed(obj);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, interfaceC6473e));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
