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
import p209jb.AbstractC9709a;

/* loaded from: classes6.dex */
public class ViewFragmentSketchPlayBindingImpl extends ViewFragmentSketchPlayBinding {

    /* renamed from: m */
    public static final ViewDataBinding.IncludedLayouts f20635m;

    /* renamed from: n */
    public static final SparseIntArray f20636n;

    /* renamed from: l */
    public long f20637l;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(9);
        f20635m = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"view_item_sketch_play"}, new int[]{1}, new int[]{R$layout.view_item_sketch_play});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20636n = sparseIntArray;
        sparseIntArray.put(R$id.touch_switch_view, 2);
        sparseIntArray.put(R$id.sketch_view, 3);
        sparseIntArray.put(R$id.iv_back, 4);
        sparseIntArray.put(R$id.iv_setting, 5);
        sparseIntArray.put(R$id.iv_fullscreen, 6);
        sparseIntArray.put(R$id.sketch_progress_vertical, 7);
        sparseIntArray.put(R$id.sketch_progress_horizontal, 8);
    }

    public ViewFragmentSketchPlayBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, f20635m, f20636n));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f20637l = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.f20627d);
    }

    /* renamed from: g */
    public final boolean m17358g(ViewItemSketchPlayBinding viewItemSketchPlayBinding, int i10) {
        if (i10 != AbstractC9709a.f22598a) {
            return false;
        }
        synchronized (this) {
            this.f20637l |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f20637l != 0) {
                    return true;
                }
                return this.f20627d.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f20637l = 2L;
        }
        this.f20627d.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return m17358g((ViewItemSketchPlayBinding) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f20627d.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        return true;
    }

    public ViewFragmentSketchPlayBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (ConstraintLayout) objArr[0], (ViewItemSketchPlayBinding) objArr[1], (ImageView) objArr[4], (ImageView) objArr[6], (ImageView) objArr[5], (SketchProgressView) objArr[8], (SketchProgressView) objArr[7], (MergeSketchPlayView) objArr[3], (TouchSwitchView) objArr[2]);
        this.f20637l = -1L;
        this.f20626c.setTag(null);
        setContainedBinding(this.f20627d);
        setRootTag(view);
        invalidateAll();
    }
}
