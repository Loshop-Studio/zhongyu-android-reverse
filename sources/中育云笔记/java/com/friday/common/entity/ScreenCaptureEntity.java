package com.friday.common.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class ScreenCaptureEntity {
    public static final int $stable = 0;
    private final String deviceCode;
    private final String name;
    private final String versionCode;

    public ScreenCaptureEntity(String name, String deviceCode, String versionCode) {
        AbstractC9979u.m20294g(name, "name");
        AbstractC9979u.m20294g(deviceCode, "deviceCode");
        AbstractC9979u.m20294g(versionCode, "versionCode");
        this.name = name;
        this.deviceCode = deviceCode;
        this.versionCode = versionCode;
    }

    public static /* synthetic */ ScreenCaptureEntity copy$default(ScreenCaptureEntity screenCaptureEntity, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = screenCaptureEntity.name;
        }
        if ((i10 & 2) != 0) {
            str2 = screenCaptureEntity.deviceCode;
        }
        if ((i10 & 4) != 0) {
            str3 = screenCaptureEntity.versionCode;
        }
        return screenCaptureEntity.copy(str, str2, str3);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.deviceCode;
    }

    public final String component3() {
        return this.versionCode;
    }

    public final ScreenCaptureEntity copy(String name, String deviceCode, String versionCode) {
        AbstractC9979u.m20294g(name, "name");
        AbstractC9979u.m20294g(deviceCode, "deviceCode");
        AbstractC9979u.m20294g(versionCode, "versionCode");
        return new ScreenCaptureEntity(name, deviceCode, versionCode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenCaptureEntity)) {
            return false;
        }
        ScreenCaptureEntity screenCaptureEntity = (ScreenCaptureEntity) obj;
        return AbstractC9979u.m20289b(this.name, screenCaptureEntity.name) && AbstractC9979u.m20289b(this.deviceCode, screenCaptureEntity.deviceCode) && AbstractC9979u.m20289b(this.versionCode, screenCaptureEntity.versionCode);
    }

    public final String getDeviceCode() {
        return this.deviceCode;
    }

    public final String getName() {
        return this.name;
    }

    public final String getVersionCode() {
        return this.versionCode;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.deviceCode.hashCode()) * 31) + this.versionCode.hashCode();
    }

    public String toString() {
        return "ScreenCaptureEntity(name=" + this.name + ", deviceCode=" + this.deviceCode + ", versionCode=" + this.versionCode + ")";
    }
}
