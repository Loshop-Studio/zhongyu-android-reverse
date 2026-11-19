package com.zykj.study.databinding;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.databinding.adapters.ViewBindingAdapter;
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.study.R$color;
import com.zykj.study.R$drawable;
import com.zykj.study.R$string;
import com.zykj.study.bean.SelectModel;
import com.zykj.study.bean.course.CatalogBean;
import com.zykj.study.view.KnowledgeCompleteView;

/* loaded from: classes3.dex */
public class ItemChapterCompleteBindingImpl extends ItemChapterCompleteBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;

    @NonNull
    private final LinearLayout mboundView0;

    @NonNull
    private final ImageView mboundView1;

    @NonNull
    private final ImageView mboundView2;

    @NonNull
    private final TextView mboundView3;

    @NonNull
    private final LinearLayout mboundView4;

    @NonNull
    private final TextView mboundView5;

    public ItemChapterCompleteBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() throws Resources.NotFoundException {
        long j10;
        long j11;
        String string;
        String title;
        boolean zIsSelectModel;
        boolean z10;
        Context context;
        int i10;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        int i11 = this.mTotalMember;
        boolean z11 = this.mIsSelected;
        SelectModel<CatalogBean> selectModel = this.mEntity;
        View.OnClickListener onClickListener = this.mOnArrowClick;
        Drawable drawable = null;
        int colorFromResource = 0;
        if ((j10 & 21) != 0) {
            long j12 = j10 & 20;
            if (j12 != 0) {
                zIsSelectModel = selectModel != null ? selectModel.isSelectModel() : false;
                z10 = !zIsSelectModel;
            } else {
                zIsSelectModel = false;
                z10 = false;
            }
            CatalogBean data = selectModel != null ? selectModel.getData() : null;
            title = (j12 == 0 || data == null) ? null : data.getTitle();
            j11 = 0;
            string = this.mboundView5.getResources().getString(R$string.complete_proportion, Integer.valueOf(data != null ? data.getProgress() : 0), Integer.valueOf(i11));
        } else {
            j11 = 0;
            string = null;
            title = null;
            zIsSelectModel = false;
            z10 = false;
        }
        long j13 = j10 & 18;
        if (j13 != j11) {
            if (j13 != j11) {
                j10 |= z11 ? 320L : 160L;
            }
            colorFromResource = ViewDataBinding.getColorFromResource(this.mboundView5, z11 ? R$color.white : R$color.text_label_normal);
            if (z11) {
                context = this.mboundView4.getContext();
                i10 = R$drawable.shape_catalog_complete_pass;
            } else {
                context = this.mboundView4.getContext();
                i10 = R$drawable.shape_catalog_complete_normal;
            }
            drawable = AppCompatResources.getDrawable(context, i10);
        }
        long j14 = 24 & j10;
        if ((20 & j10) != j11) {
            BindingAdaptersKt.visibleOrGone(this.knowView, Boolean.valueOf(zIsSelectModel));
            BindingAdaptersKt.visibleOrGone(this.mboundView1, Boolean.valueOf(zIsSelectModel));
            BindingAdaptersKt.visibleOrGone(this.mboundView2, Boolean.valueOf(z10));
            TextViewBindingAdapter.setText(this.mboundView3, title);
        }
        if (j14 != j11) {
            this.mboundView4.setOnClickListener(onClickListener);
        }
        if ((18 & j10) != j11) {
            ViewBindingAdapter.setBackground(this.mboundView4, drawable);
            this.mboundView5.setTextColor(colorFromResource);
        }
        if ((j10 & 21) != j11) {
            TextViewBindingAdapter.setText(this.mboundView5, string);
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
            this.mDirtyFlags = 16L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i10, Object obj, int i11) {
        return false;
    }

    @Override // com.zykj.study.databinding.ItemChapterCompleteBinding
    public void setEntity(@Nullable SelectModel<CatalogBean> selectModel) {
        this.mEntity = selectModel;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(15);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemChapterCompleteBinding
    public void setIsSelected(boolean z10) {
        this.mIsSelected = z10;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(28);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemChapterCompleteBinding
    public void setOnArrowClick(@Nullable View.OnClickListener onClickListener) {
        this.mOnArrowClick = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        notifyPropertyChanged(36);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemChapterCompleteBinding
    public void setTotalMember(int i10) {
        this.mTotalMember = i10;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(52);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (52 == i10) {
            setTotalMember(((Integer) obj).intValue());
            return true;
        }
        if (28 == i10) {
            setIsSelected(((Boolean) obj).booleanValue());
            return true;
        }
        if (15 == i10) {
            setEntity((SelectModel) obj);
            return true;
        }
        if (36 != i10) {
            return false;
        }
        setOnArrowClick((View.OnClickListener) obj);
        return true;
    }

    private ItemChapterCompleteBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (KnowledgeCompleteView) objArr[6]);
        this.mDirtyFlags = -1L;
        this.knowView.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[1];
        this.mboundView1 = imageView;
        imageView.setTag(null);
        ImageView imageView2 = (ImageView) objArr[2];
        this.mboundView2 = imageView2;
        imageView2.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.mboundView3 = textView;
        textView.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[4];
        this.mboundView4 = linearLayout2;
        linearLayout2.setTag(null);
        TextView textView2 = (TextView) objArr[5];
        this.mboundView5 = textView2;
        textView2.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
