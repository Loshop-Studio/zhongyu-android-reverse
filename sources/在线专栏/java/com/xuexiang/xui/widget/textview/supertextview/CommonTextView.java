package com.xuexiang.xui.widget.textview.supertextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.ResUtils;
import com.xuexiang.xui.utils.ThemeUtils;
import io.github.inflationx.calligraphy3.HasTypeface;

/* loaded from: classes.dex */
public class CommonTextView extends RelativeLayout implements HasTypeface {
    private static final int BOTH = 3;
    private static final int BOTTOM = 2;
    private static final int DEFAULT = 2;
    private static final int DEFAULT_GRAVITY = 1;
    private static final int GRAVITY_CENTER = 1;
    private static final int GRAVITY_LEFT_CENTER = 0;
    private static final int GRAVITY_RIGHT_CENTER = 2;
    private static final int NONE = 0;
    private static final int TOP = 1;
    private int mBackgroundColor;
    private Drawable mBackground_drawable;
    private int mBothDividerLineMarginLeft;
    private int mBothDividerLineMarginRight;
    private int mBottomDividerLineMarginLR;
    private int mBottomDividerLineMarginLeft;
    private int mBottomDividerLineMarginRight;
    private RelativeLayout.LayoutParams mBottomLineParams;
    private View mBottomLineView;
    private RelativeLayout.LayoutParams mCenterBaseLineParams;
    private View mCenterBaseLineView;
    private RelativeLayout.LayoutParams mCenterBottomTVParams;
    private int mCenterBottomTextColor;
    private int mCenterBottomTextSize;
    private CharSequence mCenterBottomTextString;
    private TextView mCenterBottomTextView;
    private int mCenterIconDrawablePadding;
    private int mCenterSpaceHeight;
    private RelativeLayout.LayoutParams mCenterTVParams;
    private int mCenterTextColor;
    private int mCenterTextSize;
    private CharSequence mCenterTextString;
    private TextView mCenterTextView;
    private int mCenterTextViewGravity;
    private int mCenterTextViewLineSpacingExtra;
    private RelativeLayout.LayoutParams mCenterTopTVParams;
    private int mCenterTopTextColor;
    private int mCenterTopTextSize;
    private CharSequence mCenterTopTextString;
    private TextView mCenterTopTextView;
    private boolean mCenterViewIsClickable;
    private int mCenterViewMarginLeft;
    private int mCenterViewPaddingLeft;
    private int mCenterViewPaddingRight;
    private Drawable mCenter_drawableBottom;
    private Drawable mCenter_drawableLeft;
    private Drawable mCenter_drawableRight;
    private Drawable mCenter_drawableTop;
    private Context mContext;
    private int mDefaultPadding;
    private int mDefaultTextColor;
    private int mDefaultTextSize;
    private int mDividerLineColor;
    private int mDividerLineHeight;
    private int mDividerLineType;
    private boolean mIsCenterAlignLeft;
    private boolean mIsUseRipple;
    private RelativeLayout.LayoutParams mLeftBottomTVParams;
    private int mLeftBottomTextColor;
    private int mLeftBottomTextSize;
    private CharSequence mLeftBottomTextString;
    private TextView mLeftBottomTextView;
    private int mLeftIconDrawablePadding;
    private ImageView mLeftImageView;
    private int mLeftImageViewMarginLeft;
    private RelativeLayout.LayoutParams mLeftTVParams;
    private int mLeftTextColor;
    private int mLeftTextSize;
    private CharSequence mLeftTextString;
    private TextView mLeftTextView;
    private int mLeftTextViewGravity;
    private int mLeftTextViewLineSpacingExtra;
    private RelativeLayout.LayoutParams mLeftTopTVParams;
    private int mLeftTopTextColor;
    private int mLeftTopTextSize;
    private CharSequence mLeftTopTextString;
    private TextView mLeftTopTextView;
    private boolean mLeftViewIsClickable;
    private int mLeftViewPaddingLeft;
    private int mLeftViewPaddingRight;
    private Drawable mLeft_IV_drawable;
    private Drawable mLeft_drawableBottom;
    private Drawable mLeft_drawableLeft;
    private Drawable mLeft_drawableRight;
    private Drawable mLeft_drawableTop;
    private OnCommonTextViewClickListener mOnCommonTextViewClickListener;
    private RelativeLayout.LayoutParams mRightBottomTVParams;
    private int mRightBottomTextColor;
    private int mRightBottomTextSize;
    private CharSequence mRightBottomTextString;
    private TextView mRightBottomTextView;
    private int mRightIconDrawablePadding;
    private RelativeLayout.LayoutParams mRightTVParams;
    private int mRightTextColor;
    private int mRightTextSize;
    private CharSequence mRightTextString;
    private TextView mRightTextView;
    private int mRightTextViewGravity;
    private int mRightTextViewLineSpacingExtra;
    private RelativeLayout.LayoutParams mRightTopTVParams;
    private int mRightTopTextColor;
    private int mRightTopTextSize;
    private CharSequence mRightTopTextString;
    private TextView mRightTopTextView;
    private boolean mRightViewIsClickable;
    private int mRightViewPaddingLeft;
    private int mRightViewPaddingRight;
    private Drawable mRight_drawableBottom;
    private Drawable mRight_drawableLeft;
    private Drawable mRight_drawableRight;
    private Drawable mRight_drawableTop;
    private int mSetLines;
    private int mSetMaxEms;
    private boolean mSetSingleLine;
    private int mTopDividerLineMarginLR;
    private int mTopDividerLineMarginLeft;
    private int mTopDividerLineMarginRight;
    private RelativeLayout.LayoutParams mTopLineParams;
    private View mTopLineView;

    public static class OnCommonTextViewClickListener {
        public void onCenterViewClick() {
        }

