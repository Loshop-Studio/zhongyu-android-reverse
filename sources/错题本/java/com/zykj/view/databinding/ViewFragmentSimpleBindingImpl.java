package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.LifecycleOwner;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.view.C5278BR;
import com.zykj.view.C5280R;
import com.zykj.view.simpleBoard.SimpleBoardView;
import com.zykj.view.widget.SketchProgressView;

/* loaded from: classes3.dex */
public class ViewFragmentSimpleBindingImpl extends ViewFragmentSimpleBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final ConstraintLayout mboundView0;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(14);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"view_include_menu", "view_item_sketch_record", "view_item_sketch_record_audio"}, new int[]{2, 7, 8}, new int[]{C5280R.layout.view_include_menu, C5280R.layout.view_item_sketch_record, C5280R.layout.view_item_sketch_record_audio});
        includedLayouts.setIncludes(1, new String[]{"view_include_pen", "view_include_eraser", "view_include_image_add", "view_include_background_color"}, new int[]{3, 4, 5, 6}, new int[]{C5280R.layout.view_include_pen, C5280R.layout.view_include_eraser, C5280R.layout.view_include_image_add, C5280R.layout.view_include_background_color});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C5280R.id.sketch_view, 9);
        sparseIntArray.put(C5280R.id.iv_back, 10);
        sparseIntArray.put(C5280R.id.iv_expansion, 11);
        sparseIntArray.put(C5280R.id.sketch_progress_vertical, 12);
        sparseIntArray.put(C5280R.id.sketch_progress_horizontal, 13);
    }

    public ViewFragmentSimpleBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, sIncludes, sViewsWithIds));
    }

    private boolean onChangeIncludeBackground(ViewIncludeBackgroundColorBinding viewIncludeBackgroundColorBinding, int i) {
        if (i != C5278BR._all) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeIncludeCommit(ViewItemSketchRecordBinding viewItemSketchRecordBinding, int i) {
        if (i != C5278BR._all) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeIncludeEraser(ViewIncludeEraserBinding viewIncludeEraserBinding, int i) {
        if (i != C5278BR._all) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        return true;
    }

    private boolean onChangeIncludeGraph(ViewIncludeImageAddBinding viewIncludeImageAddBinding, int i) {
        if (i != C5278BR._all) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeIncludeMenu(ViewIncludeMenuBinding viewIncludeMenuBinding, int i) {
        if (i != C5278BR._all) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    private boolean onChangeIncludePen(ViewIncludePenBinding viewIncludePenBinding, int i) {
        if (i != C5278BR._all) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 64;
        }
        return true;
    }

    private boolean onChangeIncludeRecord(ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, int i) {
        if (i != C5278BR._all) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.mDirtyFlags = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.includeMenu);
        ViewDataBinding.executeBindingsOn(this.includePen);
        ViewDataBinding.executeBindingsOn(this.includeEraser);
        ViewDataBinding.executeBindingsOn(this.includeGraph);
        ViewDataBinding.executeBindingsOn(this.includeBackground);
        ViewDataBinding.executeBindingsOn(this.includeCommit);
        ViewDataBinding.executeBindingsOn(this.includeRecord);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.mDirtyFlags != 0) {
                    return true;
                }
                return this.includeMenu.hasPendingBindings() || this.includePen.hasPendingBindings() || this.includeEraser.hasPendingBindings() || this.includeGraph.hasPendingBindings() || this.includeBackground.hasPendingBindings() || this.includeCommit.hasPendingBindings() || this.includeRecord.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 128L;
        }
        this.includeMenu.invalidateAll();
        this.includePen.invalidateAll();
        this.includeEraser.invalidateAll();
        this.includeGraph.invalidateAll();
        this.includeBackground.invalidateAll();
        this.includeCommit.invalidateAll();
        this.includeRecord.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i8) {
        switch (i) {
            case 0:
                return onChangeIncludeGraph((ViewIncludeImageAddBinding) obj, i8);
            case 1:
                return onChangeIncludeRecord((ViewItemSketchRecordAudioBinding) obj, i8);
            case 2:
                return onChangeIncludeCommit((ViewItemSketchRecordBinding) obj, i8);
            case 3:
                return onChangeIncludeBackground((ViewIncludeBackgroundColorBinding) obj, i8);
            case 4:
                return onChangeIncludeMenu((ViewIncludeMenuBinding) obj, i8);
            case 5:
                return onChangeIncludeEraser((ViewIncludeEraserBinding) obj, i8);
            case 6:
                return onChangeIncludePen((ViewIncludePenBinding) obj, i8);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.includeMenu.setLifecycleOwner(lifecycleOwner);
        this.includePen.setLifecycleOwner(lifecycleOwner);
        this.includeEraser.setLifecycleOwner(lifecycleOwner);
        this.includeGraph.setLifecycleOwner(lifecycleOwner);
        this.includeBackground.setLifecycleOwner(lifecycleOwner);
        this.includeCommit.setLifecycleOwner(lifecycleOwner);
        this.includeRecord.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    private ViewFragmentSimpleBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 7, (ViewIncludeBackgroundColorBinding) objArr[6], (ViewItemSketchRecordBinding) objArr[7], (ViewIncludeEraserBinding) objArr[4], (ViewIncludeImageAddBinding) objArr[5], (ViewIncludeMenuBinding) objArr[2], (ViewIncludePenBinding) objArr[3], (ViewItemSketchRecordAudioBinding) objArr[8], (AppCompatImageView) objArr[10], (AppCompatImageView) objArr[11], (SketchProgressView) objArr[13], (SketchProgressView) objArr[12], (SimpleBoardView) objArr[9], (FrameLayout) objArr[1]);
        this.mDirtyFlags = -1L;
        setContainedBinding(this.includeBackground);
        setContainedBinding(this.includeCommit);
        setContainedBinding(this.includeEraser);
        setContainedBinding(this.includeGraph);
        setContainedBinding(this.includeMenu);
        setContainedBinding(this.includePen);
        setContainedBinding(this.includeRecord);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        this.toolPanel.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
