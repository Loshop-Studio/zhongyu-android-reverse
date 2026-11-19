package com.luck.picture.lib.basic;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.luck.picture.lib.PictureOnlyCameraFragment;
import com.luck.picture.lib.PictureSelectorPreviewFragment;
import com.luck.picture.lib.PictureSelectorSystemFragment;
import com.luck.picture.lib.R$anim;
import com.luck.picture.lib.R$color;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.style.SelectMainStyle;
import java.util.ArrayList;
import p008a7.AbstractC0082o;
import p219k6.AbstractC9819a;
import p260n6.InterfaceC10322a;
import p290p6.AbstractC10632a;
import p359u6.AbstractC11370a;

/* loaded from: classes5.dex */
public class PictureSelectorTransparentActivity extends AppCompatActivity {
    /* renamed from: J */
    private void m9322J() {
        if (PictureSelectionConfig.f12295P0 == null) {
            PictureSelectionConfig.m9328c();
        }
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

    /* renamed from: M */
    private void m9323M() {
        String str;
        Fragment fragmentM8901U0;
        int intExtra = getIntent().getIntExtra("com.luck.picture.lib.mode_type_source", 0);
        if (intExtra == 1) {
            str = PictureSelectorSystemFragment.f12131q;
            fragmentM8901U0 = PictureSelectorSystemFragment.m9116j1();
        } else if (intExtra == 2) {
            InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
            str = PictureSelectorPreviewFragment.f12069P;
            PictureSelectorPreviewFragment pictureSelectorPreviewFragmentM9015U1 = PictureSelectorPreviewFragment.m9015U1();
            int intExtra2 = getIntent().getIntExtra("com.luck.picture.lib.current_preview_position", 0);
            ArrayList arrayList = new ArrayList(AbstractC11370a.m25305m());
            pictureSelectorPreviewFragmentM9015U1.m9077i2(intExtra2, arrayList.size(), arrayList, getIntent().getBooleanExtra("com.luck.picture.lib.external_preview_display_delete", false));
            fragmentM8901U0 = pictureSelectorPreviewFragmentM9015U1;
        } else {
            str = PictureOnlyCameraFragment.f12028m;
            fragmentM8901U0 = PictureOnlyCameraFragment.m8901U0();
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment fragmentFindFragmentByTag = supportFragmentManager.findFragmentByTag(str);
        if (fragmentFindFragmentByTag != null) {
            supportFragmentManager.beginTransaction().remove(fragmentFindFragmentByTag).commitAllowingStateLoss();
        }
        AbstractC9819a.m19891b(supportFragmentManager, str, fragmentM8901U0);
    }

    /* renamed from: K */
    public final boolean m9324K() {
        return getIntent().getIntExtra("com.luck.picture.lib.mode_type_source", 0) == 2;
    }

    /* renamed from: L */
    public final void m9325L() {
        Window window = getWindow();
        window.setGravity(51);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.x = 0;
        attributes.y = 0;
        attributes.height = 1;
        attributes.width = 1;
        window.setAttributes(attributes);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        PictureSelectionConfig pictureSelectionConfigM9328c = PictureSelectionConfig.m9328c();
        if (getIntent().getIntExtra("com.luck.picture.lib.mode_type_source", 0) != 2 || pictureSelectionConfigM9328c.f12322M) {
            overridePendingTransition(0, R$anim.ps_anim_fade_out);
        } else {
            overridePendingTransition(0, PictureSelectionConfig.f12295P0.m26629e().f12500d);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m9322J();
        setContentView(R$layout.ps_empty);
        if (!m9324K()) {
            m9325L();
        }
        m9323M();
    }
}
