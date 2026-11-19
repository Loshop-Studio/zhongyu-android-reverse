package com.friday.lecture.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.lecture.R$id;

/* loaded from: classes4.dex */
public class LayoutRandomBindingImpl extends LayoutRandomBinding {

    /* renamed from: k */
    public static final ViewDataBinding.IncludedLayouts f8548k = null;

    /* renamed from: l */
    public static final SparseIntArray f8549l;

    /* renamed from: i */
    public final FrameLayout f8550i;

    /* renamed from: j */
    public long f8551j;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f8549l = sparseIntArray;
        sparseIntArray.put(R$id.cl_anim, 1);
        sparseIntArray.put(R$id.iv_star, 2);
        sparseIntArray.put(R$id.fl_flip, 3);
        sparseIntArray.put(R$id.iv_flip_card, 4);
        sparseIntArray.put(R$id.tv_random_name, 5);
        sparseIntArray.put(R$id.ll_random, 6);
    }

    public LayoutRandomBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, f8548k, f8549l));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f8551j = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f8551j != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f8551j = 1L;
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

    public LayoutRandomBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[1], (FrameLayout) objArr[3], (ImageView) objArr[4], (ImageView) objArr[2], (LinearLayout) objArr[6], (TextView) objArr[5]);
        this.f8551j = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f8550i = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
