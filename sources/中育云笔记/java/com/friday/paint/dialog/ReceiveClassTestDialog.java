package com.friday.paint.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.friday.paint.R$dimen;
import com.friday.paint.R$id;
import com.friday.paint.R$layout;
import com.friday.paint.R$style;
import com.friday.paint.dialog.ReceiveClassTestDialog;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ReceiveClassTestDialog extends DialogFragment {

    /* renamed from: d */
    public InterfaceC9529a f9883d;

    /* renamed from: p */
    public static final void m7331p(ReceiveClassTestDialog receiveClassTestDialog, View view) {
        receiveClassTestDialog.dismissAllowingStateLoss();
        InterfaceC9529a interfaceC9529a = receiveClassTestDialog.f9883d;
        if (interfaceC9529a != null) {
            interfaceC9529a.invoke();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        View viewFindViewById;
        super.onActivityCreated(bundle);
        View view = getView();
        if (view == null || (viewFindViewById = view.findViewById(R$id.cv_ok)) == null) {
            return;
        }
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: a4.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ReceiveClassTestDialog.m7331p(this.f51c, view2);
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
        return inflater.inflate(R$layout.dialog_receive_class_test, viewGroup, false);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        WindowManager.LayoutParams attributes;
        Window window2;
        super.onStart();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
            Dialog dialog = getDialog();
            if (dialog != null && (window2 = dialog.getWindow()) != null) {
                window2.setLayout((int) activity.getResources().getDimension(R$dimen.view_189), (int) activity.getResources().getDimension(R$dimen.view_103));
            }
            Dialog dialog2 = getDialog();
            if (dialog2 != null && (window = dialog2.getWindow()) != null && (attributes = window.getAttributes()) != null) {
                attributes.dimAmount = 0.0f;
            }
            Dialog dialog3 = getDialog();
            if (dialog3 != null) {
                dialog3.setCancelable(false);
                dialog3.setCanceledOnTouchOutside(false);
            }
        }
    }

    /* renamed from: q */
    public final void m7332q(InterfaceC9529a doHomework) {
        AbstractC9979u.m20294g(doHomework, "doHomework");
        this.f9883d = doHomework;
    }
}
