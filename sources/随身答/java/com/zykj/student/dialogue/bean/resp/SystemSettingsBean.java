package com.zykj.student.dialogue.bean.resp;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m13412d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/SystemSettingsBean;", "", "quoraSearchable", "", "<init>", "(Ljava/lang/String;)V", "getQuoraSearchable", "()Ljava/lang/String;", "quoraSearchEnabled", "", "getQuoraSearchEnabled", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final /* data */ class SystemSettingsBean {
    public static final int $stable = 0;
    private final String quoraSearchable;

    public SystemSettingsBean(String quoraSearchable) {
        Intrinsics.checkNotNullParameter(quoraSearchable, "quoraSearchable");
        this.quoraSearchable = quoraSearchable;
    }

    public static /* synthetic */ SystemSettingsBean copy$default(SystemSettingsBean systemSettingsBean, String str, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = systemSettingsBean.quoraSearchable;
        }
        return systemSettingsBean.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getQuoraSearchable() {
        return this.quoraSearchable;
    }

    public final SystemSettingsBean copy(String quoraSearchable) {
        Intrinsics.checkNotNullParameter(quoraSearchable, "quoraSearchable");
        return new SystemSettingsBean(quoraSearchable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SystemSettingsBean) && Intrinsics.areEqual(this.quoraSearchable, ((SystemSettingsBean) other).quoraSearchable);
    }

    public final boolean getQuoraSearchEnabled() {
        return Intrinsics.areEqual(this.quoraSearchable, "1");
    }

    public final String getQuoraSearchable() {
        return this.quoraSearchable;
    }

    public int hashCode() {
        return this.quoraSearchable.hashCode();
    }

    public String toString() {
        return "SystemSettingsBean(quoraSearchable=" + this.quoraSearchable + ")";
    }
}
