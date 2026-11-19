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
public class RecyclePreviewFragmentBindingImpl extends RecyclePreviewFragmentBinding {

    /* renamed from: h */
    public static final ViewDataBinding.IncludedLayouts f6622h;

    /* renamed from: i */
    public static final SparseIntArray f6623i;

    /* renamed from: f */
    public final FrameLayout f6624f;

    /* renamed from: g */
    public long f6625g;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(4);
        f6622h = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"layout_share_note_preview", "layout_note_preview_others", "layout_empty_preview"}, new int[]{1, 2, 3}, new int[]{R$layout.layout_share_note_preview, R$layout.layout_note_preview_others, R$layout.layout_empty_preview});
        f6623i = null;
    }

    public RecyclePreviewFragmentBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, f6622h, f6623i));
    }

    /* renamed from: a */
    private boolean m5554a(LayoutEmptyPreviewBinding layoutEmptyPreviewBinding, int i10) {
        if (i10 != AbstractC10314a.f24589a) {
            return false;
        }
        synchronized (this) {
            this.f6625g |= 1;
        }
        return true;
    }

    /* renamed from: c */
    private boolean m5555c(LayoutNotePreviewOthersBinding layoutNotePreviewOthersBinding, int i10) {
        if (i10 != AbstractC10314a.f24589a) {
            return false;
        }
        synchronized (this) {
            this.f6625g |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6625g = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.f6621e);
        ViewDataBinding.executeBindingsOn(this.f6620d);
        ViewDataBinding.executeBindingsOn(this.f6619c);
    }

    /* renamed from: g */
    public final boolean m5556g(LayoutShareNotePreviewBinding layoutShareNotePreviewBinding, int i10) {
        if (i10 != AbstractC10314a.f24589a) {
            return false;
        }
        synchronized (this) {
            this.f6625g |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f6625g != 0) {
                    return true;
                }
                return this.f6621e.hasPendingBindings() || this.f6620d.hasPendingBindings() || this.f6619c.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6625g = 8L;
        }
        this.f6621e.invalidateAll();
        this.f6620d.invalidateAll();
        this.f6619c.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return m5554a((LayoutEmptyPreviewBinding) obj, i11);
        }
        if (i10 == 1) {
            return m5556g((LayoutShareNotePreviewBinding) obj, i11);
        }
        if (i10 != 2) {
            return false;
        }
        return m5555c((LayoutNotePreviewOthersBinding) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f6621e.setLifecycleOwner(lifecycleOwner);
        this.f6620d.setLifecycleOwner(lifecycleOwner);
        this.f6619c.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        return true;
    }

    public RecyclePreviewFragmentBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3, (LayoutEmptyPreviewBinding) objArr[3], (LayoutNotePreviewOthersBinding) objArr[2], (LayoutShareNotePreviewBinding) objArr[1]);
        this.f6625g = -1L;
        setContainedBinding(this.f6619c);
        setContainedBinding(this.f6620d);
        setContainedBinding(this.f6621e);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f6624f = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
