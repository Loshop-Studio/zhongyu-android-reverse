package com.friday.main.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager2.widget.ViewPager2;
import com.friday.main.R$id;
import com.friday.main.R$layout;
import p316r3.AbstractC10837a;

/* loaded from: classes4.dex */
public class HomeActivityBindingImpl extends HomeActivityBinding {

    /* renamed from: i */
    public static final ViewDataBinding.IncludedLayouts f9189i;

    /* renamed from: j */
    public static final SparseIntArray f9190j;

    /* renamed from: g */
    public final ConstraintLayout f9191g;

    /* renamed from: h */
    public long f9192h;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(5);
        f9189i = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"layout_tab"}, new int[]{1}, new int[]{R$layout.layout_tab});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9190j = sparseIntArray;
        sparseIntArray.put(R$id.view_pager2, 2);
        sparseIntArray.put(R$id.cv_air_play, 3);
        sparseIntArray.put(R$id.iv_air_play, 4);
    }

    public HomeActivityBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f9189i, f9190j));
    }

    /* renamed from: a */
    public final boolean m6941a(LayoutTabBinding layoutTabBinding, int i10) {
        if (i10 != AbstractC10837a.f26145a) {
            return false;
        }
        synchronized (this) {
            this.f9192h |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f9192h = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.f9186d);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f9192h != 0) {
                    return true;
                }
                return this.f9186d.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f9192h = 2L;
        }
        this.f9186d.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return m6941a((LayoutTabBinding) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f9186d.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        return true;
    }

    public HomeActivityBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (CardView) objArr[3], (LayoutTabBinding) objArr[1], (ImageView) objArr[4], (ViewPager2) objArr[2]);
        this.f9192h = -1L;
        setContainedBinding(this.f9186d);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f9191g = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
