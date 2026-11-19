package com.zykj.study.bean.teach;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class QuizScore {
    public static final int $stable = 8;

    @SerializedName("questionGroupId")
    private final int groupId;
    private final List<SuperviseGroup> superviseGroups;

    @SerializedName("questionGroupTitle")
    private final String title;

    public QuizScore(int i10, String title, List<SuperviseGroup> superviseGroups) {
        AbstractC9133u.m16133g(title, "title");
        AbstractC9133u.m16133g(superviseGroups, "superviseGroups");
        this.groupId = i10;
        this.title = title;
        this.superviseGroups = superviseGroups;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QuizScore copy$default(QuizScore quizScore, int i10, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = quizScore.groupId;
        }
        if ((i11 & 2) != 0) {
            str = quizScore.title;
        }
        if ((i11 & 4) != 0) {
            list = quizScore.superviseGroups;
        }
        return quizScore.copy(i10, str, list);
    }

    public final int component1() {
        return this.groupId;
    }

    public final String component2() {
        return this.title;
    }

    public final List<SuperviseGroup> component3() {
        return this.superviseGroups;
    }

    public final QuizScore copy(int i10, String title, List<SuperviseGroup> superviseGroups) {
        AbstractC9133u.m16133g(title, "title");
        AbstractC9133u.m16133g(superviseGroups, "superviseGroups");
        return new QuizScore(i10, title, superviseGroups);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuizScore)) {
            return false;
        }
        QuizScore quizScore = (QuizScore) obj;
        return this.groupId == quizScore.groupId && AbstractC9133u.m16128b(this.title, quizScore.title) && AbstractC9133u.m16128b(this.superviseGroups, quizScore.superviseGroups);
    }

    public final int getGroupId() {
        return this.groupId;
    }

    public final List<SuperviseGroup> getSuperviseGroups() {
        return this.superviseGroups;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.groupId) * 31) + this.title.hashCode()) * 31) + this.superviseGroups.hashCode();
    }

    public String toString() {
        return "QuizScore(groupId=" + this.groupId + ", title=" + this.title + ", superviseGroups=" + this.superviseGroups + ")";
    }

    public /* synthetic */ QuizScore(int i10, String str, List list, int i11, AbstractC9126n abstractC9126n) {
        this(i10, (i11 & 2) != 0 ? "" : str, list);
    }
}
