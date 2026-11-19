package com.zykj.study.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.kunminx.architecture.p043ui.callback.ProtectedUnPeekLiveData;
import com.zykj.base.bean.toast.ToastErrorCodeMessage;
import com.zykj.base.bean.toast.ToastMessage;
import com.zykj.base.utils.XToastUtils;
import com.zykj.study.view.SpecialToastView;
import kotlin.jvm.internal.AbstractC9133u;
import p086e5.AbstractC8366o;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class SpecialToastView extends View {

    /* renamed from: a */
    public ProtectedUnPeekLiveData f13803a;

    /* renamed from: b */
    public final Observer f13804b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpecialToastView(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC9133u.m16133g(context, "context");
        this.f13804b = new Observer() { // from class: f5.s
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SpecialToastView.m11974b(context, (ToastMessage) obj);
            }
        };
    }

    /* renamed from: b */
    public static final void m11974b(Context context, ToastMessage it) {
        AbstractC9133u.m16133g(it, "it");
        String message = it.getMessage();
        if (message == null) {
            message = "";
        }
        Integer messageResId = it.getMessageResId();
        if (messageResId != null) {
            message = context.getString(messageResId.intValue());
            AbstractC9133u.m16132f(message, "getString(...)");
        }
        if (!(it instanceof ToastErrorCodeMessage)) {
            AbstractC8366o.m13652d(XToastUtils.INSTANCE, message);
            return;
        }
        AbstractC8366o.m13652d(XToastUtils.INSTANCE, ((ToastErrorCodeMessage) it).getErrorInfo().getCode() + " " + ((Object) message));
    }

    public final ProtectedUnPeekLiveData<ToastMessage> getToastLiveData() {
        return this.f13803a;
    }

    public final void setToastLiveData(ProtectedUnPeekLiveData<ToastMessage> protectedUnPeekLiveData) {
        this.f13803a = protectedUnPeekLiveData;
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
        if (lifecycleOwner == null || protectedUnPeekLiveData == null) {
            return;
        }
        protectedUnPeekLiveData.observe(lifecycleOwner, this.f13804b);
    }
}
