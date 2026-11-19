package com.zykj.view.p067ui.camera;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentTransaction;
import com.zykj.view.R$id;
import com.zykj.view.R$layout;
import com.zykj.view.databinding.ViewActivityEzyCameraBinding;
import com.zykj.view.p067ui.camera.ImagePickFragment;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes5.dex */
public final class EzyCameraActivity extends AppCompatActivity {

    /* renamed from: a */
    public ViewActivityEzyCameraBinding f15534a;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding contentView = DataBindingUtil.setContentView(this, R$layout.view_activity_ezy_camera);
        AbstractC9133u.m16132f(contentView, "setContentView(...)");
        this.f15534a = (ViewActivityEzyCameraBinding) contentView;
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        int i10 = R$id.fragment_container;
        ImagePickFragment.C8255a c8255a = ImagePickFragment.f15535h;
        Intent intent = getIntent();
        fragmentTransactionBeginTransaction.replace(i10, c8255a.m13310a(intent != null ? (Uri) intent.getParcelableExtra("Uri") : null)).commitAllowingStateLoss();
    }
}
