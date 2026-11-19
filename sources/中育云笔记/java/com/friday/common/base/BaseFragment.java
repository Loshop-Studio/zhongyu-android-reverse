package com.friday.common.base;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.blankj.utilcode.util.LogUtils;
import com.friday.common.R$string;
import com.friday.common.widget.dialog.BaseDialog;
import com.friday.common.widget.dialog.C5975a;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;
import p429z1.AbstractC11958b;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public abstract class BaseFragment<Binding extends ViewDataBinding> extends Fragment implements IView, InterfaceC5929c, InterfaceViewOnClickListenerC5928b {
    public static final int $stable = 8;
    private boolean isLoadingNow;
    private BaseDialog loading;
    protected Binding mBinding;
    protected Context mContext;

    /* renamed from: o */
    private final void m4799o() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        AbstractC9979u.m20293f(fragmentActivityRequireActivity, "requireActivity(...)");
        if (fragmentActivityRequireActivity instanceof BaseActivity) {
            ((BaseActivity) fragmentActivityRequireActivity).isShowLoading(false);
            return;
        }
        try {
            this.isLoadingNow = false;
            BaseDialog baseDialog = this.loading;
            if (baseDialog != null) {
                baseDialog.dismissAllowingStateLoss();
                C10786q c10786q = C10786q.f26013a;
            }
        } catch (Exception unused) {
            C10786q c10786q2 = C10786q.f26013a;
        }
    }

    /* renamed from: p */
    private final void m4800p(boolean z10) {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        AbstractC9979u.m20293f(fragmentActivityRequireActivity, "requireActivity(...)");
        if (fragmentActivityRequireActivity instanceof BaseActivity) {
            ((BaseActivity) fragmentActivityRequireActivity).isShowLoading(true);
            return;
        }
        if (this.loading == null) {
            this.loading = C5975a.f6196a.m5438J(z10, AbstractC11958b.m26585f(R$string.waiting_please));
        }
        if (this.isLoadingNow) {
            return;
        }
        BaseDialog baseDialog = this.loading;
        if (baseDialog != null) {
            FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
            AbstractC9979u.m20293f(supportFragmentManager, "getSupportFragmentManager(...)");
            baseDialog.show(supportFragmentManager, "progress_dialog_base_fragment");
        }
        this.isLoadingNow = true;
    }

    public final Binding getMBinding() {
        Binding binding = this.mBinding;
        if (binding != null) {
            return binding;
        }
        AbstractC9979u.m20312y("mBinding");
        return null;
    }

    public final Context getMContext() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        AbstractC9979u.m20312y("mContext");
        return null;
    }

    public final void hideLoadingOffline() {
        BaseDialog baseDialog = this.loading;
        if (baseDialog != null) {
            baseDialog.dismissAllowingStateLoss();
        }
    }

    public void initDataSource() {
    }

    public void initView() {
    }

    public void isShowLoading(boolean z10) {
        if (z10) {
            m4800p(false);
        } else {
            m4799o();
        }
    }

    public boolean needHideLoadingOnDestroy() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) throws Exception {
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            throw new Exception("activity is null");
        }
        setMContext(activity);
        initData();
    }

    @Override // com.friday.common.base.InterfaceViewOnClickListenerC5928b, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC9979u.m20294g(inflater, "inflater");
        LogUtils.m3886d("当前的Fragment:", " " + getClass().getSimpleName());
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(inflater, getLayoutId(), viewGroup, false);
        AbstractC9979u.m20293f(viewDataBindingInflate, "inflate(...)");
        setMBinding(viewDataBindingInflate);
        getMBinding().setLifecycleOwner(this);
        return getMBinding().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (needHideLoadingOnDestroy()) {
            m4799o();
        }
        super.onDestroy();
    }

    public final void setClickListener(View... view) {
        AbstractC9979u.m20294g(view, "view");
        for (View view2 : view) {
            view2.setOnClickListener(this);
        }
    }

    public final void setMBinding(Binding binding) {
        AbstractC9979u.m20294g(binding, "<set-?>");
        this.mBinding = binding;
    }

    public final void setMContext(Context context) {
        AbstractC9979u.m20294g(context, "<set-?>");
        this.mContext = context;
    }
}
