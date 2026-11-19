package com.zykj.view.p059ui.camera;

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
import com.zykj.view.p059ui.camera.ImagePickFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, m13558d2 = {"Lcom/zykj/view/ui/camera/EzyCameraActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/zykj/view/databinding/ViewActivityEzyCameraBinding;", "a", "Lcom/zykj/view/databinding/ViewActivityEzyCameraBinding;", "mBinding", "view_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class EzyCameraActivity extends AppCompatActivity {

    /* renamed from: a, reason: from kotlin metadata */
    public ViewActivityEzyCameraBinding mBinding;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewDataBinding contentView = DataBindingUtil.setContentView(this, R$layout.view_activity_ezy_camera);
        Intrinsics.checkNotNullExpressionValue(contentView, "setContentView(...)");
        this.mBinding = (ViewActivityEzyCameraBinding) contentView;
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        int i10 = R$id.fragment_container;
        ImagePickFragment.Companion companion = ImagePickFragment.INSTANCE;
        Intent intent = getIntent();
        fragmentTransactionBeginTransaction.replace(i10, companion.m11454a(intent != null ? (Uri) intent.getParcelableExtra("Uri") : null)).commitAllowingStateLoss();
    }
}
