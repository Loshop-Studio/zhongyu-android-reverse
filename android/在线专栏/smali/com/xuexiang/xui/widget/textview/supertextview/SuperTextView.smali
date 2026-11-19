.class public Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"

# interfaces
.implements Lio/github/inflationx/calligraphy3/HasTypeface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnRightImageViewClickListener;,
        Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnLeftImageViewClickListener;,
        Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnRightBottomTvClickListener;,
        Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnRightTvClickListener;,
        Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnRightTopTvClickListener;,
        Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnCenterBottomTvClickListener;,
        Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnCenterTvClickListener;,
        Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnCenterTopTvClickListener;,
        Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnLeftBottomTvClickListener;,
        Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnLeftTvClickListener;,
        Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnLeftTopTvClickListener;,
        Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnSuperTextViewClickListener;
    }
.end annotation


# static fields
.field private static final BOTH:I = 0x3

.field private static final BOTTOM:I = 0x2

.field private static final DEFAULT_DIVIDER:I = 0x2

.field private static final DEFAULT_GRAVITY:I = 0x1

.field private static final GRAVITY_CENTER:I = 0x1

.field private static final GRAVITY_LEFT_CENTER:I = 0x0

.field private static final GRAVITY_RIGHT_CENTER:I = 0x2

.field private static final NONE:I = 0x0

.field private static final TOP:I = 0x1

.field private static final TYPE_CHECKBOX:I = 0x0

.field private static final TYPE_CLEAR:I = 0x1

.field private static final TYPE_NONE:I = 0x0

.field private static final TYPE_PASSWORD:I = 0x2

.field private static final TYPE_SWITCH:I = 0x1


# instance fields
.field private mBackgroundDrawable:Landroid/graphics/drawable/Drawable;

.field private mBottomDividerLineMarginLR:I

.field private mBottomDividerLineMarginLeft:I

.field private mBottomDividerLineMarginRight:I

.field private mBottomDividerLineParams:Landroid/widget/RelativeLayout$LayoutParams;

.field private mBottomDividerLineView:Landroid/view/View;

.field private mCenterBaseViewParams:Landroid/widget/RelativeLayout$LayoutParams;

.field private mCenterBottomLines:I

.field private mCenterBottomMaxEms:I

.field private mCenterBottomTextBold:Z

.field private mCenterBottomTextColor:I

.field private mCenterBottomTextSize:I

.field private mCenterBottomTextString:Ljava/lang/String;

.field private mCenterBottomTvClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnCenterBottomTvClickListener;

.field private mCenterEditText:Landroid/widget/EditText;

.field private mCenterGravity:I

.field private mCenterLines:I

.field private mCenterMaxEms:I

.field private mCenterSpaceHeight:I

.field private mCenterTextBackground:Landroid/graphics/drawable/Drawable;

.field private mCenterTextBold:Z

.field private mCenterTextColor:I

.field private mCenterTextSize:I

.field private mCenterTextString:Ljava/lang/String;

.field private mCenterTopLines:I

.field private mCenterTopMaxEms:I

.field private mCenterTopTextBold:Z

.field private mCenterTopTextColor:I

.field private mCenterTopTextSize:I

.field private mCenterTopTextString:Ljava/lang/String;

.field private mCenterTopTvClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnCenterTopTvClickListener;

.field private mCenterTvClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnCenterTvClickListener;

.field private mCenterTvDrawableHeight:I

.field private mCenterTvDrawableLeft:Landroid/graphics/drawable/Drawable;

.field private mCenterTvDrawableRight:Landroid/graphics/drawable/Drawable;

.field private mCenterTvDrawableWidth:I

.field private mCenterView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

.field private mCenterViewMarginLeft:I

.field private mCenterViewMarginRight:I

.field private mCheckBoxCheckedChangeListener:Landroid/widget/CompoundButton$OnCheckedChangeListener;

.field private mContext:Landroid/content/Context;

.field private mCornersBottomLeftRadius:F

.field private mCornersBottomRightRadius:F

.field private mCornersRadius:F

.field private mCornersTopLeftRadius:F

.field private mCornersTopRightRadius:F

.field private mDefaultMargin:I

.field private mDefaultMaxEms:I

.field private mDefaultShapeColor:I

.field private mDefaultTextColor:I

.field private mDefaultTextSize:I

.field private mDividerLineColor:I

.field private mDividerLineHeight:I

.field private mDividerLineType:I

.field private mEditBackground:Landroid/graphics/drawable/Drawable;

.field private mEditTextButtonType:I

.field private mEditTextHint:Ljava/lang/String;

.field private mEditTextInputType:I

.field private mEditTextString:Ljava/lang/String;

.field private mEditTextWidth:I

.field private mEnableEdit:Z

.field private mGradientDrawable:Landroid/graphics/drawable/GradientDrawable;

.field private mIsAsteriskStyle:Z

.field private mIsChecked:Z

.field private mLeftBaseViewParams:Landroid/widget/RelativeLayout$LayoutParams;

.field private mLeftBottomLines:I

.field private mLeftBottomMaxEms:I

.field private mLeftBottomTextBold:Z

.field private mLeftBottomTextColor:I

.field private mLeftBottomTextSize:I

.field private mLeftBottomTextString:Ljava/lang/String;

.field private mLeftBottomTvClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnLeftBottomTvClickListener;

.field private mLeftGravity:I

.field private mLeftIconHeight:I

.field private mLeftIconIV:Landroid/widget/ImageView;

.field private mLeftIconMarginLeft:I

.field private mLeftIconPadding:I

.field private mLeftIconRes:Landroid/graphics/drawable/Drawable;

.field private mLeftIconTint:Landroid/content/res/ColorStateList;

.field private mLeftIconWidth:I

.field private mLeftImageViewClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnLeftImageViewClickListener;

.field private mLeftImgParams:Landroid/widget/RelativeLayout$LayoutParams;

.field private mLeftLines:I

.field private mLeftMaxEms:I

.field private mLeftTextBackground:Landroid/graphics/drawable/Drawable;

.field private mLeftTextBold:Z

.field private mLeftTextColor:I

.field private mLeftTextSize:I

.field private mLeftTextString:Ljava/lang/String;

.field private mLeftTopLines:I

.field private mLeftTopMaxEms:I

.field private mLeftTopTextBold:Z

.field private mLeftTopTextColor:I

.field private mLeftTopTextSize:I

.field private mLeftTopTextString:Ljava/lang/String;

.field private mLeftTopTvClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnLeftTopTvClickListener;

.field private mLeftTvClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnLeftTvClickListener;

.field private mLeftTvDrawableHeight:I

.field private mLeftTvDrawableLeft:Landroid/graphics/drawable/Drawable;

.field private mLeftTvDrawableRight:Landroid/graphics/drawable/Drawable;

.field private mLeftTvDrawableWidth:I

.field private mLeftView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

.field private mLeftViewMarginLeft:I

.field private mLeftViewMarginRight:I

.field private mLeftViewWidth:I

.field private mRightBaseViewParams:Landroid/widget/RelativeLayout$LayoutParams;

.field private mRightBottomLines:I

.field private mRightBottomMaxEms:I

.field private mRightBottomTextBold:Z

.field private mRightBottomTextColor:I

.field private mRightBottomTextSize:I

.field private mRightBottomTextString:Ljava/lang/String;

.field private mRightBottomTvClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnRightBottomTvClickListener;

.field private mRightCheckBox:Landroid/widget/CheckBox;

.field private mRightCheckBoxBg:Landroid/graphics/drawable/Drawable;

.field private mRightCheckBoxMarginRight:I

.field private mRightGravity:I

.field private mRightIconHeight:I

.field private mRightIconIV:Landroid/widget/ImageView;

.field private mRightIconMarginRight:I

.field private mRightIconPadding:I

.field private mRightIconRes:Landroid/graphics/drawable/Drawable;

.field private mRightIconTint:Landroid/content/res/ColorStateList;

.field private mRightIconWidth:I

.field private mRightImageViewClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnRightImageViewClickListener;

.field private mRightImgParams:Landroid/widget/RelativeLayout$LayoutParams;

.field private mRightLines:I

.field private mRightMaxEms:I

.field private mRightSwitch:Landroid/widget/Switch;

.field private mRightSwitchMarginRight:I

.field private mRightTextBackground:Landroid/graphics/drawable/Drawable;

.field private mRightTextBold:Z

.field private mRightTextColor:I

.field private mRightTextSize:I

.field private mRightTextString:Ljava/lang/String;

.field private mRightTopLines:I

.field private mRightTopMaxEms:I

.field private mRightTopTextBold:Z

.field private mRightTopTextColor:I

.field private mRightTopTextSize:I

.field private mRightTopTextString:Ljava/lang/String;

.field private mRightTopTvClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnRightTopTvClickListener;

.field private mRightTvClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnRightTvClickListener;

.field private mRightTvDrawableHeight:I

.field private mRightTvDrawableLeft:Landroid/graphics/drawable/Drawable;

.field private mRightTvDrawableRight:Landroid/graphics/drawable/Drawable;

.field private mRightTvDrawableWidth:I

.field private mRightView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

.field private mRightViewMarginLeft:I

.field private mRightViewMarginRight:I

.field private mRightViewType:I

.field private mSelectorNormalColor:I

.field private mSelectorPressedColor:I

.field private mSolidColor:I

.field private mStrokeColor:I

.field private mStrokeDashGap:F

.field private mStrokeDashWidth:F

.field private mStrokeWidth:I

.field private mSuperTextViewClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnSuperTextViewClickListener;

.field private mSwitchCheckedChangeListener:Landroid/widget/CompoundButton$OnCheckedChangeListener;

.field private mSwitchIsChecked:Z

.field private mSwitchMinWidth:I

.field private mSwitchPadding:I

.field private mSwitchTextOff:Ljava/lang/String;

.field private mSwitchTextOn:Ljava/lang/String;

.field private mSwitchThumbResource:Landroid/graphics/drawable/Drawable;

