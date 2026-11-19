package com.zykj.mistake.base;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.exifinterface.media.ExifInterface;
import com.zykj.mistake.base.BasePresenter;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import p081i4.InterfaceC5679b;
import p159s5.C6558a;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m5110d2 = {"Lcom/zykj/mistake/base/BaseMVPFragment;", "Lcom/zykj/mistake/base/BasePresenter;", "P", "Landroidx/databinding/ViewDataBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/zykj/mistake/base/BaseFragment;", "Li4/b;", "<init>", "()V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class BaseMVPFragment<P extends BasePresenter, T extends ViewDataBinding> extends BaseFragment<T> implements InterfaceC5679b {

    /* renamed from: b */
    public BasePresenter f5997b;

    /* renamed from: c */
    public ProgressDialog f5998c;

    @Override // p081i4.InterfaceC5679b
    /* renamed from: c */
    public final void mo3963c() {
        ProgressDialog progressDialog = this.f5998c;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    @Override // p081i4.InterfaceC5679b
    /* renamed from: d */
    public final void mo3964d(boolean z8) {
        ProgressDialog progressDialog = this.f5998c;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.f5998c = ProgressDialog.show(getActivity(), "", "请稍候。。", false, true);
    }

    /* renamed from: h */
    public final BasePresenter m3966h() {
        BasePresenter basePresenter = this.f5997b;
        if (basePresenter != null) {
            return basePresenter;
        }
        AbstractC5830k.m5339p("mPresenter");
        throw null;
    }

    /* renamed from: i */
    public abstract Class mo3967i();

    /* renamed from: j */
    public abstract void mo3968j();

    @Override // com.zykj.mistake.base.BaseFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) throws IllegalAccessException, InstantiationException {
        AbstractC5830k.m5330g(inflater, "inflater");
        View viewOnCreateView = super.onCreateView(inflater, viewGroup, bundle);
        Object objNewInstance = mo3967i().newInstance();
        AbstractC5830k.m5329f(objNewInstance, "newInstance(...)");
        this.f5997b = (BasePresenter) objNewInstance;
        m3966h().f6001c = this;
        mo3968j();
        return viewOnCreateView;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [i4.b, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        BasePresenter basePresenterM3966h = m3966h();
        ?? r1 = basePresenterM3966h.f6001c;
        if (r1 != 0) {
            r1.mo3963c();
        }
        basePresenterM3966h.f6001c = null;
        C6558a c6558a = basePresenterM3966h.f6000b;
        if (c6558a != null) {
            c6558a.dispose();
        }
        basePresenterM3966h.f6000b = null;
    }
}
