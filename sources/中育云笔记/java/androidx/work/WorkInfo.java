package androidx.work;

import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import okio.Utf8;

/* loaded from: classes3.dex */
public final class WorkInfo {
    public static final Companion Companion = new Companion(null);
    public static final int STOP_REASON_APP_STANDBY = 12;
    public static final int STOP_REASON_BACKGROUND_RESTRICTION = 11;
    public static final int STOP_REASON_CANCELLED_BY_APP = 1;
    public static final int STOP_REASON_CONSTRAINT_BATTERY_NOT_LOW = 5;
    public static final int STOP_REASON_CONSTRAINT_CHARGING = 6;
    public static final int STOP_REASON_CONSTRAINT_CONNECTIVITY = 7;
    public static final int STOP_REASON_CONSTRAINT_DEVICE_IDLE = 8;
    public static final int STOP_REASON_CONSTRAINT_STORAGE_NOT_LOW = 9;
    public static final int STOP_REASON_DEVICE_STATE = 4;
    public static final int STOP_REASON_ESTIMATED_APP_LAUNCH_TIME_CHANGED = 15;
    public static final int STOP_REASON_FOREGROUND_SERVICE_TIMEOUT = -128;
    public static final int STOP_REASON_NOT_STOPPED = -256;
    public static final int STOP_REASON_PREEMPT = 2;
    public static final int STOP_REASON_QUOTA = 10;
    public static final int STOP_REASON_SYSTEM_PROCESSING = 14;
    public static final int STOP_REASON_TIMEOUT = 3;
    public static final int STOP_REASON_UNKNOWN = -512;
    public static final int STOP_REASON_USER = 13;
    private final Constraints constraints;
    private final int generation;

    /* renamed from: id */
    private final UUID f2099id;
    private final long initialDelayMillis;
    private final long nextScheduleTimeMillis;
    private final Data outputData;
    private final PeriodicityInfo periodicityInfo;
    private final Data progress;
    private final int runAttemptCount;
    private final State state;
    private final int stopReason;
    private final Set<String> tags;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    public static final class PeriodicityInfo {
        private final long flexIntervalMillis;
        private final long repeatIntervalMillis;

        public PeriodicityInfo(long j10, long j11) {
            this.repeatIntervalMillis = j10;
            this.flexIntervalMillis = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && AbstractC9979u.m20289b(PeriodicityInfo.class, obj.getClass())) {
                PeriodicityInfo periodicityInfo = (PeriodicityInfo) obj;
                if (periodicityInfo.repeatIntervalMillis == this.repeatIntervalMillis && periodicityInfo.flexIntervalMillis == this.flexIntervalMillis) {
                    return true;
                }
            }
            return false;
        }

        public final long getFlexIntervalMillis() {
            return this.flexIntervalMillis;
        }

        public final long getRepeatIntervalMillis() {
            return this.repeatIntervalMillis;
        }

        public int hashCode() {
            return (Long.hashCode(this.repeatIntervalMillis) * 31) + Long.hashCode(this.flexIntervalMillis);
        }

