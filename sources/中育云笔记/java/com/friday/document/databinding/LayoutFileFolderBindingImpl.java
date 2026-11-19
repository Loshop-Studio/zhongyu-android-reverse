package com.friday.document.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.LiveData;
import com.friday.document.R$id;
import p215k2.AbstractC9794l;
import p256n2.AbstractC10314a;

/* loaded from: classes3.dex */
public class LayoutFileFolderBindingImpl extends LayoutFileFolderBinding {

    /* renamed from: r */
    public static final ViewDataBinding.IncludedLayouts f6563r = null;

    /* renamed from: s */
    public static final SparseIntArray f6564s;

    /* renamed from: o */
    public final LinearLayoutCompat f6565o;

    /* renamed from: p */
    public final LinearLayoutCompat f6566p;

    /* renamed from: q */
    public long f6567q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6564s = sparseIntArray;
        sparseIntArray.put(R$id.iv_back, 5);
        sparseIntArray.put(R$id.tv_model_name, 6);
        sparseIntArray.put(R$id.iv_search, 7);
        sparseIntArray.put(R$id.iv_more, 8);
        sparseIntArray.put(R$id.iv_sync, 9);
        sparseIntArray.put(R$id.tv_cancel, 10);
        sparseIntArray.put(R$id.fragment_list, 11);
    }

    public LayoutFileFolderBindingImpl(DataBindingComponent dataBindingComponent, View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 12, f6563r, f6564s));
    }

    /* renamed from: g */
    private boolean m5547g(LiveData liveData, int i10) {
        if (i10 != AbstractC10314a.f24589a) {
            return false;
        }
        synchronized (this) {
            this.f6567q |= 2;
        }
        return true;
    }

    /* renamed from: k */
    private boolean m5548k(LiveData liveData, int i10) {
        if (i10 != AbstractC10314a.f24589a) {
            return false;
        }
        synchronized (this) {
            this.f6567q |= 1;
        }
        return true;
    }

    @Override // com.friday.document.databinding.LayoutFileFolderBinding
    /* renamed from: a */
    public void mo5545a(LiveData liveData) {
        updateLiveDataRegistration(1, liveData);
        this.f6561m = liveData;
        synchronized (this) {
            this.f6567q |= 2;
        }
        notifyPropertyChanged(AbstractC10314a.f24590b);
        super.requestRebind();
    }

    @Override // com.friday.document.databinding.LayoutFileFolderBinding
    /* renamed from: c */
    public void mo5546c(LiveData liveData) {
        updateLiveDataRegistration(0, liveData);
        this.f6562n = liveData;
        synchronized (this) {
            this.f6567q |= 1;
        }
        notifyPropertyChanged(AbstractC10314a.f24591c);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        boolean zSafeUnbox;
        boolean z10;
        synchronized (this) {
            j10 = this.f6567q;
            this.f6567q = 0L;
        }
        LiveData liveData = this.f6562n;
        LiveData liveData2 = this.f6561m;
        long j11 = 5 & j10;
        boolean zSafeUnbox2 = false;
        if (j11 != 0) {
            zSafeUnbox = ViewDataBinding.safeUnbox(liveData != null ? (Boolean) liveData.getValue() : null);
        } else {
            zSafeUnbox = false;
        }
        long j12 = j10 & 6;
        if (j12 != 0) {
            boolean zSafeUnbox3 = ViewDataBinding.safeUnbox(liveData2 != null ? (Boolean) liveData2.getValue() : null);
            zSafeUnbox2 = ViewDataBinding.safeUnbox(Boolean.valueOf(!zSafeUnbox3));
            z10 = zSafeUnbox3;
        } else {
            z10 = false;
        }
        if (j12 != 0) {
            AbstractC9794l.m19784a(this.f6566p, zSafeUnbox2);
            AbstractC9794l.m19784a(this.f6556h, z10);
        }
        if (j11 != 0) {
            this.f6558j.setEnabled(zSafeUnbox);
            this.f6560l.setEnabled(zSafeUnbox);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6567q != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6567q = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return m5548k((LiveData) obj, i11);
        }
        if (i10 != 1) {
            return false;
        }
        return m5547g((LiveData) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        if (AbstractC10314a.f24591c == i10) {
            mo5546c((LiveData) obj);
            return true;
        }
        if (AbstractC10314a.f24590b != i10) {
            return false;
        }
        mo5545a((LiveData) obj);
        return true;
    }

    public LayoutFileFolderBindingImpl(DataBindingComponent dataBindingComponent, View[] viewArr, Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 2, (FragmentContainerView) objArr[11], (AppCompatImageView) objArr[5], (AppCompatImageView) objArr[8], (AppCompatImageView) objArr[7], (AppCompatImageView) objArr[9], (LinearLayoutCompat) objArr[2], (AppCompatTextView) objArr[10], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[6], (AppCompatTextView) objArr[3]);
        this.f6567q = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.f6565o = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) objArr[1];
        this.f6566p = linearLayoutCompat2;
        linearLayoutCompat2.setTag(null);
        this.f6556h.setTag(null);
        this.f6558j.setTag(null);
        this.f6560l.setTag(null);
        setRootTag(viewArr);
        invalidateAll();
    }
}
