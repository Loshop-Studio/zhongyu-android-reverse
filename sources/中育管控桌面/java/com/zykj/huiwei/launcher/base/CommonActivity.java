package com.zykj.huiwei.launcher.base;

import android.content.res.Resources;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.zykj.base.BaseActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p078i4.AbstractC6531a;
import p163u3.AbstractC7769a;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0014J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u000e"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/base/CommonActivity;", "dataBinding", "Landroidx/databinding/ViewDataBinding;", "Lcom/zykj/base/BaseActivity;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "getResources", "Landroid/content/res/Resources;", "onResume", "", "onClick", "v", "Landroid/view/View;", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public abstract class CommonActivity<dataBinding extends ViewDataBinding> extends BaseActivity<dataBinding> implements View.OnClickListener {
    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        AbstractC6531a.a aVar = AbstractC6531a.f8362a;
        Resources resources = super.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return aVar.m7292a(resources, 600);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v6) {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        AbstractC7769a.m9299a(this);
    }
}