        public void onCommonTextViewClick() {
        }

        public void onLeftViewClick() {
        }

        public void onRightViewClick() {
        }
    }

    public CommonTextView(Context context) {
        super(context);
        this.mBackgroundColor = -1;
        this.mSetSingleLine = true;
        this.mSetMaxEms = 10;
        this.mSetLines = 1;
        initAttrs(context, null);
    }

    private void getAttr(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = this.mContext.obtainStyledAttributes(attributeSet, C2042R.styleable.CommonTextView);
        this.mLeft_drawableLeft = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.CommonTextView_cLeftIconResForDrawableLeft);
        this.mLeft_drawableTop = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.CommonTextView_cLeftIconResForDrawableTop);
        this.mLeft_drawableRight = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.CommonTextView_cLeftIconResForDrawableRight);
        this.mLeft_drawableBottom = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.CommonTextView_cLeftIconResForDrawableBottom);
        this.mCenter_drawableLeft = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.CommonTextView_cCenterIconResForDrawableLeft);
        this.mCenter_drawableTop = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.CommonTextView_cCenterIconResForDrawableTop);
        this.mCenter_drawableRight = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.CommonTextView_cCenterIconResForDrawableRight);
        this.mCenter_drawableBottom = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.CommonTextView_cCenterIconResForDrawableBottom);
        this.mRight_drawableLeft = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.CommonTextView_cRightIconResForDrawableLeft);
        this.mRight_drawableTop = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.CommonTextView_cRightIconResForDrawableTop);
        this.mRight_drawableRight = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.CommonTextView_cRightIconResForDrawableRight);
        this.mRight_drawableBottom = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.CommonTextView_cRightIconResForDrawableBottom);
        this.mLeft_IV_drawable = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.CommonTextView_cLeftImageViewDrawableRes);
        this.mLeftTextString = typedArrayObtainStyledAttributes.getString(C2042R.styleable.CommonTextView_cLeftTextString);
        this.mLeftTopTextString = typedArrayObtainStyledAttributes.getString(C2042R.styleable.CommonTextView_cLeftTopTextString);
        this.mLeftBottomTextString = typedArrayObtainStyledAttributes.getString(C2042R.styleable.CommonTextView_cLeftBottomTextString);
        this.mCenterTextString = typedArrayObtainStyledAttributes.getString(C2042R.styleable.CommonTextView_cCenterTextString);
        this.mCenterTopTextString = typedArrayObtainStyledAttributes.getString(C2042R.styleable.CommonTextView_cCenterTopTextString);
        this.mCenterBottomTextString = typedArrayObtainStyledAttributes.getString(C2042R.styleable.CommonTextView_cCenterBottomTextString);
        this.mRightTextString = typedArrayObtainStyledAttributes.getString(C2042R.styleable.CommonTextView_cRightTextString);
        this.mRightTopTextString = typedArrayObtainStyledAttributes.getString(C2042R.styleable.CommonTextView_cRightTopTextString);
        this.mRightBottomTextString = typedArrayObtainStyledAttributes.getString(C2042R.styleable.CommonTextView_cRightBottomTextString);
        this.mLeftTextColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.CommonTextView_cLeftTextColor, this.mDefaultTextColor);
        this.mLeftTopTextColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.CommonTextView_cLeftTopTextColor, this.mDefaultTextColor);
        this.mLeftBottomTextColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.CommonTextView_cLeftBottomTextColor, this.mDefaultTextColor);
        this.mCenterTextColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.CommonTextView_cCenterTextColor, this.mDefaultTextColor);
        this.mCenterTopTextColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.CommonTextView_cCenterTopTextColor, this.mDefaultTextColor);
        this.mCenterBottomTextColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.CommonTextView_cCenterBottomTextColor, this.mDefaultTextColor);
        this.mRightTextColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.CommonTextView_cRightTextColor, this.mDefaultTextColor);
        this.mRightTopTextColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.CommonTextView_cRightTopTextColor, this.mDefaultTextColor);
        this.mRightBottomTextColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.CommonTextView_cRightBottomTextColor, this.mDefaultTextColor);
        this.mLeftTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CommonTextView_cLeftTextSize, this.mDefaultTextSize);
        this.mLeftTopTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CommonTextView_cLeftTopTextSize, this.mDefaultTextSize);
        this.mLeftBottomTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CommonTextView_cLeftBottomTextSize, this.mDefaultTextSize);
        this.mCenterTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CommonTextView_cCenterTextSize, this.mDefaultTextSize);
        this.mCenterTopTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CommonTextView_cCenterTopTextSize, this.mDefaultTextSize);
        this.mCenterBottomTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CommonTextView_cCenterBottomTextSize, this.mDefaultTextSize);
        this.mRightTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CommonTextView_cRightTextSize, this.mDefaultTextSize);
        this.mRightTopTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CommonTextView_cRightTopTextSize, this.mDefaultTextSize);
        this.mRightBottomTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CommonTextView_cRightBottomTextSize, this.mDefaultTextSize);
        this.mLeftIconDrawablePadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CommonTextView_cLeftIconDrawablePadding, this.mDefaultPadding);
        this.mCenterIconDrawablePadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CommonTextView_cCenterIconDrawablePadding, this.mDefaultPadding);
        this.mRightIconDrawablePadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CommonTextView_cRightIconDrawablePadding, this.mDefaultPadding);
        this.mLeftViewPaddingLeft = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CommonTextView_cLeftViewPaddingLeft, this.mDefaultPadding);
        this.mLeftViewPaddingRight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CommonTextView_cLeftViewPaddingRight, this.mDefaultPadding);
        this.mCenterViewPaddingLeft = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CommonTextView_cCenterViewPaddingLeft, this.mDefaultPadding);
        this.mCenterViewPaddingRight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CommonTextView_cCenterViewPaddingRight, this.mDefaultPadding);
        this.mRightViewPaddingLeft = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CommonTextView_cRightViewPaddingLeft, this.mDefaultPadding);
        this.mRightViewPaddingRight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CommonTextView_cRightViewPaddingRight, this.mDefaultPadding);
        this.mBothDividerLineMarginLeft = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CommonTextView_cBothDividerLineMarginLeft, 0);
        this.mBothDividerLineMarginRight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CommonTextView_cBothDividerLineMarginRight, 0);
        this.mTopDividerLineMarginLR = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CommonTextView_cTopDividerLineMarginLR, 0);
        this.mTopDividerLineMarginLeft = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CommonTextView_cTopDividerLineMarginLeft, 0);
        this.mTopDividerLineMarginRight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CommonTextView_cTopDividerLineMarginRight, 0);
        this.mBottomDividerLineMarginLR = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CommonTextView_cBottomDividerLineMarginLR, 0);
        this.mBottomDividerLineMarginLeft = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CommonTextView_cBottomDividerLineMarginLeft, 0);
        this.mBottomDividerLineMarginRight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CommonTextView_cBottomDividerLineMarginRight, 0);
        this.mLeftImageViewMarginLeft = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CommonTextView_cLeftImageViewMarginLeft, this.mDefaultPadding);
        this.mCenterSpaceHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CommonTextView_cCenterSpaceHeight, this.mCenterSpaceHeight);
        this.mLeftTextViewLineSpacingExtra = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CommonTextView_cLeftTextViewLineSpacingExtra, 0);
        this.mCenterTextViewLineSpacingExtra = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CommonTextView_cCenterTextViewLineSpacingExtra, 0);
        this.mRightTextViewLineSpacingExtra = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CommonTextView_cRightTextViewLineSpacingExtra, 0);
        this.mDividerLineType = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.CommonTextView_cShowDividerLineType, 2);
        this.mDividerLineColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.CommonTextView_cDividerLineColor, ThemeUtils.resolveColor(getContext(), C2042R.attr.xui_config_color_separator_light));
        this.mDividerLineHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CommonTextView_cDividerLineHeight, dip2px(this.mContext, 0.5f));
        this.mIsUseRipple = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.CommonTextView_cUseRipple, false);
        this.mBackgroundColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.CommonTextView_cBackgroundColor, this.mBackgroundColor);
        this.mSetSingleLine = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.CommonTextView_cSetSingleLine, true);
        this.mSetMaxEms = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.CommonTextView_cSetMaxEms, this.mSetMaxEms);
        this.mSetLines = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.CommonTextView_cSetLines, 1);
        this.mLeftTextViewGravity = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.CommonTextView_cLeftTextViewGravity, 1);
        this.mCenterTextViewGravity = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.CommonTextView_cCenterTextViewGravity, 1);
        this.mRightTextViewGravity = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.CommonTextView_cRightTextViewGravity, 1);
        this.mLeftViewIsClickable = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.CommonTextView_cLeftViewIsClickable, false);
        this.mCenterViewIsClickable = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.CommonTextView_cCenterViewIsClickable, false);
        this.mRightViewIsClickable = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.CommonTextView_cRightViewIsClickable, false);
        this.mBackground_drawable = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.CommonTextView_cBackgroundDrawableRes);
        this.mIsCenterAlignLeft = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.CommonTextView_cIsCenterAlignLeft, false);
        this.mCenterViewMarginLeft = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.CommonTextView_cCenterViewMarginLeft, dip2px(this.mContext, 200.0f));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void init() {
        initCommonTextView();
        initLineView();
        initCenterBaseLine();
        if (this.mLeft_IV_drawable != null) {
            initLeftImageView();
        }
        if (this.mLeftTextString != null || this.mLeft_drawableLeft != null || this.mLeft_drawableRight != null) {
            initLeftText();
        }
        if (this.mCenterTextString != null) {
            initCenterText();
        }
        if (this.mRightTextString != null || this.mRight_drawableLeft != null || this.mRight_drawableRight != null) {
            initRightText();
        }
        if (this.mLeftTopTextString != null) {
            initLeftTopText();
        }
        if (this.mLeftBottomTextString != null) {
            initLeftBottomText();
        }
        if (this.mCenterTopTextString != null) {
            initCenterTopText();
        }
        if (this.mCenterBottomTextString != null) {
            initCenterBottomText();
        }
        if (this.mRightTopTextString != null) {
            initRightTopText();
        }
        if (this.mRightBottomTextString != null) {
            initRightBottomText();
        }
    }

    private void initAttrs(Context context, AttributeSet attributeSet) {
        this.mContext = context;
        this.mDefaultTextColor = ThemeUtils.resolveColor(context, C2042R.attr.stv_color_common_text, ResUtils.getColor(C2042R.color.stv_color_common_text));
        this.mDefaultTextSize = ThemeUtils.resolveDimension(context, C2042R.attr.stv_text_size, ResUtils.getDimensionPixelSize(C2042R.dimen.default_stv_text_size));
        this.mDefaultPadding = ThemeUtils.resolveDimension(context, C2042R.attr.stv_margin, ResUtils.getDimensionPixelSize(C2042R.dimen.default_stv_margin));
        this.mCenterSpaceHeight = dip2px(context, 5.0f);
        getAttr(attributeSet);
        init();
    }

    private void initBottomLineView(int i4, int i5) {
        if (this.mBottomLineView == null) {
            if (this.mBottomLineParams == null) {
                this.mBottomLineParams = new RelativeLayout.LayoutParams(-1, this.mDividerLineHeight);
            }
            this.mBottomLineParams.addRule(12, -1);
            this.mBottomLineParams.setMarginStart(i4);
            this.mBottomLineParams.setMarginEnd(i5);
            View view = new View(this.mContext);
            this.mBottomLineView = view;
            view.setLayoutParams(this.mBottomLineParams);
            this.mBottomLineView.setBackgroundColor(this.mDividerLineColor);
        }
        addView(this.mBottomLineView);
    }

    private void initCenterBaseLine() {
        if (this.mCenterBaseLineView == null) {
            if (this.mCenterBaseLineParams == null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.mCenterSpaceHeight);
                this.mCenterBaseLineParams = layoutParams;
                layoutParams.addRule(15, -1);
            }
            View view = new View(this.mContext);
            this.mCenterBaseLineView = view;
            view.setId(C2042R.id.cCenterBaseLineId);
            this.mCenterBaseLineView.setLayoutParams(this.mCenterBaseLineParams);
        }
        addView(this.mCenterBaseLineView);
    }

    private void initCenterBottomText() {
        if (this.mCenterBottomTextView == null) {
            RelativeLayout.LayoutParams layoutParams = this.mCenterBottomTVParams;
            if (layoutParams == null) {
                this.mCenterBottomTVParams = getParams(layoutParams);
            }
            this.mCenterBottomTVParams.addRule(15, -1);
            this.mCenterBottomTVParams.addRule(13, -1);
            this.mCenterBottomTVParams.addRule(3, C2042R.id.cCenterBaseLineId);
            this.mCenterBottomTVParams.setMargins(this.mCenterViewPaddingLeft, 0, this.mCenterViewPaddingRight, 0);
            TextView textViewInitText = initText(this.mCenterBottomTextView, this.mCenterBottomTVParams, C2042R.id.cCenterBottomTextId, this.mCenterBottomTextColor, this.mCenterBottomTextSize);
            this.mCenterBottomTextView = textViewInitText;
            textViewInitText.setText(this.mCenterBottomTextString);
            this.mCenterBottomTextView.setLineSpacing(this.mCenterTextViewLineSpacingExtra, 1.0f);
            setTextViewGravity(this.mCenterBottomTextView, this.mCenterTextViewGravity);
        }
    }

    private void initCenterText() {
        if (this.mCenterTextView == null) {
            RelativeLayout.LayoutParams layoutParams = this.mCenterTVParams;
            if (layoutParams == null) {
                if (this.mIsCenterAlignLeft) {
                    this.mCenterTVParams = new RelativeLayout.LayoutParams(-1, -2);
                } else {
                    this.mCenterTVParams = getParams(layoutParams);
                }
            }
            this.mCenterTVParams.addRule(15, -1);
            this.mCenterTVParams.addRule(13, -1);
            if (this.mIsCenterAlignLeft) {
                this.mCenterTextView = initText(this.mCenterTextView, this.mCenterTVParams, C2042R.id.cCenterTextId, this.mCenterTextColor, this.mCenterTextSize);
                this.mCenterTVParams.setMargins(this.mCenterViewMarginLeft, 0, this.mCenterViewPaddingRight, 0);
                setTextViewGravity(this.mCenterTextView, 0);
            } else {
                this.mCenterTextView = initText(this.mCenterTextView, this.mCenterTVParams, C2042R.id.cCenterTextId, this.mCenterTextColor, this.mCenterTextSize);
                this.mCenterTVParams.setMargins(this.mCenterViewPaddingLeft, 0, this.mCenterViewPaddingRight, 0);
                setTextViewGravity(this.mCenterTextView, this.mCenterTextViewGravity);
            }
            this.mCenterTextView.setText(this.mCenterTextString);
            this.mCenterTextView.setLineSpacing(this.mCenterTextViewLineSpacingExtra, 1.0f);
            if (this.mCenterViewIsClickable) {
                this.mCenterTextView.setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.textview.supertextview.CommonTextView.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (CommonTextView.this.mOnCommonTextViewClickListener != null) {
                            CommonTextView.this.mOnCommonTextViewClickListener.onCenterViewClick();
                        }
                    }
                });
            }
        }
        setDrawable(this.mCenterTextView, this.mCenter_drawableLeft, this.mCenter_drawableTop, this.mCenter_drawableRight, this.mCenter_drawableBottom, this.mCenterIconDrawablePadding);
    }

    private void initCenterTopText() {
        if (this.mCenterTopTextView == null) {
            RelativeLayout.LayoutParams layoutParams = this.mCenterTopTVParams;
            if (layoutParams == null) {
                this.mCenterTopTVParams = getParams(layoutParams);
            }
            this.mCenterTopTVParams.addRule(15, -1);
            this.mCenterTopTVParams.addRule(13, -1);
            this.mCenterTopTVParams.addRule(2, C2042R.id.cCenterBaseLineId);
            this.mCenterTopTVParams.setMargins(this.mCenterViewPaddingLeft, 0, this.mCenterViewPaddingRight, 0);
            TextView textViewInitText = initText(this.mCenterTopTextView, this.mCenterTopTVParams, C2042R.id.cCenterTopTextId, this.mCenterTopTextColor, this.mCenterTopTextSize);
            this.mCenterTopTextView = textViewInitText;
            textViewInitText.setText(this.mCenterTopTextString);
            this.mCenterTopTextView.setLineSpacing(this.mCenterTextViewLineSpacingExtra, 1.0f);
            setTextViewGravity(this.mCenterTopTextView, this.mCenterTextViewGravity);
        }
    }

    private void initCommonTextView() {
        setBackgroundColor(this.mBackgroundColor);
        if (this.mIsUseRipple) {
            setBackgroundResource(C2042R.drawable.stv_btn_selector_white);
        }
        setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.textview.supertextview.CommonTextView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (CommonTextView.this.mOnCommonTextViewClickListener != null) {
                    CommonTextView.this.mOnCommonTextViewClickListener.onCommonTextViewClick();
                }
            }
        });
        Drawable drawable = this.mBackground_drawable;
        if (drawable != null) {
            setBackgroundDrawable(drawable);
        }
    }

    private void initLeftBottomText() {
        if (this.mLeftBottomTextView == null) {
            RelativeLayout.LayoutParams layoutParams = this.mLeftBottomTVParams;
            if (layoutParams == null) {
                this.mLeftBottomTVParams = getParams(layoutParams);
            }
            this.mLeftBottomTVParams.addRule(15, -1);
            this.mLeftBottomTVParams.addRule(3, C2042R.id.cCenterBaseLineId);
            this.mLeftBottomTVParams.addRule(1, C2042R.id.cLeftImageViewId);
            this.mLeftBottomTVParams.setMargins(this.mLeftViewPaddingLeft, 0, this.mLeftViewPaddingRight, 0);
            TextView textViewInitText = initText(this.mLeftBottomTextView, this.mLeftBottomTVParams, C2042R.id.cLeftBottomTextId, this.mLeftBottomTextColor, this.mLeftBottomTextSize);
            this.mLeftBottomTextView = textViewInitText;
            textViewInitText.setText(this.mLeftBottomTextString);
            setTextViewGravity(this.mLeftBottomTextView, this.mLeftTextViewGravity);
        }
    }

    private void initLeftImageView() {
        this.mLeftImageView = new ImageView(this.mContext);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9, -1);
        layoutParams.addRule(15, -1);
        layoutParams.setMargins(this.mLeftImageViewMarginLeft, 0, 0, 0);
        this.mLeftImageView.setScaleType(ImageView.ScaleType.CENTER);
        this.mLeftImageView.setId(C2042R.id.cLeftImageViewId);
        this.mLeftImageView.setLayoutParams(layoutParams);
        Drawable drawable = this.mLeft_IV_drawable;
        if (drawable != null) {
            this.mLeftImageView.setImageDrawable(drawable);
        }
        addView(this.mLeftImageView);
    }

    private void initLeftText() {
        if (this.mLeftTextView == null) {
            RelativeLayout.LayoutParams layoutParams = this.mLeftTVParams;
            if (layoutParams == null) {
                this.mLeftTVParams = getParams(layoutParams);
            }
            this.mLeftTVParams.addRule(15, -1);
            this.mLeftTVParams.addRule(1, C2042R.id.cLeftImageViewId);
            this.mLeftTVParams.setMargins(this.mLeftViewPaddingLeft, 0, this.mLeftViewPaddingRight, 0);
            TextView textViewInitText = initText(this.mLeftTextView, this.mLeftTVParams, C2042R.id.cLeftTextId, this.mLeftTextColor, this.mLeftTextSize);
            this.mLeftTextView = textViewInitText;
            textViewInitText.setText(this.mLeftTextString);
            this.mLeftTextView.setLineSpacing(this.mLeftTextViewLineSpacingExtra, 1.0f);
            setTextViewGravity(this.mLeftTextView, this.mLeftTextViewGravity);
            if (this.mLeftViewIsClickable) {
                this.mLeftTextView.setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.textview.supertextview.CommonTextView.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (CommonTextView.this.mOnCommonTextViewClickListener != null) {
                            CommonTextView.this.mOnCommonTextViewClickListener.onLeftViewClick();
                        }
                    }
                });
            }
        }
        setDrawable(this.mLeftTextView, this.mLeft_drawableLeft, this.mLeft_drawableTop, this.mLeft_drawableRight, this.mLeft_drawableBottom, this.mLeftIconDrawablePadding);
    }

    private void initLeftTopText() {
        if (this.mLeftTopTextView == null) {
            RelativeLayout.LayoutParams layoutParams = this.mLeftTopTVParams;
            if (layoutParams == null) {
                this.mLeftTopTVParams = getParams(layoutParams);
            }
            this.mLeftTopTVParams.addRule(15, -1);
            this.mLeftTopTVParams.addRule(2, C2042R.id.cCenterBaseLineId);
            this.mLeftTopTVParams.addRule(1, C2042R.id.cLeftImageViewId);
            this.mLeftTopTVParams.setMargins(this.mLeftViewPaddingLeft, 0, this.mLeftViewPaddingRight, 0);
            TextView textViewInitText = initText(this.mLeftTopTextView, this.mLeftTopTVParams, C2042R.id.cLeftTopTextId, this.mLeftTopTextColor, this.mLeftTopTextSize);
            this.mLeftTopTextView = textViewInitText;
            textViewInitText.setText(this.mLeftTopTextString);
            setTextViewGravity(this.mLeftTopTextView, this.mLeftTextViewGravity);
        }
    }

    private void initLineView() {
        int i4 = this.mDividerLineType;
        if (i4 == 1) {
            setTopLineMargin();
            return;
        }
        if (i4 == 2) {
            setBottomLineMargin();
        } else {
            if (i4 != 3) {
                return;
            }
            setTopLineMargin();
            setBottomLineMargin();
        }
    }

    private void initRightBottomText() {
        if (this.mRightBottomTextView == null) {
            RelativeLayout.LayoutParams layoutParams = this.mRightBottomTVParams;
            if (layoutParams == null) {
                this.mRightBottomTVParams = getParams(layoutParams);
            }
            this.mRightBottomTVParams.addRule(15, -1);
            this.mRightBottomTVParams.addRule(11, -1);
            this.mRightBottomTVParams.addRule(3, C2042R.id.cCenterBaseLineId);
            this.mRightBottomTVParams.addRule(0, C2042R.id.cRightImageViewId);
            this.mRightBottomTVParams.setMargins(this.mRightViewPaddingLeft, 0, this.mRightViewPaddingRight, 0);
            TextView textViewInitText = initText(this.mRightBottomTextView, this.mRightBottomTVParams, C2042R.id.cRightBottomTextId, this.mRightBottomTextColor, this.mRightBottomTextSize);
            this.mRightBottomTextView = textViewInitText;
            textViewInitText.setText(this.mRightBottomTextString);
            this.mRightBottomTextView.setLineSpacing(this.mRightTextViewLineSpacingExtra, 1.0f);
            setTextViewGravity(this.mRightBottomTextView, this.mRightTextViewGravity);
        }
    }

    private void initRightText() {
        if (this.mRightTextView == null) {
            RelativeLayout.LayoutParams layoutParams = this.mRightTVParams;
            if (layoutParams == null) {
                this.mRightTVParams = getParams(layoutParams);
            }
            this.mRightTVParams.addRule(15, -1);
            this.mRightTVParams.addRule(11, -1);
            this.mRightTVParams.addRule(0, C2042R.id.cRightImageViewId);
            this.mRightTVParams.setMargins(this.mRightViewPaddingLeft, 0, this.mRightViewPaddingRight, 0);
            TextView textViewInitText = initText(this.mRightTextView, this.mRightTVParams, C2042R.id.cRightTextId, this.mRightTextColor, this.mRightTextSize);
            this.mRightTextView = textViewInitText;
            textViewInitText.setText(this.mRightTextString);
            this.mRightTextView.setLineSpacing(this.mRightTextViewLineSpacingExtra, 1.0f);
            setTextViewGravity(this.mRightTextView, this.mRightTextViewGravity);
            if (this.mRightViewIsClickable) {
                this.mRightTextView.setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.textview.supertextview.CommonTextView.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (CommonTextView.this.mOnCommonTextViewClickListener != null) {
                            CommonTextView.this.mOnCommonTextViewClickListener.onRightViewClick();
                        }
                    }
                });
            }
        }
        setDrawable(this.mRightTextView, this.mRight_drawableLeft, this.mRight_drawableTop, this.mRight_drawableRight, this.mRight_drawableBottom, this.mRightIconDrawablePadding);
    }

    private void initRightTopText() {
        if (this.mRightTopTextView == null) {
            RelativeLayout.LayoutParams layoutParams = this.mRightTopTVParams;
            if (layoutParams == null) {
                this.mRightTopTVParams = getParams(layoutParams);
            }
            this.mRightTopTVParams.addRule(15, -1);
            this.mRightTopTVParams.addRule(11, -1);
            this.mRightTopTVParams.addRule(2, C2042R.id.cCenterBaseLineId);
            this.mRightTopTVParams.addRule(0, C2042R.id.cRightImageViewId);
            this.mRightTopTVParams.setMargins(this.mRightViewPaddingLeft, 0, this.mRightViewPaddingRight, 0);
            TextView textViewInitText = initText(this.mRightTopTextView, this.mRightTopTVParams, C2042R.id.cRightTopTextId, this.mRightTopTextColor, this.mRightTopTextSize);
            this.mRightTopTextView = textViewInitText;
            textViewInitText.setText(this.mRightTopTextString);
            this.mRightTopTextView.setLineSpacing(this.mRightTextViewLineSpacingExtra, 1.0f);
            setTextViewGravity(this.mRightTopTextView, this.mRightTextViewGravity);
        }
    }

    private void initTopLineView(int i4, int i5) {
        if (this.mTopLineView == null) {
            if (this.mTopLineParams == null) {
                this.mTopLineParams = new RelativeLayout.LayoutParams(-1, this.mDividerLineHeight);
            }
            this.mTopLineParams.addRule(10, -1);
            this.mTopLineParams.setMarginStart(i4);
            this.mTopLineParams.setMarginEnd(i5);
            View view = new View(this.mContext);
            this.mTopLineView = view;
            view.setLayoutParams(this.mTopLineParams);
            this.mTopLineView.setBackgroundColor(this.mDividerLineColor);
        }
        addView(this.mTopLineView);
    }

    private void setBottomLineMargin() {
        int i4 = this.mBottomDividerLineMarginLR;
        if (i4 != 0) {
            initBottomLineView(i4, i4);
            return;
        }
        int i5 = this.mBothDividerLineMarginRight;
        if ((i5 != 0) || (i5 != 0)) {
            initBottomLineView(this.mBothDividerLineMarginLeft, i5);
        } else {
            initBottomLineView(this.mBottomDividerLineMarginLeft, this.mBottomDividerLineMarginRight);
        }
    }

    private void setTextViewGravity(TextView textView, int i4) {
        if (i4 == 0) {
            textView.setGravity(19);
        } else if (i4 == 1) {
            textView.setGravity(17);
        } else {
            if (i4 != 2) {
                return;
            }
            textView.setGravity(21);
        }
    }

    private void setTopLineMargin() {
        int i4 = this.mTopDividerLineMarginLR;
        if (i4 != 0) {
            initTopLineView(i4, i4);
            return;
        }
        int i5 = this.mBothDividerLineMarginLeft;
        boolean z3 = i5 != 0;
        int i6 = this.mBothDividerLineMarginRight;
        if ((i6 != 0) || z3) {
            initTopLineView(i5, i6);
        } else {
            initTopLineView(this.mTopDividerLineMarginLeft, this.mTopDividerLineMarginRight);
        }
    }

    public int dip2px(Context context, float f4) {
        return (int) ((f4 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public CharSequence getCenterBottomTextString() {
        TextView textView = this.mCenterBottomTextView;
        return textView != null ? textView.getText() : "";
    }

    public CharSequence getCenterTextString() {
        TextView textView = this.mCenterTextView;
        return textView != null ? textView.getText() : "";
    }

    public CharSequence getCenterTopTextString() {
        TextView textView = this.mCenterTopTextView;
        return textView != null ? textView.getText() : "";
    }

    public CharSequence getLeftBottomTextString() {
        TextView textView = this.mLeftBottomTextView;
        return textView != null ? textView.getText() : "";
    }

    public ImageView getLeftImageView() {
        if (this.mLeftImageView == null) {
            initLeftImageView();
        }
        return this.mLeftImageView;
    }

    public CharSequence getLeftTextString() {
        TextView textView = this.mLeftTextView;
        return textView != null ? textView.getText() : "";
    }

    public CharSequence getLeftTopTextString() {
        TextView textView = this.mLeftTopTextView;
        return textView != null ? textView.getText() : "";
    }

    public RelativeLayout.LayoutParams getParams(RelativeLayout.LayoutParams layoutParams) {
        return layoutParams == null ? new RelativeLayout.LayoutParams(-2, -2) : layoutParams;
    }

    public CharSequence getRightBottomTextString() {
        TextView textView = this.mRightBottomTextView;
        return textView != null ? textView.getText() : "";
    }

    public CharSequence getRightTextString() {
        TextView textView = this.mRightTextView;
        return textView != null ? textView.getText() : "";
    }

    public CharSequence getRightTopTextString() {
        TextView textView = this.mRightTopTextView;
        return textView != null ? textView.getText() : "";
    }

    public TextView initText(TextView textView, RelativeLayout.LayoutParams layoutParams, int i4, int i5, int i6) {
        if (textView != null) {
            return textView;
        }
        TextView textView2 = new TextView(this.mContext);
        textView2.setId(i4);
        textView2.setLayoutParams(layoutParams);
        textView2.setTextColor(i5);
        textView2.setTextSize(0, i6);
        textView2.setLines(this.mSetLines);
        textView2.setSingleLine(this.mSetSingleLine);
        textView2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.mSetMaxEms)});
        addView(textView2);
        return textView2;
    }

    public int px2dip(Context context, float f4) {
        return (int) ((f4 / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public CommonTextView setCenterBottomTextString(CharSequence charSequence) {
        if (this.mCenterBottomTextView == null) {
            initCenterBottomText();
        }
        this.mCenterBottomTextView.setText(charSequence);
        return this;
    }

    public CommonTextView setCenterDrawableBottom(Drawable drawable) {
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        if (this.mCenterTextView == null) {
            initCenterText();
        }
        this.mCenterTextView.setCompoundDrawables(null, null, null, drawable);
        return this;
    }

    public CommonTextView setCenterDrawableLeft(Drawable drawable) {
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        if (this.mCenterTextView == null) {
            initCenterText();
        }
        this.mCenterTextView.setCompoundDrawables(drawable, null, null, null);
        return this;
    }

    public CommonTextView setCenterDrawableRight(Drawable drawable) {
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        if (this.mCenterTextView == null) {
            initCenterText();
        }
        this.mCenterTextView.setCompoundDrawables(null, null, drawable, null);
        return this;
    }

    public CommonTextView setCenterDrawableTop(Drawable drawable) {
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        if (this.mCenterTextView == null) {
            initCenterText();
        }
        this.mCenterTextView.setCompoundDrawables(null, drawable, null, null);
        return this;
    }

    public CommonTextView setCenterTextColor(int i4) {
        if (this.mCenterTextView == null) {
            initCenterText();
        }
        this.mCenterTextView.setTextColor(i4);
        return this;
    }

    public CommonTextView setCenterTextSize(float f4) {
        if (this.mCenterTextView == null) {
            initCenterText();
        }
        this.mCenterTextView.setTextSize(f4);
        return this;
    }

    public CommonTextView setCenterTextString(CharSequence charSequence) {
        if (this.mCenterTextView == null) {
            initCenterText();
        }
        this.mCenterTextView.setText(charSequence);
        return this;
    }

    public CommonTextView setCenterTopTextString(CharSequence charSequence) {
        if (this.mCenterTopTextView == null) {
            initCenterTopText();
        }
        this.mCenterTopTextView.setText(charSequence);
        return this;
    }

    public CommonTextView setCenterViewIsClickable(boolean z3) {
        TextView textView;
        if (z3 && (textView = this.mCenterTextView) != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.textview.supertextview.CommonTextView.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (CommonTextView.this.mOnCommonTextViewClickListener != null) {
                        CommonTextView.this.mOnCommonTextViewClickListener.onCenterViewClick();
                    }
                }
            });
        }
        return this;
    }

    public void setDrawable(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, int i4) {
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        textView.setCompoundDrawablePadding(i4);
    }

    public CommonTextView setLeftBottomTextString(CharSequence charSequence) {
        if (this.mLeftBottomTextView == null) {
            initLeftBottomText();
        }
        this.mLeftBottomTextView.setText(charSequence);
        return this;
    }

    public CommonTextView setLeftDrawableBottom(Drawable drawable) {
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        if (this.mLeftTextView == null) {
            initLeftText();
        }
        this.mLeftTextView.setCompoundDrawables(null, null, null, drawable);
        return this;
    }

    public CommonTextView setLeftDrawableLeft(Drawable drawable) {
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        if (this.mLeftTextView == null) {
            initLeftText();
        }
        this.mLeftTextView.setCompoundDrawables(drawable, null, null, null);
        return this;
    }

    public CommonTextView setLeftDrawableRight(Drawable drawable) {
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        if (this.mLeftTextView == null) {
            initLeftText();
        }
        this.mLeftTextView.setCompoundDrawables(null, null, drawable, null);
        return this;
    }

    public CommonTextView setLeftDrawableTop(Drawable drawable) {
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        if (this.mLeftTextView == null) {
            initLeftText();
        }
        this.mLeftTextView.setCompoundDrawables(null, drawable, null, null);
        return this;
    }

    public CommonTextView setLeftTextColor(int i4) {
        if (this.mLeftTextView == null) {
            initLeftText();
        }
        this.mLeftTextView.setTextColor(i4);
        return this;
    }

    public CommonTextView setLeftTextSize(float f4) {
        if (this.mLeftTextView == null) {
            initLeftText();
        }
        this.mLeftTextView.setTextSize(f4);
        return this;
    }

    public CommonTextView setLeftTextString(CharSequence charSequence) {
        if (this.mLeftTextView == null) {
            initLeftText();
        }
        this.mLeftTextView.setText(charSequence);
        return this;
    }

    public CommonTextView setLeftTopTextString(CharSequence charSequence) {
        if (this.mLeftTopTextView == null) {
            initLeftTopText();
        }
        this.mLeftTopTextView.setText(charSequence);
        return this;
    }

    public CommonTextView setLeftViewIsClickable(boolean z3) {
        TextView textView;
        if (z3 && (textView = this.mLeftTextView) != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.textview.supertextview.CommonTextView.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (CommonTextView.this.mOnCommonTextViewClickListener != null) {
                        CommonTextView.this.mOnCommonTextViewClickListener.onLeftViewClick();
                    }
                }
            });
        }
        return this;
    }

    public CommonTextView setOnCommonTextViewClickListener(OnCommonTextViewClickListener onCommonTextViewClickListener) {
        this.mOnCommonTextViewClickListener = onCommonTextViewClickListener;
        return this;
    }

    public CommonTextView setRightBottomTextString(CharSequence charSequence) {
        if (this.mRightBottomTextView == null) {
            initRightBottomText();
        }
        this.mRightBottomTextView.setText(charSequence);
        return this;
    }

    public CommonTextView setRightDrawableBottom(Drawable drawable) {
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        if (this.mRightTextView == null) {
            initRightText();
        }
        this.mRightTextView.setCompoundDrawables(null, null, null, drawable);
        return this;
    }

    public CommonTextView setRightDrawableLeft(Drawable drawable) {
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        if (this.mRightTextView == null) {
            initRightText();
        }
        this.mRightTextView.setCompoundDrawables(drawable, null, null, null);
        return this;
    }

    public CommonTextView setRightDrawableRight(Drawable drawable) {
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        if (this.mRightTextView == null) {
            initRightText();
        }
        this.mRightTextView.setCompoundDrawables(null, null, drawable, null);
        return this;
    }

    public CommonTextView setRightDrawableTop(Drawable drawable) {
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        if (this.mRightTextView == null) {
            initRightText();
        }
        this.mRightTextView.setCompoundDrawables(null, drawable, null, null);
        return this;
    }

    public CommonTextView setRightTextColor(int i4) {
        if (this.mRightTextView == null) {
            initRightText();
        }
        this.mRightTextView.setTextColor(i4);
        return this;
    }

    public CommonTextView setRightTextSize(float f4) {
        if (this.mRightTextView == null) {
            initRightText();
        }
        this.mRightTextView.setTextSize(f4);
        return this;
    }

    public CommonTextView setRightTextString(CharSequence charSequence) {
        if (this.mRightTextView == null) {
            initRightText();
        }
        this.mRightTextView.setText(charSequence);
        return this;
    }

    public CommonTextView setRightTopTextString(CharSequence charSequence) {
        if (this.mRightTopTextView == null) {
            initRightTopText();
        }
        this.mRightTopTextView.setText(charSequence);
        return this;
    }

    public CommonTextView setRightViewIsClickable(boolean z3) {
        TextView textView;
        if (z3 && (textView = this.mRightTextView) != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.textview.supertextview.CommonTextView.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (CommonTextView.this.mOnCommonTextViewClickListener != null) {
                        CommonTextView.this.mOnCommonTextViewClickListener.onRightViewClick();
                    }
                }
            });
        }
        return this;
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        TextView textView = this.mLeftTextView;
        if (textView != null) {
            textView.setTypeface(typeface);
        }
        TextView textView2 = this.mCenterTextView;
        if (textView2 != null) {
            textView2.setTypeface(typeface);
        }
        TextView textView3 = this.mRightTextView;
        if (textView3 != null) {
            textView3.setTypeface(typeface);
        }
        TextView textView4 = this.mLeftTopTextView;
        if (textView4 != null) {
            textView4.setTypeface(typeface);
        }
        TextView textView5 = this.mCenterTopTextView;
        if (textView5 != null) {
            textView5.setTypeface(typeface);
        }
        TextView textView6 = this.mRightTopTextView;
        if (textView6 != null) {
            textView6.setTypeface(typeface);
        }
        TextView textView7 = this.mLeftBottomTextView;
        if (textView7 != null) {
            textView7.setTypeface(typeface);
        }
        TextView textView8 = this.mCenterBottomTextView;
        if (textView8 != null) {
            textView8.setTypeface(typeface);
        }
        TextView textView9 = this.mRightBottomTextView;
        if (textView9 != null) {
            textView9.setTypeface(typeface);
        }
    }

    public int sp2px(Context context, float f4) {
        return (int) ((f4 * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public CommonTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mBackgroundColor = -1;
        this.mSetSingleLine = true;
        this.mSetMaxEms = 10;
        this.mSetLines = 1;
        initAttrs(context, attributeSet);
    }

    public CommonTextView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mBackgroundColor = -1;
        this.mSetSingleLine = true;
        this.mSetMaxEms = 10;
        this.mSetLines = 1;
        initAttrs(context, attributeSet);
    }
}
