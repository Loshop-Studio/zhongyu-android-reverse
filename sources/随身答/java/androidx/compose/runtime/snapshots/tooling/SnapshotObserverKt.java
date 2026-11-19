package androidx.compose.runtime.snapshots.tooling;

import androidx.autofill.HintConstants;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.ExperimentalComposeRuntimeApi;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a°\u0001\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0016\b\b\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u0016\b\b\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\u000f2T\b\u0004\u0010\u0010\u001aN\u0012!\u0012\u001f\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\t\u0012!\u0012\u001f\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\r\u0012\u0004\u0012\u0002H\u00060\u0011H\u0081\b¢\u0006\u0002\u0010\u0014\u001a \u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00072\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0000\u001a\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0007H\u0000\u001aB\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nH\u0002\u001a:\u0010\u001e\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\"\u0018\u00010!H\u0001\u001aj\u0010\u001b\u001a\u001c\u0012\u0004\u0012\u00020\"\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\"\u0018\u00010!0#*\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nH\u0001\u001a\u0014\u0010$\u001a\u00020%*\u00020&2\u0006\u0010'\u001a\u00020\u0002H\u0007\" \u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0003\u0010\u0004¨\u0006("}, m13413d2 = {"observers", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Landroidx/compose/runtime/snapshots/tooling/SnapshotObserver;", "getObservers$annotations", "()V", "creatingSnapshot", "R", "Landroidx/compose/runtime/snapshots/Snapshot;", "parent", "readObserver", "Lkotlin/Function1;", "", "", "writeObserver", "readonly", "", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "(Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/snapshots/Snapshot;", "dispatchObserverOnApplied", "snapshot", "changes", "Landroidx/collection/ScatterSet;", "Landroidx/compose/runtime/snapshots/StateObject;", "dispatchObserverOnPreDispose", "mergeObservers", "a", "b", "dispatchCreatedObservers", "result", "observerMap", "", "Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;", "Lkotlin/Pair;", "observeSnapshots", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "Landroidx/compose/runtime/snapshots/Snapshot$Companion;", "snapshotObserver", "runtime_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSnapshotObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotObserver.kt\nandroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,269:1\n1894#2,2:270\n1894#2,2:298\n33#3,2:272\n33#3,2:300\n33#4,6:274\n33#4,6:280\n33#4,6:286\n33#4,6:292\n1#5:302\n*S KotlinDebug\n*F\n+ 1 SnapshotObserver.kt\nandroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt\n*L\n174#1:270,2\n176#1:298,2\n174#1:272,2\n176#1:300,2\n219#1:274,6\n250#1:280,6\n258#1:286,6\n266#1:292,6\n*E\n"})
/* loaded from: classes2.dex */
public final class SnapshotObserverKt {
    private static PersistentList<? extends SnapshotObserver> observers;

    @ExperimentalComposeRuntimeApi
    public static final <R extends Snapshot> R creatingSnapshot(Snapshot snapshot, Function1<Object, Unit> function1, Function1<Object, Unit> function12, boolean z9, Function2<? super Function1<Object, Unit>, ? super Function1<Object, Unit>, ? extends R> function2) {
        Map<SnapshotObserver, SnapshotInstanceObservers> second;
        PersistentList persistentList = observers;
        if (persistentList != null) {
            Pair<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> pairMergeObservers = mergeObservers(persistentList, snapshot, z9, function1, function12);
            SnapshotInstanceObservers first = pairMergeObservers.getFirst();
            Function1<Object, Unit> readObserver = first.getReadObserver();
            function12 = first.getWriteObserver();
            second = pairMergeObservers.getSecond();
            function1 = readObserver;
        } else {
            second = null;
        }
        R rInvoke = function2.invoke(function1, function12);
        if (persistentList != null) {
            dispatchCreatedObservers(persistentList, snapshot, rInvoke, second);
        }
        return rInvoke;
    }

    @ExperimentalComposeRuntimeApi
    public static final void dispatchCreatedObservers(PersistentList<? extends SnapshotObserver> persistentList, Snapshot snapshot, Snapshot snapshot2, Map<SnapshotObserver, SnapshotInstanceObservers> map) {
        int size = persistentList.size();
        for (int i9 = 0; i9 < size; i9++) {
            SnapshotObserver snapshotObserver = persistentList.get(i9);
            snapshotObserver.onCreated(snapshot2, snapshot, map != null ? map.get(snapshotObserver) : null);
        }
    }

    public static final void dispatchObserverOnApplied(Snapshot snapshot, ScatterSet<StateObject> scatterSet) {
        Set<? extends Object> setEmptySet;
        PersistentList<? extends SnapshotObserver> persistentList = observers;
        if (persistentList == null || persistentList.isEmpty()) {
            return;
        }
        if (scatterSet == null || (setEmptySet = ScatterSetWrapperKt.wrapIntoSet(scatterSet)) == null) {
            setEmptySet = SetsKt.emptySet();
        }
        int size = persistentList.size();
        for (int i9 = 0; i9 < size; i9++) {
            persistentList.get(i9).onApplied(snapshot, setEmptySet);
        }
    }

    public static final void dispatchObserverOnPreDispose(Snapshot snapshot) {
        PersistentList<? extends SnapshotObserver> persistentList = observers;
        if (persistentList != null) {
            int size = persistentList.size();
            for (int i9 = 0; i9 < size; i9++) {
                persistentList.get(i9).onPreDispose(snapshot);
            }
        }
    }

    @ExperimentalComposeRuntimeApi
    private static /* synthetic */ void getObservers$annotations() {
    }

    private static final Function1<Object, Unit> mergeObservers(final Function1<Object, Unit> function1, final Function1<Object, Unit> function12) {
        return (function1 == null || function12 == null) ? function1 == null ? function12 : function1 : new Function1<Object, Unit>() { // from class: androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt.mergeObservers.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                function1.invoke(obj);
                function12.invoke(obj);
            }
        };
    }

    @ExperimentalComposeRuntimeApi
    public static final ObserverHandle observeSnapshots(Snapshot.Companion companion, final SnapshotObserver snapshotObserver) {
        synchronized (SnapshotKt.getLock()) {
            try {
                PersistentList<? extends SnapshotObserver> persistentListPersistentListOf = observers;
                if (persistentListPersistentListOf == null) {
                    persistentListPersistentListOf = ExtensionsKt.persistentListOf();
                }
                observers = persistentListPersistentListOf.add((PersistentList<? extends SnapshotObserver>) snapshotObserver);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return new ObserverHandle() { // from class: androidx.compose.runtime.snapshots.tooling.a
            @Override // androidx.compose.runtime.snapshots.ObserverHandle
            public final void dispose() {
                SnapshotObserverKt.observeSnapshots$lambda$3(snapshotObserver);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeSnapshots$lambda$3(SnapshotObserver snapshotObserver) {
        synchronized (SnapshotKt.getLock()) {
            try {
                PersistentList<? extends SnapshotObserver> persistentList = observers;
                PersistentList<? extends SnapshotObserver> persistentList2 = null;
                PersistentList<? extends SnapshotObserver> persistentListRemove = persistentList != null ? persistentList.remove((PersistentList<? extends SnapshotObserver>) snapshotObserver) : null;
                if (persistentListRemove != null && !persistentListRemove.isEmpty()) {
                    persistentList2 = persistentListRemove;
                }
                observers = persistentList2;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @ExperimentalComposeRuntimeApi
    public static final Pair<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> mergeObservers(PersistentList<? extends SnapshotObserver> persistentList, Snapshot snapshot, boolean z9, Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        int size = persistentList.size();
        LinkedHashMap linkedHashMap = null;
        for (int i9 = 0; i9 < size; i9++) {
            SnapshotObserver snapshotObserver = persistentList.get(i9);
            SnapshotInstanceObservers snapshotInstanceObserversOnPreCreate = snapshotObserver.onPreCreate(snapshot, z9);
            if (snapshotInstanceObserversOnPreCreate != null) {
                function1 = mergeObservers(snapshotInstanceObserversOnPreCreate.getReadObserver(), function1);
                function12 = mergeObservers(snapshotInstanceObserversOnPreCreate.getWriteObserver(), function12);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                linkedHashMap.put(snapshotObserver, snapshotInstanceObserversOnPreCreate);
            }
        }
        return TuplesKt.m13420to(new SnapshotInstanceObservers(function1, function12), linkedHashMap);
    }
}
