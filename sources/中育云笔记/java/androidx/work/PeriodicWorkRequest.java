package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.RequiresApi;
import androidx.work.WorkRequest;
import androidx.work.impl.utils.DurationApi26Impl;
import gd.AbstractC9293a;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p280od.InterfaceC10469c;

/* loaded from: classes3.dex */
public final class PeriodicWorkRequest extends WorkRequest {
    public static final Companion Companion = new Companion(null);

    @SuppressLint({"MinMaxConstant"})
    public static final long MIN_PERIODIC_FLEX_MILLIS = 300000;

    @SuppressLint({"MinMaxConstant"})
    public static final long MIN_PERIODIC_INTERVAL_MILLIS = 900000;

    public static final class Builder extends WorkRequest.Builder<Builder, PeriodicWorkRequest> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(Class<? extends ListenableWorker> workerClass, long j10, TimeUnit repeatIntervalTimeUnit) {
            super(workerClass);
            AbstractC9979u.m20294g(workerClass, "workerClass");
            AbstractC9979u.m20294g(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
            getWorkSpec$work_runtime_release().setPeriodic(repeatIntervalTimeUnit.toMillis(j10));
        }

        public final Builder clearNextScheduleTimeOverride() {
            getWorkSpec$work_runtime_release().setNextScheduleTimeOverride(Long.MAX_VALUE);
            getWorkSpec$work_runtime_release().setNextScheduleTimeOverrideGeneration(1);
            return this;
        }

        @Override // androidx.work.WorkRequest.Builder
        public Builder getThisObject$work_runtime_release() {
            return this;
        }

        public final Builder setNextScheduleTimeOverride(long j10) {
            if (j10 == Long.MAX_VALUE) {
                throw new IllegalArgumentException("Cannot set Long.MAX_VALUE as the schedule override time");
            }
            getWorkSpec$work_runtime_release().setNextScheduleTimeOverride(j10);
            getWorkSpec$work_runtime_release().setNextScheduleTimeOverrideGeneration(1);
            return this;
        }

        @Override // androidx.work.WorkRequest.Builder
        public PeriodicWorkRequest buildInternal$work_runtime_release() {
            if (getBackoffCriteriaSet$work_runtime_release() && getWorkSpec$work_runtime_release().constraints.requiresDeviceIdle()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            if (getWorkSpec$work_runtime_release().expedited) {
                throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
            }
            return new PeriodicWorkRequest(this);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(InterfaceC10469c workerClass, long j10, TimeUnit repeatIntervalTimeUnit) {
            super(AbstractC9293a.m18324a(workerClass));
            AbstractC9979u.m20294g(workerClass, "workerClass");
            AbstractC9979u.m20294g(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
            getWorkSpec$work_runtime_release().setPeriodic(repeatIntervalTimeUnit.toMillis(j10));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @RequiresApi(26)
        public Builder(Class<? extends ListenableWorker> workerClass, Duration repeatInterval) {
            super(workerClass);
            AbstractC9979u.m20294g(workerClass, "workerClass");
            AbstractC9979u.m20294g(repeatInterval, "repeatInterval");
            getWorkSpec$work_runtime_release().setPeriodic(DurationApi26Impl.toMillisCompat(repeatInterval));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @RequiresApi(26)
        public Builder(InterfaceC10469c workerClass, Duration repeatInterval) {
            super(AbstractC9293a.m18324a(workerClass));
            AbstractC9979u.m20294g(workerClass, "workerClass");
            AbstractC9979u.m20294g(repeatInterval, "repeatInterval");
            getWorkSpec$work_runtime_release().setPeriodic(DurationApi26Impl.toMillisCompat(repeatInterval));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(Class<? extends ListenableWorker> workerClass, long j10, TimeUnit repeatIntervalTimeUnit, long j11, TimeUnit flexIntervalTimeUnit) {
            super(workerClass);
            AbstractC9979u.m20294g(workerClass, "workerClass");
            AbstractC9979u.m20294g(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
            AbstractC9979u.m20294g(flexIntervalTimeUnit, "flexIntervalTimeUnit");
            getWorkSpec$work_runtime_release().setPeriodic(repeatIntervalTimeUnit.toMillis(j10), flexIntervalTimeUnit.toMillis(j11));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(InterfaceC10469c workerClass, long j10, TimeUnit repeatIntervalTimeUnit, long j11, TimeUnit flexIntervalTimeUnit) {
            super(AbstractC9293a.m18324a(workerClass));
            AbstractC9979u.m20294g(workerClass, "workerClass");
            AbstractC9979u.m20294g(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
            AbstractC9979u.m20294g(flexIntervalTimeUnit, "flexIntervalTimeUnit");
            getWorkSpec$work_runtime_release().setPeriodic(repeatIntervalTimeUnit.toMillis(j10), flexIntervalTimeUnit.toMillis(j11));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @RequiresApi(26)
        public Builder(Class<? extends ListenableWorker> workerClass, Duration repeatInterval, Duration flexInterval) {
            super(workerClass);
            AbstractC9979u.m20294g(workerClass, "workerClass");
            AbstractC9979u.m20294g(repeatInterval, "repeatInterval");
            AbstractC9979u.m20294g(flexInterval, "flexInterval");
            getWorkSpec$work_runtime_release().setPeriodic(DurationApi26Impl.toMillisCompat(repeatInterval), DurationApi26Impl.toMillisCompat(flexInterval));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @RequiresApi(26)
        public Builder(InterfaceC10469c workerClass, Duration repeatInterval, Duration flexInterval) {
            super(AbstractC9293a.m18324a(workerClass));
            AbstractC9979u.m20294g(workerClass, "workerClass");
            AbstractC9979u.m20294g(repeatInterval, "repeatInterval");
            AbstractC9979u.m20294g(flexInterval, "flexInterval");
            getWorkSpec$work_runtime_release().setPeriodic(DurationApi26Impl.toMillisCompat(repeatInterval), DurationApi26Impl.toMillisCompat(flexInterval));
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeriodicWorkRequest(Builder builder) {
        super(builder.getId$work_runtime_release(), builder.getWorkSpec$work_runtime_release(), builder.getTags$work_runtime_release());
        AbstractC9979u.m20294g(builder, "builder");
    }
}
