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
    public static final ViewDataBinding.IncludedLayouts f12649k = null;

    /* renamed from: l */
    public static final SparseIntArray f12650l;

    /* renamed from: i */
    public final ConstraintLayout f12651i;

    /* renamed from: j */
    public long f12652j;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f12650l = sparseIntArray;
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
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, f12649k, f12650l));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f12652j = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f12652j != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f12652j = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i9, Object obj, int i10) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i9, Object obj) {
        return true;
    }

    public ViewFragmentImagePickBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[8], (ImageView) objArr[6], (CheckBox) objArr[7], (View) objArr[2], (View) objArr[3], (PreviewView) objArr[1], (View) objArr[4], (View) objArr[5]);
        this.f12652j = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f12651i = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
