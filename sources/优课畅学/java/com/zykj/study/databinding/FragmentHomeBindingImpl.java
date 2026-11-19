package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.zykj.study.R$id;
import com.zykj.study.viewmodels.HomeViewModel;
import p231r4.ViewOnClickListenerC9912a;

/* loaded from: classes3.dex */
public class FragmentHomeBindingImpl extends FragmentHomeBinding implements ViewOnClickListenerC9912a.a {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;

    @Nullable
    private final View.OnClickListener mCallback3;

    @Nullable
    private final View.OnClickListener mCallback4;

    @Nullable
    private final View.OnClickListener mCallback5;

    @Nullable
    private final View.OnClickListener mCallback6;
    private long mDirtyFlags;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.iv_find, 5);
        sparseIntArray.put(R$id.tv_find, 6);
        sparseIntArray.put(R$id.iv_study, 7);
        sparseIntArray.put(R$id.tv_study, 8);
        sparseIntArray.put(R$id.iv_message, 9);
        sparseIntArray.put(R$id.tv_message, 10);
        sparseIntArray.put(R$id.iv_my, 11);
        sparseIntArray.put(R$id.tv_my, 12);
        sparseIntArray.put(R$id.viewPager, 13);
    }

    public FragmentHomeBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, sIncludes, sViewsWithIds));
    }

    @Override // p231r4.ViewOnClickListenerC9912a.a
    public final void _internalCallbackOnClick(int i10, View view) {
        HomeViewModel homeViewModel;
        if (i10 == 1) {
            HomeViewModel homeViewModel2 = this.mViewModel;
            if (homeViewModel2 != null) {
                homeViewModel2.m12179f(0);
                return;
            }
            return;
        }
        if (i10 == 2) {
            HomeViewModel homeViewModel3 = this.mViewModel;
            if (homeViewModel3 != null) {
                homeViewModel3.m12179f(1);
                return;
            }
            return;
        }
        if (i10 != 3) {
            if (i10 == 4 && (homeViewModel = this.mViewModel) != null) {
                homeViewModel.m12179f(3);
                return;
            }
            return;
        }
        HomeViewModel homeViewModel4 = this.mViewModel;
        if (homeViewModel4 != null) {
            homeViewModel4.m12179f(2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        if ((j10 & 2) != 0) {
            this.llFind.setOnClickListener(this.mCallback3);
            this.llMessage.setOnClickListener(this.mCallback5);
            this.llMy.setOnClickListener(this.mCallback6);
            this.llStudy.setOnClickListener(this.mCallback4);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.mDirtyFlags != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (59 != i10) {
            return false;
        }
        setViewModel((HomeViewModel) obj);
        return true;
    }

    @Override // com.zykj.study.databinding.FragmentHomeBinding
    public void setViewModel(@Nullable HomeViewModel homeViewModel) {
        this.mViewModel = homeViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(59);
        super.requestRebind();
    }

    private FragmentHomeBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayout) objArr[0], (ImageView) objArr[5], (ImageView) objArr[9], (ImageView) objArr[11], (ImageView) objArr[7], (LinearLayout) objArr[1], (LinearLayout) objArr[3], (LinearLayout) objArr[4], (LinearLayout) objArr[2], (TextView) objArr[6], (TextView) objArr[10], (TextView) objArr[12], (TextView) objArr[8], (ViewPager2) objArr[13]);
        this.mDirtyFlags = -1L;
        this.fragmentHome.setTag(null);
        this.llFind.setTag(null);
        this.llMessage.setTag(null);
        this.llMy.setTag(null);
        this.llStudy.setTag(null);
        setRootTag(view);
        this.mCallback5 = new ViewOnClickListenerC9912a(this, 3);
        this.mCallback6 = new ViewOnClickListenerC9912a(this, 4);
        this.mCallback3 = new ViewOnClickListenerC9912a(this, 1);
        this.mCallback4 = new ViewOnClickListenerC9912a(this, 2);
        invalidateAll();
    }
}
