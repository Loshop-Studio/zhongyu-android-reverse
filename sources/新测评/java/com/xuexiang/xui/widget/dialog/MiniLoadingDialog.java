package com.xuexiang.xui.widget.dialog;

import android.content.DialogInterface;
import com.xuexiang.xui.widget.progress.loading.MiniLoadingView;
import p274w3.InterfaceC9735a;

/* loaded from: classes4.dex */
public class MiniLoadingDialog extends BaseDialog {

    /* renamed from: c */
    public MiniLoadingView f6053c;

    /* renamed from: com.xuexiang.xui.widget.dialog.MiniLoadingDialog$a */
    public class DialogInterfaceOnCancelListenerC6505a implements DialogInterface.OnCancelListener {
        public DialogInterfaceOnCancelListenerC6505a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            MiniLoadingDialog.m5572d(MiniLoadingDialog.this);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC9735a m5572d(MiniLoadingDialog miniLoadingDialog) {
        miniLoadingDialog.getClass();
        return null;
    }

    @Override // com.xuexiang.xui.widget.dialog.BaseDialog
    /* renamed from: b */
    public void mo5569b() {
        super.mo5569b();
        MiniLoadingView miniLoadingView = this.f6053c;
        if (miniLoadingView != null) {
            miniLoadingView.m5903e();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        MiniLoadingView miniLoadingView = this.f6053c;
        if (miniLoadingView != null) {
            miniLoadingView.m5904f();
        }
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z9) {
        super.setCancelable(z9);
        if (z9) {
            setOnCancelListener(new DialogInterfaceOnCancelListenerC6505a());
        }
    }
}
