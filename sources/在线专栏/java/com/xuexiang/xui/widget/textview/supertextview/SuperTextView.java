package com.xuexiang.xui.widget.textview.supertextview;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.DensityUtils;
import com.xuexiang.xui.utils.ResUtils;
import com.xuexiang.xui.utils.ThemeUtils;
import com.xuexiang.xui.widget.edittext.ClearEditText;
import com.xuexiang.xui.widget.edittext.PasswordEditText;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import io.github.inflationx.calligraphy3.HasTypeface;

/* loaded from: classes.dex */
public class SuperTextView extends RelativeLayout implements HasTypeface {
    private static final int BOTH = 3;
    private static final int BOTTOM = 2;
    private static final int DEFAULT_DIVIDER = 2;
    private static final int DEFAULT_GRAVITY = 1;
    private static final int GRAVITY_CENTER = 1;
    private static final int GRAVITY_LEFT_CENTER = 0;
    private static final int GRAVITY_RIGHT_CENTER = 2;
    private static final int NONE = 0;
    private static final int TOP = 1;
    private static final int TYPE_CHECKBOX = 0;
    private static final int TYPE_CLEAR = 1;
    private static final int TYPE_NONE = 0;
    private static final int TYPE_PASSWORD = 2;
    private static final int TYPE_SWITCH = 1;
    private Drawable mBackgroundDrawable;
    private int mBottomDividerLineMarginLR;
    private int mBottomDividerLineMarginLeft;
    private int mBottomDividerLineMarginRight;
    private RelativeLayout.LayoutParams mBottomDividerLineParams;
    private View mBottomDividerLineView;
    private RelativeLayout.LayoutParams mCenterBaseViewParams;
    private int mCenterBottomLines;
    private int mCenterBottomMaxEms;
    private boolean mCenterBottomTextBold;
    private int mCenterBottomTextColor;
    private int mCenterBottomTextSize;
    private String mCenterBottomTextString;
    private OnCenterBottomTvClickListener mCenterBottomTvClickListener;
    private EditText mCenterEditText;
    private int mCenterGravity;
    private int mCenterLines;
    private int mCenterMaxEms;
    private int mCenterSpaceHeight;
    private Drawable mCenterTextBackground;
    private boolean mCenterTextBold;
    private int mCenterTextColor;
    private int mCenterTextSize;
    private String mCenterTextString;
    private int mCenterTopLines;
    private int mCenterTopMaxEms;
    private boolean mCenterTopTextBold;
    private int mCenterTopTextColor;
    private int mCenterTopTextSize;
    private String mCenterTopTextString;
    private OnCenterTopTvClickListener mCenterTopTvClickListener;
    private OnCenterTvClickListener mCenterTvClickListener;
    private int mCenterTvDrawableHeight;
    private Drawable mCenterTvDrawableLeft;
    private Drawable mCenterTvDrawableRight;
    private int mCenterTvDrawableWidth;
    private BaseTextView mCenterView;
    private int mCenterViewMarginLeft;
    private int mCenterViewMarginRight;
    private CompoundButton.OnCheckedChangeListener mCheckBoxCheckedChangeListener;
    private Context mContext;
    private float mCornersBottomLeftRadius;
    private float mCornersBottomRightRadius;
    private float mCornersRadius;
    private float mCornersTopLeftRadius;
    private float mCornersTopRightRadius;
    private int mDefaultMargin;
    private int mDefaultMaxEms;
    private int mDefaultShapeColor;
    private int mDefaultTextColor;
    private int mDefaultTextSize;
    private int mDividerLineColor;
    private int mDividerLineHeight;
    private int mDividerLineType;
    private Drawable mEditBackground;
    private int mEditTextButtonType;
    private String mEditTextHint;
    private int mEditTextInputType;
    private String mEditTextString;
    private int mEditTextWidth;
    private boolean mEnableEdit;
    private GradientDrawable mGradientDrawable;
    private boolean mIsAsteriskStyle;
    private boolean mIsChecked;
    private RelativeLayout.LayoutParams mLeftBaseViewParams;
    private int mLeftBottomLines;
    private int mLeftBottomMaxEms;
    private boolean mLeftBottomTextBold;
    private int mLeftBottomTextColor;
    private int mLeftBottomTextSize;
    private String mLeftBottomTextString;
    private OnLeftBottomTvClickListener mLeftBottomTvClickListener;
    private int mLeftGravity;
    private int mLeftIconHeight;
    private ImageView mLeftIconIV;
    private int mLeftIconMarginLeft;
    private int mLeftIconPadding;
    private Drawable mLeftIconRes;
    private ColorStateList mLeftIconTint;
    private int mLeftIconWidth;
    private OnLeftImageViewClickListener mLeftImageViewClickListener;
    private RelativeLayout.LayoutParams mLeftImgParams;
    private int mLeftLines;
    private int mLeftMaxEms;
    private Drawable mLeftTextBackground;
    private boolean mLeftTextBold;
    private int mLeftTextColor;
    private int mLeftTextSize;
    private String mLeftTextString;
    private int mLeftTopLines;
    private int mLeftTopMaxEms;
    private boolean mLeftTopTextBold;
    private int mLeftTopTextColor;
    private int mLeftTopTextSize;
    private String mLeftTopTextString;
    private OnLeftTopTvClickListener mLeftTopTvClickListener;
    private OnLeftTvClickListener mLeftTvClickListener;
    private int mLeftTvDrawableHeight;
    private Drawable mLeftTvDrawableLeft;
    private Drawable mLeftTvDrawableRight;
    private int mLeftTvDrawableWidth;
    private BaseTextView mLeftView;
    private int mLeftViewMarginLeft;
    private int mLeftViewMarginRight;
    private int mLeftViewWidth;
    private RelativeLayout.LayoutParams mRightBaseViewParams;
    private int mRightBottomLines;
    private int mRightBottomMaxEms;
    private boolean mRightBottomTextBold;
    private int mRightBottomTextColor;
    private int mRightBottomTextSize;
    private String mRightBottomTextString;
    private OnRightBottomTvClickListener mRightBottomTvClickListener;
    private CheckBox mRightCheckBox;
    private Drawable mRightCheckBoxBg;
    private int mRightCheckBoxMarginRight;
    private int mRightGravity;
    private int mRightIconHeight;
    private ImageView mRightIconIV;
    private int mRightIconMarginRight;
    private int mRightIconPadding;
    private Drawable mRightIconRes;
    private ColorStateList mRightIconTint;
    private int mRightIconWidth;
    private OnRightImageViewClickListener mRightImageViewClickListener;
    private RelativeLayout.LayoutParams mRightImgParams;
    private int mRightLines;
    private int mRightMaxEms;
    private Switch mRightSwitch;
    private int mRightSwitchMarginRight;
    private Drawable mRightTextBackground;
    private boolean mRightTextBold;
    private int mRightTextColor;
    private int mRightTextSize;
    private String mRightTextString;
    private int mRightTopLines;
    private int mRightTopMaxEms;
    private boolean mRightTopTextBold;
    private int mRightTopTextColor;
    private int mRightTopTextSize;
    private String mRightTopTextString;
    private OnRightTopTvClickListener mRightTopTvClickListener;
    private OnRightTvClickListener mRightTvClickListener;
    private int mRightTvDrawableHeight;
    private Drawable mRightTvDrawableLeft;
    private Drawable mRightTvDrawableRight;
    private int mRightTvDrawableWidth;
    private BaseTextView mRightView;
    private int mRightViewMarginLeft;
    private int mRightViewMarginRight;
    private int mRightViewType;
    private int mSelectorNormalColor;
    private int mSelectorPressedColor;
    private int mSolidColor;
    private int mStrokeColor;
    private float mStrokeDashGap;
    private float mStrokeDashWidth;
    private int mStrokeWidth;
    private OnSuperTextViewClickListener mSuperTextViewClickListener;
    private CompoundButton.OnCheckedChangeListener mSwitchCheckedChangeListener;
    private boolean mSwitchIsChecked;
    private int mSwitchMinWidth;
    private int mSwitchPadding;
    private String mSwitchTextOff;
    private String mSwitchTextOn;
    private Drawable mSwitchThumbResource;
    private Drawable mSwitchTrackResource;
    private int mTextViewDrawablePadding;
    private int mThumbTextPadding;
    private int mTopDividerLineMarginLR;
    private int mTopDividerLineMarginLeft;
    private int mTopDividerLineMarginRight;
    private RelativeLayout.LayoutParams mTopDividerLineParams;
    private View mTopDividerLineView;
    private boolean mUseRipple;
    private boolean mUseShape;

    public interface OnCenterBottomTvClickListener {
        void onClick(TextView textView);
    }

    public interface OnCenterTopTvClickListener {
        void onClick(TextView textView);
    }

    public interface OnCenterTvClickListener {
        void onClick(TextView textView);
    }

    public interface OnLeftBottomTvClickListener {
        void onClick(TextView textView);
    }

    public interface OnLeftImageViewClickListener {
        void onClick(ImageView imageView);
    }

    public interface OnLeftTopTvClickListener {
        void onClick(TextView textView);
    }

    public interface OnLeftTvClickListener {
        void onClick(TextView textView);
    }

