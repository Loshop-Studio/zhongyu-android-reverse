package androidx.compose.runtime;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import androidx.compose.runtime.snapshots.StateFactoryMarker;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(m13557d1 = {"androidx/compose/runtime/SnapshotStateKt__DerivedStateKt", "androidx/compose/runtime/SnapshotStateKt__ProduceStateKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotMutationPolicyKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotStateKt"}, m13559k = 4, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class SnapshotStateKt {
    @Composable
    public static final <T extends R, R> State<R> collectAsState(Flow<? extends T> flow, R r10, CoroutineContext coroutineContext, Composer composer, int i10, int i11) {
        return SnapshotStateKt__SnapshotFlowKt.collectAsState(flow, r10, coroutineContext, composer, i10, i11);
    }

    public static final MutableVector<DerivedStateObserver> derivedStateObservers() {
        return SnapshotStateKt__DerivedStateKt.derivedStateObservers();
    }

    @StateFactoryMarker
    public static final <T> State<T> derivedStateOf(SnapshotMutationPolicy<T> snapshotMutationPolicy, Function0<? extends T> function0) {
        return SnapshotStateKt__DerivedStateKt.derivedStateOf(snapshotMutationPolicy, function0);
    }

    public static final <T> T getValue(State<? extends T> state, Object obj, KProperty<?> kProperty) {
        return (T) SnapshotStateKt__SnapshotStateKt.getValue(state, obj, kProperty);
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

    public static final <R> void observeDerivedStateRecalculations(DerivedStateObserver derivedStateObserver, Function0<? extends R> function0) {
        SnapshotStateKt__DerivedStateKt.observeDerivedStateRecalculations(derivedStateObserver, function0);
    }

    @Composable
    public static final <T> State<T> produceState(T t10, Object obj, Object obj2, Object obj3, Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Composer composer, int i10) {
        return SnapshotStateKt__ProduceStateKt.produceState(t10, obj, obj2, obj3, function2, composer, i10);
    }

    public static final <T> SnapshotMutationPolicy<T> referentialEqualityPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy();
    }

    @Composable
    public static final <T> State<T> rememberUpdatedState(T t10, Composer composer, int i10) {
        return SnapshotStateKt__SnapshotStateKt.rememberUpdatedState(t10, composer, i10);
    }

    public static final <T> void setValue(MutableState<T> mutableState, Object obj, KProperty<?> kProperty, T t10) {
        SnapshotStateKt__SnapshotStateKt.setValue(mutableState, obj, kProperty, t10);
    }

    public static final <T> Flow<T> snapshotFlow(Function0<? extends T> function0) {
        return SnapshotStateKt__SnapshotFlowKt.snapshotFlow(function0);
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
    public static final <T> State<T> collectAsState(StateFlow<? extends T> stateFlow, CoroutineContext coroutineContext, Composer composer, int i10, int i11) {
        return SnapshotStateKt__SnapshotFlowKt.collectAsState(stateFlow, coroutineContext, composer, i10, i11);
    }

    @StateFactoryMarker
    public static final <T> State<T> derivedStateOf(Function0<? extends T> function0) {
        return SnapshotStateKt__DerivedStateKt.derivedStateOf(function0);
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
    public static final <T> State<T> produceState(T t10, Object obj, Object obj2, Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Composer composer, int i10) {
        return SnapshotStateKt__ProduceStateKt.produceState(t10, obj, obj2, function2, composer, i10);
    }

    @Composable
    public static final <T> State<T> produceState(T t10, Object obj, Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Composer composer, int i10) {
        return SnapshotStateKt__ProduceStateKt.produceState(t10, obj, function2, composer, i10);
    }

    @Composable
    public static final <T> State<T> produceState(T t10, Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Composer composer, int i10) {
        return SnapshotStateKt__ProduceStateKt.produceState(t10, function2, composer, i10);
    }

    @Composable
    public static final <T> State<T> produceState(T t10, Object[] objArr, Function2<? super ProduceStateScope<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Composer composer, int i10) {
        return SnapshotStateKt__ProduceStateKt.produceState((Object) t10, objArr, (Function2) function2, composer, i10);
    }
}
