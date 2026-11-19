package com.xuexiang.xui.widget.grouplist;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.widget.LinearLayout;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$styleable;

/* loaded from: classes5.dex */
public class XUIGroupListView extends LinearLayout {

    /* renamed from: c */
    public int f15966c;

    /* renamed from: d */
    public SparseArray f15967d;

    public XUIGroupListView(Context context) {
        this(context, null, R$attr.XUIGroupListViewStyle);
    }

    public int getSectionCount() {
        return this.f15967d.size();
    }

    public int getSeparatorStyle() {
        return this.f15966c;
    }

    public void setSeparatorStyle(int i10) {
        this.f15966c = i10;
    }

    public XUIGroupListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.XUIGroupListViewStyle);
    }

    public XUIGroupListView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.XUIGroupListView, i10, 0);
        this.f15966c = typedArrayObtainStyledAttributes.getInt(R$styleable.XUIGroupListView_xui_separatorStyle, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f15967d = new SparseArray();
        setOrientation(1);
    }
}
