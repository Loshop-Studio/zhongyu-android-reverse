package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.zykj.blackboard.core.canvas.SketchRecorderView;
import com.zykj.view.R$id;
import com.zykj.view.R$layout;
import com.zykj.view.widget.TouchSwitchView;
import p008a7.AbstractC0044a;

/* loaded from: classes5.dex */
public class ViewFragmentBlackboardEvaluationBindingImpl extends ViewFragmentBlackboardEvaluationBinding {

    /* renamed from: y */
    public static final ViewDataBinding.IncludedLayouts f12615y;

    /* renamed from: z */
    public static final SparseIntArray f12616z;

    /* renamed from: x */
    public long f12617x;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(23);
        f12615y = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"view_include_evaluation_pen"}, new int[]{2}, new int[]{R$layout.view_include_evaluation_pen});
        includedLayouts.setIncludes(1, new String[]{"view_include_evaluation_pen_proxy"}, new int[]{3}, new int[]{R$layout.view_include_evaluation_pen_proxy});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f12616z = sparseIntArray;
        sparseIntArray.put(R$id.view_top, 4);
        sparseIntArray.put(R$id.sketch_view, 5);
        sparseIntArray.put(R$id.ll_evaluation_tools, 6);
        sparseIntArray.put(R$id.iv_withdraw, 7);
        sparseIntArray.put(R$id.iv_recover, 8);
        sparseIntArray.put(R$id.iv_select, 9);
        sparseIntArray.put(R$id.iv_touch, 10);
        sparseIntArray.put(R$id.iv_pen, 11);
        sparseIntArray.put(R$id.iv_line, 12);
        sparseIntArray.put(R$id.iv_dotted_line, 13);
        sparseIntArray.put(R$id.iv_eraser, 14);
        sparseIntArray.put(R$id.iv_camera, 15);
        sparseIntArray.put(R$id.iv_question, 16);
        sparseIntArray.put(R$id.iv_answer, 17);
        sparseIntArray.put(R$id.iv_text, 18);
        sparseIntArray.put(R$id.iv_delete, 19);
        sparseIntArray.put(R$id.iv_drag, 20);
        sparseIntArray.put(R$id.iv_eva_submit, 21);
        sparseIntArray.put(R$id.tv_hint, 22);
    }

    public ViewFragmentBlackboardEvaluationBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 23, f12615y, f12616z));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f12617x = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.f12594c);
        ViewDataBinding.executeBindingsOn(this.f12593b);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f12617x != 0) {
                    return true;
                }
                return this.f12594c.hasPendingBindings() || this.f12593b.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f12617x = 4L;
        }
        this.f12594c.invalidateAll();
        this.f12593b.invalidateAll();
        requestRebind();
    }

    /* renamed from: k */
    public final boolean m11882k(ViewIncludeEvaluationPenProxyBinding viewIncludeEvaluationPenProxyBinding, int i9) {
        if (i9 != AbstractC0044a.f140a) {
            return false;
        }
        synchronized (this) {
            this.f12617x |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i9, Object obj, int i10) {
        if (i9 == 0) {
            return m11883t((ViewIncludeEvaluationPenBinding) obj, i10);
        }
        if (i9 != 1) {
            return false;
        }
        return m11882k((ViewIncludeEvaluationPenProxyBinding) obj, i10);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f12594c.setLifecycleOwner(lifecycleOwner);
        this.f12593b.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i9, Object obj) {
        return true;
    }

    /* renamed from: t */
    public final boolean m11883t(ViewIncludeEvaluationPenBinding viewIncludeEvaluationPenBinding, int i9) {
        if (i9 != AbstractC0044a.f140a) {
            return false;
        }
        synchronized (this) {
            this.f12617x |= 1;
        }
        return true;
    }

    public ViewFragmentBlackboardEvaluationBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 2, (FrameLayout) objArr[1], (ViewIncludeEvaluationPenProxyBinding) objArr[3], (ViewIncludeEvaluationPenBinding) objArr[2], (ImageView) objArr[17], (ImageView) objArr[15], (ImageView) objArr[19], (ImageView) objArr[13], (ImageView) objArr[20], (ImageView) objArr[14], (ImageView) objArr[21], (ImageView) objArr[12], (ImageView) objArr[11], (ImageView) objArr[16], (ImageView) objArr[8], (ImageView) objArr[9], (ImageView) objArr[18], (ImageView) objArr[10], (ImageView) objArr[7], (LinearLayout) objArr[6], (SketchRecorderView) objArr[5], (TextView) objArr[22], (TouchSwitchView) objArr[0], (View) objArr[4]);
        this.f12617x = -1L;
        this.f12592a.setTag(null);
        setContainedBinding(this.f12593b);
        setContainedBinding(this.f12594c);
        this.f12613v.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
