package com.xuexiang.xui.widget.dialog;

import android.content.DialogInterface;
import com.xuexiang.xui.widget.progress.loading.ARCLoadingView;
import p218q2.InterfaceC9780a;

/* loaded from: classes4.dex */
public class LoadingDialog extends BaseDialog {

    /* renamed from: c */
    public ARCLoadingView f7432c;

    /* renamed from: com.xuexiang.xui.widget.dialog.LoadingDialog$a */
    public class DialogInterfaceOnCancelListenerC6904a implements DialogInterface.OnCancelListener {
        public DialogInterfaceOnCancelListenerC6904a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            LoadingDialog.m6704d(LoadingDialog.this);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC9780a m6704d(LoadingDialog loadingDialog) {
        loadingDialog.getClass();
        return null;
    }

    @Override // com.xuexiang.xui.widget.dialog.BaseDialog
    /* renamed from: b */
    public void mo6702b() {
        super.mo6702b();
        ARCLoadingView aRCLoadingView = this.f7432c;
        if (aRCLoadingView != null) {
            aRCLoadingView.m7087g();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ARCLoadingView aRCLoadingView = this.f7432c;
        if (aRCLoadingView != null) {
            aRCLoadingView.m7088h();
        }
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z10) {
        super.setCancelable(z10);
        if (z10) {
            setOnCancelListener(new DialogInterfaceOnCancelListenerC6904a());
        }
    }
}
