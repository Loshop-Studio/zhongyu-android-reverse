package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.study.bean.SelectModel;
import com.zykj.study.bean.teach.CourseBindBean;

/* loaded from: classes3.dex */
public class ItemSuperviseGroupAddBindingImpl extends ItemSuperviseGroupAddBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;

    @NonNull
    private final RelativeLayout mboundView0;

    @NonNull
    private final TextView mboundView1;

    @NonNull
    private final TextView mboundView2;

    @NonNull
    private final TextView mboundView3;

    @NonNull
    private final ImageView mboundView4;

    @NonNull
    private final ImageView mboundView5;

    @NonNull
    private final ImageView mboundView6;

    public ItemSuperviseGroupAddBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        String str;
        boolean zIsBind;
        boolean z10;
        boolean zIsSelectModel;
        boolean z11;
        boolean z12;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        View.OnClickListener onClickListener = this.mOnclick;
        SelectModel<CourseBindBean> selectModel = this.mEntity;
        long j11 = j10 & 7;
        View.OnClickListener onClickListener2 = null;
        if (j11 != 0) {
            CourseBindBean data = selectModel != null ? selectModel.getData() : null;
            String name = ((j10 & 6) == 0 || data == null) ? null : data.getName();
            zIsBind = data != null ? data.isBind() : false;
            if (j11 != 0) {
                j10 |= zIsBind ? 16L : 8L;
            }
            long j12 = j10 & 6;
            if (j12 != 0) {
                z10 = !zIsBind;
                if (j12 != 0) {
                    j10 = !zIsBind ? j10 | 320 : j10 | 160;
                }
            } else {
                z10 = false;
            }
            str = name;
        } else {
            str = null;
            zIsBind = false;
            z10 = false;
        }
        if ((320 & j10) != 0) {
            zIsSelectModel = selectModel != null ? selectModel.isSelectModel() : false;
            z11 = (256 & j10) != 0 ? !zIsSelectModel : false;
        } else {
            zIsSelectModel = false;
            z11 = false;
        }
        long j13 = 7 & j10;
        if (j13 != 0) {
            if (zIsBind) {
                onClickListener = null;
            }
            onClickListener2 = onClickListener;
        }
        long j14 = j10 & 6;
        if (j14 != 0) {
            if (!z10) {
                zIsSelectModel = false;
            }
            z12 = z10 ? z11 : false;
            z = zIsSelectModel;
        } else {
            z12 = false;
        }
        if (j13 != 0) {
            this.mboundView0.setOnClickListener(onClickListener2);
        }
        if (j14 != 0) {
            TextViewBindingAdapter.setText(this.mboundView1, str);
            BindingAdaptersKt.visibleOrGone(this.mboundView1, Boolean.valueOf(z));
            TextViewBindingAdapter.setText(this.mboundView2, str);
            BindingAdaptersKt.visibleOrGone(this.mboundView2, Boolean.valueOf(z12));
            TextViewBindingAdapter.setText(this.mboundView3, str);
            BindingAdaptersKt.visibleOrGone(this.mboundView3, Boolean.valueOf(zIsBind));
            BindingAdaptersKt.visibleOrGone(this.mboundView4, Boolean.valueOf(z));
            BindingAdaptersKt.visibleOrGone(this.mboundView5, Boolean.valueOf(z12));
            BindingAdaptersKt.visibleOrGone(this.mboundView6, Boolean.valueOf(zIsBind));
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
        return false;
    }

    @Override // com.zykj.study.databinding.ItemSuperviseGroupAddBinding
    public void setEntity(@Nullable SelectModel<CourseBindBean> selectModel) {
        this.mEntity = selectModel;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(15);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemSuperviseGroupAddBinding
    public void setOnclick(@Nullable View.OnClickListener onClickListener) {
        this.mOnclick = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(39);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (39 == i10) {
            setOnclick((View.OnClickListener) obj);
            return true;
        }
        if (15 != i10) {
            return false;
        }
        setEntity((SelectModel) obj);
        return true;
    }

    private ItemSuperviseGroupAddBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0);
        this.mDirtyFlags = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.mboundView1 = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[2];
        this.mboundView2 = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[3];
        this.mboundView3 = textView3;
        textView3.setTag(null);
        ImageView imageView = (ImageView) objArr[4];
        this.mboundView4 = imageView;
        imageView.setTag(null);
        ImageView imageView2 = (ImageView) objArr[5];
        this.mboundView5 = imageView2;
        imageView2.setTag(null);
        ImageView imageView3 = (ImageView) objArr[6];
        this.mboundView6 = imageView3;
        imageView3.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
