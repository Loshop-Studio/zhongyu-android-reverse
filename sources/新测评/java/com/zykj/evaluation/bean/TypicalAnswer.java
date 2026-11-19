package com.zykj.evaluation.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J5\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m13558d2 = {"Lcom/zykj/evaluation/bean/TypicalAnswer;", "", "answers", "", "", "comments", "fullname", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getAnswers", "()Ljava/util/List;", "getComments", "getFullname", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TypicalAnswer {
    public static final int $stable = 8;
    private final List<String> answers;
    private final List<String> comments;
    private final String fullname;

    public TypicalAnswer(List<String> answers, List<String> comments, String str) {
        Intrinsics.checkNotNullParameter(answers, "answers");
        Intrinsics.checkNotNullParameter(comments, "comments");
        this.answers = answers;
        this.comments = comments;
        this.fullname = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TypicalAnswer copy$default(TypicalAnswer typicalAnswer, List list, List list2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = typicalAnswer.answers;
        }
        if ((i10 & 2) != 0) {
            list2 = typicalAnswer.comments;
        }
        if ((i10 & 4) != 0) {
            str = typicalAnswer.fullname;
        }
        return typicalAnswer.copy(list, list2, str);
    }

    public final List<String> component1() {
        return this.answers;
    }

    public final List<String> component2() {
        return this.comments;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFullname() {
        return this.fullname;
    }

    public final TypicalAnswer copy(List<String> answers, List<String> comments, String fullname) {
        Intrinsics.checkNotNullParameter(answers, "answers");
        Intrinsics.checkNotNullParameter(comments, "comments");
        return new TypicalAnswer(answers, comments, fullname);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TypicalAnswer)) {
            return false;
        }
        TypicalAnswer typicalAnswer = (TypicalAnswer) other;
        return Intrinsics.areEqual(this.answers, typicalAnswer.answers) && Intrinsics.areEqual(this.comments, typicalAnswer.comments) && Intrinsics.areEqual(this.fullname, typicalAnswer.fullname);
    }

    public final List<String> getAnswers() {
        return this.answers;
    }

    public final List<String> getComments() {
        return this.comments;
    }

    public final String getFullname() {
        return this.fullname;
    }

    public int hashCode() {
        int iHashCode = ((this.answers.hashCode() * 31) + this.comments.hashCode()) * 31;
        String str = this.fullname;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "TypicalAnswer(answers=" + this.answers + ", comments=" + this.comments + ", fullname=" + this.fullname + ")";
    }
}
