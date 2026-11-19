package com.friday.common.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.common.R$id;

/* loaded from: classes3.dex */
public class PopupWindowNoteInfoBindingImpl extends PopupWindowNoteInfoBinding {

    /* renamed from: k */
    public static final ViewDataBinding.IncludedLayouts f6016k = null;

    /* renamed from: l */
    public static final SparseIntArray f6017l;

    /* renamed from: i */
    public final CardView f6018i;

    /* renamed from: j */
    public long f6019j;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6017l = sparseIntArray;
        sparseIntArray.put(R$id.tv_modify_time, 1);
        sparseIntArray.put(R$id.tv_create_time, 2);
        sparseIntArray.put(R$id.ll_uncompleted, 3);
        sparseIntArray.put(R$id.iv_uncompleted_status, 4);
        sparseIntArray.put(R$id.tv_uncompleted, 5);
        sparseIntArray.put(R$id.tv_warn, 6);
    }

    public PopupWindowNoteInfoBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, f6016k, f6017l));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6019j = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6019j != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6019j = 1L;
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

    public PopupWindowNoteInfoBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[4], (LinearLayout) objArr[3], (TextView) objArr[2], (TextView) objArr[1], (TextView) objArr[5], (TextView) objArr[6]);
        this.f6019j = -1L;
        CardView cardView = (CardView) objArr[0];
        this.f6018i = cardView;
        cardView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
