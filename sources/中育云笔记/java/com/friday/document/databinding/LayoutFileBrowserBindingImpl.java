package com.friday.document.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.friday.document.R$id;
import p215k2.AbstractC9794l;
import p256n2.AbstractC10314a;

/* loaded from: classes3.dex */
public class LayoutFileBrowserBindingImpl extends LayoutFileBrowserBinding {

    /* renamed from: t */
    public static final ViewDataBinding.IncludedLayouts f6546t = null;

    /* renamed from: u */
    public static final SparseIntArray f6547u;

    /* renamed from: q */
    public final LinearLayoutCompat f6548q;

    /* renamed from: r */
    public final LinearLayoutCompat f6549r;

    /* renamed from: s */
    public long f6550s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6547u = sparseIntArray;
        sparseIntArray.put(R$id.iv_back, 5);
        sparseIntArray.put(R$id.tv_model_name, 6);
        sparseIntArray.put(R$id.iv_search, 7);
        sparseIntArray.put(R$id.iv_more, 8);
        sparseIntArray.put(R$id.iv_sync, 9);
        sparseIntArray.put(R$id.tv_cancel, 10);
        sparseIntArray.put(R$id.refreshLayout, 11);
        sparseIntArray.put(R$id.recycler_view, 12);
        sparseIntArray.put(R$id.empty_view, 13);
    }

    public LayoutFileBrowserBindingImpl(DataBindingComponent dataBindingComponent, View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 14, f6546t, f6547u));
    }

    /* renamed from: g */
    private boolean m5543g(LiveData liveData, int i10) {
        if (i10 != AbstractC10314a.f24589a) {
            return false;
        }
        synchronized (this) {
            this.f6550s |= 2;
        }
        return true;
    }

    /* renamed from: k */
    private boolean m5544k(LiveData liveData, int i10) {
        if (i10 != AbstractC10314a.f24589a) {
            return false;
        }
        synchronized (this) {
            this.f6550s |= 1;
        }
        return true;
    }

    @Override // com.friday.document.databinding.LayoutFileBrowserBinding
    /* renamed from: a */
    public void mo5541a(LiveData liveData) {
        updateLiveDataRegistration(1, liveData);
        this.f6544o = liveData;
        synchronized (this) {
            this.f6550s |= 2;
        }
        notifyPropertyChanged(AbstractC10314a.f24590b);
        super.requestRebind();
    }

    @Override // com.friday.document.databinding.LayoutFileBrowserBinding
    /* renamed from: c */
    public void mo5542c(LiveData liveData) {
        updateLiveDataRegistration(0, liveData);
        this.f6545p = liveData;
        synchronized (this) {
            this.f6550s |= 1;
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
            j10 = this.f6550s;
            this.f6550s = 0L;
        }
        LiveData liveData = this.f6545p;
        LiveData liveData2 = this.f6544o;
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
            AbstractC9794l.m19784a(this.f6549r, zSafeUnbox2);
            AbstractC9794l.m19784a(this.f6537h, z10);
        }
        if (j11 != 0) {
            this.f6541l.setEnabled(zSafeUnbox);
            this.f6543n.setEnabled(zSafeUnbox);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f6550s != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f6550s = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return m5544k((LiveData) obj, i11);
        }
        if (i10 != 1) {
            return false;
        }
        return m5543g((LiveData) obj, i11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, Object obj) {
        if (AbstractC10314a.f24591c == i10) {
            mo5542c((LiveData) obj);
            return true;
        }
        if (AbstractC10314a.f24590b != i10) {
            return false;
        }
        mo5541a((LiveData) obj);
        return true;
    }

    public LayoutFileBrowserBindingImpl(DataBindingComponent dataBindingComponent, View[] viewArr, Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 2, (TextView) objArr[13], (AppCompatImageView) objArr[5], (AppCompatImageView) objArr[8], (AppCompatImageView) objArr[7], (AppCompatImageView) objArr[9], (LinearLayoutCompat) objArr[2], (RecyclerView) objArr[12], (SwipeRefreshLayout) objArr[11], (AppCompatTextView) objArr[10], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[6], (AppCompatTextView) objArr[3]);
        this.f6550s = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.f6548q = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) objArr[1];
        this.f6549r = linearLayoutCompat2;
        linearLayoutCompat2.setTag(null);
        this.f6537h.setTag(null);
        this.f6541l.setTag(null);
        this.f6543n.setTag(null);
        setRootTag(viewArr);
        invalidateAll();
    }
}
