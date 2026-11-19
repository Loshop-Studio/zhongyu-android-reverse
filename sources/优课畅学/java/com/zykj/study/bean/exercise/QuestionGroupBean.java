package com.zykj.study.bean.exercise;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class QuestionGroupBean {
    public static final int $stable = 8;

    /* renamed from: id */
    private final int f11012id;
    private List<RoundBean> rounds;
    private final String title;
    private final Date updateTime;

    public QuestionGroupBean(int i10, String title, Date updateTime, List<RoundBean> rounds) {
        AbstractC9133u.m16133g(title, "title");
        AbstractC9133u.m16133g(updateTime, "updateTime");
        AbstractC9133u.m16133g(rounds, "rounds");
        this.f11012id = i10;
        this.title = title;
        this.updateTime = updateTime;
        this.rounds = rounds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QuestionGroupBean copy$default(QuestionGroupBean questionGroupBean, int i10, String str, Date date, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = questionGroupBean.f11012id;
        }
        if ((i11 & 2) != 0) {
            str = questionGroupBean.title;
        }
        if ((i11 & 4) != 0) {
            date = questionGroupBean.updateTime;
        }
        if ((i11 & 8) != 0) {
            list = questionGroupBean.rounds;
        }
        return questionGroupBean.copy(i10, str, date, list);
    }

    public final int component1() {
        return this.f11012id;
    }

    public final String component2() {
        return this.title;
    }

    public final Date component3() {
        return this.updateTime;
    }

    public final List<RoundBean> component4() {
        return this.rounds;
    }

    public final QuestionGroupBean copy(int i10, String title, Date updateTime, List<RoundBean> rounds) {
        AbstractC9133u.m16133g(title, "title");
        AbstractC9133u.m16133g(updateTime, "updateTime");
        AbstractC9133u.m16133g(rounds, "rounds");
        return new QuestionGroupBean(i10, title, updateTime, rounds);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestionGroupBean)) {
            return false;
        }
        QuestionGroupBean questionGroupBean = (QuestionGroupBean) obj;
        return this.f11012id == questionGroupBean.f11012id && AbstractC9133u.m16128b(this.title, questionGroupBean.title) && AbstractC9133u.m16128b(this.updateTime, questionGroupBean.updateTime) && AbstractC9133u.m16128b(this.rounds, questionGroupBean.rounds);
    }

    public final int getId() {
        return this.f11012id;
    }

    public final List<RoundBean> getRounds() {
        return this.rounds;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Date getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f11012id) * 31) + this.title.hashCode()) * 31) + this.updateTime.hashCode()) * 31) + this.rounds.hashCode();
    }

    public final void setRounds(List<RoundBean> list) {
        AbstractC9133u.m16133g(list, "<set-?>");
        this.rounds = list;
    }

    public String toString() {
        return "QuestionGroupBean(id=" + this.f11012id + ", title=" + this.title + ", updateTime=" + this.updateTime + ", rounds=" + this.rounds + ")";
    }
}
