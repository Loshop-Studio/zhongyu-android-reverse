package com.zykj.insight.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m5174d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, m5175d2 = {"Lcom/zykj/insight/bean/GetAllSettingsResp;", "", "dnOrder", "Lcom/zykj/insight/bean/SettingSwitch;", "(Lcom/zykj/insight/bean/SettingSwitch;)V", "getDnOrder", "()Lcom/zykj/insight/bean/SettingSwitch;", "setDnOrder", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class GetAllSettingsResp {
    public static final int $stable = 8;
    private SettingSwitch dnOrder;

    /* JADX WARN: Multi-variable type inference failed */
    public GetAllSettingsResp() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ GetAllSettingsResp copy$default(GetAllSettingsResp getAllSettingsResp, SettingSwitch settingSwitch, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            settingSwitch = getAllSettingsResp.dnOrder;
        }
        return getAllSettingsResp.copy(settingSwitch);
    }

    /* renamed from: component1, reason: from getter */
    public final SettingSwitch getDnOrder() {
        return this.dnOrder;
    }

    public final GetAllSettingsResp copy(SettingSwitch dnOrder) {
        Intrinsics.checkNotNullParameter(dnOrder, "dnOrder");
        return new GetAllSettingsResp(dnOrder);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetAllSettingsResp) && this.dnOrder == ((GetAllSettingsResp) other).dnOrder;
    }

    public final SettingSwitch getDnOrder() {
        return this.dnOrder;
    }

    public int hashCode() {
        return this.dnOrder.hashCode();
    }

    public final void setDnOrder(SettingSwitch settingSwitch) {
        Intrinsics.checkNotNullParameter(settingSwitch, "<set-?>");
        this.dnOrder = settingSwitch;
    }

    public String toString() {
        return "GetAllSettingsResp(dnOrder=" + this.dnOrder + ")";
    }

    public GetAllSettingsResp(SettingSwitch dnOrder) {
        Intrinsics.checkNotNullParameter(dnOrder, "dnOrder");
        this.dnOrder = dnOrder;
    }

    public /* synthetic */ GetAllSettingsResp(SettingSwitch settingSwitch, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? SettingSwitch.CLOSE : settingSwitch);
    }
}
