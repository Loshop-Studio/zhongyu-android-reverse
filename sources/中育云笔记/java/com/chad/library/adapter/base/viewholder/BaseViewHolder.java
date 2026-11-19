package com.chad.library.adapter.base.viewholder;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.Keep;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.InterfaceC10770a;

@Keep
/* loaded from: classes3.dex */
public class BaseViewHolder extends RecyclerView.ViewHolder {
    private final SparseArray<View> views;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewHolder(View view) {
        super(view);
        AbstractC9979u.m20294g(view, "view");
        this.views = new SparseArray<>();
    }

    public <T extends View> T findView(int i10) {
        return (T) this.itemView.findViewById(i10);
    }

    @InterfaceC10770a
    public <B extends ViewDataBinding> B getBinding() {
        return (B) DataBindingUtil.getBinding(this.itemView);
    }

    public <T extends View> T getView(@IdRes int i10) {
        T t10 = (T) getViewOrNull(i10);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException(("No view found with id " + i10).toString());
    }

    public <T extends View> T getViewOrNull(@IdRes int i10) {
        T t10;
        T t11 = (T) this.views.get(i10);
        if (t11 == null && (t10 = (T) this.itemView.findViewById(i10)) != null) {
            this.views.put(i10, t10);
            return t10;
        }
        if (t11 == null) {
            return null;
        }
        return t11;
    }

    public BaseViewHolder setBackgroundColor(@IdRes int i10, @ColorInt int i11) {
        getView(i10).setBackgroundColor(i11);
        return this;
    }

    public BaseViewHolder setBackgroundResource(@IdRes int i10, @DrawableRes int i11) {
        getView(i10).setBackgroundResource(i11);
        return this;
    }

    public BaseViewHolder setEnabled(@IdRes int i10, boolean z10) {
        getView(i10).setEnabled(z10);
        return this;
    }

    public BaseViewHolder setGone(@IdRes int i10, boolean z10) {
        getView(i10).setVisibility(z10 ? 8 : 0);
        return this;
    }

    public BaseViewHolder setImageBitmap(@IdRes int i10, Bitmap bitmap) {
        ((ImageView) getView(i10)).setImageBitmap(bitmap);
        return this;
    }

    public BaseViewHolder setImageDrawable(@IdRes int i10, Drawable drawable) {
        ((ImageView) getView(i10)).setImageDrawable(drawable);
        return this;
    }

    public BaseViewHolder setImageResource(@IdRes int i10, @DrawableRes int i11) {
        ((ImageView) getView(i10)).setImageResource(i11);
        return this;
    }

    public BaseViewHolder setText(@IdRes int i10, CharSequence charSequence) {
        ((TextView) getView(i10)).setText(charSequence);
        return this;
    }

    public BaseViewHolder setTextColor(@IdRes int i10, @ColorInt int i11) {
        ((TextView) getView(i10)).setTextColor(i11);
        return this;
    }

    public BaseViewHolder setTextColorRes(@IdRes int i10, @ColorRes int i11) {
        ((TextView) getView(i10)).setTextColor(ContextCompat.getColor(this.itemView.getContext(), i11));
        return this;
    }

    public BaseViewHolder setVisible(@IdRes int i10, boolean z10) {
        getView(i10).setVisibility(z10 ? 0 : 4);
        return this;
    }

    public BaseViewHolder setText(@IdRes int i10, @StringRes int i11) {
        ((TextView) getView(i10)).setText(i11);
        return this;
    }
}