    public interface OnRightBottomTvClickListener {
        void onClick(TextView textView);
    }

    public interface OnRightImageViewClickListener {
        void onClick(ImageView imageView);
    }

    public interface OnRightTopTvClickListener {
        void onClick(TextView textView);
    }

    public interface OnRightTvClickListener {
        void onClick(TextView textView);
    }

    public interface OnSuperTextViewClickListener {
        void onClick(SuperTextView superTextView);
    }

    public SuperTextView(Context context) {
        super(context);
        this.mEnableEdit = false;
        this.mEditTextWidth = -1;
        this.mEditTextButtonType = 1;
        initAttrs(context, null);
    }

    private void getAttr(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = this.mContext.obtainStyledAttributes(attributeSet, C2042R.styleable.SuperTextView);
        this.mLeftTextString = typedArrayObtainStyledAttributes.getString(C2042R.styleable.SuperTextView_sLeftTextString);
        this.mLeftTopTextString = typedArrayObtainStyledAttributes.getString(C2042R.styleable.SuperTextView_sLeftTopTextString);
        this.mLeftBottomTextString = typedArrayObtainStyledAttributes.getString(C2042R.styleable.SuperTextView_sLeftBottomTextString);
        this.mCenterTextString = typedArrayObtainStyledAttributes.getString(C2042R.styleable.SuperTextView_sCenterTextString);
        this.mCenterTopTextString = typedArrayObtainStyledAttributes.getString(C2042R.styleable.SuperTextView_sCenterTopTextString);
        this.mCenterBottomTextString = typedArrayObtainStyledAttributes.getString(C2042R.styleable.SuperTextView_sCenterBottomTextString);
        this.mRightTextString = typedArrayObtainStyledAttributes.getString(C2042R.styleable.SuperTextView_sRightTextString);
        this.mRightTopTextString = typedArrayObtainStyledAttributes.getString(C2042R.styleable.SuperTextView_sRightTopTextString);
        this.mRightBottomTextString = typedArrayObtainStyledAttributes.getString(C2042R.styleable.SuperTextView_sRightBottomTextString);
        this.mLeftTextColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.SuperTextView_sLeftTextColor, this.mDefaultTextColor);
        this.mLeftTopTextColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.SuperTextView_sLeftTopTextColor, this.mDefaultTextColor);
        this.mLeftBottomTextColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.SuperTextView_sLeftBottomTextColor, this.mDefaultTextColor);
        this.mCenterTextColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.SuperTextView_sCenterTextColor, this.mDefaultTextColor);
        this.mCenterTopTextColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.SuperTextView_sCenterTopTextColor, this.mDefaultTextColor);
        this.mCenterBottomTextColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.SuperTextView_sCenterBottomTextColor, this.mDefaultTextColor);
        this.mRightTextColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.SuperTextView_sRightTextColor, this.mDefaultTextColor);
        this.mRightTopTextColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.SuperTextView_sRightTopTextColor, this.mDefaultTextColor);
        this.mRightBottomTextColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.SuperTextView_sRightBottomTextColor, this.mDefaultTextColor);
        this.mLeftTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sLeftTextSize, this.mDefaultTextSize);
        this.mLeftTopTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sLeftTopTextSize, this.mDefaultTextSize);
        this.mLeftBottomTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sLeftBottomTextSize, this.mDefaultTextSize);
        this.mCenterTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sCenterTextSize, this.mDefaultTextSize);
        this.mCenterTopTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sCenterTopTextSize, this.mDefaultTextSize);
        this.mCenterBottomTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sCenterBottomTextSize, this.mDefaultTextSize);
        this.mRightTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sRightTextSize, this.mDefaultTextSize);
        this.mRightTopTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sRightTopTextSize, this.mDefaultTextSize);
        this.mRightBottomTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sRightBottomTextSize, this.mDefaultTextSize);
        this.mLeftTopLines = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.SuperTextView_sLeftTopLines, 1);
        this.mLeftLines = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.SuperTextView_sLeftLines, 1);
        this.mLeftBottomLines = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.SuperTextView_sLeftBottomLines, 1);
        this.mCenterTopLines = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.SuperTextView_sCenterTopLines, 1);
        this.mCenterLines = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.SuperTextView_sCenterLines, 1);
        this.mCenterBottomLines = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.SuperTextView_sCenterBottomLines, 1);
        this.mRightTopLines = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.SuperTextView_sRightTopLines, 1);
        this.mRightLines = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.SuperTextView_sRightLines, 1);
        this.mRightBottomLines = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.SuperTextView_sRightBottomLines, 1);
        this.mLeftTopMaxEms = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.SuperTextView_sLeftTopMaxEms, this.mDefaultMaxEms);
        this.mLeftMaxEms = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.SuperTextView_sLeftMaxEms, this.mDefaultMaxEms);
        this.mLeftBottomMaxEms = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.SuperTextView_sLeftBottomMaxEms, this.mDefaultMaxEms);
        this.mCenterTopMaxEms = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.SuperTextView_sCenterTopMaxEms, this.mDefaultMaxEms);
        this.mCenterMaxEms = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.SuperTextView_sCenterMaxEms, this.mDefaultMaxEms);
        this.mCenterBottomMaxEms = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.SuperTextView_sCenterBottomMaxEms, this.mDefaultMaxEms);
        this.mRightTopMaxEms = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.SuperTextView_sRightTopMaxEms, this.mDefaultMaxEms);
        this.mRightMaxEms = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.SuperTextView_sRightMaxEms, this.mDefaultMaxEms);
        this.mRightBottomMaxEms = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.SuperTextView_sRightBottomMaxEms, this.mDefaultMaxEms);
        this.mLeftGravity = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.SuperTextView_sLeftViewGravity, 1);
        this.mCenterGravity = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.SuperTextView_sCenterViewGravity, 1);
        this.mRightGravity = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.SuperTextView_sRightViewGravity, 1);
        this.mLeftTvDrawableLeft = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.SuperTextView_sLeftTvDrawableLeft);
        this.mLeftTvDrawableRight = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.SuperTextView_sLeftTvDrawableRight);
        this.mCenterTvDrawableLeft = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.SuperTextView_sCenterTvDrawableLeft);
        this.mCenterTvDrawableRight = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.SuperTextView_sCenterTvDrawableRight);
        this.mRightTvDrawableLeft = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.SuperTextView_sRightTvDrawableLeft);
        this.mRightTvDrawableRight = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.SuperTextView_sRightTvDrawableRight);
        this.mTextViewDrawablePadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sTextViewDrawablePadding, this.mDefaultMargin);
        this.mLeftTvDrawableWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sLeftTvDrawableWidth, -1);
        this.mLeftTvDrawableHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sLeftTvDrawableHeight, -1);
        this.mCenterTvDrawableWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sCenterTvDrawableWidth, -1);
        this.mCenterTvDrawableHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sCenterTvDrawableHeight, -1);
        this.mRightTvDrawableWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sRightTvDrawableWidth, -1);
        this.mRightTvDrawableHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sRightTvDrawableHeight, -1);
        this.mLeftViewWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sLeftViewWidth, 0);
        this.mTopDividerLineMarginLR = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sTopDividerLineMarginLR, 0);
        this.mTopDividerLineMarginLeft = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sTopDividerLineMarginLeft, 0);
        this.mTopDividerLineMarginRight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sTopDividerLineMarginRight, 0);
        this.mBottomDividerLineMarginLR = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sBottomDividerLineMarginLR, 0);
        this.mBottomDividerLineMarginLeft = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sBottomDividerLineMarginLeft, 0);
        this.mBottomDividerLineMarginRight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sBottomDividerLineMarginRight, 0);
        this.mDividerLineType = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.SuperTextView_sDividerLineType, 2);
        this.mDividerLineColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.SuperTextView_sDividerLineColor, ThemeUtils.resolveColor(getContext(), C2042R.attr.xui_config_color_separator_light));
        this.mDividerLineHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sDividerLineHeight, DensityUtils.dp2px(this.mContext, 0.5f));
        this.mLeftViewMarginLeft = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sLeftViewMarginLeft, this.mDefaultMargin);
        this.mLeftViewMarginRight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sLeftViewMarginRight, this.mDefaultMargin);
        this.mCenterViewMarginLeft = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sCenterViewMarginLeft, 0);
        this.mCenterViewMarginRight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sCenterViewMarginRight, 0);
        this.mRightViewMarginLeft = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sRightViewMarginLeft, this.mDefaultMargin);
        this.mRightViewMarginRight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sRightViewMarginRight, this.mDefaultMargin);
        this.mLeftIconRes = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.SuperTextView_sLeftIconRes);
        this.mLeftIconWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sLeftIconWidth, 0);
        this.mLeftIconHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sLeftIconHeight, 0);
        this.mLeftIconMarginLeft = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sLeftIconMarginLeft, this.mDefaultMargin);
        Context context = getContext();
        int i4 = C2042R.styleable.SuperTextView_sLeftIconTint;
        this.mLeftIconTint = ResUtils.getColorStateListAttrRes(context, typedArrayObtainStyledAttributes, i4);
        int i5 = C2042R.styleable.SuperTextView_sLeftIconPadding;
        this.mLeftIconPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(i5, 0);
        this.mRightIconRes = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.SuperTextView_sRightIconRes);
        this.mRightIconWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sRightIconWidth, 0);
        this.mRightIconHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sRightIconHeight, 0);
        this.mRightIconMarginRight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sRightIconMarginRight, this.mDefaultMargin);
        this.mRightIconTint = ResUtils.getColorStateListAttrRes(getContext(), typedArrayObtainStyledAttributes, i4);
        this.mRightIconPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(i5, 0);
        this.mLeftTopTextBold = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.SuperTextView_sLeftTopTextIsBold, false);
        this.mLeftTextBold = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.SuperTextView_sLeftTextIsBold, false);
        this.mLeftBottomTextBold = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.SuperTextView_sLeftBottomTextIsBold, false);
        this.mCenterTopTextBold = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.SuperTextView_sCenterTopTextIsBold, false);
        this.mCenterTextBold = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.SuperTextView_sCenterTextIsBold, false);
        this.mCenterBottomTextBold = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.SuperTextView_sCenterBottomTextIsBold, false);
        this.mRightTopTextBold = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.SuperTextView_sRightTopTextIsBold, false);
        this.mRightTextBold = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.SuperTextView_sRightTextIsBold, false);
        this.mRightBottomTextBold = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.SuperTextView_sRightBottomTextIsBold, false);
        this.mLeftTextBackground = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.SuperTextView_sLeftTextBackground);
        this.mCenterTextBackground = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.SuperTextView_sCenterTextBackground);
        this.mRightTextBackground = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.SuperTextView_sRightTextBackground);
        this.mEnableEdit = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.SuperTextView_sEnableEdit, this.mEnableEdit);
        this.mEditBackground = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.SuperTextView_sEditBackGround);
        this.mEditTextWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sEditTextWidth, this.mEditTextWidth);
        this.mEditTextString = typedArrayObtainStyledAttributes.getString(C2042R.styleable.SuperTextView_sEditTextString);
        this.mEditTextHint = typedArrayObtainStyledAttributes.getString(C2042R.styleable.SuperTextView_sEditTextHint);
        this.mEditTextInputType = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.SuperTextView_android_inputType, -1);
        this.mEditTextButtonType = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.SuperTextView_sEditTextButtonType, this.mEditTextButtonType);
        this.mIsAsteriskStyle = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.SuperTextView_sEditTextIsAsteriskStyle, this.mIsAsteriskStyle);
        this.mUseRipple = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.SuperTextView_sUseRipple, true);
        this.mBackgroundDrawable = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.SuperTextView_sBackgroundDrawableRes);
        this.mRightViewType = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.SuperTextView_sRightViewType, -1);
        this.mIsChecked = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.SuperTextView_sIsChecked, false);
        this.mRightCheckBoxMarginRight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sRightCheckBoxMarginRight, this.mDefaultMargin);
        this.mRightCheckBoxBg = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.SuperTextView_sRightCheckBoxRes);
        this.mRightSwitchMarginRight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sRightSwitchMarginRight, this.mDefaultMargin);
        this.mSwitchIsChecked = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.SuperTextView_sSwitchIsChecked, false);
        this.mSwitchTextOff = typedArrayObtainStyledAttributes.getString(C2042R.styleable.SuperTextView_sTextOff);
        this.mSwitchTextOn = typedArrayObtainStyledAttributes.getString(C2042R.styleable.SuperTextView_sTextOn);
        this.mSwitchMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sSwitchMinWidth, 0);
        this.mSwitchPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sSwitchPadding, 0);
        this.mThumbTextPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sThumbTextPadding, 0);
        this.mSwitchThumbResource = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.SuperTextView_sThumbResource);
        this.mSwitchTrackResource = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.SuperTextView_sTrackResource);
        this.mCenterSpaceHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sCenterSpaceHeight, DensityUtils.dp2px(this.mContext, 5.0f));
        this.mSelectorPressedColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.SuperTextView_sShapeSelectorPressedColor, this.mDefaultShapeColor);
        this.mSelectorNormalColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.SuperTextView_sShapeSelectorNormalColor, this.mDefaultShapeColor);
        this.mSolidColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.SuperTextView_sShapeSolidColor, this.mDefaultShapeColor);
        this.mCornersRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sShapeCornersRadius, 0);
        this.mCornersTopLeftRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sShapeCornersTopLeftRadius, 0);
        this.mCornersTopRightRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sShapeCornersTopRightRadius, 0);
        this.mCornersBottomLeftRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sShapeCornersBottomLeftRadius, 0);
        this.mCornersBottomRightRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sShapeCornersBottomRightRadius, 0);
        this.mStrokeWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sShapeStrokeWidth, 0);
        this.mStrokeDashWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sShapeStrokeDashWidth, 0);
        this.mStrokeDashGap = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.SuperTextView_sShapeStrokeDashGap, 0);
        this.mStrokeColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.SuperTextView_sShapeStrokeColor, this.mDefaultShapeColor);
        this.mUseShape = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.SuperTextView_sUseShape, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private RelativeLayout.LayoutParams getParams(RelativeLayout.LayoutParams layoutParams) {
        return layoutParams == null ? new RelativeLayout.LayoutParams(-2, -2) : layoutParams;
    }

    private void initAttrs(Context context, AttributeSet attributeSet) {
        this.mContext = context;
        this.mDefaultTextColor = ThemeUtils.resolveColor(context, C2042R.attr.stv_color_common_text, ResUtils.getColor(C2042R.color.stv_color_common_text));
        this.mDefaultTextSize = ThemeUtils.resolveDimension(context, C2042R.attr.stv_text_size, ResUtils.getDimensionPixelSize(C2042R.dimen.default_stv_text_size));
        this.mDefaultMaxEms = ThemeUtils.resolveInt(context, C2042R.attr.stv_max_ems, 20);
        this.mDefaultMargin = ThemeUtils.resolveDimension(context, C2042R.attr.stv_margin, ResUtils.getDimensionPixelSize(C2042R.dimen.default_stv_margin));
        this.mDefaultShapeColor = ThemeUtils.resolveColor(context, C2042R.attr.stv_color_shape, ResUtils.getColor(C2042R.color.xui_config_color_white));
        getAttr(attributeSet);
        initView();
    }

    private BaseTextView initBaseView(int i4) {
        BaseTextView baseTextView = new BaseTextView(this.mContext);
        baseTextView.setId(i4);
        return baseTextView;
    }

    private void initBottomDividerLineView(int i4, int i5) {
        if (this.mBottomDividerLineView == null) {
            if (this.mBottomDividerLineParams == null) {
                this.mBottomDividerLineParams = new RelativeLayout.LayoutParams(-1, this.mDividerLineHeight);
            }
            this.mBottomDividerLineParams.addRule(12, -1);
            this.mBottomDividerLineParams.setMarginStart(i4);
            this.mBottomDividerLineParams.setMarginEnd(i5);
            View view = new View(this.mContext);
            this.mBottomDividerLineView = view;
            view.setLayoutParams(this.mBottomDividerLineParams);
            this.mBottomDividerLineView.setBackgroundColor(this.mDividerLineColor);
        }
        addView(this.mBottomDividerLineView);
    }

    private void initCenterTextView() {
        if (!this.mEnableEdit) {
            if (this.mCenterView == null) {
                this.mCenterView = initBaseView(C2042R.id.sCenterViewId);
            }
            RelativeLayout.LayoutParams params = getParams(this.mCenterBaseViewParams);
            this.mCenterBaseViewParams = params;
            params.addRule(13, -1);
            this.mCenterBaseViewParams.addRule(15, -1);
            if (this.mCenterGravity != 1) {
                this.mCenterBaseViewParams.addRule(17, C2042R.id.sLeftViewId);
                this.mCenterBaseViewParams.addRule(16, C2042R.id.sRightViewId);
            }
            this.mCenterBaseViewParams.setMargins(this.mCenterViewMarginLeft, 0, this.mCenterViewMarginRight, 0);
            this.mCenterBaseViewParams.setMarginStart(this.mCenterViewMarginLeft);
            this.mCenterBaseViewParams.setMarginEnd(this.mCenterViewMarginRight);
            this.mCenterView.setLayoutParams(this.mCenterBaseViewParams);
            this.mCenterView.setCenterSpaceHeight(this.mCenterSpaceHeight);
            setDefaultColor(this.mCenterView, this.mCenterTopTextColor, this.mCenterTextColor, this.mCenterBottomTextColor);
            setDefaultSize(this.mCenterView, this.mCenterTopTextSize, this.mCenterTextSize, this.mCenterBottomTextSize);
            setDefaultLines(this.mCenterView, this.mCenterTopLines, this.mCenterLines, this.mCenterBottomLines);
            setDefaultMaxEms(this.mCenterView, this.mCenterTopMaxEms, this.mCenterMaxEms, this.mCenterBottomMaxEms);
            setDefaultTextIsBold(this.mCenterView, this.mCenterTopTextBold, this.mCenterTextBold, this.mCenterBottomTextBold);
            setDefaultGravity(this.mCenterView, this.mCenterGravity);
            setDefaultDrawable(this.mCenterView.getCenterTextView(), this.mCenterTvDrawableLeft, this.mCenterTvDrawableRight, this.mTextViewDrawablePadding, this.mCenterTvDrawableWidth, this.mCenterTvDrawableHeight);
            setDefaultBackground(this.mCenterView.getCenterTextView(), this.mCenterTextBackground);
            setDefaultString(this.mCenterView, this.mCenterTopTextString, this.mCenterTextString, this.mCenterBottomTextString);
            addView(this.mCenterView);
            return;
        }
        if (this.mCenterEditText == null) {
            int i4 = this.mEditTextButtonType;
            if (i4 == 0) {
                this.mCenterEditText = new AppCompatEditText(this.mContext);
            } else if (i4 == 1) {
                this.mCenterEditText = new ClearEditText(this.mContext);
            } else if (i4 == 2) {
                PasswordEditText passwordEditText = new PasswordEditText(this.mContext);
                this.mCenterEditText = passwordEditText;
                passwordEditText.setIsAsteriskStyle(this.mIsAsteriskStyle);
            }
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.mEditTextWidth, -2);
        layoutParams.addRule(13, -1);
        layoutParams.addRule(15, -1);
        if (this.mCenterGravity != 1) {
            layoutParams.addRule(17, C2042R.id.sLeftViewId);
            layoutParams.addRule(16, C2042R.id.sRightViewId);
        }
        layoutParams.setMargins(this.mCenterViewMarginLeft, 0, this.mCenterViewMarginRight, 0);
        layoutParams.setMarginStart(this.mCenterViewMarginLeft);
        layoutParams.setMarginEnd(this.mCenterViewMarginRight);
        this.mCenterEditText.setId(C2042R.id.sCenterEditTextId);
        this.mCenterEditText.setLayoutParams(layoutParams);
        Drawable drawable = this.mEditBackground;
        if (drawable != null) {
            this.mCenterEditText.setBackground(drawable);
        } else {
            this.mCenterEditText.setBackgroundColor(ResUtils.getColor(C2042R.color.xui_config_color_transparent));
        }
        this.mCenterEditText.setTextColor(this.mCenterTextColor);
        this.mCenterEditText.setTextSize(0, this.mCenterTextSize);
        this.mCenterEditText.setMaxLines(this.mCenterLines);
        this.mCenterEditText.setText(this.mEditTextString);
        this.mCenterEditText.setHint(this.mEditTextHint);
        int i5 = this.mEditTextInputType;
        if (i5 != -1) {
            this.mCenterEditText.setInputType(i5);
        }
        addView(this.mCenterEditText);
    }

    private void initDividerLineView() {
        if (this.mUseShape) {
            return;
        }
        int i4 = this.mDividerLineType;
        if (i4 == 1) {
            setTopDividerLineView();
            return;
        }
        if (i4 == 2) {
            setBottomDividerLineView();
        } else {
            if (i4 != 3) {
                return;
            }
            setTopDividerLineView();
            setBottomDividerLineView();
        }
    }

    private void initExtraView() {
        int i4 = this.mRightViewType;
        if (i4 == 0) {
            initRightCheckBox();
        } else {
            if (i4 != 1) {
                return;
            }
            initRightSwitch();
        }
    }

    private void initLeftIcon() {
        int i4;
        if (this.mLeftIconIV == null) {
            this.mLeftIconIV = new AppCompatImageView(this.mContext);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        this.mLeftImgParams = layoutParams;
        layoutParams.addRule(20, -1);
        this.mLeftImgParams.addRule(15, -1);
        int i5 = this.mLeftIconHeight;
        if (i5 != 0 && (i4 = this.mLeftIconWidth) != 0) {
            RelativeLayout.LayoutParams layoutParams2 = this.mLeftImgParams;
            layoutParams2.width = i4;
            layoutParams2.height = i5;
        }
        this.mLeftIconIV.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.mLeftIconIV.setId(C2042R.id.sLeftImgId);
        this.mLeftIconIV.setLayoutParams(this.mLeftImgParams);
        ImageView imageView = this.mLeftIconIV;
        int i6 = this.mLeftIconPadding;
        imageView.setPadding(i6, i6, i6, i6);
        if (this.mLeftIconRes != null) {
            this.mLeftImgParams.setMargins(this.mLeftIconMarginLeft, 0, 0, 0);
            this.mLeftImgParams.setMarginStart(this.mLeftIconMarginLeft);
            this.mLeftIconIV.setImageDrawable(this.mLeftIconRes);
        }
        ColorStateList colorStateList = this.mLeftIconTint;
        if (colorStateList != null) {
            this.mLeftIconIV.setImageTintList(colorStateList);
        }
        addView(this.mLeftIconIV);
    }

    private void initLeftTextView() {
        if (this.mLeftView == null) {
            this.mLeftView = initBaseView(C2042R.id.sLeftViewId);
        }
        RelativeLayout.LayoutParams params = getParams(this.mLeftBaseViewParams);
        this.mLeftBaseViewParams = params;
        params.addRule(17, C2042R.id.sLeftImgId);
        this.mLeftBaseViewParams.addRule(15, -1);
        int i4 = this.mLeftViewWidth;
        if (i4 != 0) {
            this.mLeftBaseViewParams.width = i4;
        }
        this.mLeftBaseViewParams.setMargins(this.mLeftViewMarginLeft, 0, this.mLeftViewMarginRight, 0);
        this.mLeftView.setLayoutParams(this.mLeftBaseViewParams);
        this.mLeftView.setCenterSpaceHeight(this.mCenterSpaceHeight);
        setDefaultColor(this.mLeftView, this.mLeftTopTextColor, this.mLeftTextColor, this.mLeftBottomTextColor);
        setDefaultSize(this.mLeftView, this.mLeftTopTextSize, this.mLeftTextSize, this.mLeftBottomTextSize);
        setDefaultLines(this.mLeftView, this.mLeftTopLines, this.mLeftLines, this.mLeftBottomLines);
        setDefaultMaxEms(this.mLeftView, this.mLeftTopMaxEms, this.mLeftMaxEms, this.mLeftBottomMaxEms);
        setDefaultTextIsBold(this.mLeftView, this.mLeftTopTextBold, this.mLeftTextBold, this.mLeftBottomTextBold);
        setDefaultGravity(this.mLeftView, this.mLeftGravity);
        setDefaultDrawable(this.mLeftView.getCenterTextView(), this.mLeftTvDrawableLeft, this.mLeftTvDrawableRight, this.mTextViewDrawablePadding, this.mLeftTvDrawableWidth, this.mLeftTvDrawableHeight);
        setDefaultBackground(this.mLeftView.getCenterTextView(), this.mLeftTextBackground);
        setDefaultString(this.mLeftView, this.mLeftTopTextString, this.mLeftTextString, this.mLeftBottomTextString);
        addView(this.mLeftView);
    }

    private void initRightCheckBox() {
        if (this.mRightCheckBox == null) {
            this.mRightCheckBox = new CheckBox(this.mContext);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(21, -1);
        layoutParams.addRule(15, -1);
        layoutParams.setMargins(0, 0, this.mRightCheckBoxMarginRight, 0);
        layoutParams.setMarginEnd(this.mRightCheckBoxMarginRight);
        this.mRightCheckBox.setId(C2042R.id.sRightCheckBoxId);
        this.mRightCheckBox.setLayoutParams(layoutParams);
        if (this.mRightCheckBoxBg != null) {
            this.mRightCheckBox.setGravity(13);
            this.mRightCheckBox.setButtonDrawable(this.mRightCheckBoxBg);
        }
        this.mRightCheckBox.setChecked(this.mIsChecked);
        this.mRightCheckBox.setOnCheckedChangeListener(this.mCheckBoxCheckedChangeListener);
        addView(this.mRightCheckBox);
    }

    private void initRightIcon() {
        int i4;
        if (this.mRightIconIV == null) {
            this.mRightIconIV = new AppCompatImageView(this.mContext);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        this.mRightImgParams = layoutParams;
        layoutParams.addRule(15, -1);
        int i5 = this.mRightViewType;
        if (i5 == 0) {
            this.mRightImgParams.addRule(16, C2042R.id.sRightCheckBoxId);
        } else if (i5 != 1) {
            this.mRightImgParams.addRule(21, -1);
        } else {
            this.mRightImgParams.addRule(16, C2042R.id.sRightSwitchId);
        }
        int i6 = this.mRightIconHeight;
        if (i6 != 0 && (i4 = this.mRightIconWidth) != 0) {
            RelativeLayout.LayoutParams layoutParams2 = this.mRightImgParams;
            layoutParams2.width = i4;
            layoutParams2.height = i6;
        }
        this.mRightIconIV.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.mRightIconIV.setId(C2042R.id.sRightImgId);
        this.mRightIconIV.setLayoutParams(this.mRightImgParams);
        ImageView imageView = this.mRightIconIV;
        int i7 = this.mRightIconPadding;
        imageView.setPadding(i7, i7, i7, i7);
        if (this.mRightIconRes != null) {
            this.mRightImgParams.setMargins(0, 0, this.mRightIconMarginRight, 0);
            this.mRightImgParams.setMarginEnd(this.mRightIconMarginRight);
            this.mRightIconIV.setImageDrawable(this.mRightIconRes);
        }
        ColorStateList colorStateList = this.mRightIconTint;
        if (colorStateList != null) {
            this.mRightIconIV.setImageTintList(colorStateList);
        }
        addView(this.mRightIconIV);
    }

    private void initRightSwitch() {
        if (this.mRightSwitch == null) {
            this.mRightSwitch = new Switch(this.mContext);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(21, -1);
        layoutParams.addRule(15, -1);
        layoutParams.setMargins(0, 0, this.mRightSwitchMarginRight, 0);
        layoutParams.setMarginEnd(this.mRightSwitchMarginRight);
        this.mRightSwitch.setId(C2042R.id.sRightSwitchId);
        this.mRightSwitch.setLayoutParams(layoutParams);
        this.mRightSwitch.setChecked(this.mSwitchIsChecked);
        if (!TextUtils.isEmpty(this.mSwitchTextOff)) {
            this.mRightSwitch.setTextOff(this.mSwitchTextOff);
        }
        if (!TextUtils.isEmpty(this.mSwitchTextOn)) {
            this.mRightSwitch.setTextOn(this.mSwitchTextOn);
        }
        int i4 = this.mSwitchMinWidth;
        if (i4 != 0) {
            this.mRightSwitch.setSwitchMinWidth(i4);
        }
        int i5 = this.mSwitchPadding;
        if (i5 != 0) {
            this.mRightSwitch.setSwitchPadding(i5);
        }
        Drawable drawable = this.mSwitchThumbResource;
        if (drawable != null) {
            this.mRightSwitch.setThumbDrawable(drawable);
        }
        if (this.mSwitchThumbResource != null) {
            this.mRightSwitch.setTrackDrawable(this.mSwitchTrackResource);
        }
        int i6 = this.mThumbTextPadding;
        if (i6 != 0) {
            this.mRightSwitch.setThumbTextPadding(i6);
        }
        this.mRightSwitch.setOnCheckedChangeListener(this.mSwitchCheckedChangeListener);
        addView(this.mRightSwitch);
    }

    private void initRightTextView() {
        if (this.mRightView == null) {
            this.mRightView = initBaseView(C2042R.id.sRightViewId);
        }
        RelativeLayout.LayoutParams params = getParams(this.mRightBaseViewParams);
        this.mRightBaseViewParams = params;
        params.addRule(15, -1);
        this.mRightBaseViewParams.addRule(16, C2042R.id.sRightImgId);
        this.mRightBaseViewParams.setMargins(this.mRightViewMarginLeft, 0, this.mRightViewMarginRight, 0);
        this.mRightBaseViewParams.setMarginStart(this.mRightViewMarginLeft);
        this.mRightBaseViewParams.setMarginEnd(this.mRightViewMarginRight);
        this.mRightView.setLayoutParams(this.mRightBaseViewParams);
        this.mRightView.setCenterSpaceHeight(this.mCenterSpaceHeight);
        setDefaultColor(this.mRightView, this.mRightTopTextColor, this.mRightTextColor, this.mRightBottomTextColor);
        setDefaultSize(this.mRightView, this.mRightTopTextSize, this.mRightTextSize, this.mRightBottomTextSize);
        setDefaultLines(this.mRightView, this.mRightTopLines, this.mRightLines, this.mRightBottomLines);
        setDefaultMaxEms(this.mRightView, this.mRightTopMaxEms, this.mRightMaxEms, this.mRightBottomMaxEms);
        setDefaultTextIsBold(this.mRightView, this.mRightTopTextBold, this.mRightTextBold, this.mRightBottomTextBold);
        setDefaultGravity(this.mRightView, this.mRightGravity);
        setDefaultDrawable(this.mRightView.getCenterTextView(), this.mRightTvDrawableLeft, this.mRightTvDrawableRight, this.mTextViewDrawablePadding, this.mRightTvDrawableWidth, this.mRightTvDrawableHeight);
        setDefaultBackground(this.mRightView.getCenterTextView(), this.mRightTextBackground);
        setDefaultString(this.mRightView, this.mRightTopTextString, this.mRightTextString, this.mRightBottomTextString);
        addView(this.mRightView);
    }

    private void initSuperTextView() {
        if (this.mUseRipple) {
            setBackgroundResource(C2042R.drawable.stv_btn_selector_white);
            setClickable(true);
        }
        Drawable drawable = this.mBackgroundDrawable;
        if (drawable != null) {
            setBackgroundDrawable(drawable);
        }
        if (this.mUseShape) {
            setBackground(getSelector());
        }
    }

    private void initTopDividerLineView(int i4, int i5) {
        if (this.mTopDividerLineView == null) {
            if (this.mTopDividerLineParams == null) {
                this.mTopDividerLineParams = new RelativeLayout.LayoutParams(-1, this.mDividerLineHeight);
            }
            this.mTopDividerLineParams.addRule(10, -1);
            this.mTopDividerLineParams.setMarginStart(i4);
            this.mTopDividerLineParams.setMarginEnd(i5);
            View view = new View(this.mContext);
            this.mTopDividerLineView = view;
            view.setLayoutParams(this.mTopDividerLineParams);
            this.mTopDividerLineView.setBackgroundColor(this.mDividerLineColor);
        }
        addView(this.mTopDividerLineView);
    }

    private void initView() {
        initSuperTextView();
        initLeftIcon();
        initExtraView();
        initRightIcon();
        initLeftTextView();
        initCenterTextView();
        initRightTextView();
        initDividerLineView();
    }

    private void setBorder() {
        this.mGradientDrawable.setStroke(this.mStrokeWidth, this.mStrokeColor, this.mStrokeDashWidth, this.mStrokeDashGap);
    }

    private void setBottomDividerLineView() {
        int i4 = this.mBottomDividerLineMarginLR;
        if (i4 != 0) {
            initBottomDividerLineView(i4, i4);
        } else {
            initBottomDividerLineView(this.mBottomDividerLineMarginLeft, this.mBottomDividerLineMarginRight);
        }
    }

    private void setDefaultBackground(TextView textView, Drawable drawable) {
        if (drawable != null) {
            textView.setVisibility(0);
            textView.setBackground(drawable);
        }
    }

    private void setDefaultCenterViewClickListener(final BaseTextView baseTextView) {
        if (baseTextView != null) {
            if (this.mCenterTopTvClickListener != null) {
                baseTextView.getTopTextView().setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.textview.supertextview.SuperTextView.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        SuperTextView.this.mCenterTopTvClickListener.onClick(baseTextView.getTopTextView());
                    }
                });
            }
            if (this.mCenterTvClickListener != null) {
                baseTextView.getCenterTextView().setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.textview.supertextview.SuperTextView.5
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        SuperTextView.this.mCenterTvClickListener.onClick(baseTextView.getCenterTextView());
                    }
                });
            }
            if (this.mCenterBottomTvClickListener != null) {
                baseTextView.getBottomTextView().setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.textview.supertextview.SuperTextView.6
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        SuperTextView.this.mCenterBottomTvClickListener.onClick(baseTextView.getBottomTextView());
                    }
                });
            }
        }
    }

    private void setDefaultColor(BaseTextView baseTextView, int i4, int i5, int i6) {
        if (baseTextView != null) {
            baseTextView.getTopTextView().setTextColor(i4);
            baseTextView.getCenterTextView().setTextColor(i5);
            baseTextView.getBottomTextView().setTextColor(i6);
        }
    }

    private void setDefaultGravity(BaseTextView baseTextView, int i4) {
        if (baseTextView != null) {
            setGravity(baseTextView, i4);
        }
    }

    private void setDefaultLeftViewClickListener(final BaseTextView baseTextView) {
        if (baseTextView != null) {
            if (this.mLeftTopTvClickListener != null) {
                baseTextView.getTopTextView().setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.textview.supertextview.SuperTextView.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        SuperTextView.this.mLeftTopTvClickListener.onClick(baseTextView.getTopTextView());
                    }
                });
            }
            if (this.mLeftTvClickListener != null) {
                baseTextView.getCenterTextView().setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.textview.supertextview.SuperTextView.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        SuperTextView.this.mLeftTvClickListener.onClick(baseTextView.getCenterTextView());
                    }
                });
            }
            if (this.mLeftBottomTvClickListener != null) {
                baseTextView.getBottomTextView().setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.textview.supertextview.SuperTextView.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        SuperTextView.this.mLeftBottomTvClickListener.onClick(baseTextView.getBottomTextView());
                    }
                });
            }
        }
    }

    private void setDefaultLines(BaseTextView baseTextView, int i4, int i5, int i6) {
        if (baseTextView != null) {
            baseTextView.getTopTextView().setMaxLines(i4);
            baseTextView.getCenterTextView().setMaxLines(i5);
            baseTextView.getBottomTextView().setMaxLines(i6);
        }
    }

    private void setDefaultMaxEms(BaseTextView baseTextView, int i4, int i5, int i6) {
        if (baseTextView != null) {
            baseTextView.setMaxEms(i4, i5, i6);
        }
    }

    private void setDefaultRightViewClickListener(final BaseTextView baseTextView) {
        if (baseTextView != null) {
            if (this.mRightTopTvClickListener != null) {
                baseTextView.getTopTextView().setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.textview.supertextview.SuperTextView.7
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        SuperTextView.this.mRightTopTvClickListener.onClick(baseTextView.getTopTextView());
                    }
                });
            }
            if (this.mRightTvClickListener != null) {
                baseTextView.getCenterTextView().setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.textview.supertextview.SuperTextView.8
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        SuperTextView.this.mRightTvClickListener.onClick(baseTextView.getCenterTextView());
                    }
                });
            }
            if (this.mRightBottomTvClickListener != null) {
                baseTextView.getBottomTextView().setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.textview.supertextview.SuperTextView.9
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        SuperTextView.this.mRightBottomTvClickListener.onClick(baseTextView.getBottomTextView());
                    }
                });
            }
        }
    }

    private void setDefaultSize(BaseTextView baseTextView, int i4, int i5, int i6) {
        if (baseTextView != null) {
            baseTextView.getTopTextView().setTextSize(0, i4);
            baseTextView.getCenterTextView().setTextSize(0, i5);
            baseTextView.getBottomTextView().setTextSize(0, i6);
        }
    }

    private void setDefaultString(BaseTextView baseTextView, String str, String str2, String str3) {
        if (baseTextView != null) {
            baseTextView.setTopTextString(str);
            baseTextView.setCenterTextString(str2);
            baseTextView.setBottomTextString(str3);
        }
    }

    private void setDefaultTextIsBold(BaseTextView baseTextView, boolean z3, boolean z4, boolean z5) {
        if (baseTextView != null) {
            baseTextView.getTopTextView().getPaint().setFakeBoldText(z3);
            baseTextView.getCenterTextView().getPaint().setFakeBoldText(z4);
            baseTextView.getBottomTextView().getPaint().setFakeBoldText(z5);
        }
    }

    private void setGravity(BaseTextView baseTextView, int i4) {
        if (i4 == 0) {
            baseTextView.setGravity(8388627);
        } else if (i4 == 1) {
            baseTextView.setGravity(17);
        } else {
            if (i4 != 2) {
                return;
            }
            baseTextView.setGravity(8388629);
        }
    }

    private void setRadius() {
        float f4 = this.mCornersRadius;
        if (f4 != IGoodView.DEFAULT_TO_ALPHA) {
            this.mGradientDrawable.setCornerRadius(f4);
            return;
        }
        GradientDrawable gradientDrawable = this.mGradientDrawable;
        float f5 = this.mCornersTopLeftRadius;
        float f6 = this.mCornersTopRightRadius;
        float f7 = this.mCornersBottomRightRadius;
        float f8 = this.mCornersBottomLeftRadius;
        gradientDrawable.setCornerRadii(new float[]{f5, f5, f6, f6, f7, f7, f8, f8});
    }

    private void setTextGravity(BaseTextView baseTextView, int i4) {
        if (baseTextView != null) {
            baseTextView.getCenterTextView().setGravity(i4);
        }
    }

    private void setTopDividerLineView() {
        int i4 = this.mTopDividerLineMarginLR;
        if (i4 != 0) {
            initTopDividerLineView(i4, i4);
        } else {
            initTopDividerLineView(this.mTopDividerLineMarginLeft, this.mTopDividerLineMarginRight);
        }
    }

    public String getCenterBottomString() {
        BaseTextView baseTextView = this.mCenterView;
        return baseTextView != null ? baseTextView.getBottomTextView().getText().toString().trim() : "";
    }

    public TextView getCenterBottomTextView() {
        BaseTextView baseTextView = this.mCenterView;
        if (baseTextView != null) {
            return baseTextView.getBottomTextView();
        }
        return null;
    }

    public EditText getCenterEditText() {
        return this.mCenterEditText;
    }

    public String getCenterEditValue() {
        EditText editText = this.mCenterEditText;
        return editText != null ? editText.getText().toString() : "";
    }

    public String getCenterString() {
        BaseTextView baseTextView = this.mCenterView;
        return baseTextView != null ? baseTextView.getCenterTextView().getText().toString().trim() : "";
    }

    public TextView getCenterTextView() {
        BaseTextView baseTextView = this.mCenterView;
        if (baseTextView != null) {
            return baseTextView.getCenterTextView();
        }
        return null;
    }

    public String getCenterTopString() {
        BaseTextView baseTextView = this.mCenterView;
        return baseTextView != null ? baseTextView.getTopTextView().getText().toString().trim() : "";
    }

    public TextView getCenterTopTextView() {
        BaseTextView baseTextView = this.mCenterView;
        if (baseTextView != null) {
            return baseTextView.getTopTextView();
        }
        return null;
    }

    public boolean getCheckBoxIsChecked() {
        CheckBox checkBox = this.mRightCheckBox;
        if (checkBox != null) {
            return checkBox.isChecked();
        }
        return false;
    }

    public GradientDrawable getDrawable(int i4) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.mGradientDrawable = gradientDrawable;
        gradientDrawable.setShape(0);
        if (i4 == 16842910) {
            this.mGradientDrawable.setColor(this.mSelectorNormalColor);
        } else if (i4 != 16842919) {
            this.mGradientDrawable.setColor(this.mSolidColor);
        } else {
            this.mGradientDrawable.setColor(this.mSelectorPressedColor);
        }
        setBorder();
        setRadius();
        return this.mGradientDrawable;
    }

    public String getLeftBottomString() {
        BaseTextView baseTextView = this.mLeftView;
        return baseTextView != null ? baseTextView.getBottomTextView().getText().toString().trim() : "";
    }

    public TextView getLeftBottomTextView() {
        BaseTextView baseTextView = this.mLeftView;
        if (baseTextView != null) {
            return baseTextView.getBottomTextView();
        }
        return null;
    }

    public ImageView getLeftIconIV() {
        this.mLeftImgParams.setMargins(this.mLeftIconMarginLeft, 0, 0, 0);
        this.mLeftImgParams.setMarginStart(this.mLeftIconMarginLeft);
        return this.mLeftIconIV;
    }

    public String getLeftString() {
        BaseTextView baseTextView = this.mLeftView;
        return baseTextView != null ? baseTextView.getCenterTextView().getText().toString().trim() : "";
    }

    public TextView getLeftTextView() {
        BaseTextView baseTextView = this.mLeftView;
        if (baseTextView != null) {
            return baseTextView.getCenterTextView();
        }
        return null;
    }

    public String getLeftTopString() {
        BaseTextView baseTextView = this.mLeftView;
        return baseTextView != null ? baseTextView.getTopTextView().getText().toString().trim() : "";
    }

    public TextView getLeftTopTextView() {
        BaseTextView baseTextView = this.mLeftView;
        if (baseTextView != null) {
            return baseTextView.getTopTextView();
        }
        return null;
    }

    public String getRightBottomString() {
        BaseTextView baseTextView = this.mRightView;
        return baseTextView != null ? baseTextView.getBottomTextView().getText().toString().trim() : "";
    }

    public TextView getRightBottomTextView() {
        BaseTextView baseTextView = this.mRightView;
        if (baseTextView != null) {
            return baseTextView.getBottomTextView();
        }
        return null;
    }

    public ImageView getRightIconIV() {
        this.mRightImgParams.setMargins(0, 0, this.mRightIconMarginRight, 0);
        this.mLeftImgParams.setMarginEnd(this.mRightIconMarginRight);
        return this.mRightIconIV;
    }

    public String getRightString() {
        BaseTextView baseTextView = this.mRightView;
        return baseTextView != null ? baseTextView.getCenterTextView().getText().toString().trim() : "";
    }

    public TextView getRightTextView() {
        BaseTextView baseTextView = this.mRightView;
        if (baseTextView != null) {
            return baseTextView.getCenterTextView();
        }
        return null;
    }

    public String getRightTopString() {
        BaseTextView baseTextView = this.mRightView;
        return baseTextView != null ? baseTextView.getTopTextView().getText().toString().trim() : "";
    }

    public TextView getRightTopTextView() {
        BaseTextView baseTextView = this.mRightView;
        if (baseTextView != null) {
            return baseTextView.getTopTextView();
        }
        return null;
    }

    public StateListDrawable getSelector() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed, R.attr.state_enabled}, getDrawable(R.attr.state_pressed));
        stateListDrawable.addState(new int[0], getDrawable(R.attr.state_enabled));
        return stateListDrawable;
    }

    public boolean getSwitchIsChecked() {
        Switch r02 = this.mRightSwitch;
        if (r02 != null) {
            return r02.isChecked();
        }
        return false;
    }

    public boolean isEditEmpty() {
        EditText editText = this.mCenterEditText;
        if (editText != null) {
            return TextUtils.isEmpty(editText.getText().toString());
        }
        return true;
    }

    public boolean isEditNotEmpty() {
        if (this.mCenterEditText != null) {
            return !TextUtils.isEmpty(r0.getText().toString());
        }
        return false;
    }

    public SuperTextView setBottomDividerLineVisibility(int i4) {
        if (this.mBottomDividerLineView == null) {
            setBottomDividerLineView();
        }
        this.mBottomDividerLineView.setVisibility(i4);
        return this;
    }

    public SuperTextView setCenterBottomString(CharSequence charSequence) {
        BaseTextView baseTextView = this.mCenterView;
        if (baseTextView != null) {
            baseTextView.setBottomTextString(charSequence);
        }
        return this;
    }

    public SuperTextView setCenterBottomTextColor(int i4) {
        BaseTextView baseTextView = this.mCenterView;
        if (baseTextView != null) {
            baseTextView.getBottomTextView().setTextColor(i4);
        }
        return this;
    }

    public SuperTextView setCenterBottomTvClickListener(OnCenterBottomTvClickListener onCenterBottomTvClickListener) {
        this.mCenterBottomTvClickListener = onCenterBottomTvClickListener;
        setDefaultCenterViewClickListener(this.mCenterView);
        return this;
    }

    public SuperTextView setCenterEditString(CharSequence charSequence) {
        EditText editText = this.mCenterEditText;
        if (editText != null) {
            editText.setText(charSequence);
        }
        return this;
    }

    public SuperTextView setCenterEditTextClickListener(View.OnClickListener onClickListener) {
        EditText editText = this.mCenterEditText;
        if (editText != null) {
            editText.setOnClickListener(onClickListener);
        }
        return this;
    }

    public SuperTextView setCenterEditTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        EditText editText = this.mCenterEditText;
        if (editText != null && this.mEditTextButtonType == 0) {
            editText.setOnFocusChangeListener(onFocusChangeListener);
        }
        return this;
    }

    public SuperTextView setCenterString(CharSequence charSequence) {
        BaseTextView baseTextView = this.mCenterView;
        if (baseTextView != null) {
            baseTextView.setCenterTextString(charSequence);
        }
        return this;
    }

    public SuperTextView setCenterTextColor(int i4) {
        BaseTextView baseTextView = this.mCenterView;
        if (baseTextView != null) {
            baseTextView.getCenterTextView().setTextColor(i4);
        }
        return this;
    }

    public SuperTextView setCenterTextGravity(int i4) {
        setTextGravity(this.mCenterView, i4);
        return this;
    }

    public SuperTextView setCenterTopString(CharSequence charSequence) {
        BaseTextView baseTextView = this.mCenterView;
        if (baseTextView != null) {
            baseTextView.setTopTextString(charSequence);
        }
        return this;
    }

    public SuperTextView setCenterTopTextColor(int i4) {
        BaseTextView baseTextView = this.mCenterView;
        if (baseTextView != null) {
            baseTextView.getTopTextView().setTextColor(i4);
        }
        return this;
    }

    public SuperTextView setCenterTopTvClickListener(OnCenterTopTvClickListener onCenterTopTvClickListener) {
        this.mCenterTopTvClickListener = onCenterTopTvClickListener;
        setDefaultCenterViewClickListener(this.mCenterView);
        return this;
    }

    public SuperTextView setCenterTvClickListener(OnCenterTvClickListener onCenterTvClickListener) {
        this.mCenterTvClickListener = onCenterTvClickListener;
        setDefaultCenterViewClickListener(this.mCenterView);
        return this;
    }

    public SuperTextView setCenterTvDrawableLeft(Drawable drawable) {
        setDefaultDrawable(this.mCenterView.getCenterTextView(), drawable, null, this.mTextViewDrawablePadding, this.mCenterTvDrawableWidth, this.mCenterTvDrawableHeight);
        return this;
    }

    public SuperTextView setCenterTvDrawableRight(Drawable drawable) {
        setDefaultDrawable(this.mCenterView.getCenterTextView(), null, drawable, this.mTextViewDrawablePadding, this.mCenterTvDrawableWidth, this.mCenterTvDrawableHeight);
        return this;
    }

    public SuperTextView setCheckBoxBackground(Drawable drawable) {
        this.mRightCheckBoxBg = drawable;
        CheckBox checkBox = this.mRightCheckBox;
        if (checkBox != null) {
            checkBox.setBackgroundDrawable(drawable);
        }
        return this;
    }

    public SuperTextView setCheckBoxChecked(boolean z3) {
        setCheckBoxChecked(z3, true);
        return this;
    }

    public SuperTextView setCheckBoxCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.mCheckBoxCheckedChangeListener = onCheckedChangeListener;
        CheckBox checkBox = this.mRightCheckBox;
        if (checkBox != null) {
            checkBox.setOnCheckedChangeListener(onCheckedChangeListener);
        }
        return this;
    }

    public void setDefaultDrawable(TextView textView, Drawable drawable, Drawable drawable2, int i4, int i5, int i6) {
        if (drawable != null || drawable2 != null) {
            textView.setVisibility(0);
        }
        if (i5 == -1 || i6 == -1) {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, drawable2, (Drawable) null);
        } else {
            if (drawable != null) {
                drawable.setBounds(0, 0, i5, i6);
            }
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i5, i6);
            }
            textView.setCompoundDrawables(drawable, null, drawable2, null);
        }
        textView.setCompoundDrawablePadding(i4);
    }

    public SuperTextView setLeftBottomString(CharSequence charSequence) {
        BaseTextView baseTextView = this.mLeftView;
        if (baseTextView != null) {
            baseTextView.setBottomTextString(charSequence);
        }
        return this;
    }

    public SuperTextView setLeftBottomTextColor(int i4) {
        BaseTextView baseTextView = this.mLeftView;
        if (baseTextView != null) {
            baseTextView.getBottomTextView().setTextColor(i4);
        }
        return this;
    }

    public SuperTextView setLeftBottomTvClickListener(OnLeftBottomTvClickListener onLeftBottomTvClickListener) {
        this.mLeftBottomTvClickListener = onLeftBottomTvClickListener;
        setDefaultLeftViewClickListener(this.mLeftView);
        return this;
    }

    public SuperTextView setLeftIcon(Drawable drawable) {
        if (this.mLeftIconIV != null) {
            this.mLeftImgParams.setMargins(this.mLeftIconMarginLeft, 0, 0, 0);
            this.mLeftImgParams.setMarginStart(this.mLeftIconMarginLeft);
            this.mLeftIconIV.setImageDrawable(drawable);
        }
        return this;
    }

    public SuperTextView setLeftImageViewClickListener(OnLeftImageViewClickListener onLeftImageViewClickListener) {
        this.mLeftImageViewClickListener = onLeftImageViewClickListener;
        ImageView imageView = this.mLeftIconIV;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.textview.supertextview.SuperTextView.11
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    SuperTextView.this.mLeftImageViewClickListener.onClick(SuperTextView.this.mLeftIconIV);
                }
            });
        }
        return this;
    }

    public SuperTextView setLeftString(CharSequence charSequence) {
        BaseTextView baseTextView = this.mLeftView;
        if (baseTextView != null) {
            baseTextView.setCenterTextString(charSequence);
        }
        return this;
    }

    public SuperTextView setLeftTextColor(int i4) {
        BaseTextView baseTextView = this.mLeftView;
        if (baseTextView != null) {
            baseTextView.getCenterTextView().setTextColor(i4);
        }
        return this;
    }

    public SuperTextView setLeftTextGravity(int i4) {
        setTextGravity(this.mLeftView, i4);
        return this;
    }

    public SuperTextView setLeftTopString(CharSequence charSequence) {
        BaseTextView baseTextView = this.mLeftView;
        if (baseTextView != null) {
            baseTextView.setTopTextString(charSequence);
        }
        return this;
    }

    public SuperTextView setLeftTopTextColor(int i4) {
        BaseTextView baseTextView = this.mLeftView;
        if (baseTextView != null) {
            baseTextView.getTopTextView().setTextColor(i4);
        }
        return this;
    }

    public SuperTextView setLeftTopTvClickListener(OnLeftTopTvClickListener onLeftTopTvClickListener) {
        this.mLeftTopTvClickListener = onLeftTopTvClickListener;
        setDefaultLeftViewClickListener(this.mLeftView);
        return this;
    }

    public SuperTextView setLeftTvClickListener(OnLeftTvClickListener onLeftTvClickListener) {
        this.mLeftTvClickListener = onLeftTvClickListener;
        setDefaultLeftViewClickListener(this.mLeftView);
        return this;
    }

    public SuperTextView setLeftTvDrawableLeft(Drawable drawable) {
        setDefaultDrawable(this.mLeftView.getCenterTextView(), drawable, null, this.mTextViewDrawablePadding, this.mLeftTvDrawableWidth, this.mLeftTvDrawableHeight);
        return this;
    }

    public SuperTextView setLeftTvDrawableRight(Drawable drawable) {
        setDefaultDrawable(this.mLeftView.getCenterTextView(), null, drawable, this.mTextViewDrawablePadding, this.mLeftTvDrawableWidth, this.mLeftTvDrawableHeight);
        return this;
    }

    public SuperTextView setOnSuperTextViewClickListener(OnSuperTextViewClickListener onSuperTextViewClickListener) {
        this.mSuperTextViewClickListener = onSuperTextViewClickListener;
        if (onSuperTextViewClickListener != null) {
            setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.textview.supertextview.SuperTextView.10
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    SuperTextView.this.mSuperTextViewClickListener.onClick(SuperTextView.this);
                }
            });
        }
        return this;
    }

    public SuperTextView setPasswordTransformationMethod(PasswordTransformationMethod passwordTransformationMethod) {
        EditText editText = this.mCenterEditText;
        if (editText != null && (editText instanceof PasswordEditText)) {
            ((PasswordEditText) editText).setPasswordTransformationMethod(passwordTransformationMethod);
        }
        return this;
    }

    public SuperTextView setRightBottomString(CharSequence charSequence) {
        BaseTextView baseTextView = this.mRightView;
        if (baseTextView != null) {
            baseTextView.setBottomTextString(charSequence);
        }
        return this;
    }

    public SuperTextView setRightBottomTextColor(int i4) {
        BaseTextView baseTextView = this.mRightView;
        if (baseTextView != null) {
            baseTextView.getBottomTextView().setTextColor(i4);
        }
        return this;
    }

    public SuperTextView setRightBottomTvClickListener(OnRightBottomTvClickListener onRightBottomTvClickListener) {
        this.mRightBottomTvClickListener = onRightBottomTvClickListener;
        setDefaultRightViewClickListener(this.mRightView);
        return this;
    }

    public SuperTextView setRightIcon(Drawable drawable) {
        if (this.mRightIconIV != null) {
            this.mRightImgParams.setMargins(0, 0, this.mRightIconMarginRight, 0);
            this.mRightImgParams.setMarginEnd(this.mRightIconMarginRight);
            this.mRightIconIV.setImageDrawable(drawable);
        }
        return this;
    }

    public SuperTextView setRightImageViewClickListener(OnRightImageViewClickListener onRightImageViewClickListener) {
        this.mRightImageViewClickListener = onRightImageViewClickListener;
        ImageView imageView = this.mRightIconIV;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.textview.supertextview.SuperTextView.12
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    SuperTextView.this.mRightImageViewClickListener.onClick(SuperTextView.this.mRightIconIV);
                }
            });
        }
        return this;
    }

    public SuperTextView setRightString(CharSequence charSequence) {
        BaseTextView baseTextView = this.mRightView;
        if (baseTextView != null) {
            baseTextView.setCenterTextString(charSequence);
        }
        return this;
    }

    public SuperTextView setRightTextColor(int i4) {
        BaseTextView baseTextView = this.mRightView;
        if (baseTextView != null) {
            baseTextView.getCenterTextView().setTextColor(i4);
        }
        return this;
    }

    public SuperTextView setRightTextGravity(int i4) {
        setTextGravity(this.mRightView, i4);
        return this;
    }

    public SuperTextView setRightTopString(CharSequence charSequence) {
        BaseTextView baseTextView = this.mRightView;
        if (baseTextView != null) {
            baseTextView.setTopTextString(charSequence);
        }
        return this;
    }

    public SuperTextView setRightTopTextColor(int i4) {
        BaseTextView baseTextView = this.mRightView;
        if (baseTextView != null) {
            baseTextView.getTopTextView().setTextColor(i4);
        }
        return this;
    }

    public SuperTextView setRightTopTvClickListener(OnRightTopTvClickListener onRightTopTvClickListener) {
        this.mRightTopTvClickListener = onRightTopTvClickListener;
        setDefaultRightViewClickListener(this.mRightView);
        return this;
    }

    public SuperTextView setRightTvClickListener(OnRightTvClickListener onRightTvClickListener) {
        this.mRightTvClickListener = onRightTvClickListener;
        setDefaultRightViewClickListener(this.mRightView);
        return this;
    }

    public SuperTextView setRightTvDrawableLeft(Drawable drawable) {
        setDefaultDrawable(this.mRightView.getCenterTextView(), drawable, null, this.mTextViewDrawablePadding, this.mRightTvDrawableWidth, this.mRightTvDrawableHeight);
        return this;
    }

    public SuperTextView setRightTvDrawableRight(Drawable drawable) {
        setDefaultDrawable(this.mRightView.getCenterTextView(), null, drawable, this.mTextViewDrawablePadding, this.mRightTvDrawableWidth, this.mRightTvDrawableHeight);
        return this;
    }

    public SuperTextView setSBackground(Drawable drawable) {
        if (drawable != null) {
            setBackgroundDrawable(drawable);
        }
        return this;
    }

    public SuperTextView setShapeCornersBottomLeftRadius(float f4) {
        this.mCornersBottomLeftRadius = DensityUtils.dp2px(this.mContext, f4);
        return this;
    }

    public SuperTextView setShapeCornersBottomRightRadius(float f4) {
        this.mCornersBottomRightRadius = DensityUtils.dp2px(this.mContext, f4);
        return this;
    }

    public SuperTextView setShapeCornersRadius(float f4) {
        this.mCornersRadius = DensityUtils.dp2px(this.mContext, f4);
        return this;
    }

    public SuperTextView setShapeCornersTopLeftRadius(float f4) {
        this.mCornersTopLeftRadius = DensityUtils.dp2px(this.mContext, f4);
        return this;
    }

    public SuperTextView setShapeCornersTopRightRadius(float f4) {
        this.mCornersTopRightRadius = DensityUtils.dp2px(this.mContext, f4);
        return this;
    }

    public SuperTextView setShapeSelectorNormalColor(int i4) {
        this.mSelectorNormalColor = i4;
        return this;
    }

    public SuperTextView setShapeSelectorPressedColor(int i4) {
        this.mSelectorPressedColor = i4;
        return this;
    }

    public SuperTextView setShapeSolidColor(int i4) {
        this.mSolidColor = i4;
        return this;
    }

    public SuperTextView setShapeSrokeDashWidth(float f4) {
        this.mStrokeDashWidth = DensityUtils.dp2px(this.mContext, f4);
        return this;
    }

    public SuperTextView setShapeStrokeColor(int i4) {
        this.mStrokeColor = i4;
        return this;
    }

    public SuperTextView setShapeStrokeDashGap(float f4) {
        this.mStrokeDashGap = DensityUtils.dp2px(this.mContext, f4);
        return this;
    }

    public SuperTextView setShapeStrokeWidth(int i4) {
        this.mStrokeWidth = DensityUtils.dp2px(this.mContext, i4);
        return this;
    }

    public SuperTextView setSwitchCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.mSwitchCheckedChangeListener = onCheckedChangeListener;
        Switch r02 = this.mRightSwitch;
        if (r02 != null) {
            r02.setOnCheckedChangeListener(onCheckedChangeListener);
        }
        return this;
    }

    public SuperTextView setSwitchIsChecked(boolean z3) {
        setSwitchIsChecked(z3, true);
        return this;
    }

    public SuperTextView setTopDividerLineVisibility(int i4) {
        if (this.mTopDividerLineView == null) {
            setTopDividerLineView();
        }
        this.mTopDividerLineView.setVisibility(i4);
        return this;
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        BaseTextView baseTextView = this.mLeftView;
        if (baseTextView != null) {
            baseTextView.setTypeface(typeface);
        }
        BaseTextView baseTextView2 = this.mCenterView;
        if (baseTextView2 != null) {
            baseTextView2.setTypeface(typeface);
        }
        EditText editText = this.mCenterEditText;
        if (editText != null) {
            editText.setTypeface(typeface);
        }
        BaseTextView baseTextView3 = this.mRightView;
        if (baseTextView3 != null) {
            baseTextView3.setTypeface(typeface);
        }
        BaseTextView baseTextView4 = this.mCenterView;
        if (baseTextView4 != null) {
            baseTextView4.setTypeface(typeface);
        }
    }

    public SuperTextView useShape() {
        setBackground(getSelector());
        return this;
    }

    public SuperTextView setCheckBoxChecked(boolean z3, boolean z4) {
        this.mIsChecked = z3;
        CheckBox checkBox = this.mRightCheckBox;
        if (checkBox != null) {
            if (z4) {
                checkBox.setOnCheckedChangeListener(null);
                this.mRightCheckBox.setChecked(z3);
                this.mRightCheckBox.setOnCheckedChangeListener(this.mCheckBoxCheckedChangeListener);
            } else {
                checkBox.setChecked(z3);
            }
        }
        return this;
    }

    public SuperTextView setSwitchIsChecked(boolean z3, boolean z4) {
        this.mSwitchIsChecked = z3;
        Switch r02 = this.mRightSwitch;
        if (r02 != null) {
            if (z4) {
                r02.setOnCheckedChangeListener(null);
                this.mRightSwitch.setChecked(z3);
                this.mRightSwitch.setOnCheckedChangeListener(this.mSwitchCheckedChangeListener);
            } else {
                r02.setChecked(z3);
            }
        }
        return this;
    }

    public SuperTextView setLeftIcon(int i4) {
        if (this.mLeftIconIV != null) {
            this.mLeftImgParams.setMargins(this.mLeftIconMarginLeft, 0, 0, 0);
            this.mLeftImgParams.setMarginStart(this.mLeftIconMarginLeft);
            this.mLeftIconIV.setImageResource(i4);
        }
        return this;
    }

    public SuperTextView setRightIcon(int i4) {
        if (this.mRightIconIV != null) {
            this.mRightImgParams.setMargins(0, 0, this.mRightIconMarginRight, 0);
            this.mRightImgParams.setMarginEnd(this.mRightIconMarginRight);
            this.mRightIconIV.setImageResource(i4);
        }
        return this;
    }

    public SuperTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mEnableEdit = false;
        this.mEditTextWidth = -1;
        this.mEditTextButtonType = 1;
        initAttrs(context, attributeSet);
    }

    public SuperTextView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mEnableEdit = false;
        this.mEditTextWidth = -1;
        this.mEditTextButtonType = 1;
        initAttrs(context, attributeSet);
    }
}
