package com.zykj.huiwei.launcher.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.zykj.base.BaseDialogFragment;
import com.zykj.base.utils.XToastUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0006J\u001a\u0010\u0012\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0084@¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0006J\u0019\u0010\u0016\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00102\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/base/CommonDialogFragment;", "Landroidx/databinding/ViewDataBinding;", "DataBinding", "Lcom/zykj/base/BaseDialogFragment;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "g", "initView", "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "v", "onClick", "(Landroid/view/View;)V", "", "res", "h", "(I)V", "", "content", "i", "(Ljava/lang/String;)V", "a", "Landroid/view/View;", "rootView", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public abstract class CommonDialogFragment<DataBinding extends ViewDataBinding> extends BaseDialogFragment<DataBinding> implements View.OnClickListener {

    /* renamed from: a, reason: from kotlin metadata */
    public View rootView;

    /* renamed from: f */
    public void m5278f() {
    }

    /* renamed from: g */
    public abstract void mo5279g();

    /* renamed from: h */
    public final void m5280h(int res) {
        String string = getString(res);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        m5281i(string);
    }

    /* renamed from: i */
    public final void m5281i(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        XToastUtils.INSTANCE.toast(content);
    }

    @Override // com.zykj.base.BaseDialogFragment
    public final Object initView(Bundle bundle, Continuation continuation) {
        m5278f();
        return Unit.INSTANCE;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v6) {
    }

    @Override // com.zykj.base.BaseDialogFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        if (this.rootView == null) {
            this.rootView = super.onCreateView(inflater, container, savedInstanceState);
            mo5279g();
        }
        return this.rootView;
    }
}