.field private mSwitchTrackResource:Landroid/graphics/drawable/Drawable;

.field private mTextViewDrawablePadding:I

.field private mThumbTextPadding:I

.field private mTopDividerLineMarginLR:I

.field private mTopDividerLineMarginLeft:I

.field private mTopDividerLineMarginRight:I

.field private mTopDividerLineParams:Landroid/widget/RelativeLayout$LayoutParams;

.field private mTopDividerLineView:Landroid/view/View;

.field private mUseRipple:Z

.field private mUseShape:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mEnableEdit:Z

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mEditTextWidth:I

    const/4 v0, 0x1

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mEditTextButtonType:I

    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 6
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mEnableEdit:Z

    const/4 v0, -0x1

    .line 8
    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mEditTextWidth:I

    const/4 v0, 0x1

    .line 9
    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mEditTextButtonType:I

    .line 10
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 11
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p3, 0x0

    .line 12
    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mEnableEdit:Z

    const/4 p3, -0x1

    .line 13
    iput p3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mEditTextWidth:I

    const/4 p3, 0x1

    .line 14
    iput p3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mEditTextButtonType:I

    .line 15
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnLeftTopTvClickListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTopTvClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnLeftTopTvClickListener;

    return-object p0
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnLeftTvClickListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTvClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnLeftTvClickListener;

    return-object p0
.end method

.method static synthetic access$1000(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;)Landroid/widget/ImageView;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftIconIV:Landroid/widget/ImageView;

    return-object p0
.end method

