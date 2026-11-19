package com.friday.document.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.friday.document.R$layout;
import p256n2.AbstractC10314a;

/* loaded from: classes3.dex */
public class PreviewFragmentBindingImpl extends PreviewFragmentBinding {

    /* renamed from: h */
    public static final ViewDataBinding.IncludedLayouts f6615h;

    /* renamed from: i */
    public static final SparseIntArray f6616i;

    /* renamed from: f */
    public final ConstraintLayout f6617f;

    /* renamed from: g */
    public long f6618g;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(4);
        f6615h = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"layout_note_preview", "layout_note_preview_others", "layout_empty_preview"}, new int[]{1, 2, 3}, new int[]{R$layout.layout_note_preview, R$layout.layout_note_preview_others, R$layout.layout_empty_preview});
        f6616i = null;
    }

    public PreviewFragmentBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, f6615h, f6616i));
    }

    /* renamed from: a */
    private boolean m5551a(LayoutEmptyPreviewBinding layoutEmptyPreviewBinding, int i10) {
        if (i10 != AbstractC10314a.f24589a) {
            return false;
        }
        synchronized (this) {
            this.f6618g |= 2;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean m5552c(LayoutNotePreviewBinding layoutNotePreviewBinding, int i10) {
        if (i10 != AbstractC10314a.f24589a) {
            return false;
        }
        synchronized (this) {
            this.f6618g |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6618g = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.f6613d);
        ViewDataBinding.executeBindingsOn(this.f6614e);
        ViewDataBinding.executeBindingsOn(this.f6612c);
    }

    /* renamed from: g */
    public final boolean m5553g(LayoutNotePreviewOthersBinding layoutNotePreviewOthersBinding, int i10) {
        if (i10 != AbstractC10314a.f24589a) {
            return false;
        }
        synchronized (this) {
            this.f6618g |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f6618g != 0) {
                    return true;
                }
                return this.f6613d.hasPendingBindings() || this.f6614e.hasPendingBindings() || this.f6612c.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6618g = 8L;
        }
        this.f6613d.invalidateAll();
        this.f6614e.invalidateAll();
        this.f6612c.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return m5552c((LayoutNotePreviewBinding) obj, i11);
        }
        if (i10 == 1) {
            return m5551a((LayoutEmptyPreviewBinding) obj, i11);
        }
        if (i10 != 2) {
            return false;
        }
        return m5553g((LayoutNotePreviewOthersBinding) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f6613d.setLifecycleOwner(lifecycleOwner);
        this.f6614e.setLifecycleOwner(lifecycleOwner);
        this.f6612c.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        return true;
    }

    public PreviewFragmentBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3, (LayoutEmptyPreviewBinding) objArr[3], (LayoutNotePreviewBinding) objArr[1], (LayoutNotePreviewOthersBinding) objArr[2]);
        this.f6618g = -1L;
        setContainedBinding(this.f6612c);
        setContainedBinding(this.f6613d);
        setContainedBinding(this.f6614e);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f6617f = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
