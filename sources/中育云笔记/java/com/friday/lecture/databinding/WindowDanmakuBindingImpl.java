package com.friday.lecture.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.friday.lecture.R$id;

/* loaded from: classes4.dex */
public class WindowDanmakuBindingImpl extends WindowDanmakuBinding {

    /* renamed from: f */
    public static final ViewDataBinding.IncludedLayouts f8637f = null;

    /* renamed from: g */
    public static final SparseIntArray f8638g;

    /* renamed from: d */
    public final CardView f8639d;

    /* renamed from: e */
    public long f8640e;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f8638g = sparseIntArray;
        sparseIntArray.put(R$id.ll_container, 1);
    }

    public WindowDanmakuBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f8637f, f8638g));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f8640e = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f8640e != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f8640e = 1L;
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

    public WindowDanmakuBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayout) objArr[1]);
        this.f8640e = -1L;
        CardView cardView = (CardView) objArr[0];
        this.f8639d = cardView;
        cardView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
