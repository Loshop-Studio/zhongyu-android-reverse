package androidx.compose.runtime.snapshots.tooling;

import androidx.autofill.HintConstants;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.ExperimentalComposeRuntimeApi;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.snapshots.C2071a;
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
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a²\u0001\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0016\b\b\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0016\b\b\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u000e2T\b\u0004\u0010\u0013\u001aN\u0012!\u0012\u001f\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\f\u0012!\u0012\u001f\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00028\u00000\u0010H\u0081\b¢\u0006\u0004\b\u0014\u0010\u0015\u001aq\u0010\u001a\u001a\u001c\u0012\u0004\u0012\u00020\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00190\u0017*\b\u0012\u0004\u0012\u00020\u00010\u00162\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001aI\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001e\u001aA\u0010!\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00010\u00162\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0019H\u0001¢\u0006\u0004\b!\u0010\"\u001a\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u0006H\u0000¢\u0006\u0004\b$\u0010%\u001a'\u0010)\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u00062\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&H\u0000¢\u0006\u0004\b)\u0010*\"$\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b+\u0010,\u0012\u0004\b-\u0010.¨\u0006/"}, m5110d2 = {"Landroidx/compose/runtime/snapshots/Snapshot$Companion;", "Landroidx/compose/runtime/snapshots/tooling/SnapshotObserver;", "snapshotObserver", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "observeSnapshots", "(Landroidx/compose/runtime/snapshots/Snapshot$Companion;Landroidx/compose/runtime/snapshots/tooling/SnapshotObserver;)Landroidx/compose/runtime/snapshots/ObserverHandle;", "Landroidx/compose/runtime/snapshots/Snapshot;", "R", "parent", "Lkotlin/Function1;", "", "Ld6/s;", "readObserver", "writeObserver", "", "readonly", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "block", "creatingSnapshot", "(Landroidx/compose/runtime/snapshots/Snapshot;Lr6/c;Lr6/c;ZLr6/e;)Landroidx/compose/runtime/snapshots/Snapshot;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Lkotlin/Pair;", "Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;", "", "mergeObservers", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Landroidx/compose/runtime/snapshots/Snapshot;ZLr6/c;Lr6/c;)Lkotlin/Pair;", "a", "b", "(Lr6/c;Lr6/c;)Lr6/c;", "result", "observerMap", "dispatchCreatedObservers", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Ljava/util/Map;)V", "snapshot", "dispatchObserverOnPreDispose", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "Landroidx/collection/ScatterSet;", "Landroidx/compose/runtime/snapshots/StateObject;", "changes", "dispatchObserverOnApplied", "(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/collection/ScatterSet;)V", "observers", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "getObservers$annotations", "()V", "runtime_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSnapshotObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotObserver.kt\nandroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,269:1\n1894#2,2:270\n1894#2,2:298\n33#3,2:272\n33#3,2:300\n33#4,6:274\n33#4,6:280\n33#4,6:286\n33#4,6:292\n1#5:302\n*S KotlinDebug\n*F\n+ 1 SnapshotObserver.kt\nandroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt\n*L\n174#1:270,2\n176#1:298,2\n174#1:272,2\n176#1:300,2\n219#1:274,6\n250#1:280,6\n258#1:286,6\n266#1:292,6\n*E\n"})
/* loaded from: classes.dex */
public final class SnapshotObserverKt {

    @Nullable
    private static PersistentList<? extends SnapshotObserver> observers;

    @ExperimentalComposeRuntimeApi
    @NotNull
    public static final <R extends Snapshot> R creatingSnapshot(@Nullable Snapshot snapshot, @Nullable InterfaceC6471c interfaceC6471c, @Nullable InterfaceC6471c interfaceC6471c2, boolean z8, @NotNull InterfaceC6473e interfaceC6473e) {
        Map<SnapshotObserver, SnapshotInstanceObservers> second;
        PersistentList persistentList = observers;
        if (persistentList != null) {
            Pair<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> pairMergeObservers = mergeObservers(persistentList, snapshot, z8, interfaceC6471c, interfaceC6471c2);
            SnapshotInstanceObservers first = pairMergeObservers.getFirst();
            InterfaceC6471c readObserver = first.getReadObserver();
            interfaceC6471c2 = first.getWriteObserver();
            second = pairMergeObservers.getSecond();
            interfaceC6471c = readObserver;
        } else {
            second = null;
        }
        R r = (R) interfaceC6473e.invoke(interfaceC6471c, interfaceC6471c2);
        if (persistentList != null) {
            dispatchCreatedObservers(persistentList, snapshot, r, second);
        }
        return r;
    }

