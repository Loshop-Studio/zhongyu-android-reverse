package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import p000a.p005b.p006c.C0030p;
import p000a.p005b.p014h.C0075d;
import p000a.p005b.p014h.C0079f;
import p000a.p005b.p014h.C0113w;
import p070b.p074b.p075a.p076a.p087j.C0599a;
import p070b.p074b.p075a.p076a.p097s.C0661a;
import p070b.p074b.p075a.p076a.p104z.C0704p;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C0030p {
    @Override // p000a.p005b.p006c.C0030p
    /* renamed from: a */
    public C0075d mo101a(Context context, AttributeSet attributeSet) {
        return new C0704p(context, attributeSet);
    }

    @Override // p000a.p005b.p006c.C0030p
    /* renamed from: b */
    public C0079f mo102b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // p000a.p005b.p006c.C0030p
    /* renamed from: c */
    public AppCompatCheckBox mo103c(Context context, AttributeSet attributeSet) {
        return new C0599a(context, attributeSet);
    }

    @Override // p000a.p005b.p006c.C0030p
    /* renamed from: d */
    public AppCompatRadioButton mo104d(Context context, AttributeSet attributeSet) {
        return new C0661a(context, attributeSet);
    }

    @Override // p000a.p005b.p006c.C0030p
    /* renamed from: e */
    public C0113w mo105e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
