package androidx.lifecycle.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9945d;
import p181hd.InterfaceC9544p;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11612u;

/* loaded from: classes2.dex */
public final class FlowExtKt {
    @Composable
    public static final <T> State<T> collectAsStateWithLifecycle(InterfaceC11612u interfaceC11612u, LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC9945d interfaceC9945d, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        if ((i11 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i11 & 4) != 0) {
            interfaceC9945d = EmptyCoroutineContext.f23351c;
        }
        InterfaceC9945d interfaceC9945d2 = interfaceC9945d;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(743249048, i10, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:62)");
        }
        int i12 = i10 << 3;
        State<T> stateCollectAsStateWithLifecycle = collectAsStateWithLifecycle(interfaceC11612u, interfaceC11612u.getValue(), lifecycleOwner.getLifecycle(), state2, interfaceC9945d2, composer, (i10 & 14) | (i12 & 7168) | (i12 & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateCollectAsStateWithLifecycle;
    }

    @Composable
    public static final <T> State<T> collectAsStateWithLifecycle(InterfaceC11612u interfaceC11612u, Lifecycle lifecycle, Lifecycle.State state, InterfaceC9945d interfaceC9945d, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i11 & 4) != 0) {
            interfaceC9945d = EmptyCoroutineContext.f23351c;
        }
        InterfaceC9945d interfaceC9945d2 = interfaceC9945d;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1858162195, i10, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:99)");
        }
        int i12 = i10 << 3;
        State<T> stateCollectAsStateWithLifecycle = collectAsStateWithLifecycle(interfaceC11612u, interfaceC11612u.getValue(), lifecycle, state2, interfaceC9945d2, composer, (i10 & 14) | (i12 & 896) | (i12 & 7168) | (i12 & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateCollectAsStateWithLifecycle;
    }

    @Composable
    public static final <T> State<T> collectAsStateWithLifecycle(InterfaceC11594c interfaceC11594c, T t10, LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC9945d interfaceC9945d, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        if ((i11 & 4) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i11 & 8) != 0) {
            interfaceC9945d = EmptyCoroutineContext.f23351c;
        }
        InterfaceC9945d interfaceC9945d2 = interfaceC9945d;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1485997211, i10, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:138)");
        }
        State<T> stateCollectAsStateWithLifecycle = collectAsStateWithLifecycle(interfaceC11594c, t10, lifecycleOwner.getLifecycle(), state2, interfaceC9945d2, composer, (i10 & 14) | (((i10 >> 3) & 8) << 3) | (i10 & 112) | (i10 & 7168) | (57344 & i10), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateCollectAsStateWithLifecycle;
    }

    @Composable
    public static final <T> State<T> collectAsStateWithLifecycle(InterfaceC11594c interfaceC11594c, T t10, Lifecycle lifecycle, Lifecycle.State state, InterfaceC9945d interfaceC9945d, Composer composer, int i10, int i11) {
        if ((i11 & 4) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i11 & 8) != 0) {
            interfaceC9945d = EmptyCoroutineContext.f23351c;
        }
        InterfaceC9945d interfaceC9945d2 = interfaceC9945d;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1977777920, i10, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:174)");
        }
        Object[] objArr = {interfaceC11594c, lifecycle, state2, interfaceC9945d2};
        boolean zChangedInstance = composer.changedInstance(lifecycle) | ((((i10 & 7168) ^ 3072) > 2048 && composer.changed(state2.ordinal())) || (i10 & 3072) == 2048) | composer.changedInstance(interfaceC9945d2) | composer.changedInstance(interfaceC11594c);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
            FlowExtKt$collectAsStateWithLifecycle$1$1 flowExtKt$collectAsStateWithLifecycle$1$1 = new FlowExtKt$collectAsStateWithLifecycle$1$1(lifecycle, state2, interfaceC9945d2, interfaceC11594c, null);
            composer.updateRememberedValue(flowExtKt$collectAsStateWithLifecycle$1$1);
            objRememberedValue = flowExtKt$collectAsStateWithLifecycle$1$1;
        }
        State<T> stateProduceState = SnapshotStateKt.produceState((Object) t10, objArr, (InterfaceC9544p) objRememberedValue, composer, (i10 >> 3) & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateProduceState;
    }
}