    @ExperimentalComposeRuntimeApi
    public static final void dispatchCreatedObservers(@NotNull PersistentList<? extends SnapshotObserver> persistentList, @Nullable Snapshot snapshot, @NotNull Snapshot snapshot2, @Nullable Map<SnapshotObserver, SnapshotInstanceObservers> map) {
        int size = persistentList.size();
        for (int i = 0; i < size; i++) {
            SnapshotObserver snapshotObserver = persistentList.get(i);
            snapshotObserver.onCreated(snapshot2, snapshot, map != null ? map.get(snapshotObserver) : null);
        }
    }

    public static final void dispatchObserverOnApplied(@NotNull Snapshot snapshot, @Nullable ScatterSet<StateObject> scatterSet) {
        Set<? extends Object> setWrapIntoSet;
        PersistentList<? extends SnapshotObserver> persistentList = observers;
        if (persistentList == null || persistentList.isEmpty()) {
            return;
        }
        if (scatterSet == null || (setWrapIntoSet = ScatterSetWrapperKt.wrapIntoSet(scatterSet)) == null) {
            setWrapIntoSet = EmptySet.INSTANCE;
        }
        int size = persistentList.size();
        for (int i = 0; i < size; i++) {
            persistentList.get(i).onApplied(snapshot, setWrapIntoSet);
        }
    }

    public static final void dispatchObserverOnPreDispose(@NotNull Snapshot snapshot) {
        PersistentList<? extends SnapshotObserver> persistentList = observers;
        if (persistentList != null) {
            int size = persistentList.size();
            for (int i = 0; i < size; i++) {
                persistentList.get(i).onPreDispose(snapshot);
            }
        }
    }

    @ExperimentalComposeRuntimeApi
    private static /* synthetic */ void getObservers$annotations() {
    }

    private static final InterfaceC6471c mergeObservers(final InterfaceC6471c interfaceC6471c, final InterfaceC6471c interfaceC6471c2) {
        return (interfaceC6471c == null || interfaceC6471c2 == null) ? interfaceC6471c == null ? interfaceC6471c2 : interfaceC6471c : new InterfaceC6471c() { // from class: androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt.mergeObservers.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m10249invoke(obj);
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m10249invoke(Object obj) {
                interfaceC6471c.invoke(obj);
                interfaceC6471c2.invoke(obj);
            }
        };
    }

    @ExperimentalComposeRuntimeApi
    @NotNull
    public static final ObserverHandle observeSnapshots(@NotNull Snapshot.Companion companion, @NotNull SnapshotObserver snapshotObserver) {
        synchronized (SnapshotKt.getLock()) {
            try {
                PersistentList<? extends SnapshotObserver> persistentListPersistentListOf = observers;
                if (persistentListPersistentListOf == null) {
                    persistentListPersistentListOf = ExtensionsKt.persistentListOf();
                }
                observers = persistentListPersistentListOf.add((PersistentList<? extends SnapshotObserver>) snapshotObserver);
            } catch (Throwable th) {
                throw th;
            }
        }
        return new C2071a(snapshotObserver, 2);
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
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @ExperimentalComposeRuntimeApi
    @NotNull
    public static final Pair<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> mergeObservers(@NotNull PersistentList<? extends SnapshotObserver> persistentList, @Nullable Snapshot snapshot, boolean z8, @Nullable InterfaceC6471c interfaceC6471c, @Nullable InterfaceC6471c interfaceC6471c2) {
        int size = persistentList.size();
        LinkedHashMap linkedHashMap = null;
        for (int i = 0; i < size; i++) {
            SnapshotObserver snapshotObserver = persistentList.get(i);
            SnapshotInstanceObservers snapshotInstanceObserversOnPreCreate = snapshotObserver.onPreCreate(snapshot, z8);
            if (snapshotInstanceObserversOnPreCreate != null) {
                interfaceC6471c = mergeObservers(snapshotInstanceObserversOnPreCreate.getReadObserver(), interfaceC6471c);
                interfaceC6471c2 = mergeObservers(snapshotInstanceObserversOnPreCreate.getWriteObserver(), interfaceC6471c2);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                linkedHashMap.put(snapshotObserver, snapshotInstanceObserversOnPreCreate);
            }
        }
        return new Pair<>(new SnapshotInstanceObservers(interfaceC6471c, interfaceC6471c2), linkedHashMap);
    }
}
