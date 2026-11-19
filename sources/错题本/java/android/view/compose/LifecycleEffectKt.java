package android.view.compose;

import android.view.C2764i;
import android.view.Lifecycle;
import android.view.LifecycleOwner;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.view.C2513e;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a/\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a<\u0010\u0010\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aF\u0010\u0010\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0013\u001aP\u0010\u0010\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0015\u001aJ\u0010\u0010\u001a\u00020\u00052\u0016\u0010\u0017\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\u0016\"\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0018\u001a2\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0019\u001a8\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\f2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a<\u0010\u001f\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u000b¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001f\u0010\u0011\u001aF\u0010\u001f\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u000b¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001f\u0010\u0013\u001aP\u0010\u001f\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u000b¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001f\u0010\u0015\u001aJ\u0010\u001f\u001a\u00020\u00052\u0016\u0010\u0017\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\u0016\"\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u000b¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001f\u0010\u0018\u001a2\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u000b¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001f\u0010\u0019\u001a8\u0010 \u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001d2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u000b¢\u0006\u0002\b\u000eH\u0003¢\u0006\u0004\b \u0010!\"\u0014\u0010#\u001a\u00020\"8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010$\"\u0014\u0010%\u001a\u00020\"8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010$¨\u0006'²\u0006\u0012\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\nX\u008a\u0084\u0002"}, m5110d2 = {"Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function0;", "Ld6/s;", "onEvent", "LifecycleEventEffect", "(Landroidx/lifecycle/Lifecycle$Event;Landroidx/lifecycle/LifecycleOwner;Lr6/a;Landroidx/compose/runtime/Composer;II)V", "", "key1", "Lkotlin/Function1;", "Landroidx/lifecycle/compose/LifecycleStartStopEffectScope;", "Landroidx/lifecycle/compose/LifecycleStopOrDisposeEffectResult;", "Lkotlin/ExtensionFunctionType;", "effects", "LifecycleStartEffect", "(Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lr6/c;Landroidx/compose/runtime/Composer;II)V", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lr6/c;Landroidx/compose/runtime/Composer;II)V", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lr6/c;Landroidx/compose/runtime/Composer;II)V", "", "keys", "([Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lr6/c;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/lifecycle/LifecycleOwner;Lr6/c;Landroidx/compose/runtime/Composer;II)V", "scope", "LifecycleStartEffectImpl", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/compose/LifecycleStartStopEffectScope;Lr6/c;Landroidx/compose/runtime/Composer;I)V", "Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;", "Landroidx/lifecycle/compose/LifecyclePauseOrDisposeEffectResult;", "LifecycleResumeEffect", "LifecycleResumeEffectImpl", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;Lr6/c;Landroidx/compose/runtime/Composer;I)V", "", "LifecycleStartEffectNoParamError", "Ljava/lang/String;", "LifecycleResumeEffectNoParamError", "currentOnEvent", "lifecycle-runtime-compose_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLifecycleEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,719:1\n77#2:720\n77#2:727\n77#2:734\n77#2:741\n77#2:748\n77#2:759\n77#2:766\n77#2:773\n77#2:780\n77#2:787\n77#2:798\n1225#3,6:721\n1225#3,6:728\n1225#3,6:735\n1225#3,6:742\n1225#3,6:753\n1225#3,6:760\n1225#3,6:767\n1225#3,6:774\n1225#3,6:781\n1225#3,6:792\n1225#3,6:799\n86#4,4:749\n86#4,4:788\n81#5:805\n64#6,5:806\n64#6,5:812\n64#6,5:817\n1#7:811\n*S KotlinDebug\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt\n*L\n54#1:720\n128#1:727\n186#1:734\n249#1:741\n307#1:748\n332#1:759\n446#1:766\n505#1:773\n569#1:780\n628#1:787\n655#1:798\n67#1:721,6\n132#1:728,6\n190#1:735,6\n253#1:742,6\n311#1:753,6\n342#1:760,6\n450#1:767,6\n509#1:774,6\n573#1:781,6\n632#1:792,6\n665#1:799,6\n311#1:749,4\n632#1:788,4\n66#1:805\n76#1:806,5\n357#1:812,5\n680#1:817,5\n*E\n"})
/* loaded from: classes2.dex */
public final class LifecycleEffectKt {

