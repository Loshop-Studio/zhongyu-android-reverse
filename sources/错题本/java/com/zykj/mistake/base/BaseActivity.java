package com.zykj.mistake.base;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.exifinterface.media.ExifInterface;
import com.blankj.utilcode.util.AbstractC3387g;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m5110d2 = {"Lcom/zykj/mistake/base/BaseActivity;", "Landroidx/databinding/ViewDataBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class BaseActivity<T extends ViewDataBinding> extends AppCompatActivity {

    /* renamed from: a */
    public ViewDataBinding f5990a;

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context newBase) {
        AbstractC5830k.m5330g(newBase, "newBase");
        super.attachBaseContext(AbstractC5806u.m5261O(newBase));
    }

    /* renamed from: o */
    public abstract int mo3905o();

    @Override // androidx.fragment.app.FragmentActivity, android.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC3387g.m2338a("当前的activity是".concat(getClass().getSimpleName()));
        ViewDataBinding contentView = DataBindingUtil.setContentView(this, mo3905o());
        AbstractC5830k.m5329f(contentView, "setContentView(...)");
        this.f5990a = contentView;
        mo3906q();
    }

    /* renamed from: p */
    public final ViewDataBinding m3957p() {
        ViewDataBinding viewDataBinding = this.f5990a;
        if (viewDataBinding != null) {
            return viewDataBinding;
        }
        AbstractC5830k.m5339p("mBinding");
        throw null;
    }

    /* renamed from: q */
    public abstract void mo3906q();
}
