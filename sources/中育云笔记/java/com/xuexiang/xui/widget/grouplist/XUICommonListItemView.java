package com.xuexiang.xui.widget.grouplist;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$color;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC8037c;
import com.xuexiang.xui.utils.AbstractC8040f;
import com.xuexiang.xui.utils.AbstractC8041g;
import com.xuexiang.xui.utils.AbstractC8042h;
import com.xuexiang.xui.utils.AbstractC8043i;

/* loaded from: classes5.dex */
public class XUICommonListItemView extends RelativeLayout {

    /* renamed from: c */
    public int f15952c;

    /* renamed from: d */
    public int f15953d;

    /* renamed from: e */
    public int f15954e;

    /* renamed from: f */
    public ImageView f15955f;

    /* renamed from: g */
    public ViewGroup f15956g;

    /* renamed from: h */
    public LinearLayout f15957h;

    /* renamed from: i */
    public TextView f15958i;

    /* renamed from: j */
    public TextView f15959j;

    /* renamed from: k */
    public Space f15960k;

    /* renamed from: l */
    public CheckBox f15961l;

    /* renamed from: m */
    public ImageView f15962m;

    /* renamed from: n */
    public ViewStub f15963n;

    /* renamed from: o */
    public View f15964o;

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

    /* renamed from: a */
    public void m12637a(Context context, AttributeSet attributeSet, int i10) {
        LayoutInflater.from(context).inflate(R$layout.xui_layout_common_list_item, (ViewGroup) this, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.XUICommonListItemView, i10, 0);
        int i11 = typedArrayObtainStyledAttributes.getInt(R$styleable.XUICommonListItemView_xui_orientation, 1);
        int i12 = typedArrayObtainStyledAttributes.getInt(R$styleable.XUICommonListItemView_xui_accessory_type, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.XUICommonListItemView_xui_commonList_titleColor, AbstractC8040f.m12202c(R$color.xui_config_color_gray_1));
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.XUICommonListItemView_xui_commonList_detailColor, AbstractC8040f.m12202c(R$color.xui_config_color_gray_5));
        typedArrayObtainStyledAttributes.recycle();
        this.f15955f = (ImageView) findViewById(R$id.group_list_item_imageView);
        this.f15957h = (LinearLayout) findViewById(R$id.group_list_item_textContainer);
        TextView textView = (TextView) findViewById(R$id.group_list_item_textView);
        this.f15958i = textView;
        textView.setTextColor(color);
        this.f15962m = (ImageView) findViewById(R$id.group_list_item_tips_dot);
        this.f15963n = (ViewStub) findViewById(R$id.group_list_item_tips_new);
        this.f15959j = (TextView) findViewById(R$id.group_list_item_detailTextView);
        this.f15960k = (Space) findViewById(R$id.group_list_item_space);
        this.f15959j.setTextColor(color2);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f15959j.getLayoutParams();
        if (AbstractC8043i.m12239a()) {
            layoutParams.bottomMargin = -AbstractC8041g.m12219f(context, R$attr.xui_common_list_item_detail_line_space);
        }
        if (i11 == 0) {
            layoutParams.topMargin = AbstractC8037c.m12188b(getContext(), 6.0f);
        } else {
            layoutParams.topMargin = 0;
        }
        this.f15956g = (ViewGroup) findViewById(R$id.group_list_item_accessoryView);
        setOrientation(i11);
        setAccessoryType(i12);
    }

    public ViewGroup getAccessoryContainerView() {
        return this.f15956g;
    }

    public int getAccessoryType() {
        return this.f15952c;
    }

    public CharSequence getDetailText() {
        return this.f15959j.getText();
    }

    public TextView getDetailTextView() {
        return this.f15959j;
    }

    public int getOrientation() {
        return this.f15953d;
    }

    public CheckBox getSwitch() {
        return this.f15961l;
    }

    public CharSequence getText() {
        return this.f15958i.getText();
    }

    public TextView getTextView() {
        return this.f15958i;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int width;
        super.onLayout(z10, i10, i11, i12, i13);
        ImageView imageView = this.f15962m;
        if (imageView != null && imageView.getVisibility() == 0) {
            int height = (getHeight() / 2) - (this.f15962m.getMeasuredHeight() / 2);
            int left = this.f15957h.getLeft();
            int i14 = this.f15954e;
            if (i14 == 0) {
                width = (int) (left + this.f15958i.getPaint().measureText(this.f15958i.getText().toString()) + AbstractC8037c.m12188b(getContext(), 4.0f));
            } else if (i14 != 1) {
                return;
            } else {
                width = (left + this.f15957h.getWidth()) - this.f15962m.getMeasuredWidth();
            }
            ImageView imageView2 = this.f15962m;
            imageView2.layout(width, height, imageView2.getMeasuredWidth() + width, this.f15962m.getMeasuredHeight() + height);
        }
        View view = this.f15964o;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        int left2 = (int) (this.f15957h.getLeft() + this.f15958i.getPaint().measureText(this.f15958i.getText().toString()) + AbstractC8037c.m12188b(getContext(), 4.0f));
        int height2 = (getHeight() / 2) - (this.f15964o.getMeasuredHeight() / 2);
        View view2 = this.f15964o;
        view2.layout(left2, height2, view2.getMeasuredWidth() + left2, this.f15964o.getMeasuredHeight() + height2);
    }

    public void setAccessoryType(int i10) {
        this.f15956g.removeAllViews();
        this.f15952c = i10;
        if (i10 == 0) {
            this.f15956g.setVisibility(8);
            return;
        }
        if (i10 == 1) {
            ImageView accessoryImageView = getAccessoryImageView();
            accessoryImageView.setImageDrawable(AbstractC8041g.m12221h(getContext(), R$attr.xui_common_list_item_chevron));
            this.f15956g.addView(accessoryImageView);
            this.f15956g.setVisibility(0);
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            this.f15956g.setVisibility(0);
            return;
        }
        if (this.f15961l == null) {
            CheckBox checkBox = new CheckBox(getContext());
            this.f15961l = checkBox;
            checkBox.setButtonDrawable(AbstractC8041g.m12221h(getContext(), R$attr.xui_common_list_item_switch));
            this.f15961l.setLayoutParams(getAccessoryLayoutParams());
            this.f15961l.setClickable(false);
            this.f15961l.setEnabled(false);
        }
        this.f15956g.addView(this.f15961l);
        this.f15956g.setVisibility(0);
    }

    public void setDetailText(CharSequence charSequence) {
        this.f15959j.setText(charSequence);
        if (AbstractC8042h.m12235i(charSequence)) {
            this.f15959j.setVisibility(8);
        } else {
            this.f15959j.setVisibility(0);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        if (drawable == null) {
            this.f15955f.setVisibility(8);
        } else {
            this.f15955f.setImageDrawable(drawable);
            this.f15955f.setVisibility(0);
        }
    }

    public void setOrientation(int i10) {
        this.f15953d = i10;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f15960k.getLayoutParams();
        if (this.f15953d == 0) {
            this.f15957h.setOrientation(1);
            this.f15957h.setGravity(3);
            layoutParams.width = -2;
            layoutParams.height = AbstractC8037c.m12188b(getContext(), 4.0f);
            layoutParams.weight = 0.0f;
            this.f15958i.setTextSize(0, AbstractC8041g.m12219f(getContext(), R$attr.xui_common_list_item_title_v_text_size));
            this.f15959j.setTextSize(0, AbstractC8041g.m12219f(getContext(), R$attr.xui_common_list_item_detail_v_text_size));
            return;
        }
        this.f15957h.setOrientation(0);
        this.f15957h.setGravity(16);
        layoutParams.width = 0;
        layoutParams.height = 0;
        layoutParams.weight = 1.0f;
        this.f15958i.setTextSize(0, AbstractC8041g.m12219f(getContext(), R$attr.xui_common_list_item_title_h_text_size));
        this.f15959j.setTextSize(0, AbstractC8041g.m12219f(getContext(), R$attr.xui_common_list_item_detail_h_text_size));
    }

    public void setRedDotPosition(int i10) {
        this.f15954e = i10;
        requestLayout();
    }

    public void setText(CharSequence charSequence) {
        this.f15958i.setText(charSequence);
        if (AbstractC8042h.m12235i(charSequence)) {
            this.f15958i.setVisibility(8);
        } else {
            this.f15958i.setVisibility(0);
        }
    }

    public XUICommonListItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.XUICommonListItemViewStyle);
    }

    public XUICommonListItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15953d = 1;
        this.f15954e = 0;
        m12637a(context, attributeSet, i10);
    }
}
