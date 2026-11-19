package com.friday.document.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.friday.document.R$id;
import com.friday.document.R$layout;
import p256n2.AbstractC10314a;

/* loaded from: classes3.dex */
public class FragmentShareFileBindingImpl extends FragmentShareFileBinding {

    /* renamed from: m */
    public static final ViewDataBinding.IncludedLayouts f6446m;

    /* renamed from: n */
    public static final SparseIntArray f6447n;

    /* renamed from: j */
    public final LinearLayout f6448j;

    /* renamed from: k */
    public final FrameLayout f6449k;

    /* renamed from: l */
    public long f6450l;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(9);
        f6446m = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"layout_empty_no_share"}, new int[]{2}, new int[]{R$layout.layout_empty_no_share});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6447n = sparseIntArray;
        sparseIntArray.put(R$id.menu, 3);
        sparseIntArray.put(R$id.iv_back, 4);
        sparseIntArray.put(R$id.tv_folder_name, 5);
        sparseIntArray.put(R$id.iv_more, 6);
        sparseIntArray.put(R$id.refresh_layout, 7);
        sparseIntArray.put(R$id.rv_share, 8);
    }

    public FragmentShareFileBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, f6446m, f6447n));
    }

    /* renamed from: a */
    private boolean m5526a(LayoutEmptyNoShareBinding layoutEmptyNoShareBinding, int i10) {
        if (i10 != AbstractC10314a.f24589a) {
            return false;
        }
        synchronized (this) {
            this.f6450l |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6450l = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.f6439c);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f6450l != 0) {
                    return true;
                }
                return this.f6439c.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6450l = 2L;
        }
        this.f6439c.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return m5526a((LayoutEmptyNoShareBinding) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f6439c.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        return true;
    }

    public FragmentShareFileBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (LayoutEmptyNoShareBinding) objArr[2], (ImageView) objArr[4], (ImageView) objArr[6], (LinearLayoutCompat) objArr[3], (SwipeRefreshLayout) objArr[7], (RecyclerView) objArr[8], (TextView) objArr[5]);
        this.f6450l = -1L;
        setContainedBinding(this.f6439c);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f6448j = linearLayout;
        linearLayout.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[1];
        this.f6449k = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
