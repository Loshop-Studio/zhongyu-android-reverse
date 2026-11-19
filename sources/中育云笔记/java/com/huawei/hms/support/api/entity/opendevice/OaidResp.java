package com.huawei.hms.support.api.entity.opendevice;

import android.app.PendingIntent;
import com.huawei.hms.core.aidl.AbstractC7274a;

/* loaded from: classes5.dex */
public class OaidResp extends AbstractC7274a {

    /* renamed from: d */
    public String f11742d;

    /* renamed from: e */
    public boolean f11743e;

    /* renamed from: f */
    public PendingIntent f11744f;

    public String getId() {
        return this.f11742d;
    }

    public PendingIntent getSettingIntent() {
        return this.f11744f;
    }

    public boolean isTrackLimited() {
        return this.f11743e;
    }

    public void setId(String str) {
        this.f11742d = str;
    }

    public void setSettingIntent(PendingIntent pendingIntent) {
        this.f11744f = pendingIntent;
    }

    public void setTrackLimited(boolean z10) {
        this.f11743e = z10;
    }
}
