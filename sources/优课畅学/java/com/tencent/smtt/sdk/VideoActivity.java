package com.tencent.smtt.sdk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.tbs.video.interfaces.InterfaceC6870a;

/* loaded from: classes4.dex */
public class VideoActivity extends Activity {
    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        C6802ba.m6130a(this).m6131a(i10, i11, intent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        super.requestWindowFeature(1);
        super.getWindow().setFormat(-3);
        Intent intent = super.getIntent();
        Bundle bundleExtra = intent != null ? intent.getBundleExtra("extraData") : null;
        if (bundleExtra != null) {
            bundleExtra.putInt("callMode", 1);
            C6802ba.m6130a(super.getApplicationContext()).m6134a((String) null, bundleExtra, (InterfaceC6870a) null);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C6802ba.m6130a(this).m6132a(this, 4);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        C6802ba.m6130a(this).m6132a(this, 3);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        C6802ba.m6130a(this).m6132a(this, 2);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        C6802ba.m6130a(this).m6132a(this, 1);
    }
}
