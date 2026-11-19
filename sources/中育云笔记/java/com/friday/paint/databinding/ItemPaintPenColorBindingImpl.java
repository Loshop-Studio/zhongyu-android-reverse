package com.friday.paint.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.paint.R$id;

/* loaded from: classes4.dex */
public class ItemPaintPenColorBindingImpl extends ItemPaintPenColorBinding {

    /* renamed from: j */
    public static final ViewDataBinding.IncludedLayouts f9816j = null;

    /* renamed from: k */
    public static final SparseIntArray f9817k;

    /* renamed from: h */
    public final LinearLayout f9818h;

    /* renamed from: i */
    public long f9819i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9817k = sparseIntArray;
        sparseIntArray.put(R$id.iv_paint_level1, 1);
        sparseIntArray.put(R$id.iv_paint_level2, 2);
        sparseIntArray.put(R$id.iv_paint_level3, 3);
        sparseIntArray.put(R$id.rg_pen_color, 4);
        sparseIntArray.put(R$id.palette_blue, 5);
    }

    public ItemPaintPenColorBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, f9816j, f9817k));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f9819i = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f9819i != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f9819i = 1L;
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

    public ItemPaintPenColorBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[1], (ImageView) objArr[2], (ImageView) objArr[3], (RadioButton) objArr[5], (RadioGroup) objArr[4]);
        this.f9819i = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f9818h = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
