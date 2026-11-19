package com.friday.document.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.friday.document.R$id;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes3.dex */
public class FragmentStudentShareBindingImpl extends FragmentStudentShareBinding {

    /* renamed from: j */
    public static final ViewDataBinding.IncludedLayouts f6456j = null;

    /* renamed from: k */
    public static final SparseIntArray f6457k;

    /* renamed from: h */
    public final ConstraintLayout f6458h;

    /* renamed from: i */
    public long f6459i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6457k = sparseIntArray;
        sparseIntArray.put(R$id.ll_left, 1);
        sparseIntArray.put(R$id.tab_layout, 2);
        sparseIntArray.put(R$id.iv_search, 3);
        sparseIntArray.put(R$id.view_pager, 4);
        sparseIntArray.put(R$id.preview_container, 5);
    }

    public FragmentStudentShareBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, f6456j, f6457k));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6459i = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6459i != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6459i = 1L;
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

    public FragmentStudentShareBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[3], (LinearLayout) objArr[1], (FrameLayout) objArr[5], (TabLayout) objArr[2], (ViewPager2) objArr[4]);
        this.f6459i = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f6458h = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
