package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.R$id;

/* loaded from: classes5.dex */
public class ViewDialogCommonTipBindingImpl extends ViewDialogCommonTipBinding {

    /* renamed from: g */
    public static final ViewDataBinding.IncludedLayouts f15323g = null;

    /* renamed from: h */
    public static final SparseIntArray f15324h;

    /* renamed from: e */
    public final FrameLayout f15325e;

    /* renamed from: f */
    public long f15326f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f15324h = sparseIntArray;
        sparseIntArray.put(R$id.tv_content, 1);
        sparseIntArray.put(R$id.guide_line, 2);
        sparseIntArray.put(R$id.tv_confirm, 3);
        sparseIntArray.put(R$id.tv_cancel, 4);
    }

    public ViewDialogCommonTipBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f15323g, f15324h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f15326f = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f15326f != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f15326f = 1L;
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

    public ViewDialogCommonTipBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (Guideline) objArr[2], (TextView) objArr[4], (TextView) objArr[3], (TextView) objArr[1]);
        this.f15326f = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f15325e = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
