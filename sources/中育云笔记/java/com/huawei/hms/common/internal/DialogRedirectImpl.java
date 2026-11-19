package com.huawei.hms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes5.dex */
public class DialogRedirectImpl extends DialogRedirect {

    /* renamed from: c */
    public final Activity f11545c;

    /* renamed from: d */
    public final int f11546d;

    /* renamed from: e */
    public final Intent f11547e;

    public DialogRedirectImpl(Intent intent, Activity activity, int i10) {
        this.f11547e = intent;
        this.f11545c = activity;
        this.f11546d = i10;
    }

    @Override // com.huawei.hms.common.internal.DialogRedirect
    public final void redirect() {
        Activity activity;
        Intent intent = this.f11547e;
        if (intent == null || (activity = this.f11545c) == null) {
            return;
        }
        activity.startActivityForResult(intent, this.f11546d);
    }
}
