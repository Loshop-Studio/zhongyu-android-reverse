package com.zykj.evaluation.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014¨\u0006!"}, m13558d2 = {"Lcom/zykj/evaluation/bean/ExamProgress;", "", "testingCount", "", "revisingCount", "testingStudents", "", "", "revisingStudents", "<init>", "(IILjava/util/List;Ljava/util/List;)V", "getTestingCount", "()I", "setTestingCount", "(I)V", "getRevisingCount", "setRevisingCount", "getTestingStudents", "()Ljava/util/List;", "setTestingStudents", "(Ljava/util/List;)V", "getRevisingStudents", "setRevisingStudents", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ExamProgress {
    public static final int $stable = 8;
    private int revisingCount;
    private List<String> revisingStudents;
    private int testingCount;
    private List<String> testingStudents;

    public ExamProgress(int i10, int i11, List<String> testingStudents, List<String> revisingStudents) {
        Intrinsics.checkNotNullParameter(testingStudents, "testingStudents");
        Intrinsics.checkNotNullParameter(revisingStudents, "revisingStudents");
        this.testingCount = i10;
        this.revisingCount = i11;
        this.testingStudents = testingStudents;
        this.revisingStudents = revisingStudents;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExamProgress copy$default(ExamProgress examProgress, int i10, int i11, List list, List list2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = examProgress.testingCount;
        }
        if ((i12 & 2) != 0) {
            i11 = examProgress.revisingCount;
        }
        if ((i12 & 4) != 0) {
            list = examProgress.testingStudents;
        }
        if ((i12 & 8) != 0) {
            list2 = examProgress.revisingStudents;
        }
        return examProgress.copy(i10, i11, list, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTestingCount() {
        return this.testingCount;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRevisingCount() {
        return this.revisingCount;
    }

    public final List<String> component3() {
        return this.testingStudents;
    }

    public final List<String> component4() {
        return this.revisingStudents;
    }

    public final ExamProgress copy(int testingCount, int revisingCount, List<String> testingStudents, List<String> revisingStudents) {
        Intrinsics.checkNotNullParameter(testingStudents, "testingStudents");
        Intrinsics.checkNotNullParameter(revisingStudents, "revisingStudents");
        return new ExamProgress(testingCount, revisingCount, testingStudents, revisingStudents);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExamProgress)) {
            return false;
        }
        ExamProgress examProgress = (ExamProgress) other;
        return this.testingCount == examProgress.testingCount && this.revisingCount == examProgress.revisingCount && Intrinsics.areEqual(this.testingStudents, examProgress.testingStudents) && Intrinsics.areEqual(this.revisingStudents, examProgress.revisingStudents);
    }

    public final int getRevisingCount() {
        return this.revisingCount;
    }

    public final List<String> getRevisingStudents() {
        return this.revisingStudents;
    }

    public final int getTestingCount() {
        return this.testingCount;
    }

    public final List<String> getTestingStudents() {
        return this.testingStudents;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.testingCount) * 31) + Integer.hashCode(this.revisingCount)) * 31) + this.testingStudents.hashCode()) * 31) + this.revisingStudents.hashCode();
    }

    public final void setRevisingCount(int i10) {
        this.revisingCount = i10;
    }

    public final void setRevisingStudents(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.revisingStudents = list;
    }

    public final void setTestingCount(int i10) {
        this.testingCount = i10;
    }

    public final void setTestingStudents(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.testingStudents = list;
    }

    public String toString() {
        return "ExamProgress(testingCount=" + this.testingCount + ", revisingCount=" + this.revisingCount + ", testingStudents=" + this.testingStudents + ", revisingStudents=" + this.revisingStudents + ")";
    }
}