    @NotNull
    private static final String LifecycleResumeEffectNoParamError = "LifecycleResumeEffect must provide one or more 'key' parameters that define the identity of the LifecycleResumeEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    @NotNull
    private static final String LifecycleStartEffectNoParamError = "LifecycleStartEffect must provide one or more 'key' parameters that define the identity of the LifecycleStartEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    @Metadata(m5111k = 3, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f2  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LifecycleEventEffect(@org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.Event r8, @org.jetbrains.annotations.Nullable android.view.LifecycleOwner r9, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6469a r10, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.view.compose.LifecycleEffectKt.LifecycleEventEffect(androidx.lifecycle.Lifecycle$Event, androidx.lifecycle.LifecycleOwner, r6.a, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final InterfaceC6469a LifecycleEventEffect$lambda$0(State<? extends InterfaceC6469a> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult LifecycleEventEffect$lambda$4$lambda$3(final LifecycleOwner lifecycleOwner, Lifecycle.Event event, State state, DisposableEffectScope disposableEffectScope) {
        final C2755f c2755f = new C2755f(0, event, state);
        lifecycleOwner.getLifecycle().addObserver(c2755f);
        return new DisposableEffectResult() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleEventEffect$lambda$4$lambda$3$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                lifecycleOwner.getLifecycle().removeObserver(c2755f);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LifecycleEventEffect$lambda$4$lambda$3$lambda$1(Lifecycle.Event event, State state, LifecycleOwner lifecycleOwner, Lifecycle.Event event2) {
        if (event2 == event) {
            LifecycleEventEffect$lambda$0(state).invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s LifecycleEventEffect$lambda$5(Lifecycle.Event event, LifecycleOwner lifecycleOwner, InterfaceC6469a interfaceC6469a, int i, int i8, Composer composer, int i9) {
        LifecycleEventEffect(event, lifecycleOwner, interfaceC6469a, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i8);
        return C5443s.f8405a;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c7  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LifecycleResumeEffect(@org.jetbrains.annotations.Nullable java.lang.Object r8, @org.jetbrains.annotations.Nullable android.view.LifecycleOwner r9, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6471c r10, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.view.compose.LifecycleEffectKt.LifecycleResumeEffect(java.lang.Object, androidx.lifecycle.LifecycleOwner, r6.c, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s LifecycleResumeEffect$lambda$22(Object obj, LifecycleOwner lifecycleOwner, InterfaceC6471c interfaceC6471c, int i, int i8, Composer composer, int i9) {
        LifecycleResumeEffect(obj, lifecycleOwner, interfaceC6471c, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i8);
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s LifecycleResumeEffect$lambda$24(Object obj, Object obj2, LifecycleOwner lifecycleOwner, InterfaceC6471c interfaceC6471c, int i, int i8, Composer composer, int i9) {
        LifecycleResumeEffect(obj, obj2, lifecycleOwner, interfaceC6471c, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i8);
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s LifecycleResumeEffect$lambda$26(Object obj, Object obj2, Object obj3, LifecycleOwner lifecycleOwner, InterfaceC6471c interfaceC6471c, int i, int i8, Composer composer, int i9) {
        LifecycleResumeEffect(obj, obj2, obj3, lifecycleOwner, interfaceC6471c, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i8);
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s LifecycleResumeEffect$lambda$28(Object[] objArr, LifecycleOwner lifecycleOwner, InterfaceC6471c interfaceC6471c, int i, int i8, Composer composer, int i9) {
        LifecycleResumeEffect(objArr, lifecycleOwner, interfaceC6471c, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i8);
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s LifecycleResumeEffect$lambda$29(LifecycleOwner lifecycleOwner, InterfaceC6471c interfaceC6471c, int i, int i8, Composer composer, int i9) {
        LifecycleResumeEffect(lifecycleOwner, interfaceC6471c, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i8);
        return C5443s.f8405a;
    }

    @Composable
    private static final void LifecycleResumeEffectImpl(LifecycleOwner lifecycleOwner, LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope, InterfaceC6471c interfaceC6471c, Composer composer, int i) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(912823238);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(lifecycleOwner) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(lifecycleResumePauseEffectScope) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6471c) ? 256 : 128;
        }
        if ((i8 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(912823238, i8, -1, "androidx.lifecycle.compose.LifecycleResumeEffectImpl (LifecycleEffect.kt:663)");
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(lifecycleResumePauseEffectScope) | ((i8 & 896) == 256) | composerStartRestartGroup.changedInstance(lifecycleOwner);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C2764i(3, lifecycleOwner, lifecycleResumePauseEffectScope, interfaceC6471c);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.DisposableEffect(lifecycleOwner, lifecycleResumePauseEffectScope, (InterfaceC6471c) objRememberedValue, composerStartRestartGroup, i8 & 126);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2756g(i, 1, lifecycleOwner, lifecycleResumePauseEffectScope, interfaceC6471c));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult LifecycleResumeEffectImpl$lambda$34$lambda$33(final LifecycleOwner lifecycleOwner, LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope, InterfaceC6471c interfaceC6471c, DisposableEffectScope disposableEffectScope) {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final C2513e c2513e = new C2513e(2, ref$ObjectRef, lifecycleResumePauseEffectScope, interfaceC6471c);
        lifecycleOwner.getLifecycle().addObserver(c2513e);
        return new DisposableEffectResult() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleResumeEffectImpl$lambda$34$lambda$33$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                lifecycleOwner.getLifecycle().removeObserver(c2513e);
                LifecyclePauseOrDisposeEffectResult lifecyclePauseOrDisposeEffectResult = (LifecyclePauseOrDisposeEffectResult) ref$ObjectRef.element;
                if (lifecyclePauseOrDisposeEffectResult != null) {
                    lifecyclePauseOrDisposeEffectResult.runPauseOrOnDisposeEffect();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    public static final void LifecycleResumeEffectImpl$lambda$34$lambda$33$lambda$31(LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope, Ref$ObjectRef ref$ObjectRef, InterfaceC6471c interfaceC6471c, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i == 3) {
            ref$ObjectRef.element = interfaceC6471c.invoke(lifecycleResumePauseEffectScope);
        } else {
            if (i != 4) {
                return;
            }
            LifecyclePauseOrDisposeEffectResult lifecyclePauseOrDisposeEffectResult = (LifecyclePauseOrDisposeEffectResult) ref$ObjectRef.element;
            if (lifecyclePauseOrDisposeEffectResult != null) {
                lifecyclePauseOrDisposeEffectResult.runPauseOrOnDisposeEffect();
            }
            ref$ObjectRef.element = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s LifecycleResumeEffectImpl$lambda$35(LifecycleOwner lifecycleOwner, LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope, InterfaceC6471c interfaceC6471c, int i, Composer composer, int i8) {
        LifecycleResumeEffectImpl(lifecycleOwner, lifecycleResumePauseEffectScope, interfaceC6471c, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return C5443s.f8405a;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c7  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LifecycleStartEffect(@org.jetbrains.annotations.Nullable java.lang.Object r8, @org.jetbrains.annotations.Nullable android.view.LifecycleOwner r9, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6471c r10, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.view.compose.LifecycleEffectKt.LifecycleStartEffect(java.lang.Object, androidx.lifecycle.LifecycleOwner, r6.c, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s LifecycleStartEffect$lambda$11(Object obj, Object obj2, Object obj3, LifecycleOwner lifecycleOwner, InterfaceC6471c interfaceC6471c, int i, int i8, Composer composer, int i9) {
        LifecycleStartEffect(obj, obj2, obj3, lifecycleOwner, interfaceC6471c, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i8);
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s LifecycleStartEffect$lambda$13(Object[] objArr, LifecycleOwner lifecycleOwner, InterfaceC6471c interfaceC6471c, int i, int i8, Composer composer, int i9) {
        LifecycleStartEffect(objArr, lifecycleOwner, interfaceC6471c, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i8);
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s LifecycleStartEffect$lambda$14(LifecycleOwner lifecycleOwner, InterfaceC6471c interfaceC6471c, int i, int i8, Composer composer, int i9) {
        LifecycleStartEffect(lifecycleOwner, interfaceC6471c, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i8);
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s LifecycleStartEffect$lambda$7(Object obj, LifecycleOwner lifecycleOwner, InterfaceC6471c interfaceC6471c, int i, int i8, Composer composer, int i9) {
        LifecycleStartEffect(obj, lifecycleOwner, interfaceC6471c, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i8);
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s LifecycleStartEffect$lambda$9(Object obj, Object obj2, LifecycleOwner lifecycleOwner, InterfaceC6471c interfaceC6471c, int i, int i8, Composer composer, int i9) {
        LifecycleStartEffect(obj, obj2, lifecycleOwner, interfaceC6471c, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i8);
        return C5443s.f8405a;
    }

    @Composable
    private static final void LifecycleStartEffectImpl(LifecycleOwner lifecycleOwner, LifecycleStartStopEffectScope lifecycleStartStopEffectScope, InterfaceC6471c interfaceC6471c, Composer composer, int i) {
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(228371534);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(lifecycleOwner) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(lifecycleStartStopEffectScope) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6471c) ? 256 : 128;
        }
        if ((i8 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(228371534, i8, -1, "androidx.lifecycle.compose.LifecycleStartEffectImpl (LifecycleEffect.kt:340)");
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(lifecycleStartStopEffectScope) | ((i8 & 896) == 256) | composerStartRestartGroup.changedInstance(lifecycleOwner);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C2764i(2, lifecycleOwner, lifecycleStartStopEffectScope, interfaceC6471c);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.DisposableEffect(lifecycleOwner, lifecycleStartStopEffectScope, (InterfaceC6471c) objRememberedValue, composerStartRestartGroup, i8 & 126);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new C2756g(i, 0, lifecycleOwner, lifecycleStartStopEffectScope, interfaceC6471c));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult LifecycleStartEffectImpl$lambda$19$lambda$18(final LifecycleOwner lifecycleOwner, LifecycleStartStopEffectScope lifecycleStartStopEffectScope, InterfaceC6471c interfaceC6471c, DisposableEffectScope disposableEffectScope) {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final C2513e c2513e = new C2513e(1, ref$ObjectRef, lifecycleStartStopEffectScope, interfaceC6471c);
        lifecycleOwner.getLifecycle().addObserver(c2513e);
        return new DisposableEffectResult() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleStartEffectImpl$lambda$19$lambda$18$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                lifecycleOwner.getLifecycle().removeObserver(c2513e);
                LifecycleStopOrDisposeEffectResult lifecycleStopOrDisposeEffectResult = (LifecycleStopOrDisposeEffectResult) ref$ObjectRef.element;
                if (lifecycleStopOrDisposeEffectResult != null) {
                    lifecycleStopOrDisposeEffectResult.runStopOrDisposeEffect();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    public static final void LifecycleStartEffectImpl$lambda$19$lambda$18$lambda$16(LifecycleStartStopEffectScope lifecycleStartStopEffectScope, Ref$ObjectRef ref$ObjectRef, InterfaceC6471c interfaceC6471c, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i == 1) {
            ref$ObjectRef.element = interfaceC6471c.invoke(lifecycleStartStopEffectScope);
        } else {
            if (i != 2) {
                return;
            }
            LifecycleStopOrDisposeEffectResult lifecycleStopOrDisposeEffectResult = (LifecycleStopOrDisposeEffectResult) ref$ObjectRef.element;
            if (lifecycleStopOrDisposeEffectResult != null) {
                lifecycleStopOrDisposeEffectResult.runStopOrDisposeEffect();
            }
            ref$ObjectRef.element = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s LifecycleStartEffectImpl$lambda$20(LifecycleOwner lifecycleOwner, LifecycleStartStopEffectScope lifecycleStartStopEffectScope, InterfaceC6471c interfaceC6471c, int i, Composer composer, int i8) {
        LifecycleStartEffectImpl(lifecycleOwner, lifecycleStartStopEffectScope, interfaceC6471c, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return C5443s.f8405a;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e5  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LifecycleResumeEffect(@org.jetbrains.annotations.Nullable java.lang.Object r9, @org.jetbrains.annotations.Nullable java.lang.Object r10, @org.jetbrains.annotations.Nullable android.view.LifecycleOwner r11, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6471c r12, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.view.compose.LifecycleEffectKt.LifecycleResumeEffect(java.lang.Object, java.lang.Object, androidx.lifecycle.LifecycleOwner, r6.c, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e5  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LifecycleStartEffect(@org.jetbrains.annotations.Nullable java.lang.Object r9, @org.jetbrains.annotations.Nullable java.lang.Object r10, @org.jetbrains.annotations.Nullable android.view.LifecycleOwner r11, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6471c r12, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.view.compose.LifecycleEffectKt.LifecycleStartEffect(java.lang.Object, java.lang.Object, androidx.lifecycle.LifecycleOwner, r6.c, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0101  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LifecycleResumeEffect(@org.jetbrains.annotations.Nullable java.lang.Object r9, @org.jetbrains.annotations.Nullable java.lang.Object r10, @org.jetbrains.annotations.Nullable java.lang.Object r11, @org.jetbrains.annotations.Nullable android.view.LifecycleOwner r12, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6471c r13, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r14, int r15, int r16) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.view.compose.LifecycleEffectKt.LifecycleResumeEffect(java.lang.Object, java.lang.Object, java.lang.Object, androidx.lifecycle.LifecycleOwner, r6.c, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0101  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LifecycleStartEffect(@org.jetbrains.annotations.Nullable java.lang.Object r9, @org.jetbrains.annotations.Nullable java.lang.Object r10, @org.jetbrains.annotations.Nullable java.lang.Object r11, @org.jetbrains.annotations.Nullable android.view.LifecycleOwner r12, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6471c r13, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r14, int r15, int r16) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.view.compose.LifecycleEffectKt.LifecycleStartEffect(java.lang.Object, java.lang.Object, java.lang.Object, androidx.lifecycle.LifecycleOwner, r6.c, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cd A[LOOP:1: B:58:0x00cb->B:59:0x00cd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0103  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LifecycleResumeEffect(@org.jetbrains.annotations.NotNull java.lang.Object[] r8, @org.jetbrains.annotations.Nullable android.view.LifecycleOwner r9, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6471c r10, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.view.compose.LifecycleEffectKt.LifecycleResumeEffect(java.lang.Object[], androidx.lifecycle.LifecycleOwner, r6.c, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cd A[LOOP:1: B:58:0x00cb->B:59:0x00cd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0103  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LifecycleStartEffect(@org.jetbrains.annotations.NotNull java.lang.Object[] r8, @org.jetbrains.annotations.Nullable android.view.LifecycleOwner r9, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6471c r10, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.view.compose.LifecycleEffectKt.LifecycleStartEffect(java.lang.Object[], androidx.lifecycle.LifecycleOwner, r6.c, androidx.compose.runtime.Composer, int, int):void");
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = LifecycleResumeEffectNoParamError)
    @Composable
    public static final void LifecycleResumeEffect(@Nullable LifecycleOwner lifecycleOwner, @NotNull InterfaceC6471c interfaceC6471c, @Nullable Composer composer, int i, int i8) {
        int i9;
        Composer composerStartRestartGroup = composer.startRestartGroup(-747476210);
        int i10 = i & 1;
        if (i10 == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new C2752c(lifecycleOwner, interfaceC6471c, i, i8, 1));
                return;
            }
            return;
        }
        composerStartRestartGroup.startDefaults();
        if (i10 == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
            if ((i8 & 1) != 0) {
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            i9 = (i8 & 1) != 0 ? i & (-15) : i;
        }
        composerStartRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-747476210, i9, -1, "androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:656)");
        }
        throw new IllegalStateException(LifecycleResumeEffectNoParamError);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = LifecycleStartEffectNoParamError)
    @Composable
    public static final void LifecycleStartEffect(@Nullable LifecycleOwner lifecycleOwner, @NotNull InterfaceC6471c interfaceC6471c, @Nullable Composer composer, int i, int i8) {
        int i9;
        Composer composerStartRestartGroup = composer.startRestartGroup(-50807951);
        int i10 = i & 1;
        if (i10 == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new C2752c(lifecycleOwner, interfaceC6471c, i, i8, 0));
                return;
            }
            return;
        }
        composerStartRestartGroup.startDefaults();
        if (i10 == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
            if ((i8 & 1) != 0) {
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            i9 = (i8 & 1) != 0 ? i & (-15) : i;
        }
        composerStartRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-50807951, i9, -1, "androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:333)");
        }
        throw new IllegalStateException(LifecycleStartEffectNoParamError);
    }
}
