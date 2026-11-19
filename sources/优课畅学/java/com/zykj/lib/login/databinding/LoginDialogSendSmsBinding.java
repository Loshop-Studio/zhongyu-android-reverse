package com.zykj.lib.login.databinding;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.ViewDataBinding;
import com.zykj.lib.login.p062ui.teacher.sms.SendSmsViewModel;

/* loaded from: classes4.dex */
public abstract class LoginDialogSendSmsBinding extends ViewDataBinding {

    /* renamed from: a */
    public final Barrier f9857a;

    /* renamed from: b */
    public final EditText f9858b;

    /* renamed from: c */
    public final TextView f9859c;

    /* renamed from: d */
    public final ImageView f9860d;

    /* renamed from: e */
    public final TextView f9861e;

    /* renamed from: f */
    public final TextView f9862f;

    /* renamed from: g */
    public final TextView f9863g;

    /* renamed from: h */
    public final TextView f9864h;

    /* renamed from: i */
    public final TextView f9865i;

    /* renamed from: j */
    public final Barrier f9866j;

    /* renamed from: k */
    public SendSmsViewModel f9867k;

    public LoginDialogSendSmsBinding(Object obj, View view, int i10, Barrier barrier, EditText editText, TextView textView, ImageView imageView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, Barrier barrier2) {
        super(obj, view, i10);
        this.f9857a = barrier;
        this.f9858b = editText;
        this.f9859c = textView;
        this.f9860d = imageView;
        this.f9861e = textView2;
        this.f9862f = textView3;
        this.f9863g = textView4;
        this.f9864h = textView5;
        this.f9865i = textView6;
        this.f9866j = barrier2;
    }

    /* renamed from: a */
    public abstract void mo9245a(SendSmsViewModel sendSmsViewModel);
}
