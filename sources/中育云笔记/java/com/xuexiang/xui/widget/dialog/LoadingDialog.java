package com.xuexiang.xui.widget.dialog;

import android.content.DialogInterface;
import com.xuexiang.xui.widget.progress.loading.ARCLoadingView;
import p133e9.InterfaceC9110a;

/* loaded from: classes5.dex */
public class LoadingDialog extends BaseDialog {

    /* renamed from: d */
    public ARCLoadingView f15820d;

    /* renamed from: com.xuexiang.xui.widget.dialog.LoadingDialog$a */
    public class DialogInterfaceOnCancelListenerC8095a implements DialogInterface.OnCancelListener {
        public DialogInterfaceOnCancelListenerC8095a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            LoadingDialog.m12534b(LoadingDialog.this);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC9110a m12534b(LoadingDialog loadingDialog) {
        loadingDialog.getClass();
        return null;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ARCLoadingView aRCLoadingView = this.f15820d;
        if (aRCLoadingView != null) {
            aRCLoadingView.m13101i();
        }
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z10) {
        super.setCancelable(z10);
        if (z10) {
            setOnCancelListener(new DialogInterfaceOnCancelListenerC8095a());
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        ARCLoadingView aRCLoadingView = this.f15820d;
        if (aRCLoadingView != null) {
            aRCLoadingView.m13100h();
        }
    }
}
