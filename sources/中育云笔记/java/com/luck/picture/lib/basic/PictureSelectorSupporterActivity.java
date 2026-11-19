package com.luck.picture.lib.basic;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import com.luck.picture.lib.PictureSelectorFragment;
import com.luck.picture.lib.R$color;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.style.SelectMainStyle;
import p008a7.AbstractC0082o;
import p219k6.AbstractC9819a;
import p219k6.C9821c;
import p290p6.AbstractC10632a;
import p319r6.AbstractC10910b;

/* loaded from: classes5.dex */
public class PictureSelectorSupporterActivity extends AppCompatActivity {
    /* renamed from: J */
    public final void m9319J() {
        SelectMainStyle selectMainStyleM26627c = PictureSelectionConfig.f12295P0.m26627c();
        int iM9522S = selectMainStyleM26627c.m9522S();
        int iM9506C = selectMainStyleM26627c.m9506C();
        boolean zM9525V = selectMainStyleM26627c.m9525V();
        if (!AbstractC0082o.m228c(iM9522S)) {
            iM9522S = ContextCompat.getColor(this, R$color.ps_color_grey);
        }
        if (!AbstractC0082o.m228c(iM9506C)) {
            iM9506C = ContextCompat.getColor(this, R$color.ps_color_grey);
        }
        AbstractC10632a.m22482a(this, iM9522S, iM9506C, zM9525V);
    }

    /* renamed from: K */
    public void m9320K() {
        PictureSelectionConfig pictureSelectionConfigM9328c = PictureSelectionConfig.m9328c();
        int i10 = pictureSelectionConfigM9328c.f12304D;
        if (i10 == -2 || pictureSelectionConfigM9328c.f12338d) {
            return;
        }
        AbstractC10910b.m23751d(this, i10);
    }

    /* renamed from: L */
    public final void m9321L() {
        AbstractC9819a.m19890a(this, PictureSelectorFragment.f12030B, PictureSelectorFragment.m8929h2());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(C9821c.m19894a(context, PictureSelectionConfig.m9328c().f12304D));
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, PictureSelectionConfig.f12295P0.m26629e().f12500d);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m9320K();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m9319J();
        setContentView(R$layout.ps_activity_container);
        m9321L();
    }
}
