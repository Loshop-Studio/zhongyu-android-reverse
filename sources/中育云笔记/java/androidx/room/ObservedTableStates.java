package androidx.room;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.enums.AbstractC9953a;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;
import p325rc.AbstractC10964p;
import p425yc.InterfaceC11943a;

/* loaded from: classes3.dex */
public final class ObservedTableStates {
    private final ReentrantLock lock = new ReentrantLock();
    private boolean needsSync;
    private final boolean[] tableObservedState;
    private final long[] tableObserversCount;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ObserveOp {
        private static final /* synthetic */ InterfaceC11943a $ENTRIES;
        private static final /* synthetic */ ObserveOp[] $VALUES;
        public static final ObserveOp NO_OP = new ObserveOp("NO_OP", 0);
        public static final ObserveOp ADD = new ObserveOp("ADD", 1);
        public static final ObserveOp REMOVE = new ObserveOp("REMOVE", 2);

        private static final /* synthetic */ ObserveOp[] $values() {
            return new ObserveOp[]{NO_OP, ADD, REMOVE};
        }

        static {
            ObserveOp[] observeOpArr$values = $values();
            $VALUES = observeOpArr$values;
            $ENTRIES = AbstractC9953a.m20230a(observeOpArr$values);
        }

        private ObserveOp(String str, int i10) {
        }

        public static InterfaceC11943a getEntries() {
            return $ENTRIES;
        }

        public static ObserveOp valueOf(String str) {
            return (ObserveOp) Enum.valueOf(ObserveOp.class, str);
        }

        public static ObserveOp[] values() {
            return (ObserveOp[]) $VALUES.clone();
        }
    }

    public ObservedTableStates(int i10) {
        this.tableObserversCount = new long[i10];
        this.tableObservedState = new boolean[i10];
    }

    public final void forceNeedSync$room_runtime_release() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.needsSync = true;
            C10786q c10786q = C10786q.f26013a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final ObserveOp[] getTablesToSync$room_runtime_release() {
        ObserveOp observeOp;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!this.needsSync) {
                reentrantLock.unlock();
                return null;
            }
            this.needsSync = false;
            int length = this.tableObserversCount.length;
            ObserveOp[] observeOpArr = new ObserveOp[length];
            int i10 = 0;
            boolean z10 = false;
            while (i10 < length) {
                boolean z11 = true;
                boolean z12 = this.tableObserversCount[i10] > 0;
                boolean[] zArr = this.tableObservedState;
                if (z12 != zArr[i10]) {
                    zArr[i10] = z12;
                    observeOp = z12 ? ObserveOp.ADD : ObserveOp.REMOVE;
                } else {
                    z11 = z10;
                    observeOp = ObserveOp.NO_OP;
                }
                observeOpArr[i10] = observeOp;
                i10++;
                z10 = z11;
            }
            ObserveOp[] observeOpArr2 = z10 ? observeOpArr : null;
            reentrantLock.unlock();
            return observeOpArr2;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean onObserverAdded$room_runtime_release(int[] tableIds) {
        AbstractC9979u.m20294g(tableIds, "tableIds");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean z10 = false;
            for (int i10 : tableIds) {
                long[] jArr = this.tableObserversCount;
                long j10 = jArr[i10];
                jArr[i10] = 1 + j10;
                if (j10 == 0) {
                    z10 = true;
                    this.needsSync = true;
                }
            }
            return z10;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean onObserverRemoved$room_runtime_release(int[] tableIds) {
        AbstractC9979u.m20294g(tableIds, "tableIds");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean z10 = false;
            for (int i10 : tableIds) {
                long[] jArr = this.tableObserversCount;
                long j10 = jArr[i10];
                jArr[i10] = j10 - 1;
                if (j10 == 1) {
                    z10 = true;
                    this.needsSync = true;
                }
            }
            return z10;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void resetTriggerState$room_runtime_release() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            AbstractC10964p.m23992G(this.tableObservedState, false, 0, 0, 6, null);
            this.needsSync = true;
            C10786q c10786q = C10786q.f26013a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
