package com.friday.document.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.friday.document.R$id;
import com.friday.document.R$layout;
import p256n2.AbstractC10314a;

/* loaded from: classes3.dex */
public class DocumentFragmentBindingImpl extends DocumentFragmentBinding {

    /* renamed from: i */
    public static final ViewDataBinding.IncludedLayouts f6362i;

    /* renamed from: j */
    public static final SparseIntArray f6363j;

    /* renamed from: g */
    public final LinearLayoutCompat f6364g;

    /* renamed from: h */
    public long f6365h;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(3);
        f6362i = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"layout_file_browser"}, new int[]{1}, new int[]{R$layout.layout_file_browser});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6363j = sparseIntArray;
        sparseIntArray.put(R$id.fragment_preview, 2);
    }

    public DocumentFragmentBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f6362i, f6363j));
    }

    @Override // com.friday.document.databinding.DocumentFragmentBinding
    /* renamed from: a */
    public void mo5514a(LiveData liveData) {
        updateLiveDataRegistration(1, liveData);
        this.f6360e = liveData;
        synchronized (this) {
            this.f6365h |= 2;
        }
        notifyPropertyChanged(AbstractC10314a.f24590b);
        super.requestRebind();
    }

    @Override // com.friday.document.databinding.DocumentFragmentBinding
    /* renamed from: c */
    public void mo5515c(LiveData liveData) {
        updateLiveDataRegistration(0, liveData);
        this.f6361f = liveData;
        synchronized (this) {
            this.f6365h |= 1;
        }
        notifyPropertyChanged(AbstractC10314a.f24591c);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        synchronized (this) {
            j10 = this.f6365h;
            this.f6365h = 0L;
        }
        LiveData liveData = this.f6361f;
        LiveData liveData2 = this.f6360e;
        long j11 = 9 & j10;
        if (j11 != 0 && liveData != null) {
        }
        long j12 = j10 & 10;
        if (j12 != 0 && liveData2 != null) {
        }
        if (j12 != 0) {
            this.f6359d.mo5541a(liveData2);
        }
        if (j11 != 0) {
            this.f6359d.mo5542c(liveData);
        }
        ViewDataBinding.executeBindingsOn(this.f6359d);
    }

    /* renamed from: g */
    public final boolean m5516g(LiveData liveData, int i10) {
        if (i10 != AbstractC10314a.f24589a) {
            return false;
        }
        synchronized (this) {
            this.f6365h |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f6365h != 0) {
                    return true;
                }
                return this.f6359d.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6365h = 8L;
        }
        this.f6359d.invalidateAll();
        requestRebind();
    }

    /* renamed from: k */
    public final boolean m5517k(LiveData liveData, int i10) {
        if (i10 != AbstractC10314a.f24589a) {
            return false;
        }
        synchronized (this) {
            this.f6365h |= 1;
        }
        return true;
    }

    /* renamed from: m */
    public final boolean m5518m(LayoutFileBrowserBinding layoutFileBrowserBinding, int i10) {
        if (i10 != AbstractC10314a.f24589a) {
            return false;
        }
        synchronized (this) {
            this.f6365h |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return m5517k((LiveData) obj, i11);
        }
        if (i10 == 1) {
            return m5516g((LiveData) obj, i11);
        }
        if (i10 != 2) {
            return false;
        }
        return m5518m((LayoutFileBrowserBinding) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f6359d.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        if (AbstractC10314a.f24591c == i10) {
            mo5515c((LiveData) obj);
            return true;
        }
        if (AbstractC10314a.f24590b != i10) {
            return false;
        }
        mo5514a((LiveData) obj);
        return true;
    }

    public DocumentFragmentBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3, (FrameLayout) objArr[2], (LayoutFileBrowserBinding) objArr[1]);
        this.f6365h = -1L;
        setContainedBinding(this.f6359d);
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.f6364g = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
