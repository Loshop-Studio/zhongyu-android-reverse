package com.xuexiang.xui.widget.dialog;

import android.content.DialogInterface;
import com.xuexiang.xui.widget.progress.loading.MiniLoadingView;
import p068h1.InterfaceC3765a;

/* loaded from: classes2.dex */
public class MiniLoadingDialog extends BaseDialog {

    /* renamed from: b */
    public MiniLoadingView f3391b;

    /* renamed from: com.xuexiang.xui.widget.dialog.MiniLoadingDialog$a */
    public class DialogInterfaceOnCancelListenerC3553a implements DialogInterface.OnCancelListener {
        public DialogInterfaceOnCancelListenerC3553a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            MiniLoadingDialog.m4256a(MiniLoadingDialog.this);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC3765a m4256a(MiniLoadingDialog miniLoadingDialog) {
        miniLoadingDialog.getClass();
        return null;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        MiniLoadingView miniLoadingView = this.f3391b;
        if (miniLoadingView != null) {
            miniLoadingView.m4535f();
        }
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z3) {
        super.setCancelable(z3);
        if (z3) {
            setOnCancelListener(new DialogInterfaceOnCancelListenerC3553a());
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        MiniLoadingView miniLoadingView = this.f3391b;
        if (miniLoadingView != null) {
            miniLoadingView.m4534e();
        }
    }
}
