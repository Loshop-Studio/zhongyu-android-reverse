package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.DurationApi26Impl;
import com.alibaba.android.arouter.utils.Consts;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10793c0;
import p310qd.AbstractC10797e0;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10983y0;

/* loaded from: classes3.dex */
public abstract class WorkRequest {
    public static final Companion Companion = new Companion(null);
    public static final long DEFAULT_BACKOFF_DELAY_MILLIS = 30000;

    @SuppressLint({"MinMaxConstant"})
    public static final long MAX_BACKOFF_MILLIS = 18000000;
    private static final int MAX_TRACE_SPAN_LENGTH = 127;

    @SuppressLint({"MinMaxConstant"})
    public static final long MIN_BACKOFF_MILLIS = 10000;

    /* renamed from: id */
    private final UUID f2100id;
    private final Set<String> tags;
    private final WorkSpec workSpec;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String deriveTraceTagFromClassName(String str) {
            List listM23091I0 = AbstractC10793c0.m23091I0(str, new String[]{Consts.DOT}, false, 0, 6, null);
            String str2 = listM23091I0.size() == 1 ? (String) listM23091I0.get(0) : (String) AbstractC10947g0.m23956y0(listM23091I0);
            return str2.length() <= WorkRequest.MAX_TRACE_SPAN_LENGTH ? str2 : AbstractC10797e0.m23172i1(str2, WorkRequest.MAX_TRACE_SPAN_LENGTH);
        }

