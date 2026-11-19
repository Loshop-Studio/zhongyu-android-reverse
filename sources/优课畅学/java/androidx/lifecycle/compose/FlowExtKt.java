package androidx.lifecycle.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9100d;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9280q;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public final class FlowExtKt {
    @Composable
    public static final <T> State<T> collectAsStateWithLifecycle(InterfaceC9280q interfaceC9280q, LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC9100d interfaceC9100d, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        if ((i11 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i11 & 4) != 0) {
            interfaceC9100d = EmptyCoroutineContext.f17438a;
        }
        InterfaceC9100d interfaceC9100d2 = interfaceC9100d;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(743249048, i10, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:62)");
        }
        int i12 = i10 << 3;
        State<T> stateCollectAsStateWithLifecycle = collectAsStateWithLifecycle(interfaceC9280q, interfaceC9280q.getValue(), lifecycleOwner.getLifecycle(), state2, interfaceC9100d2, composer, (i10 & 14) | (i12 & 7168) | (i12 & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateCollectAsStateWithLifecycle;
    }

    @Composable
    public static final <T> State<T> collectAsStateWithLifecycle(InterfaceC9280q interfaceC9280q, Lifecycle lifecycle, Lifecycle.State state, InterfaceC9100d interfaceC9100d, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i11 & 4) != 0) {
            interfaceC9100d = EmptyCoroutineContext.f17438a;
        }
        InterfaceC9100d interfaceC9100d2 = interfaceC9100d;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1858162195, i10, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:99)");
        }
        int i12 = i10 << 3;
        State<T> stateCollectAsStateWithLifecycle = collectAsStateWithLifecycle(interfaceC9280q, interfaceC9280q.getValue(), lifecycle, state2, interfaceC9100d2, composer, (i10 & 14) | (i12 & 896) | (i12 & 7168) | (i12 & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateCollectAsStateWithLifecycle;
    }

    @Composable
    public static final <T> State<T> collectAsStateWithLifecycle(InterfaceC9266c interfaceC9266c, T t10, LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC9100d interfaceC9100d, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        if ((i11 & 4) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i11 & 8) != 0) {
            interfaceC9100d = EmptyCoroutineContext.f17438a;
        }
        InterfaceC9100d interfaceC9100d2 = interfaceC9100d;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1485997211, i10, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:138)");
        }
        State<T> stateCollectAsStateWithLifecycle = collectAsStateWithLifecycle(interfaceC9266c, t10, lifecycleOwner.getLifecycle(), state2, interfaceC9100d2, composer, (i10 & 14) | (((i10 >> 3) & 8) << 3) | (i10 & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) | (i10 & 7168) | (57344 & i10), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateCollectAsStateWithLifecycle;
    }

    @Composable
    public static final <T> State<T> collectAsStateWithLifecycle(InterfaceC9266c interfaceC9266c, T t10, Lifecycle lifecycle, Lifecycle.State state, InterfaceC9100d interfaceC9100d, Composer composer, int i10, int i11) {
        if ((i11 & 4) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i11 & 8) != 0) {
            interfaceC9100d = EmptyCoroutineContext.f17438a;
        }
        InterfaceC9100d interfaceC9100d2 = interfaceC9100d;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1977777920, i10, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:174)");
        }
        Object[] objArr = {interfaceC9266c, lifecycle, state2, interfaceC9100d2};
        boolean zChangedInstance = composer.changedInstance(lifecycle) | ((((i10 & 7168) ^ 3072) > 2048 && composer.changed(state2.ordinal())) || (i10 & 3072) == 2048) | composer.changedInstance(interfaceC9100d2) | composer.changedInstance(interfaceC9266c);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
            FlowExtKt$collectAsStateWithLifecycle$1$1 flowExtKt$collectAsStateWithLifecycle$1$1 = new FlowExtKt$collectAsStateWithLifecycle$1$1(lifecycle, state2, interfaceC9100d2, interfaceC9266c, null);
            composer.updateRememberedValue(flowExtKt$collectAsStateWithLifecycle$1$1);
            objRememberedValue = flowExtKt$collectAsStateWithLifecycle$1$1;
        }
        State<T> stateProduceState = SnapshotStateKt.produceState((Object) t10, objArr, (InterfaceC10574p) objRememberedValue, composer, (i10 >> 3) & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateProduceState;
    }
}
