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
import com.friday.paint.dialog.HomeworkSubmitConfirmDialog;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class HomeworkSubmitConfirmDialog extends DialogFragment {

    /* renamed from: d */
    public InterfaceC9529a f9872d;

    /* renamed from: q */
    public static final void m7311q(HomeworkSubmitConfirmDialog homeworkSubmitConfirmDialog, View view) {
        InterfaceC9529a interfaceC9529a = homeworkSubmitConfirmDialog.f9872d;
        if (interfaceC9529a != null) {
            interfaceC9529a.invoke();
        }
    }

    /* renamed from: r */
    public static final void m7312r(HomeworkSubmitConfirmDialog homeworkSubmitConfirmDialog, View view) {
        homeworkSubmitConfirmDialog.dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        View viewFindViewById;
        View viewFindViewById2;
        super.onActivityCreated(bundle);
        View view = getView();
        if (view != null && (viewFindViewById2 = view.findViewById(R$id.cv_ok)) != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: a4.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    HomeworkSubmitConfirmDialog.m7311q(this.f41c, view2);
                }
            });
        }
        View view2 = getView();
        if (view2 == null || (viewFindViewById = view2.findViewById(R$id.cv_cancel)) == null) {
            return;
        }
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: a4.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                HomeworkSubmitConfirmDialog.m7312r(this.f42c, view3);
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
        return inflater.inflate(R$layout.dialog_submit_homework, viewGroup, false);
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
            if (dialog2 == null || (window = dialog2.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return;
            }
            attributes.dimAmount = 0.0f;
        }
    }

    /* renamed from: s */
    public final void m7313s(InterfaceC9529a doSubmit) {
        AbstractC9979u.m20294g(doSubmit, "doSubmit");
        this.f9872d = doSubmit;
    }
}
