package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.WeakHashMap;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p070b.p074b.p075a.p076a.C0562a;
import p070b.p074b.p075a.p076a.p077a0.p078a.C0563a;
import p070b.p074b.p075a.p076a.p093o.C0636a;
import p070b.p074b.p075a.p076a.p101w.C0675g;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(C0563a.m2100a(context, attributeSet, C1088R.attr.toolbarStyle, C1088R.style.Widget_MaterialComponents_Toolbar), attributeSet, C1088R.attr.toolbarStyle);
        Context context2 = getContext();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C0675g c0675g = new C0675g();
            c0675g.m2296p(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            c0675g.f3998b.f4022b = new C0636a(context2);
            c0675g.m2303w();
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            c0675g.m2295o(getElevation());
            setBackground(c0675g);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C0675g) {
            C0562a.m2098s(this, (C0675g) background);
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        C0562a.m2097r(this, f2);
    }
}
