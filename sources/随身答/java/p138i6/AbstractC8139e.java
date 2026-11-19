package p138i6;

import com.zykj.base.bean.toast.ToastMessage;

/* renamed from: i6.e */
/* loaded from: classes5.dex */
public abstract class AbstractC8139e {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027 A[PHI: r0
      0x0027: PHI (r0v3 java.lang.String) = (r0v2 java.lang.String), (r0v12 java.lang.String) binds: [B:3:0x000e, B:8:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m13045a(com.zykj.base.bean.toast.ToastMessage r2, java.lang.String r3) {
        /*
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "customToastMsg"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = r2.getMessage()
            if (r0 != 0) goto L27
            java.lang.Integer r0 = r2.getMessageResId()
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
            r3 = r0
        L28:
            int r0 = r3.length()
            if (r0 != 0) goto L2f
            return
        L2f:
            boolean r0 = r2 instanceof com.zykj.base.bean.toast.ToastInfoMessage
            if (r0 == 0) goto L39
            com.zykj.base.utils.XToastUtils r2 = com.zykj.base.utils.XToastUtils.INSTANCE
            r2.toast(r3)
            return
        L39:
            boolean r0 = r2 instanceof com.zykj.base.bean.toast.ToastWarnMessage
            if (r0 == 0) goto L43
            com.zykj.base.utils.XToastUtils r2 = com.zykj.base.utils.XToastUtils.INSTANCE
            r2.warning(r3)
            return
        L43:
            boolean r0 = r2 instanceof com.zykj.base.bean.toast.ToastErrorMessage
            if (r0 == 0) goto L4d
            com.zykj.base.utils.XToastUtils r2 = com.zykj.base.utils.XToastUtils.INSTANCE
            r2.error(r3)
            return
        L4d:
            boolean r0 = r2 instanceof com.zykj.base.bean.toast.ToastErrorCodeMessage
            if (r0 == 0) goto L75
            com.zykj.base.utils.XToastUtils r0 = com.zykj.base.utils.XToastUtils.INSTANCE
            com.zykj.base.bean.toast.ToastErrorCodeMessage r2 = (com.zykj.base.bean.toast.ToastErrorCodeMessage) r2
            com.zykj.lib.error.code.ErrorCodeInfo r2 = r2.getErrorInfo()
            int r2 = r2.getCode()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = r1.toString()
            r0.error(r2)
            return
        L75:
            boolean r2 = r2 instanceof com.zykj.base.bean.toast.ToastSuccessMessage
            if (r2 == 0) goto L7f
            com.zykj.base.utils.XToastUtils r2 = com.zykj.base.utils.XToastUtils.INSTANCE
            r2.success(r3)
            return
        L7f:
            com.zykj.base.utils.XToastUtils r2 = com.zykj.base.utils.XToastUtils.INSTANCE
            r2.toast(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p138i6.AbstractC8139e.m13045a(com.zykj.base.bean.toast.ToastMessage, java.lang.String):void");
    }

    /* renamed from: b */
    public static /* synthetic */ void m13046b(ToastMessage toastMessage, String str, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            str = "";
        }
        m13045a(toastMessage, str);
    }
}
