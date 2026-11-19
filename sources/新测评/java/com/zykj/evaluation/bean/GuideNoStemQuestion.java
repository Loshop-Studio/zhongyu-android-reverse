package com.zykj.evaluation.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m13558d2 = {"Lcom/zykj/evaluation/bean/GuideNoStemQuestion;", "Lcom/zykj/evaluation/bean/BaseGuideQuestion;", "answerWithQuestion", "", "qstFlows", "", "Lcom/zykj/evaluation/bean/GuideSubQuestion;", "<init>", "(ZLjava/util/List;)V", "getAnswerWithQuestion", "()Z", "getQstFlows", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GuideNoStemQuestion extends BaseGuideQuestion {
    public static final int $stable = 8;
    private final boolean answerWithQuestion;
    private final List<GuideSubQuestion> qstFlows;

    public GuideNoStemQuestion(boolean z9, List<GuideSubQuestion> qstFlows) {
        Intrinsics.checkNotNullParameter(qstFlows, "qstFlows");
        this.answerWithQuestion = z9;
        this.qstFlows = qstFlows;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GuideNoStemQuestion copy$default(GuideNoStemQuestion guideNoStemQuestion, boolean z9, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = guideNoStemQuestion.answerWithQuestion;
        }
        if ((i10 & 2) != 0) {
            list = guideNoStemQuestion.qstFlows;
        }
        return guideNoStemQuestion.copy(z9, list);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAnswerWithQuestion() {
        return this.answerWithQuestion;
    }

    public final List<GuideSubQuestion> component2() {
        return this.qstFlows;
    }

    public final GuideNoStemQuestion copy(boolean answerWithQuestion, List<GuideSubQuestion> qstFlows) {
        Intrinsics.checkNotNullParameter(qstFlows, "qstFlows");
        return new GuideNoStemQuestion(answerWithQuestion, qstFlows);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuideNoStemQuestion)) {
            return false;
        }
        GuideNoStemQuestion guideNoStemQuestion = (GuideNoStemQuestion) other;
        return this.answerWithQuestion == guideNoStemQuestion.answerWithQuestion && Intrinsics.areEqual(this.qstFlows, guideNoStemQuestion.qstFlows);
    }

    public final boolean getAnswerWithQuestion() {
        return this.answerWithQuestion;
    }

    public final List<GuideSubQuestion> getQstFlows() {
        return this.qstFlows;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.answerWithQuestion) * 31) + this.qstFlows.hashCode();
    }

    public String toString() {
        return "GuideNoStemQuestion(answerWithQuestion=" + this.answerWithQuestion + ", qstFlows=" + this.qstFlows + ")";
    }
}
