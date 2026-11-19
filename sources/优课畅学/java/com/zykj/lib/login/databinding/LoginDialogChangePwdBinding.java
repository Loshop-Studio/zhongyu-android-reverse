package com.zykj.lib.login.databinding;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.zykj.base.view.LoadingDialogView;
import com.zykj.lib.login.p062ui.teacher.pwd.ChangePwdViewModel;

/* loaded from: classes4.dex */
public abstract class LoginDialogChangePwdBinding extends ViewDataBinding {

    /* renamed from: a */
    public final EditText f9837a;

    /* renamed from: b */
    public final EditText f9838b;

    /* renamed from: c */
    public final LinearLayout f9839c;

    /* renamed from: d */
    public final LinearLayout f9840d;

    /* renamed from: e */
    public final LoadingDialogView f9841e;

    /* renamed from: f */
    public final TextView f9842f;

    /* renamed from: g */
    public final TextView f9843g;

    /* renamed from: h */
    public final TextView f9844h;

    /* renamed from: i */
    public ChangePwdViewModel f9845i;

    /* renamed from: j */
    public String f9846j;

    public LoginDialogChangePwdBinding(Object obj, View view, int i10, EditText editText, EditText editText2, LinearLayout linearLayout, LinearLayout linearLayout2, LoadingDialogView loadingDialogView, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i10);
        this.f9837a = editText;
        this.f9838b = editText2;
        this.f9839c = linearLayout;
        this.f9840d = linearLayout2;
        this.f9841e = loadingDialogView;
        this.f9842f = textView;
        this.f9843g = textView2;
        this.f9844h = textView3;
    }

    /* renamed from: a */
    public abstract void mo9240a(ChangePwdViewModel changePwdViewModel);
}
