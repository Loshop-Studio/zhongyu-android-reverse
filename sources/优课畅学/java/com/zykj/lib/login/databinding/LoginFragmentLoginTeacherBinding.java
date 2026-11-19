package com.zykj.lib.login.databinding;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.zykj.lib.login.p062ui.teacher.TeacherLoginViewModel;
import com.zykj.policy.p064ui.PolicyCheckView;

/* loaded from: classes4.dex */
public abstract class LoginFragmentLoginTeacherBinding extends ViewDataBinding {

    /* renamed from: a */
    public final TextView f9885a;

    /* renamed from: b */
    public final EditText f9886b;

    /* renamed from: c */
    public final EditText f9887c;

    /* renamed from: d */
    public final EditText f9888d;

    /* renamed from: e */
    public final LinearLayout f9889e;

    /* renamed from: f */
    public final ImageView f9890f;

    /* renamed from: g */
    public final PolicyCheckView f9891g;

    /* renamed from: h */
    public TeacherLoginViewModel f9892h;

    public LoginFragmentLoginTeacherBinding(Object obj, View view, int i10, TextView textView, EditText editText, EditText editText2, EditText editText3, LinearLayout linearLayout, ImageView imageView, PolicyCheckView policyCheckView) {
        super(obj, view, i10);
        this.f9885a = textView;
        this.f9886b = editText;
        this.f9887c = editText2;
        this.f9888d = editText3;
        this.f9889e = linearLayout;
        this.f9890f = imageView;
        this.f9891g = policyCheckView;
    }

    /* renamed from: a */
    public abstract void mo9250a(TeacherLoginViewModel teacherLoginViewModel);
}
