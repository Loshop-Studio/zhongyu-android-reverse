package androidx.room;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0000¢\u0006\u0002\b\u0018J\u0015\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0000¢\u0006\u0002\b\u001aJ\r\u0010\u001b\u001a\u00020\u001cH\u0000¢\u0006\u0002\b\u001dJ\r\u0010\u001e\u001a\u00020\u001cH\u0000¢\u0006\u0002\b\u001fR\u0014\u0010\u0006\u001a\u00060\u0007j\u0002`\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, m13558d2 = {"Landroidx/room/ObservedTableStates;", "", "size", "", "<init>", "(I)V", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "tableObserversCount", "", "tableObservedState", "", "needsSync", "", "getTablesToSync", "", "Landroidx/room/ObservedTableStates$ObserveOp;", "getTablesToSync$room_runtime_release", "()[Landroidx/room/ObservedTableStates$ObserveOp;", "onObserverAdded", "tableIds", "", "onObserverAdded$room_runtime_release", "onObserverRemoved", "onObserverRemoved$room_runtime_release", "resetTriggerState", "", "resetTriggerState$room_runtime_release", "forceNeedSync", "forceNeedSync$room_runtime_release", "ObserveOp", "room-runtime_release"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/ObservedTableStates\n+ 2 ReentrantLock.kt\nandroidx/room/concurrent/ReentrantLockKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,604:1\n28#2,5:605\n28#2,3:610\n32#2:615\n28#2,3:616\n32#2:621\n28#2,5:622\n28#2,5:627\n13423#3,2:613\n13423#3,2:619\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/ObservedTableStates\n*L\n508#1:605,5\n530#1:610,3\n530#1:615\n545#1:616,3\n545#1:621\n559#1:622,5\n565#1:627,5\n532#1:613,2\n547#1:619,2\n*E\n"})
/* loaded from: classes3.dex */
public final class ObservedTableStates {
    private final ReentrantLock lock = new ReentrantLock();
    private boolean needsSync;
    private final boolean[] tableObservedState;
    private final long[] tableObserversCount;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m13558d2 = {"Landroidx/room/ObservedTableStates$ObserveOp;", "", "<init>", "(Ljava/lang/String;I)V", "NO_OP", "ADD", "REMOVE", "room-runtime_release"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
    public static final class ObserveOp {
        private static final /* synthetic */ EnumEntries $ENTRIES;
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
            $ENTRIES = EnumEntriesKt.enumEntries(observeOpArr$values);
        }

        private ObserveOp(String str, int i10) {
        }

        public static EnumEntries<ObserveOp> getEntries() {
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
            Unit unit = Unit.INSTANCE;
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
            boolean z9 = false;
            while (i10 < length) {
                boolean z10 = true;
                boolean z11 = this.tableObserversCount[i10] > 0;
                boolean[] zArr = this.tableObservedState;
                if (z11 != zArr[i10]) {
                    zArr[i10] = z11;
                    observeOp = z11 ? ObserveOp.ADD : ObserveOp.REMOVE;
                } else {
                    z10 = z9;
                    observeOp = ObserveOp.NO_OP;
                }
                observeOpArr[i10] = observeOp;
                i10++;
                z9 = z10;
            }
            ObserveOp[] observeOpArr2 = z9 ? observeOpArr : null;
            reentrantLock.unlock();
            return observeOpArr2;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean onObserverAdded$room_runtime_release(int[] tableIds) {
        Intrinsics.checkNotNullParameter(tableIds, "tableIds");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean z9 = false;
            for (int i10 : tableIds) {
                long[] jArr = this.tableObserversCount;
                long j10 = jArr[i10];
                jArr[i10] = 1 + j10;
                if (j10 == 0) {
                    z9 = true;
                    this.needsSync = true;
                }
            }
            return z9;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean onObserverRemoved$room_runtime_release(int[] tableIds) {
        Intrinsics.checkNotNullParameter(tableIds, "tableIds");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean z9 = false;
            for (int i10 : tableIds) {
                long[] jArr = this.tableObserversCount;
                long j10 = jArr[i10];
                jArr[i10] = j10 - 1;
                if (j10 == 1) {
                    z9 = true;
                    this.needsSync = true;
                }
            }
            return z9;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void resetTriggerState$room_runtime_release() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            ArraysKt.fill$default(this.tableObservedState, false, 0, 0, 6, (Object) null);
            this.needsSync = true;
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }
}
