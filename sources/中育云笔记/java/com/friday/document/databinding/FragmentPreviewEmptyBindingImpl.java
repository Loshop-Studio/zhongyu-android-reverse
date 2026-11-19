package com.friday.document.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.friday.document.R$layout;
import p256n2.AbstractC10314a;

/* loaded from: classes3.dex */
public class FragmentPreviewEmptyBindingImpl extends FragmentPreviewEmptyBinding {

    /* renamed from: f */
    public static final ViewDataBinding.IncludedLayouts f6382f;

    /* renamed from: g */
    public static final SparseIntArray f6383g;

    /* renamed from: d */
    public final FrameLayout f6384d;

    /* renamed from: e */
    public long f6385e;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(2);
        f6382f = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"layout_empty_preview"}, new int[]{1}, new int[]{R$layout.layout_empty_preview});
        f6383g = null;
    }

    public FragmentPreviewEmptyBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, f6382f, f6383g));
    }

    /* renamed from: a */
    public final boolean m5524a(LayoutEmptyPreviewBinding layoutEmptyPreviewBinding, int i10) {
        if (i10 != AbstractC10314a.f24589a) {
            return false;
        }
        synchronized (this) {
            this.f6385e |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6385e = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.f6381c);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f6385e != 0) {
                    return true;
                }
                return this.f6381c.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6385e = 2L;
        }
        this.f6381c.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return m5524a((LayoutEmptyPreviewBinding) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f6381c.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        return true;
    }

    public FragmentPreviewEmptyBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (LayoutEmptyPreviewBinding) objArr[1]);
        this.f6385e = -1L;
        setContainedBinding(this.f6381c);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f6384d = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
