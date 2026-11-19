package com.zykj.mistake.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zykj.mistake.R;

/* loaded from: classes3.dex */
public abstract class ItemMicroSessionsBinding extends ViewDataBinding {

    /* renamed from: a */
    public final ImageView f6165a;

    /* renamed from: b */
    public final TextView f6166b;

    public ItemMicroSessionsBinding(DataBindingComponent dataBindingComponent, View view, ImageView imageView, TextView textView) {
        super((Object) dataBindingComponent, view, 0);
        this.f6165a = imageView;
        this.f6166b = textView;
    }

    /* renamed from: a */
    public static ItemMicroSessionsBinding m3980a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return (ItemMicroSessionsBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_micro_sessions, viewGroup, false, DataBindingUtil.getDefaultComponent());
    }
}
