package com.xuexiang.xui.widget.dialog;

import android.content.DialogInterface;
import com.xuexiang.xui.widget.progress.loading.ARCLoadingView;
import p141r2.InterfaceC7638a;

/* loaded from: classes3.dex */
public class LoadingDialog extends BaseDialog {

    /* renamed from: c */
    public ARCLoadingView f4775c;

    /* renamed from: com.xuexiang.xui.widget.dialog.LoadingDialog$a */
    public class DialogInterfaceOnCancelListenerC5882a implements DialogInterface.OnCancelListener {
        public DialogInterfaceOnCancelListenerC5882a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            LoadingDialog.m4581d(LoadingDialog.this);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC7638a m4581d(LoadingDialog loadingDialog) {
        loadingDialog.getClass();
        return null;
    }

    @Override // com.xuexiang.xui.widget.dialog.BaseDialog
    /* renamed from: b */
    public void mo4579b() {
        super.mo4579b();
        ARCLoadingView aRCLoadingView = this.f4775c;
        if (aRCLoadingView != null) {
            aRCLoadingView.m4906g();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ARCLoadingView aRCLoadingView = this.f4775c;
        if (aRCLoadingView != null) {
            aRCLoadingView.m4907h();
        }
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z6) {
        super.setCancelable(z6);
        if (z6) {
            setOnCancelListener(new DialogInterfaceOnCancelListenerC5882a());
        }
    }
}
