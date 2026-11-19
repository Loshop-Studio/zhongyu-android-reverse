package com.zykj.study.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.Converters;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.databinding.adapters.ViewBindingAdapter;
import com.zykj.study.R$color;

/* loaded from: classes3.dex */
public class ItemSubscribeTabBindingImpl extends ItemSubscribeTabBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;

    public ItemSubscribeTabBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 1, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j10;
        int colorFromResource;
        int colorFromResource2;
        AppCompatTextView appCompatTextView;
        int i10;
        synchronized (this) {
            j10 = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        Boolean bool = this.mIsSelected;
        View.OnClickListener onClickListener = this.mOnClick;
        String str = this.mTitle;
        long j11 = j10 & 9;
        if (j11 != 0) {
            boolean zSafeUnbox = ViewDataBinding.safeUnbox(bool);
            if (j11 != 0) {
                j10 |= zSafeUnbox ? 160L : 80L;
            }
            colorFromResource = ViewDataBinding.getColorFromResource(this.tvTitle, zSafeUnbox ? R$color.subscribe_tab_bg_select : R$color.subscribe_tab_bg_normal);
            if (zSafeUnbox) {
                appCompatTextView = this.tvTitle;
                i10 = R$color.subscribe_tab_text_select;
            } else {
                appCompatTextView = this.tvTitle;
                i10 = R$color.subscribe_tab_text_normal;
            }
            colorFromResource2 = ViewDataBinding.getColorFromResource(appCompatTextView, i10);
        } else {
            colorFromResource = 0;
            colorFromResource2 = 0;
        }
        long j12 = 10 & j10;
        long j13 = 12 & j10;
        if ((j10 & 9) != 0) {
            ViewBindingAdapter.setBackground(this.tvTitle, Converters.convertColorToDrawable(colorFromResource));
            this.tvTitle.setTextColor(colorFromResource2);
        }
        if (j12 != 0) {
            this.tvTitle.setOnClickListener(onClickListener);
        }
        if (j13 != 0) {
            TextViewBindingAdapter.setText(this.tvTitle, str);
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
    public boolean onFieldChange(int i10, Object obj, int i11) {
        return false;
    }

    @Override // com.zykj.study.databinding.ItemSubscribeTabBinding
    public void setIsSelected(@Nullable Boolean bool) {
        this.mIsSelected = bool;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(28);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemSubscribeTabBinding
    public void setOnClick(@Nullable View.OnClickListener onClickListener) {
        this.mOnClick = onClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    @Override // com.zykj.study.databinding.ItemSubscribeTabBinding
    public void setTitle(@Nullable String str) {
        this.mTitle = str;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(50);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i10, @Nullable Object obj) {
        if (28 == i10) {
            setIsSelected((Boolean) obj);
            return true;
        }
        if (1 == i10) {
            setOnClick((View.OnClickListener) obj);
            return true;
        }
        if (50 != i10) {
            return false;
        }
        setTitle((String) obj);
        return true;
    }

    private ItemSubscribeTabBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatTextView) objArr[0]);
        this.mDirtyFlags = -1L;
        this.tvTitle.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
