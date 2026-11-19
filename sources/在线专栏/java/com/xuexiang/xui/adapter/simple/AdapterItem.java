package com.xuexiang.xui.adapter.simple;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.xuexiang.xui.utils.ResUtils;

/* loaded from: classes.dex */
public class AdapterItem {
    private Drawable mIcon;
    private CharSequence mTitle;

    public AdapterItem(CharSequence charSequence) {
        this.mTitle = charSequence;
    }

    public static AdapterItem[] arrayof(CharSequence[] charSequenceArr) {
        int length = charSequenceArr.length;
        AdapterItem[] adapterItemArr = new AdapterItem[length];
        for (int i4 = 0; i4 < length; i4++) {
            adapterItemArr[i4] = new AdapterItem(charSequenceArr[i4]);
        }
        return adapterItemArr;
    }

    /* renamed from: of */
    public static AdapterItem m7959of(CharSequence charSequence) {
        return new AdapterItem(charSequence);
    }

    public Drawable getIcon() {
        return this.mIcon;
    }

    public CharSequence getTitle() {
        return this.mTitle;
    }

    public AdapterItem setIcon(Drawable drawable) {
        this.mIcon = drawable;
        return this;
    }

    public AdapterItem setTitle(CharSequence charSequence) {
        this.mTitle = charSequence;
        return this;
    }

    public String toString() {
        return this.mTitle.toString();
    }

    public AdapterItem(CharSequence charSequence, Drawable drawable) {
        this.mTitle = charSequence;
        this.mIcon = drawable;
    }

    public AdapterItem(CharSequence charSequence, int i4) {
        this(charSequence, ResUtils.getDrawable(i4));
    }

    public AdapterItem(Context context, int i4, int i5) {
        this(ResUtils.getString(i4), ResUtils.getDrawable(context, i5));
    }

    public AdapterItem(Context context, CharSequence charSequence, int i4) {
        this(charSequence, ResUtils.getDrawable(context, i4));
    }
}
