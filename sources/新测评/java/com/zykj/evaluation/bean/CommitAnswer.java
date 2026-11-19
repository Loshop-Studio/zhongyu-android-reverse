package com.zykj.evaluation.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, m13558d2 = {"Lcom/zykj/evaluation/bean/CommitAnswer;", "", "uuid", "", "answers", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getUuid", "()Ljava/lang/String;", "getAnswers", "()Ljava/util/List;", "setAnswers", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CommitAnswer {
    public static final int $stable = 8;
    private List<String> answers;
    private final String uuid;

    public CommitAnswer(String uuid, List<String> answers) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(answers, "answers");
        this.uuid = uuid;
        this.answers = answers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommitAnswer copy$default(CommitAnswer commitAnswer, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = commitAnswer.uuid;
        }
        if ((i10 & 2) != 0) {
            list = commitAnswer.answers;
        }
        return commitAnswer.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    public final List<String> component2() {
        return this.answers;
    }

    public final CommitAnswer copy(String uuid, List<String> answers) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(answers, "answers");
        return new CommitAnswer(uuid, answers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommitAnswer)) {
            return false;
        }
        CommitAnswer commitAnswer = (CommitAnswer) other;
        return Intrinsics.areEqual(this.uuid, commitAnswer.uuid) && Intrinsics.areEqual(this.answers, commitAnswer.answers);
    }

    public final List<String> getAnswers() {
        return this.answers;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return (this.uuid.hashCode() * 31) + this.answers.hashCode();
    }

    public final void setAnswers(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.answers = list;
    }

    public String toString() {
        return "CommitAnswer(uuid=" + this.uuid + ", answers=" + this.answers + ")";
    }

    public /* synthetic */ CommitAnswer(String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? CollectionsKt.emptyList() : list);
    }
}
