package com.zykj.mistake.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import com.blankj.utilcode.util.AbstractC3387g;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import p081i4.InterfaceC5679b;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m5110d2 = {"Lcom/zykj/mistake/base/BaseFragment;", "Landroidx/databinding/ViewDataBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class BaseFragment<T extends ViewDataBinding> extends Fragment {

    /* renamed from: a */
    public ViewDataBinding f5991a;

    /* renamed from: b */
    public final void m3958b(String tip) {
        AbstractC5830k.m5330g(tip, "tip");
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        if (componentRequireActivity instanceof InterfaceC5679b) {
            ((InterfaceC5679b) componentRequireActivity).mo3962b(tip);
        }
    }

    /* renamed from: e */
    public abstract int mo3959e();

    /* renamed from: f */
    public final ViewDataBinding m3960f() {
        ViewDataBinding viewDataBinding = this.f5991a;
        if (viewDataBinding != null) {
            return viewDataBinding;
        }
        AbstractC5830k.m5339p("mBinding");
        throw null;
    }

    /* renamed from: g */
    public abstract void mo3961g(View view);

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5830k.m5330g(inflater, "inflater");
        AbstractC3387g.m2338a("当前的fragment是".concat(getClass().getSimpleName()));
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(inflater, mo3959e(), viewGroup, false);
        AbstractC5830k.m5329f(viewDataBindingInflate, "inflate(...)");
        this.f5991a = viewDataBindingInflate;
        View root = m3960f().getRoot();
        AbstractC5830k.m5327d(root);
        mo3961g(root);
        return root;
    }
}
