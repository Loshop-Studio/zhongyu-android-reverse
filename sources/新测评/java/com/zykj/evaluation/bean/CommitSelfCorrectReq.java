package com.zykj.evaluation.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m13558d2 = {"Lcom/zykj/evaluation/bean/CommitSelfCorrectReq;", "", "taskId", "", "questionId", "results", "", "Lcom/zykj/evaluation/bean/SelfCorrectResult;", "<init>", "(JJLjava/util/List;)V", "getTaskId", "()J", "getQuestionId", "getResults", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CommitSelfCorrectReq {
    public static final int $stable = 8;
    private final long questionId;
    private final List<SelfCorrectResult> results;
    private final long taskId;

    public CommitSelfCorrectReq(long j10, long j11, List<SelfCorrectResult> results) {
        Intrinsics.checkNotNullParameter(results, "results");
        this.taskId = j10;
        this.questionId = j11;
        this.results = results;
    }

    public static /* synthetic */ CommitSelfCorrectReq copy$default(CommitSelfCorrectReq commitSelfCorrectReq, long j10, long j11, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = commitSelfCorrectReq.taskId;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = commitSelfCorrectReq.questionId;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            list = commitSelfCorrectReq.results;
        }
        return commitSelfCorrectReq.copy(j12, j13, list);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTaskId() {
        return this.taskId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getQuestionId() {
        return this.questionId;
    }

    public final List<SelfCorrectResult> component3() {
        return this.results;
    }

    public final CommitSelfCorrectReq copy(long taskId, long questionId, List<SelfCorrectResult> results) {
        Intrinsics.checkNotNullParameter(results, "results");
        return new CommitSelfCorrectReq(taskId, questionId, results);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommitSelfCorrectReq)) {
            return false;
        }
        CommitSelfCorrectReq commitSelfCorrectReq = (CommitSelfCorrectReq) other;
        return this.taskId == commitSelfCorrectReq.taskId && this.questionId == commitSelfCorrectReq.questionId && Intrinsics.areEqual(this.results, commitSelfCorrectReq.results);
    }

    public final long getQuestionId() {
        return this.questionId;
    }

    public final List<SelfCorrectResult> getResults() {
        return this.results;
    }

    public final long getTaskId() {
        return this.taskId;
    }

    public int hashCode() {
        return (((Long.hashCode(this.taskId) * 31) + Long.hashCode(this.questionId)) * 31) + this.results.hashCode();
    }

    public String toString() {
        return "CommitSelfCorrectReq(taskId=" + this.taskId + ", questionId=" + this.questionId + ", results=" + this.results + ")";
    }
}
