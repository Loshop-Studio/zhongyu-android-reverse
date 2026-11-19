package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.LifecycleOwner;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.blackboard.core.canvas.SketchRecorderView;
import com.zykj.view.C5278BR;
import com.zykj.view.C5280R;
import com.zykj.view.utils.ExtKt;
import com.zykj.view.widget.SketchBoardTouchFrameLayout;
import com.zykj.view.widget.SketchProgressView;
import com.zykj.view.widget.customColor.CustomColorFrameLayout;

/* loaded from: classes3.dex */
public class ViewFragmentBoardBindingImpl extends ViewFragmentBoardBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final ConstraintLayout mboundView0;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(20);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"view_include_menu", "view_item_sketch_record", "view_item_sketch_record_audio"}, new int[]{4, 10, 11}, new int[]{C5280R.layout.view_include_menu, C5280R.layout.view_item_sketch_record, C5280R.layout.view_item_sketch_record_audio});
        includedLayouts.setIncludes(2, new String[]{"view_include_pen", "view_include_eraser", "view_include_image_add", "view_include_background_color", "view_include_select_type"}, new int[]{5, 6, 7, 8, 9}, new int[]{C5280R.layout.view_include_pen, C5280R.layout.view_include_eraser, C5280R.layout.view_include_image_add, C5280R.layout.view_include_background_color, C5280R.layout.view_include_select_type});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C5280R.id.fl_sketch_board_touch, 12);
        sparseIntArray.put(C5280R.id.sketch_view, 13);
        sparseIntArray.put(C5280R.id.iv_back, 14);
        sparseIntArray.put(C5280R.id.iv_expansion, 15);
        sparseIntArray.put(C5280R.id.sketch_progress_vertical, 16);
        sparseIntArray.put(C5280R.id.sketch_progress_horizontal, 17);
        sparseIntArray.put(C5280R.id.loadingLayout, 18);
        sparseIntArray.put(C5280R.id.tvLoadingTips, 19);
    }

    public ViewFragmentBoardBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 20, sIncludes, sViewsWithIds));
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
            this.mDirtyFlags |= 64;
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
            this.mDirtyFlags |= 32;
        }
        return true;
    }

    private boolean onChangeIncludePen(ViewIncludePenBinding viewIncludePenBinding, int i) {
        if (i != C5278BR._all) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 128;
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

    private boolean onChangeIncludeSelect(ViewIncludeSelectTypeBinding viewIncludeSelectTypeBinding, int i) {
        if (i != C5278BR._all) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j7;
        synchronized (this) {
            j7 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        if ((j7 & 256) != 0) {
            ExtKt.setLight(this.flBoardCustomColor, Boolean.FALSE);
            ExtKt.setLight(this.flCustomColor, Boolean.TRUE);
        }
        ViewDataBinding.executeBindingsOn(this.includeMenu);
        ViewDataBinding.executeBindingsOn(this.includePen);
        ViewDataBinding.executeBindingsOn(this.includeEraser);
        ViewDataBinding.executeBindingsOn(this.includeGraph);
        ViewDataBinding.executeBindingsOn(this.includeBackground);
        ViewDataBinding.executeBindingsOn(this.includeSelect);
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
                return this.includeMenu.hasPendingBindings() || this.includePen.hasPendingBindings() || this.includeEraser.hasPendingBindings() || this.includeGraph.hasPendingBindings() || this.includeBackground.hasPendingBindings() || this.includeSelect.hasPendingBindings() || this.includeCommit.hasPendingBindings() || this.includeRecord.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 256L;
        }
        this.includeMenu.invalidateAll();
        this.includePen.invalidateAll();
        this.includeEraser.invalidateAll();
        this.includeGraph.invalidateAll();
        this.includeBackground.invalidateAll();
        this.includeSelect.invalidateAll();
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
                return onChangeIncludeSelect((ViewIncludeSelectTypeBinding) obj, i8);
            case 5:
                return onChangeIncludeMenu((ViewIncludeMenuBinding) obj, i8);
            case 6:
                return onChangeIncludeEraser((ViewIncludeEraserBinding) obj, i8);
            case 7:
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
        this.includeSelect.setLifecycleOwner(lifecycleOwner);
        this.includeCommit.setLifecycleOwner(lifecycleOwner);
        this.includeRecord.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    private ViewFragmentBoardBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 8, (CustomColorFrameLayout) objArr[1], (CustomColorFrameLayout) objArr[3], (SketchBoardTouchFrameLayout) objArr[12], (ViewIncludeBackgroundColorBinding) objArr[8], (ViewItemSketchRecordBinding) objArr[10], (ViewIncludeEraserBinding) objArr[6], (ViewIncludeImageAddBinding) objArr[7], (ViewIncludeMenuBinding) objArr[4], (ViewIncludePenBinding) objArr[5], (ViewItemSketchRecordAudioBinding) objArr[11], (ViewIncludeSelectTypeBinding) objArr[9], (AppCompatImageView) objArr[14], (AppCompatImageView) objArr[15], (FrameLayout) objArr[18], (SketchProgressView) objArr[17], (SketchProgressView) objArr[16], (SketchRecorderView) objArr[13], (FrameLayout) objArr[2], (TextView) objArr[19]);
        this.mDirtyFlags = -1L;
        this.flBoardCustomColor.setTag(null);
        this.flCustomColor.setTag(null);
        setContainedBinding(this.includeBackground);
        setContainedBinding(this.includeCommit);
        setContainedBinding(this.includeEraser);
        setContainedBinding(this.includeGraph);
        setContainedBinding(this.includeMenu);
        setContainedBinding(this.includePen);
        setContainedBinding(this.includeRecord);
        setContainedBinding(this.includeSelect);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        this.toolPanel.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
