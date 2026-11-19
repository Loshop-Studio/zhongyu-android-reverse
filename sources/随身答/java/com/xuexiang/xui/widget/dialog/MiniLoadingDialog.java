package com.xuexiang.xui.widget.dialog;

import android.content.DialogInterface;
import com.xuexiang.xui.widget.progress.loading.MiniLoadingView;
import p178m4.InterfaceC8964a;

/* loaded from: classes4.dex */
public class MiniLoadingDialog extends BaseDialog {

    /* renamed from: b */
    public MiniLoadingView f7306b;

    /* renamed from: com.xuexiang.xui.widget.dialog.MiniLoadingDialog$a */
    public class DialogInterfaceOnCancelListenerC6823a implements DialogInterface.OnCancelListener {
        public DialogInterfaceOnCancelListenerC6823a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            MiniLoadingDialog.m6666b(MiniLoadingDialog.this);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC8964a m6666b(MiniLoadingDialog miniLoadingDialog) {
        miniLoadingDialog.getClass();
        return null;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        MiniLoadingView miniLoadingView = this.f7306b;
        if (miniLoadingView != null) {
            miniLoadingView.m7002f();
        }
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z9) {
        super.setCancelable(z9);
        if (z9) {
            setOnCancelListener(new DialogInterfaceOnCancelListenerC6823a());
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        MiniLoadingView miniLoadingView = this.f7306b;
        if (miniLoadingView != null) {
            miniLoadingView.m7001e();
        }
    }
}