        public String toString() {
            return "PeriodicityInfo{repeatIntervalMillis=" + this.repeatIntervalMillis + ", flexIntervalMillis=" + this.flexIntervalMillis + '}';
        }
    }

    public enum State {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public final boolean isFinished() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID id2, State state, Set<String> tags) {
        this(id2, state, tags, null, null, 0, 0, null, 0L, null, 0L, 0, 4088, null);
        AbstractC9979u.m20294g(id2, "id");
        AbstractC9979u.m20294g(state, "state");
        AbstractC9979u.m20294g(tags, "tags");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC9979u.m20289b(WorkInfo.class, obj.getClass())) {
            return false;
        }
        WorkInfo workInfo = (WorkInfo) obj;
        if (this.runAttemptCount == workInfo.runAttemptCount && this.generation == workInfo.generation && AbstractC9979u.m20289b(this.f2099id, workInfo.f2099id) && this.state == workInfo.state && AbstractC9979u.m20289b(this.outputData, workInfo.outputData) && AbstractC9979u.m20289b(this.constraints, workInfo.constraints) && this.initialDelayMillis == workInfo.initialDelayMillis && AbstractC9979u.m20289b(this.periodicityInfo, workInfo.periodicityInfo) && this.nextScheduleTimeMillis == workInfo.nextScheduleTimeMillis && this.stopReason == workInfo.stopReason && AbstractC9979u.m20289b(this.tags, workInfo.tags)) {
            return AbstractC9979u.m20289b(this.progress, workInfo.progress);
        }
        return false;
    }

    public final Constraints getConstraints() {
        return this.constraints;
    }

    public final int getGeneration() {
        return this.generation;
    }

    public final UUID getId() {
        return this.f2099id;
    }

    public final long getInitialDelayMillis() {
        return this.initialDelayMillis;
    }

    public final long getNextScheduleTimeMillis() {
        return this.nextScheduleTimeMillis;
    }

    public final Data getOutputData() {
        return this.outputData;
    }

    public final PeriodicityInfo getPeriodicityInfo() {
        return this.periodicityInfo;
    }

    public final Data getProgress() {
        return this.progress;
    }

    @IntRange(from = 0)
    public final int getRunAttemptCount() {
        return this.runAttemptCount;
    }

    public final State getState() {
        return this.state;
    }

    @RequiresApi(31)
    public final int getStopReason() {
        return this.stopReason;
    }

    public final Set<String> getTags() {
        return this.tags;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.f2099id.hashCode() * 31) + this.state.hashCode()) * 31) + this.outputData.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.progress.hashCode()) * 31) + this.runAttemptCount) * 31) + this.generation) * 31) + this.constraints.hashCode()) * 31) + Long.hashCode(this.initialDelayMillis)) * 31;
        PeriodicityInfo periodicityInfo = this.periodicityInfo;
        return ((((iHashCode + (periodicityInfo != null ? periodicityInfo.hashCode() : 0)) * 31) + Long.hashCode(this.nextScheduleTimeMillis)) * 31) + Integer.hashCode(this.stopReason);
    }

    public String toString() {
        return "WorkInfo{id='" + this.f2099id + "', state=" + this.state + ", outputData=" + this.outputData + ", tags=" + this.tags + ", progress=" + this.progress + ", runAttemptCount=" + this.runAttemptCount + ", generation=" + this.generation + ", constraints=" + this.constraints + ", initialDelayMillis=" + this.initialDelayMillis + ", periodicityInfo=" + this.periodicityInfo + ", nextScheduleTimeMillis=" + this.nextScheduleTimeMillis + "}, stopReason=" + this.stopReason;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID id2, State state, Set<String> tags, Data outputData) {
        this(id2, state, tags, outputData, null, 0, 0, null, 0L, null, 0L, 0, 4080, null);
        AbstractC9979u.m20294g(id2, "id");
        AbstractC9979u.m20294g(state, "state");
        AbstractC9979u.m20294g(tags, "tags");
        AbstractC9979u.m20294g(outputData, "outputData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID id2, State state, Set<String> tags, Data outputData, Data progress) {
        this(id2, state, tags, outputData, progress, 0, 0, null, 0L, null, 0L, 0, 4064, null);
        AbstractC9979u.m20294g(id2, "id");
        AbstractC9979u.m20294g(state, "state");
        AbstractC9979u.m20294g(tags, "tags");
        AbstractC9979u.m20294g(outputData, "outputData");
        AbstractC9979u.m20294g(progress, "progress");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID id2, State state, Set<String> tags, Data outputData, Data progress, int i10) {
        this(id2, state, tags, outputData, progress, i10, 0, null, 0L, null, 0L, 0, 4032, null);
        AbstractC9979u.m20294g(id2, "id");
        AbstractC9979u.m20294g(state, "state");
        AbstractC9979u.m20294g(tags, "tags");
        AbstractC9979u.m20294g(outputData, "outputData");
        AbstractC9979u.m20294g(progress, "progress");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID id2, State state, Set<String> tags, Data outputData, Data progress, int i10, int i11) {
        this(id2, state, tags, outputData, progress, i10, i11, null, 0L, null, 0L, 0, Utf8.MASK_2BYTES, null);
        AbstractC9979u.m20294g(id2, "id");
        AbstractC9979u.m20294g(state, "state");
        AbstractC9979u.m20294g(tags, "tags");
        AbstractC9979u.m20294g(outputData, "outputData");
        AbstractC9979u.m20294g(progress, "progress");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID id2, State state, Set<String> tags, Data outputData, Data progress, int i10, int i11, Constraints constraints) {
        this(id2, state, tags, outputData, progress, i10, i11, constraints, 0L, null, 0L, 0, 3840, null);
        AbstractC9979u.m20294g(id2, "id");
        AbstractC9979u.m20294g(state, "state");
        AbstractC9979u.m20294g(tags, "tags");
        AbstractC9979u.m20294g(outputData, "outputData");
        AbstractC9979u.m20294g(progress, "progress");
        AbstractC9979u.m20294g(constraints, "constraints");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID id2, State state, Set<String> tags, Data outputData, Data progress, int i10, int i11, Constraints constraints, long j10) {
        this(id2, state, tags, outputData, progress, i10, i11, constraints, j10, null, 0L, 0, 3584, null);
        AbstractC9979u.m20294g(id2, "id");
        AbstractC9979u.m20294g(state, "state");
        AbstractC9979u.m20294g(tags, "tags");
        AbstractC9979u.m20294g(outputData, "outputData");
        AbstractC9979u.m20294g(progress, "progress");
        AbstractC9979u.m20294g(constraints, "constraints");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID id2, State state, Set<String> tags, Data outputData, Data progress, int i10, int i11, Constraints constraints, long j10, PeriodicityInfo periodicityInfo) {
        this(id2, state, tags, outputData, progress, i10, i11, constraints, j10, periodicityInfo, 0L, 0, 3072, null);
        AbstractC9979u.m20294g(id2, "id");
        AbstractC9979u.m20294g(state, "state");
        AbstractC9979u.m20294g(tags, "tags");
        AbstractC9979u.m20294g(outputData, "outputData");
        AbstractC9979u.m20294g(progress, "progress");
        AbstractC9979u.m20294g(constraints, "constraints");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID id2, State state, Set<String> tags, Data outputData, Data progress, int i10, int i11, Constraints constraints, long j10, PeriodicityInfo periodicityInfo, long j11) {
        this(id2, state, tags, outputData, progress, i10, i11, constraints, j10, periodicityInfo, j11, 0, 2048, null);
        AbstractC9979u.m20294g(id2, "id");
        AbstractC9979u.m20294g(state, "state");
        AbstractC9979u.m20294g(tags, "tags");
        AbstractC9979u.m20294g(outputData, "outputData");
        AbstractC9979u.m20294g(progress, "progress");
        AbstractC9979u.m20294g(constraints, "constraints");
    }

    public WorkInfo(UUID id2, State state, Set<String> tags, Data outputData, Data progress, int i10, int i11, Constraints constraints, long j10, PeriodicityInfo periodicityInfo, long j11, int i12) {
        AbstractC9979u.m20294g(id2, "id");
        AbstractC9979u.m20294g(state, "state");
        AbstractC9979u.m20294g(tags, "tags");
        AbstractC9979u.m20294g(outputData, "outputData");
        AbstractC9979u.m20294g(progress, "progress");
        AbstractC9979u.m20294g(constraints, "constraints");
        this.f2099id = id2;
        this.state = state;
        this.tags = tags;
        this.outputData = outputData;
        this.progress = progress;
        this.runAttemptCount = i10;
        this.generation = i11;
        this.constraints = constraints;
        this.initialDelayMillis = j10;
        this.periodicityInfo = periodicityInfo;
        this.nextScheduleTimeMillis = j11;
        this.stopReason = i12;
    }

    public /* synthetic */ WorkInfo(UUID uuid, State state, Set set, Data data, Data data2, int i10, int i11, Constraints constraints, long j10, PeriodicityInfo periodicityInfo, long j11, int i12, int i13, AbstractC9972n abstractC9972n) {
        this(uuid, state, set, (i13 & 8) != 0 ? Data.EMPTY : data, (i13 & 16) != 0 ? Data.EMPTY : data2, (i13 & 32) != 0 ? 0 : i10, (i13 & 64) != 0 ? 0 : i11, (i13 & 128) != 0 ? Constraints.NONE : constraints, (i13 & 256) != 0 ? 0L : j10, (i13 & 512) != 0 ? null : periodicityInfo, (i13 & 1024) != 0 ? Long.MAX_VALUE : j11, (i13 & 2048) != 0 ? -256 : i12);
    }
}
