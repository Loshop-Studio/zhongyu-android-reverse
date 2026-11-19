package com.friday.lecture.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.lecture.R$id;

/* loaded from: classes4.dex */
public class FloatViewBindingImpl extends FloatViewBinding {

    /* renamed from: o */
    public static final ViewDataBinding.IncludedLayouts f8510o = null;

    /* renamed from: p */
    public static final SparseIntArray f8511p;

    /* renamed from: m */
    public final LinearLayout f8512m;

    /* renamed from: n */
    public long f8513n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f8511p = sparseIntArray;
        sparseIntArray.put(R$id.cv_menu, 1);
        sparseIntArray.put(R$id.ll_option, 2);
        sparseIntArray.put(R$id.iv_close, 3);
        sparseIntArray.put(R$id.iv_canvas_switch, 4);
        sparseIntArray.put(R$id.fl_homework_switch, 5);
        sparseIntArray.put(R$id.iv_homework_switch, 6);
        sparseIntArray.put(R$id.tv_homework_switch, 7);
        sparseIntArray.put(R$id.fl_student_demo, 8);
        sparseIntArray.put(R$id.iv_student_demo, 9);
        sparseIntArray.put(R$id.tv_online_count, 10);
    }

    public FloatViewBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, f8510o, f8511p));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f8513n = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f8513n != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f8513n = 1L;
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

    public FloatViewBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (CardView) objArr[1], (FrameLayout) objArr[5], (FrameLayout) objArr[8], (ImageView) objArr[4], (ImageView) objArr[3], (ImageView) objArr[6], (ImageView) objArr[9], (LinearLayout) objArr[2], (TextView) objArr[7], (TextView) objArr[10]);
        this.f8513n = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f8512m = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
