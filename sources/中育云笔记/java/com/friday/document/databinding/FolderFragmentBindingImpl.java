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
public class FolderFragmentBindingImpl extends FolderFragmentBinding {

    /* renamed from: i */
    public static final ViewDataBinding.IncludedLayouts f6370i;

    /* renamed from: j */
    public static final SparseIntArray f6371j;

    /* renamed from: g */
    public final LinearLayoutCompat f6372g;

    /* renamed from: h */
    public long f6373h;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(3);
        f6370i = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"layout_file_folder"}, new int[]{1}, new int[]{R$layout.layout_file_folder});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6371j = sparseIntArray;
        sparseIntArray.put(R$id.fragment_preview, 2);
    }

    public FolderFragmentBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, f6370i, f6371j));
    }

    /* renamed from: g */
    private boolean m5521g(LiveData liveData, int i10) {
        if (i10 != AbstractC10314a.f24589a) {
            return false;
        }
        synchronized (this) {
            this.f6373h |= 4;
        }
        return true;
    }

    /* renamed from: k */
    private boolean m5522k(LiveData liveData, int i10) {
        if (i10 != AbstractC10314a.f24589a) {
            return false;
        }
        synchronized (this) {
            this.f6373h |= 1;
        }
        return true;
    }

    @Override // com.friday.document.databinding.FolderFragmentBinding
    /* renamed from: a */
    public void mo5519a(LiveData liveData) {
        updateLiveDataRegistration(2, liveData);
        this.f6368e = liveData;
        synchronized (this) {
            this.f6373h |= 4;
        }
        notifyPropertyChanged(AbstractC10314a.f24590b);
        super.requestRebind();
    }

    @Override // com.friday.document.databinding.FolderFragmentBinding
    /* renamed from: c */
    public void mo5520c(LiveData liveData) {
        updateLiveDataRegistration(0, liveData);
        this.f6369f = liveData;
        synchronized (this) {
            this.f6373h |= 1;
        }
        notifyPropertyChanged(AbstractC10314a.f24591c);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        synchronized (this) {
            j10 = this.f6373h;
            this.f6373h = 0L;
        }
        LiveData liveData = this.f6369f;
        LiveData liveData2 = this.f6368e;
        long j11 = 9 & j10;
        if (j11 != 0 && liveData != null) {
        }
        long j12 = j10 & 12;
        if (j12 != 0 && liveData2 != null) {
        }
        if (j12 != 0) {
            this.f6367d.mo5545a(liveData2);
        }
        if (j11 != 0) {
            this.f6367d.mo5546c(liveData);
        }
        ViewDataBinding.executeBindingsOn(this.f6367d);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f6373h != 0) {
                    return true;
                }
                return this.f6367d.hasPendingBindings();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6373h = 8L;
        }
        this.f6367d.invalidateAll();
        requestRebind();
    }

    /* renamed from: m */
    public final boolean m5523m(LayoutFileFolderBinding layoutFileFolderBinding, int i10) {
        if (i10 != AbstractC10314a.f24589a) {
            return false;
        }
        synchronized (this) {
            this.f6373h |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return m5522k((LiveData) obj, i11);
        }
        if (i10 == 1) {
            return m5523m((LayoutFileFolderBinding) obj, i11);
        }
        if (i10 != 2) {
            return false;
        }
        return m5521g((LiveData) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f6367d.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        if (AbstractC10314a.f24591c == i10) {
            mo5520c((LiveData) obj);
            return true;
        }
        if (AbstractC10314a.f24590b != i10) {
            return false;
        }
        mo5519a((LiveData) obj);
        return true;
    }

    public FolderFragmentBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 3, (FrameLayout) objArr[2], (LayoutFileFolderBinding) objArr[1]);
        this.f6373h = -1L;
        setContainedBinding(this.f6367d);
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.f6372g = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
