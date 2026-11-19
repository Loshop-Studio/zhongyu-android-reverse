package com.friday.common.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentManager;
import com.friday.common.R$string;
import com.friday.common.widget.dialog.BaseDialog;
import com.friday.common.widget.dialog.C5975a;
import kotlin.jvm.internal.AbstractC9979u;
import p141f2.C9166c;
import p429z1.AbstractC11958b;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public abstract class BaseDialogFragment<Binding extends ViewDataBinding> extends AppCompatDialogFragment implements InterfaceC5929c, IView, InterfaceViewOnClickListenerC5928b {

    /* renamed from: d */
    public ViewDataBinding f5616d;

    /* renamed from: e */
    public BaseDialog f5617e;

    /* renamed from: o */
    private final void m4797o() {
        BaseDialog baseDialog = this.f5617e;
        if (baseDialog != null) {
            baseDialog.dismiss();
        }
    }

    /* renamed from: p */
    private final void m4798p(boolean z10) {
        if (C9166c.f21406a.m18061e()) {
            if (this.f5617e == null) {
                this.f5617e = C5975a.f6196a.m5438J(z10, AbstractC11958b.m26585f(R$string.waiting_please));
            }
            BaseDialog baseDialog = this.f5617e;
            if (baseDialog != null) {
                FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
                AbstractC9979u.m20293f(supportFragmentManager, "getSupportFragmentManager(...)");
                baseDialog.show(supportFragmentManager, "progress_dialog_base_fragment");
            }
        }
    }

    public final ViewDataBinding getMBinding() {
        ViewDataBinding viewDataBinding = this.f5616d;
        if (viewDataBinding != null) {
            return viewDataBinding;
        }
        AbstractC9979u.m20312y("mBinding");
        return null;
    }

    public void isShowLoading(boolean z10) {
        if (z10) {
            m4798p(false);
        } else {
            m4797o();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        initData();
    }

    @Override // com.friday.common.base.InterfaceViewOnClickListenerC5928b, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC9979u.m20294g(inflater, "inflater");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(inflater, getLayoutId(), viewGroup, false);
        AbstractC9979u.m20293f(viewDataBindingInflate, "inflate(...)");
        setMBinding(viewDataBindingInflate);
        getMBinding().setLifecycleOwner(this);
        return getMBinding().getRoot();
    }

    public final void setClickListener(View... view) {
        AbstractC9979u.m20294g(view, "view");
        for (View view2 : view) {
            view2.setOnClickListener(this);
        }
    }

    public final void setMBinding(ViewDataBinding viewDataBinding) {
        AbstractC9979u.m20294g(viewDataBinding, "<set-?>");
        this.f5616d = viewDataBinding;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager manager, String str) {
        AbstractC9979u.m20294g(manager, "manager");
        try {
            super.show(manager, str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
