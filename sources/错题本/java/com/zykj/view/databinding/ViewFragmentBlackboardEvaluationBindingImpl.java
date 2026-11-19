package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.LifecycleOwner;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.blackboard.core.canvas.SketchRecorderView;
import com.zykj.view.C5278BR;
import com.zykj.view.C5280R;
import com.zykj.view.widget.TouchSwitchView;

/* loaded from: classes3.dex */
public class ViewFragmentBlackboardEvaluationBindingImpl extends ViewFragmentBlackboardEvaluationBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(23);
        sIncludes = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"view_include_evaluation_pen"}, new int[]{2}, new int[]{C5280R.layout.view_include_evaluation_pen});
        includedLayouts.setIncludes(1, new String[]{"view_include_evaluation_pen_proxy"}, new int[]{3}, new int[]{C5280R.layout.view_include_evaluation_pen_proxy});
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C5280R.id.view_top, 4);
        sparseIntArray.put(C5280R.id.sketch_view, 5);
        sparseIntArray.put(C5280R.id.ll_evaluation_tools, 6);
        sparseIntArray.put(C5280R.id.iv_withdraw, 7);
        sparseIntArray.put(C5280R.id.iv_recover, 8);
        sparseIntArray.put(C5280R.id.iv_select, 9);
        sparseIntArray.put(C5280R.id.iv_touch, 10);
        sparseIntArray.put(C5280R.id.iv_pen, 11);
        sparseIntArray.put(C5280R.id.iv_line, 12);
        sparseIntArray.put(C5280R.id.iv_dotted_line, 13);
        sparseIntArray.put(C5280R.id.iv_eraser, 14);
        sparseIntArray.put(C5280R.id.iv_camera, 15);
        sparseIntArray.put(C5280R.id.iv_question, 16);
        sparseIntArray.put(C5280R.id.iv_answer, 17);
        sparseIntArray.put(C5280R.id.iv_text, 18);
        sparseIntArray.put(C5280R.id.iv_delete, 19);
        sparseIntArray.put(C5280R.id.iv_drag, 20);
        sparseIntArray.put(C5280R.id.iv_eva_submit, 21);
        sparseIntArray.put(C5280R.id.tv_hint, 22);
    }

    public ViewFragmentBlackboardEvaluationBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 23, sIncludes, sViewsWithIds));
    }

    private boolean onChangeIncludePenColorSelectProxy(ViewIncludeEvaluationPenProxyBinding viewIncludeEvaluationPenProxyBinding, int i) {
        if (i != C5278BR._all) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeIncludePenColorToolbar(ViewIncludeEvaluationPenBinding viewIncludeEvaluationPenBinding, int i) {
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
        ViewDataBinding.executeBindingsOn(this.includePenColorToolbar);
        ViewDataBinding.executeBindingsOn(this.includePenColorSelectProxy);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.mDirtyFlags != 0) {
                    return true;
                }
                return this.includePenColorToolbar.hasPendingBindings() || this.includePenColorSelectProxy.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 4L;
        }
        this.includePenColorToolbar.invalidateAll();
        this.includePenColorSelectProxy.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i8) {
        if (i == 0) {
            return onChangeIncludePenColorToolbar((ViewIncludeEvaluationPenBinding) obj, i8);
        }
        if (i != 1) {
            return false;
        }
        return onChangeIncludePenColorSelectProxy((ViewIncludeEvaluationPenProxyBinding) obj, i8);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.includePenColorToolbar.setLifecycleOwner(lifecycleOwner);
        this.includePenColorSelectProxy.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    private ViewFragmentBlackboardEvaluationBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (FrameLayout) objArr[1], (ViewIncludeEvaluationPenProxyBinding) objArr[3], (ViewIncludeEvaluationPenBinding) objArr[2], (ImageView) objArr[17], (ImageView) objArr[15], (ImageView) objArr[19], (ImageView) objArr[13], (ImageView) objArr[20], (ImageView) objArr[14], (ImageView) objArr[21], (ImageView) objArr[12], (ImageView) objArr[11], (ImageView) objArr[16], (ImageView) objArr[8], (ImageView) objArr[9], (ImageView) objArr[18], (ImageView) objArr[10], (ImageView) objArr[7], (LinearLayout) objArr[6], (SketchRecorderView) objArr[5], (TextView) objArr[22], (TouchSwitchView) objArr[0], (View) objArr[4]);
        this.mDirtyFlags = -1L;
        this.flEvaluationPenColorProxy.setTag(null);
        setContainedBinding(this.includePenColorSelectProxy);
        setContainedBinding(this.includePenColorToolbar);
        this.viewRoot.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
