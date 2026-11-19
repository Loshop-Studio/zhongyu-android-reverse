package com.luck.picture.lib.dialog;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.R$style;
import p008a7.AbstractC0072e;
import p304q6.InterfaceC10743c;

/* loaded from: classes5.dex */
public class PhotoItemSelectedDialog extends DialogFragment implements View.OnClickListener {

    /* renamed from: d */
    public boolean f12390d = true;

    /* renamed from: e */
    public InterfaceC10743c f12391e;

    /* renamed from: f */
    public InterfaceC7484a f12392f;

    /* renamed from: com.luck.picture.lib.dialog.PhotoItemSelectedDialog$a */
    public interface InterfaceC7484a {
        /* renamed from: a */
        void mo9316a(boolean z10, DialogInterface dialogInterface);
    }

    /* renamed from: p */
    public static PhotoItemSelectedDialog m9332p() {
        return new PhotoItemSelectedDialog();
    }

    /* renamed from: o */
    public final void m9333o() {
        Window window;
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(AbstractC0072e.m165e(getContext()), -2);
        window.setGravity(80);
        window.setWindowAnimations(R$style.PictureThemeDialogFragmentAnim);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        InterfaceC10743c interfaceC10743c = this.f12391e;
        if (interfaceC10743c != null) {
            if (id2 == R$id.ps_tv_photo) {
                interfaceC10743c.mo9315a(view, 0);
                this.f12390d = false;
            } else if (id2 == R$id.ps_tv_video) {
                interfaceC10743c.mo9315a(view, 1);
                this.f12390d = false;
            }
        }
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (getDialog() != null) {
            getDialog().requestWindowFeature(1);
            if (getDialog().getWindow() != null) {
                getDialog().getWindow().setBackgroundDrawableResource(R.color.transparent);
            }
        }
        return layoutInflater.inflate(R$layout.ps_dialog_camera_selected, viewGroup);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        InterfaceC7484a interfaceC7484a = this.f12392f;
        if (interfaceC7484a != null) {
            interfaceC7484a.mo9316a(this.f12390d, dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        m9333o();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R$id.ps_tv_photo);
        TextView textView2 = (TextView) view.findViewById(R$id.ps_tv_video);
        TextView textView3 = (TextView) view.findViewById(R$id.ps_tv_cancel);
        textView2.setOnClickListener(this);
        textView.setOnClickListener(this);
        textView3.setOnClickListener(this);
    }

    /* renamed from: q */
    public void m9334q(InterfaceC7484a interfaceC7484a) {
        this.f12392f = interfaceC7484a;
    }

    /* renamed from: r */
    public void m9335r(InterfaceC10743c interfaceC10743c) {
        this.f12391e = interfaceC10743c;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        fragmentTransactionBeginTransaction.add(this, str);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }
}
