package com.zykj.evaluation.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m13558d2 = {"Lcom/zykj/evaluation/bean/CommitTaskAnswer;", "", "questionId", "", "draft", "", "answers", "", "Lcom/zykj/evaluation/bean/CommitAnswer;", "<init>", "(JLjava/lang/String;Ljava/util/List;)V", "getQuestionId", "()J", "getDraft", "()Ljava/lang/String;", "getAnswers", "()Ljava/util/List;", "setAnswers", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CommitTaskAnswer {
    public static final int $stable = 8;
    private List<CommitAnswer> answers;
    private final String draft;
    private final long questionId;

    public CommitTaskAnswer(long j10, String draft, List<CommitAnswer> answers) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        Intrinsics.checkNotNullParameter(answers, "answers");
        this.questionId = j10;
        this.draft = draft;
        this.answers = answers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommitTaskAnswer copy$default(CommitTaskAnswer commitTaskAnswer, long j10, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = commitTaskAnswer.questionId;
        }
        if ((i10 & 2) != 0) {
            str = commitTaskAnswer.draft;
        }
        if ((i10 & 4) != 0) {
            list = commitTaskAnswer.answers;
        }
        return commitTaskAnswer.copy(j10, str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final long getQuestionId() {
        return this.questionId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDraft() {
        return this.draft;
    }

    public final List<CommitAnswer> component3() {
        return this.answers;
    }

    public final CommitTaskAnswer copy(long questionId, String draft, List<CommitAnswer> answers) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        Intrinsics.checkNotNullParameter(answers, "answers");
        return new CommitTaskAnswer(questionId, draft, answers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommitTaskAnswer)) {
            return false;
        }
        CommitTaskAnswer commitTaskAnswer = (CommitTaskAnswer) other;
        return this.questionId == commitTaskAnswer.questionId && Intrinsics.areEqual(this.draft, commitTaskAnswer.draft) && Intrinsics.areEqual(this.answers, commitTaskAnswer.answers);
    }

    public final List<CommitAnswer> getAnswers() {
        return this.answers;
    }

    public final String getDraft() {
        return this.draft;
    }

    public final long getQuestionId() {
        return this.questionId;
    }

    public int hashCode() {
        return (((Long.hashCode(this.questionId) * 31) + this.draft.hashCode()) * 31) + this.answers.hashCode();
    }

    public final void setAnswers(List<CommitAnswer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.answers = list;
    }

    public String toString() {
        return "CommitTaskAnswer(questionId=" + this.questionId + ", draft=" + this.draft + ", answers=" + this.answers + ")";
    }

    public /* synthetic */ CommitTaskAnswer(long j10, String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? CollectionsKt.emptyList() : list);
    }
}
