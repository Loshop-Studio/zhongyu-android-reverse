package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.zykj.merge.sketch.view.MergeSketchPlayView;
import com.zykj.view.R$id;
import com.zykj.view.R$layout;
import com.zykj.view.widget.SketchProgressView;
import com.zykj.view.widget.TouchSwitchView;
import p008a7.AbstractC0044a;

/* loaded from: classes5.dex */
public class ViewFragmentSketchPlayBindingImpl extends ViewFragmentSketchPlayBinding {

    /* renamed from: k */
    public static final ViewDataBinding.IncludedLayouts f12679k;

    /* renamed from: l */
    public static final SparseIntArray f12680l;

    /* renamed from: j */
    public long f12681j;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(9);
        f12679k = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"view_item_sketch_play"}, new int[]{1}, new int[]{R$layout.view_item_sketch_play});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f12680l = sparseIntArray;
        sparseIntArray.put(R$id.touch_switch_view, 2);
        sparseIntArray.put(R$id.sketch_view, 3);
        sparseIntArray.put(R$id.iv_back, 4);
        sparseIntArray.put(R$id.iv_setting, 5);
        sparseIntArray.put(R$id.iv_fullscreen, 6);
        sparseIntArray.put(R$id.sketch_progress_vertical, 7);
        sparseIntArray.put(R$id.sketch_progress_horizontal, 8);
    }

    public ViewFragmentSketchPlayBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, f12679k, f12680l));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f12681j = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.f12671b);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f12681j != 0) {
                    return true;
                }
                return this.f12671b.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f12681j = 2L;
        }
        this.f12671b.invalidateAll();
        requestRebind();
    }

    /* renamed from: k */
    public final boolean m11907k(ViewItemSketchPlayBinding viewItemSketchPlayBinding, int i9) {
        if (i9 != AbstractC0044a.f140a) {
            return false;
        }
        synchronized (this) {
            this.f12681j |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i9, Object obj, int i10) {
        if (i9 != 0) {
            return false;
        }
        return m11907k((ViewItemSketchPlayBinding) obj, i10);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f12671b.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i9, Object obj) {
        return true;
    }

    public ViewFragmentSketchPlayBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (ConstraintLayout) objArr[0], (ViewItemSketchPlayBinding) objArr[1], (ImageView) objArr[4], (ImageView) objArr[6], (ImageView) objArr[5], (SketchProgressView) objArr[8], (SketchProgressView) objArr[7], (MergeSketchPlayView) objArr[3], (TouchSwitchView) objArr[2]);
        this.f12681j = -1L;
        this.f12670a.setTag(null);
        setContainedBinding(this.f12671b);
        setRootTag(view);
        invalidateAll();
    }
}
