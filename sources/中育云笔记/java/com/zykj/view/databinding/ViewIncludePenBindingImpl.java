package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.R$id;

/* loaded from: classes6.dex */
public class ViewIncludePenBindingImpl extends ViewIncludePenBinding {

    /* renamed from: r */
    public static final ViewDataBinding.IncludedLayouts f20695r = null;

    /* renamed from: s */
    public static final SparseIntArray f20696s;

    /* renamed from: p */
    public final LinearLayoutCompat f20697p;

    /* renamed from: q */
    public long f20698q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20696s = sparseIntArray;
        sparseIntArray.put(R$id.rg_pen_type, 1);
        sparseIntArray.put(R$id.rb_pen_custom, 2);
        sparseIntArray.put(R$id.rb_pen_line, 3);
        sparseIntArray.put(R$id.rb_pen_dotted_line, 4);
        sparseIntArray.put(R$id.rb_pen_highlighter, 5);
        sparseIntArray.put(R$id.rb_pen_cursor, 6);
        sparseIntArray.put(R$id.view_line, 7);
        sparseIntArray.put(R$id.rg_pen_size, 8);
        sparseIntArray.put(R$id.rb_pen_size_little, 9);
        sparseIntArray.put(R$id.rb_pen_size_medium, 10);
        sparseIntArray.put(R$id.rb_pen_size_big, 11);
        sparseIntArray.put(R$id.view_line_2, 12);
        sparseIntArray.put(R$id.rg_pen_color, 13);
    }

    public ViewIncludePenBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, f20695r, f20696s));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f20698q = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f20698q != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f20698q = 1L;
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
        super(dataBindingComponent, view, 0, (RadioButton) objArr[6], (RadioButton) objArr[2], (RadioButton) objArr[4], (RadioButton) objArr[5], (RadioButton) objArr[3], (RadioButton) objArr[11], (RadioButton) objArr[9], (RadioButton) objArr[10], (RadioGroup) objArr[13], (RadioGroup) objArr[8], (RadioGroup) objArr[1], (View) objArr[7], (View) objArr[12]);
        this.f20698q = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.f20697p = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
