package com.xuexiang.xui.widget.dialog;

import p071h2.DialogInterfaceOnCancelListenerC5620a;

/* loaded from: classes3.dex */
public class LoadingDialog extends BaseDialog {

    /* renamed from: a */
    public static final /* synthetic */ int f4250a = 0;

    @Override // android.app.Dialog
    public final void setCancelable(boolean z8) {
        super.setCancelable(z8);
        if (z8) {
            setOnCancelListener(new DialogInterfaceOnCancelListenerC5620a(this, 0));
        }
    }
}
