package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.internal.WeakReference;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9977s;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p325rc.AbstractC10978w;

/* loaded from: classes2.dex */
public final class SnapshotKt {
    private static final long INVALID_SNAPSHOT = 0;
    private static List<? extends InterfaceC9544p> applyObservers;
    private static final SnapshotWeakSet<StateObject> extraStateObjects;
    private static final GlobalSnapshot globalSnapshot;
    private static List<? extends InterfaceC9540l> globalWriteObservers;
    private static long nextSnapshotId;
    private static SnapshotIdSet openSnapshots;
    private static AtomicInt pendingApplyObserverCount;
    private static final SnapshotDoubleIndexHeap pinningTable;
    private static final Snapshot snapshotInitializer;
    private static final InterfaceC9540l emptyLambda = new InterfaceC9540l() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$emptyLambda$1
        public final void invoke(SnapshotIdSet snapshotIdSet) {
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SnapshotIdSet) obj);
            return C10786q.f26013a;
        }
    };
    private static final SnapshotThreadLocal<Snapshot> threadSnapshot = new SnapshotThreadLocal<>();
    private static final Object lock = new Object();

    static {
        SnapshotIdSet.Companion companion = SnapshotIdSet.Companion;
        openSnapshots = companion.getEMPTY();
        nextSnapshotId = SnapshotId_jvmKt.toSnapshotId(1) + 1;
        pinningTable = new SnapshotDoubleIndexHeap();
        extraStateObjects = new SnapshotWeakSet<>();
        applyObservers = AbstractC10978w.m24136n();
        globalWriteObservers = AbstractC10978w.m24136n();
        long j10 = nextSnapshotId;
        nextSnapshotId = 1 + j10;
        GlobalSnapshot globalSnapshot2 = new GlobalSnapshot(j10, companion.getEMPTY());
        openSnapshots = openSnapshots.set(globalSnapshot2.getSnapshotId());
        globalSnapshot = globalSnapshot2;
        snapshotInitializer = globalSnapshot2;
        pendingApplyObserverCount = new AtomicInt(0);
    }

    public static final SnapshotIdSet addRange(SnapshotIdSet snapshotIdSet, long j10, long j11) {
        while (j10 < j11) {
            snapshotIdSet = snapshotIdSet.set(j10);
            j10++;
        }
        return snapshotIdSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> T advanceGlobalSnapshot(p181hd.InterfaceC9540l r15) {
        /*
            androidx.compose.runtime.snapshots.GlobalSnapshot r0 = androidx.compose.runtime.snapshots.SnapshotKt.globalSnapshot
            java.lang.Object r1 = getLock()
            monitor-enter(r1)
            androidx.collection.MutableScatterSet r2 = r0.getModified$runtime_release()     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L17
            androidx.compose.runtime.internal.AtomicInt r3 = androidx.compose.runtime.snapshots.SnapshotKt.pendingApplyObserverCount     // Catch: java.lang.Throwable -> L14
            r4 = 1
            r3.add(r4)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r15 = move-exception
            goto La1
        L17:
            java.lang.Object r15 = resetGlobalSnapshotLocked(r0, r15)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)
            r1 = 0
            if (r2 == 0) goto L4a
            r3 = -1
            java.util.List<? extends hd.p> r4 = androidx.compose.runtime.snapshots.SnapshotKt.applyObservers     // Catch: java.lang.Throwable -> L3c
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5     // Catch: java.lang.Throwable -> L3c
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L3c
            r6 = r1
        L2a:
            if (r6 >= r5) goto L3e
            java.lang.Object r7 = r4.get(r6)     // Catch: java.lang.Throwable -> L3c
            hd.p r7 = (p181hd.InterfaceC9544p) r7     // Catch: java.lang.Throwable -> L3c
            java.util.Set r8 = androidx.compose.runtime.collection.ScatterSetWrapperKt.wrapIntoSet(r2)     // Catch: java.lang.Throwable -> L3c
            r7.invoke(r8, r0)     // Catch: java.lang.Throwable -> L3c
            int r6 = r6 + 1
            goto L2a
        L3c:
            r15 = move-exception
            goto L44
        L3e:
            androidx.compose.runtime.internal.AtomicInt r0 = androidx.compose.runtime.snapshots.SnapshotKt.pendingApplyObserverCount
            r0.add(r3)
            goto L4a
        L44:
            androidx.compose.runtime.internal.AtomicInt r0 = androidx.compose.runtime.snapshots.SnapshotKt.pendingApplyObserverCount
            r0.add(r3)
            throw r15
        L4a:
            java.lang.Object r0 = getLock()
            monitor-enter(r0)
            checkAndOverwriteUnusedRecordsLocked()     // Catch: java.lang.Throwable -> L8e
            if (r2 == 0) goto L9d
            java.lang.Object[] r3 = r2.elements     // Catch: java.lang.Throwable -> L8e
            long[] r2 = r2.metadata     // Catch: java.lang.Throwable -> L8e
            int r4 = r2.length     // Catch: java.lang.Throwable -> L8e
            int r4 = r4 + (-2)
            if (r4 < 0) goto L9b
            r5 = r1
        L5e:
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L8e
            long r8 = ~r6     // Catch: java.lang.Throwable -> L8e
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L96
            int r8 = r5 - r4
            int r8 = ~r8     // Catch: java.lang.Throwable -> L8e
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r1
        L78:
            if (r10 >= r8) goto L94
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L90
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L8e
            androidx.compose.runtime.snapshots.StateObject r11 = (androidx.compose.runtime.snapshots.StateObject) r11     // Catch: java.lang.Throwable -> L8e
            processForUnusedRecordsLocked(r11)     // Catch: java.lang.Throwable -> L8e
            goto L90
        L8e:
            r15 = move-exception
            goto L9f
        L90:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L78
        L94:
            if (r8 != r9) goto L9b
        L96:
            if (r5 == r4) goto L9b
            int r5 = r5 + 1
            goto L5e
        L9b:
            qc.q r1 = p309qc.C10786q.f26013a     // Catch: java.lang.Throwable -> L8e
        L9d:
            monitor-exit(r0)
            return r15
        L9f:
            monitor-exit(r0)
            throw r15
        La1:
            monitor-exit(r1)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotKt.advanceGlobalSnapshot(hd.l):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkAndOverwriteUnusedRecordsLocked() {
        SnapshotWeakSet<StateObject> snapshotWeakSet = extraStateObjects;
        int size$runtime_release = snapshotWeakSet.getSize$runtime_release();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= size$runtime_release) {
                break;
            }
            WeakReference<StateObject> weakReference = snapshotWeakSet.getValues$runtime_release()[i10];
            StateObject stateObject = weakReference != null ? weakReference.get() : null;
            if (stateObject != null && overwriteUnusedRecordsLocked(stateObject)) {
                if (i11 != i10) {
                    snapshotWeakSet.getValues$runtime_release()[i11] = weakReference;
                    snapshotWeakSet.getHashes$runtime_release()[i11] = snapshotWeakSet.getHashes$runtime_release()[i10];
                }
                i11++;
            }
            i10++;
        }
        for (int i12 = i11; i12 < size$runtime_release; i12++) {
            snapshotWeakSet.getValues$runtime_release()[i12] = null;
            snapshotWeakSet.getHashes$runtime_release()[i12] = 0;
        }
        if (i11 != size$runtime_release) {
            snapshotWeakSet.setSize$runtime_release(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Snapshot createTransparentSnapshotWithNoParentReadObserver(Snapshot snapshot, InterfaceC9540l interfaceC9540l, boolean z10) {
        boolean z11 = snapshot instanceof MutableSnapshot;
        if (z11 || snapshot == null) {
            return new TransparentObserverMutableSnapshot(z11 ? (MutableSnapshot) snapshot : null, interfaceC9540l, null, false, z10);
        }
        return new TransparentObserverSnapshot(snapshot, interfaceC9540l, false, z10);
    }

    public static /* synthetic */ Snapshot createTransparentSnapshotWithNoParentReadObserver$default(Snapshot snapshot, InterfaceC9540l interfaceC9540l, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC9540l = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return createTransparentSnapshotWithNoParentReadObserver(snapshot, interfaceC9540l, z10);
    }

    public static final <T extends StateRecord> T current(T t10, Snapshot snapshot) {
        T t11;
        T t12 = (T) readable(t10, snapshot.getSnapshotId(), snapshot.getInvalid$runtime_release());
        if (t12 != null) {
            return t12;
        }
        synchronized (getLock()) {
            t11 = (T) readable(t10, snapshot.getSnapshotId(), snapshot.getInvalid$runtime_release());
        }
        if (t11 != null) {
            return t11;
        }
        readError();
        throw new KotlinNothingValueException();
    }

    public static final Snapshot currentSnapshot() {
        Snapshot snapshot = threadSnapshot.get();
        return snapshot == null ? globalSnapshot : snapshot;
    }

    private static final StateRecord findYoungestOr(StateRecord stateRecord, InterfaceC9540l interfaceC9540l) {
        StateRecord stateRecord2 = stateRecord;
        while (stateRecord != null) {
            if (((Boolean) interfaceC9540l.invoke(stateRecord)).booleanValue()) {
                return stateRecord;
            }
            if (stateRecord2.getSnapshotId$runtime_release() < stateRecord.getSnapshotId$runtime_release()) {
                stateRecord2 = stateRecord;
            }
            stateRecord = stateRecord.getNext$runtime_release();
        }
        return stateRecord2;
    }

    public static final Object getLock() {
        return lock;
    }

    public static /* synthetic */ void getLock$annotations() {
    }

    public static final Snapshot getSnapshotInitializer() {
        return snapshotInitializer;
    }

    public static /* synthetic */ void getSnapshotInitializer$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC9540l mergedReadObserver(final InterfaceC9540l interfaceC9540l, final InterfaceC9540l interfaceC9540l2, boolean z10) {
        if (!z10) {
            interfaceC9540l2 = null;
        }
        return (interfaceC9540l == null || interfaceC9540l2 == null || interfaceC9540l == interfaceC9540l2) ? interfaceC9540l == null ? interfaceC9540l2 : interfaceC9540l : new InterfaceC9540l() { // from class: androidx.compose.runtime.snapshots.SnapshotKt.mergedReadObserver.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m30439invoke(obj);
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m30439invoke(Object obj) {
                interfaceC9540l.invoke(obj);
                interfaceC9540l2.invoke(obj);
            }
        };
    }

    public static /* synthetic */ InterfaceC9540l mergedReadObserver$default(InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return mergedReadObserver(interfaceC9540l, interfaceC9540l2, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC9540l mergedWriteObserver(final InterfaceC9540l interfaceC9540l, final InterfaceC9540l interfaceC9540l2) {
        return (interfaceC9540l == null || interfaceC9540l2 == null || interfaceC9540l == interfaceC9540l2) ? interfaceC9540l == null ? interfaceC9540l2 : interfaceC9540l : new InterfaceC9540l() { // from class: androidx.compose.runtime.snapshots.SnapshotKt.mergedWriteObserver.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m30440invoke(obj);
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m30440invoke(Object obj) {
                interfaceC9540l.invoke(obj);
                interfaceC9540l2.invoke(obj);
            }
        };
    }

    public static final <T extends StateRecord> T newOverwritableRecordLocked(T t10, StateObject stateObject) {
        T t11 = (T) usedLocked(stateObject);
        if (t11 != null) {
            t11.setSnapshotId$runtime_release(Long.MAX_VALUE);
            return t11;
        }
        T t12 = (T) t10.create(Long.MAX_VALUE);
        t12.setNext$runtime_release(stateObject.getFirstStateRecord());
        AbstractC9979u.m20292e(t12, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        stateObject.prependStateRecord(t12);
        AbstractC9979u.m20292e(t12, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return t12;
    }

    public static final <T extends StateRecord> T newWritableRecord(T t10, StateObject stateObject, Snapshot snapshot) {
        T t11;
        synchronized (getLock()) {
            t11 = (T) newWritableRecordLocked(t10, stateObject, snapshot);
        }
        return t11;
    }

    private static final <T extends StateRecord> T newWritableRecordLocked(T t10, StateObject stateObject, Snapshot snapshot) {
        T t11 = (T) newOverwritableRecordLocked(t10, stateObject);
        t11.assign(t10);
        t11.setSnapshotId$runtime_release(snapshot.getSnapshotId());
        return t11;
    }

    public static final void notifyWrite(Snapshot snapshot, StateObject stateObject) {
        snapshot.setWriteCount$runtime_release(snapshot.getWriteCount$runtime_release() + 1);
        InterfaceC9540l writeObserver$runtime_release = snapshot.getWriteObserver$runtime_release();
        if (writeObserver$runtime_release != null) {
            writeObserver$runtime_release.invoke(stateObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<StateRecord, StateRecord> optimisticMerges(long j10, MutableSnapshot mutableSnapshot, SnapshotIdSet snapshotIdSet) {
        long[] jArr;
        Map<StateRecord, StateRecord> map;
        SnapshotIdSet snapshotIdSet2;
        long[] jArr2;
        Map<StateRecord, StateRecord> map2;
        SnapshotIdSet snapshotIdSet3;
        int i10;
        long j11 = j10;
        MutableScatterSet<StateObject> modified$runtime_release = mutableSnapshot.getModified$runtime_release();
        Map<StateRecord, StateRecord> map3 = null;
        if (modified$runtime_release == null) {
            return null;
        }
        SnapshotIdSet snapshotIdSetM1056or = mutableSnapshot.getInvalid$runtime_release().set(mutableSnapshot.getSnapshotId()).m1056or(mutableSnapshot.getPreviousIds$runtime_release());
        Object[] objArr = modified$runtime_release.elements;
        long[] jArr3 = modified$runtime_release.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            return null;
        }
        HashMap map4 = null;
        int i11 = 0;
        while (true) {
            long j12 = jArr3[i11];
            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((255 & j12) < 128) {
                        StateObject stateObject = (StateObject) objArr[(i11 << 3) + i14];
                        map2 = map3;
                        StateRecord firstStateRecord = stateObject.getFirstStateRecord();
                        i10 = i12;
                        StateRecord stateRecord = readable(firstStateRecord, j11, snapshotIdSet);
                        if (stateRecord == null) {
                            jArr2 = jArr3;
                        } else {
                            jArr2 = jArr3;
                            StateRecord stateRecord2 = readable(firstStateRecord, j11, snapshotIdSetM1056or);
                            if (stateRecord2 != null && !AbstractC9979u.m20289b(stateRecord, stateRecord2)) {
                                snapshotIdSet3 = snapshotIdSetM1056or;
                                StateRecord stateRecord3 = readable(firstStateRecord, mutableSnapshot.getSnapshotId(), mutableSnapshot.getInvalid$runtime_release());
                                if (stateRecord3 == null) {
                                    readError();
                                    throw new KotlinNothingValueException();
                                }
                                StateRecord stateRecordMergeRecords = stateObject.mergeRecords(stateRecord2, stateRecord, stateRecord3);
                                if (stateRecordMergeRecords == null) {
                                    return map2;
                                }
                                if (map4 == null) {
                                    map4 = new HashMap();
                                }
                                map4.put(stateRecord, stateRecordMergeRecords);
                                map4 = map4;
                            }
                        }
                        snapshotIdSet3 = snapshotIdSetM1056or;
                    } else {
                        jArr2 = jArr3;
                        map2 = map3;
                        snapshotIdSet3 = snapshotIdSetM1056or;
                        i10 = i12;
                    }
                    j12 >>= i10;
                    i14++;
                    j11 = j10;
                    map3 = map2;
                    i12 = i10;
                    jArr3 = jArr2;
                    snapshotIdSetM1056or = snapshotIdSet3;
                }
                jArr = jArr3;
                map = map3;
                snapshotIdSet2 = snapshotIdSetM1056or;
                if (i13 != i12) {
                    return map4;
                }
            } else {
                jArr = jArr3;
                map = map3;
                snapshotIdSet2 = snapshotIdSetM1056or;
            }
            if (i11 == length) {
                return map4;
            }
            i11++;
            j11 = j10;
            map3 = map;
            jArr3 = jArr;
            snapshotIdSetM1056or = snapshotIdSet2;
        }
    }

    public static final <T extends StateRecord, R> R overwritable(T t10, StateObject stateObject, T t11, InterfaceC9540l interfaceC9540l) {
        Snapshot current;
        R r10;
        synchronized (getLock()) {
            try {
                current = Snapshot.Companion.getCurrent();
                r10 = (R) interfaceC9540l.invoke(overwritableRecord(t10, stateObject, current, t11));
                AbstractC9977s.m20286b(1);
            } catch (Throwable th) {
                AbstractC9977s.m20286b(1);
                AbstractC9977s.m20285a(1);
                throw th;
            }
        }
        AbstractC9977s.m20285a(1);
        notifyWrite(current, stateObject);
        return r10;
    }

    public static final <T extends StateRecord> T overwritableRecord(T t10, StateObject stateObject, Snapshot snapshot, T t11) {
        T t12;
        if (snapshot.getReadOnly()) {
            snapshot.mo30425recordModified$runtime_release(stateObject);
        }
        long snapshotId = snapshot.getSnapshotId();
        if (t11.getSnapshotId$runtime_release() == snapshotId) {
            return t11;
        }
        synchronized (getLock()) {
            t12 = (T) newOverwritableRecordLocked(t10, stateObject);
        }
        t12.setSnapshotId$runtime_release(snapshotId);
        if (t11.getSnapshotId$runtime_release() != SnapshotId_jvmKt.toSnapshotId(1)) {
            snapshot.mo30425recordModified$runtime_release(stateObject);
        }
        return t12;
    }

    private static final boolean overwriteUnusedRecordsLocked(StateObject stateObject) {
        StateRecord stateRecord;
        long jLowestOrDefault = pinningTable.lowestOrDefault(nextSnapshotId);
        StateRecord stateRecord2 = null;
        StateRecord firstStateRecord = null;
        int i10 = 0;
        for (StateRecord firstStateRecord2 = stateObject.getFirstStateRecord(); firstStateRecord2 != null; firstStateRecord2 = firstStateRecord2.getNext$runtime_release()) {
            long snapshotId$runtime_release = firstStateRecord2.getSnapshotId$runtime_release();
            if (snapshotId$runtime_release != INVALID_SNAPSHOT) {
                if (snapshotId$runtime_release >= jLowestOrDefault) {
                    i10++;
                } else if (stateRecord2 == null) {
                    i10++;
                    stateRecord2 = firstStateRecord2;
                } else {
                    if (firstStateRecord2.getSnapshotId$runtime_release() < stateRecord2.getSnapshotId$runtime_release()) {
                        stateRecord = stateRecord2;
                        stateRecord2 = firstStateRecord2;
                    } else {
                        stateRecord = firstStateRecord2;
                    }
                    if (firstStateRecord == null) {
                        firstStateRecord = stateObject.getFirstStateRecord();
                        StateRecord stateRecord3 = firstStateRecord;
                        while (true) {
                            if (firstStateRecord == null) {
                                firstStateRecord = stateRecord3;
                                break;
                            }
                            if (firstStateRecord.getSnapshotId$runtime_release() >= jLowestOrDefault) {
                                break;
                            }
                            if (stateRecord3.getSnapshotId$runtime_release() < firstStateRecord.getSnapshotId$runtime_release()) {
                                stateRecord3 = firstStateRecord;
                            }
                            firstStateRecord = firstStateRecord.getNext$runtime_release();
                        }
                    }
                    stateRecord2.setSnapshotId$runtime_release(INVALID_SNAPSHOT);
                    stateRecord2.assign(firstStateRecord);
                    stateRecord2 = stateRecord;
                }
            }
        }
        return i10 > 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void processForUnusedRecordsLocked(StateObject stateObject) {
        if (overwriteUnusedRecordsLocked(stateObject)) {
            extraStateObjects.add(stateObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void readError() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends StateRecord> T readable(T t10, long j10, SnapshotIdSet snapshotIdSet) {
        T t11 = null;
        while (t10 != null) {
            if (valid(t10, j10, snapshotIdSet) && (t11 == null || t11.getSnapshotId$runtime_release() < t10.getSnapshotId$runtime_release())) {
                t11 = t10;
            }
            t10 = (T) t10.getNext$runtime_release();
        }
        if (t11 != null) {
            return t11;
        }
        return null;
    }

    public static final void releasePinningLocked(int i10) {
        pinningTable.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void reportReadonlySnapshotWrite() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T resetGlobalSnapshotLocked(GlobalSnapshot globalSnapshot2, InterfaceC9540l interfaceC9540l) {
        long snapshotId = globalSnapshot2.getSnapshotId();
        T t10 = (T) interfaceC9540l.invoke(openSnapshots.clear(snapshotId));
        long j10 = nextSnapshotId;
        nextSnapshotId = 1 + j10;
        openSnapshots = openSnapshots.clear(snapshotId);
        globalSnapshot2.setSnapshotId$runtime_release(j10);
        globalSnapshot2.setInvalid$runtime_release(openSnapshots);
        globalSnapshot2.setWriteCount$runtime_release(0);
        globalSnapshot2.setModified(null);
        globalSnapshot2.releasePinnedSnapshotLocked$runtime_release();
        openSnapshots = openSnapshots.set(j10);
        return t10;
    }

    public static final <T> T sync(InterfaceC9529a interfaceC9529a) {
        T t10;
        synchronized (getLock()) {
            try {
                t10 = (T) interfaceC9529a.invoke();
                AbstractC9977s.m20286b(1);
            } catch (Throwable th) {
                AbstractC9977s.m20286b(1);
                AbstractC9977s.m20285a(1);
                throw th;
            }
        }
        AbstractC9977s.m20285a(1);
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends Snapshot> T takeNewSnapshot(final InterfaceC9540l interfaceC9540l) {
        return (T) advanceGlobalSnapshot(new InterfaceC9540l() { // from class: androidx.compose.runtime.snapshots.SnapshotKt.takeNewSnapshot.1
            {
                super(1);
            }

            /* JADX WARN: Incorrect return type in method signature: (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)TT; */
            @Override // p181hd.InterfaceC9540l
            public final Snapshot invoke(SnapshotIdSet snapshotIdSet) {
                Snapshot snapshot = (Snapshot) interfaceC9540l.invoke(snapshotIdSet);
                synchronized (SnapshotKt.getLock()) {
                    SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(snapshot.getSnapshotId());
                    C10786q c10786q = C10786q.f26013a;
                }
                return snapshot;
            }
        });
    }

    public static final int trackPinning(long j10, SnapshotIdSet snapshotIdSet) {
        int iAdd;
        long jLowest = snapshotIdSet.lowest(j10);
        synchronized (getLock()) {
            iAdd = pinningTable.add(jLowest);
        }
        return iAdd;
    }

    private static final StateRecord usedLocked(StateObject stateObject) {
        long jLowestOrDefault = pinningTable.lowestOrDefault(nextSnapshotId) - 1;
        SnapshotIdSet empty = SnapshotIdSet.Companion.getEMPTY();
        StateRecord stateRecord = null;
        for (StateRecord firstStateRecord = stateObject.getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext$runtime_release()) {
            if (firstStateRecord.getSnapshotId$runtime_release() != INVALID_SNAPSHOT) {
                if (valid(firstStateRecord, jLowestOrDefault, empty)) {
                    if (stateRecord == null) {
                        stateRecord = firstStateRecord;
                    } else if (firstStateRecord.getSnapshotId$runtime_release() >= stateRecord.getSnapshotId$runtime_release()) {
                        return stateRecord;
                    }
                }
            }
            return firstStateRecord;
        }
        return null;
    }

    private static final boolean valid(long j10, long j11, SnapshotIdSet snapshotIdSet) {
        return (j11 == INVALID_SNAPSHOT || j11 > j10 || snapshotIdSet.get(j11)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateOpen(Snapshot snapshot) {
        long jLowestOrDefault;
        if (openSnapshots.get(snapshot.getSnapshotId())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Snapshot is not open: snapshotId=");
        sb2.append(snapshot.getSnapshotId());
        sb2.append(", disposed=");
        sb2.append(snapshot.getDisposed$runtime_release());
        sb2.append(", applied=");
        MutableSnapshot mutableSnapshot = snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null;
        sb2.append(mutableSnapshot != null ? Boolean.valueOf(mutableSnapshot.getApplied$runtime_release()) : "read-only");
        sb2.append(", lowestPin=");
        synchronized (getLock()) {
            jLowestOrDefault = pinningTable.lowestOrDefault(-1L);
        }
        sb2.append(jLowestOrDefault);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public static final <T extends StateRecord, R> R withCurrent(T t10, InterfaceC9540l interfaceC9540l) {
        return (R) interfaceC9540l.invoke(current(t10));
    }

    public static final <T extends StateRecord, R> R writable(T t10, StateObject stateObject, Snapshot snapshot, InterfaceC9540l interfaceC9540l) {
        R r10;
        synchronized (getLock()) {
            try {
                r10 = (R) interfaceC9540l.invoke(writableRecord(t10, stateObject, snapshot));
                AbstractC9977s.m20286b(1);
            } catch (Throwable th) {
                AbstractC9977s.m20286b(1);
                AbstractC9977s.m20285a(1);
                throw th;
            }
        }
        AbstractC9977s.m20285a(1);
        notifyWrite(snapshot, stateObject);
        return r10;
    }

    public static final <T extends StateRecord> T writableRecord(T t10, StateObject stateObject, Snapshot snapshot) {
        T t11;
        if (snapshot.getReadOnly()) {
            snapshot.mo30425recordModified$runtime_release(stateObject);
        }
        long snapshotId = snapshot.getSnapshotId();
        T t12 = (T) readable(t10, snapshotId, snapshot.getInvalid$runtime_release());
        if (t12 == null) {
            readError();
            throw new KotlinNothingValueException();
        }
        if (t12.getSnapshotId$runtime_release() == snapshot.getSnapshotId()) {
            return t12;
        }
        synchronized (getLock()) {
            t11 = (T) readable(stateObject.getFirstStateRecord(), snapshotId, snapshot.getInvalid$runtime_release());
            if (t11 == null) {
                readError();
                throw new KotlinNothingValueException();
            }
            if (t11.getSnapshotId$runtime_release() != snapshotId) {
                t11 = (T) newWritableRecordLocked(t11, stateObject, snapshot);
            }
        }
        AbstractC9979u.m20292e(t11, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.writableRecord");
        if (t12.getSnapshotId$runtime_release() != SnapshotId_jvmKt.toSnapshotId(1)) {
            snapshot.mo30425recordModified$runtime_release(stateObject);
        }
        return t11;
    }

    private static final boolean valid(StateRecord stateRecord, long j10, SnapshotIdSet snapshotIdSet) {
        return valid(j10, stateRecord.getSnapshotId$runtime_release(), snapshotIdSet);
    }

    public static final <T extends StateRecord> T readable(T t10, StateObject stateObject) {
        T t11;
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot current = companion.getCurrent();
        InterfaceC9540l readObserver = current.getReadObserver();
        if (readObserver != null) {
            readObserver.invoke(stateObject);
        }
        T t12 = (T) readable(t10, current.getSnapshotId(), current.getInvalid$runtime_release());
        if (t12 != null) {
            return t12;
        }
        synchronized (getLock()) {
            Snapshot current2 = companion.getCurrent();
            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
            AbstractC9979u.m20292e(firstStateRecord, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            t11 = (T) readable(firstStateRecord, current2.getSnapshotId(), current2.getInvalid$runtime_release());
            if (t11 == null) {
                readError();
                throw new KotlinNothingValueException();
            }
        }
        return t11;
    }

    public static final <T extends StateRecord, R> R writable(T t10, StateObject stateObject, InterfaceC9540l interfaceC9540l) {
        Snapshot current;
        R r10;
        synchronized (getLock()) {
            try {
                current = Snapshot.Companion.getCurrent();
                r10 = (R) interfaceC9540l.invoke(writableRecord(t10, stateObject, current));
                AbstractC9977s.m20286b(1);
            } catch (Throwable th) {
                AbstractC9977s.m20286b(1);
                AbstractC9977s.m20285a(1);
                throw th;
            }
        }
        AbstractC9977s.m20285a(1);
        notifyWrite(current, stateObject);
        return r10;
    }

    public static final <T extends StateRecord> T current(T t10) {
        T t11;
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot current = companion.getCurrent();
        T t12 = (T) readable(t10, current.getSnapshotId(), current.getInvalid$runtime_release());
        if (t12 != null) {
            return t12;
        }
        synchronized (getLock()) {
            Snapshot current2 = companion.getCurrent();
            t11 = (T) readable(t10, current2.getSnapshotId(), current2.getInvalid$runtime_release());
        }
        if (t11 != null) {
            return t11;
        }
        readError();
        throw new KotlinNothingValueException();
    }

    public static final <T extends StateRecord> T readable(T t10, StateObject stateObject, Snapshot snapshot) {
        T t11;
        InterfaceC9540l readObserver = snapshot.getReadObserver();
        if (readObserver != null) {
            readObserver.invoke(stateObject);
        }
        T t12 = (T) readable(t10, snapshot.getSnapshotId(), snapshot.getInvalid$runtime_release());
        if (t12 != null) {
            return t12;
        }
        synchronized (getLock()) {
            Snapshot current = Snapshot.Companion.getCurrent();
            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
            AbstractC9979u.m20292e(firstStateRecord, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            t11 = (T) readable(firstStateRecord, current.getSnapshotId(), current.getInvalid$runtime_release());
            if (t11 == null) {
                readError();
                throw new KotlinNothingValueException();
            }
        }
        return t11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void advanceGlobalSnapshot() {
        advanceGlobalSnapshot(emptyLambda);
    }
}
