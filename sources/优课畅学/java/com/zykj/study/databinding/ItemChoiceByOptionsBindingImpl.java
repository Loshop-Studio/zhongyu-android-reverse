package com.zykj.study.databinding;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.databinding.adapters.ViewBindingAdapter;
import com.zykj.study.R$color;
import com.zykj.study.R$drawable;
import com.zykj.study.R$id;
import com.zykj.study.bean.teach.ChoiceChartData;

/* loaded from: classes3.dex */
public class ItemChoiceByOptionsBindingImpl extends ItemChoiceByOptionsBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final ConstraintLayout mboundView0;

    @NonNull
    private final TextView mboundView4;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R$id.view_line, 5);
        sparseIntArray.put(R$id.iv_bubble, 6);
    }

    public ItemChoiceByOptionsBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        int colorFromResource;
        String showName;
        Drawable drawable;
        Drawable drawable2;
        int progress;
        Context context;
        int i10;
        TextView textView;
        int i11;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        Boolean bool = this.mIsSelected;
        ChoiceChartData choiceChartData = this.mData;
        long j11 = j10 & 5;
        boolean zIsRight = false;
        if (j11 != 0) {
            boolean zSafeUnbox = ViewDataBinding.safeUnbox(bool);
            if (j11 != 0) {
                j10 |= zSafeUnbox ? 64L : 32L;
            }
            if (zSafeUnbox) {
                textView = this.tvName;
                i11 = R$color.list_table_text_pass;
            } else {
                textView = this.tvName;
                i11 = R$color.unselected_gray;
            }
            colorFromResource = ViewDataBinding.getColorFromResource(textView, i11);
        } else {
            colorFromResource = 0;
        }
        long j12 = j10 & 6;
        String str = null;
        if (j12 != 0) {
            if (choiceChartData != null) {
                zIsRight = choiceChartData.isRight();
                progress = choiceChartData.getProgress();
                showName = choiceChartData.getShowName();
            } else {
                showName = null;
                progress = 0;
            }
            if (j12 != 0) {
                j10 |= zIsRight ? 272L : 136L;
            }
            drawable = AppCompatResources.getDrawable(this.viewContent.getContext(), zIsRight ? R$drawable.item_bg_choice_right : R$drawable.item_bg_choice_wrong);
            if (zIsRight) {
                context = this.viewBackground.getContext();
                i10 = R$drawable.item_bg_choice_right_background;
            } else {
                context = this.viewBackground.getContext();
                i10 = R$drawable.item_bg_choice_wrong_background;
            }
            drawable2 = AppCompatResources.getDrawable(context, i10);
            str = progress + "%";
        } else {
            showName = null;
            drawable = null;
            drawable2 = null;
        }
        if ((6 & j10) != 0) {
            TextViewBindingAdapter.setText(this.mboundView4, str);
            TextViewBindingAdapter.setText(this.tvName, showName);
            ViewBindingAdapter.setBackground(this.viewBackground, drawable2);
            ViewBindingAdapter.setBackground(this.viewContent, drawable);
        }
        if ((j10 & 5) != 0) {
            this.tvName.setTextColor(colorFromResource);
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

    @Override // com.zykj.study.databinding.ItemChoiceByOptionsBinding
    public void setData(@Nullable ChoiceChartData choiceChartData) {
        this.mData = choiceChartData;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(7);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemChoiceByOptionsBinding
    public void setIsSelected(@Nullable Boolean bool) {
        this.mIsSelected = bool;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(28);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (28 == i10) {
            setIsSelected((Boolean) obj);
            return true;
        }
        if (7 != i10) {
            return false;
        }
        setData((ChoiceChartData) obj);
        return true;
    }

    private ItemChoiceByOptionsBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[6], (TextView) objArr[1], (View) objArr[2], (View) objArr[3], (View) objArr[5]);
        this.mDirtyFlags = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[4];
        this.mboundView4 = textView;
        textView.setTag(null);
        this.tvName.setTag(null);
        this.viewBackground.setTag(null);
        this.viewContent.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
