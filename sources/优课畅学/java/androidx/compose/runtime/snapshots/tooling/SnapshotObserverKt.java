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
import p123h7.AbstractC8726f;
import p123h7.C8736p;
import p134i7.AbstractC8812w0;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public final class SnapshotObserverKt {
    private static PersistentList<? extends SnapshotObserver> observers;

    @ExperimentalComposeRuntimeApi
    public static final <R extends Snapshot> R creatingSnapshot(Snapshot snapshot, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, boolean z10, InterfaceC10574p interfaceC10574p) {
        Map map;
        PersistentList persistentList = observers;
        if (persistentList != null) {
            Pair<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> pairMergeObservers = mergeObservers(persistentList, snapshot, z10, interfaceC10570l, interfaceC10570l2);
            SnapshotInstanceObservers snapshotInstanceObservers = (SnapshotInstanceObservers) pairMergeObservers.m15906e();
            InterfaceC10570l readObserver = snapshotInstanceObservers.getReadObserver();
            interfaceC10570l2 = snapshotInstanceObservers.getWriteObserver();
            map = (Map) pairMergeObservers.m15907g();
            interfaceC10570l = readObserver;
        } else {
            map = null;
        }
        R r10 = (R) interfaceC10574p.invoke(interfaceC10570l, interfaceC10570l2);
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
        Set<? extends Object> setM14788f;
        PersistentList<? extends SnapshotObserver> persistentList = observers;
        if (persistentList == null || persistentList.isEmpty()) {
            return;
        }
        if (scatterSet == null || (setM14788f = ScatterSetWrapperKt.wrapIntoSet(scatterSet)) == null) {
            setM14788f = AbstractC8812w0.m14788f();
        }
        int size = persistentList.size();
        for (int i10 = 0; i10 < size; i10++) {
            persistentList.get(i10).onApplied(snapshot, setM14788f);
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

    private static final InterfaceC10570l mergeObservers(final InterfaceC10570l interfaceC10570l, final InterfaceC10570l interfaceC10570l2) {
        return (interfaceC10570l == null || interfaceC10570l2 == null) ? interfaceC10570l == null ? interfaceC10570l2 : interfaceC10570l : new InterfaceC10570l() { // from class: androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt.mergeObservers.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m23843invoke(obj);
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m23843invoke(Object obj) {
                interfaceC10570l.invoke(obj);
                interfaceC10570l2.invoke(obj);
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
                C8736p c8736p = C8736p.f16368a;
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
                C8736p c8736p = C8736p.f16368a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @ExperimentalComposeRuntimeApi
    public static final Pair<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> mergeObservers(PersistentList<? extends SnapshotObserver> persistentList, Snapshot snapshot, boolean z10, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2) {
        int size = persistentList.size();
        LinkedHashMap linkedHashMap = null;
        for (int i10 = 0; i10 < size; i10++) {
            SnapshotObserver snapshotObserver = persistentList.get(i10);
            SnapshotInstanceObservers snapshotInstanceObserversOnPreCreate = snapshotObserver.onPreCreate(snapshot, z10);
            if (snapshotInstanceObserversOnPreCreate != null) {
                interfaceC10570l = mergeObservers(snapshotInstanceObserversOnPreCreate.getReadObserver(), interfaceC10570l);
                interfaceC10570l2 = mergeObservers(snapshotInstanceObserversOnPreCreate.getWriteObserver(), interfaceC10570l2);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                linkedHashMap.put(snapshotObserver, snapshotInstanceObserversOnPreCreate);
            }
        }
        return AbstractC8726f.m14230a(new SnapshotInstanceObservers(interfaceC10570l, interfaceC10570l2), linkedHashMap);
    }
}
