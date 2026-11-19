package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.LifecycleOwner;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.merge.sketch.view.MergeSketchPlayView;
import com.zykj.view.C5278BR;
import com.zykj.view.C5280R;
import com.zykj.view.widget.SketchProgressView;
import com.zykj.view.widget.TouchSwitchView;

/* loaded from: classes3.dex */
public class ViewFragmentSketchPlayBindingImpl extends ViewFragmentSketchPlayBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(9);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"view_item_sketch_play"}, new int[]{1}, new int[]{C5280R.layout.view_item_sketch_play});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C5280R.id.touch_switch_view, 2);
        sparseIntArray.put(C5280R.id.sketch_view, 3);
        sparseIntArray.put(C5280R.id.iv_back, 4);
        sparseIntArray.put(C5280R.id.iv_setting, 5);
        sparseIntArray.put(C5280R.id.iv_fullscreen, 6);
        sparseIntArray.put(C5280R.id.sketch_progress_vertical, 7);
        sparseIntArray.put(C5280R.id.sketch_progress_horizontal, 8);
    }

    public ViewFragmentSketchPlayBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, sIncludes, sViewsWithIds));
    }

    private boolean onChangeControlBar(ViewItemSketchPlayBinding viewItemSketchPlayBinding, int i) {
        if (i != C5278BR._all) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.mDirtyFlags = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.controlBar);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.mDirtyFlags != 0) {
                    return true;
                }
                return this.controlBar.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 2L;
        }
        this.controlBar.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i8) {
        if (i != 0) {
            return false;
        }
        return onChangeControlBar((ViewItemSketchPlayBinding) obj, i8);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.controlBar.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    private ViewFragmentSketchPlayBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (ConstraintLayout) objArr[0], (ViewItemSketchPlayBinding) objArr[1], (ImageView) objArr[4], (ImageView) objArr[6], (ImageView) objArr[5], (SketchProgressView) objArr[8], (SketchProgressView) objArr[7], (MergeSketchPlayView) objArr[3], (TouchSwitchView) objArr[2]);
        this.mDirtyFlags = -1L;
        this.clRoot.setTag(null);
        setContainedBinding(this.controlBar);
        setRootTag(view);
        invalidateAll();
    }
}
