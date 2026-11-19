package com.friday.common.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.common.R$id;

/* loaded from: classes3.dex */
public class ViewNoteInfoShareToMeBindingImpl extends ViewNoteInfoShareToMeBinding {

    /* renamed from: g */
    public static final ViewDataBinding.IncludedLayouts f6022g = null;

    /* renamed from: h */
    public static final SparseIntArray f6023h;

    /* renamed from: e */
    public final CardView f6024e;

    /* renamed from: f */
    public long f6025f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6023h = sparseIntArray;
        sparseIntArray.put(R$id.tv_modify_time, 1);
        sparseIntArray.put(R$id.tv_create_time, 2);
    }

    public ViewNoteInfoShareToMeBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f6022g, f6023h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6025f = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6025f != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6025f = 1L;
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

    public ViewNoteInfoShareToMeBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[2], (TextView) objArr[1]);
        this.f6025f = -1L;
        CardView cardView = (CardView) objArr[0];
        this.f6024e = cardView;
        cardView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