        private Companion() {
        }
    }

    public WorkRequest(UUID id2, WorkSpec workSpec, Set<String> tags) {
        AbstractC9979u.m20294g(id2, "id");
        AbstractC9979u.m20294g(workSpec, "workSpec");
        AbstractC9979u.m20294g(tags, "tags");
        this.f2100id = id2;
        this.workSpec = workSpec;
        this.tags = tags;
    }

    public UUID getId() {
        return this.f2100id;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final String getStringId() {
        String string = getId().toString();
        AbstractC9979u.m20293f(string, "id.toString()");
        return string;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Set<String> getTags() {
        return this.tags;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final WorkSpec getWorkSpec() {
        return this.workSpec;
    }

    public static abstract class Builder<B extends Builder<B, ?>, W extends WorkRequest> {
        private boolean backoffCriteriaSet;

        /* renamed from: id */
        private UUID f2101id;
        private final Set<String> tags;
        private WorkSpec workSpec;
        private final Class<? extends ListenableWorker> workerClass;

        public Builder(Class<? extends ListenableWorker> workerClass) {
            AbstractC9979u.m20294g(workerClass, "workerClass");
            this.workerClass = workerClass;
            UUID uuidRandomUUID = UUID.randomUUID();
            AbstractC9979u.m20293f(uuidRandomUUID, "randomUUID()");
            this.f2101id = uuidRandomUUID;
            String string = this.f2101id.toString();
            AbstractC9979u.m20293f(string, "id.toString()");
            String name = workerClass.getName();
            AbstractC9979u.m20293f(name, "workerClass.name");
            this.workSpec = new WorkSpec(string, name);
            String name2 = workerClass.getName();
            AbstractC9979u.m20293f(name2, "workerClass.name");
            this.tags = AbstractC10983y0.m24162h(name2);
        }

        public final B addTag(String tag) {
            AbstractC9979u.m20294g(tag, "tag");
            this.tags.add(tag);
            return (B) getThisObject$work_runtime_release();
        }

        public final W build() {
            W w10 = (W) buildInternal$work_runtime_release();
            Constraints constraints = this.workSpec.constraints;
            boolean z10 = constraints.hasContentUriTriggers() || constraints.requiresBatteryNotLow() || constraints.requiresCharging() || constraints.requiresDeviceIdle();
            WorkSpec workSpec = this.workSpec;
            if (workSpec.expedited) {
                if (z10) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (workSpec.initialDelay > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            if (workSpec.getTraceTag() == null) {
                WorkSpec workSpec2 = this.workSpec;
                workSpec2.setTraceTag(WorkRequest.Companion.deriveTraceTagFromClassName(workSpec2.workerClassName));
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            AbstractC9979u.m20293f(uuidRandomUUID, "randomUUID()");
            setId(uuidRandomUUID);
            return w10;
        }

        public abstract W buildInternal$work_runtime_release();

        public final boolean getBackoffCriteriaSet$work_runtime_release() {
            return this.backoffCriteriaSet;
        }

        public final UUID getId$work_runtime_release() {
            return this.f2101id;
        }

        public final Set<String> getTags$work_runtime_release() {
            return this.tags;
        }

        public abstract B getThisObject$work_runtime_release();

        public final WorkSpec getWorkSpec$work_runtime_release() {
            return this.workSpec;
        }

        public final Class<? extends ListenableWorker> getWorkerClass$work_runtime_release() {
            return this.workerClass;
        }

        public final B keepResultsForAtLeast(long j10, TimeUnit timeUnit) {
            AbstractC9979u.m20294g(timeUnit, "timeUnit");
            this.workSpec.minimumRetentionDuration = timeUnit.toMillis(j10);
            return (B) getThisObject$work_runtime_release();
        }

        public final B setBackoffCriteria(BackoffPolicy backoffPolicy, long j10, TimeUnit timeUnit) {
            AbstractC9979u.m20294g(backoffPolicy, "backoffPolicy");
            AbstractC9979u.m20294g(timeUnit, "timeUnit");
            this.backoffCriteriaSet = true;
            WorkSpec workSpec = this.workSpec;
            workSpec.backoffPolicy = backoffPolicy;
            workSpec.setBackoffDelayDuration(timeUnit.toMillis(j10));
            return (B) getThisObject$work_runtime_release();
        }

        public final void setBackoffCriteriaSet$work_runtime_release(boolean z10) {
            this.backoffCriteriaSet = z10;
        }

        public final B setConstraints(Constraints constraints) {
            AbstractC9979u.m20294g(constraints, "constraints");
            this.workSpec.constraints = constraints;
            return (B) getThisObject$work_runtime_release();
        }

        @SuppressLint({"MissingGetterMatchingBuilder"})
        public B setExpedited(OutOfQuotaPolicy policy) {
            AbstractC9979u.m20294g(policy, "policy");
            WorkSpec workSpec = this.workSpec;
            workSpec.expedited = true;
            workSpec.outOfQuotaPolicy = policy;
            return (B) getThisObject$work_runtime_release();
        }

        public final B setId(UUID id2) {
            AbstractC9979u.m20294g(id2, "id");
            this.f2101id = id2;
            String string = id2.toString();
            AbstractC9979u.m20293f(string, "id.toString()");
            this.workSpec = new WorkSpec(string, this.workSpec);
            return (B) getThisObject$work_runtime_release();
        }

        public final void setId$work_runtime_release(UUID uuid) {
            AbstractC9979u.m20294g(uuid, "<set-?>");
            this.f2101id = uuid;
        }

        public B setInitialDelay(long j10, TimeUnit timeUnit) {
            AbstractC9979u.m20294g(timeUnit, "timeUnit");
            this.workSpec.initialDelay = timeUnit.toMillis(j10);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.workSpec.initialDelay) {
                return (B) getThisObject$work_runtime_release();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @VisibleForTesting
        public final B setInitialRunAttemptCount(int i10) {
            this.workSpec.runAttemptCount = i10;
            return (B) getThisObject$work_runtime_release();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @VisibleForTesting
        public final B setInitialState(WorkInfo.State state) {
            AbstractC9979u.m20294g(state, "state");
            this.workSpec.state = state;
            return (B) getThisObject$work_runtime_release();
        }

        public final B setInputData(Data inputData) {
            AbstractC9979u.m20294g(inputData, "inputData");
            this.workSpec.input = inputData;
            return (B) getThisObject$work_runtime_release();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @VisibleForTesting
        public final B setLastEnqueueTime(long j10, TimeUnit timeUnit) {
            AbstractC9979u.m20294g(timeUnit, "timeUnit");
            this.workSpec.lastEnqueueTime = timeUnit.toMillis(j10);
            return (B) getThisObject$work_runtime_release();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @VisibleForTesting
        public final B setScheduleRequestedAt(long j10, TimeUnit timeUnit) {
            AbstractC9979u.m20294g(timeUnit, "timeUnit");
            this.workSpec.scheduleRequestedAt = timeUnit.toMillis(j10);
            return (B) getThisObject$work_runtime_release();
        }

        public final B setTraceTag(String traceTag) {
            AbstractC9979u.m20294g(traceTag, "traceTag");
            this.workSpec.setTraceTag(traceTag);
            return (B) getThisObject$work_runtime_release();
        }

        public final void setWorkSpec$work_runtime_release(WorkSpec workSpec) {
            AbstractC9979u.m20294g(workSpec, "<set-?>");
            this.workSpec = workSpec;
        }

        @RequiresApi(26)
        public final B keepResultsForAtLeast(Duration duration) {
            AbstractC9979u.m20294g(duration, "duration");
            this.workSpec.minimumRetentionDuration = DurationApi26Impl.toMillisCompat(duration);
            return (B) getThisObject$work_runtime_release();
        }

        @RequiresApi(26)
        public final B setBackoffCriteria(BackoffPolicy backoffPolicy, Duration duration) {
            AbstractC9979u.m20294g(backoffPolicy, "backoffPolicy");
            AbstractC9979u.m20294g(duration, "duration");
            this.backoffCriteriaSet = true;
            WorkSpec workSpec = this.workSpec;
            workSpec.backoffPolicy = backoffPolicy;
            workSpec.setBackoffDelayDuration(DurationApi26Impl.toMillisCompat(duration));
            return (B) getThisObject$work_runtime_release();
        }

        @RequiresApi(26)
        public B setInitialDelay(Duration duration) {
            AbstractC9979u.m20294g(duration, "duration");
            this.workSpec.initialDelay = DurationApi26Impl.toMillisCompat(duration);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.workSpec.initialDelay) {
                return (B) getThisObject$work_runtime_release();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }
}
