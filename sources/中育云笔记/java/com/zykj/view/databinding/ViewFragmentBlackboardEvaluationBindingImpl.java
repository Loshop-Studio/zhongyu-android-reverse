package com.zykj.view.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zykj.blackboard.core.canvas.SketchRecorderView;
import com.zykj.view.R$id;
import com.zykj.view.widget.TouchSwitchView;

/* loaded from: classes6.dex */
public class ViewFragmentBlackboardEvaluationBindingImpl extends ViewFragmentBlackboardEvaluationBinding {

    /* renamed from: v */
    public static final ViewDataBinding.IncludedLayouts f20575v = null;

    /* renamed from: w */
    public static final SparseIntArray f20576w;

    /* renamed from: u */
    public long f20577u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20576w = sparseIntArray;
        sparseIntArray.put(R$id.view_top, 1);
        sparseIntArray.put(R$id.sketch_view, 2);
        sparseIntArray.put(R$id.iv_withdraw, 3);
        sparseIntArray.put(R$id.iv_recover, 4);
        sparseIntArray.put(R$id.iv_select, 5);
        sparseIntArray.put(R$id.iv_touch, 6);
        sparseIntArray.put(R$id.iv_pen, 7);
        sparseIntArray.put(R$id.iv_line, 8);
        sparseIntArray.put(R$id.iv_dotted_line, 9);
        sparseIntArray.put(R$id.iv_eraser, 10);
        sparseIntArray.put(R$id.iv_camera, 11);
        sparseIntArray.put(R$id.iv_import, 12);
        sparseIntArray.put(R$id.iv_text, 13);
        sparseIntArray.put(R$id.iv_delete, 14);
        sparseIntArray.put(R$id.iv_drag, 15);
        sparseIntArray.put(R$id.iv_eva_submit, 16);
        sparseIntArray.put(R$id.tv_hint, 17);
    }

    public ViewFragmentBlackboardEvaluationBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 18, f20575v, f20576w));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f20577u = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f20577u != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f20577u = 1L;
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

    public ViewFragmentBlackboardEvaluationBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[11], (ImageView) objArr[14], (ImageView) objArr[9], (ImageView) objArr[15], (ImageView) objArr[10], (ImageView) objArr[16], (ImageView) objArr[12], (ImageView) objArr[8], (ImageView) objArr[7], (ImageView) objArr[4], (ImageView) objArr[5], (ImageView) objArr[13], (ImageView) objArr[6], (ImageView) objArr[3], (SketchRecorderView) objArr[2], (TextView) objArr[17], (TouchSwitchView) objArr[0], (View) objArr[1]);
        this.f20577u = -1L;
        this.f20573s.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
