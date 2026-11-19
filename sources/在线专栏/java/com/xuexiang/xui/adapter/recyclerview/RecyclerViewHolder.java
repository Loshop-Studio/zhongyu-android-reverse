package com.xuexiang.xui.adapter.recyclerview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0332a;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.widget.imageview.ImageLoader;

/* loaded from: classes.dex */
public class RecyclerViewHolder extends RecyclerView.AbstractC0557b0 {
    private SparseArray<View> mViews;

    public interface OnItemClickListener<T> {
        void onItemClick(View view, T t3, int i4);
    }

    public interface OnItemLongClickListener<T> {
        void onItemLongClick(View view, T t3, int i4);
    }

    public interface OnViewItemClickListener<T> {
        void onViewItemClick(View view, T t3, int i4);
    }

    public RecyclerViewHolder(View view) {
        super(view);
        this.mViews = new SparseArray<>();
    }

    public RecyclerViewHolder backgroundResId(int i4, int i5) {
        findView(i4).setBackgroundResource(i5);
        return this;
    }

    public RecyclerViewHolder checked(int i4, boolean z3) {
        KeyEvent.Callback callbackFindView = findView(i4);
        if (callbackFindView instanceof Checkable) {
            ((Checkable) callbackFindView).setChecked(z3);
        }
        return this;
    }

    public RecyclerViewHolder checkedListener(int i4, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        View viewFindView = findView(i4);
        if (viewFindView instanceof CompoundButton) {
            ((CompoundButton) viewFindView).setOnCheckedChangeListener(onCheckedChangeListener);
        }
        return this;
    }

    public void clearViews() {
        SparseArray<View> sparseArray = this.mViews;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public RecyclerViewHolder click(int i4, View.OnClickListener onClickListener) {
        View viewFindView = findView(i4);
        if (onClickListener != null) {
            viewFindView.setOnClickListener(onClickListener);
        }
        return this;
    }

    public RecyclerViewHolder enable(int i4, boolean z3) {
        View viewFindView = findView(i4);
        viewFindView.setEnabled(z3);
        if (viewFindView instanceof EditText) {
            viewFindView.setFocusable(z3);
            viewFindView.setFocusableInTouchMode(z3);
        }
        return this;
    }

    public View findView(int i4) {
        return i4 == 0 ? this.itemView : findViewById(i4);
    }

    public <T extends View> T findViewById(int i4) {
        T t3 = (T) this.mViews.get(i4);
        if (t3 != null) {
            return t3;
        }
        T t4 = (T) this.itemView.findViewById(i4);
        this.mViews.put(i4, t4);
        return t4;
    }

    public Button getButton(int i4) {
        return (Button) getView(i4);
    }

    public final Context getContext() {
        return this.itemView.getContext();
    }

    public EditText getEditText(int i4) {
        return (EditText) getView(i4);
    }

    public ImageButton getImageButton(int i4) {
        return (ImageButton) getView(i4);
    }

    public ImageView getImageView(int i4) {
        return (ImageView) getView(i4);
    }

    public TextView getTextView(int i4) {
        return (TextView) getView(i4);
    }

    public View getView(int i4) {
        return findViewById(i4);
    }

    public RecyclerViewHolder image(int i4, int i5) {
        View viewFindView = findView(i4);
        if (viewFindView instanceof ImageView) {
            ((ImageView) viewFindView).setImageResource(i5);
        }
        return this;
    }

    public RecyclerViewHolder imageLevel(int i4, int i5) {
        View viewFindView = findView(i4);
        if (viewFindView instanceof ImageView) {
            ((ImageView) viewFindView).setImageLevel(i5);
        }
        return this;
    }

    public RecyclerViewHolder select(int i4, boolean z3) {
        findView(i4).setSelected(z3);
        return this;
    }

    public RecyclerViewHolder text(int i4, CharSequence charSequence) {
        View viewFindView = findView(i4);
        if (viewFindView instanceof TextView) {
            ((TextView) viewFindView).setText(charSequence);
        }
        return this;
    }

    public RecyclerViewHolder textColorId(int i4, int i5) {
        View viewFindView = findView(i4);
        if (viewFindView instanceof TextView) {
            ((TextView) viewFindView).setTextColor(C0332a.m1804b(viewFindView.getContext(), i5));
        }
        return this;
    }

    public RecyclerViewHolder textListener(int i4, TextWatcher textWatcher) {
        View viewFindView = findView(i4);
        if (viewFindView instanceof TextView) {
            ((TextView) viewFindView).addTextChangedListener(textWatcher);
        }
        return this;
    }

    public RecyclerViewHolder tint(int i4, ColorStateList colorStateList) {
        View viewFindView = findView(i4);
        if (viewFindView instanceof ImageView) {
            ((ImageView) viewFindView).setImageTintList(colorStateList);
        }
        return this;
    }

    public <T> RecyclerViewHolder viewClick(int i4, final OnViewItemClickListener<T> onViewItemClickListener, final T t3, final int i5) {
        View viewFindView = findView(i4);
        if (onViewItemClickListener != null) {
            viewFindView.setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.adapter.recyclerview.RecyclerViewHolder.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    onViewItemClickListener.onViewItemClick(view, t3, i5);
                }
            });
        }
        return this;
    }

    public RecyclerViewHolder visible(int i4, int i5) {
        findView(i4).setVisibility(i5);
        return this;
    }

    public RecyclerViewHolder image(int i4, Drawable drawable) {
        View viewFindView = findView(i4);
        if (viewFindView instanceof ImageView) {
            ((ImageView) viewFindView).setImageDrawable(drawable);
        }
        return this;
    }

    public RecyclerViewHolder text(int i4, int i5) {
        View viewFindView = findView(i4);
        if (viewFindView instanceof TextView) {
            ((TextView) viewFindView).setText(i5);
        }
        return this;
    }

    public RecyclerViewHolder image(int i4, Object obj) {
        View viewFindView = findView(i4);
        if (viewFindView instanceof ImageView) {
            ImageLoader.get().loadImage((ImageView) viewFindView, obj);
        }
        return this;
    }
}