.method static synthetic access$1100(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnLeftImageViewClickListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftImageViewClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnLeftImageViewClickListener;

    return-object p0
.end method

.method static synthetic access$1200(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;)Landroid/widget/ImageView;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightIconIV:Landroid/widget/ImageView;

    return-object p0
.end method

.method static synthetic access$1300(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnRightImageViewClickListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightImageViewClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnRightImageViewClickListener;

    return-object p0
.end method

.method static synthetic access$200(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnLeftBottomTvClickListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftBottomTvClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnLeftBottomTvClickListener;

    return-object p0
.end method

.method static synthetic access$300(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnCenterTopTvClickListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTopTvClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnCenterTopTvClickListener;

    return-object p0
.end method

.method static synthetic access$400(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnCenterTvClickListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTvClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnCenterTvClickListener;

    return-object p0
.end method

.method static synthetic access$500(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnCenterBottomTvClickListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterBottomTvClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnCenterBottomTvClickListener;

    return-object p0
.end method

.method static synthetic access$600(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnRightTopTvClickListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTopTvClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnRightTopTvClickListener;

    return-object p0
.end method

.method static synthetic access$700(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnRightTvClickListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTvClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnRightTvClickListener;

    return-object p0
.end method

.method static synthetic access$800(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnRightBottomTvClickListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightBottomTvClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnRightBottomTvClickListener;

    return-object p0
.end method

.method static synthetic access$900(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnSuperTextViewClickListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mSuperTextViewClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnSuperTextViewClickListener;

    return-object p0
.end method

.method private getAttr(Landroid/util/AttributeSet;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mContext:Landroid/content/Context;

    sget-object v1, Lcom/xuexiang/xui/R$styleable;->SuperTextView:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sLeftTextString:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTextString:Ljava/lang/String;

    .line 3
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sLeftTopTextString:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTopTextString:Ljava/lang/String;

    .line 4
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sLeftBottomTextString:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftBottomTextString:Ljava/lang/String;

    .line 5
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sCenterTextString:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTextString:Ljava/lang/String;

    .line 6
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sCenterTopTextString:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTopTextString:Ljava/lang/String;

    .line 7
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sCenterBottomTextString:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterBottomTextString:Ljava/lang/String;

    .line 8
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sRightTextString:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTextString:Ljava/lang/String;

    .line 9
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sRightTopTextString:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTopTextString:Ljava/lang/String;

    .line 10
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sRightBottomTextString:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightBottomTextString:Ljava/lang/String;

    .line 11
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sLeftTextColor:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultTextColor:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTextColor:I

    .line 12
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sLeftTopTextColor:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultTextColor:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTopTextColor:I

    .line 13
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sLeftBottomTextColor:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultTextColor:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftBottomTextColor:I

    .line 14
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sCenterTextColor:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultTextColor:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTextColor:I

    .line 15
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sCenterTopTextColor:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultTextColor:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTopTextColor:I

    .line 16
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sCenterBottomTextColor:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultTextColor:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterBottomTextColor:I

    .line 17
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sRightTextColor:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultTextColor:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTextColor:I

    .line 18
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sRightTopTextColor:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultTextColor:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTopTextColor:I

    .line 19
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sRightBottomTextColor:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultTextColor:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightBottomTextColor:I

    .line 20
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sLeftTextSize:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultTextSize:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTextSize:I

    .line 21
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sLeftTopTextSize:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultTextSize:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTopTextSize:I

    .line 22
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sLeftBottomTextSize:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultTextSize:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftBottomTextSize:I

    .line 23
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sCenterTextSize:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultTextSize:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTextSize:I

    .line 24
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sCenterTopTextSize:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultTextSize:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTopTextSize:I

    .line 25
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sCenterBottomTextSize:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultTextSize:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterBottomTextSize:I

    .line 26
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sRightTextSize:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultTextSize:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTextSize:I

    .line 27
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sRightTopTextSize:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultTextSize:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTopTextSize:I

    .line 28
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sRightBottomTextSize:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultTextSize:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightBottomTextSize:I

    .line 29
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sLeftTopLines:I

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTopLines:I

    .line 30
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sLeftLines:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftLines:I

    .line 31
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sLeftBottomLines:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftBottomLines:I

    .line 32
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sCenterTopLines:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTopLines:I

    .line 33
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sCenterLines:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterLines:I

    .line 34
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sCenterBottomLines:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterBottomLines:I

    .line 35
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sRightTopLines:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTopLines:I

    .line 36
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sRightLines:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightLines:I

    .line 37
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sRightBottomLines:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightBottomLines:I

    .line 38
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sLeftTopMaxEms:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultMaxEms:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTopMaxEms:I

    .line 39
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sLeftMaxEms:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultMaxEms:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftMaxEms:I

    .line 40
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sLeftBottomMaxEms:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultMaxEms:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftBottomMaxEms:I

    .line 41
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sCenterTopMaxEms:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultMaxEms:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTopMaxEms:I

    .line 42
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sCenterMaxEms:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultMaxEms:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterMaxEms:I

    .line 43
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sCenterBottomMaxEms:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultMaxEms:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterBottomMaxEms:I

    .line 44
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sRightTopMaxEms:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultMaxEms:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTopMaxEms:I

    .line 45
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sRightMaxEms:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultMaxEms:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightMaxEms:I

    .line 46
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sRightBottomMaxEms:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultMaxEms:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightBottomMaxEms:I

    .line 47
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sLeftViewGravity:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftGravity:I

    .line 48
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sCenterViewGravity:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterGravity:I

    .line 49
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sRightViewGravity:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightGravity:I

    .line 50
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v2, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sLeftTvDrawableLeft:I

    invoke-static {v0, p1, v2}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTvDrawableLeft:Landroid/graphics/drawable/Drawable;

    .line 51
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v2, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sLeftTvDrawableRight:I

    invoke-static {v0, p1, v2}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTvDrawableRight:Landroid/graphics/drawable/Drawable;

    .line 52
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v2, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sCenterTvDrawableLeft:I

    invoke-static {v0, p1, v2}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTvDrawableLeft:Landroid/graphics/drawable/Drawable;

    .line 53
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v2, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sCenterTvDrawableRight:I

    invoke-static {v0, p1, v2}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTvDrawableRight:Landroid/graphics/drawable/Drawable;

    .line 54
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v2, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sRightTvDrawableLeft:I

    invoke-static {v0, p1, v2}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTvDrawableLeft:Landroid/graphics/drawable/Drawable;

    .line 55
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v2, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sRightTvDrawableRight:I

    invoke-static {v0, p1, v2}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTvDrawableRight:Landroid/graphics/drawable/Drawable;

    .line 56
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sTextViewDrawablePadding:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultMargin:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mTextViewDrawablePadding:I

    .line 57
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sLeftTvDrawableWidth:I

    const/4 v2, -0x1

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTvDrawableWidth:I

    .line 58
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sLeftTvDrawableHeight:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTvDrawableHeight:I

    .line 59
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sCenterTvDrawableWidth:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTvDrawableWidth:I

    .line 60
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sCenterTvDrawableHeight:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTvDrawableHeight:I

    .line 61
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sRightTvDrawableWidth:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTvDrawableWidth:I

    .line 62
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sRightTvDrawableHeight:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTvDrawableHeight:I

    .line 63
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sLeftViewWidth:I

    const/4 v3, 0x0

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftViewWidth:I

    .line 64
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sTopDividerLineMarginLR:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mTopDividerLineMarginLR:I

    .line 65
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sTopDividerLineMarginLeft:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mTopDividerLineMarginLeft:I

    .line 66
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sTopDividerLineMarginRight:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mTopDividerLineMarginRight:I

    .line 67
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sBottomDividerLineMarginLR:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mBottomDividerLineMarginLR:I

    .line 68
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sBottomDividerLineMarginLeft:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mBottomDividerLineMarginLeft:I

    .line 69
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sBottomDividerLineMarginRight:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mBottomDividerLineMarginRight:I

    .line 70
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sDividerLineType:I

    const/4 v4, 0x2

    invoke-virtual {p1, v0, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDividerLineType:I

    .line 71
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sDividerLineColor:I

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v4

    sget v5, Lcom/xuexiang/xui/R$attr;->xui_config_color_separator_light:I

    invoke-static {v4, v5}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveColor(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {p1, v0, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDividerLineColor:I

    .line 72
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sDividerLineHeight:I

    iget-object v4, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mContext:Landroid/content/Context;

    const/high16 v5, 0x3f000000    # 0.5f

    invoke-static {v4, v5}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result v4

    invoke-virtual {p1, v0, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDividerLineHeight:I

    .line 73
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sLeftViewMarginLeft:I

    iget v4, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultMargin:I

    invoke-virtual {p1, v0, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftViewMarginLeft:I

    .line 74
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sLeftViewMarginRight:I

    iget v4, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultMargin:I

    invoke-virtual {p1, v0, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftViewMarginRight:I

    .line 75
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sCenterViewMarginLeft:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterViewMarginLeft:I

    .line 76
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sCenterViewMarginRight:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterViewMarginRight:I

    .line 77
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sRightViewMarginLeft:I

    iget v4, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultMargin:I

    invoke-virtual {p1, v0, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightViewMarginLeft:I

    .line 78
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sRightViewMarginRight:I

    iget v4, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultMargin:I

    invoke-virtual {p1, v0, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightViewMarginRight:I

    .line 79
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v4, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sLeftIconRes:I

    invoke-static {v0, p1, v4}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftIconRes:Landroid/graphics/drawable/Drawable;

    .line 80
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sLeftIconWidth:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftIconWidth:I

    .line 81
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sLeftIconHeight:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftIconHeight:I

    .line 82
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sLeftIconMarginLeft:I

    iget v4, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultMargin:I

    invoke-virtual {p1, v0, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftIconMarginLeft:I

    .line 83
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v4, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sLeftIconTint:I

    invoke-static {v0, p1, v4}, Lcom/xuexiang/xui/utils/ResUtils;->getColorStateListAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftIconTint:Landroid/content/res/ColorStateList;

    .line 84
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sLeftIconPadding:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v5

    iput v5, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftIconPadding:I

    .line 85
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v5

    sget v6, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sRightIconRes:I

    invoke-static {v5, p1, v6}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    iput-object v5, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightIconRes:Landroid/graphics/drawable/Drawable;

    .line 86
    sget v5, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sRightIconWidth:I

    invoke-virtual {p1, v5, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v5

    iput v5, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightIconWidth:I

    .line 87
    sget v5, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sRightIconHeight:I

    invoke-virtual {p1, v5, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v5

    iput v5, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightIconHeight:I

    .line 88
    sget v5, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sRightIconMarginRight:I

    iget v6, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultMargin:I

    invoke-virtual {p1, v5, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v5

    iput v5, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightIconMarginRight:I

    .line 89
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, p1, v4}, Lcom/xuexiang/xui/utils/ResUtils;->getColorStateListAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v4

    iput-object v4, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightIconTint:Landroid/content/res/ColorStateList;

    .line 90
    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightIconPadding:I

    .line 91
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sLeftTopTextIsBold:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTopTextBold:Z

    .line 92
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sLeftTextIsBold:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTextBold:Z

    .line 93
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sLeftBottomTextIsBold:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftBottomTextBold:Z

    .line 94
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sCenterTopTextIsBold:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTopTextBold:Z

    .line 95
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sCenterTextIsBold:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTextBold:Z

    .line 96
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sCenterBottomTextIsBold:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterBottomTextBold:Z

    .line 97
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sRightTopTextIsBold:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTopTextBold:Z

    .line 98
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sRightTextIsBold:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTextBold:Z

    .line 99
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sRightBottomTextIsBold:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightBottomTextBold:Z

    .line 100
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v4, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sLeftTextBackground:I

    invoke-static {v0, p1, v4}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTextBackground:Landroid/graphics/drawable/Drawable;

    .line 101
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v4, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sCenterTextBackground:I

    invoke-static {v0, p1, v4}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTextBackground:Landroid/graphics/drawable/Drawable;

    .line 102
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v4, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sRightTextBackground:I

    invoke-static {v0, p1, v4}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTextBackground:Landroid/graphics/drawable/Drawable;

    .line 103
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sEnableEdit:I

    iget-boolean v4, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mEnableEdit:Z

    invoke-virtual {p1, v0, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mEnableEdit:Z

    .line 104
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v4, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sEditBackGround:I

    invoke-static {v0, p1, v4}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mEditBackground:Landroid/graphics/drawable/Drawable;

    .line 105
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sEditTextWidth:I

    iget v4, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mEditTextWidth:I

    invoke-virtual {p1, v0, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mEditTextWidth:I

    .line 106
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sEditTextString:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mEditTextString:Ljava/lang/String;

    .line 107
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sEditTextHint:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mEditTextHint:Ljava/lang/String;

    .line 108
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_android_inputType:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mEditTextInputType:I

    .line 109
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sEditTextButtonType:I

    iget v4, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mEditTextButtonType:I

    invoke-virtual {p1, v0, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mEditTextButtonType:I

    .line 110
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sEditTextIsAsteriskStyle:I

    iget-boolean v4, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mIsAsteriskStyle:Z

    invoke-virtual {p1, v0, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mIsAsteriskStyle:Z

    .line 111
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sUseRipple:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mUseRipple:Z

    .line 112
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sBackgroundDrawableRes:I

    invoke-static {v0, p1, v1}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mBackgroundDrawable:Landroid/graphics/drawable/Drawable;

    .line 113
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sRightViewType:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightViewType:I

    .line 114
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sIsChecked:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mIsChecked:Z

    .line 115
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sRightCheckBoxMarginRight:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultMargin:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightCheckBoxMarginRight:I

    .line 116
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sRightCheckBoxRes:I

    invoke-static {v0, p1, v1}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightCheckBoxBg:Landroid/graphics/drawable/Drawable;

    .line 117
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sRightSwitchMarginRight:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultMargin:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightSwitchMarginRight:I

    .line 118
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sSwitchIsChecked:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mSwitchIsChecked:Z

    .line 119
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sTextOff:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mSwitchTextOff:Ljava/lang/String;

    .line 120
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sTextOn:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mSwitchTextOn:Ljava/lang/String;

    .line 121
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sSwitchMinWidth:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mSwitchMinWidth:I

    .line 122
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sSwitchPadding:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mSwitchPadding:I

    .line 123
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sThumbTextPadding:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mThumbTextPadding:I

    .line 124
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sThumbResource:I

    invoke-static {v0, p1, v1}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mSwitchThumbResource:Landroid/graphics/drawable/Drawable;

    .line 125
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sTrackResource:I

    invoke-static {v0, p1, v1}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mSwitchTrackResource:Landroid/graphics/drawable/Drawable;

    .line 126
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sCenterSpaceHeight:I

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mContext:Landroid/content/Context;

    const/high16 v2, 0x40a00000    # 5.0f

    invoke-static {v1, v2}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterSpaceHeight:I

    .line 127
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sShapeSelectorPressedColor:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultShapeColor:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mSelectorPressedColor:I

    .line 128
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sShapeSelectorNormalColor:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultShapeColor:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mSelectorNormalColor:I

    .line 129
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sShapeSolidColor:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultShapeColor:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mSolidColor:I

    .line 130
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sShapeCornersRadius:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCornersRadius:F

    .line 131
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sShapeCornersTopLeftRadius:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCornersTopLeftRadius:F

    .line 132
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sShapeCornersTopRightRadius:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCornersTopRightRadius:F

    .line 133
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sShapeCornersBottomLeftRadius:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCornersBottomLeftRadius:F

    .line 134
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sShapeCornersBottomRightRadius:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCornersBottomRightRadius:F

    .line 135
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sShapeStrokeWidth:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mStrokeWidth:I

    .line 136
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sShapeStrokeDashWidth:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mStrokeDashWidth:F

    .line 137
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sShapeStrokeDashGap:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mStrokeDashGap:F

    .line 138
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sShapeStrokeColor:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultShapeColor:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mStrokeColor:I

    .line 139
    sget v0, Lcom/xuexiang/xui/R$styleable;->SuperTextView_sUseShape:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mUseShape:Z

    .line 140
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private getParams(Landroid/widget/RelativeLayout$LayoutParams;)Landroid/widget/RelativeLayout$LayoutParams;
    .locals 1

    if-nez p1, :cond_0

    new-instance p1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v0, -0x2

    invoke-direct {p1, v0, v0}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    :cond_0
    return-object p1
.end method

.method private initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mContext:Landroid/content/Context;

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->stv_color_common_text:I

    sget v1, Lcom/xuexiang/xui/R$color;->stv_color_common_text:I

    invoke-static {v1}, Lcom/xuexiang/xui/utils/ResUtils;->getColor(I)I

    move-result v1

    invoke-static {p1, v0, v1}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveColor(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultTextColor:I

    .line 3
    sget v0, Lcom/xuexiang/xui/R$attr;->stv_text_size:I

    sget v1, Lcom/xuexiang/xui/R$dimen;->default_stv_text_size:I

    invoke-static {v1}, Lcom/xuexiang/xui/utils/ResUtils;->getDimensionPixelSize(I)I

    move-result v1

    invoke-static {p1, v0, v1}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultTextSize:I

    .line 4
    sget v0, Lcom/xuexiang/xui/R$attr;->stv_max_ems:I

    const/16 v1, 0x14

    invoke-static {p1, v0, v1}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveInt(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultMaxEms:I

    .line 5
    sget v0, Lcom/xuexiang/xui/R$attr;->stv_margin:I

    sget v1, Lcom/xuexiang/xui/R$dimen;->default_stv_margin:I

    invoke-static {v1}, Lcom/xuexiang/xui/utils/ResUtils;->getDimensionPixelSize(I)I

    move-result v1

    invoke-static {p1, v0, v1}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultMargin:I

    .line 6
    sget v0, Lcom/xuexiang/xui/R$attr;->stv_color_shape:I

    sget v1, Lcom/xuexiang/xui/R$color;->xui_config_color_white:I

    invoke-static {v1}, Lcom/xuexiang/xui/utils/ResUtils;->getColor(I)I

    move-result v1

    invoke-static {p1, v0, v1}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveColor(Landroid/content/Context;II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDefaultShapeColor:I

    .line 7
    invoke-direct {p0, p2}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->getAttr(Landroid/util/AttributeSet;)V

    .line 8
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->initView()V

    return-void
.end method

.method private initBaseView(I)Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;
    .locals 2

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setId(I)V

    return-object v0
.end method

.method private initBottomDividerLineView(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mBottomDividerLineView:Landroid/view/View;

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mBottomDividerLineParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x1

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDividerLineHeight:I

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mBottomDividerLineParams:Landroid/widget/RelativeLayout$LayoutParams;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mBottomDividerLineParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v2, 0xc

    invoke-virtual {v0, v2, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mBottomDividerLineParams:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, p1}, Landroid/widget/RelativeLayout$LayoutParams;->setMarginStart(I)V

    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mBottomDividerLineParams:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout$LayoutParams;->setMarginEnd(I)V

    .line 7
    new-instance p1, Landroid/view/View;

    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mContext:Landroid/content/Context;

    invoke-direct {p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mBottomDividerLineView:Landroid/view/View;

    .line 8
    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mBottomDividerLineParams:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mBottomDividerLineView:Landroid/view/View;

    iget p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDividerLineColor:I

    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 10
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mBottomDividerLineView:Landroid/view/View;

    invoke-virtual {p0, p1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    return-void
.end method

.method private initCenterTextView()V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mEnableEdit:Z

    const/16 v1, 0x10

    const/16 v2, 0x11

    const/16 v3, 0xf

    const/16 v4, 0xd

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, -0x1

    if-eqz v0, :cond_6

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterEditText:Landroid/widget/EditText;

    if-nez v0, :cond_2

    .line 3
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mEditTextButtonType:I

    if-nez v0, :cond_0

    .line 4
    new-instance v0, Landroidx/appcompat/widget/AppCompatEditText;

    iget-object v8, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mContext:Landroid/content/Context;

    invoke-direct {v0, v8}, Landroidx/appcompat/widget/AppCompatEditText;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterEditText:Landroid/widget/EditText;

    goto :goto_0

    :cond_0
    if-ne v0, v5, :cond_1

    .line 5
    new-instance v0, Lcom/xuexiang/xui/widget/edittext/ClearEditText;

    iget-object v8, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mContext:Landroid/content/Context;

    invoke-direct {v0, v8}, Lcom/xuexiang/xui/widget/edittext/ClearEditText;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterEditText:Landroid/widget/EditText;

    goto :goto_0

    :cond_1
    const/4 v8, 0x2

    if-ne v0, v8, :cond_2

    .line 6
    new-instance v0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;

    iget-object v8, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mContext:Landroid/content/Context;

    invoke-direct {v0, v8}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterEditText:Landroid/widget/EditText;

    .line 7
    move-object v8, v0

    check-cast v8, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;

    iget-boolean v8, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mIsAsteriskStyle:Z

    invoke-virtual {v0, v8}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->setIsAsteriskStyle(Z)Lcom/xuexiang/xui/widget/edittext/PasswordEditText;

    .line 8
    :cond_2
    :goto_0
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    iget v8, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mEditTextWidth:I

    const/4 v9, -0x2

    invoke-direct {v0, v8, v9}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 9
    invoke-virtual {v0, v4, v7}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 10
    invoke-virtual {v0, v3, v7}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 11
    iget v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterGravity:I

    if-eq v3, v5, :cond_3

    .line 12
    sget v3, Lcom/xuexiang/xui/R$id;->sLeftViewId:I

    invoke-virtual {v0, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 13
    sget v2, Lcom/xuexiang/xui/R$id;->sRightViewId:I

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 14
    :cond_3
    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterViewMarginLeft:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterViewMarginRight:I

    invoke-virtual {v0, v1, v6, v2, v6}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 15
    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterViewMarginLeft:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->setMarginStart(I)V

    .line 16
    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterViewMarginRight:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->setMarginEnd(I)V

    .line 17
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterEditText:Landroid/widget/EditText;

    sget v2, Lcom/xuexiang/xui/R$id;->sCenterEditTextId:I

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setId(I)V

    .line 18
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterEditText:Landroid/widget/EditText;

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 19
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mEditBackground:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_4

    .line 20
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterEditText:Landroid/widget/EditText;

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 21
    :cond_4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterEditText:Landroid/widget/EditText;

    sget v1, Lcom/xuexiang/xui/R$color;->xui_config_color_transparent:I

    invoke-static {v1}, Lcom/xuexiang/xui/utils/ResUtils;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setBackgroundColor(I)V

    .line 22
    :goto_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterEditText:Landroid/widget/EditText;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTextColor:I

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setTextColor(I)V

    .line 23
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterEditText:Landroid/widget/EditText;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTextSize:I

    int-to-float v1, v1

    invoke-virtual {v0, v6, v1}, Landroid/widget/EditText;->setTextSize(IF)V

    .line 24
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterEditText:Landroid/widget/EditText;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterLines:I

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setMaxLines(I)V

    .line 25
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterEditText:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mEditTextString:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 26
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterEditText:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mEditTextHint:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    .line 27
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mEditTextInputType:I

    if-eq v0, v7, :cond_5

    .line 28
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterEditText:Landroid/widget/EditText;

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setInputType(I)V

    .line 29
    :cond_5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterEditText:Landroid/widget/EditText;

    invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    goto/16 :goto_2

    .line 30
    :cond_6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-nez v0, :cond_7

    .line 31
    sget v0, Lcom/xuexiang/xui/R$id;->sCenterViewId:I

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->initBaseView(I)Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    .line 32
    :cond_7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterBaseViewParams:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->getParams(Landroid/widget/RelativeLayout$LayoutParams;)Landroid/widget/RelativeLayout$LayoutParams;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterBaseViewParams:Landroid/widget/RelativeLayout$LayoutParams;

    .line 33
    invoke-virtual {v0, v4, v7}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 34
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterBaseViewParams:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v3, v7}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 35
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterGravity:I

    if-eq v0, v5, :cond_8

    .line 36
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterBaseViewParams:Landroid/widget/RelativeLayout$LayoutParams;

    sget v3, Lcom/xuexiang/xui/R$id;->sLeftViewId:I

    invoke-virtual {v0, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 37
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterBaseViewParams:Landroid/widget/RelativeLayout$LayoutParams;

    sget v2, Lcom/xuexiang/xui/R$id;->sRightViewId:I

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 38
    :cond_8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterBaseViewParams:Landroid/widget/RelativeLayout$LayoutParams;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterViewMarginLeft:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterViewMarginRight:I

    invoke-virtual {v0, v1, v6, v2, v6}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 39
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterBaseViewParams:Landroid/widget/RelativeLayout$LayoutParams;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterViewMarginLeft:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->setMarginStart(I)V

    .line 40
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterBaseViewParams:Landroid/widget/RelativeLayout$LayoutParams;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterViewMarginRight:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->setMarginEnd(I)V

    .line 41
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterBaseViewParams:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 42
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterSpaceHeight:I

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->setCenterSpaceHeight(I)V

    .line 43
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTopTextColor:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTextColor:I

    iget v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterBottomTextColor:I

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultColor(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;III)V

    .line 44
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTopTextSize:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTextSize:I

    iget v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterBottomTextSize:I

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultSize(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;III)V

    .line 45
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTopLines:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterLines:I

    iget v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterBottomLines:I

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultLines(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;III)V

    .line 46
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTopMaxEms:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterMaxEms:I

    iget v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterBottomMaxEms:I

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultMaxEms(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;III)V

    .line 47
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTopTextBold:Z

    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTextBold:Z

    iget-boolean v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterBottomTextBold:Z

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultTextIsBold(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;ZZZ)V

    .line 48
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterGravity:I

    invoke-direct {p0, v0, v1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultGravity(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;I)V

    .line 49
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getCenterTextView()Landroid/widget/TextView;

    move-result-object v2

    iget-object v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTvDrawableLeft:Landroid/graphics/drawable/Drawable;

    iget-object v4, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTvDrawableRight:Landroid/graphics/drawable/Drawable;

    iget v5, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mTextViewDrawablePadding:I

    iget v6, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTvDrawableWidth:I

    iget v7, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTvDrawableHeight:I

    move-object v1, p0

    invoke-virtual/range {v1 .. v7}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultDrawable(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;III)V

    .line 50
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getCenterTextView()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTextBackground:Landroid/graphics/drawable/Drawable;

    invoke-direct {p0, v0, v1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultBackground(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;)V

    .line 51
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTopTextString:Ljava/lang/String;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTextString:Ljava/lang/String;

    iget-object v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterBottomTextString:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultString(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    :goto_2
    return-void
.end method

.method private initDividerLineView()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mUseShape:Z

    if-nez v0, :cond_3

    .line 2
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDividerLineType:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setTopDividerLineView()V

    .line 4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setBottomDividerLineView()V

    goto :goto_0

    .line 5
    :cond_1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setBottomDividerLineView()V

    goto :goto_0

    .line 6
    :cond_2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setTopDividerLineView()V

    :cond_3
    :goto_0
    return-void
.end method

.method private initExtraView()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightViewType:I

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->initRightSwitch()V

    goto :goto_0

    .line 3
    :cond_1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->initRightCheckBox()V

    :goto_0
    return-void
.end method

.method private initLeftIcon()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftIconIV:Landroid/widget/ImageView;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Landroidx/appcompat/widget/AppCompatImageView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftIconIV:Landroid/widget/ImageView;

    .line 3
    :cond_0
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftImgParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0x14

    const/4 v2, -0x1

    .line 4
    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftImgParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xf

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 6
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftIconHeight:I

    if-eqz v0, :cond_1

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftIconWidth:I

    if-eqz v1, :cond_1

    .line 7
    iget-object v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftImgParams:Landroid/widget/RelativeLayout$LayoutParams;

    iput v1, v2, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 8
    iput v0, v2, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 9
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftIconIV:Landroid/widget/ImageView;

    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftIconIV:Landroid/widget/ImageView;

    sget v1, Lcom/xuexiang/xui/R$id;->sLeftImgId:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setId(I)V

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftIconIV:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftImgParams:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftIconIV:Landroid/widget/ImageView;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftIconPadding:I

    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/widget/ImageView;->setPadding(IIII)V

    .line 13
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftIconRes:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    .line 14
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftImgParams:Landroid/widget/RelativeLayout$LayoutParams;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftIconMarginLeft:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 15
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftImgParams:Landroid/widget/RelativeLayout$LayoutParams;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftIconMarginLeft:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->setMarginStart(I)V

    .line 16
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftIconIV:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftIconRes:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 17
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftIconTint:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_3

    .line 18
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftIconIV:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 19
    :cond_3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftIconIV:Landroid/widget/ImageView;

    invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    return-void
.end method

.method private initLeftTextView()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-nez v0, :cond_0

    .line 2
    sget v0, Lcom/xuexiang/xui/R$id;->sLeftViewId:I

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->initBaseView(I)Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftBaseViewParams:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->getParams(Landroid/widget/RelativeLayout$LayoutParams;)Landroid/widget/RelativeLayout$LayoutParams;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftBaseViewParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0x11

    .line 4
    sget v2, Lcom/xuexiang/xui/R$id;->sLeftImgId:I

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftBaseViewParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xf

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 6
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftViewWidth:I

    if-eqz v0, :cond_1

    .line 7
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftBaseViewParams:Landroid/widget/RelativeLayout$LayoutParams;

    iput v0, v1, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftBaseViewParams:Landroid/widget/RelativeLayout$LayoutParams;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftViewMarginLeft:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftViewMarginRight:I

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftBaseViewParams:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterSpaceHeight:I

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->setCenterSpaceHeight(I)V

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTopTextColor:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTextColor:I

    iget v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftBottomTextColor:I

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultColor(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;III)V

    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTopTextSize:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTextSize:I

    iget v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftBottomTextSize:I

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultSize(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;III)V

    .line 13
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTopLines:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftLines:I

    iget v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftBottomLines:I

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultLines(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;III)V

    .line 14
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTopMaxEms:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftMaxEms:I

    iget v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftBottomMaxEms:I

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultMaxEms(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;III)V

    .line 15
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTopTextBold:Z

    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTextBold:Z

    iget-boolean v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftBottomTextBold:Z

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultTextIsBold(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;ZZZ)V

    .line 16
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftGravity:I

    invoke-direct {p0, v0, v1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultGravity(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;I)V

    .line 17
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getCenterTextView()Landroid/widget/TextView;

    move-result-object v2

    iget-object v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTvDrawableLeft:Landroid/graphics/drawable/Drawable;

    iget-object v4, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTvDrawableRight:Landroid/graphics/drawable/Drawable;

    iget v5, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mTextViewDrawablePadding:I

    iget v6, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTvDrawableWidth:I

    iget v7, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTvDrawableHeight:I

    move-object v1, p0

    invoke-virtual/range {v1 .. v7}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultDrawable(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;III)V

    .line 18
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getCenterTextView()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTextBackground:Landroid/graphics/drawable/Drawable;

    invoke-direct {p0, v0, v1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultBackground(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;)V

    .line 19
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTopTextString:Ljava/lang/String;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTextString:Ljava/lang/String;

    iget-object v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftBottomTextString:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultString(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    return-void
.end method

.method private initRightCheckBox()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightCheckBox:Landroid/widget/CheckBox;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Landroid/widget/CheckBox;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/CheckBox;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightCheckBox:Landroid/widget/CheckBox;

    .line 3
    :cond_0
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0x15

    const/4 v2, -0x1

    .line 4
    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    const/16 v1, 0xf

    .line 5
    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 6
    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightCheckBoxMarginRight:I

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v2, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 7
    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightCheckBoxMarginRight:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->setMarginEnd(I)V

    .line 8
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightCheckBox:Landroid/widget/CheckBox;

    sget v2, Lcom/xuexiang/xui/R$id;->sRightCheckBoxId:I

    invoke-virtual {v1, v2}, Landroid/widget/CheckBox;->setId(I)V

    .line 9
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightCheckBox:Landroid/widget/CheckBox;

    invoke-virtual {v1, v0}, Landroid/widget/CheckBox;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightCheckBoxBg:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightCheckBox:Landroid/widget/CheckBox;

    const/16 v1, 0xd

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setGravity(I)V

    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightCheckBox:Landroid/widget/CheckBox;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightCheckBoxBg:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 13
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightCheckBox:Landroid/widget/CheckBox;

    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mIsChecked:Z

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 14
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightCheckBox:Landroid/widget/CheckBox;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCheckBoxCheckedChangeListener:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 15
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightCheckBox:Landroid/widget/CheckBox;

    invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    return-void
.end method

.method private initRightIcon()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightIconIV:Landroid/widget/ImageView;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Landroidx/appcompat/widget/AppCompatImageView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightIconIV:Landroid/widget/ImageView;

    .line 3
    :cond_0
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightImgParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xf

    const/4 v2, -0x1

    .line 4
    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 5
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightViewType:I

    const/16 v1, 0x10

    if-eqz v0, :cond_2

    const/4 v3, 0x1

    if-eq v0, v3, :cond_1

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightImgParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0x15

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    goto :goto_0

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightImgParams:Landroid/widget/RelativeLayout$LayoutParams;

    sget v2, Lcom/xuexiang/xui/R$id;->sRightSwitchId:I

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    goto :goto_0

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightImgParams:Landroid/widget/RelativeLayout$LayoutParams;

    sget v2, Lcom/xuexiang/xui/R$id;->sRightCheckBoxId:I

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 9
    :goto_0
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightIconHeight:I

    if-eqz v0, :cond_3

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightIconWidth:I

    if-eqz v1, :cond_3

    .line 10
    iget-object v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightImgParams:Landroid/widget/RelativeLayout$LayoutParams;

    iput v1, v2, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 11
    iput v0, v2, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 12
    :cond_3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightIconIV:Landroid/widget/ImageView;

    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 13
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightIconIV:Landroid/widget/ImageView;

    sget v1, Lcom/xuexiang/xui/R$id;->sRightImgId:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setId(I)V

    .line 14
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightIconIV:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightImgParams:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 15
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightIconIV:Landroid/widget/ImageView;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightIconPadding:I

    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/widget/ImageView;->setPadding(IIII)V

    .line 16
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightIconRes:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_4

    .line 17
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightImgParams:Landroid/widget/RelativeLayout$LayoutParams;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightIconMarginRight:I

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v2, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 18
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightImgParams:Landroid/widget/RelativeLayout$LayoutParams;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightIconMarginRight:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->setMarginEnd(I)V

    .line 19
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightIconIV:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightIconRes:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 20
    :cond_4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightIconTint:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_5

    .line 21
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightIconIV:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 22
    :cond_5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightIconIV:Landroid/widget/ImageView;

    invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    return-void
.end method

.method private initRightSwitch()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightSwitch:Landroid/widget/Switch;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Landroid/widget/Switch;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/Switch;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightSwitch:Landroid/widget/Switch;

    .line 3
    :cond_0
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0x15

    const/4 v2, -0x1

    .line 4
    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    const/16 v1, 0xf

    .line 5
    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 6
    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightSwitchMarginRight:I

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v2, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 7
    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightSwitchMarginRight:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->setMarginEnd(I)V

    .line 8
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightSwitch:Landroid/widget/Switch;

    sget v2, Lcom/xuexiang/xui/R$id;->sRightSwitchId:I

    invoke-virtual {v1, v2}, Landroid/widget/Switch;->setId(I)V

    .line 9
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightSwitch:Landroid/widget/Switch;

    invoke-virtual {v1, v0}, Landroid/widget/Switch;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightSwitch:Landroid/widget/Switch;

    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mSwitchIsChecked:Z

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mSwitchTextOff:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightSwitch:Landroid/widget/Switch;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mSwitchTextOff:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setTextOff(Ljava/lang/CharSequence;)V

    .line 13
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mSwitchTextOn:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 14
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightSwitch:Landroid/widget/Switch;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mSwitchTextOn:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setTextOn(Ljava/lang/CharSequence;)V

    .line 15
    :cond_2
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mSwitchMinWidth:I

    if-eqz v0, :cond_3

    .line 16
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightSwitch:Landroid/widget/Switch;

    invoke-virtual {v1, v0}, Landroid/widget/Switch;->setSwitchMinWidth(I)V

    .line 17
    :cond_3
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mSwitchPadding:I

    if-eqz v0, :cond_4

    .line 18
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightSwitch:Landroid/widget/Switch;

    invoke-virtual {v1, v0}, Landroid/widget/Switch;->setSwitchPadding(I)V

    .line 19
    :cond_4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mSwitchThumbResource:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_5

    .line 20
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightSwitch:Landroid/widget/Switch;

    invoke-virtual {v1, v0}, Landroid/widget/Switch;->setThumbDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 21
    :cond_5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mSwitchThumbResource:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_6

    .line 22
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightSwitch:Landroid/widget/Switch;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mSwitchTrackResource:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setTrackDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 23
    :cond_6
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mThumbTextPadding:I

    if-eqz v0, :cond_7

    .line 24
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightSwitch:Landroid/widget/Switch;

    invoke-virtual {v1, v0}, Landroid/widget/Switch;->setThumbTextPadding(I)V

    .line 25
    :cond_7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightSwitch:Landroid/widget/Switch;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mSwitchCheckedChangeListener:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 26
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightSwitch:Landroid/widget/Switch;

    invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    return-void
.end method

.method private initRightTextView()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-nez v0, :cond_0

    .line 2
    sget v0, Lcom/xuexiang/xui/R$id;->sRightViewId:I

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->initBaseView(I)Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightBaseViewParams:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->getParams(Landroid/widget/RelativeLayout$LayoutParams;)Landroid/widget/RelativeLayout$LayoutParams;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightBaseViewParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xf

    const/4 v2, -0x1

    .line 4
    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightBaseViewParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0x10

    sget v2, Lcom/xuexiang/xui/R$id;->sRightImgId:I

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightBaseViewParams:Landroid/widget/RelativeLayout$LayoutParams;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightViewMarginLeft:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightViewMarginRight:I

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightBaseViewParams:Landroid/widget/RelativeLayout$LayoutParams;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightViewMarginLeft:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->setMarginStart(I)V

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightBaseViewParams:Landroid/widget/RelativeLayout$LayoutParams;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightViewMarginRight:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->setMarginEnd(I)V

    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightBaseViewParams:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterSpaceHeight:I

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->setCenterSpaceHeight(I)V

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTopTextColor:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTextColor:I

    iget v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightBottomTextColor:I

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultColor(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;III)V

    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTopTextSize:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTextSize:I

    iget v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightBottomTextSize:I

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultSize(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;III)V

    .line 13
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTopLines:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightLines:I

    iget v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightBottomLines:I

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultLines(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;III)V

    .line 14
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTopMaxEms:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightMaxEms:I

    iget v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightBottomMaxEms:I

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultMaxEms(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;III)V

    .line 15
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTopTextBold:Z

    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTextBold:Z

    iget-boolean v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightBottomTextBold:Z

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultTextIsBold(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;ZZZ)V

    .line 16
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightGravity:I

    invoke-direct {p0, v0, v1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultGravity(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;I)V

    .line 17
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getCenterTextView()Landroid/widget/TextView;

    move-result-object v2

    iget-object v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTvDrawableLeft:Landroid/graphics/drawable/Drawable;

    iget-object v4, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTvDrawableRight:Landroid/graphics/drawable/Drawable;

    iget v5, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mTextViewDrawablePadding:I

    iget v6, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTvDrawableWidth:I

    iget v7, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTvDrawableHeight:I

    move-object v1, p0

    invoke-virtual/range {v1 .. v7}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultDrawable(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;III)V

    .line 18
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getCenterTextView()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTextBackground:Landroid/graphics/drawable/Drawable;

    invoke-direct {p0, v0, v1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultBackground(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;)V

    .line 19
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTopTextString:Ljava/lang/String;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTextString:Ljava/lang/String;

    iget-object v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightBottomTextString:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultString(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    return-void
.end method

.method private initSuperTextView()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mUseRipple:Z

    if-eqz v0, :cond_0

    .line 2
    sget v0, Lcom/xuexiang/xui/R$drawable;->stv_btn_selector_white:I

    invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    const/4 v0, 0x1

    .line 3
    invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mBackgroundDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 6
    :cond_1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mUseShape:Z

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->getSelector()Landroid/graphics/drawable/StateListDrawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_2
    return-void
.end method

.method private initTopDividerLineView(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mTopDividerLineView:Landroid/view/View;

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mTopDividerLineParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x1

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDividerLineHeight:I

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mTopDividerLineParams:Landroid/widget/RelativeLayout$LayoutParams;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mTopDividerLineParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v2, 0xa

    invoke-virtual {v0, v2, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mTopDividerLineParams:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, p1}, Landroid/widget/RelativeLayout$LayoutParams;->setMarginStart(I)V

    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mTopDividerLineParams:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout$LayoutParams;->setMarginEnd(I)V

    .line 7
    new-instance p1, Landroid/view/View;

    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mContext:Landroid/content/Context;

    invoke-direct {p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mTopDividerLineView:Landroid/view/View;

    .line 8
    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mTopDividerLineParams:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mTopDividerLineView:Landroid/view/View;

    iget p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mDividerLineColor:I

    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 10
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mTopDividerLineView:Landroid/view/View;

    invoke-virtual {p0, p1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    return-void
.end method

.method private initView()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->initSuperTextView()V

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->initLeftIcon()V

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->initExtraView()V

    .line 4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->initRightIcon()V

    .line 5
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->initLeftTextView()V

    .line 6
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->initCenterTextView()V

    .line 7
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->initRightTextView()V

    .line 8
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->initDividerLineView()V

    return-void
.end method

.method private setBorder()V
    .locals 5

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mGradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mStrokeWidth:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mStrokeColor:I

    iget v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mStrokeDashWidth:F

    iget v4, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mStrokeDashGap:F

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setStroke(IIFF)V

    return-void
.end method

.method private setBottomDividerLineView()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mBottomDividerLineMarginLR:I

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0, v0, v0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->initBottomDividerLineView(II)V

    goto :goto_0

    .line 3
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mBottomDividerLineMarginLeft:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mBottomDividerLineMarginRight:I

    invoke-direct {p0, v0, v1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->initBottomDividerLineView(II)V

    :goto_0
    return-void
.end method

.method private setDefaultBackground(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;)V
    .locals 1

    if-eqz p2, :cond_0

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 2
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method

.method private setDefaultCenterViewClickListener(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;)V
    .locals 2

    if-eqz p1, :cond_2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTopTvClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnCenterTopTvClickListener;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getTopTextView()Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$4;

    invoke-direct {v1, p0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$4;-><init>(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTvClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnCenterTvClickListener;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getCenterTextView()Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$5;

    invoke-direct {v1, p0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$5;-><init>(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterBottomTvClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnCenterBottomTvClickListener;

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getBottomTextView()Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$6;

    invoke-direct {v1, p0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$6;-><init>(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    return-void
.end method

.method private setDefaultColor(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;III)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getTopTextView()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getCenterTextView()Landroid/widget/TextView;

    move-result-object p2

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 3
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getBottomTextView()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, p4}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_0
    return-void
.end method

.method private setDefaultGravity(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;I)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setGravity(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;I)V

    :cond_0
    return-void
.end method

.method private setDefaultLeftViewClickListener(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;)V
    .locals 2

    if-eqz p1, :cond_2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTopTvClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnLeftTopTvClickListener;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getTopTextView()Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$1;

    invoke-direct {v1, p0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$1;-><init>(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTvClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnLeftTvClickListener;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getCenterTextView()Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$2;

    invoke-direct {v1, p0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$2;-><init>(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftBottomTvClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnLeftBottomTvClickListener;

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getBottomTextView()Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$3;

    invoke-direct {v1, p0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$3;-><init>(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    return-void
.end method

.method private setDefaultLines(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;III)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getTopTextView()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 2
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getCenterTextView()Landroid/widget/TextView;

    move-result-object p2

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 3
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getBottomTextView()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, p4}, Landroid/widget/TextView;->setMaxLines(I)V

    :cond_0
    return-void
.end method

.method private setDefaultMaxEms(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;III)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1, p2, p3, p4}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->setMaxEms(III)V

    :cond_0
    return-void
.end method

.method private setDefaultRightViewClickListener(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;)V
    .locals 2

    if-eqz p1, :cond_2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTopTvClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnRightTopTvClickListener;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getTopTextView()Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$7;

    invoke-direct {v1, p0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$7;-><init>(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTvClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnRightTvClickListener;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getCenterTextView()Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$8;

    invoke-direct {v1, p0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$8;-><init>(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightBottomTvClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnRightBottomTvClickListener;

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getBottomTextView()Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$9;

    invoke-direct {v1, p0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$9;-><init>(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    return-void
.end method

.method private setDefaultSize(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;III)V
    .locals 2

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getTopTextView()Landroid/widget/TextView;

    move-result-object v0

    int-to-float p2, p2

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 2
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getCenterTextView()Landroid/widget/TextView;

    move-result-object p2

    int-to-float p3, p3

    invoke-virtual {p2, v1, p3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 3
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getBottomTextView()Landroid/widget/TextView;

    move-result-object p1

    int-to-float p2, p4

    invoke-virtual {p1, v1, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_0
    return-void
.end method

.method private setDefaultString(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->setTopTextString(Ljava/lang/CharSequence;)V

    .line 2
    invoke-virtual {p1, p3}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->setCenterTextString(Ljava/lang/CharSequence;)V

    .line 3
    invoke-virtual {p1, p4}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->setBottomTextString(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method private setDefaultTextIsBold(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;ZZZ)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getTopTextView()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/text/TextPaint;->setFakeBoldText(Z)V

    .line 2
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getCenterTextView()Landroid/widget/TextView;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object p2

    invoke-virtual {p2, p3}, Landroid/text/TextPaint;->setFakeBoldText(Z)V

    .line 3
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getBottomTextView()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object p1

    invoke-virtual {p1, p4}, Landroid/text/TextPaint;->setFakeBoldText(Z)V

    :cond_0
    return-void
.end method

.method private setGravity(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;I)V
    .locals 1

    if-eqz p2, :cond_2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_1

    const/4 v0, 0x2

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const p2, 0x800015

    .line 1
    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->setGravity(I)V

    goto :goto_0

    :cond_1
    const/16 p2, 0x11

    .line 2
    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->setGravity(I)V

    goto :goto_0

    :cond_2
    const p2, 0x800013

    .line 3
    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->setGravity(I)V

    :goto_0
    return-void
.end method

.method private setRadius()V
    .locals 4

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCornersRadius:F

    const/4 v1, 0x0

    cmpl-float v1, v0, v1

    if-eqz v1, :cond_0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mGradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mGradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    const/16 v1, 0x8

    new-array v1, v1, [F

    const/4 v2, 0x0

    iget v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCornersTopLeftRadius:F

    aput v3, v1, v2

    const/4 v2, 0x1

    aput v3, v1, v2

    const/4 v2, 0x2

    iget v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCornersTopRightRadius:F

    aput v3, v1, v2

    const/4 v2, 0x3

    aput v3, v1, v2

    const/4 v2, 0x4

    iget v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCornersBottomRightRadius:F

    aput v3, v1, v2

    const/4 v2, 0x5

    aput v3, v1, v2

    const/4 v2, 0x6

    iget v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCornersBottomLeftRadius:F

    aput v3, v1, v2

    const/4 v2, 0x7

    aput v3, v1, v2

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    :goto_0
    return-void
.end method

.method private setTextGravity(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;I)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getCenterTextView()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setGravity(I)V

    :cond_0
    return-void
.end method

.method private setTopDividerLineView()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mTopDividerLineMarginLR:I

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0, v0, v0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->initTopDividerLineView(II)V

    goto :goto_0

    .line 3
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mTopDividerLineMarginLeft:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mTopDividerLineMarginRight:I

    invoke-direct {p0, v0, v1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->initTopDividerLineView(II)V

    :goto_0
    return-void
.end method


# virtual methods
.method public getCenterBottomString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getBottomTextView()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public getCenterBottomTextView()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getBottomTextView()Landroid/widget/TextView;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getCenterEditText()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterEditText:Landroid/widget/EditText;

    return-object v0
.end method

.method public getCenterEditValue()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterEditText:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public getCenterString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getCenterTextView()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public getCenterTextView()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getCenterTextView()Landroid/widget/TextView;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getCenterTopString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getTopTextView()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public getCenterTopTextView()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getTopTextView()Landroid/widget/TextView;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getCheckBoxIsChecked()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightCheckBox:Landroid/widget/CheckBox;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getDrawable(I)Landroid/graphics/drawable/GradientDrawable;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mGradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    const v0, 0x101009e

    if-eq p1, v0, :cond_1

    const v0, 0x10100a7

    if-eq p1, v0, :cond_0

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mGradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mSolidColor:I

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mGradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mSelectorPressedColor:I

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    goto :goto_0

    .line 5
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mGradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mSelectorNormalColor:I

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 6
    :goto_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setBorder()V

    .line 7
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setRadius()V

    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mGradientDrawable:Landroid/graphics/drawable/GradientDrawable;

    return-object p1
.end method

.method public getLeftBottomString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getBottomTextView()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public getLeftBottomTextView()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getBottomTextView()Landroid/widget/TextView;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getLeftIconIV()Landroid/widget/ImageView;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftImgParams:Landroid/widget/RelativeLayout$LayoutParams;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftIconMarginLeft:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftImgParams:Landroid/widget/RelativeLayout$LayoutParams;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftIconMarginLeft:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->setMarginStart(I)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftIconIV:Landroid/widget/ImageView;

    return-object v0
.end method

.method public getLeftString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getCenterTextView()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public getLeftTextView()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getCenterTextView()Landroid/widget/TextView;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getLeftTopString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getTopTextView()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public getLeftTopTextView()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getTopTextView()Landroid/widget/TextView;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getRightBottomString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getBottomTextView()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public getRightBottomTextView()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getBottomTextView()Landroid/widget/TextView;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getRightIconIV()Landroid/widget/ImageView;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightImgParams:Landroid/widget/RelativeLayout$LayoutParams;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightIconMarginRight:I

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v2, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftImgParams:Landroid/widget/RelativeLayout$LayoutParams;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightIconMarginRight:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->setMarginEnd(I)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightIconIV:Landroid/widget/ImageView;

    return-object v0
.end method

.method public getRightString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getCenterTextView()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public getRightTextView()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getCenterTextView()Landroid/widget/TextView;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getRightTopString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getTopTextView()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public getRightTopTextView()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getTopTextView()Landroid/widget/TextView;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSelector()Landroid/graphics/drawable/StateListDrawable;
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    const/4 v1, 0x2

    new-array v1, v1, [I

    .line 2
    fill-array-data v1, :array_0

    const v2, 0x10100a7

    invoke-virtual {p0, v2}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->getDrawable(I)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    const/4 v1, 0x0

    new-array v1, v1, [I

    const v2, 0x101009e

    .line 3
    invoke-virtual {p0, v2}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->getDrawable(I)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    return-object v0

    nop

    :array_0
    .array-data 4
        0x10100a7
        0x101009e
    .end array-data
.end method

.method public getSwitchIsChecked()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightSwitch:Landroid/widget/Switch;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/widget/Switch;->isChecked()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isEditEmpty()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterEditText:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public isEditNotEmpty()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterEditText:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public setBottomDividerLineVisibility(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mBottomDividerLineView:Landroid/view/View;

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setBottomDividerLineView()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mBottomDividerLineView:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-object p0
.end method

.method public setCenterBottomString(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->setBottomTextString(Ljava/lang/CharSequence;)V

    :cond_0
    return-object p0
.end method

.method public setCenterBottomTextColor(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getBottomTextView()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_0
    return-object p0
.end method

.method public setCenterBottomTvClickListener(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnCenterBottomTvClickListener;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterBottomTvClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnCenterBottomTvClickListener;

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultCenterViewClickListener(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;)V

    return-object p0
.end method

.method public setCenterEditString(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterEditText:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-object p0
.end method

.method public setCenterEditTextClickListener(Landroid/view/View$OnClickListener;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterEditText:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-object p0
.end method

.method public setCenterEditTextFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterEditText:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mEditTextButtonType:I

    if-nez v1, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    :cond_0
    return-object p0
.end method

.method public setCenterString(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->setCenterTextString(Ljava/lang/CharSequence;)V

    :cond_0
    return-object p0
.end method

.method public setCenterTextColor(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getCenterTextView()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_0
    return-object p0
.end method

.method public setCenterTextGravity(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    invoke-direct {p0, v0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setTextGravity(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;I)V

    return-object p0
.end method

.method public setCenterTopString(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->setTopTextString(Ljava/lang/CharSequence;)V

    :cond_0
    return-object p0
.end method

.method public setCenterTopTextColor(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getTopTextView()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_0
    return-object p0
.end method

.method public setCenterTopTvClickListener(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnCenterTopTvClickListener;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTopTvClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnCenterTopTvClickListener;

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultCenterViewClickListener(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;)V

    return-object p0
.end method

.method public setCenterTvClickListener(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnCenterTvClickListener;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTvClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnCenterTvClickListener;

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultCenterViewClickListener(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;)V

    return-object p0
.end method

.method public setCenterTvDrawableLeft(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 8

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getCenterTextView()Landroid/widget/TextView;

    move-result-object v2

    iget v5, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mTextViewDrawablePadding:I

    iget v6, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTvDrawableWidth:I

    iget v7, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTvDrawableHeight:I

    const/4 v4, 0x0

    move-object v1, p0

    move-object v3, p1

    invoke-virtual/range {v1 .. v7}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultDrawable(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;III)V

    return-object p0
.end method

.method public setCenterTvDrawableRight(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 8

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getCenterTextView()Landroid/widget/TextView;

    move-result-object v2

    iget v5, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mTextViewDrawablePadding:I

    iget v6, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTvDrawableWidth:I

    iget v7, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterTvDrawableHeight:I

    const/4 v3, 0x0

    move-object v1, p0

    move-object v4, p1

    invoke-virtual/range {v1 .. v7}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultDrawable(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;III)V

    return-object p0
.end method

.method public setCheckBoxBackground(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightCheckBoxBg:Landroid/graphics/drawable/Drawable;

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightCheckBox:Landroid/widget/CheckBox;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/CheckBox;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-object p0
.end method

.method public setCheckBoxChecked(Z)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setCheckBoxChecked(ZZ)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;

    return-object p0
.end method

.method public setCheckBoxChecked(ZZ)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    .line 2
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mIsChecked:Z

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightCheckBox:Landroid/widget/CheckBox;

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    .line 4
    invoke-virtual {v0, p2}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 5
    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightCheckBox:Landroid/widget/CheckBox;

    invoke-virtual {p2, p1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightCheckBox:Landroid/widget/CheckBox;

    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCheckBoxCheckedChangeListener:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    invoke-virtual {p1, p2}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {v0, p1}, Landroid/widget/CheckBox;->setChecked(Z)V

    :cond_1
    :goto_0
    return-object p0
.end method

.method public setCheckBoxCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCheckBoxCheckedChangeListener:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightCheckBox:Landroid/widget/CheckBox;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    :cond_0
    return-object p0
.end method

.method public setDefaultDrawable(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;III)V
    .locals 3

    const/4 v0, 0x0

    if-nez p2, :cond_0

    if-eqz p3, :cond_1

    .line 1
    :cond_0
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_1
    const/4 v1, -0x1

    const/4 v2, 0x0

    if-eq p5, v1, :cond_4

    if-eq p6, v1, :cond_4

    if-eqz p2, :cond_2

    .line 2
    invoke-virtual {p2, v0, v0, p5, p6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    :cond_2
    if-eqz p3, :cond_3

    .line 3
    invoke-virtual {p3, v0, v0, p5, p6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 4
    :cond_3
    invoke-virtual {p1, p2, v2, p3, v2}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 5
    :cond_4
    invoke-virtual {p1, p2, v2, p3, v2}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 6
    :goto_0
    invoke-virtual {p1, p4}, Landroid/widget/TextView;->setCompoundDrawablePadding(I)V

    return-void
.end method

.method public setLeftBottomString(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->setBottomTextString(Ljava/lang/CharSequence;)V

    :cond_0
    return-object p0
.end method

.method public setLeftBottomTextColor(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getBottomTextView()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_0
    return-object p0
.end method

.method public setLeftBottomTvClickListener(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnLeftBottomTvClickListener;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftBottomTvClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnLeftBottomTvClickListener;

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultLeftViewClickListener(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;)V

    return-object p0
.end method

.method public setLeftIcon(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 3

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftIconIV:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftImgParams:Landroid/widget/RelativeLayout$LayoutParams;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftIconMarginLeft:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftImgParams:Landroid/widget/RelativeLayout$LayoutParams;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftIconMarginLeft:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->setMarginStart(I)V

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftIconIV:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_0
    return-object p0
.end method

.method public setLeftIcon(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftIconIV:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftImgParams:Landroid/widget/RelativeLayout$LayoutParams;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftIconMarginLeft:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftImgParams:Landroid/widget/RelativeLayout$LayoutParams;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftIconMarginLeft:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->setMarginStart(I)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftIconIV:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-object p0
.end method

.method public setLeftImageViewClickListener(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnLeftImageViewClickListener;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftImageViewClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnLeftImageViewClickListener;

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftIconIV:Landroid/widget/ImageView;

    if-eqz p1, :cond_0

    .line 3
    new-instance v0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$11;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$11;-><init>(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-object p0
.end method

.method public setLeftString(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->setCenterTextString(Ljava/lang/CharSequence;)V

    :cond_0
    return-object p0
.end method

.method public setLeftTextColor(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getCenterTextView()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_0
    return-object p0
.end method

.method public setLeftTextGravity(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    invoke-direct {p0, v0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setTextGravity(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;I)V

    return-object p0
.end method

.method public setLeftTopString(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->setTopTextString(Ljava/lang/CharSequence;)V

    :cond_0
    return-object p0
.end method

.method public setLeftTopTextColor(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getTopTextView()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_0
    return-object p0
.end method

.method public setLeftTopTvClickListener(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnLeftTopTvClickListener;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTopTvClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnLeftTopTvClickListener;

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultLeftViewClickListener(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;)V

    return-object p0
.end method

.method public setLeftTvClickListener(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnLeftTvClickListener;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTvClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnLeftTvClickListener;

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultLeftViewClickListener(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;)V

    return-object p0
.end method

.method public setLeftTvDrawableLeft(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 8

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getCenterTextView()Landroid/widget/TextView;

    move-result-object v2

    iget v5, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mTextViewDrawablePadding:I

    iget v6, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTvDrawableWidth:I

    iget v7, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTvDrawableHeight:I

    const/4 v4, 0x0

    move-object v1, p0

    move-object v3, p1

    invoke-virtual/range {v1 .. v7}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultDrawable(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;III)V

    return-object p0
.end method

.method public setLeftTvDrawableRight(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 8

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getCenterTextView()Landroid/widget/TextView;

    move-result-object v2

    iget v5, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mTextViewDrawablePadding:I

    iget v6, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTvDrawableWidth:I

    iget v7, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftTvDrawableHeight:I

    const/4 v3, 0x0

    move-object v1, p0

    move-object v4, p1

    invoke-virtual/range {v1 .. v7}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultDrawable(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;III)V

    return-object p0
.end method

.method public setOnSuperTextViewClickListener(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnSuperTextViewClickListener;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mSuperTextViewClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnSuperTextViewClickListener;

    if-eqz p1, :cond_0

    .line 2
    new-instance p1, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$10;

    invoke-direct {p1, p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$10;-><init>(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;)V

    invoke-virtual {p0, p1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-object p0
.end method

.method public setPasswordTransformationMethod(Landroid/text/method/PasswordTransformationMethod;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterEditText:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    .line 2
    instance-of v1, v0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/edittext/PasswordEditText;->setPasswordTransformationMethod(Landroid/text/method/PasswordTransformationMethod;)Lcom/xuexiang/xui/widget/edittext/PasswordEditText;

    :cond_0
    return-object p0
.end method

.method public setRightBottomString(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->setBottomTextString(Ljava/lang/CharSequence;)V

    :cond_0
    return-object p0
.end method

.method public setRightBottomTextColor(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getBottomTextView()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_0
    return-object p0
.end method

.method public setRightBottomTvClickListener(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnRightBottomTvClickListener;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightBottomTvClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnRightBottomTvClickListener;

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultRightViewClickListener(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;)V

    return-object p0
.end method

.method public setRightIcon(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 3

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightIconIV:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightImgParams:Landroid/widget/RelativeLayout$LayoutParams;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightIconMarginRight:I

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v2, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightImgParams:Landroid/widget/RelativeLayout$LayoutParams;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightIconMarginRight:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->setMarginEnd(I)V

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightIconIV:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_0
    return-object p0
.end method

.method public setRightIcon(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightIconIV:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightImgParams:Landroid/widget/RelativeLayout$LayoutParams;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightIconMarginRight:I

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v2, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightImgParams:Landroid/widget/RelativeLayout$LayoutParams;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightIconMarginRight:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->setMarginEnd(I)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightIconIV:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-object p0
.end method

.method public setRightImageViewClickListener(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnRightImageViewClickListener;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightImageViewClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnRightImageViewClickListener;

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightIconIV:Landroid/widget/ImageView;

    if-eqz p1, :cond_0

    .line 3
    new-instance v0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$12;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$12;-><init>(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-object p0
.end method

.method public setRightString(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->setCenterTextString(Ljava/lang/CharSequence;)V

    :cond_0
    return-object p0
.end method

.method public setRightTextColor(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getCenterTextView()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_0
    return-object p0
.end method

.method public setRightTextGravity(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    invoke-direct {p0, v0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setTextGravity(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;I)V

    return-object p0
.end method

.method public setRightTopString(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->setTopTextString(Ljava/lang/CharSequence;)V

    :cond_0
    return-object p0
.end method

.method public setRightTopTextColor(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getTopTextView()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_0
    return-object p0
.end method

.method public setRightTopTvClickListener(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnRightTopTvClickListener;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTopTvClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnRightTopTvClickListener;

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultRightViewClickListener(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;)V

    return-object p0
.end method

.method public setRightTvClickListener(Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnRightTvClickListener;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTvClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView$OnRightTvClickListener;

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultRightViewClickListener(Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;)V

    return-object p0
.end method

.method public setRightTvDrawableLeft(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 8

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getCenterTextView()Landroid/widget/TextView;

    move-result-object v2

    iget v5, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mTextViewDrawablePadding:I

    iget v6, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTvDrawableWidth:I

    iget v7, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTvDrawableHeight:I

    const/4 v4, 0x0

    move-object v1, p0

    move-object v3, p1

    invoke-virtual/range {v1 .. v7}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultDrawable(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;III)V

    return-object p0
.end method

.method public setRightTvDrawableRight(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 8

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->getCenterTextView()Landroid/widget/TextView;

    move-result-object v2

    iget v5, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mTextViewDrawablePadding:I

    iget v6, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTvDrawableWidth:I

    iget v7, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightTvDrawableHeight:I

    const/4 v3, 0x0

    move-object v1, p0

    move-object v4, p1

    invoke-virtual/range {v1 .. v7}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setDefaultDrawable(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;III)V

    return-object p0
.end method

.method public setSBackground(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Landroid/widget/RelativeLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-object p0
.end method

.method public setShapeCornersBottomLeftRadius(F)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCornersBottomLeftRadius:F

    return-object p0
.end method

.method public setShapeCornersBottomRightRadius(F)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCornersBottomRightRadius:F

    return-object p0
.end method

.method public setShapeCornersRadius(F)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCornersRadius:F

    return-object p0
.end method

.method public setShapeCornersTopLeftRadius(F)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCornersTopLeftRadius:F

    return-object p0
.end method

.method public setShapeCornersTopRightRadius(F)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCornersTopRightRadius:F

    return-object p0
.end method

.method public setShapeSelectorNormalColor(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mSelectorNormalColor:I

    return-object p0
.end method

.method public setShapeSelectorPressedColor(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mSelectorPressedColor:I

    return-object p0
.end method

.method public setShapeSolidColor(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mSolidColor:I

    return-object p0
.end method

.method public setShapeSrokeDashWidth(F)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mStrokeDashWidth:F

    return-object p0
.end method

.method public setShapeStrokeColor(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mStrokeColor:I

    return-object p0
.end method

.method public setShapeStrokeDashGap(F)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mStrokeDashGap:F

    return-object p0
.end method

.method public setShapeStrokeWidth(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mContext:Landroid/content/Context;

    int-to-float p1, p1

    invoke-static {v0, p1}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mStrokeWidth:I

    return-object p0
.end method

.method public setSwitchCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mSwitchCheckedChangeListener:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightSwitch:Landroid/widget/Switch;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    :cond_0
    return-object p0
.end method

.method public setSwitchIsChecked(Z)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setSwitchIsChecked(ZZ)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;

    return-object p0
.end method

.method public setSwitchIsChecked(ZZ)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    .line 2
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mSwitchIsChecked:Z

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightSwitch:Landroid/widget/Switch;

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    .line 4
    invoke-virtual {v0, p2}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 5
    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightSwitch:Landroid/widget/Switch;

    invoke-virtual {p2, p1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightSwitch:Landroid/widget/Switch;

    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mSwitchCheckedChangeListener:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    invoke-virtual {p1, p2}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {v0, p1}, Landroid/widget/Switch;->setChecked(Z)V

    :cond_1
    :goto_0
    return-object p0
.end method

.method public setTopDividerLineVisibility(I)Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mTopDividerLineView:Landroid/view/View;

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->setTopDividerLineView()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mTopDividerLineView:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-object p0
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mLeftView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterEditText:Landroid/widget/EditText;

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setTypeface(Landroid/graphics/Typeface;)V

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mRightView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_3

    .line 8
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 9
    :cond_3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->mCenterView:Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;

    if-eqz v0, :cond_4

    .line 10
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/BaseTextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_4
    return-void
.end method

.method public useShape()Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;
    .locals 1

    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperTextView;->getSelector()Landroid/graphics/drawable/StateListDrawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-object p0
.end method
