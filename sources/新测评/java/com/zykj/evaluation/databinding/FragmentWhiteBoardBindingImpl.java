package com.zykj.evaluation.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.zykj.evaluation.R;

/* loaded from: classes4.dex */
public class FragmentWhiteBoardBindingImpl extends FragmentWhiteBoardBinding {

    /* renamed from: e */
    public static final ViewDataBinding.IncludedLayouts f8760e = null;

    /* renamed from: f */
    public static final SparseIntArray f8761f;

    /* renamed from: d */
    public long f8762d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f8761f = sparseIntArray;
        sparseIntArray.put(R.id.sketch_fragment, 1);
        sparseIntArray.put(R.id.tv_sketch_move_tip, 2);
    }

    public FragmentWhiteBoardBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f8760e, f8761f));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f8762d = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f8762d != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f8762d = 1L;
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

    public FragmentWhiteBoardBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (RelativeLayout) objArr[0], (FragmentContainerView) objArr[1], (TextView) objArr[2]);
        this.f8762d = -1L;
        this.f8757a.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
