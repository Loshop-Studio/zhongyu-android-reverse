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
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.DensityUtils;
import com.xuexiang.xui.utils.DrawableUtils;
import com.xuexiang.xui.utils.ResUtils;
import com.xuexiang.xui.utils.ThemeUtils;
import com.xuexiang.xui.utils.Utils;
import com.xuexiang.xui.utils.ViewUtils;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class XUICommonListItemView extends RelativeLayout {
    public static final int ACCESSORY_TYPE_CHEVRON = 1;
    public static final int ACCESSORY_TYPE_CUSTOM = 3;
    public static final int ACCESSORY_TYPE_NONE = 0;
    public static final int ACCESSORY_TYPE_SWITCH = 2;
    public static final int HORIZONTAL = 1;
    public static final int RED_DOT_POSITION_LEFT = 0;
    public static final int RED_DOT_POSITION_RIGHT = 1;
    public static final int VERTICAL = 0;
    private int mAccessoryType;
    private ViewGroup mAccessoryView;
    protected TextView mDetailTextView;
    protected ImageView mImageView;
    private View mNewTip;
    private ViewStub mNewTipViewStub;
    private int mOrientation;
    private ImageView mRedDot;
    private int mRedDotPosition;
    protected CheckBox mSwitch;
    protected LinearLayout mTextContainer;
    protected Space mTextDetailSpace;
    protected TextView mTextView;

    public interface LayoutParamConfig {
        RelativeLayout.LayoutParams onConfig(RelativeLayout.LayoutParams layoutParams);
    }

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

    public void addAccessoryCustomView(View view) {
        if (this.mAccessoryType == 3) {
            this.mAccessoryView.addView(view);
        }
    }

    public ViewGroup getAccessoryContainerView() {
        return this.mAccessoryView;
    }

    public int getAccessoryType() {
        return this.mAccessoryType;
    }

    public CharSequence getDetailText() {
        return this.mDetailTextView.getText();
    }

    public TextView getDetailTextView() {
        return this.mDetailTextView;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public CheckBox getSwitch() {
        return this.mSwitch;
    }

    public CharSequence getText() {
        return this.mTextView.getText();
    }

    public TextView getTextView() {
        return this.mTextView;
    }

    protected void init(Context context, AttributeSet attributeSet, int i4) {
        LayoutInflater.from(context).inflate(C2042R.layout.xui_layout_common_list_item, (ViewGroup) this, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.XUICommonListItemView, i4, 0);
        int i5 = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.XUICommonListItemView_xui_orientation, 1);
        int i6 = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.XUICommonListItemView_xui_accessory_type, 0);
        int color = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.XUICommonListItemView_xui_commonList_titleColor, ResUtils.getColor(C2042R.color.xui_config_color_gray_1));
        int color2 = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.XUICommonListItemView_xui_commonList_detailColor, ResUtils.getColor(C2042R.color.xui_config_color_gray_5));
        typedArrayObtainStyledAttributes.recycle();
        this.mImageView = (ImageView) findViewById(C2042R.id.group_list_item_imageView);
        this.mTextContainer = (LinearLayout) findViewById(C2042R.id.group_list_item_textContainer);
        TextView textView = (TextView) findViewById(C2042R.id.group_list_item_textView);
        this.mTextView = textView;
        textView.setTextColor(color);
        this.mRedDot = (ImageView) findViewById(C2042R.id.group_list_item_tips_dot);
        this.mNewTipViewStub = (ViewStub) findViewById(C2042R.id.group_list_item_tips_new);
        this.mDetailTextView = (TextView) findViewById(C2042R.id.group_list_item_detailTextView);
        this.mTextDetailSpace = (Space) findViewById(C2042R.id.group_list_item_space);
        this.mDetailTextView.setTextColor(color2);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mDetailTextView.getLayoutParams();
        if (ViewUtils.getIsLastLineSpacingExtraError()) {
            layoutParams.bottomMargin = -ThemeUtils.resolveDimension(context, C2042R.attr.xui_common_list_item_detail_line_space);
        }
        if (i5 == 0) {
            layoutParams.topMargin = DensityUtils.dp2px(getContext(), 6.0f);
        } else {
            layoutParams.topMargin = 0;
        }
        this.mAccessoryView = (ViewGroup) findViewById(C2042R.id.group_list_item_accessoryView);
        setOrientation(i5);
        setAccessoryType(i6);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        int width;
        super.onLayout(z3, i4, i5, i6, i7);
        ImageView imageView = this.mRedDot;
        if (imageView != null && imageView.getVisibility() == 0) {
            int height = (getHeight() / 2) - (this.mRedDot.getMeasuredHeight() / 2);
            int left = this.mTextContainer.getLeft();
            int i8 = this.mRedDotPosition;
            if (i8 == 0) {
                width = (int) (left + this.mTextView.getPaint().measureText(this.mTextView.getText().toString()) + DensityUtils.dp2px(getContext(), 4.0f));
            } else if (i8 != 1) {
                return;
            } else {
                width = (left + this.mTextContainer.getWidth()) - this.mRedDot.getMeasuredWidth();
            }
            ImageView imageView2 = this.mRedDot;
            imageView2.layout(width, height, imageView2.getMeasuredWidth() + width, this.mRedDot.getMeasuredHeight() + height);
        }
        View view = this.mNewTip;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        int left2 = (int) (this.mTextContainer.getLeft() + this.mTextView.getPaint().measureText(this.mTextView.getText().toString()) + DensityUtils.dp2px(getContext(), 4.0f));
        int height2 = (getHeight() / 2) - (this.mNewTip.getMeasuredHeight() / 2);
        View view2 = this.mNewTip;
        view2.layout(left2, height2, view2.getMeasuredWidth() + left2, this.mNewTip.getMeasuredHeight() + height2);
    }

    public void setAccessoryType(int i4) {
        this.mAccessoryView.removeAllViews();
        this.mAccessoryType = i4;
        if (i4 == 0) {
            this.mAccessoryView.setVisibility(8);
            return;
        }
        if (i4 == 1) {
            ImageView accessoryImageView = getAccessoryImageView();
            accessoryImageView.setImageDrawable(DrawableUtils.getSupportRTLDrawable(ThemeUtils.resolveDrawable(getContext(), C2042R.attr.xui_common_list_item_chevron, ResUtils.getDrawable(getContext(), C2042R.drawable.xui_icon_chevron))));
            this.mAccessoryView.addView(accessoryImageView);
            this.mAccessoryView.setVisibility(0);
            return;
        }
        if (i4 != 2) {
            if (i4 != 3) {
                return;
            }
            this.mAccessoryView.setVisibility(0);
            return;
        }
        if (this.mSwitch == null) {
            CheckBox checkBox = new CheckBox(getContext());
            this.mSwitch = checkBox;
            checkBox.setButtonDrawable(ThemeUtils.resolveDrawable(getContext(), C2042R.attr.xui_common_list_item_switch));
            this.mSwitch.setLayoutParams(getAccessoryLayoutParams());
            this.mSwitch.setClickable(false);
            this.mSwitch.setEnabled(false);
        }
        this.mAccessoryView.addView(this.mSwitch);
        this.mAccessoryView.setVisibility(0);
    }

    public void setDetailText(CharSequence charSequence) {
        this.mDetailTextView.setText(charSequence);
        if (Utils.isNullOrEmpty(charSequence)) {
            this.mDetailTextView.setVisibility(8);
        } else {
            this.mDetailTextView.setVisibility(0);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        if (drawable == null) {
            this.mImageView.setVisibility(8);
        } else {
            this.mImageView.setImageDrawable(drawable);
            this.mImageView.setVisibility(0);
        }
    }

    public void setOrientation(int i4) {
        this.mOrientation = i4;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mTextDetailSpace.getLayoutParams();
        if (this.mOrientation == 0) {
            this.mTextContainer.setOrientation(1);
            this.mTextContainer.setGravity(8388611);
            layoutParams.width = -2;
            layoutParams.height = DensityUtils.dp2px(getContext(), 4.0f);
            layoutParams.weight = IGoodView.DEFAULT_TO_ALPHA;
            this.mTextView.setTextSize(0, ThemeUtils.resolveDimension(getContext(), C2042R.attr.xui_common_list_item_title_v_text_size));
            this.mDetailTextView.setTextSize(0, ThemeUtils.resolveDimension(getContext(), C2042R.attr.xui_common_list_item_detail_v_text_size));
            return;
        }
        this.mTextContainer.setOrientation(0);
        this.mTextContainer.setGravity(16);
        layoutParams.width = 0;
        layoutParams.height = 0;
        layoutParams.weight = 1.0f;
        this.mTextView.setTextSize(0, ThemeUtils.resolveDimension(getContext(), C2042R.attr.xui_common_list_item_title_h_text_size));
        this.mDetailTextView.setTextSize(0, ThemeUtils.resolveDimension(getContext(), C2042R.attr.xui_common_list_item_detail_h_text_size));
    }

    public void setRedDotPosition(int i4) {
        this.mRedDotPosition = i4;
        requestLayout();
    }

    public void setText(CharSequence charSequence) {
        this.mTextView.setText(charSequence);
        if (Utils.isNullOrEmpty(charSequence)) {
            this.mTextView.setVisibility(8);
        } else {
            this.mTextView.setVisibility(0);
        }
    }

    public void showNewTip(boolean z3) {
        if (z3) {
            if (this.mNewTip == null) {
                this.mNewTip = this.mNewTipViewStub.inflate();
            }
            this.mNewTip.setVisibility(0);
            this.mRedDot.setVisibility(8);
            return;
        }
        View view = this.mNewTip;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        this.mNewTip.setVisibility(8);
    }

    public void showRedDot(boolean z3) {
        showRedDot(z3, true);
    }

    public void updateImageViewLp(LayoutParamConfig layoutParamConfig) {
        if (layoutParamConfig != null) {
            this.mImageView.setLayoutParams(layoutParamConfig.onConfig((RelativeLayout.LayoutParams) this.mImageView.getLayoutParams()));
        }
    }

    public XUICommonListItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2042R.attr.XUICommonListItemViewStyle);
    }

    public void showRedDot(boolean z3, boolean z4) {
        this.mRedDot.setVisibility((z3 && z4) ? 0 : 8);
    }

    public XUICommonListItemView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mOrientation = 1;
        this.mRedDotPosition = 0;
        init(context, attributeSet, i4);
    }
}
