package com.friday.document.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.LifecycleOwner;
import com.friday.document.R$id;
import com.friday.document.R$layout;
import p256n2.AbstractC10314a;

/* loaded from: classes3.dex */
public class SharePreviewFragmentBindingImpl extends SharePreviewFragmentBinding {

    /* renamed from: g */
    public static final ViewDataBinding.IncludedLayouts f6628g;

    /* renamed from: h */
    public static final SparseIntArray f6629h;

    /* renamed from: e */
    public final LinearLayoutCompat f6630e;

    /* renamed from: f */
    public long f6631f;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(3);
        f6628g = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"include_preview_title"}, new int[]{1}, new int[]{R$layout.include_preview_title});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6629h = sparseIntArray;
        sparseIntArray.put(R$id.fragment_container, 2);
    }

    public SharePreviewFragmentBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f6628g, f6629h));
    }

    /* renamed from: a */
    public final boolean m5557a(IncludePreviewTitleBinding includePreviewTitleBinding, int i10) {
        if (i10 != AbstractC10314a.f24589a) {
            return false;
        }
        synchronized (this) {
            this.f6631f |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6631f = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.f6627d);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f6631f != 0) {
                    return true;
                }
                return this.f6627d.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6631f = 2L;
        }
        this.f6627d.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return m5557a((IncludePreviewTitleBinding) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f6627d.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        return true;
    }

    public SharePreviewFragmentBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (FragmentContainerView) objArr[2], (IncludePreviewTitleBinding) objArr[1]);
        this.f6631f = -1L;
        setContainedBinding(this.f6627d);
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.f6630e = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
