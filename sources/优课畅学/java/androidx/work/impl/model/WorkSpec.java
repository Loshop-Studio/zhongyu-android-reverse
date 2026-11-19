package androidx.work.impl.model;

import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import androidx.room.Relation;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.OverwritingInputMerger;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p134i7.AbstractC8811w;

@Entity(indices = {@Index({"schedule_requested_at"}), @Index({"last_enqueue_time"})})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class WorkSpec {
    public static final Companion Companion = new Companion(null);
    public static final long SCHEDULE_NOT_REQUESTED_YET = -1;
    private static final String TAG;
    public static final Function<List<WorkInfoPojo>, List<WorkInfo>> WORK_INFO_MAPPER;

    @ColumnInfo(name = "backoff_delay_duration")
    public long backoffDelayDuration;

    @ColumnInfo(name = "backoff_policy")
    public BackoffPolicy backoffPolicy;

    @Embedded
    public Constraints constraints;

    @ColumnInfo(name = "run_in_foreground")
    public boolean expedited;

    @ColumnInfo(name = "flex_duration")
    public long flexDuration;

    @ColumnInfo(defaultValue = "0")
    private final int generation;

    /* renamed from: id */
    @PrimaryKey
    @ColumnInfo(name = "id")
    public final String f2050id;

    @ColumnInfo(name = "initial_delay")
    public long initialDelay;

    @ColumnInfo(name = "input")
    public Data input;

    @ColumnInfo(name = "input_merger_class_name")
    public String inputMergerClassName;

    @ColumnInfo(name = "interval_duration")
    public long intervalDuration;

    @ColumnInfo(defaultValue = "-1", name = "last_enqueue_time")
    public long lastEnqueueTime;

    @ColumnInfo(name = "minimum_retention_duration")
    public long minimumRetentionDuration;

    @ColumnInfo(defaultValue = "9223372036854775807", name = "next_schedule_time_override")
    private long nextScheduleTimeOverride;

    @ColumnInfo(defaultValue = "0", name = "next_schedule_time_override_generation")
    private int nextScheduleTimeOverrideGeneration;

    @ColumnInfo(name = "out_of_quota_policy")
    public OutOfQuotaPolicy outOfQuotaPolicy;

    @ColumnInfo(name = "output")
    public Data output;

    @ColumnInfo(defaultValue = "0", name = "period_count")
    private int periodCount;

    @ColumnInfo(name = "run_attempt_count")
    public int runAttemptCount;

    @ColumnInfo(name = "schedule_requested_at")
    public long scheduleRequestedAt;

    @ColumnInfo(name = "state")
    public WorkInfo.State state;

    @ColumnInfo(defaultValue = "-256", name = "stop_reason")
    private final int stopReason;

    @ColumnInfo(name = "trace_tag")
    private String traceTag;

    @ColumnInfo(name = "worker_class_name")
    public String workerClassName;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final long calculateNextRunTime(boolean z10, int i10, BackoffPolicy backoffPolicy, long j10, long j11, int i11, boolean z11, long j12, long j13, long j14, long j15) {
            AbstractC9133u.m16133g(backoffPolicy, "backoffPolicy");
            if (j15 != Long.MAX_VALUE && z11) {
                return i11 == 0 ? j15 : AbstractC8323h.m13511f(j15, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS + j11);
            }
            if (z10) {
                return AbstractC8323h.m13514i(backoffPolicy == BackoffPolicy.LINEAR ? j10 * i10 : (long) Math.scalb(j10, i10 - 1), WorkRequest.MAX_BACKOFF_MILLIS) + j11;
            }
            if (z11) {
                long j16 = i11 == 0 ? j11 + j12 : j11 + j14;
                return (j13 == j14 || i11 != 0) ? j16 : j16 + (j14 - j13);
            }
            if (j11 == -1) {
                return Long.MAX_VALUE;
            }
            return j11 + j12;
        }

        private Companion() {
        }
    }

    public static final class IdAndState {

        /* renamed from: id */
        @ColumnInfo(name = "id")
        public String f2051id;

        @ColumnInfo(name = "state")
        public WorkInfo.State state;

        public IdAndState(String id, WorkInfo.State state) {
            AbstractC9133u.m16133g(id, "id");
            AbstractC9133u.m16133g(state, "state");
            this.f2051id = id;
            this.state = state;
        }

        public static /* synthetic */ IdAndState copy$default(IdAndState idAndState, String str, WorkInfo.State state, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = idAndState.f2051id;
            }
            if ((i10 & 2) != 0) {
                state = idAndState.state;
            }
            return idAndState.copy(str, state);
        }

        public final String component1() {
            return this.f2051id;
        }

        public final WorkInfo.State component2() {
            return this.state;
        }

        public final IdAndState copy(String id, WorkInfo.State state) {
            AbstractC9133u.m16133g(id, "id");
            AbstractC9133u.m16133g(state, "state");
            return new IdAndState(id, state);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IdAndState)) {
                return false;
            }
            IdAndState idAndState = (IdAndState) obj;
            return AbstractC9133u.m16128b(this.f2051id, idAndState.f2051id) && this.state == idAndState.state;
        }

        public int hashCode() {
            return (this.f2051id.hashCode() * 31) + this.state.hashCode();
        }

        public String toString() {
            return "IdAndState(id=" + this.f2051id + ", state=" + this.state + ')';
        }
    }

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("WorkSpec");
        AbstractC9133u.m16132f(strTagWithPrefix, "tagWithPrefix(\"WorkSpec\")");
        TAG = strTagWithPrefix;
        WORK_INFO_MAPPER = new Function() { // from class: androidx.work.impl.model.c
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return WorkSpec.WORK_INFO_MAPPER$lambda$1((List) obj);
            }
        };
    }

    public WorkSpec(String id, WorkInfo.State state, String workerClassName, String inputMergerClassName, Data input, Data output, long j10, long j11, long j12, Constraints constraints, @IntRange(from = 0) int i10, BackoffPolicy backoffPolicy, long j13, long j14, long j15, long j16, boolean z10, OutOfQuotaPolicy outOfQuotaPolicy, int i11, int i12, long j17, int i13, int i14, String str) {
        AbstractC9133u.m16133g(id, "id");
        AbstractC9133u.m16133g(state, "state");
        AbstractC9133u.m16133g(workerClassName, "workerClassName");
        AbstractC9133u.m16133g(inputMergerClassName, "inputMergerClassName");
        AbstractC9133u.m16133g(input, "input");
        AbstractC9133u.m16133g(output, "output");
        AbstractC9133u.m16133g(constraints, "constraints");
        AbstractC9133u.m16133g(backoffPolicy, "backoffPolicy");
        AbstractC9133u.m16133g(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.f2050id = id;
        this.state = state;
        this.workerClassName = workerClassName;
        this.inputMergerClassName = inputMergerClassName;
        this.input = input;
        this.output = output;
        this.initialDelay = j10;
        this.intervalDuration = j11;
        this.flexDuration = j12;
        this.constraints = constraints;
        this.runAttemptCount = i10;
        this.backoffPolicy = backoffPolicy;
        this.backoffDelayDuration = j13;
        this.lastEnqueueTime = j14;
        this.minimumRetentionDuration = j15;
        this.scheduleRequestedAt = j16;
        this.expedited = z10;
        this.outOfQuotaPolicy = outOfQuotaPolicy;
        this.periodCount = i11;
        this.generation = i12;
        this.nextScheduleTimeOverride = j17;
        this.nextScheduleTimeOverrideGeneration = i13;
        this.stopReason = i14;
        this.traceTag = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List WORK_INFO_MAPPER$lambda$1(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((WorkInfoPojo) it.next()).toWorkInfo());
        }
        return arrayList;
    }

    public static /* synthetic */ WorkSpec copy$default(WorkSpec workSpec, String str, WorkInfo.State state, String str2, String str3, Data data, Data data2, long j10, long j11, long j12, Constraints constraints, int i10, BackoffPolicy backoffPolicy, long j13, long j14, long j15, long j16, boolean z10, OutOfQuotaPolicy outOfQuotaPolicy, int i11, int i12, long j17, int i13, int i14, String str4, int i15, Object obj) {
        String str5;
        int i16;
        BackoffPolicy backoffPolicy2;
        long j18;
        long j19;
        long j20;
        long j21;
        OutOfQuotaPolicy outOfQuotaPolicy2;
        int i17;
        int i18;
        long j22;
        WorkInfo.State state2;
        int i19;
        boolean z11;
        String str6;
        String str7;
        Data data3;
        Data data4;
        long j23;
        long j24;
        long j25;
        Constraints constraints2;
        int i20;
        String str8 = (i15 & 1) != 0 ? workSpec.f2050id : str;
        WorkInfo.State state3 = (i15 & 2) != 0 ? workSpec.state : state;
        String str9 = (i15 & 4) != 0 ? workSpec.workerClassName : str2;
        String str10 = (i15 & 8) != 0 ? workSpec.inputMergerClassName : str3;
        Data data5 = (i15 & 16) != 0 ? workSpec.input : data;
        Data data6 = (i15 & 32) != 0 ? workSpec.output : data2;
        long j26 = (i15 & 64) != 0 ? workSpec.initialDelay : j10;
        long j27 = (i15 & 128) != 0 ? workSpec.intervalDuration : j11;
        long j28 = (i15 & 256) != 0 ? workSpec.flexDuration : j12;
        Constraints constraints3 = (i15 & 512) != 0 ? workSpec.constraints : constraints;
        int i21 = (i15 & 1024) != 0 ? workSpec.runAttemptCount : i10;
        String str11 = str8;
        BackoffPolicy backoffPolicy3 = (i15 & 2048) != 0 ? workSpec.backoffPolicy : backoffPolicy;
        WorkInfo.State state4 = state3;
        long j29 = (i15 & 4096) != 0 ? workSpec.backoffDelayDuration : j13;
        long j30 = (i15 & 8192) != 0 ? workSpec.lastEnqueueTime : j14;
        long j31 = (i15 & 16384) != 0 ? workSpec.minimumRetentionDuration : j15;
        long j32 = (i15 & 32768) != 0 ? workSpec.scheduleRequestedAt : j16;
        boolean z12 = (i15 & 65536) != 0 ? workSpec.expedited : z10;
        long j33 = j32;
        OutOfQuotaPolicy outOfQuotaPolicy3 = (i15 & 131072) != 0 ? workSpec.outOfQuotaPolicy : outOfQuotaPolicy;
        int i22 = (i15 & 262144) != 0 ? workSpec.periodCount : i11;
        OutOfQuotaPolicy outOfQuotaPolicy4 = outOfQuotaPolicy3;
        int i23 = (i15 & 524288) != 0 ? workSpec.generation : i12;
        int i24 = i22;
        long j34 = (i15 & 1048576) != 0 ? workSpec.nextScheduleTimeOverride : j17;
        int i25 = (i15 & 2097152) != 0 ? workSpec.nextScheduleTimeOverrideGeneration : i13;
        int i26 = (i15 & 4194304) != 0 ? workSpec.stopReason : i14;
        if ((i15 & 8388608) != 0) {
            i16 = i25;
            str5 = workSpec.traceTag;
            j18 = j29;
            j19 = j30;
            j20 = j31;
            j21 = j33;
            outOfQuotaPolicy2 = outOfQuotaPolicy4;
            i17 = i24;
            i18 = i23;
            j22 = j34;
            state2 = state4;
            i19 = i26;
            z11 = z12;
            str6 = str9;
            str7 = str10;
            data3 = data5;
            data4 = data6;
            j23 = j26;
            j24 = j27;
            j25 = j28;
            constraints2 = constraints3;
            i20 = i21;
            backoffPolicy2 = backoffPolicy3;
        } else {
            str5 = str4;
            i16 = i25;
            backoffPolicy2 = backoffPolicy3;
            j18 = j29;
            j19 = j30;
            j20 = j31;
            j21 = j33;
            outOfQuotaPolicy2 = outOfQuotaPolicy4;
            i17 = i24;
            i18 = i23;
            j22 = j34;
            state2 = state4;
            i19 = i26;
            z11 = z12;
            str6 = str9;
            str7 = str10;
            data3 = data5;
            data4 = data6;
            j23 = j26;
            j24 = j27;
            j25 = j28;
            constraints2 = constraints3;
            i20 = i21;
        }
        return workSpec.copy(str11, state2, str6, str7, data3, data4, j23, j24, j25, constraints2, i20, backoffPolicy2, j18, j19, j20, j21, z11, outOfQuotaPolicy2, i17, i18, j22, i16, i19, str5);
    }

    public final long calculateNextRunTime() {
        return Companion.calculateNextRunTime(isBackedOff(), this.runAttemptCount, this.backoffPolicy, this.backoffDelayDuration, this.lastEnqueueTime, this.periodCount, isPeriodic(), this.initialDelay, this.flexDuration, this.intervalDuration, this.nextScheduleTimeOverride);
    }

    public final String component1() {
        return this.f2050id;
    }

    public final Constraints component10() {
        return this.constraints;
    }

    public final int component11() {
        return this.runAttemptCount;
    }

    public final BackoffPolicy component12() {
        return this.backoffPolicy;
    }

    public final long component13() {
        return this.backoffDelayDuration;
    }

    public final long component14() {
        return this.lastEnqueueTime;
    }

    public final long component15() {
        return this.minimumRetentionDuration;
    }

    public final long component16() {
        return this.scheduleRequestedAt;
    }

    public final boolean component17() {
        return this.expedited;
    }

    public final OutOfQuotaPolicy component18() {
        return this.outOfQuotaPolicy;
    }

    public final int component19() {
        return this.periodCount;
    }

    public final WorkInfo.State component2() {
        return this.state;
    }

    public final int component20() {
        return this.generation;
    }

    public final long component21() {
        return this.nextScheduleTimeOverride;
    }

    public final int component22() {
        return this.nextScheduleTimeOverrideGeneration;
    }

    public final int component23() {
        return this.stopReason;
    }

    public final String component24() {
        return this.traceTag;
    }

    public final String component3() {
        return this.workerClassName;
    }

    public final String component4() {
        return this.inputMergerClassName;
    }

    public final Data component5() {
        return this.input;
    }

    public final Data component6() {
        return this.output;
    }

    public final long component7() {
        return this.initialDelay;
    }

    public final long component8() {
        return this.intervalDuration;
    }

    public final long component9() {
        return this.flexDuration;
    }

    public final WorkSpec copy(String id, WorkInfo.State state, String workerClassName, String inputMergerClassName, Data input, Data output, long j10, long j11, long j12, Constraints constraints, @IntRange(from = 0) int i10, BackoffPolicy backoffPolicy, long j13, long j14, long j15, long j16, boolean z10, OutOfQuotaPolicy outOfQuotaPolicy, int i11, int i12, long j17, int i13, int i14, String str) {
        AbstractC9133u.m16133g(id, "id");
        AbstractC9133u.m16133g(state, "state");
        AbstractC9133u.m16133g(workerClassName, "workerClassName");
        AbstractC9133u.m16133g(inputMergerClassName, "inputMergerClassName");
        AbstractC9133u.m16133g(input, "input");
        AbstractC9133u.m16133g(output, "output");
        AbstractC9133u.m16133g(constraints, "constraints");
        AbstractC9133u.m16133g(backoffPolicy, "backoffPolicy");
        AbstractC9133u.m16133g(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new WorkSpec(id, state, workerClassName, inputMergerClassName, input, output, j10, j11, j12, constraints, i10, backoffPolicy, j13, j14, j15, j16, z10, outOfQuotaPolicy, i11, i12, j17, i13, i14, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkSpec)) {
            return false;
        }
        WorkSpec workSpec = (WorkSpec) obj;
        return AbstractC9133u.m16128b(this.f2050id, workSpec.f2050id) && this.state == workSpec.state && AbstractC9133u.m16128b(this.workerClassName, workSpec.workerClassName) && AbstractC9133u.m16128b(this.inputMergerClassName, workSpec.inputMergerClassName) && AbstractC9133u.m16128b(this.input, workSpec.input) && AbstractC9133u.m16128b(this.output, workSpec.output) && this.initialDelay == workSpec.initialDelay && this.intervalDuration == workSpec.intervalDuration && this.flexDuration == workSpec.flexDuration && AbstractC9133u.m16128b(this.constraints, workSpec.constraints) && this.runAttemptCount == workSpec.runAttemptCount && this.backoffPolicy == workSpec.backoffPolicy && this.backoffDelayDuration == workSpec.backoffDelayDuration && this.lastEnqueueTime == workSpec.lastEnqueueTime && this.minimumRetentionDuration == workSpec.minimumRetentionDuration && this.scheduleRequestedAt == workSpec.scheduleRequestedAt && this.expedited == workSpec.expedited && this.outOfQuotaPolicy == workSpec.outOfQuotaPolicy && this.periodCount == workSpec.periodCount && this.generation == workSpec.generation && this.nextScheduleTimeOverride == workSpec.nextScheduleTimeOverride && this.nextScheduleTimeOverrideGeneration == workSpec.nextScheduleTimeOverrideGeneration && this.stopReason == workSpec.stopReason && AbstractC9133u.m16128b(this.traceTag, workSpec.traceTag);
    }

    public final int getGeneration() {
        return this.generation;
    }

    public final long getNextScheduleTimeOverride() {
        return this.nextScheduleTimeOverride;
    }

    public final int getNextScheduleTimeOverrideGeneration() {
        return this.nextScheduleTimeOverrideGeneration;
    }

    public final int getPeriodCount() {
        return this.periodCount;
    }

    public final int getStopReason() {
        return this.stopReason;
    }

    public final String getTraceTag() {
        return this.traceTag;
    }

    public final boolean hasConstraints() {
        return !AbstractC9133u.m16128b(Constraints.NONE, this.constraints);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((this.f2050id.hashCode() * 31) + this.state.hashCode()) * 31) + this.workerClassName.hashCode()) * 31) + this.inputMergerClassName.hashCode()) * 31) + this.input.hashCode()) * 31) + this.output.hashCode()) * 31) + Long.hashCode(this.initialDelay)) * 31) + Long.hashCode(this.intervalDuration)) * 31) + Long.hashCode(this.flexDuration)) * 31) + this.constraints.hashCode()) * 31) + Integer.hashCode(this.runAttemptCount)) * 31) + this.backoffPolicy.hashCode()) * 31) + Long.hashCode(this.backoffDelayDuration)) * 31) + Long.hashCode(this.lastEnqueueTime)) * 31) + Long.hashCode(this.minimumRetentionDuration)) * 31) + Long.hashCode(this.scheduleRequestedAt)) * 31) + Boolean.hashCode(this.expedited)) * 31) + this.outOfQuotaPolicy.hashCode()) * 31) + Integer.hashCode(this.periodCount)) * 31) + Integer.hashCode(this.generation)) * 31) + Long.hashCode(this.nextScheduleTimeOverride)) * 31) + Integer.hashCode(this.nextScheduleTimeOverrideGeneration)) * 31) + Integer.hashCode(this.stopReason)) * 31;
        String str = this.traceTag;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean isBackedOff() {
        return this.state == WorkInfo.State.ENQUEUED && this.runAttemptCount > 0;
    }

    public final boolean isPeriodic() {
        return this.intervalDuration != 0;
    }

    public final void setBackoffDelayDuration(long j10) {
        if (j10 > WorkRequest.MAX_BACKOFF_MILLIS) {
            Logger.get().warning(TAG, "Backoff delay duration exceeds maximum value");
        }
        if (j10 < WorkRequest.MIN_BACKOFF_MILLIS) {
            Logger.get().warning(TAG, "Backoff delay duration less than minimum value");
        }
        this.backoffDelayDuration = AbstractC8323h.m13520o(j10, WorkRequest.MIN_BACKOFF_MILLIS, WorkRequest.MAX_BACKOFF_MILLIS);
    }

    public final void setNextScheduleTimeOverride(long j10) {
        this.nextScheduleTimeOverride = j10;
    }

    public final void setNextScheduleTimeOverrideGeneration(int i10) {
        this.nextScheduleTimeOverrideGeneration = i10;
    }

    public final void setPeriodCount(int i10) {
        this.periodCount = i10;
    }

    public final void setPeriodic(long j10) {
        if (j10 < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            Logger.get().warning(TAG, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        setPeriodic(AbstractC8323h.m13511f(j10, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS), AbstractC8323h.m13511f(j10, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS));
    }

    public final void setTraceTag(String str) {
        this.traceTag = str;
    }

    public String toString() {
        return "{WorkSpec: " + this.f2050id + '}';
    }

    public final void setPeriodic(long j10, long j11) {
        if (j10 < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            Logger.get().warning(TAG, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.intervalDuration = AbstractC8323h.m13511f(j10, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS);
        if (j11 < PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
            Logger.get().warning(TAG, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j11 > this.intervalDuration) {
            Logger.get().warning(TAG, "Flex duration greater than interval duration; Changed to " + j10);
        }
        this.flexDuration = AbstractC8323h.m13520o(j11, PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS, this.intervalDuration);
    }

    public static final class WorkInfoPojo {

        @ColumnInfo(name = "backoff_delay_duration")
        private long backoffDelayDuration;

        @ColumnInfo(name = "backoff_policy")
        private BackoffPolicy backoffPolicy;

        @Embedded
        private final Constraints constraints;

        @ColumnInfo(name = "flex_duration")
        private final long flexDuration;

        @ColumnInfo(name = "generation")
        private final int generation;

        /* renamed from: id */
        @ColumnInfo(name = "id")
        private final String f2052id;

        @ColumnInfo(name = "initial_delay")
        private final long initialDelay;

        @ColumnInfo(name = "interval_duration")
        private final long intervalDuration;

        @ColumnInfo(name = "last_enqueue_time")
        private long lastEnqueueTime;

        @ColumnInfo(name = "next_schedule_time_override")
        private final long nextScheduleTimeOverride;

        @ColumnInfo(name = "output")
        private final Data output;

        @ColumnInfo(defaultValue = "0", name = "period_count")
        private int periodCount;

        @Relation(entity = WorkProgress.class, entityColumn = "work_spec_id", parentColumn = "id", projection = {"progress"})
        private final List<Data> progress;

        @ColumnInfo(name = "run_attempt_count")
        private final int runAttemptCount;

        @ColumnInfo(name = "state")
        private final WorkInfo.State state;

        @ColumnInfo(name = "stop_reason")
        private final int stopReason;

        @Relation(entity = WorkTag.class, entityColumn = "work_spec_id", parentColumn = "id", projection = {"tag"})
        private final List<String> tags;

        public WorkInfoPojo(String id, WorkInfo.State state, Data output, long j10, long j11, long j12, Constraints constraints, int i10, BackoffPolicy backoffPolicy, long j13, long j14, int i11, int i12, long j15, int i13, List<String> tags, List<Data> progress) {
            AbstractC9133u.m16133g(id, "id");
            AbstractC9133u.m16133g(state, "state");
            AbstractC9133u.m16133g(output, "output");
            AbstractC9133u.m16133g(constraints, "constraints");
            AbstractC9133u.m16133g(backoffPolicy, "backoffPolicy");
            AbstractC9133u.m16133g(tags, "tags");
            AbstractC9133u.m16133g(progress, "progress");
            this.f2052id = id;
            this.state = state;
            this.output = output;
            this.initialDelay = j10;
            this.intervalDuration = j11;
            this.flexDuration = j12;
            this.constraints = constraints;
            this.runAttemptCount = i10;
            this.backoffPolicy = backoffPolicy;
            this.backoffDelayDuration = j13;
            this.lastEnqueueTime = j14;
            this.periodCount = i11;
            this.generation = i12;
            this.nextScheduleTimeOverride = j15;
            this.stopReason = i13;
            this.tags = tags;
            this.progress = progress;
        }

        private final long calculateNextRunTimeMillis() {
            if (this.state == WorkInfo.State.ENQUEUED) {
                return WorkSpec.Companion.calculateNextRunTime(isBackedOff(), this.runAttemptCount, this.backoffPolicy, this.backoffDelayDuration, this.lastEnqueueTime, this.periodCount, isPeriodic(), this.initialDelay, this.flexDuration, this.intervalDuration, this.nextScheduleTimeOverride);
            }
            return Long.MAX_VALUE;
        }

        public static /* synthetic */ WorkInfoPojo copy$default(WorkInfoPojo workInfoPojo, String str, WorkInfo.State state, Data data, long j10, long j11, long j12, Constraints constraints, int i10, BackoffPolicy backoffPolicy, long j13, long j14, int i11, int i12, long j15, int i13, List list, List list2, int i14, Object obj) {
            String str2 = (i14 & 1) != 0 ? workInfoPojo.f2052id : str;
            WorkInfo.State state2 = (i14 & 2) != 0 ? workInfoPojo.state : state;
            return workInfoPojo.copy(str2, state2, (i14 & 4) != 0 ? workInfoPojo.output : data, (i14 & 8) != 0 ? workInfoPojo.initialDelay : j10, (i14 & 16) != 0 ? workInfoPojo.intervalDuration : j11, (i14 & 32) != 0 ? workInfoPojo.flexDuration : j12, (i14 & 64) != 0 ? workInfoPojo.constraints : constraints, (i14 & 128) != 0 ? workInfoPojo.runAttemptCount : i10, (i14 & 256) != 0 ? workInfoPojo.backoffPolicy : backoffPolicy, (i14 & 512) != 0 ? workInfoPojo.backoffDelayDuration : j13, (i14 & 1024) != 0 ? workInfoPojo.lastEnqueueTime : j14, (i14 & 2048) != 0 ? workInfoPojo.periodCount : i11, (i14 & 4096) != 0 ? workInfoPojo.generation : i12, (i14 & 8192) != 0 ? workInfoPojo.nextScheduleTimeOverride : j15, (i14 & 16384) != 0 ? workInfoPojo.stopReason : i13, (32768 & i14) != 0 ? workInfoPojo.tags : list, (i14 & 65536) != 0 ? workInfoPojo.progress : list2);
        }

        private final WorkInfo.PeriodicityInfo getPeriodicityOrNull() {
            long j10 = this.intervalDuration;
            if (j10 != 0) {
                return new WorkInfo.PeriodicityInfo(j10, this.flexDuration);
            }
            return null;
        }

        public final String component1() {
            return this.f2052id;
        }

        public final long component10() {
            return this.backoffDelayDuration;
        }

        public final long component11() {
            return this.lastEnqueueTime;
        }

        public final int component12() {
            return this.periodCount;
        }

        public final int component13() {
            return this.generation;
        }

        public final long component14() {
            return this.nextScheduleTimeOverride;
        }

        public final int component15() {
            return this.stopReason;
        }

        public final List<String> component16() {
            return this.tags;
        }

        public final List<Data> component17() {
            return this.progress;
        }

        public final WorkInfo.State component2() {
            return this.state;
        }

        public final Data component3() {
            return this.output;
        }

        public final long component4() {
            return this.initialDelay;
        }

        public final long component5() {
            return this.intervalDuration;
        }

        public final long component6() {
            return this.flexDuration;
        }

        public final Constraints component7() {
            return this.constraints;
        }

        public final int component8() {
            return this.runAttemptCount;
        }

        public final BackoffPolicy component9() {
            return this.backoffPolicy;
        }

        public final WorkInfoPojo copy(String id, WorkInfo.State state, Data output, long j10, long j11, long j12, Constraints constraints, int i10, BackoffPolicy backoffPolicy, long j13, long j14, int i11, int i12, long j15, int i13, List<String> tags, List<Data> progress) {
            AbstractC9133u.m16133g(id, "id");
            AbstractC9133u.m16133g(state, "state");
            AbstractC9133u.m16133g(output, "output");
            AbstractC9133u.m16133g(constraints, "constraints");
            AbstractC9133u.m16133g(backoffPolicy, "backoffPolicy");
            AbstractC9133u.m16133g(tags, "tags");
            AbstractC9133u.m16133g(progress, "progress");
            return new WorkInfoPojo(id, state, output, j10, j11, j12, constraints, i10, backoffPolicy, j13, j14, i11, i12, j15, i13, tags, progress);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WorkInfoPojo)) {
                return false;
            }
            WorkInfoPojo workInfoPojo = (WorkInfoPojo) obj;
            return AbstractC9133u.m16128b(this.f2052id, workInfoPojo.f2052id) && this.state == workInfoPojo.state && AbstractC9133u.m16128b(this.output, workInfoPojo.output) && this.initialDelay == workInfoPojo.initialDelay && this.intervalDuration == workInfoPojo.intervalDuration && this.flexDuration == workInfoPojo.flexDuration && AbstractC9133u.m16128b(this.constraints, workInfoPojo.constraints) && this.runAttemptCount == workInfoPojo.runAttemptCount && this.backoffPolicy == workInfoPojo.backoffPolicy && this.backoffDelayDuration == workInfoPojo.backoffDelayDuration && this.lastEnqueueTime == workInfoPojo.lastEnqueueTime && this.periodCount == workInfoPojo.periodCount && this.generation == workInfoPojo.generation && this.nextScheduleTimeOverride == workInfoPojo.nextScheduleTimeOverride && this.stopReason == workInfoPojo.stopReason && AbstractC9133u.m16128b(this.tags, workInfoPojo.tags) && AbstractC9133u.m16128b(this.progress, workInfoPojo.progress);
        }

        public final long getBackoffDelayDuration() {
            return this.backoffDelayDuration;
        }

        public final BackoffPolicy getBackoffPolicy() {
            return this.backoffPolicy;
        }

        public final Constraints getConstraints() {
            return this.constraints;
        }

        public final long getFlexDuration() {
            return this.flexDuration;
        }

        public final int getGeneration() {
            return this.generation;
        }

        public final String getId() {
            return this.f2052id;
        }

        public final long getInitialDelay() {
            return this.initialDelay;
        }

        public final long getIntervalDuration() {
            return this.intervalDuration;
        }

        public final long getLastEnqueueTime() {
            return this.lastEnqueueTime;
        }

        public final long getNextScheduleTimeOverride() {
            return this.nextScheduleTimeOverride;
        }

        public final Data getOutput() {
            return this.output;
        }

        public final int getPeriodCount() {
            return this.periodCount;
        }

        public final List<Data> getProgress() {
            return this.progress;
        }

        public final int getRunAttemptCount() {
            return this.runAttemptCount;
        }

        public final WorkInfo.State getState() {
            return this.state;
        }

        public final int getStopReason() {
            return this.stopReason;
        }

        public final List<String> getTags() {
            return this.tags;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((this.f2052id.hashCode() * 31) + this.state.hashCode()) * 31) + this.output.hashCode()) * 31) + Long.hashCode(this.initialDelay)) * 31) + Long.hashCode(this.intervalDuration)) * 31) + Long.hashCode(this.flexDuration)) * 31) + this.constraints.hashCode()) * 31) + Integer.hashCode(this.runAttemptCount)) * 31) + this.backoffPolicy.hashCode()) * 31) + Long.hashCode(this.backoffDelayDuration)) * 31) + Long.hashCode(this.lastEnqueueTime)) * 31) + Integer.hashCode(this.periodCount)) * 31) + Integer.hashCode(this.generation)) * 31) + Long.hashCode(this.nextScheduleTimeOverride)) * 31) + Integer.hashCode(this.stopReason)) * 31) + this.tags.hashCode()) * 31) + this.progress.hashCode();
        }

        public final boolean isBackedOff() {
            return this.state == WorkInfo.State.ENQUEUED && this.runAttemptCount > 0;
        }

        public final boolean isPeriodic() {
            return this.intervalDuration != 0;
        }

        public final void setBackoffDelayDuration(long j10) {
            this.backoffDelayDuration = j10;
        }

        public final void setBackoffPolicy(BackoffPolicy backoffPolicy) {
            AbstractC9133u.m16133g(backoffPolicy, "<set-?>");
            this.backoffPolicy = backoffPolicy;
        }

        public final void setLastEnqueueTime(long j10) {
            this.lastEnqueueTime = j10;
        }

        public final void setPeriodCount(int i10) {
            this.periodCount = i10;
        }

        public String toString() {
            return "WorkInfoPojo(id=" + this.f2052id + ", state=" + this.state + ", output=" + this.output + ", initialDelay=" + this.initialDelay + ", intervalDuration=" + this.intervalDuration + ", flexDuration=" + this.flexDuration + ", constraints=" + this.constraints + ", runAttemptCount=" + this.runAttemptCount + ", backoffPolicy=" + this.backoffPolicy + ", backoffDelayDuration=" + this.backoffDelayDuration + ", lastEnqueueTime=" + this.lastEnqueueTime + ", periodCount=" + this.periodCount + ", generation=" + this.generation + ", nextScheduleTimeOverride=" + this.nextScheduleTimeOverride + ", stopReason=" + this.stopReason + ", tags=" + this.tags + ", progress=" + this.progress + ')';
        }

        public final WorkInfo toWorkInfo() {
            Data data = !this.progress.isEmpty() ? this.progress.get(0) : Data.EMPTY;
            UUID uuidFromString = UUID.fromString(this.f2052id);
            AbstractC9133u.m16132f(uuidFromString, "fromString(id)");
            return new WorkInfo(uuidFromString, this.state, new HashSet(this.tags), this.output, data, this.runAttemptCount, this.generation, this.constraints, this.initialDelay, getPeriodicityOrNull(), calculateNextRunTimeMillis(), this.stopReason);
        }

        public /* synthetic */ WorkInfoPojo(String str, WorkInfo.State state, Data data, long j10, long j11, long j12, Constraints constraints, int i10, BackoffPolicy backoffPolicy, long j13, long j14, int i11, int i12, long j15, int i13, List list, List list2, int i14, AbstractC9126n abstractC9126n) {
            this(str, state, data, (i14 & 8) != 0 ? 0L : j10, (i14 & 16) != 0 ? 0L : j11, (i14 & 32) != 0 ? 0L : j12, constraints, i10, (i14 & 256) != 0 ? BackoffPolicy.EXPONENTIAL : backoffPolicy, (i14 & 512) != 0 ? 30000L : j13, (i14 & 1024) != 0 ? 0L : j14, (i14 & 2048) != 0 ? 0 : i11, i12, j15, i13, list, list2);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WorkSpec(String str, WorkInfo.State state, String str2, String str3, Data data, Data data2, long j10, long j11, long j12, Constraints constraints, int i10, BackoffPolicy backoffPolicy, long j13, long j14, long j15, long j16, boolean z10, OutOfQuotaPolicy outOfQuotaPolicy, int i11, int i12, long j17, int i13, int i14, String str4, int i15, AbstractC9126n abstractC9126n) {
        String str5;
        WorkInfo.State state2 = (i15 & 2) != 0 ? WorkInfo.State.ENQUEUED : state;
        if ((i15 & 8) != 0) {
            String name = OverwritingInputMerger.class.getName();
            AbstractC9133u.m16132f(name, "OverwritingInputMerger::class.java.name");
            str5 = name;
        } else {
            str5 = str3;
        }
        this(str, state2, str2, str5, (i15 & 16) != 0 ? Data.EMPTY : data, (i15 & 32) != 0 ? Data.EMPTY : data2, (i15 & 64) != 0 ? 0L : j10, (i15 & 128) != 0 ? 0L : j11, (i15 & 256) != 0 ? 0L : j12, (i15 & 512) != 0 ? Constraints.NONE : constraints, (i15 & 1024) != 0 ? 0 : i10, (i15 & 2048) != 0 ? BackoffPolicy.EXPONENTIAL : backoffPolicy, (i15 & 4096) != 0 ? WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS : j13, (i15 & 8192) != 0 ? -1L : j14, (i15 & 16384) == 0 ? j15 : 0L, (32768 & i15) != 0 ? -1L : j16, (65536 & i15) != 0 ? false : z10, (131072 & i15) != 0 ? OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST : outOfQuotaPolicy, (262144 & i15) != 0 ? 0 : i11, (524288 & i15) != 0 ? 0 : i12, (1048576 & i15) != 0 ? Long.MAX_VALUE : j17, (2097152 & i15) != 0 ? 0 : i13, (4194304 & i15) != 0 ? -256 : i14, (i15 & 8388608) != 0 ? null : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkSpec(String id, String workerClassName_) {
        this(id, null, workerClassName_, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, 16777210, null);
        AbstractC9133u.m16133g(id, "id");
        AbstractC9133u.m16133g(workerClassName_, "workerClassName_");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkSpec(String newId, WorkSpec other) {
        this(newId, other.state, other.workerClassName, other.inputMergerClassName, new Data(other.input), new Data(other.output), other.initialDelay, other.intervalDuration, other.flexDuration, new Constraints(other.constraints), other.runAttemptCount, other.backoffPolicy, other.backoffDelayDuration, other.lastEnqueueTime, other.minimumRetentionDuration, other.scheduleRequestedAt, other.expedited, other.outOfQuotaPolicy, other.periodCount, 0, other.nextScheduleTimeOverride, other.nextScheduleTimeOverrideGeneration, other.stopReason, other.traceTag, 524288, null);
        AbstractC9133u.m16133g(newId, "newId");
        AbstractC9133u.m16133g(other, "other");
    }
}
