package com.zykj.image.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.image.R$id;
import com.zykj.image.ViewfinderView;

/* loaded from: classes4.dex */
public class FragmentQrCodeBindingImpl extends FragmentQrCodeBinding {

    /* renamed from: g */
    public static final ViewDataBinding.IncludedLayouts f9830g = null;

    /* renamed from: h */
    public static final SparseIntArray f9831h;

    /* renamed from: e */
    public final ConstraintLayout f9832e;

    /* renamed from: f */
    public long f9833f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9831h = sparseIntArray;
        sparseIntArray.put(R$id.prevView, 1);
        sparseIntArray.put(R$id.view_finder, 2);
        sparseIntArray.put(R$id.view, 3);
        sparseIntArray.put(R$id.cancel, 4);
    }

    public FragmentQrCodeBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f9830g, f9831h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f9833f = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f9833f != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f9833f = 1L;
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

    public FragmentQrCodeBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[4], (PreviewView) objArr[1], (View) objArr[3], (ViewfinderView) objArr[2]);
        this.f9833f = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f9832e = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
