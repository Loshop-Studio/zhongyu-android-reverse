package p078i4;

import com.blankj.utilcode.util.AbstractC4657l0;
import com.zykj.base.bean.toast.ToastErrorCodeMessage;
import com.zykj.base.bean.toast.ToastErrorMessage;
import com.zykj.base.bean.toast.ToastInfoMessage;
import com.zykj.base.bean.toast.ToastMessage;
import com.zykj.base.bean.toast.ToastSuccessMessage;
import com.zykj.base.bean.toast.ToastWarnMessage;
import com.zykj.base.utils.XToastUtils;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i4.r */
/* loaded from: classes4.dex */
public final class C6548r {

    /* renamed from: a */
    public static final C6548r f8382a = new C6548r();

    /* renamed from: a */
    public final void m7409a(ToastMessage it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String message = it.getMessage();
        if (message == null) {
            Integer messageResId = it.getMessageResId();
            if (messageResId != null) {
                message = AbstractC4657l0.m2250a().getString(messageResId.intValue());
            } else {
                message = null;
            }
            if (message == null) {
                message = "";
            }
        }
        if (message.length() == 0) {
            return;
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
                XToastUtils.INSTANCE.toast(message);
                return;
            }
        }
        XToastUtils.INSTANCE.error(((ToastErrorCodeMessage) it).getErrorInfo().getCode() + " " + message);
    }
}
