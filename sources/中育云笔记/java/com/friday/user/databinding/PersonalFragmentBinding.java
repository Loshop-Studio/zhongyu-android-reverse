package com.friday.user.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.friday.user.viewmodel.UserViewModel;

/* loaded from: classes5.dex */
public abstract class PersonalFragmentBinding extends ViewDataBinding {

    /* renamed from: c */
    public final ConstraintLayout f10605c;

    /* renamed from: d */
    public final ConstraintLayout f10606d;

    /* renamed from: e */
    public final ImageView f10607e;

    /* renamed from: f */
    public final TextView f10608f;

    /* renamed from: g */
    public UserViewModel f10609g;

    public PersonalFragmentBinding(Object obj, View view, int i10, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, TextView textView) {
        super(obj, view, i10);
        this.f10605c = constraintLayout;
        this.f10606d = constraintLayout2;
        this.f10607e = imageView;
        this.f10608f = textView;
    }
}
