package com.zykj.huiwei.launcher.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LiveData;
import com.zykj.huiwei.launcher.bean.resp.TodoResp;
import com.zykj.huiwei.launcher.p035ui.view.NoPaddingTextView;
import com.zykj.huiwei.launcher.viewmodels.HomeViewModel;
import com.zykj.manage.R;
import p078i4.AbstractC6538h;

/* loaded from: classes4.dex */
public class HwIncludeHomeAppBindingImpl extends HwIncludeHomeAppBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.tvNewArticleTitle, 14);
        sparseIntArray.put(R.id.tvNewReplayTitle, 15);
    }

    public HwIncludeHomeAppBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 16, sIncludes, sViewsWithIds));
    }

    private boolean onChangeVmTodoResp(LiveData<TodoResp> liveData, int i6) {
        if (i6 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j6;
        long j7;
        boolean z6;
        int i6;
        int unReplySpecialCount;
        boolean z7;
        int i7;
        boolean z8;
        String str;
        String str2;
        String str3;
        int quoraCount;
        synchronized (this) {
            j6 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        HomeViewModel homeViewModel = this.mVm;
        View.OnClickListener onClickListener = this.mClickListener;
        long j8 = j6 & 11;
        int i8 = 0;
        if (j8 != 0) {
            LiveData liveDataM6086G = homeViewModel != null ? homeViewModel.getTodoResp() : null;
            updateLiveDataRegistration(0, liveDataM6086G);
            TodoResp todoResp = liveDataM6086G != null ? (TodoResp) liveDataM6086G.getValue() : null;
            if (todoResp != null) {
                unReplySpecialCount = todoResp.getUnReplySpecialCount();
                int unReadSpecialCount = todoResp.getUnReadSpecialCount();
                quoraCount = todoResp.getQuoraCount();
                i8 = unReadSpecialCount;
            } else {
                quoraCount = 0;
                unReplySpecialCount = 0;
            }
            j7 = 11;
            z7 = unReplySpecialCount > 99;
            z8 = i8 > 99;
            boolean z9 = quoraCount > 99;
            if (j8 != 0) {
                j6 = z7 ? j6 | 32 : j6 | 16;
            }
            if ((j6 & 11) != 0) {
                j6 = z8 ? j6 | 128 : j6 | 64;
            }
            if ((j6 & 11) != 0) {
                j6 = z9 ? j6 | 512 : j6 | 256;
            }
            int i9 = i8;
            i6 = quoraCount;
            z6 = z9;
            i7 = i9;
        } else {
            j7 = 11;
            z6 = false;
            i6 = 0;
            unReplySpecialCount = 0;
            z7 = false;
            i7 = 0;
            z8 = false;
        }
        long j9 = j6 & 12;
        String strValueOf = (j6 & 256) != 0 ? String.valueOf(i6) : null;
        String strValueOf2 = (j6 & 16) != 0 ? String.valueOf(unReplySpecialCount) : null;
        String strValueOf3 = (j6 & 64) != 0 ? String.valueOf(i7) : null;
        long j10 = j6 & j7;
        if (j10 != 0) {
            String str4 = z7 ? "99+" : strValueOf2;
            str2 = z8 ? "99+" : strValueOf3;
            str = z6 ? "99+" : strValueOf;
            str3 = str4;
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        if (j9 != 0) {
            AbstractC6538h.m7324g(this.ImgAnswer, onClickListener);
            AbstractC6538h.m7324g(this.tvBetterClass, onClickListener);
            AbstractC6538h.m7324g(this.tvGallery, onClickListener);
            AbstractC6538h.m7324g(this.tvNote, onClickListener);
            AbstractC6538h.m7324g(this.tvOnline, onClickListener);
            AbstractC6538h.m7324g(this.tvWrongBook, onClickListener);
        }
        if (j10 != 0) {
            TextViewBindingAdapter.setText(this.tvNewArticle, str2);
            TextViewBindingAdapter.setText(this.tvNewQuora, str);
            TextViewBindingAdapter.setText(this.tvNewReplay, str3);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.mDirtyFlags != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 8L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i6, Object obj, int i7) {
        if (i6 != 0) {
            return false;
        }
        return onChangeVmTodoResp((LiveData) obj, i7);
    }

    @Override // com.zykj.huiwei.launcher.databinding.HwIncludeHomeAppBinding
    public void setClickListener(@Nullable View.OnClickListener onClickListener) {
        this.mClickListener = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i6, @Nullable Object obj) {
        if (7 == i6) {
            setVm((HomeViewModel) obj);
            return true;
        }
        if (2 != i6) {
            return false;
        }
        setClickListener((View.OnClickListener) obj);
        return true;
    }

    @Override // com.zykj.huiwei.launcher.databinding.HwIncludeHomeAppBinding
    public void setVm(@Nullable HomeViewModel homeViewModel) {
        this.mVm = homeViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    private HwIncludeHomeAppBindingImpl(DataBindingComponent dataBindingComponent, View[] viewArr, Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 1, (ImageView) objArr[0], (View) objArr[8], (LinearLayoutCompat) objArr[6], (LinearLayoutCompat) objArr[9], (TextView) objArr[1], (TextView) objArr[11], (TextView) objArr[13], (NoPaddingTextView) objArr[7], (TextView) objArr[14], (NoPaddingTextView) objArr[3], (TextView) objArr[2], (NoPaddingTextView) objArr[10], (TextView) objArr[15], (TextView) objArr[4], (TextView) objArr[5], (TextView) objArr[12]);
        this.mDirtyFlags = -1L;
        this.ImgAnswer.setTag(null);
        this.divider.setTag(null);
        this.llNewArticle.setTag(null);
        this.llNewReplay.setTag(null);
        this.tvAnswer.setTag(null);
        this.tvBetterClass.setTag(null);
        this.tvGallery.setTag(null);
        this.tvNewArticle.setTag(null);
        this.tvNewQuora.setTag(null);
        this.tvNewQuoraTitle.setTag(null);
        this.tvNewReplay.setTag(null);
        this.tvNote.setTag(null);
        this.tvOnline.setTag(null);
        this.tvWrongBook.setTag(null);
        setRootTag(viewArr);
        invalidateAll();
    }
}
