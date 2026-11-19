package com.xuexiang.xui.widget.grouplist;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.R$styleable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p164t1.AbstractC6582a;

/* loaded from: classes3.dex */
public class XUICommonListItemView extends RelativeLayout {

    /* renamed from: a */
    public int f4315a;

    @Retention(RetentionPolicy.SOURCE)
    public @interface XUICommonListItemAccessoryType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface XUICommonListItemOrientation {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface XUICommonListItemRedDotPosition {
    }

    public XUICommonListItemView(Context context) {
        this(context, null);
    }

    private ImageView getAccessoryImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(getAccessoryLayoutParams());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        return imageView;
    }

    private ViewGroup.LayoutParams getAccessoryLayoutParams() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    public ViewGroup getAccessoryContainerView() {
        return null;
    }

    public int getAccessoryType() {
        return 0;
    }

    public CharSequence getDetailText() {
        throw null;
    }

    public TextView getDetailTextView() {
        return null;
    }

    public int getOrientation() {
        return this.f4315a;
    }

    public CheckBox getSwitch() {
        return null;
    }

    public CharSequence getText() {
        throw null;
    }

    public TextView getTextView() {
        return null;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i, int i8, int i9, int i10) {
        super.onLayout(z8, i, i8, i9, i10);
    }

    public void setAccessoryType(int i) {
        throw null;
    }

    public void setDetailText(CharSequence charSequence) {
        throw null;
    }

    public void setImageDrawable(Drawable drawable) {
        drawable.getClass();
        throw null;
    }

    public void setOrientation(int i) {
        this.f4315a = i;
        throw null;
    }

    public void setRedDotPosition(int i) {
        requestLayout();
    }

    public void setText(CharSequence charSequence) {
        throw null;
    }

    public XUICommonListItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.XUICommonListItemViewStyle);
    }

    public XUICommonListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4315a = 1;
        LayoutInflater.from(context).inflate(R$layout.xui_layout_common_list_item, (ViewGroup) this, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.XUICommonListItemView, i, 0);
        typedArrayObtainStyledAttributes.getInt(R$styleable.XUICommonListItemView_xui_orientation, 1);
        typedArrayObtainStyledAttributes.getInt(R$styleable.XUICommonListItemView_xui_accessory_type, 0);
        AbstractC6582a.m6217a();
        throw null;
    }
}
