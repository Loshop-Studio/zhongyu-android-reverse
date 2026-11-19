package com.friday.main.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.common.widget.FridayDrawableTextView;
import com.friday.main.R$id;

/* loaded from: classes4.dex */
public class PopupWindowDbDebugBindingImpl extends PopupWindowDbDebugBinding {

    /* renamed from: h */
    public static final ViewDataBinding.IncludedLayouts f9219h = null;

    /* renamed from: i */
    public static final SparseIntArray f9220i;

    /* renamed from: f */
    public final CardView f9221f;

    /* renamed from: g */
    public long f9222g;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9220i = sparseIntArray;
        sparseIntArray.put(R$id.tv_file, 1);
        sparseIntArray.put(R$id.tv_res, 2);
        sparseIntArray.put(R$id.tv_cache, 3);
    }

    public PopupWindowDbDebugBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, f9219h, f9220i));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f9222g = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f9222g != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f9222g = 1L;
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

    public PopupWindowDbDebugBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FridayDrawableTextView) objArr[3], (FridayDrawableTextView) objArr[1], (FridayDrawableTextView) objArr[2]);
        this.f9222g = -1L;
        CardView cardView = (CardView) objArr[0];
        this.f9221f = cardView;
        cardView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
