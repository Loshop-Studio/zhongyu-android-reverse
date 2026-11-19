package com.xuexiang.xui.widget.grouplist;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.widget.LinearLayout;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$styleable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
public class XUIGroupListView extends LinearLayout {

    /* renamed from: a */
    public int f4317a;

    /* renamed from: b */
    public final SparseArray f4318b;

    @Retention(RetentionPolicy.SOURCE)
    public @interface SeparatorStyle {
    }

    public XUIGroupListView(Context context) {
        this(context, null, R$attr.XUIGroupListViewStyle);
    }

    public int getSectionCount() {
        return this.f4318b.size();
    }

    public int getSeparatorStyle() {
        return this.f4317a;
    }

    public void setSeparatorStyle(int i) {
        this.f4317a = i;
    }

    public XUIGroupListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.XUIGroupListViewStyle);
    }

    public XUIGroupListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.XUIGroupListView, i, 0);
        this.f4317a = typedArrayObtainStyledAttributes.getInt(R$styleable.XUIGroupListView_xui_separatorStyle, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f4318b = new SparseArray();
        setOrientation(1);
    }
}
