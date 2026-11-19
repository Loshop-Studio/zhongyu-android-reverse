package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.C6339R;

/* loaded from: classes5.dex */
public class TabItem extends View {
    public final int customLayout;
    public final Drawable icon;
    public final CharSequence text;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, C6339R.styleable.TabItem);
        this.text = tintTypedArrayObtainStyledAttributes.getText(C6339R.styleable.TabItem_android_text);
        this.icon = tintTypedArrayObtainStyledAttributes.getDrawable(C6339R.styleable.TabItem_android_icon);
        this.customLayout = tintTypedArrayObtainStyledAttributes.getResourceId(C6339R.styleable.TabItem_android_layout, 0);
        tintTypedArrayObtainStyledAttributes.recycle();
    }
}
