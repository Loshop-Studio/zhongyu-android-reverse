package com.zykj.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.kunminx.architecture.p043ui.callback.ProtectedUnPeekLiveData;
import com.zykj.base.bean.toast.ToastErrorCodeMessage;
import com.zykj.base.bean.toast.ToastErrorMessage;
import com.zykj.base.bean.toast.ToastInfoMessage;
import com.zykj.base.bean.toast.ToastMessage;
import com.zykj.base.bean.toast.ToastSuccessMessage;
import com.zykj.base.bean.toast.ToastWarnMessage;
import com.zykj.base.utils.XToastUtils;
import com.zykj.base.view.ToastView;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class ToastView extends View {

    /* renamed from: a */
    public ProtectedUnPeekLiveData f8673a;

    /* renamed from: b */
    public final Observer f8674b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToastView(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC9133u.m16133g(context, "context");
        this.f8674b = new Observer() { // from class: b3.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ToastView.m7350b(context, (ToastMessage) obj);
            }
        };
    }

    /* renamed from: b */
    public static final void m7350b(Context context, ToastMessage it) {
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
        if (it instanceof ToastInfoMessage) {
            XToastUtils.INSTANCE.info(message);
            return;
        }
        if (it instanceof ToastWarnMessage) {
            XToastUtils.INSTANCE.info(message);
            return;
        }
        if (it instanceof ToastErrorMessage) {
            XToastUtils.INSTANCE.error(message);
            return;
        }
        if (!(it instanceof ToastErrorCodeMessage)) {
            if (it instanceof ToastSuccessMessage) {
                XToastUtils.INSTANCE.success(message);
                return;
            } else {
                XToastUtils.INSTANCE.info(message);
                return;
            }
        }
        XToastUtils.INSTANCE.error(((ToastErrorCodeMessage) it).getErrorInfo().getCode() + " " + ((Object) message));
    }

    public final ProtectedUnPeekLiveData<ToastMessage> getToastLiveData() {
        return this.f8673a;
    }

    public final void setToastLiveData(ProtectedUnPeekLiveData<ToastMessage> protectedUnPeekLiveData) {
        this.f8673a = protectedUnPeekLiveData;
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
        if (lifecycleOwner == null || protectedUnPeekLiveData == null) {
            return;
        }
        protectedUnPeekLiveData.observe(lifecycleOwner, this.f8674b);
    }
}
