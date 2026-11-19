package com.friday.document.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.friday.document.R$id;
import com.friday.document.R$layout;
import p256n2.AbstractC10314a;

/* loaded from: classes3.dex */
public class FragmentShareByTeacherBindingImpl extends FragmentShareByTeacherBinding {

    /* renamed from: i */
    public static final ViewDataBinding.IncludedLayouts f6435i;

    /* renamed from: j */
    public static final SparseIntArray f6436j;

    /* renamed from: g */
    public final FrameLayout f6437g;

    /* renamed from: h */
    public long f6438h;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(5);
        f6435i = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"layout_empty_no_share"}, new int[]{2}, new int[]{R$layout.layout_empty_no_share});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6436j = sparseIntArray;
        sparseIntArray.put(R$id.rv_share, 3);
        sparseIntArray.put(R$id.file_list_container, 4);
    }

    public FragmentShareByTeacherBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, f6435i, f6436j));
    }

    /* renamed from: a */
    public final boolean m5525a(LayoutEmptyNoShareBinding layoutEmptyNoShareBinding, int i10) {
        if (i10 != AbstractC10314a.f24589a) {
            return false;
        }
        synchronized (this) {
            this.f6438h |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.f6438h = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.f6431c);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f6438h != 0) {
                    return true;
                }
                return this.f6431c.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6438h = 2L;
        }
        this.f6431c.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return m5525a((LayoutEmptyNoShareBinding) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f6431c.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        return true;
    }

    public FragmentShareByTeacherBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (LayoutEmptyNoShareBinding) objArr[2], (FragmentContainerView) objArr[4], (SwipeRefreshLayout) objArr[1], (RecyclerView) objArr[3]);
        this.f6438h = -1L;
        setContainedBinding(this.f6431c);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f6437g = frameLayout;
        frameLayout.setTag(null);
        this.f6433e.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
