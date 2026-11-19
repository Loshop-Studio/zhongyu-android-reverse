package com.xuexiang.xui.widget.dialog;

import android.content.DialogInterface;
import com.xuexiang.xui.widget.progress.loading.ARCLoadingView;
import p178m4.InterfaceC8964a;

/* loaded from: classes4.dex */
public class LoadingDialog extends BaseDialog {

    /* renamed from: b */
    public ARCLoadingView f7304b;

    /* renamed from: com.xuexiang.xui.widget.dialog.LoadingDialog$a */
    public class DialogInterfaceOnCancelListenerC6822a implements DialogInterface.OnCancelListener {
        public DialogInterfaceOnCancelListenerC6822a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            LoadingDialog.m6665b(LoadingDialog.this);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC8964a m6665b(LoadingDialog loadingDialog) {
        loadingDialog.getClass();
        return null;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ARCLoadingView aRCLoadingView = this.f7304b;
        if (aRCLoadingView != null) {
            aRCLoadingView.m6996h();
        }
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z9) {
        super.setCancelable(z9);
        if (z9) {
            setOnCancelListener(new DialogInterfaceOnCancelListenerC6822a());
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        ARCLoadingView aRCLoadingView = this.f7304b;
        if (aRCLoadingView != null) {
            aRCLoadingView.m6995g();
        }
    }
}
