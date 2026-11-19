package com.zykj.study.bean.exercise;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class RoundBean {
    public static final int $stable = 8;
    private final int questionCount;
    private final List<QuestionBean> questions;

    public RoundBean(List<QuestionBean> questions, int i10) {
        AbstractC9133u.m16133g(questions, "questions");
        this.questions = questions;
        this.questionCount = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RoundBean copy$default(RoundBean roundBean, List list, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = roundBean.questions;
        }
        if ((i11 & 2) != 0) {
            i10 = roundBean.questionCount;
        }
        return roundBean.copy(list, i10);
    }

    public final List<QuestionBean> component1() {
        return this.questions;
    }

    public final int component2() {
        return this.questionCount;
    }

    public final RoundBean copy(List<QuestionBean> questions, int i10) {
        AbstractC9133u.m16133g(questions, "questions");
        return new RoundBean(questions, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundBean)) {
            return false;
        }
        RoundBean roundBean = (RoundBean) obj;
        return AbstractC9133u.m16128b(this.questions, roundBean.questions) && this.questionCount == roundBean.questionCount;
    }

    public final int getQuestionCount() {
        return this.questionCount;
    }

    public final List<QuestionBean> getQuestions() {
        return this.questions;
    }

    public int hashCode() {
        return (this.questions.hashCode() * 31) + Integer.hashCode(this.questionCount);
    }

    public String toString() {
        return "RoundBean(questions=" + this.questions + ", questionCount=" + this.questionCount + ")";
    }
}
