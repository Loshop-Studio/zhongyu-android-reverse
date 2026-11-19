package com.zykj.study.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class SelectModel<T> {
    public static final int $stable = 8;
    private T data;
    private boolean isSelectModel;

    public SelectModel(boolean z10, T t10) {
        this.isSelectModel = z10;
        this.data = t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelectModel copy$default(SelectModel selectModel, boolean z10, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            z10 = selectModel.isSelectModel;
        }
        if ((i10 & 2) != 0) {
            obj = selectModel.data;
        }
        return selectModel.copy(z10, obj);
    }

    public final boolean component1() {
        return this.isSelectModel;
    }

    public final T component2() {
        return this.data;
    }

    public final SelectModel<T> copy(boolean z10, T t10) {
        return new SelectModel<>(z10, t10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectModel)) {
            return false;
        }
        SelectModel selectModel = (SelectModel) obj;
        return this.isSelectModel == selectModel.isSelectModel && AbstractC9133u.m16128b(this.data, selectModel.data);
    }

    public final T getData() {
        return this.data;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isSelectModel) * 31;
        T t10 = this.data;
        return iHashCode + (t10 == null ? 0 : t10.hashCode());
    }

    public final boolean isSelectModel() {
        return this.isSelectModel;
    }

    public final void setData(T t10) {
        this.data = t10;
    }

    public final void setSelectModel(boolean z10) {
        this.isSelectModel = z10;
    }

    public String toString() {
        return "SelectModel(isSelectModel=" + this.isSelectModel + ", data=" + this.data + ")";
    }
}
