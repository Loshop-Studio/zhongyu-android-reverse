package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.ExperimentalRetryPolicy;
import androidx.camera.core.RetryPolicy;
import androidx.core.util.Preconditions;

@ExperimentalRetryPolicy
/* loaded from: classes.dex */
public final class TimeoutRetryPolicy implements RetryPolicy {
    private final RetryPolicy mDelegatePolicy;
    private final long mTimeoutInMillis;

    public TimeoutRetryPolicy(long j7, @NonNull RetryPolicy retryPolicy) {
        Preconditions.checkArgument(j7 >= 0, "Timeout must be non-negative.");
        this.mTimeoutInMillis = j7;
        this.mDelegatePolicy = retryPolicy;
    }

    @Override // androidx.camera.core.RetryPolicy
    public long getTimeoutInMillis() {
        return this.mTimeoutInMillis;
    }

    @Override // androidx.camera.core.RetryPolicy
    @NonNull
    public RetryPolicy.RetryConfig onRetryDecisionRequested(@NonNull RetryPolicy.ExecutionState executionState) {
        RetryPolicy.RetryConfig retryConfigOnRetryDecisionRequested = this.mDelegatePolicy.onRetryDecisionRequested(executionState);
        return (getTimeoutInMillis() <= 0 || executionState.getExecutedTimeInMillis() < getTimeoutInMillis() - retryConfigOnRetryDecisionRequested.getRetryDelayInMillis()) ? retryConfigOnRetryDecisionRequested : RetryPolicy.RetryConfig.NOT_RETRY;
    }
}
