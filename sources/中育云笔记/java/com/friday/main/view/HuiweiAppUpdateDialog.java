package com.friday.main.view;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.friday.main.R$dimen;
import com.friday.main.R$layout;
import com.friday.main.R$style;
import com.friday.main.databinding.DialogVersionUpdateBinding;
import com.friday.main.view.HuiweiAppUpdateDialog;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p429z1.AbstractC11958b;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class HuiweiAppUpdateDialog extends Hilt_HuiweiAppUpdateDialog<DialogVersionUpdateBinding> {

    /* renamed from: k */
    public InterfaceC9529a f9415k;

    /* renamed from: t */
    public static final void m7153t(HuiweiAppUpdateDialog huiweiAppUpdateDialog, View view) {
        huiweiAppUpdateDialog.dismissAllowingStateLoss();
        InterfaceC9529a interfaceC9529a = huiweiAppUpdateDialog.f9415k;
        if (interfaceC9529a != null) {
            interfaceC9529a.invoke();
        }
    }

    /* renamed from: u */
    public static final void m7154u(HuiweiAppUpdateDialog huiweiAppUpdateDialog, View view) {
        huiweiAppUpdateDialog.dismissAllowingStateLoss();
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.dialog_version_update;
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        TextView tvUpdate = ((DialogVersionUpdateBinding) getMBinding()).f9155g;
        AbstractC9979u.m20293f(tvUpdate, "tvUpdate");
        AbstractC11958b.m26591l(tvUpdate, 500L, new View.OnClickListener() { // from class: v3.v1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HuiweiAppUpdateDialog.m7153t(this.f27380c, view);
            }
        });
        CardView cvCancel = ((DialogVersionUpdateBinding) getMBinding()).f9151c;
        AbstractC9979u.m20293f(cvCancel, "cvCancel");
        cvCancel.setVisibility(8);
        ((DialogVersionUpdateBinding) getMBinding()).f9153e.setOnClickListener(new View.OnClickListener() { // from class: v3.w1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HuiweiAppUpdateDialog.m7154u(this.f27383c, view);
            }
        });
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R$style.airPlayDialog);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout((int) getResources().getDimension(R$dimen.view_189), (int) getResources().getDimension(R$dimen.view_140));
            window.setGravity(17);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCancelable(false);
            dialog2.setCanceledOnTouchOutside(false);
        }
        super.onStart();
    }

    /* renamed from: v */
    public final void m7155v(InterfaceC9529a interfaceC9529a) {
        this.f9415k = interfaceC9529a;
    }
}
