package com.xuexiang.xui.widget.dialog;

import android.content.DialogInterface;
import com.xuexiang.xui.widget.progress.loading.ARCLoadingView;
import p068h1.InterfaceC3765a;

/* loaded from: classes2.dex */
public class LoadingDialog extends BaseDialog {

    /* renamed from: b */
    public ARCLoadingView f3389b;

    /* renamed from: com.xuexiang.xui.widget.dialog.LoadingDialog$a */
    public class DialogInterfaceOnCancelListenerC3552a implements DialogInterface.OnCancelListener {
        public DialogInterfaceOnCancelListenerC3552a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            LoadingDialog.m4255a(LoadingDialog.this);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC3765a m4255a(LoadingDialog loadingDialog) {
        loadingDialog.getClass();
        return null;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ARCLoadingView aRCLoadingView = this.f3389b;
        if (aRCLoadingView != null) {
            aRCLoadingView.m4529h();
        }
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z3) {
        super.setCancelable(z3);
        if (z3) {
            setOnCancelListener(new DialogInterfaceOnCancelListenerC3552a());
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        ARCLoadingView aRCLoadingView = this.f3389b;
        if (aRCLoadingView != null) {
            aRCLoadingView.m4528g();
        }
    }
}
