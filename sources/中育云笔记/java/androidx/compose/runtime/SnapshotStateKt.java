package androidx.compose.runtime;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import androidx.compose.runtime.snapshots.StateFactoryMarker;
import java.util.Collection;
import kotlin.Pair;
import kotlin.coroutines.InterfaceC9945d;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p280od.InterfaceC10478l;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11612u;

/* loaded from: classes2.dex */
public final class SnapshotStateKt {
    @Composable
    public static final <T extends R, R> State<R> collectAsState(InterfaceC11594c interfaceC11594c, R r10, InterfaceC9945d interfaceC9945d, Composer composer, int i10, int i11) {
        return SnapshotStateKt__SnapshotFlowKt.collectAsState(interfaceC11594c, r10, interfaceC9945d, composer, i10, i11);
    }

    public static final MutableVector<DerivedStateObserver> derivedStateObservers() {
        return SnapshotStateKt__DerivedStateKt.derivedStateObservers();
    }

    @StateFactoryMarker
    public static final <T> State<T> derivedStateOf(SnapshotMutationPolicy<T> snapshotMutationPolicy, InterfaceC9529a interfaceC9529a) {
        return SnapshotStateKt__DerivedStateKt.derivedStateOf(snapshotMutationPolicy, interfaceC9529a);
    }

    public static final <T> T getValue(State<? extends T> state, Object obj, InterfaceC10478l interfaceC10478l) {
        return (T) SnapshotStateKt__SnapshotStateKt.getValue(state, obj, interfaceC10478l);
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

    public static final <R> void observeDerivedStateRecalculations(DerivedStateObserver derivedStateObserver, InterfaceC9529a interfaceC9529a) {
        SnapshotStateKt__DerivedStateKt.observeDerivedStateRecalculations(derivedStateObserver, interfaceC9529a);
    }

    @Composable
    public static final <T> State<T> produceState(T t10, InterfaceC9544p interfaceC9544p, Composer composer, int i10) {
        return SnapshotStateKt__ProduceStateKt.produceState(t10, interfaceC9544p, composer, i10);
    }

    public static final <T> SnapshotMutationPolicy<T> referentialEqualityPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy();
    }

    @Composable
    public static final <T> State<T> rememberUpdatedState(T t10, Composer composer, int i10) {
        return SnapshotStateKt__SnapshotStateKt.rememberUpdatedState(t10, composer, i10);
    }

    public static final <T> void setValue(MutableState<T> mutableState, Object obj, InterfaceC10478l interfaceC10478l, T t10) {
        SnapshotStateKt__SnapshotStateKt.setValue(mutableState, obj, interfaceC10478l, t10);
    }

    public static final <T> InterfaceC11594c snapshotFlow(InterfaceC9529a interfaceC9529a) {
        return SnapshotStateKt__SnapshotFlowKt.snapshotFlow(interfaceC9529a);
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
    public static final <T> State<T> collectAsState(InterfaceC11612u interfaceC11612u, InterfaceC9945d interfaceC9945d, Composer composer, int i10, int i11) {
        return SnapshotStateKt__SnapshotFlowKt.collectAsState(interfaceC11612u, interfaceC9945d, composer, i10, i11);
    }

    @StateFactoryMarker
    public static final <T> State<T> derivedStateOf(InterfaceC9529a interfaceC9529a) {
        return SnapshotStateKt__DerivedStateKt.derivedStateOf(interfaceC9529a);
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
    public static final <T> State<T> produceState(T t10, Object obj, InterfaceC9544p interfaceC9544p, Composer composer, int i10) {
        return SnapshotStateKt__ProduceStateKt.produceState(t10, obj, interfaceC9544p, composer, i10);
    }

    @Composable
    public static final <T> State<T> produceState(T t10, Object obj, Object obj2, InterfaceC9544p interfaceC9544p, Composer composer, int i10) {
        return SnapshotStateKt__ProduceStateKt.produceState(t10, obj, obj2, interfaceC9544p, composer, i10);
    }

    @Composable
    public static final <T> State<T> produceState(T t10, Object obj, Object obj2, Object obj3, InterfaceC9544p interfaceC9544p, Composer composer, int i10) {
        return SnapshotStateKt__ProduceStateKt.produceState(t10, obj, obj2, obj3, interfaceC9544p, composer, i10);
    }

    @Composable
    public static final <T> State<T> produceState(T t10, Object[] objArr, InterfaceC9544p interfaceC9544p, Composer composer, int i10) {
        return SnapshotStateKt__ProduceStateKt.produceState((Object) t10, objArr, interfaceC9544p, composer, i10);
    }
}
