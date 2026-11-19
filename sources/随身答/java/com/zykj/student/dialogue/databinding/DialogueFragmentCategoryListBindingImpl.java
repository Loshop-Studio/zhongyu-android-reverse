package com.zykj.student.dialogue.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.student.dialogue.R;

/* loaded from: classes5.dex */
public class DialogueFragmentCategoryListBindingImpl extends DialogueFragmentCategoryListBinding {

    /* renamed from: g */
    public static final ViewDataBinding.IncludedLayouts f10448g = null;

    /* renamed from: h */
    public static final SparseIntArray f10449h;

    /* renamed from: e */
    public final CardView f10450e;

    /* renamed from: f */
    public long f10451f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f10449h = sparseIntArray;
        sparseIntArray.put(R.id.tv_title, 1);
        sparseIntArray.put(R.id.iv_exit, 2);
        sparseIntArray.put(R.id.recycler_view, 3);
        sparseIntArray.put(R.id.cv_new_type, 4);
    }

    public DialogueFragmentCategoryListBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f10448g, f10449h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f10451f = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f10451f != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f10451f = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i9, Object obj, int i10) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i9, Object obj) {
        return true;
    }

    public DialogueFragmentCategoryListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[4], (ImageView) objArr[2], (RecyclerView) objArr[3], (TextView) objArr[1]);
        this.f10451f = -1L;
        CardView cardView = (CardView) objArr[0];
        this.f10450e = cardView;
        cardView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
