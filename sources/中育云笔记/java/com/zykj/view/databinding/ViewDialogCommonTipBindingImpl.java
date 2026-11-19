package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.R$id;

/* loaded from: classes6.dex */
public class ViewDialogCommonTipBindingImpl extends ViewDialogCommonTipBinding {

    /* renamed from: i */
    public static final ViewDataBinding.IncludedLayouts f20534i = null;

    /* renamed from: j */
    public static final SparseIntArray f20535j;

    /* renamed from: g */
    public final FrameLayout f20536g;

    /* renamed from: h */
    public long f20537h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20535j = sparseIntArray;
        sparseIntArray.put(R$id.tv_content, 1);
        sparseIntArray.put(R$id.guide_line, 2);
        sparseIntArray.put(R$id.tv_confirm, 3);
        sparseIntArray.put(R$id.tv_cancel, 4);
    }

    public ViewDialogCommonTipBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f20534i, f20535j));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f20537h = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f20537h != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f20537h = 1L;
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
        this.f20537h = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f20536g = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
