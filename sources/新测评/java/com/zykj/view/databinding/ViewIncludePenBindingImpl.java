package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.R$id;
import com.zykj.view.widget.radio.CustomColorRadioButton;
import com.zykj.view.widget.radio.NormalColorRadioButton;
import p027b8.AbstractC5046c;

/* loaded from: classes5.dex */
public class ViewIncludePenBindingImpl extends ViewIncludePenBinding {

    /* renamed from: t */
    public static final ViewDataBinding.IncludedLayouts f11519t = null;

    /* renamed from: u */
    public static final SparseIntArray f11520u;

    /* renamed from: o */
    public final LinearLayoutCompat f11521o;

    /* renamed from: p */
    public final NormalColorRadioButton f11522p;

    /* renamed from: q */
    public final NormalColorRadioButton f11523q;

    /* renamed from: r */
    public final NormalColorRadioButton f11524r;

    /* renamed from: s */
    public long f11525s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11520u = sparseIntArray;
        sparseIntArray.put(R$id.rg_pen_type, 4);
        sparseIntArray.put(R$id.rb_pen_custom, 5);
        sparseIntArray.put(R$id.rb_pen_line, 6);
        sparseIntArray.put(R$id.rb_pen_dotted_line, 7);
        sparseIntArray.put(R$id.rb_pen_highlighter, 8);
        sparseIntArray.put(R$id.rb_pen_cursor, 9);
        sparseIntArray.put(R$id.view_line, 10);
        sparseIntArray.put(R$id.rg_pen_size, 11);
        sparseIntArray.put(R$id.rb_pen_size_little, 12);
        sparseIntArray.put(R$id.rb_pen_size_medium, 13);
        sparseIntArray.put(R$id.rb_pen_size_big, 14);
        sparseIntArray.put(R$id.view_line_2, 15);
        sparseIntArray.put(R$id.rg_pen_color, 16);
        sparseIntArray.put(R$id.rb_custom_color, 17);
    }

    public ViewIncludePenBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 18, f11519t, f11520u));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        synchronized (this) {
            j10 = this.f11525s;
            this.f11525s = 0L;
        }
        if ((j10 & 1) != 0) {
            AbstractC5046c.m2526b(this.f11522p, "#000000");
            AbstractC5046c.m2526b(this.f11523q, "#EEEEEE");
            AbstractC5046c.m2526b(this.f11524r, "#FF4931");
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f11525s != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f11525s = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        return true;
    }

    public ViewIncludePenBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CustomColorRadioButton) objArr[17], (RadioButton) objArr[9], (RadioButton) objArr[5], (RadioButton) objArr[7], (RadioButton) objArr[8], (RadioButton) objArr[6], (RadioButton) objArr[14], (RadioButton) objArr[12], (RadioButton) objArr[13], (RadioGroup) objArr[16], (RadioGroup) objArr[11], (RadioGroup) objArr[4], (View) objArr[10], (View) objArr[15]);
        this.f11525s = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.f11521o = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        NormalColorRadioButton normalColorRadioButton = (NormalColorRadioButton) objArr[1];
        this.f11522p = normalColorRadioButton;
        normalColorRadioButton.setTag("#000000");
        NormalColorRadioButton normalColorRadioButton2 = (NormalColorRadioButton) objArr[2];
        this.f11523q = normalColorRadioButton2;
        normalColorRadioButton2.setTag("#EEEEEE");
        NormalColorRadioButton normalColorRadioButton3 = (NormalColorRadioButton) objArr[3];
        this.f11524r = normalColorRadioButton3;
        normalColorRadioButton3.setTag("#FF4931");
        setRootTag(view);
        invalidateAll();
    }
}
