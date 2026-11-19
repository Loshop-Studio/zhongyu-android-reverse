package com.friday.common.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.common.R$id;

/* loaded from: classes3.dex */
public class DialogShareBindingImpl extends DialogShareBinding {

    /* renamed from: h */
    public static final ViewDataBinding.IncludedLayouts f5965h = null;

    /* renamed from: i */
    public static final SparseIntArray f5966i;

    /* renamed from: f */
    public final CardView f5967f;

    /* renamed from: g */
    public long f5968g;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5966i = sparseIntArray;
        sparseIntArray.put(R$id.tv_dialog, 1);
        sparseIntArray.put(R$id.iv_close, 2);
        sparseIntArray.put(R$id.iv_study_logo, 3);
    }

    public DialogShareBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, f5965h, f5966i));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f5968g = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f5968g != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f5968g = 1L;
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

    public DialogShareBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[2], (ImageView) objArr[3], (TextView) objArr[1]);
        this.f5968g = -1L;
        CardView cardView = (CardView) objArr[0];
        this.f5967f = cardView;
        cardView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
