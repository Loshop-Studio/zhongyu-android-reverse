package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.R$id;

/* loaded from: classes5.dex */
public class ViewFragmentImagePickBindingImpl extends ViewFragmentImagePickBinding {

    /* renamed from: k */
    public static final ViewDataBinding.IncludedLayouts f15394k = null;

    /* renamed from: l */
    public static final SparseIntArray f15395l;

    /* renamed from: i */
    public final ConstraintLayout f15396i;

    /* renamed from: j */
    public long f15397j;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f15395l = sparseIntArray;
        sparseIntArray.put(R$id.prevView, 1);
        sparseIntArray.put(R$id.h_line1, 2);
        sparseIntArray.put(R$id.h_line2, 3);
        sparseIntArray.put(R$id.v_line1, 4);
        sparseIntArray.put(R$id.v_line2, 5);
        sparseIntArray.put(R$id.capture, 6);
        sparseIntArray.put(R$id.ck_light, 7);
        sparseIntArray.put(R$id.cancel, 8);
    }

    public ViewFragmentImagePickBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, f15394k, f15395l));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f15397j = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f15397j != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f15397j = 1L;
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

    public ViewFragmentImagePickBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[8], (ImageView) objArr[6], (CheckBox) objArr[7], (View) objArr[2], (View) objArr[3], (PreviewView) objArr[1], (View) objArr[4], (View) objArr[5]);
        this.f15397j = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f15396i = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
