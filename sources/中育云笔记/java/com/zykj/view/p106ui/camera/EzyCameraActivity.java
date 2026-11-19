package com.zykj.view.p106ui.camera;

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
import com.zykj.view.p106ui.camera.ImagePickFragment;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
public final class EzyCameraActivity extends AppCompatActivity {

    /* renamed from: c */
    public ViewActivityEzyCameraBinding f20748c;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding contentView = DataBindingUtil.setContentView(this, R$layout.view_activity_ezy_camera);
        AbstractC9979u.m20293f(contentView, "setContentView(...)");
        this.f20748c = (ViewActivityEzyCameraBinding) contentView;
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        int i10 = R$id.fragment_container;
        ImagePickFragment.C8888a c8888a = ImagePickFragment.f20749k;
        Intent intent = getIntent();
        fragmentTransactionBeginTransaction.replace(i10, c8888a.m17385a(intent != null ? (Uri) intent.getParcelableExtra("Uri") : null)).commitAllowingStateLoss();
    }
}
