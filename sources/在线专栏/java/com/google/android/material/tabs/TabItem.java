package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.C0214g0;
import com.google.android.material.C1371R;

/* loaded from: classes.dex */
public class TabItem extends View {
    public final int customLayout;
    public final Drawable icon;
    public final CharSequence text;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0214g0 c0214g0M814u = C0214g0.m814u(context, attributeSet, C1371R.styleable.TabItem);
        this.text = c0214g0M814u.m831p(C1371R.styleable.TabItem_android_text);
        this.icon = c0214g0M814u.m822g(C1371R.styleable.TabItem_android_icon);
        this.customLayout = c0214g0M814u.m829n(C1371R.styleable.TabItem_android_layout, 0);
        c0214g0M814u.m835w();
    }
}
