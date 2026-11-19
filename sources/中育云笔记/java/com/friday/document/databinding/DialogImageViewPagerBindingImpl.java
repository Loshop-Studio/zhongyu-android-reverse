package com.friday.document.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.friday.document.R$id;

/* loaded from: classes3.dex */
public class DialogImageViewPagerBindingImpl extends DialogImageViewPagerBinding {

    /* renamed from: g */
    public static final ViewDataBinding.IncludedLayouts f6338g = null;

    /* renamed from: h */
    public static final SparseIntArray f6339h;

    /* renamed from: e */
    public final FrameLayout f6340e;

    /* renamed from: f */
    public long f6341f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6339h = sparseIntArray;
        sparseIntArray.put(R$id.view_pager, 1);
        sparseIntArray.put(R$id.tv_finish, 2);
    }

    public DialogImageViewPagerBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f6338g, f6339h));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6341f = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6341f != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6341f = 1L;
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

    public DialogImageViewPagerBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[2], (ViewPager2) objArr[1]);
        this.f6341f = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f6340e = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
