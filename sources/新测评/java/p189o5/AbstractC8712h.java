package p189o5;

import com.blankj.utilcode.util.Utils;
import com.zykj.base.bean.toast.ToastErrorCodeMessage;
import com.zykj.base.bean.toast.ToastInfoMessage;
import com.zykj.base.bean.toast.ToastMessage;
import com.zykj.base.utils.XToastUtils;
import com.zykj.evaluation.utils.ExceptionHandle;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: o5.h */
/* loaded from: classes4.dex */
public abstract class AbstractC8712h {
    /* renamed from: a */
    public static final void m14348a(Throwable th, String customToastMsg) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        Intrinsics.checkNotNullParameter(customToastMsg, "customToastMsg");
        if (th instanceof CancellationException) {
            return;
        }
        ToastErrorCodeMessage toastErrorCodeMessage = new ToastErrorCodeMessage(ExceptionHandle.INSTANCE.handleException(th).getErrorCodeInfo());
        String message = toastErrorCodeMessage.getMessage();
        if (message != null) {
            customToastMsg = message;
        }
        Integer messageResId = toastErrorCodeMessage.getMessageResId();
        if (messageResId != null) {
            customToastMsg = Utils.getApp().getString(messageResId.intValue());
            Intrinsics.checkNotNullExpressionValue(customToastMsg, "getString(...)");
        }
        XToastUtils.INSTANCE.error(toastErrorCodeMessage.getErrorInfo().getCode() + " " + ((Object) customToastMsg));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027 A[PHI: r0
      0x0027: PHI (r0v3 java.lang.String) = (r0v2 java.lang.String), (r0v13 java.lang.String) binds: [B:3:0x000e, B:8:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m14349b(com.zykj.base.bean.toast.ToastMessage r3, java.lang.String r4) {
        /*
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "customToastMsg"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = r3.getMessage()
            if (r0 != 0) goto L27
            java.lang.Integer r0 = r3.getMessageResId()
            if (r0 == 0) goto L23
            int r0 = r0.intValue()
            android.app.Application r1 = com.blankj.utilcode.util.Utils.getApp()
            java.lang.String r0 = r1.getString(r0)
            goto L24
        L23:
            r0 = 0
        L24:
            if (r0 != 0) goto L27
            goto L28
        L27:
            r4 = r0
        L28:
            int r0 = r4.length()
            if (r0 != 0) goto L2f
            return
        L2f:
            boolean r0 = r3 instanceof com.zykj.base.bean.toast.ToastInfoMessage
            if (r0 == 0) goto L39
            com.zykj.base.utils.XToastUtils r3 = com.zykj.base.utils.XToastUtils.INSTANCE
            r3.toast(r4)
            return
        L39:
            boolean r0 = r3 instanceof com.zykj.base.bean.toast.ToastWarnMessage
            if (r0 == 0) goto L43
            com.zykj.base.utils.XToastUtils r3 = com.zykj.base.utils.XToastUtils.INSTANCE
            r3.info(r4)
            return
        L43:
            boolean r0 = r3 instanceof com.zykj.base.bean.toast.ToastErrorMessage
            java.lang.String r1 = " "
            if (r0 == 0) goto L67
            com.zykj.base.utils.XToastUtils r0 = com.zykj.base.utils.XToastUtils.INSTANCE
            com.zykj.base.bean.toast.ToastErrorMessage r3 = (com.zykj.base.bean.toast.ToastErrorMessage) r3
            java.lang.Integer r3 = r3.getCode()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r1)
            r2.append(r4)
            java.lang.String r3 = r2.toString()
            r0.error(r3)
            return
        L67:
            boolean r0 = r3 instanceof com.zykj.base.bean.toast.ToastErrorCodeMessage
            if (r0 == 0) goto L8d
            com.zykj.base.utils.XToastUtils r0 = com.zykj.base.utils.XToastUtils.INSTANCE
            com.zykj.base.bean.toast.ToastErrorCodeMessage r3 = (com.zykj.base.bean.toast.ToastErrorCodeMessage) r3
            com.zykj.lib.error.code.ErrorCodeInfo r3 = r3.getErrorInfo()
            int r3 = r3.getCode()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r2.append(r1)
            r2.append(r4)
            java.lang.String r3 = r2.toString()
            r0.error(r3)
            return
        L8d:
            boolean r3 = r3 instanceof com.zykj.base.bean.toast.ToastSuccessMessage
            if (r3 == 0) goto L97
            com.zykj.base.utils.XToastUtils r3 = com.zykj.base.utils.XToastUtils.INSTANCE
            r3.success(r4)
            return
        L97:
            com.zykj.base.utils.XToastUtils r3 = com.zykj.base.utils.XToastUtils.INSTANCE
            r3.toast(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p189o5.AbstractC8712h.m14349b(com.zykj.base.bean.toast.ToastMessage, java.lang.String):void");
    }

    /* renamed from: c */
    public static final void m14350c(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        m14351d(new ToastInfoMessage(it, null, 2, null), null, 2, null);
    }

    /* renamed from: d */
    public static /* synthetic */ void m14351d(ToastMessage toastMessage, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "";
        }
        m14349b(toastMessage, str);
    }
}
