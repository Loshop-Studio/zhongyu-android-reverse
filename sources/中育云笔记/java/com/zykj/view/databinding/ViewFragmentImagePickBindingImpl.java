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

/* loaded from: classes6.dex */
public class ViewFragmentImagePickBindingImpl extends ViewFragmentImagePickBinding {

    /* renamed from: m */
    public static final ViewDataBinding.IncludedLayouts f20605m = null;

    /* renamed from: n */
    public static final SparseIntArray f20606n;

    /* renamed from: k */
    public final ConstraintLayout f20607k;

    /* renamed from: l */
    public long f20608l;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20606n = sparseIntArray;
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
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, f20605m, f20606n));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f20608l = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f20608l != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f20608l = 1L;
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
        this.f20608l = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f20607k = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
