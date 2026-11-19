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
public class DialogSharedFileBindingImpl extends DialogSharedFileBinding {

    /* renamed from: i */
    public static final ViewDataBinding.IncludedLayouts f5973i = null;

    /* renamed from: j */
    public static final SparseIntArray f5974j;

    /* renamed from: g */
    public final CardView f5975g;

    /* renamed from: h */
    public long f5976h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5974j = sparseIntArray;
        sparseIntArray.put(R$id.tv_dialog, 1);
        sparseIntArray.put(R$id.iv_study_close, 2);
        sparseIntArray.put(R$id.btn_cancel_share, 3);
        sparseIntArray.put(R$id.iv_study_shared_logo, 4);
    }

    public DialogSharedFileBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f5973i, f5974j));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f5976h = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f5976h != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f5976h = 1L;
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

    public DialogSharedFileBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[3], (ImageView) objArr[2], (ImageView) objArr[4], (TextView) objArr[1]);
        this.f5976h = -1L;
        CardView cardView = (CardView) objArr[0];
        this.f5975g = cardView;
        cardView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
