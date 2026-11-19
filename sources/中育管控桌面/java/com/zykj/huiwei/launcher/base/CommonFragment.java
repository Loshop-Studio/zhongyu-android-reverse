package com.zykj.huiwei.launcher.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.KeyEventDispatcher;
import androidx.databinding.ViewDataBinding;
import androidx.navigation.NavOptions;
import com.zykj.base.BaseFragment;
import com.zykj.base.utils.XToastUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import p149s3.InterfaceC7696d;
import p149s3.InterfaceC7697e;
import p163u3.AbstractC7771c;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0007J\u000f\u0010\u0013\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0007J\u001a\u0010\u0014\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0094@¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00112\b\b\u0001\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J+\u0010%\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00192\b\u0010\"\u001a\u0004\u0018\u00010\f2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010/\u001a\u00020*8\u0016X\u0096D¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u00102\u001a\u00020*8\u0016X\u0096D¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010.¨\u00063"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/base/CommonFragment;", "Landroidx/databinding/ViewDataBinding;", "DataBinding", "Lcom/zykj/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Ls3/d;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onResume", "f", "initView", "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "v", "onClick", "(Landroid/view/View;)V", "", "res", "j", "(I)V", "", "content", "k", "(Ljava/lang/String;)V", "id", "args", "Landroidx/navigation/NavOptions;", "options", "d", "(ILandroid/os/Bundle;Landroidx/navigation/NavOptions;)V", "a", "Landroid/view/View;", "rootView", "", "b", "Z", "i", "()Z", "isLightStatusBars", "c", "h", "isLightNavigationBars", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public abstract class CommonFragment<DataBinding extends ViewDataBinding> extends BaseFragment<DataBinding> implements View.OnClickListener, InterfaceC7696d {

    /* renamed from: a, reason: from kotlin metadata */
    public View rootView;

    /* renamed from: b, reason: from kotlin metadata */
    public final boolean isLightStatusBars;

    /* renamed from: c, reason: from kotlin metadata */
    public final boolean isLightNavigationBars;

    /* renamed from: g */
    public static /* synthetic */ Object m5282g(CommonFragment commonFragment, Bundle bundle, Continuation continuation) {
        return Unit.INSTANCE;
    }

    @Override // p149s3.InterfaceC7696d
    /* renamed from: d */
    public void mo5283d(int id, Bundle args, NavOptions options) {
        KeyEventDispatcher.Component activity = getActivity();
        if (activity == null || !(activity instanceof InterfaceC7697e)) {
            return;
        }
        ((InterfaceC7697e) activity).getNavController().navigate(id, args, options);
    }

    /* renamed from: f */
    public abstract void mo5284f();

    /* renamed from: h, reason: from getter */
    public boolean getIsLightNavigationBars() {
        return this.isLightNavigationBars;
    }

    /* renamed from: i, reason: from getter */
    public boolean getIsLightStatusBars() {
        return this.isLightStatusBars;
    }

    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, Continuation continuation) {
        return m5282g(this, bundle, continuation);
    }

    /* renamed from: j */
    public final void m5287j(int res) {
        String string = getString(res);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        m5288k(string);
    }

    /* renamed from: k */
    public final void m5288k(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        XToastUtils.INSTANCE.toast(content);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v6) {
    }

    @Override // com.zykj.base.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        if (this.rootView == null) {
            this.rootView = super.onCreateView(inflater, container, savedInstanceState);
            mo5284f();
        }
        getMBindView().setLifecycleOwner(getViewLifecycleOwner());
        return this.rootView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AbstractC7771c.m9300a(this, getIsLightStatusBars(), getIsLightNavigationBars());
    }
}
