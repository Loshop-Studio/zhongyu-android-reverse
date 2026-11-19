package com.zykj.study.bean.teach;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class QuizStatistic {
    public static final int $stable = 8;
    private final int catalogId;
    private final List<SuperviseGroup> superviseGroups;
    private final int superviseId;

    public QuizStatistic(int i10, int i11, List<SuperviseGroup> superviseGroups) {
        AbstractC9133u.m16133g(superviseGroups, "superviseGroups");
        this.superviseId = i10;
        this.catalogId = i11;
        this.superviseGroups = superviseGroups;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QuizStatistic copy$default(QuizStatistic quizStatistic, int i10, int i11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = quizStatistic.superviseId;
        }
        if ((i12 & 2) != 0) {
            i11 = quizStatistic.catalogId;
        }
        if ((i12 & 4) != 0) {
            list = quizStatistic.superviseGroups;
        }
        return quizStatistic.copy(i10, i11, list);
    }

    public final int component1() {
        return this.superviseId;
    }

    public final int component2() {
        return this.catalogId;
    }

    public final List<SuperviseGroup> component3() {
        return this.superviseGroups;
    }

    public final QuizStatistic copy(int i10, int i11, List<SuperviseGroup> superviseGroups) {
        AbstractC9133u.m16133g(superviseGroups, "superviseGroups");
        return new QuizStatistic(i10, i11, superviseGroups);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuizStatistic)) {
            return false;
        }
        QuizStatistic quizStatistic = (QuizStatistic) obj;
        return this.superviseId == quizStatistic.superviseId && this.catalogId == quizStatistic.catalogId && AbstractC9133u.m16128b(this.superviseGroups, quizStatistic.superviseGroups);
    }

    public final int getCatalogId() {
        return this.catalogId;
    }

    public final List<SuperviseGroup> getSuperviseGroups() {
        return this.superviseGroups;
    }

    public final int getSuperviseId() {
        return this.superviseId;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.superviseId) * 31) + Integer.hashCode(this.catalogId)) * 31) + this.superviseGroups.hashCode();
    }

    public String toString() {
        return "QuizStatistic(superviseId=" + this.superviseId + ", catalogId=" + this.catalogId + ", superviseGroups=" + this.superviseGroups + ")";
    }
}
