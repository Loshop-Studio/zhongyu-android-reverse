package com.zykj.evaluation.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m13558d2 = {"Lcom/zykj/evaluation/bean/AskForHelpReq;", "", "examTaskId", "", "questionId", "askForHelp", "", "<init>", "(JJZ)V", "getExamTaskId", "()J", "getQuestionId", "getAskForHelp", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AskForHelpReq {
    public static final int $stable = 0;
    private final boolean askForHelp;
    private final long examTaskId;
    private final long questionId;

    public AskForHelpReq(long j10, long j11, boolean z9) {
        this.examTaskId = j10;
        this.questionId = j11;
        this.askForHelp = z9;
    }

    public static /* synthetic */ AskForHelpReq copy$default(AskForHelpReq askForHelpReq, long j10, long j11, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = askForHelpReq.examTaskId;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = askForHelpReq.questionId;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            z9 = askForHelpReq.askForHelp;
        }
        return askForHelpReq.copy(j12, j13, z9);
    }

    /* renamed from: component1, reason: from getter */
    public final long getExamTaskId() {
        return this.examTaskId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getQuestionId() {
        return this.questionId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getAskForHelp() {
        return this.askForHelp;
    }

    public final AskForHelpReq copy(long examTaskId, long questionId, boolean askForHelp) {
        return new AskForHelpReq(examTaskId, questionId, askForHelp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AskForHelpReq)) {
            return false;
        }
        AskForHelpReq askForHelpReq = (AskForHelpReq) other;
        return this.examTaskId == askForHelpReq.examTaskId && this.questionId == askForHelpReq.questionId && this.askForHelp == askForHelpReq.askForHelp;
    }

    public final boolean getAskForHelp() {
        return this.askForHelp;
    }

    public final long getExamTaskId() {
        return this.examTaskId;
    }

    public final long getQuestionId() {
        return this.questionId;
    }

    public int hashCode() {
        return (((Long.hashCode(this.examTaskId) * 31) + Long.hashCode(this.questionId)) * 31) + Boolean.hashCode(this.askForHelp);
    }

    public String toString() {
        return "AskForHelpReq(examTaskId=" + this.examTaskId + ", questionId=" + this.questionId + ", askForHelp=" + this.askForHelp + ")";
    }
}
