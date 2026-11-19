package androidx.compose.runtime;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import androidx.compose.runtime.snapshots.StateFactoryMarker;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Pair;
import kotlinx.coroutines.flow.InterfaceC5910f;
import kotlinx.coroutines.flow.InterfaceC5944m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;
import p207y6.InterfaceC6792p;

@Metadata(m5109d1 = {"androidx/compose/runtime/SnapshotStateKt__DerivedStateKt", "androidx/compose/runtime/SnapshotStateKt__ProduceStateKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotMutationPolicyKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotStateKt"}, m5111k = 4, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SnapshotStateKt {
    @Composable
    @NotNull
    public static final <T extends R, R> State<R> collectAsState(@NotNull InterfaceC5910f interfaceC5910f, R r, @Nullable InterfaceC5636h interfaceC5636h, @Nullable Composer composer, int i, int i8) {
        return SnapshotStateKt__SnapshotFlowKt.collectAsState(interfaceC5910f, r, interfaceC5636h, composer, i, i8);
    }

    @NotNull
    public static final MutableVector<DerivedStateObserver> derivedStateObservers() {
        return SnapshotStateKt__DerivedStateKt.derivedStateObservers();
    }

    @StateFactoryMarker
    @NotNull
    public static final <T> State<T> derivedStateOf(@NotNull SnapshotMutationPolicy<T> snapshotMutationPolicy, @NotNull InterfaceC6469a interfaceC6469a) {
        return SnapshotStateKt__DerivedStateKt.derivedStateOf(snapshotMutationPolicy, interfaceC6469a);
    }

    public static final <T> T getValue(@NotNull State<? extends T> state, @Nullable Object obj, @NotNull InterfaceC6792p interfaceC6792p) {
        return (T) SnapshotStateKt__SnapshotStateKt.getValue(state, obj, interfaceC6792p);
    }

    @StateFactoryMarker
    @NotNull
    public static final <T> SnapshotStateList<T> mutableStateListOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateListOf();
    }

    @StateFactoryMarker
    @NotNull
    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateMapOf();
    }

    @StateFactoryMarker
    @NotNull
    public static final <T> MutableState<T> mutableStateOf(T t8, @NotNull SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf(t8, snapshotMutationPolicy);
    }

    @StateFactoryMarker
    @NotNull
    public static final <T> SnapshotStateSet<T> mutableStateSetOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateSetOf();
    }

    @NotNull
    public static final <T> SnapshotMutationPolicy<T> neverEqualPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy();
    }

    public static final <R> void observeDerivedStateRecalculations(@NotNull DerivedStateObserver derivedStateObserver, @NotNull InterfaceC6469a interfaceC6469a) {
        SnapshotStateKt__DerivedStateKt.observeDerivedStateRecalculations(derivedStateObserver, interfaceC6469a);
    }

    @Composable
    @NotNull
    public static final <T> State<T> produceState(T t8, @Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @NotNull InterfaceC6473e interfaceC6473e, @Nullable Composer composer, int i) {
        return SnapshotStateKt__ProduceStateKt.produceState(t8, obj, obj2, obj3, interfaceC6473e, composer, i);
    }

    @NotNull
    public static final <T> SnapshotMutationPolicy<T> referentialEqualityPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy();
    }

    @Composable
    @NotNull
    public static final <T> State<T> rememberUpdatedState(T t8, @Nullable Composer composer, int i) {
        return SnapshotStateKt__SnapshotStateKt.rememberUpdatedState(t8, composer, i);
    }

    public static final <T> void setValue(@NotNull MutableState<T> mutableState, @Nullable Object obj, @NotNull InterfaceC6792p interfaceC6792p, T t8) {
        SnapshotStateKt__SnapshotStateKt.setValue(mutableState, obj, interfaceC6792p, t8);
    }

    @NotNull
    public static final <T> InterfaceC5910f snapshotFlow(@NotNull InterfaceC6469a interfaceC6469a) {
        return SnapshotStateKt__SnapshotFlowKt.snapshotFlow(interfaceC6469a);
    }

    @NotNull
    public static final <T> SnapshotMutationPolicy<T> structuralEqualityPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy();
    }

    @NotNull
    public static final <T> SnapshotStateList<T> toMutableStateList(@NotNull Collection<? extends T> collection) {
        return SnapshotStateKt__SnapshotStateKt.toMutableStateList(collection);
    }

    @NotNull
    public static final <K, V> SnapshotStateMap<K, V> toMutableStateMap(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        return SnapshotStateKt__SnapshotStateKt.toMutableStateMap(iterable);
    }

    @Composable
    @NotNull
    public static final <T> State<T> collectAsState(@NotNull InterfaceC5944m0 interfaceC5944m0, @Nullable InterfaceC5636h interfaceC5636h, @Nullable Composer composer, int i, int i8) {
        return SnapshotStateKt__SnapshotFlowKt.collectAsState(interfaceC5944m0, interfaceC5636h, composer, i, i8);
    }

    @StateFactoryMarker
    @NotNull
    public static final <T> State<T> derivedStateOf(@NotNull InterfaceC6469a interfaceC6469a) {
        return SnapshotStateKt__DerivedStateKt.derivedStateOf(interfaceC6469a);
    }

    @StateFactoryMarker
    @NotNull
    public static final <T> SnapshotStateList<T> mutableStateListOf(@NotNull T... tArr) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateListOf(tArr);
    }

    @StateFactoryMarker
    @NotNull
    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf(@NotNull Pair<? extends K, ? extends V>... pairArr) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateMapOf(pairArr);
    }

    @StateFactoryMarker
    @NotNull
    public static final <T> SnapshotStateSet<T> mutableStateSetOf(@NotNull T... tArr) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateSetOf(tArr);
    }

    @Composable
    @NotNull
    public static final <T> State<T> produceState(T t8, @Nullable Object obj, @Nullable Object obj2, @NotNull InterfaceC6473e interfaceC6473e, @Nullable Composer composer, int i) {
        return SnapshotStateKt__ProduceStateKt.produceState(t8, obj, obj2, interfaceC6473e, composer, i);
    }

    @Composable
    @NotNull
    public static final <T> State<T> produceState(T t8, @Nullable Object obj, @NotNull InterfaceC6473e interfaceC6473e, @Nullable Composer composer, int i) {
        return SnapshotStateKt__ProduceStateKt.produceState(t8, obj, interfaceC6473e, composer, i);
    }

    @Composable
    @NotNull
    public static final <T> State<T> produceState(T t8, @NotNull InterfaceC6473e interfaceC6473e, @Nullable Composer composer, int i) {
        return SnapshotStateKt__ProduceStateKt.produceState(t8, interfaceC6473e, composer, i);
    }

    @Composable
    @NotNull
    public static final <T> State<T> produceState(T t8, @NotNull Object[] objArr, @NotNull InterfaceC6473e interfaceC6473e, @Nullable Composer composer, int i) {
        return SnapshotStateKt__ProduceStateKt.produceState((Object) t8, objArr, interfaceC6473e, composer, i);
    }
}
