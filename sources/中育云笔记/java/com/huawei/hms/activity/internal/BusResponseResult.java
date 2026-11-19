package com.huawei.hms.activity.internal;

import android.content.Intent;

/* loaded from: classes5.dex */
public class BusResponseResult {

    /* renamed from: a */
    public Intent f11278a;

    /* renamed from: b */
    public int f11279b;

    public int getCode() {
        return this.f11279b;
    }

    public Intent getIntent() {
        return this.f11278a;
    }

    public void setCode(int i10) {
        this.f11279b = i10;
    }

    public void setIntent(Intent intent) {
        this.f11278a = intent;
    }
}
