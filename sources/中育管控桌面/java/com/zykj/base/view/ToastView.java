package com.zykj.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.kunminx.architecture.p031ui.callback.ProtectedUnPeekLiveData;
import com.zykj.base.bean.toast.ToastErrorCodeMessage;
import com.zykj.base.bean.toast.ToastErrorMessage;
import com.zykj.base.bean.toast.ToastInfoMessage;
import com.zykj.base.bean.toast.ToastMessage;
import com.zykj.base.bean.toast.ToastSuccessMessage;
import com.zykj.base.bean.toast.ToastWarnMessage;
import com.zykj.base.utils.XToastUtils;
import com.zykj.base.view.ToastView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7879d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R:\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m7880d2 = {"Lcom/zykj/base/view/ToastView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;", "Lcom/zykj/base/bean/toast/ToastMessage;", "value", "a", "Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;", "getToastLiveData", "()Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;", "setToastLiveData", "(Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;)V", "toastLiveData", "Landroidx/lifecycle/Observer;", "b", "Landroidx/lifecycle/Observer;", "observer", "base_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes3.dex */
public final class ToastView extends View {

    /* renamed from: a, reason: from kotlin metadata */
    public ProtectedUnPeekLiveData toastLiveData;

    /* renamed from: b, reason: from kotlin metadata */
    public final Observer observer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToastView(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.observer = new Observer() { // from class: z2.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ToastView.m4991b(context, (ToastMessage) obj);
            }
        };
    }

    /* renamed from: b */
    public static final void m4991b(Context context, ToastMessage it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String message = it.getMessage();
        if (message == null) {
            message = "";
        }
        Integer messageResId = it.getMessageResId();
        if (messageResId != null) {
            message = context.getString(messageResId.intValue());
            Intrinsics.checkNotNullExpressionValue(message, "getString(...)");
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
        return this.toastLiveData;
    }

    public final void setToastLiveData(ProtectedUnPeekLiveData<ToastMessage> protectedUnPeekLiveData) {
        this.toastLiveData = protectedUnPeekLiveData;
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
        if (lifecycleOwner == null || protectedUnPeekLiveData == null) {
            return;
        }
        protectedUnPeekLiveData.observe(lifecycleOwner, this.observer);
    }
}
