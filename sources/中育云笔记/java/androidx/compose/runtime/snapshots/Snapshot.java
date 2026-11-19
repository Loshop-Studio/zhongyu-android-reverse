package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.InternalComposeApi;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Thread_jvmKt;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9977s;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import p325rc.AbstractC10947g0;

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
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private final boolean getCanBeReused(TransparentObserverMutableSnapshot transparentObserverMutableSnapshot) {
            return transparentObserverMutableSnapshot.getThreadId$runtime_release() == Thread_jvmKt.currentThreadId();
        }

        public static /* synthetic */ void getCurrentThreadSnapshot$annotations() {
        }

        public static /* synthetic */ void getPreexistingSnapshotId$annotations() {
        }

        public static /* synthetic */ Object observe$default(Companion companion, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9529a interfaceC9529a, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                interfaceC9540l = null;
            }
            if ((i10 & 2) != 0) {
                interfaceC9540l2 = null;
            }
            return companion.observe(interfaceC9540l, interfaceC9540l2, interfaceC9529a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void registerApplyObserver$lambda$4(InterfaceC9544p interfaceC9544p) {
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.applyObservers = AbstractC10947g0.m23905G0(SnapshotKt.applyObservers, interfaceC9544p);
                C10786q c10786q = C10786q.f26013a;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void registerGlobalWriteObserver$lambda$7(InterfaceC9540l interfaceC9540l) {
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.globalWriteObservers = AbstractC10947g0.m23905G0(SnapshotKt.globalWriteObservers, interfaceC9540l);
                C10786q c10786q = C10786q.f26013a;
            }
            SnapshotKt.advanceGlobalSnapshot();
        }

        public static /* synthetic */ MutableSnapshot takeMutableSnapshot$default(Companion companion, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                interfaceC9540l = null;
            }
            if ((i10 & 2) != 0) {
                interfaceC9540l2 = null;
            }
            return companion.takeMutableSnapshot(interfaceC9540l, interfaceC9540l2);
        }

        public static /* synthetic */ Snapshot takeSnapshot$default(Companion companion, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                interfaceC9540l = null;
            }
            return companion.takeSnapshot(interfaceC9540l);
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

        public final <T> T global(InterfaceC9529a interfaceC9529a) {
            Snapshot snapshotRemoveCurrent = removeCurrent();
            try {
                return (T) interfaceC9529a.invoke();
            } finally {
                AbstractC9977s.m20286b(1);
                restoreCurrent(snapshotRemoveCurrent);
                AbstractC9977s.m20285a(1);
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

        public final <T> T observe(InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9529a interfaceC9529a) {
            Snapshot transparentObserverMutableSnapshot;
            if (interfaceC9540l == null && interfaceC9540l2 == null) {
                return (T) interfaceC9529a.invoke();
            }
            Snapshot snapshot = (Snapshot) SnapshotKt.threadSnapshot.get();
            if (snapshot instanceof TransparentObserverMutableSnapshot) {
                TransparentObserverMutableSnapshot transparentObserverMutableSnapshot2 = (TransparentObserverMutableSnapshot) snapshot;
                if (transparentObserverMutableSnapshot2.getThreadId$runtime_release() == Thread_jvmKt.currentThreadId()) {
                    InterfaceC9540l readObserver$runtime_release = transparentObserverMutableSnapshot2.getReadObserver();
                    InterfaceC9540l writeObserver$runtime_release = transparentObserverMutableSnapshot2.getWriteObserver$runtime_release();
                    try {
                        ((TransparentObserverMutableSnapshot) snapshot).setReadObserver(SnapshotKt.mergedReadObserver$default(interfaceC9540l, readObserver$runtime_release, false, 4, null));
                        ((TransparentObserverMutableSnapshot) snapshot).setWriteObserver(SnapshotKt.mergedWriteObserver(interfaceC9540l2, writeObserver$runtime_release));
                        return (T) interfaceC9529a.invoke();
                    } finally {
                        transparentObserverMutableSnapshot2.setReadObserver(readObserver$runtime_release);
                        transparentObserverMutableSnapshot2.setWriteObserver(writeObserver$runtime_release);
                    }
                }
            }
            if (snapshot == null || (snapshot instanceof MutableSnapshot)) {
                transparentObserverMutableSnapshot = new TransparentObserverMutableSnapshot(snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null, interfaceC9540l, interfaceC9540l2, true, false);
            } else {
                if (interfaceC9540l == null) {
                    return (T) interfaceC9529a.invoke();
                }
                transparentObserverMutableSnapshot = snapshot.takeNestedSnapshot(interfaceC9540l);
            }
            try {
                Snapshot snapshotMakeCurrent = transparentObserverMutableSnapshot.makeCurrent();
                try {
                    T t10 = (T) interfaceC9529a.invoke();
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
            return AbstractC10947g0.m23922X0(SnapshotKt.openSnapshots).size();
        }

        public final ObserverHandle registerApplyObserver(final InterfaceC9544p interfaceC9544p) {
            SnapshotKt.advanceGlobalSnapshot(SnapshotKt.emptyLambda);
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.applyObservers = AbstractC10947g0.m23907I0(SnapshotKt.applyObservers, interfaceC9544p);
                C10786q c10786q = C10786q.f26013a;
            }
            return new ObserverHandle() { // from class: androidx.compose.runtime.snapshots.a
                @Override // androidx.compose.runtime.snapshots.ObserverHandle
                public final void dispose() {
                    Snapshot.Companion.registerApplyObserver$lambda$4(interfaceC9544p);
                }
            };
        }

        public final ObserverHandle registerGlobalWriteObserver(final InterfaceC9540l interfaceC9540l) {
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.globalWriteObservers = AbstractC10947g0.m23907I0(SnapshotKt.globalWriteObservers, interfaceC9540l);
                C10786q c10786q = C10786q.f26013a;
            }
            SnapshotKt.advanceGlobalSnapshot();
            return new ObserverHandle() { // from class: androidx.compose.runtime.snapshots.b
                @Override // androidx.compose.runtime.snapshots.ObserverHandle
                public final void dispose() {
                    Snapshot.Companion.registerGlobalWriteObserver$lambda$7(interfaceC9540l);
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

        public final void restoreNonObservable(Snapshot snapshot, Snapshot snapshot2, InterfaceC9540l interfaceC9540l) {
            if (snapshot != snapshot2) {
                snapshot2.restoreCurrent(snapshot);
                snapshot2.dispose();
            } else if (snapshot instanceof TransparentObserverMutableSnapshot) {
                ((TransparentObserverMutableSnapshot) snapshot).setReadObserver(interfaceC9540l);
            } else {
                if (snapshot instanceof TransparentObserverSnapshot) {
                    ((TransparentObserverSnapshot) snapshot).setReadObserver(interfaceC9540l);
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

        public final MutableSnapshot takeMutableSnapshot(InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
            MutableSnapshot mutableSnapshotTakeNestedMutableSnapshot;
            Snapshot snapshotCurrentSnapshot = SnapshotKt.currentSnapshot();
            MutableSnapshot mutableSnapshot = snapshotCurrentSnapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshotCurrentSnapshot : null;
            if (mutableSnapshot == null || (mutableSnapshotTakeNestedMutableSnapshot = mutableSnapshot.takeNestedMutableSnapshot(interfaceC9540l, interfaceC9540l2)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            return mutableSnapshotTakeNestedMutableSnapshot;
        }

        public final Snapshot takeSnapshot(InterfaceC9540l interfaceC9540l) {
            return SnapshotKt.currentSnapshot().takeNestedSnapshot(interfaceC9540l);
        }

        public final <R> R withMutableSnapshot(InterfaceC9529a interfaceC9529a) {
            MutableSnapshot mutableSnapshotTakeMutableSnapshot$default = takeMutableSnapshot$default(this, null, null, 3, null);
            try {
                Snapshot snapshotMakeCurrent = mutableSnapshotTakeMutableSnapshot$default.makeCurrent();
                try {
                    R r10 = (R) interfaceC9529a.invoke();
                    AbstractC9977s.m20286b(1);
                    mutableSnapshotTakeMutableSnapshot$default.apply().check();
                    mutableSnapshotTakeMutableSnapshot$default.dispose();
                    AbstractC9977s.m20285a(1);
                    return r10;
                } finally {
                    AbstractC9977s.m20286b(1);
                    mutableSnapshotTakeMutableSnapshot$default.restoreCurrent(snapshotMakeCurrent);
                    AbstractC9977s.m20285a(1);
                }
            } finally {
            }
        }

        public final <T> T withoutReadObservation(InterfaceC9529a interfaceC9529a) {
            Snapshot currentThreadSnapshot = getCurrentThreadSnapshot();
            InterfaceC9540l readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot snapshotMakeCurrentNonObservable = makeCurrentNonObservable(currentThreadSnapshot);
            try {
                return (T) interfaceC9529a.invoke();
            } finally {
                AbstractC9977s.m20286b(1);
                restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                AbstractC9977s.m20285a(1);
            }
        }

        private Companion() {
        }

        private final boolean getCanBeReused(TransparentObserverSnapshot transparentObserverSnapshot) {
            return transparentObserverSnapshot.getThreadId$runtime_release() == Thread_jvmKt.currentThreadId();
        }
    }

    public /* synthetic */ Snapshot(int i10, SnapshotIdSet snapshotIdSet, AbstractC9972n abstractC9972n) {
        this(i10, snapshotIdSet);
    }

    @InterfaceC10770a
    public static /* synthetic */ void getId$annotations() {
    }

    private static /* synthetic */ void getPinningTrackingHandle$annotations() {
    }

    public static /* synthetic */ void getReadObserver$annotations() {
    }

    public static /* synthetic */ Snapshot takeNestedSnapshot$default(Snapshot snapshot, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedSnapshot");
        }
        if ((i10 & 1) != 0) {
            interfaceC9540l = null;
        }
        return snapshot.takeNestedSnapshot(interfaceC9540l);
    }

    public final void closeAndReleasePinning$runtime_release() {
        synchronized (SnapshotKt.getLock()) {
            closeLocked$runtime_release();
            releasePinnedSnapshotsForCloseLocked$runtime_release();
            C10786q c10786q = C10786q.f26013a;
        }
    }

    public void closeLocked$runtime_release() {
        SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.clear(getSnapshotId());
    }

    public void dispose() {
        this.disposed = true;
        synchronized (SnapshotKt.getLock()) {
            releasePinnedSnapshotLocked$runtime_release();
            C10786q c10786q = C10786q.f26013a;
        }
    }

    public final <T> T enter(InterfaceC9529a interfaceC9529a) {
        Snapshot snapshotMakeCurrent = makeCurrent();
        try {
            return (T) interfaceC9529a.invoke();
        } finally {
            AbstractC9977s.m20286b(1);
            restoreCurrent(snapshotMakeCurrent);
            AbstractC9977s.m20285a(1);
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

    public abstract InterfaceC9540l getReadObserver();

    public abstract boolean getReadOnly();

    public abstract Snapshot getRoot();

    public long getSnapshotId() {
        return this.snapshotId;
    }

    public int getWriteCount$runtime_release() {
        return 0;
    }

    public abstract InterfaceC9540l getWriteObserver$runtime_release();

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
    public abstract void mo30422nestedActivated$runtime_release(Snapshot snapshot);

    /* renamed from: nestedDeactivated$runtime_release */
    public abstract void mo30423nestedDeactivated$runtime_release(Snapshot snapshot);

    public abstract void notifyObjectsInitialized$runtime_release();

    /* renamed from: recordModified$runtime_release */
    public abstract void mo30425recordModified$runtime_release(StateObject stateObject);

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

    public abstract Snapshot takeNestedSnapshot(InterfaceC9540l interfaceC9540l);

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

    public /* synthetic */ Snapshot(long j10, SnapshotIdSet snapshotIdSet, AbstractC9972n abstractC9972n) {
        this(j10, snapshotIdSet);
    }

    private Snapshot(long j10, SnapshotIdSet snapshotIdSet) {
        this.invalid = snapshotIdSet;
        this.snapshotId = j10;
        this.pinningTrackingHandle = j10 != SnapshotKt.INVALID_SNAPSHOT ? SnapshotKt.trackPinning(j10, getInvalid$runtime_release()) : -1;
    }

    @InterfaceC10770a
    private /* synthetic */ Snapshot(int i10, SnapshotIdSet snapshotIdSet) {
        this(SnapshotId_jvmKt.toSnapshotId(i10), snapshotIdSet, (AbstractC9972n) null);
    }
}
