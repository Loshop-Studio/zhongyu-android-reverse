package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import androidx.compose.runtime.snapshots.StateFactoryMarker;
import java.util.Collection;
import kotlin.Pair;
import kotlin.collections.AbstractC9925a;
import p280od.InterfaceC10478l;
import p325rc.AbstractC10968r;

/* loaded from: classes2.dex */
final /* synthetic */ class SnapshotStateKt__SnapshotStateKt {
    public static final <T> T getValue(State<? extends T> state, Object obj, InterfaceC10478l interfaceC10478l) {
        return state.getValue();
    }

    @StateFactoryMarker
    public static final <T> SnapshotStateList<T> mutableStateListOf() {
        return new SnapshotStateList<>();
    }

    @StateFactoryMarker
    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf() {
        return new SnapshotStateMap<>();
    }

    @StateFactoryMarker
    public static final <T> MutableState<T> mutableStateOf(T t10, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        return SnapshotState_androidKt.createSnapshotMutableState(t10, snapshotMutationPolicy);
    }

    public static /* synthetic */ MutableState mutableStateOf$default(Object obj, SnapshotMutationPolicy snapshotMutationPolicy, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            snapshotMutationPolicy = SnapshotStateKt.structuralEqualityPolicy();
        }
        return SnapshotStateKt.mutableStateOf(obj, snapshotMutationPolicy);
    }

    @StateFactoryMarker
    public static final <T> SnapshotStateSet<T> mutableStateSetOf() {
        return new SnapshotStateSet<>();
    }

    @Composable
    public static final <T> State<T> rememberUpdatedState(T t10, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1058319986, i10, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:329)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = mutableStateOf$default(t10, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        mutableState.setValue(t10);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }

    public static final <T> void setValue(MutableState<T> mutableState, Object obj, InterfaceC10478l interfaceC10478l, T t10) {
        mutableState.setValue(t10);
    }

    public static final <T> SnapshotStateList<T> toMutableStateList(Collection<? extends T> collection) {
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(collection);
        return snapshotStateList;
    }

    public static final <K, V> SnapshotStateMap<K, V> toMutableStateMap(Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        SnapshotStateMap<K, V> snapshotStateMap = new SnapshotStateMap<>();
        snapshotStateMap.putAll(AbstractC9925a.m20099s(iterable));
        return snapshotStateMap;
    }

    @StateFactoryMarker
    public static final <T> SnapshotStateList<T> mutableStateListOf(T... tArr) {
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(AbstractC10968r.m24097p1(tArr));
        return snapshotStateList;
    }

    @StateFactoryMarker
    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf(Pair<? extends K, ? extends V>... pairArr) {
        SnapshotStateMap<K, V> snapshotStateMap = new SnapshotStateMap<>();
        snapshotStateMap.putAll(AbstractC9925a.m20102v(pairArr));
        return snapshotStateMap;
    }

    @StateFactoryMarker
    public static final <T> SnapshotStateSet<T> mutableStateSetOf(T... tArr) {
        SnapshotStateSet<T> snapshotStateSet = new SnapshotStateSet<>();
        snapshotStateSet.addAll(AbstractC10968r.m24115y1(tArr));
        return snapshotStateSet;
    }
}
