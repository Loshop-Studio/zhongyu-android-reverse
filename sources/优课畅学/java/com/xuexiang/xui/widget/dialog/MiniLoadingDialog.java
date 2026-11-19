package com.xuexiang.xui.widget.dialog;

import android.content.DialogInterface;
import com.xuexiang.xui.widget.progress.loading.MiniLoadingView;
import p218q2.InterfaceC9780a;

/* loaded from: classes4.dex */
public class MiniLoadingDialog extends BaseDialog {

    /* renamed from: c */
    public MiniLoadingView f7434c;

    /* renamed from: com.xuexiang.xui.widget.dialog.MiniLoadingDialog$a */
    public class DialogInterfaceOnCancelListenerC6905a implements DialogInterface.OnCancelListener {
        public DialogInterfaceOnCancelListenerC6905a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            MiniLoadingDialog.m6705d(MiniLoadingDialog.this);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC9780a m6705d(MiniLoadingDialog miniLoadingDialog) {
        miniLoadingDialog.getClass();
        return null;
    }

    @Override // com.xuexiang.xui.widget.dialog.BaseDialog
    /* renamed from: b */
    public void mo6702b() {
        super.mo6702b();
        MiniLoadingView miniLoadingView = this.f7434c;
        if (miniLoadingView != null) {
            miniLoadingView.m7093e();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        MiniLoadingView miniLoadingView = this.f7434c;
        if (miniLoadingView != null) {
            miniLoadingView.m7094f();
        }
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z10) {
        super.setCancelable(z10);
        if (z10) {
            setOnCancelListener(new DialogInterfaceOnCancelListenerC6905a());
        }
    }
}
