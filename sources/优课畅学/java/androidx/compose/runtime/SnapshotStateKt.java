package androidx.compose.runtime;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import androidx.compose.runtime.snapshots.StateFactoryMarker;
import java.util.Collection;
import kotlin.Pair;
import kotlin.coroutines.InterfaceC9100d;
import p089e8.InterfaceC8383k;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9280q;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public final class SnapshotStateKt {
    @Composable
    public static final <T extends R, R> State<R> collectAsState(InterfaceC9266c interfaceC9266c, R r10, InterfaceC9100d interfaceC9100d, Composer composer, int i10, int i11) {
        return SnapshotStateKt__SnapshotFlowKt.collectAsState(interfaceC9266c, r10, interfaceC9100d, composer, i10, i11);
    }

    public static final MutableVector<DerivedStateObserver> derivedStateObservers() {
        return SnapshotStateKt__DerivedStateKt.derivedStateObservers();
    }

    @StateFactoryMarker
    public static final <T> State<T> derivedStateOf(SnapshotMutationPolicy<T> snapshotMutationPolicy, InterfaceC10559a interfaceC10559a) {
        return SnapshotStateKt__DerivedStateKt.derivedStateOf(snapshotMutationPolicy, interfaceC10559a);
    }

    public static final <T> T getValue(State<? extends T> state, Object obj, InterfaceC8383k interfaceC8383k) {
        return (T) SnapshotStateKt__SnapshotStateKt.getValue(state, obj, interfaceC8383k);
    }

    @StateFactoryMarker
    public static final <T> SnapshotStateList<T> mutableStateListOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateListOf();
    }

    @StateFactoryMarker
    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateMapOf();
    }

    @StateFactoryMarker
    public static final <T> MutableState<T> mutableStateOf(T t10, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf(t10, snapshotMutationPolicy);
    }

    @StateFactoryMarker
    public static final <T> SnapshotStateSet<T> mutableStateSetOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateSetOf();
    }

    public static final <T> SnapshotMutationPolicy<T> neverEqualPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy();
    }

    public static final <R> void observeDerivedStateRecalculations(DerivedStateObserver derivedStateObserver, InterfaceC10559a interfaceC10559a) {
        SnapshotStateKt__DerivedStateKt.observeDerivedStateRecalculations(derivedStateObserver, interfaceC10559a);
    }

    @Composable
    public static final <T> State<T> produceState(T t10, Object obj, Object obj2, Object obj3, InterfaceC10574p interfaceC10574p, Composer composer, int i10) {
        return SnapshotStateKt__ProduceStateKt.produceState(t10, obj, obj2, obj3, interfaceC10574p, composer, i10);
    }

    public static final <T> SnapshotMutationPolicy<T> referentialEqualityPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy();
    }

    @Composable
    public static final <T> State<T> rememberUpdatedState(T t10, Composer composer, int i10) {
        return SnapshotStateKt__SnapshotStateKt.rememberUpdatedState(t10, composer, i10);
    }

    public static final <T> void setValue(MutableState<T> mutableState, Object obj, InterfaceC8383k interfaceC8383k, T t10) {
        SnapshotStateKt__SnapshotStateKt.setValue(mutableState, obj, interfaceC8383k, t10);
    }

    public static final <T> InterfaceC9266c snapshotFlow(InterfaceC10559a interfaceC10559a) {
        return SnapshotStateKt__SnapshotFlowKt.snapshotFlow(interfaceC10559a);
    }

    public static final <T> SnapshotMutationPolicy<T> structuralEqualityPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy();
    }

    public static final <T> SnapshotStateList<T> toMutableStateList(Collection<? extends T> collection) {
        return SnapshotStateKt__SnapshotStateKt.toMutableStateList(collection);
    }

    public static final <K, V> SnapshotStateMap<K, V> toMutableStateMap(Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        return SnapshotStateKt__SnapshotStateKt.toMutableStateMap(iterable);
    }

    @Composable
    public static final <T> State<T> collectAsState(InterfaceC9280q interfaceC9280q, InterfaceC9100d interfaceC9100d, Composer composer, int i10, int i11) {
        return SnapshotStateKt__SnapshotFlowKt.collectAsState(interfaceC9280q, interfaceC9100d, composer, i10, i11);
    }

    @StateFactoryMarker
    public static final <T> State<T> derivedStateOf(InterfaceC10559a interfaceC10559a) {
        return SnapshotStateKt__DerivedStateKt.derivedStateOf(interfaceC10559a);
    }

    @StateFactoryMarker
    public static final <T> SnapshotStateList<T> mutableStateListOf(T... tArr) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateListOf(tArr);
    }

    @StateFactoryMarker
    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf(Pair<? extends K, ? extends V>... pairArr) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateMapOf(pairArr);
    }

    @StateFactoryMarker
    public static final <T> SnapshotStateSet<T> mutableStateSetOf(T... tArr) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateSetOf(tArr);
    }

    @Composable
    public static final <T> State<T> produceState(T t10, Object obj, Object obj2, InterfaceC10574p interfaceC10574p, Composer composer, int i10) {
        return SnapshotStateKt__ProduceStateKt.produceState(t10, obj, obj2, interfaceC10574p, composer, i10);
    }

    @Composable
    public static final <T> State<T> produceState(T t10, Object obj, InterfaceC10574p interfaceC10574p, Composer composer, int i10) {
        return SnapshotStateKt__ProduceStateKt.produceState(t10, obj, interfaceC10574p, composer, i10);
    }

    @Composable
    public static final <T> State<T> produceState(T t10, InterfaceC10574p interfaceC10574p, Composer composer, int i10) {
        return SnapshotStateKt__ProduceStateKt.produceState(t10, interfaceC10574p, composer, i10);
    }

    @Composable
    public static final <T> State<T> produceState(T t10, Object[] objArr, InterfaceC10574p interfaceC10574p, Composer composer, int i10) {
        return SnapshotStateKt__ProduceStateKt.produceState((Object) t10, objArr, interfaceC10574p, composer, i10);
    }
}
