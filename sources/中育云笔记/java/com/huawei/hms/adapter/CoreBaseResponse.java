package com.huawei.hms.adapter;

import android.app.PendingIntent;
import android.content.Intent;
import com.huawei.hms.core.aidl.InterfaceC7278e;
import p161g5.InterfaceC9271a;

/* loaded from: classes5.dex */
public class CoreBaseResponse implements InterfaceC7278e {

    /* renamed from: c */
    public String f11327c;

    /* renamed from: d */
    public String f11328d;

    @InterfaceC9271a
    public Intent intent;

    @InterfaceC9271a
    public PendingIntent pendingIntent;

    public Intent getIntent() {
        return this.intent;
    }

    public String getJsonBody() {
        return this.f11328d;
    }

    public String getJsonHeader() {
        return this.f11327c;
    }

    public PendingIntent getPendingIntent() {
        return this.pendingIntent;
    }

    public void setIntent(Intent intent) {
        this.intent = intent;
    }

    public void setJsonBody(String str) {
        this.f11328d = str;
    }

    public void setJsonHeader(String str) {
        this.f11327c = str;
    }

    public void setPendingIntent(PendingIntent pendingIntent) {
        this.pendingIntent = pendingIntent;
    }
}
