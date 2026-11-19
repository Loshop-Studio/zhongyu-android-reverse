package androidx.compose.runtime.snapshots.tooling;

import androidx.collection.ScatterSet;
import androidx.compose.runtime.ExperimentalComposeRuntimeApi;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.AbstractC10776g;
import p309qc.C10786q;
import p325rc.AbstractC10983y0;

/* loaded from: classes2.dex */
public final class SnapshotObserverKt {
    private static PersistentList<? extends SnapshotObserver> observers;

    @ExperimentalComposeRuntimeApi
    public static final <R extends Snapshot> R creatingSnapshot(Snapshot snapshot, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, boolean z10, InterfaceC9544p interfaceC9544p) {
        Map map;
        PersistentList persistentList = observers;
        if (persistentList != null) {
            Pair<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> pairMergeObservers = mergeObservers(persistentList, snapshot, z10, interfaceC9540l, interfaceC9540l2);
            SnapshotInstanceObservers snapshotInstanceObservers = (SnapshotInstanceObservers) pairMergeObservers.m20051f();
            InterfaceC9540l readObserver = snapshotInstanceObservers.getReadObserver();
            interfaceC9540l2 = snapshotInstanceObservers.getWriteObserver();
            map = (Map) pairMergeObservers.m20052g();
            interfaceC9540l = readObserver;
        } else {
            map = null;
        }
        R r10 = (R) interfaceC9544p.invoke(interfaceC9540l, interfaceC9540l2);
        if (persistentList != null) {
            dispatchCreatedObservers(persistentList, snapshot, r10, map);
        }
        return r10;
    }

    @ExperimentalComposeRuntimeApi
    public static final void dispatchCreatedObservers(PersistentList<? extends SnapshotObserver> persistentList, Snapshot snapshot, Snapshot snapshot2, Map<SnapshotObserver, SnapshotInstanceObservers> map) {
        int size = persistentList.size();
        for (int i10 = 0; i10 < size; i10++) {
            SnapshotObserver snapshotObserver = persistentList.get(i10);
            snapshotObserver.onCreated(snapshot2, snapshot, map != null ? map.get(snapshotObserver) : null);
        }
    }

    public static final void dispatchObserverOnApplied(Snapshot snapshot, ScatterSet<StateObject> scatterSet) {
        Set<? extends Object> setM24160f;
        PersistentList<? extends SnapshotObserver> persistentList = observers;
        if (persistentList == null || persistentList.isEmpty()) {
            return;
        }
        if (scatterSet == null || (setM24160f = ScatterSetWrapperKt.wrapIntoSet(scatterSet)) == null) {
            setM24160f = AbstractC10983y0.m24160f();
        }
        int size = persistentList.size();
        for (int i10 = 0; i10 < size; i10++) {
            persistentList.get(i10).onApplied(snapshot, setM24160f);
        }
    }

    public static final void dispatchObserverOnPreDispose(Snapshot snapshot) {
        PersistentList<? extends SnapshotObserver> persistentList = observers;
        if (persistentList != null) {
            int size = persistentList.size();
            for (int i10 = 0; i10 < size; i10++) {
                persistentList.get(i10).onPreDispose(snapshot);
            }
        }
    }

    @ExperimentalComposeRuntimeApi
    private static /* synthetic */ void getObservers$annotations() {
    }

    private static final InterfaceC9540l mergeObservers(final InterfaceC9540l interfaceC9540l, final InterfaceC9540l interfaceC9540l2) {
        return (interfaceC9540l == null || interfaceC9540l2 == null) ? interfaceC9540l == null ? interfaceC9540l2 : interfaceC9540l : new InterfaceC9540l() { // from class: androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt.mergeObservers.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m30445invoke(obj);
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m30445invoke(Object obj) {
                interfaceC9540l.invoke(obj);
                interfaceC9540l2.invoke(obj);
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
                C10786q c10786q = C10786q.f26013a;
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
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @ExperimentalComposeRuntimeApi
    public static final Pair<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> mergeObservers(PersistentList<? extends SnapshotObserver> persistentList, Snapshot snapshot, boolean z10, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
        int size = persistentList.size();
        LinkedHashMap linkedHashMap = null;
        for (int i10 = 0; i10 < size; i10++) {
            SnapshotObserver snapshotObserver = persistentList.get(i10);
            SnapshotInstanceObservers snapshotInstanceObserversOnPreCreate = snapshotObserver.onPreCreate(snapshot, z10);
            if (snapshotInstanceObserversOnPreCreate != null) {
                interfaceC9540l = mergeObservers(snapshotInstanceObserversOnPreCreate.getReadObserver(), interfaceC9540l);
                interfaceC9540l2 = mergeObservers(snapshotInstanceObserversOnPreCreate.getWriteObserver(), interfaceC9540l2);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                linkedHashMap.put(snapshotObserver, snapshotInstanceObserversOnPreCreate);
            }
        }
        return AbstractC10776g.m22975a(new SnapshotInstanceObservers(interfaceC9540l, interfaceC9540l2), linkedHashMap);
    }
}
