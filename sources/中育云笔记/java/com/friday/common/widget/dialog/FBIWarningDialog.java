package com.friday.common.widget.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.friday.common.R$dimen;
import com.friday.common.R$layout;
import com.friday.common.R$style;
import com.friday.common.databinding.DialogFbiWarningBinding;
import com.friday.common.helper.C5962b;
import com.friday.common.widget.dialog.FBIWarningDialog;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class FBIWarningDialog extends DialogFragment {

    /* renamed from: d */
    public DialogFbiWarningBinding f6191d;

    /* renamed from: p */
    public static final void m5386p(FBIWarningDialog fBIWarningDialog, View view) {
        C5962b.f6082a.m5299a().m5274L(false);
        fBIWarningDialog.dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        DialogFbiWarningBinding dialogFbiWarningBinding = this.f6191d;
        if (dialogFbiWarningBinding == null) {
            AbstractC9979u.m20312y("dataBinding");
            dialogFbiWarningBinding = null;
        }
        dialogFbiWarningBinding.f5947c.setOnClickListener(new View.OnClickListener() { // from class: l2.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FBIWarningDialog.m5386p(this.f24195c, view);
            }
        });
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R$style.airPlayDialog);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC9979u.m20294g(inflater, "inflater");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(inflater, R$layout.dialog_fbi_warning, viewGroup, false);
        AbstractC9979u.m20293f(viewDataBindingInflate, "inflate(...)");
        DialogFbiWarningBinding dialogFbiWarningBinding = (DialogFbiWarningBinding) viewDataBindingInflate;
        this.f6191d = dialogFbiWarningBinding;
        if (dialogFbiWarningBinding == null) {
            AbstractC9979u.m20312y("dataBinding");
            dialogFbiWarningBinding = null;
        }
        View root = dialogFbiWarningBinding.getRoot();
        AbstractC9979u.m20293f(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        WindowManager windowManager;
        Display defaultDisplay;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        FragmentActivity activity = getActivity();
        if (activity != null && (windowManager = activity.getWindowManager()) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout((int) getResources().getDimension(R$dimen.view_189), (int) getResources().getDimension(R$dimen.view_172));
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCancelable(false);
            dialog2.setCanceledOnTouchOutside(false);
        }
        super.onStart();
    }
}
