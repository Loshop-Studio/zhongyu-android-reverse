package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.InternalComposeApi;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Thread_jvmKt;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9131s;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p134i7.AbstractC8778f0;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public abstract class Snapshot {
    public static final int PreexistingSnapshotId = 1;
    private boolean disposed;
    private SnapshotIdSet invalid;
    private int pinningTrackingHandle;
    private long snapshotId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private final boolean getCanBeReused(TransparentObserverMutableSnapshot transparentObserverMutableSnapshot) {
            return transparentObserverMutableSnapshot.getThreadId$runtime_release() == Thread_jvmKt.currentThreadId();
        }

        public static /* synthetic */ void getCurrentThreadSnapshot$annotations() {
        }

        public static /* synthetic */ void getPreexistingSnapshotId$annotations() {
        }

        public static /* synthetic */ Object observe$default(Companion companion, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, InterfaceC10559a interfaceC10559a, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                interfaceC10570l = null;
            }
            if ((i10 & 2) != 0) {
                interfaceC10570l2 = null;
            }
            return companion.observe(interfaceC10570l, interfaceC10570l2, interfaceC10559a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void registerApplyObserver$lambda$4(InterfaceC10574p interfaceC10574p) {
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.applyObservers = AbstractC8778f0.m14528E0(SnapshotKt.applyObservers, interfaceC10574p);
                C8736p c8736p = C8736p.f16368a;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void registerGlobalWriteObserver$lambda$7(InterfaceC10570l interfaceC10570l) {
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.globalWriteObservers = AbstractC8778f0.m14528E0(SnapshotKt.globalWriteObservers, interfaceC10570l);
                C8736p c8736p = C8736p.f16368a;
            }
            SnapshotKt.advanceGlobalSnapshot();
        }

        public static /* synthetic */ MutableSnapshot takeMutableSnapshot$default(Companion companion, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                interfaceC10570l = null;
            }
            if ((i10 & 2) != 0) {
                interfaceC10570l2 = null;
            }
            return companion.takeMutableSnapshot(interfaceC10570l, interfaceC10570l2);
        }

        public static /* synthetic */ Snapshot takeSnapshot$default(Companion companion, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                interfaceC10570l = null;
            }
            return companion.takeSnapshot(interfaceC10570l);
        }

        public final Snapshot createNonObservableSnapshot() {
            return SnapshotKt.createTransparentSnapshotWithNoParentReadObserver$default((Snapshot) SnapshotKt.threadSnapshot.get(), null, false, 6, null);
        }

        public final Snapshot getCurrent() {
            return SnapshotKt.currentSnapshot();
        }

        public final Snapshot getCurrentThreadSnapshot() {
            return (Snapshot) SnapshotKt.threadSnapshot.get();
        }

        public final <T> T global(InterfaceC10559a interfaceC10559a) {
            Snapshot snapshotRemoveCurrent = removeCurrent();
            try {
                return (T) interfaceC10559a.invoke();
            } finally {
                AbstractC9131s.m16125b(1);
                restoreCurrent(snapshotRemoveCurrent);
                AbstractC9131s.m16124a(1);
            }
        }

        public final boolean isApplyObserverNotificationPending() {
            return SnapshotKt.pendingApplyObserverCount.get() > 0;
        }

        public final boolean isInSnapshot() {
            return SnapshotKt.threadSnapshot.get() != null;
        }

        public final Snapshot makeCurrentNonObservable(Snapshot snapshot) {
            if (snapshot instanceof TransparentObserverMutableSnapshot) {
                TransparentObserverMutableSnapshot transparentObserverMutableSnapshot = (TransparentObserverMutableSnapshot) snapshot;
                if (transparentObserverMutableSnapshot.getThreadId$runtime_release() == Thread_jvmKt.currentThreadId()) {
                    transparentObserverMutableSnapshot.setReadObserver(null);
                    return snapshot;
                }
            }
            if (snapshot instanceof TransparentObserverSnapshot) {
                TransparentObserverSnapshot transparentObserverSnapshot = (TransparentObserverSnapshot) snapshot;
                if (transparentObserverSnapshot.getThreadId$runtime_release() == Thread_jvmKt.currentThreadId()) {
                    transparentObserverSnapshot.setReadObserver(null);
                    return snapshot;
                }
            }
            Snapshot snapshotCreateTransparentSnapshotWithNoParentReadObserver$default = SnapshotKt.createTransparentSnapshotWithNoParentReadObserver$default(snapshot, null, false, 6, null);
            snapshotCreateTransparentSnapshotWithNoParentReadObserver$default.makeCurrent();
            return snapshotCreateTransparentSnapshotWithNoParentReadObserver$default;
        }

        public final void notifyObjectsInitialized() {
            SnapshotKt.currentSnapshot().notifyObjectsInitialized$runtime_release();
        }

        public final <T> T observe(InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, InterfaceC10559a interfaceC10559a) {
            Snapshot transparentObserverMutableSnapshot;
            if (interfaceC10570l == null && interfaceC10570l2 == null) {
                return (T) interfaceC10559a.invoke();
            }
            Snapshot snapshot = (Snapshot) SnapshotKt.threadSnapshot.get();
            if (snapshot instanceof TransparentObserverMutableSnapshot) {
                TransparentObserverMutableSnapshot transparentObserverMutableSnapshot2 = (TransparentObserverMutableSnapshot) snapshot;
                if (transparentObserverMutableSnapshot2.getThreadId$runtime_release() == Thread_jvmKt.currentThreadId()) {
                    InterfaceC10570l readObserver$runtime_release = transparentObserverMutableSnapshot2.getReadObserver();
                    InterfaceC10570l writeObserver$runtime_release = transparentObserverMutableSnapshot2.getWriteObserver$runtime_release();
                    try {
                        ((TransparentObserverMutableSnapshot) snapshot).setReadObserver(SnapshotKt.mergedReadObserver$default(interfaceC10570l, readObserver$runtime_release, false, 4, null));
                        ((TransparentObserverMutableSnapshot) snapshot).setWriteObserver(SnapshotKt.mergedWriteObserver(interfaceC10570l2, writeObserver$runtime_release));
                        return (T) interfaceC10559a.invoke();
                    } finally {
                        transparentObserverMutableSnapshot2.setReadObserver(readObserver$runtime_release);
                        transparentObserverMutableSnapshot2.setWriteObserver(writeObserver$runtime_release);
                    }
                }
            }
            if (snapshot == null || (snapshot instanceof MutableSnapshot)) {
                transparentObserverMutableSnapshot = new TransparentObserverMutableSnapshot(snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null, interfaceC10570l, interfaceC10570l2, true, false);
            } else {
                if (interfaceC10570l == null) {
                    return (T) interfaceC10559a.invoke();
                }
                transparentObserverMutableSnapshot = snapshot.takeNestedSnapshot(interfaceC10570l);
            }
            try {
                Snapshot snapshotMakeCurrent = transparentObserverMutableSnapshot.makeCurrent();
                try {
                    T t10 = (T) interfaceC10559a.invoke();
                    transparentObserverMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    transparentObserverMutableSnapshot.dispose();
                    return t10;
                } catch (Throwable th) {
                    transparentObserverMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    throw th;
                }
            } catch (Throwable th2) {
                transparentObserverMutableSnapshot.dispose();
                throw th2;
            }
        }

        @InternalComposeApi
        public final int openSnapshotCount() {
            return AbstractC8778f0.m14544U0(SnapshotKt.openSnapshots).size();
        }

        public final ObserverHandle registerApplyObserver(final InterfaceC10574p interfaceC10574p) {
            SnapshotKt.advanceGlobalSnapshot(SnapshotKt.emptyLambda);
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.applyObservers = AbstractC8778f0.m14530G0(SnapshotKt.applyObservers, interfaceC10574p);
                C8736p c8736p = C8736p.f16368a;
            }
            return new ObserverHandle() { // from class: androidx.compose.runtime.snapshots.a
                @Override // androidx.compose.runtime.snapshots.ObserverHandle
                public final void dispose() {
                    Snapshot.Companion.registerApplyObserver$lambda$4(interfaceC10574p);
                }
            };
        }

        public final ObserverHandle registerGlobalWriteObserver(final InterfaceC10570l interfaceC10570l) {
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.globalWriteObservers = AbstractC8778f0.m14530G0(SnapshotKt.globalWriteObservers, interfaceC10570l);
                C8736p c8736p = C8736p.f16368a;
            }
            SnapshotKt.advanceGlobalSnapshot();
            return new ObserverHandle() { // from class: androidx.compose.runtime.snapshots.b
                @Override // androidx.compose.runtime.snapshots.ObserverHandle
                public final void dispose() {
                    Snapshot.Companion.registerGlobalWriteObserver$lambda$7(interfaceC10570l);
                }
            };
        }

        public final Snapshot removeCurrent() {
            Snapshot snapshot = (Snapshot) SnapshotKt.threadSnapshot.get();
            if (snapshot != null) {
                SnapshotKt.threadSnapshot.set(null);
            }
            return snapshot;
        }

        public final void restoreCurrent(Snapshot snapshot) {
            if (snapshot != null) {
                SnapshotKt.threadSnapshot.set(snapshot);
            }
        }

        public final void restoreNonObservable(Snapshot snapshot, Snapshot snapshot2, InterfaceC10570l interfaceC10570l) {
            if (snapshot != snapshot2) {
                snapshot2.restoreCurrent(snapshot);
                snapshot2.dispose();
            } else if (snapshot instanceof TransparentObserverMutableSnapshot) {
                ((TransparentObserverMutableSnapshot) snapshot).setReadObserver(interfaceC10570l);
            } else {
                if (snapshot instanceof TransparentObserverSnapshot) {
                    ((TransparentObserverSnapshot) snapshot).setReadObserver(interfaceC10570l);
                    return;
                }
                throw new IllegalStateException(("Non-transparent snapshot was reused: " + snapshot).toString());
            }
        }

        public final void sendApplyNotifications() {
            boolean zHasPendingChanges;
            synchronized (SnapshotKt.getLock()) {
                zHasPendingChanges = SnapshotKt.globalSnapshot.hasPendingChanges();
            }
            if (zHasPendingChanges) {
                SnapshotKt.advanceGlobalSnapshot();
            }
        }

        public final MutableSnapshot takeMutableSnapshot(InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2) {
            MutableSnapshot mutableSnapshotTakeNestedMutableSnapshot;
            Snapshot snapshotCurrentSnapshot = SnapshotKt.currentSnapshot();
            MutableSnapshot mutableSnapshot = snapshotCurrentSnapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshotCurrentSnapshot : null;
            if (mutableSnapshot == null || (mutableSnapshotTakeNestedMutableSnapshot = mutableSnapshot.takeNestedMutableSnapshot(interfaceC10570l, interfaceC10570l2)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            return mutableSnapshotTakeNestedMutableSnapshot;
        }

        public final Snapshot takeSnapshot(InterfaceC10570l interfaceC10570l) {
            return SnapshotKt.currentSnapshot().takeNestedSnapshot(interfaceC10570l);
        }

        public final <R> R withMutableSnapshot(InterfaceC10559a interfaceC10559a) {
            MutableSnapshot mutableSnapshotTakeMutableSnapshot$default = takeMutableSnapshot$default(this, null, null, 3, null);
            try {
                Snapshot snapshotMakeCurrent = mutableSnapshotTakeMutableSnapshot$default.makeCurrent();
                try {
                    R r10 = (R) interfaceC10559a.invoke();
                    AbstractC9131s.m16125b(1);
                    mutableSnapshotTakeMutableSnapshot$default.apply().check();
                    mutableSnapshotTakeMutableSnapshot$default.dispose();
                    AbstractC9131s.m16124a(1);
                    return r10;
                } finally {
                    AbstractC9131s.m16125b(1);
                    mutableSnapshotTakeMutableSnapshot$default.restoreCurrent(snapshotMakeCurrent);
                    AbstractC9131s.m16124a(1);
                }
            } finally {
            }
        }

        public final <T> T withoutReadObservation(InterfaceC10559a interfaceC10559a) {
            Snapshot currentThreadSnapshot = getCurrentThreadSnapshot();
            InterfaceC10570l readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot snapshotMakeCurrentNonObservable = makeCurrentNonObservable(currentThreadSnapshot);
            try {
                return (T) interfaceC10559a.invoke();
            } finally {
                AbstractC9131s.m16125b(1);
                restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                AbstractC9131s.m16124a(1);
            }
        }

        private Companion() {
        }

        private final boolean getCanBeReused(TransparentObserverSnapshot transparentObserverSnapshot) {
            return transparentObserverSnapshot.getThreadId$runtime_release() == Thread_jvmKt.currentThreadId();
        }
    }

    public /* synthetic */ Snapshot(int i10, SnapshotIdSet snapshotIdSet, AbstractC9126n abstractC9126n) {
        this(i10, snapshotIdSet);
    }

    @InterfaceC8721a
    public static /* synthetic */ void getId$annotations() {
    }

    private static /* synthetic */ void getPinningTrackingHandle$annotations() {
    }

    public static /* synthetic */ void getReadObserver$annotations() {
    }

    public static /* synthetic */ Snapshot takeNestedSnapshot$default(Snapshot snapshot, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedSnapshot");
        }
        if ((i10 & 1) != 0) {
            interfaceC10570l = null;
        }
        return snapshot.takeNestedSnapshot(interfaceC10570l);
    }

    public final void closeAndReleasePinning$runtime_release() {
        synchronized (SnapshotKt.getLock()) {
            closeLocked$runtime_release();
            releasePinnedSnapshotsForCloseLocked$runtime_release();
            C8736p c8736p = C8736p.f16368a;
        }
    }

    public void closeLocked$runtime_release() {
        SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.clear(getSnapshotId());
    }

    public void dispose() {
        this.disposed = true;
        synchronized (SnapshotKt.getLock()) {
            releasePinnedSnapshotLocked$runtime_release();
            C8736p c8736p = C8736p.f16368a;
        }
    }

    public final <T> T enter(InterfaceC10559a interfaceC10559a) {
        Snapshot snapshotMakeCurrent = makeCurrent();
        try {
            return (T) interfaceC10559a.invoke();
        } finally {
            AbstractC9131s.m16125b(1);
            restoreCurrent(snapshotMakeCurrent);
            AbstractC9131s.m16124a(1);
        }
    }

    public final boolean getDisposed$runtime_release() {
        return this.disposed;
    }

    public int getId() {
        return (int) getSnapshotId();
    }

    public SnapshotIdSet getInvalid$runtime_release() {
        return this.invalid;
    }

    public abstract MutableScatterSet<StateObject> getModified$runtime_release();

    public abstract InterfaceC10570l getReadObserver();

    public abstract boolean getReadOnly();

    public abstract Snapshot getRoot();

    public long getSnapshotId() {
        return this.snapshotId;
    }

    public int getWriteCount$runtime_release() {
        return 0;
    }

    public abstract InterfaceC10570l getWriteObserver$runtime_release();

    public abstract boolean hasPendingChanges();

    public final boolean isPinned$runtime_release() {
        return this.pinningTrackingHandle >= 0;
    }

    public Snapshot makeCurrent() {
        Snapshot snapshot = (Snapshot) SnapshotKt.threadSnapshot.get();
        SnapshotKt.threadSnapshot.set(this);
        return snapshot;
    }

    /* renamed from: nestedActivated$runtime_release */
    public abstract void mo23820nestedActivated$runtime_release(Snapshot snapshot);

    /* renamed from: nestedDeactivated$runtime_release */
    public abstract void mo23821nestedDeactivated$runtime_release(Snapshot snapshot);

    public abstract void notifyObjectsInitialized$runtime_release();

    /* renamed from: recordModified$runtime_release */
    public abstract void mo23823recordModified$runtime_release(StateObject stateObject);

    public final void releasePinnedSnapshotLocked$runtime_release() {
        int i10 = this.pinningTrackingHandle;
        if (i10 >= 0) {
            SnapshotKt.releasePinningLocked(i10);
            this.pinningTrackingHandle = -1;
        }
    }

    public void releasePinnedSnapshotsForCloseLocked$runtime_release() {
        releasePinnedSnapshotLocked$runtime_release();
    }

    public void restoreCurrent(Snapshot snapshot) {
        SnapshotKt.threadSnapshot.set(snapshot);
    }

    public final void setDisposed$runtime_release(boolean z10) {
        this.disposed = z10;
    }

    public void setInvalid$runtime_release(SnapshotIdSet snapshotIdSet) {
        this.invalid = snapshotIdSet;
    }

    public void setSnapshotId$runtime_release(long j10) {
        this.snapshotId = j10;
    }

    public void setWriteCount$runtime_release(int i10) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract Snapshot takeNestedSnapshot(InterfaceC10570l interfaceC10570l);

    public final int takeoverPinnedSnapshot$runtime_release() {
        int i10 = this.pinningTrackingHandle;
        this.pinningTrackingHandle = -1;
        return i10;
    }

    public final Snapshot unsafeEnter() {
        return makeCurrent();
    }

    public final void unsafeLeave(Snapshot snapshot) {
        if (!(SnapshotKt.threadSnapshot.get() == this)) {
            PreconditionsKt.throwIllegalStateException("Cannot leave snapshot; " + this + " is not the current snapshot");
        }
        restoreCurrent(snapshot);
    }

    public final void validateNotDisposed$runtime_release() {
        if (this.disposed) {
            PreconditionsKt.throwIllegalArgumentException("Cannot use a disposed snapshot");
        }
    }

    public /* synthetic */ Snapshot(long j10, SnapshotIdSet snapshotIdSet, AbstractC9126n abstractC9126n) {
        this(j10, snapshotIdSet);
    }

    private Snapshot(long j10, SnapshotIdSet snapshotIdSet) {
        this.invalid = snapshotIdSet;
        this.snapshotId = j10;
        this.pinningTrackingHandle = j10 != SnapshotKt.INVALID_SNAPSHOT ? SnapshotKt.trackPinning(j10, getInvalid$runtime_release()) : -1;
    }

    @InterfaceC8721a
    private /* synthetic */ Snapshot(int i10, SnapshotIdSet snapshotIdSet) {
        this(SnapshotId_jvmKt.toSnapshotId(i10), snapshotIdSet, (AbstractC9126n) null);
    }
}
