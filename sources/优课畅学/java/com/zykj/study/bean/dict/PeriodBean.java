package com.zykj.study.bean.dict;

import androidx.compose.runtime.internal.StabilityInferred;
import com.zykj.study.data.GradeEntity;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class PeriodBean {
    public static final int $stable = 8;
    private final List<GradeEntity> children;

    /* renamed from: id */
    private final int f11008id;
    private final String name;

    public PeriodBean(int i10, String name, List<GradeEntity> children) {
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(children, "children");
        this.f11008id = i10;
        this.name = name;
        this.children = children;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PeriodBean copy$default(PeriodBean periodBean, int i10, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = periodBean.f11008id;
        }
        if ((i11 & 2) != 0) {
            str = periodBean.name;
        }
        if ((i11 & 4) != 0) {
            list = periodBean.children;
        }
        return periodBean.copy(i10, str, list);
    }

    public final int component1() {
        return this.f11008id;
    }

    public final String component2() {
        return this.name;
    }

    public final List<GradeEntity> component3() {
        return this.children;
    }

    public final PeriodBean copy(int i10, String name, List<GradeEntity> children) {
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(children, "children");
        return new PeriodBean(i10, name, children);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PeriodBean)) {
            return false;
        }
        PeriodBean periodBean = (PeriodBean) obj;
        return this.f11008id == periodBean.f11008id && AbstractC9133u.m16128b(this.name, periodBean.name) && AbstractC9133u.m16128b(this.children, periodBean.children);
    }

    public final List<GradeEntity> getChildren() {
        return this.children;
    }

    public final int getId() {
        return this.f11008id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f11008id) * 31) + this.name.hashCode()) * 31) + this.children.hashCode();
    }

    public String toString() {
        return "PeriodBean(id=" + this.f11008id + ", name=" + this.name + ", children=" + this.children + ")";
    }
}
