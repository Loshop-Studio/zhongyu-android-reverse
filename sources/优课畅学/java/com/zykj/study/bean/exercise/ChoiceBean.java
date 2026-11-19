package com.zykj.study.bean.exercise;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class ChoiceBean {
    public static final int $stable = 0;
    private final ChoiceStatus showStatus;

    public ChoiceBean(ChoiceStatus showStatus) {
        AbstractC9133u.m16133g(showStatus, "showStatus");
        this.showStatus = showStatus;
    }

    public static /* synthetic */ ChoiceBean copy$default(ChoiceBean choiceBean, ChoiceStatus choiceStatus, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            choiceStatus = choiceBean.showStatus;
        }
        return choiceBean.copy(choiceStatus);
    }

    public final ChoiceStatus component1() {
        return this.showStatus;
    }

    public final ChoiceBean copy(ChoiceStatus showStatus) {
        AbstractC9133u.m16133g(showStatus, "showStatus");
        return new ChoiceBean(showStatus);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChoiceBean) && this.showStatus == ((ChoiceBean) obj).showStatus;
    }

    public final ChoiceStatus getShowStatus() {
        return this.showStatus;
    }

    public int hashCode() {
        return this.showStatus.hashCode();
    }

    public String toString() {
        return "ChoiceBean(showStatus=" + this.showStatus + ")";
    }
}
