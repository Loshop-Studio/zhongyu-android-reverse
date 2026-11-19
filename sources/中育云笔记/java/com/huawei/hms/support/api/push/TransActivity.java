package com.huawei.hms.support.api.push;

import android.app.Activity;
import android.os.Bundle;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.huawei.android.hms.push.R$layout;
import p344t5.AbstractC11244r;

/* loaded from: classes5.dex */
public class TransActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.hwpush_trans_activity);
        getWindow().addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        AbstractC11244r.m25077a(this, getIntent());
        finish();
    }
}
