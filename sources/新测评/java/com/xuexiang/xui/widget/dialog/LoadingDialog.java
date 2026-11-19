package com.xuexiang.xui.widget.dialog;

import android.content.DialogInterface;
import com.xuexiang.xui.widget.progress.loading.ARCLoadingView;
import p274w3.InterfaceC9735a;

/* loaded from: classes4.dex */
public class LoadingDialog extends BaseDialog {

    /* renamed from: c */
    public ARCLoadingView f6051c;

    /* renamed from: com.xuexiang.xui.widget.dialog.LoadingDialog$a */
    public class DialogInterfaceOnCancelListenerC6504a implements DialogInterface.OnCancelListener {
        public DialogInterfaceOnCancelListenerC6504a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            LoadingDialog.m5571d(LoadingDialog.this);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC9735a m5571d(LoadingDialog loadingDialog) {
        loadingDialog.getClass();
        return null;
    }

    @Override // com.xuexiang.xui.widget.dialog.BaseDialog
    /* renamed from: b */
    public void mo5569b() {
        super.mo5569b();
        ARCLoadingView aRCLoadingView = this.f6051c;
        if (aRCLoadingView != null) {
            aRCLoadingView.m5897g();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ARCLoadingView aRCLoadingView = this.f6051c;
        if (aRCLoadingView != null) {
            aRCLoadingView.m5898h();
        }
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z9) {
        super.setCancelable(z9);
        if (z9) {
            setOnCancelListener(new DialogInterfaceOnCancelListenerC6504a());
        }
    }
}
