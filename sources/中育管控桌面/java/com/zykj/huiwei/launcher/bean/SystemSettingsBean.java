package com.zykj.huiwei.launcher.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred(parameters = 1)
@Metadata(m7879d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/bean/SystemSettingsBean;", "", "userPasswordStrength", "", "<init>", "(I)V", "getUserPasswordStrength", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SystemSettingsBean {
    public static final int $stable = 0;
    private final int userPasswordStrength;

    public SystemSettingsBean(int i6) {
        this.userPasswordStrength = i6;
    }

    public static /* synthetic */ SystemSettingsBean copy$default(SystemSettingsBean systemSettingsBean, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i6 = systemSettingsBean.userPasswordStrength;
        }
        return systemSettingsBean.copy(i6);
    }

    /* renamed from: component1, reason: from getter */
    public final int getUserPasswordStrength() {
        return this.userPasswordStrength;
    }

    public final SystemSettingsBean copy(int userPasswordStrength) {
        return new SystemSettingsBean(userPasswordStrength);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SystemSettingsBean) && this.userPasswordStrength == ((SystemSettingsBean) other).userPasswordStrength;
    }

    public final int getUserPasswordStrength() {
        return this.userPasswordStrength;
    }

    public int hashCode() {
        return Integer.hashCode(this.userPasswordStrength);
    }

    public String toString() {
        return "SystemSettingsBean(userPasswordStrength=" + this.userPasswordStrength + ")";
    }
}
