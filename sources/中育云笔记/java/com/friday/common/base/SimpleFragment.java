package com.friday.common.base;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import com.friday.common.widget.dialog.BaseDialog;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public abstract class SimpleFragment extends Fragment implements IView, InterfaceViewOnClickListenerC5928b {

    /* renamed from: e */
    public static final int f5626e = 8;

    /* renamed from: d */
    public BaseDialog f5627d;

    /* renamed from: o */
    private final void m4806o() {
        try {
            BaseDialog baseDialog = this.f5627d;
            if (baseDialog != null) {
                baseDialog.dismissAllowingStateLoss();
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.friday.common.base.InterfaceViewOnClickListenerC5928b, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        m4806o();
        super.onDestroy();
    }
}
