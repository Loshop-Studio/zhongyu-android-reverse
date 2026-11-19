package com.huawei.hms.support.api.client;

import android.os.Bundle;

/* loaded from: classes5.dex */
public class BundleResult {

    /* renamed from: a */
    private int f11728a;

    /* renamed from: b */
    private Bundle f11729b;

    public BundleResult(int i10, Bundle bundle) {
        this.f11728a = i10;
        this.f11729b = bundle;
    }

    public int getResultCode() {
        return this.f11728a;
    }

    public Bundle getRspBody() {
        return this.f11729b;
    }

    public void setResultCode(int i10) {
        this.f11728a = i10;
    }

    public void setRspBody(Bundle bundle) {
        this.f11729b = bundle;
    }
}
