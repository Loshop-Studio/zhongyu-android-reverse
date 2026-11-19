package com.friday.main.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.common.widget.FridayDrawableTextView;
import com.friday.main.R$id;

/* loaded from: classes4.dex */
public class PopupWindowCreateNewBindingImpl extends PopupWindowCreateNewBinding {

    /* renamed from: g */
    public static final ViewDataBinding.IncludedLayouts f9212g = null;

    /* renamed from: h */
    public static final SparseIntArray f9213h;

    /* renamed from: e */
    public final CardView f9214e;

    /* renamed from: f */
    public long f9215f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9213h = sparseIntArray;
        sparseIntArray.put(R$id.tv_createNote, 1);
        sparseIntArray.put(R$id.tv_createFolder, 2);
    }

    public PopupWindowCreateNewBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f9212g, f9213h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f9215f = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f9215f != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f9215f = 1L;
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

    public PopupWindowCreateNewBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FridayDrawableTextView) objArr[2], (FridayDrawableTextView) objArr[1]);
        this.f9215f = -1L;
        CardView cardView = (CardView) objArr[0];
        this.f9214e = cardView;
        cardView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
