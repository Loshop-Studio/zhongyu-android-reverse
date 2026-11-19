package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.study.R$id;
import com.zykj.study.bean.teach.SuperviseGroup;
import com.zykj.study.bean.teach.SuperviseGroupMember;
import com.zykj.study.bean.teach.SuperviseGroupSelectBean;
import com.zykj.study.view.MultipleStatusView;
import com.zykj.study.viewmodels.StudentViewViewModel;

/* loaded from: classes3.dex */
public class FragmentStudentViewContentBindingImpl extends FragmentStudentViewContentBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.container, 2);
        sparseIntArray.put(R$id.textView33, 3);
        sparseIntArray.put(R$id.recycler, 4);
    }

    public FragmentStudentViewContentBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, sIncludes, sViewsWithIds));
    }

    private boolean onChangeEntityCurrentSelectGroupAndMemberLiveData(MutableLiveData<SuperviseGroupSelectBean> mutableLiveData, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        SuperviseGroupSelectBean superviseGroupSelectBean;
        String str;
        SuperviseGroup superviseGroup;
        SuperviseGroupMember superviseGroupMember;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        StudentViewViewModel studentViewViewModel = this.mEntity;
        long j11 = j10 & 7;
        if (j11 != 0) {
            MutableLiveData mutableLiveDataM12269d = studentViewViewModel != null ? studentViewViewModel.m12269d() : null;
            updateLiveDataRegistration(0, mutableLiveDataM12269d);
            superviseGroupSelectBean = mutableLiveDataM12269d != null ? (SuperviseGroupSelectBean) mutableLiveDataM12269d.getValue() : null;
            z = superviseGroupSelectBean == null;
            if (j11 != 0) {
                j10 = z ? j10 | 16 : j10 | 8;
            }
        } else {
            superviseGroupSelectBean = null;
        }
        if ((j10 & 8) != 0) {
            if (superviseGroupSelectBean != null) {
                superviseGroupMember = superviseGroupSelectBean.getSuperviseGroupMember();
                superviseGroup = superviseGroupSelectBean.getSuperviseGroup();
            } else {
                superviseGroup = null;
                superviseGroupMember = null;
            }
            String userName = superviseGroupMember != null ? superviseGroupMember.getUserName() : null;
            str = ((superviseGroup != null ? superviseGroup.getName() : null) + ": ") + userName;
        } else {
            str = null;
        }
        long j12 = j10 & 7;
        String str2 = j12 != 0 ? z ? "" : str : null;
        if (j12 != 0) {
            TextViewBindingAdapter.setText(this.textView3, str2);
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
            this.mDirtyFlags = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return onChangeEntityCurrentSelectGroupAndMemberLiveData((MutableLiveData) obj, i11);
    }

    @Override // com.zykj.study.databinding.FragmentStudentViewContentBinding
    public void setEntity(@Nullable StudentViewViewModel studentViewViewModel) {
        this.mEntity = studentViewViewModel;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(15);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (15 != i10) {
            return false;
        }
        setEntity((StudentViewViewModel) obj);
        return true;
    }

    private FragmentStudentViewContentBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 1, (ConstraintLayout) objArr[2], (MultipleStatusView) objArr[0], (RecyclerView) objArr[4], (TextView) objArr[1], (TextView) objArr[3]);
        this.mDirtyFlags = -1L;
        this.multipleStatusView.setTag(null);
        this.textView3.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
