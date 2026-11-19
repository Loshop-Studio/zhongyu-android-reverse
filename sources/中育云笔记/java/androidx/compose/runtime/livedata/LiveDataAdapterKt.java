package androidx.compose.runtime.livedata;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public final class LiveDataAdapterKt {
    @Composable
    public static final <T> State<T> observeAsState(LiveData<T> liveData, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2027206144, i10, -1, "androidx.compose.runtime.livedata.observeAsState (LiveDataAdapter.kt:39)");
        }
        State<T> stateObserveAsState = observeAsState(liveData, liveData.getValue(), composer, i10 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateObserveAsState;
    }

    @Composable
    public static final <R, T extends R> State<R> observeAsState(LiveData<T> liveData, R r10, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(411178300, i10, -1, "androidx.compose.runtime.livedata.observeAsState (LiveDataAdapter.kt:56)");
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (objRememberedValue == companion.getEmpty()) {
            if (liveData.isInitialized()) {
                r10 = liveData.getValue();
            }
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r10, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        boolean zChangedInstance = composer.changedInstance(liveData) | composer.changedInstance(lifecycleOwner);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new LiveDataAdapterKt$observeAsState$1$1(liveData, lifecycleOwner, mutableState);
            composer.updateRememberedValue(objRememberedValue2);
        }
        EffectsKt.DisposableEffect(liveData, lifecycleOwner, (InterfaceC9540l) objRememberedValue2, composer, i10 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }
}
