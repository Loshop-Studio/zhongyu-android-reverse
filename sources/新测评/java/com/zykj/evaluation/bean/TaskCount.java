package com.zykj.evaluation.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\""}, m13558d2 = {"Lcom/zykj/evaluation/bean/TaskCount;", "", "Testing", "", "WaitExamCorrect", "ExamCorrecting", "Revising", "WaitRevisingCorrect", "RevisingCorrecting", "End", "<init>", "(IIIIIII)V", "getTesting", "()I", "getWaitExamCorrect", "getExamCorrecting", "getRevising", "getWaitRevisingCorrect", "getRevisingCorrecting", "getEnd", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TaskCount {
    public static final int $stable = 0;
    private final int End;
    private final int ExamCorrecting;
    private final int Revising;
    private final int RevisingCorrecting;
    private final int Testing;
    private final int WaitExamCorrect;
    private final int WaitRevisingCorrect;

    public TaskCount(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.Testing = i10;
        this.WaitExamCorrect = i11;
        this.ExamCorrecting = i12;
        this.Revising = i13;
        this.WaitRevisingCorrect = i14;
        this.RevisingCorrecting = i15;
        this.End = i16;
    }

    public static /* synthetic */ TaskCount copy$default(TaskCount taskCount, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i10 = taskCount.Testing;
        }
        if ((i17 & 2) != 0) {
            i11 = taskCount.WaitExamCorrect;
        }
        if ((i17 & 4) != 0) {
            i12 = taskCount.ExamCorrecting;
        }
        if ((i17 & 8) != 0) {
            i13 = taskCount.Revising;
        }
        if ((i17 & 16) != 0) {
            i14 = taskCount.WaitRevisingCorrect;
        }
        if ((i17 & 32) != 0) {
            i15 = taskCount.RevisingCorrecting;
        }
        if ((i17 & 64) != 0) {
            i16 = taskCount.End;
        }
        int i18 = i15;
        int i19 = i16;
        int i20 = i14;
        int i21 = i12;
        return taskCount.copy(i10, i11, i21, i13, i20, i18, i19);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTesting() {
        return this.Testing;
    }

    /* renamed from: component2, reason: from getter */
    public final int getWaitExamCorrect() {
        return this.WaitExamCorrect;
    }

    /* renamed from: component3, reason: from getter */
    public final int getExamCorrecting() {
        return this.ExamCorrecting;
    }

    /* renamed from: component4, reason: from getter */
    public final int getRevising() {
        return this.Revising;
    }

    /* renamed from: component5, reason: from getter */
    public final int getWaitRevisingCorrect() {
        return this.WaitRevisingCorrect;
    }

    /* renamed from: component6, reason: from getter */
    public final int getRevisingCorrecting() {
        return this.RevisingCorrecting;
    }

    /* renamed from: component7, reason: from getter */
    public final int getEnd() {
        return this.End;
    }

    public final TaskCount copy(int Testing, int WaitExamCorrect, int ExamCorrecting, int Revising, int WaitRevisingCorrect, int RevisingCorrecting, int End) {
        return new TaskCount(Testing, WaitExamCorrect, ExamCorrecting, Revising, WaitRevisingCorrect, RevisingCorrecting, End);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaskCount)) {
            return false;
        }
        TaskCount taskCount = (TaskCount) other;
        return this.Testing == taskCount.Testing && this.WaitExamCorrect == taskCount.WaitExamCorrect && this.ExamCorrecting == taskCount.ExamCorrecting && this.Revising == taskCount.Revising && this.WaitRevisingCorrect == taskCount.WaitRevisingCorrect && this.RevisingCorrecting == taskCount.RevisingCorrecting && this.End == taskCount.End;
    }

    public final int getEnd() {
        return this.End;
    }

    public final int getExamCorrecting() {
        return this.ExamCorrecting;
    }

    public final int getRevising() {
        return this.Revising;
    }

    public final int getRevisingCorrecting() {
        return this.RevisingCorrecting;
    }

    public final int getTesting() {
        return this.Testing;
    }

    public final int getWaitExamCorrect() {
        return this.WaitExamCorrect;
    }

    public final int getWaitRevisingCorrect() {
        return this.WaitRevisingCorrect;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.Testing) * 31) + Integer.hashCode(this.WaitExamCorrect)) * 31) + Integer.hashCode(this.ExamCorrecting)) * 31) + Integer.hashCode(this.Revising)) * 31) + Integer.hashCode(this.WaitRevisingCorrect)) * 31) + Integer.hashCode(this.RevisingCorrecting)) * 31) + Integer.hashCode(this.End);
    }

    public String toString() {
        return "TaskCount(Testing=" + this.Testing + ", WaitExamCorrect=" + this.WaitExamCorrect + ", ExamCorrecting=" + this.ExamCorrecting + ", Revising=" + this.Revising + ", WaitRevisingCorrect=" + this.WaitRevisingCorrect + ", RevisingCorrecting=" + this.RevisingCorrecting + ", End=" + this.End + ")";
    }
}
