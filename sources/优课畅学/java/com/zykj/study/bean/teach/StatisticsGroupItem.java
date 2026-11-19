package com.zykj.study.bean.teach;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class StatisticsGroupItem {
    public static final int $stable = 0;
    private final boolean correct;
    private final int progress;
    private final String questionId;
    private final int status;

    public StatisticsGroupItem(String questionId, int i10, int i11, boolean z10) {
        AbstractC9133u.m16133g(questionId, "questionId");
        this.questionId = questionId;
        this.progress = i10;
        this.status = i11;
        this.correct = z10;
    }

    public static /* synthetic */ StatisticsGroupItem copy$default(StatisticsGroupItem statisticsGroupItem, String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = statisticsGroupItem.questionId;
        }
        if ((i12 & 2) != 0) {
            i10 = statisticsGroupItem.progress;
        }
        if ((i12 & 4) != 0) {
            i11 = statisticsGroupItem.status;
        }
        if ((i12 & 8) != 0) {
            z10 = statisticsGroupItem.correct;
        }
        return statisticsGroupItem.copy(str, i10, i11, z10);
    }

    public final String component1() {
        return this.questionId;
    }

    public final int component2() {
        return this.progress;
    }

    public final int component3() {
        return this.status;
    }

    public final boolean component4() {
        return this.correct;
    }

    public final StatisticsGroupItem copy(String questionId, int i10, int i11, boolean z10) {
        AbstractC9133u.m16133g(questionId, "questionId");
        return new StatisticsGroupItem(questionId, i10, i11, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatisticsGroupItem)) {
            return false;
        }
        StatisticsGroupItem statisticsGroupItem = (StatisticsGroupItem) obj;
        return AbstractC9133u.m16128b(this.questionId, statisticsGroupItem.questionId) && this.progress == statisticsGroupItem.progress && this.status == statisticsGroupItem.status && this.correct == statisticsGroupItem.correct;
    }

    public final boolean getCorrect() {
        return this.correct;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final String getQuestionId() {
        return this.questionId;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((this.questionId.hashCode() * 31) + Integer.hashCode(this.progress)) * 31) + Integer.hashCode(this.status)) * 31) + Boolean.hashCode(this.correct);
    }

    public String toString() {
        return "StatisticsGroupItem(questionId=" + this.questionId + ", progress=" + this.progress + ", status=" + this.status + ", correct=" + this.correct + ")";
    }
}
