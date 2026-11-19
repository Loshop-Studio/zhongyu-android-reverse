package com.zykj.image.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.image.R$id;

/* loaded from: classes4.dex */
public class FragmentImagePickBindingImpl extends FragmentImagePickBinding {

    /* renamed from: g */
    public static final ViewDataBinding.IncludedLayouts f9822g = null;

    /* renamed from: h */
    public static final SparseIntArray f9823h;

    /* renamed from: e */
    public final ConstraintLayout f9824e;

    /* renamed from: f */
    public long f9825f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9823h = sparseIntArray;
        sparseIntArray.put(R$id.prevView, 1);
        sparseIntArray.put(R$id.capture, 2);
        sparseIntArray.put(R$id.ck_light, 3);
        sparseIntArray.put(R$id.cancel, 4);
    }

    public FragmentImagePickBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f9822g, f9823h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f9825f = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f9825f != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f9825f = 1L;
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

    public FragmentImagePickBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[4], (ImageView) objArr[2], (CheckBox) objArr[3], (PreviewView) objArr[1]);
        this.f9825f = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f9824e = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
