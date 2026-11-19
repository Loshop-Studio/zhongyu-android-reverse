package com.friday.lecture.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.friday.common.widget.TouchSwitchView;
import com.friday.lecture.R$id;
import com.friday.lecture.widget.GlobalCanvasView;
import com.github.chrisbanes.photoview.PhotoView;

/* loaded from: classes4.dex */
public class LayoutSimpleCanvasBindingImpl extends LayoutSimpleCanvasBinding {

    /* renamed from: v */
    public static final ViewDataBinding.IncludedLayouts f8569v = null;

    /* renamed from: w */
    public static final SparseIntArray f8570w;

    /* renamed from: t */
    public final ConstraintLayout f8571t;

    /* renamed from: u */
    public long f8572u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f8570w = sparseIntArray;
        sparseIntArray.put(R$id.layout_confirm, 1);
        sparseIntArray.put(R$id.cl_content, 2);
        sparseIntArray.put(R$id.fm_view, 3);
        sparseIntArray.put(R$id.iv_picture, 4);
        sparseIntArray.put(R$id.gcv_paint, 5);
        sparseIntArray.put(R$id.view_bg, 6);
        sparseIntArray.put(R$id.iv_finger, 7);
        sparseIntArray.put(R$id.iv_pencil, 8);
        sparseIntArray.put(R$id.iv_scale, 9);
        sparseIntArray.put(R$id.iv_eraser, 10);
        sparseIntArray.put(R$id.iv_delete, 11);
        sparseIntArray.put(R$id.iv_close_simple_canvas, 12);
        sparseIntArray.put(R$id.ll_detail, 13);
        sparseIntArray.put(R$id.iv_level1, 14);
        sparseIntArray.put(R$id.iv_level2, 15);
        sparseIntArray.put(R$id.iv_level3, 16);
        sparseIntArray.put(R$id.rv_paint_color, 17);
    }

    public LayoutSimpleCanvasBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 18, f8569v, f8570w));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f8572u = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f8572u != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f8572u = 1L;
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

    public LayoutSimpleCanvasBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TouchSwitchView) objArr[2], (TouchSwitchView) objArr[3], (GlobalCanvasView) objArr[5], (ImageView) objArr[12], (ImageView) objArr[11], (ImageView) objArr[10], (ImageView) objArr[7], (ImageView) objArr[14], (ImageView) objArr[15], (ImageView) objArr[16], (ImageView) objArr[8], (PhotoView) objArr[4], (ImageView) objArr[9], (View) objArr[1], (LinearLayout) objArr[13], (RecyclerView) objArr[17], (View) objArr[6]);
        this.f8572u = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f8571t = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
