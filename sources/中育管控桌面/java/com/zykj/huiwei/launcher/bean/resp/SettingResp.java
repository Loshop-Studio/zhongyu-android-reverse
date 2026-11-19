package com.zykj.huiwei.launcher.bean.resp;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/bean/resp/SettingResp;", "", "dnOrder", "Lcom/zykj/huiwei/launcher/bean/resp/SettingSwitch;", "<init>", "(Lcom/zykj/huiwei/launcher/bean/resp/SettingSwitch;)V", "getDnOrder", "()Lcom/zykj/huiwei/launcher/bean/resp/SettingSwitch;", "setDnOrder", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SettingResp {
    public static final int $stable = 8;
    private SettingSwitch dnOrder;

    /* JADX WARN: Multi-variable type inference failed */
    public SettingResp() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SettingResp copy$default(SettingResp settingResp, SettingSwitch settingSwitch, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            settingSwitch = settingResp.dnOrder;
        }
        return settingResp.copy(settingSwitch);
    }

    /* renamed from: component1, reason: from getter */
    public final SettingSwitch getDnOrder() {
        return this.dnOrder;
    }

    public final SettingResp copy(SettingSwitch dnOrder) {
        Intrinsics.checkNotNullParameter(dnOrder, "dnOrder");
        return new SettingResp(dnOrder);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SettingResp) && this.dnOrder == ((SettingResp) other).dnOrder;
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
        return "SettingResp(dnOrder=" + this.dnOrder + ")";
    }

    public SettingResp(SettingSwitch dnOrder) {
        Intrinsics.checkNotNullParameter(dnOrder, "dnOrder");
        this.dnOrder = dnOrder;
    }

    public /* synthetic */ SettingResp(SettingSwitch settingSwitch, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? SettingSwitch.CLOSE : settingSwitch);
    }
}
