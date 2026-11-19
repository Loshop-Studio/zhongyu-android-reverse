package com.zykj.study.databinding;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.databinding.adapters.ViewBindingAdapter;
import com.zykj.study.R$color;
import com.zykj.study.R$drawable;
import com.zykj.study.R$string;
import com.zykj.study.bean.course.CatalogBean;

/* loaded from: classes3.dex */
public class ItemKnowledgeCompleteBindingImpl extends ItemKnowledgeCompleteBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;

    @NonNull
    private final LinearLayout mboundView0;

    @NonNull
    private final TextView mboundView1;

    @NonNull
    private final TextView mboundView3;

    public ItemKnowledgeCompleteBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() throws Resources.NotFoundException {
        long j10;
        long j11;
        String string;
        String title;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        int i10 = this.mTotalMember;
        boolean z10 = this.mIsSelected;
        CatalogBean catalogBean = this.mEntity;
        View.OnClickListener onClickListener = this.mOnClick;
        int colorFromResource = 0;
        Drawable drawable = null;
        if ((j10 & 21) != 0) {
            j11 = 0;
            string = this.mboundView3.getResources().getString(R$string.complete_proportion, Integer.valueOf(catalogBean != null ? catalogBean.getProgress() : 0), Integer.valueOf(i10));
            title = ((j10 & 20) == 0 || catalogBean == null) ? null : catalogBean.getTitle();
        } else {
            j11 = 0;
            string = null;
            title = null;
        }
        long j12 = j10 & 18;
        if (j12 != j11) {
            if (j12 != j11) {
                j10 |= z10 ? 320L : 160L;
            }
            drawable = AppCompatResources.getDrawable(this.llProgress.getContext(), z10 ? R$drawable.shape_catalog_complete_pass : R$drawable.shape_catalog_complete_normal);
            colorFromResource = ViewDataBinding.getColorFromResource(this.mboundView3, z10 ? R$color.white : R$color.text_label_normal);
        }
        if ((24 & j10) != j11) {
            this.llProgress.setOnClickListener(onClickListener);
        }
        if ((j10 & 18) != j11) {
            ViewBindingAdapter.setBackground(this.llProgress, drawable);
            this.mboundView3.setTextColor(colorFromResource);
        }
        if ((j10 & 20) != j11) {
            TextViewBindingAdapter.setText(this.mboundView1, title);
        }
        if ((j10 & 21) != j11) {
            TextViewBindingAdapter.setText(this.mboundView3, string);
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

    @Override // com.zykj.study.databinding.ItemKnowledgeCompleteBinding
    public void setEntity(@Nullable CatalogBean catalogBean) {
        this.mEntity = catalogBean;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(15);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemKnowledgeCompleteBinding
    public void setIsSelected(boolean z10) {
        this.mIsSelected = z10;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(28);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemKnowledgeCompleteBinding
    public void setOnClick(@Nullable View.OnClickListener onClickListener) {
        this.mOnClick = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        notifyPropertyChanged(37);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemKnowledgeCompleteBinding
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
            setEntity((CatalogBean) obj);
            return true;
        }
        if (37 != i10) {
            return false;
        }
        setOnClick((View.OnClickListener) obj);
        return true;
    }

    private ItemKnowledgeCompleteBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayout) objArr[2]);
        this.mDirtyFlags = -1L;
        this.llProgress.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.mboundView1 = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[3];
        this.mboundView3 = textView2;
        textView2.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
