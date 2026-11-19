package com.huawei.hms.adapter;

import android.os.Parcelable;
import com.huawei.hms.core.aidl.InterfaceC7278e;

/* loaded from: classes5.dex */
class CoreBaseRequest implements InterfaceC7278e {

    /* renamed from: c */
    public String f11324c;

    /* renamed from: d */
    public String f11325d;

    /* renamed from: e */
    public Parcelable f11326e;

    public String getJsonHeader() {
        return this.f11325d;
    }

    public String getJsonObject() {
        return this.f11324c;
    }

    public Parcelable getParcelable() {
        return this.f11326e;
    }

    public void setJsonHeader(String str) {
        this.f11325d = str;
    }

    public void setJsonObject(String str) {
        this.f11324c = str;
    }

    public void setParcelable(Parcelable parcelable) {
        this.f11326e = parcelable;
    }
}
