package com.zykj.evaluation.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m13558d2 = {"Lcom/zykj/evaluation/bean/PaperPage;", "", "questions", "", "Lcom/zykj/evaluation/bean/PaperQuestion;", "<init>", "(Ljava/util/List;)V", "getQuestions", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaperPage {
    public static final int $stable = 8;

    @SerializedName("Questions")
    private final List<PaperQuestion> questions;

    public PaperPage(List<PaperQuestion> questions) {
        Intrinsics.checkNotNullParameter(questions, "questions");
        this.questions = questions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaperPage copy$default(PaperPage paperPage, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = paperPage.questions;
        }
        return paperPage.copy(list);
    }

    public final List<PaperQuestion> component1() {
        return this.questions;
    }

    public final PaperPage copy(List<PaperQuestion> questions) {
        Intrinsics.checkNotNullParameter(questions, "questions");
        return new PaperPage(questions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PaperPage) && Intrinsics.areEqual(this.questions, ((PaperPage) other).questions);
    }

    public final List<PaperQuestion> getQuestions() {
        return this.questions;
    }

    public int hashCode() {
        return this.questions.hashCode();
    }

    public String toString() {
        return "PaperPage(questions=" + this.questions + ")";
    }
}
