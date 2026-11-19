package com.zykj.view.p037ui.camera;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentTransaction;
import com.zykj.view.C5280R;
import com.zykj.view.databinding.ViewActivityEzyCameraBinding;
import com.zykj.view.p037ui.camera.ImagePickFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/ui/camera/EzyCameraActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ld6/s;", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/zykj/view/databinding/ViewActivityEzyCameraBinding;", "mBinding", "Lcom/zykj/view/databinding/ViewActivityEzyCameraBinding;", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class EzyCameraActivity extends AppCompatActivity {
    private ViewActivityEzyCameraBinding mBinding;

    @Override // androidx.fragment.app.FragmentActivity, android.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewDataBinding contentView = DataBindingUtil.setContentView(this, C5280R.layout.view_activity_ezy_camera);
        AbstractC5830k.m5329f(contentView, "setContentView(...)");
        this.mBinding = (ViewActivityEzyCameraBinding) contentView;
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        int i = C5280R.id.fragment_container;
        ImagePickFragment.Companion companion = ImagePickFragment.INSTANCE;
        Intent intent = getIntent();
        fragmentTransactionBeginTransaction.replace(i, companion.newInstance(intent != null ? (Uri) intent.getParcelableExtra("Uri") : null)).commitAllowingStateLoss();
    }
}
