package com.zykj.study.bean.teach;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class SuperviseGroupSelectBean {
    public static final int $stable = 8;
    private final SuperviseGroup superviseGroup;
    private final SuperviseGroupMember superviseGroupMember;

    public SuperviseGroupSelectBean(SuperviseGroup superviseGroup, SuperviseGroupMember superviseGroupMember) {
        AbstractC9133u.m16133g(superviseGroup, "superviseGroup");
        AbstractC9133u.m16133g(superviseGroupMember, "superviseGroupMember");
        this.superviseGroup = superviseGroup;
        this.superviseGroupMember = superviseGroupMember;
    }

    public static /* synthetic */ SuperviseGroupSelectBean copy$default(SuperviseGroupSelectBean superviseGroupSelectBean, SuperviseGroup superviseGroup, SuperviseGroupMember superviseGroupMember, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            superviseGroup = superviseGroupSelectBean.superviseGroup;
        }
        if ((i10 & 2) != 0) {
            superviseGroupMember = superviseGroupSelectBean.superviseGroupMember;
        }
        return superviseGroupSelectBean.copy(superviseGroup, superviseGroupMember);
    }

    public final SuperviseGroup component1() {
        return this.superviseGroup;
    }

    public final SuperviseGroupMember component2() {
        return this.superviseGroupMember;
    }

    public final SuperviseGroupSelectBean copy(SuperviseGroup superviseGroup, SuperviseGroupMember superviseGroupMember) {
        AbstractC9133u.m16133g(superviseGroup, "superviseGroup");
        AbstractC9133u.m16133g(superviseGroupMember, "superviseGroupMember");
        return new SuperviseGroupSelectBean(superviseGroup, superviseGroupMember);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperviseGroupSelectBean)) {
            return false;
        }
        SuperviseGroupSelectBean superviseGroupSelectBean = (SuperviseGroupSelectBean) obj;
        return AbstractC9133u.m16128b(this.superviseGroup, superviseGroupSelectBean.superviseGroup) && AbstractC9133u.m16128b(this.superviseGroupMember, superviseGroupSelectBean.superviseGroupMember);
    }

    public final SuperviseGroup getSuperviseGroup() {
        return this.superviseGroup;
    }

    public final SuperviseGroupMember getSuperviseGroupMember() {
        return this.superviseGroupMember;
    }

    public int hashCode() {
        return (this.superviseGroup.hashCode() * 31) + this.superviseGroupMember.hashCode();
    }

    public String toString() {
        return "SuperviseGroupSelectBean(superviseGroup=" + this.superviseGroup + ", superviseGroupMember=" + this.superviseGroupMember + ")";
    }
}
