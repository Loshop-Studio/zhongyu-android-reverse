.class public Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"

# interfaces
.implements Lio/github/inflationx/calligraphy3/HasTypeface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView$OnCommonTextViewClickListener;
    }
.end annotation


# static fields
.field private static final BOTH:I = 0x3

.field private static final BOTTOM:I = 0x2

.field private static final DEFAULT:I = 0x2

.field private static final DEFAULT_GRAVITY:I = 0x1

.field private static final GRAVITY_CENTER:I = 0x1

.field private static final GRAVITY_LEFT_CENTER:I = 0x0

.field private static final GRAVITY_RIGHT_CENTER:I = 0x2

.field private static final NONE:I = 0x0

.field private static final TOP:I = 0x1


# instance fields
.field private mBackgroundColor:I

.field private mBackground_drawable:Landroid/graphics/drawable/Drawable;

.field private mBothDividerLineMarginLeft:I

.field private mBothDividerLineMarginRight:I

.field private mBottomDividerLineMarginLR:I

.field private mBottomDividerLineMarginLeft:I

.field private mBottomDividerLineMarginRight:I

.field private mBottomLineParams:Landroid/widget/RelativeLayout$LayoutParams;

.field private mBottomLineView:Landroid/view/View;

.field private mCenterBaseLineParams:Landroid/widget/RelativeLayout$LayoutParams;

.field private mCenterBaseLineView:Landroid/view/View;

.field private mCenterBottomTVParams:Landroid/widget/RelativeLayout$LayoutParams;

.field private mCenterBottomTextColor:I

.field private mCenterBottomTextSize:I

.field private mCenterBottomTextString:Ljava/lang/CharSequence;

.field private mCenterBottomTextView:Landroid/widget/TextView;

.field private mCenterIconDrawablePadding:I

.field private mCenterSpaceHeight:I

.field private mCenterTVParams:Landroid/widget/RelativeLayout$LayoutParams;

.field private mCenterTextColor:I

.field private mCenterTextSize:I

.field private mCenterTextString:Ljava/lang/CharSequence;

.field private mCenterTextView:Landroid/widget/TextView;

.field private mCenterTextViewGravity:I

.field private mCenterTextViewLineSpacingExtra:I

.field private mCenterTopTVParams:Landroid/widget/RelativeLayout$LayoutParams;

.field private mCenterTopTextColor:I

.field private mCenterTopTextSize:I

.field private mCenterTopTextString:Ljava/lang/CharSequence;

.field private mCenterTopTextView:Landroid/widget/TextView;

.field private mCenterViewIsClickable:Z

.field private mCenterViewMarginLeft:I

.field private mCenterViewPaddingLeft:I

.field private mCenterViewPaddingRight:I

.field private mCenter_drawableBottom:Landroid/graphics/drawable/Drawable;

.field private mCenter_drawableLeft:Landroid/graphics/drawable/Drawable;

.field private mCenter_drawableRight:Landroid/graphics/drawable/Drawable;

.field private mCenter_drawableTop:Landroid/graphics/drawable/Drawable;

.field private mContext:Landroid/content/Context;

.field private mDefaultPadding:I

.field private mDefaultTextColor:I

.field private mDefaultTextSize:I

.field private mDividerLineColor:I

.field private mDividerLineHeight:I

.field private mDividerLineType:I

.field private mIsCenterAlignLeft:Z

.field private mIsUseRipple:Z

.field private mLeftBottomTVParams:Landroid/widget/RelativeLayout$LayoutParams;

.field private mLeftBottomTextColor:I

.field private mLeftBottomTextSize:I

.field private mLeftBottomTextString:Ljava/lang/CharSequence;

.field private mLeftBottomTextView:Landroid/widget/TextView;

.field private mLeftIconDrawablePadding:I

.field private mLeftImageView:Landroid/widget/ImageView;

.field private mLeftImageViewMarginLeft:I

.field private mLeftTVParams:Landroid/widget/RelativeLayout$LayoutParams;

.field private mLeftTextColor:I

.field private mLeftTextSize:I

.field private mLeftTextString:Ljava/lang/CharSequence;

.field private mLeftTextView:Landroid/widget/TextView;

.field private mLeftTextViewGravity:I

.field private mLeftTextViewLineSpacingExtra:I

.field private mLeftTopTVParams:Landroid/widget/RelativeLayout$LayoutParams;

.field private mLeftTopTextColor:I

.field private mLeftTopTextSize:I

.field private mLeftTopTextString:Ljava/lang/CharSequence;

.field private mLeftTopTextView:Landroid/widget/TextView;

.field private mLeftViewIsClickable:Z

.field private mLeftViewPaddingLeft:I

.field private mLeftViewPaddingRight:I

.field private mLeft_IV_drawable:Landroid/graphics/drawable/Drawable;

.field private mLeft_drawableBottom:Landroid/graphics/drawable/Drawable;

.field private mLeft_drawableLeft:Landroid/graphics/drawable/Drawable;

.field private mLeft_drawableRight:Landroid/graphics/drawable/Drawable;

.field private mLeft_drawableTop:Landroid/graphics/drawable/Drawable;

.field private mOnCommonTextViewClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView$OnCommonTextViewClickListener;

.field private mRightBottomTVParams:Landroid/widget/RelativeLayout$LayoutParams;

.field private mRightBottomTextColor:I

.field private mRightBottomTextSize:I

.field private mRightBottomTextString:Ljava/lang/CharSequence;

.field private mRightBottomTextView:Landroid/widget/TextView;

.field private mRightIconDrawablePadding:I

.field private mRightTVParams:Landroid/widget/RelativeLayout$LayoutParams;

.field private mRightTextColor:I

.field private mRightTextSize:I

.field private mRightTextString:Ljava/lang/CharSequence;

.field private mRightTextView:Landroid/widget/TextView;

.field private mRightTextViewGravity:I

.field private mRightTextViewLineSpacingExtra:I

.field private mRightTopTVParams:Landroid/widget/RelativeLayout$LayoutParams;

.field private mRightTopTextColor:I

.field private mRightTopTextSize:I

.field private mRightTopTextString:Ljava/lang/CharSequence;

.field private mRightTopTextView:Landroid/widget/TextView;

.field private mRightViewIsClickable:Z

.field private mRightViewPaddingLeft:I

.field private mRightViewPaddingRight:I

.field private mRight_drawableBottom:Landroid/graphics/drawable/Drawable;

.field private mRight_drawableLeft:Landroid/graphics/drawable/Drawable;

.field private mRight_drawableRight:Landroid/graphics/drawable/Drawable;

.field private mRight_drawableTop:Landroid/graphics/drawable/Drawable;

.field private mSetLines:I

.field private mSetMaxEms:I

.field private mSetSingleLine:Z

.field private mTopDividerLineMarginLR:I

.field private mTopDividerLineMarginLeft:I

.field private mTopDividerLineMarginRight:I

.field private mTopLineParams:Landroid/widget/RelativeLayout$LayoutParams;

.field private mTopLineView:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mBackgroundColor:I

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mSetSingleLine:Z

    const/16 v1, 0xa

    .line 4
    iput v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mSetMaxEms:I

    .line 5
    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mSetLines:I

    const/4 v0, 0x0

    .line 6
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 7
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, -0x1

    .line 8
    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mBackgroundColor:I

    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mSetSingleLine:Z

    const/16 v1, 0xa

    .line 10
    iput v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mSetMaxEms:I

    .line 11
    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mSetLines:I

    .line 12
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 13
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p3, -0x1

    .line 14
    iput p3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mBackgroundColor:I

    const/4 p3, 0x1

    .line 15
    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mSetSingleLine:Z

    const/16 v0, 0xa

    .line 16
    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mSetMaxEms:I

    .line 17
    iput p3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mSetLines:I

    .line 18
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;)Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView$OnCommonTextViewClickListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mOnCommonTextViewClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView$OnCommonTextViewClickListener;

    return-object p0
.end method

.method private getAttr(Landroid/util/AttributeSet;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mContext:Landroid/content/Context;

    sget-object v1, Lcom/xuexiang/xui/R$styleable;->CommonTextView:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 2
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cLeftIconResForDrawableLeft:I

    invoke-static {v0, p1, v1}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeft_drawableLeft:Landroid/graphics/drawable/Drawable;

    .line 3
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cLeftIconResForDrawableTop:I

    invoke-static {v0, p1, v1}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeft_drawableTop:Landroid/graphics/drawable/Drawable;

    .line 4
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cLeftIconResForDrawableRight:I

    invoke-static {v0, p1, v1}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeft_drawableRight:Landroid/graphics/drawable/Drawable;

    .line 5
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cLeftIconResForDrawableBottom:I

    invoke-static {v0, p1, v1}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeft_drawableBottom:Landroid/graphics/drawable/Drawable;

    .line 6
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cCenterIconResForDrawableLeft:I

    invoke-static {v0, p1, v1}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenter_drawableLeft:Landroid/graphics/drawable/Drawable;

    .line 7
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cCenterIconResForDrawableTop:I

    invoke-static {v0, p1, v1}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenter_drawableTop:Landroid/graphics/drawable/Drawable;

    .line 8
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cCenterIconResForDrawableRight:I

    invoke-static {v0, p1, v1}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenter_drawableRight:Landroid/graphics/drawable/Drawable;

    .line 9
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cCenterIconResForDrawableBottom:I

    invoke-static {v0, p1, v1}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenter_drawableBottom:Landroid/graphics/drawable/Drawable;

    .line 10
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cRightIconResForDrawableLeft:I

    invoke-static {v0, p1, v1}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRight_drawableLeft:Landroid/graphics/drawable/Drawable;

    .line 11
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cRightIconResForDrawableTop:I

    invoke-static {v0, p1, v1}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRight_drawableTop:Landroid/graphics/drawable/Drawable;

    .line 12
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cRightIconResForDrawableRight:I

    invoke-static {v0, p1, v1}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRight_drawableRight:Landroid/graphics/drawable/Drawable;

    .line 13
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cRightIconResForDrawableBottom:I

    invoke-static {v0, p1, v1}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRight_drawableBottom:Landroid/graphics/drawable/Drawable;

    .line 14
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cLeftImageViewDrawableRes:I

    invoke-static {v0, p1, v1}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeft_IV_drawable:Landroid/graphics/drawable/Drawable;

    .line 15
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cLeftTextString:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTextString:Ljava/lang/CharSequence;

    .line 16
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cLeftTopTextString:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTopTextString:Ljava/lang/CharSequence;

    .line 17
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cLeftBottomTextString:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftBottomTextString:Ljava/lang/CharSequence;

    .line 18
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cCenterTextString:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextString:Ljava/lang/CharSequence;

    .line 19
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cCenterTopTextString:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTopTextString:Ljava/lang/CharSequence;

    .line 20
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cCenterBottomTextString:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterBottomTextString:Ljava/lang/CharSequence;

    .line 21
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cRightTextString:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextString:Ljava/lang/CharSequence;

    .line 22
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cRightTopTextString:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTopTextString:Ljava/lang/CharSequence;

    .line 23
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cRightBottomTextString:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightBottomTextString:Ljava/lang/CharSequence;

    .line 24
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cLeftTextColor:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDefaultTextColor:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTextColor:I

    .line 25
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cLeftTopTextColor:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDefaultTextColor:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTopTextColor:I

    .line 26
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cLeftBottomTextColor:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDefaultTextColor:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftBottomTextColor:I

    .line 27
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cCenterTextColor:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDefaultTextColor:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextColor:I

    .line 28
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cCenterTopTextColor:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDefaultTextColor:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTopTextColor:I

    .line 29
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cCenterBottomTextColor:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDefaultTextColor:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterBottomTextColor:I

    .line 30
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cRightTextColor:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDefaultTextColor:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextColor:I

    .line 31
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cRightTopTextColor:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDefaultTextColor:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTopTextColor:I

    .line 32
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cRightBottomTextColor:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDefaultTextColor:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightBottomTextColor:I

    .line 33
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cLeftTextSize:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDefaultTextSize:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTextSize:I

    .line 34
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cLeftTopTextSize:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDefaultTextSize:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTopTextSize:I

    .line 35
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cLeftBottomTextSize:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDefaultTextSize:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftBottomTextSize:I

    .line 36
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cCenterTextSize:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDefaultTextSize:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextSize:I

    .line 37
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cCenterTopTextSize:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDefaultTextSize:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTopTextSize:I

    .line 38
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cCenterBottomTextSize:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDefaultTextSize:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterBottomTextSize:I

    .line 39
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cRightTextSize:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDefaultTextSize:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextSize:I

    .line 40
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cRightTopTextSize:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDefaultTextSize:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTopTextSize:I

    .line 41
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cRightBottomTextSize:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDefaultTextSize:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightBottomTextSize:I

    .line 42
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cLeftIconDrawablePadding:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDefaultPadding:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftIconDrawablePadding:I

    .line 43
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cCenterIconDrawablePadding:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDefaultPadding:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterIconDrawablePadding:I

    .line 44
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cRightIconDrawablePadding:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDefaultPadding:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightIconDrawablePadding:I

    .line 45
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cLeftViewPaddingLeft:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDefaultPadding:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftViewPaddingLeft:I

    .line 46
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cLeftViewPaddingRight:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDefaultPadding:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftViewPaddingRight:I

    .line 47
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cCenterViewPaddingLeft:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDefaultPadding:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterViewPaddingLeft:I

    .line 48
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cCenterViewPaddingRight:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDefaultPadding:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterViewPaddingRight:I

    .line 49
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cRightViewPaddingLeft:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDefaultPadding:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightViewPaddingLeft:I

    .line 50
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cRightViewPaddingRight:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDefaultPadding:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightViewPaddingRight:I

    .line 51
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cBothDividerLineMarginLeft:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mBothDividerLineMarginLeft:I

    .line 52
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cBothDividerLineMarginRight:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mBothDividerLineMarginRight:I

    .line 53
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cTopDividerLineMarginLR:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mTopDividerLineMarginLR:I

    .line 54
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cTopDividerLineMarginLeft:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mTopDividerLineMarginLeft:I

    .line 55
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cTopDividerLineMarginRight:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mTopDividerLineMarginRight:I

    .line 56
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cBottomDividerLineMarginLR:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mBottomDividerLineMarginLR:I

    .line 57
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cBottomDividerLineMarginLeft:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mBottomDividerLineMarginLeft:I

    .line 58
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cBottomDividerLineMarginRight:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mBottomDividerLineMarginRight:I

    .line 59
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cLeftImageViewMarginLeft:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDefaultPadding:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftImageViewMarginLeft:I

    .line 60
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cCenterSpaceHeight:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterSpaceHeight:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterSpaceHeight:I

    .line 61
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cLeftTextViewLineSpacingExtra:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTextViewLineSpacingExtra:I

    .line 62
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cCenterTextViewLineSpacingExtra:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextViewLineSpacingExtra:I

    .line 63
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cRightTextViewLineSpacingExtra:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextViewLineSpacingExtra:I

    .line 64
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cShowDividerLineType:I

    const/4 v2, 0x2

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDividerLineType:I

    .line 65
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cDividerLineColor:I

    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/xuexiang/xui/R$attr;->xui_config_color_separator_light:I

    invoke-static {v2, v3}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveColor(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDividerLineColor:I

    .line 66
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cDividerLineHeight:I

    iget-object v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mContext:Landroid/content/Context;

    const/high16 v3, 0x3f000000    # 0.5f

    invoke-virtual {p0, v2, v3}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->dip2px(Landroid/content/Context;F)I

    move-result v2

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDividerLineHeight:I

    .line 67
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cUseRipple:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mIsUseRipple:Z

    .line 68
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cBackgroundColor:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mBackgroundColor:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mBackgroundColor:I

    .line 69
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cSetSingleLine:I

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mSetSingleLine:Z

    .line 70
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cSetMaxEms:I

    iget v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mSetMaxEms:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mSetMaxEms:I

    .line 71
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cSetLines:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mSetLines:I

    .line 72
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cLeftTextViewGravity:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTextViewGravity:I

    .line 73
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cCenterTextViewGravity:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextViewGravity:I

    .line 74
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cRightTextViewGravity:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextViewGravity:I

    .line 75
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cLeftViewIsClickable:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftViewIsClickable:Z

    .line 76
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cCenterViewIsClickable:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterViewIsClickable:Z

    .line 77
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cRightViewIsClickable:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightViewIsClickable:Z

    .line 78
    invoke-virtual {p0}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v2, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cBackgroundDrawableRes:I

    invoke-static {v0, p1, v2}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mBackground_drawable:Landroid/graphics/drawable/Drawable;

    .line 79
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cIsCenterAlignLeft:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mIsCenterAlignLeft:Z

    .line 80
    sget v0, Lcom/xuexiang/xui/R$styleable;->CommonTextView_cCenterViewMarginLeft:I

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mContext:Landroid/content/Context;

    const/high16 v2, 0x43480000    # 200.0f

    invoke-virtual {p0, v1, v2}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->dip2px(Landroid/content/Context;F)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterViewMarginLeft:I

    .line 81
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private init()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initCommonTextView()V

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initLineView()V

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initCenterBaseLine()V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeft_IV_drawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 5
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initLeftImageView()V

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTextString:Ljava/lang/CharSequence;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeft_drawableLeft:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeft_drawableRight:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    .line 7
    :cond_1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initLeftText()V

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextString:Ljava/lang/CharSequence;

    if-eqz v0, :cond_3

    .line 9
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initCenterText()V

    .line 10
    :cond_3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextString:Ljava/lang/CharSequence;

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRight_drawableLeft:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRight_drawableRight:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_5

    .line 11
    :cond_4
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initRightText()V

    .line 12
    :cond_5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTopTextString:Ljava/lang/CharSequence;

    if-eqz v0, :cond_6

    .line 13
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initLeftTopText()V

    .line 14
    :cond_6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftBottomTextString:Ljava/lang/CharSequence;

    if-eqz v0, :cond_7

    .line 15
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initLeftBottomText()V

    .line 16
    :cond_7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTopTextString:Ljava/lang/CharSequence;

    if-eqz v0, :cond_8

    .line 17
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initCenterTopText()V

    .line 18
    :cond_8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterBottomTextString:Ljava/lang/CharSequence;

    if-eqz v0, :cond_9

    .line 19
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initCenterBottomText()V

    .line 20
    :cond_9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTopTextString:Ljava/lang/CharSequence;

    if-eqz v0, :cond_a

    .line 21
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initRightTopText()V

    .line 22
    :cond_a
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightBottomTextString:Ljava/lang/CharSequence;

    if-eqz v0, :cond_b

    .line 23
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initRightBottomText()V

    :cond_b
    return-void
.end method

.method private initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mContext:Landroid/content/Context;

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->stv_color_common_text:I

    sget v1, Lcom/xuexiang/xui/R$color;->stv_color_common_text:I

    invoke-static {v1}, Lcom/xuexiang/xui/utils/ResUtils;->getColor(I)I

    move-result v1

    invoke-static {p1, v0, v1}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveColor(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDefaultTextColor:I

    .line 3
    sget v0, Lcom/xuexiang/xui/R$attr;->stv_text_size:I

    sget v1, Lcom/xuexiang/xui/R$dimen;->default_stv_text_size:I

    invoke-static {v1}, Lcom/xuexiang/xui/utils/ResUtils;->getDimensionPixelSize(I)I

    move-result v1

    invoke-static {p1, v0, v1}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDefaultTextSize:I

    .line 4
    sget v0, Lcom/xuexiang/xui/R$attr;->stv_margin:I

    sget v1, Lcom/xuexiang/xui/R$dimen;->default_stv_margin:I

    invoke-static {v1}, Lcom/xuexiang/xui/utils/ResUtils;->getDimensionPixelSize(I)I

    move-result v1

    invoke-static {p1, v0, v1}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDefaultPadding:I

    const/high16 v0, 0x40a00000    # 5.0f

    .line 5
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->dip2px(Landroid/content/Context;F)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterSpaceHeight:I

    .line 6
    invoke-direct {p0, p2}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->getAttr(Landroid/util/AttributeSet;)V

    .line 7
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->init()V

    return-void
.end method

.method private initBottomLineView(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mBottomLineView:Landroid/view/View;

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mBottomLineParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x1

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDividerLineHeight:I

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mBottomLineParams:Landroid/widget/RelativeLayout$LayoutParams;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mBottomLineParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v2, 0xc

    invoke-virtual {v0, v2, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mBottomLineParams:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, p1}, Landroid/widget/RelativeLayout$LayoutParams;->setMarginStart(I)V

    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mBottomLineParams:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout$LayoutParams;->setMarginEnd(I)V

    .line 7
    new-instance p1, Landroid/view/View;

    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mContext:Landroid/content/Context;

    invoke-direct {p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mBottomLineView:Landroid/view/View;

    .line 8
    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mBottomLineParams:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mBottomLineView:Landroid/view/View;

    iget p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDividerLineColor:I

    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 10
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mBottomLineView:Landroid/view/View;

    invoke-virtual {p0, p1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    return-void
.end method

.method private initCenterBaseLine()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterBaseLineView:Landroid/view/View;

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterBaseLineParams:Landroid/widget/RelativeLayout$LayoutParams;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterSpaceHeight:I

    const/4 v2, -0x1

    invoke-direct {v0, v2, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterBaseLineParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xf

    .line 4
    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 5
    :cond_0
    new-instance v0, Landroid/view/View;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterBaseLineView:Landroid/view/View;

    .line 6
    sget v1, Lcom/xuexiang/xui/R$id;->cCenterBaseLineId:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterBaseLineView:Landroid/view/View;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterBaseLineParams:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterBaseLineView:Landroid/view/View;

    invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    return-void
.end method

.method private initCenterBottomText()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterBottomTextView:Landroid/widget/TextView;

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterBottomTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    if-nez v0, :cond_0

    .line 3
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->getParams(Landroid/widget/RelativeLayout$LayoutParams;)Landroid/widget/RelativeLayout$LayoutParams;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterBottomTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterBottomTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xf

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterBottomTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xd

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterBottomTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, 0x3

    sget v2, Lcom/xuexiang/xui/R$id;->cCenterBaseLineId:I

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterBottomTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterViewPaddingLeft:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterViewPaddingRight:I

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 8
    iget-object v5, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterBottomTextView:Landroid/widget/TextView;

    iget-object v6, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterBottomTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    sget v7, Lcom/xuexiang/xui/R$id;->cCenterBottomTextId:I

    iget v8, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterBottomTextColor:I

    iget v9, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterBottomTextSize:I

    move-object v4, p0

    invoke-virtual/range {v4 .. v9}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initText(Landroid/widget/TextView;Landroid/widget/RelativeLayout$LayoutParams;III)Landroid/widget/TextView;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterBottomTextView:Landroid/widget/TextView;

    .line 9
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterBottomTextString:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterBottomTextView:Landroid/widget/TextView;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextViewLineSpacingExtra:I

    int-to-float v1, v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterBottomTextView:Landroid/widget/TextView;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextViewGravity:I

    invoke-direct {p0, v0, v1}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->setTextViewGravity(Landroid/widget/TextView;I)V

    :cond_1
    return-void
.end method

.method private initCenterText()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextView:Landroid/widget/TextView;

    if-nez v0, :cond_3

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x1

    if-nez v0, :cond_1

    .line 3
    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mIsCenterAlignLeft:Z

    if-eqz v2, :cond_0

    .line 4
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->getParams(Landroid/widget/RelativeLayout$LayoutParams;)Landroid/widget/RelativeLayout$LayoutParams;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    .line 6
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v2, 0xf

    invoke-virtual {v0, v2, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v2, 0xd

    invoke-virtual {v0, v2, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 8
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mIsCenterAlignLeft:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 9
    iget-object v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextView:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    sget v5, Lcom/xuexiang/xui/R$id;->cCenterTextId:I

    iget v6, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextColor:I

    iget v7, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextSize:I

    move-object v2, p0

    invoke-virtual/range {v2 .. v7}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initText(Landroid/widget/TextView;Landroid/widget/RelativeLayout$LayoutParams;III)Landroid/widget/TextView;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextView:Landroid/widget/TextView;

    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterViewMarginLeft:I

    iget v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterViewPaddingRight:I

    invoke-virtual {v0, v2, v1, v3, v1}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextView:Landroid/widget/TextView;

    invoke-direct {p0, v0, v1}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->setTextViewGravity(Landroid/widget/TextView;I)V

    goto :goto_1

    .line 12
    :cond_2
    iget-object v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextView:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    sget v5, Lcom/xuexiang/xui/R$id;->cCenterTextId:I

    iget v6, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextColor:I

    iget v7, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextSize:I

    move-object v2, p0

    invoke-virtual/range {v2 .. v7}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initText(Landroid/widget/TextView;Landroid/widget/RelativeLayout$LayoutParams;III)Landroid/widget/TextView;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextView:Landroid/widget/TextView;

    .line 13
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterViewPaddingLeft:I

    iget v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterViewPaddingRight:I

    invoke-virtual {v0, v2, v1, v3, v1}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 14
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextView:Landroid/widget/TextView;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextViewGravity:I

    invoke-direct {p0, v0, v1}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->setTextViewGravity(Landroid/widget/TextView;I)V

    .line 15
    :goto_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextView:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextString:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextView:Landroid/widget/TextView;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextViewLineSpacingExtra:I

    int-to-float v1, v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 17
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterViewIsClickable:Z

    if-eqz v0, :cond_3

    .line 18
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextView:Landroid/widget/TextView;

    new-instance v1, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView$3;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView$3;-><init>(Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    :cond_3
    iget-object v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextView:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenter_drawableLeft:Landroid/graphics/drawable/Drawable;

    iget-object v5, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenter_drawableTop:Landroid/graphics/drawable/Drawable;

    iget-object v6, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenter_drawableRight:Landroid/graphics/drawable/Drawable;

    iget-object v7, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenter_drawableBottom:Landroid/graphics/drawable/Drawable;

    iget v8, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterIconDrawablePadding:I

    move-object v2, p0

    invoke-virtual/range {v2 .. v8}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->setDrawable(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;I)V

    return-void
.end method

.method private initCenterTopText()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTopTextView:Landroid/widget/TextView;

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTopTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    if-nez v0, :cond_0

    .line 3
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->getParams(Landroid/widget/RelativeLayout$LayoutParams;)Landroid/widget/RelativeLayout$LayoutParams;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTopTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTopTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xf

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTopTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xd

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTopTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, 0x2

    sget v2, Lcom/xuexiang/xui/R$id;->cCenterBaseLineId:I

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTopTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterViewPaddingLeft:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterViewPaddingRight:I

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 8
    iget-object v5, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTopTextView:Landroid/widget/TextView;

    iget-object v6, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTopTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    sget v7, Lcom/xuexiang/xui/R$id;->cCenterTopTextId:I

    iget v8, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTopTextColor:I

    iget v9, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTopTextSize:I

    move-object v4, p0

    invoke-virtual/range {v4 .. v9}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initText(Landroid/widget/TextView;Landroid/widget/RelativeLayout$LayoutParams;III)Landroid/widget/TextView;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTopTextView:Landroid/widget/TextView;

    .line 9
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTopTextString:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTopTextView:Landroid/widget/TextView;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextViewLineSpacingExtra:I

    int-to-float v1, v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTopTextView:Landroid/widget/TextView;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextViewGravity:I

    invoke-direct {p0, v0, v1}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->setTextViewGravity(Landroid/widget/TextView;I)V

    :cond_1
    return-void
.end method

.method private initCommonTextView()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mBackgroundColor:I

    invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    .line 2
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mIsUseRipple:Z

    if-eqz v0, :cond_0

    .line 3
    sget v0, Lcom/xuexiang/xui/R$drawable;->stv_btn_selector_white:I

    invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 4
    :cond_0
    new-instance v0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView$1;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView$1;-><init>(Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;)V

    invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mBackground_drawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    .line 6
    invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    return-void
.end method

.method private initLeftBottomText()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftBottomTextView:Landroid/widget/TextView;

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftBottomTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    if-nez v0, :cond_0

    .line 3
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->getParams(Landroid/widget/RelativeLayout$LayoutParams;)Landroid/widget/RelativeLayout$LayoutParams;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftBottomTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftBottomTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xf

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftBottomTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, 0x3

    sget v2, Lcom/xuexiang/xui/R$id;->cCenterBaseLineId:I

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftBottomTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, 0x1

    sget v2, Lcom/xuexiang/xui/R$id;->cLeftImageViewId:I

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftBottomTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftViewPaddingLeft:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftViewPaddingRight:I

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 8
    iget-object v5, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftBottomTextView:Landroid/widget/TextView;

    iget-object v6, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftBottomTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    sget v7, Lcom/xuexiang/xui/R$id;->cLeftBottomTextId:I

    iget v8, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftBottomTextColor:I

    iget v9, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftBottomTextSize:I

    move-object v4, p0

    invoke-virtual/range {v4 .. v9}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initText(Landroid/widget/TextView;Landroid/widget/RelativeLayout$LayoutParams;III)Landroid/widget/TextView;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftBottomTextView:Landroid/widget/TextView;

    .line 9
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftBottomTextString:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftBottomTextView:Landroid/widget/TextView;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTextViewGravity:I

    invoke-direct {p0, v0, v1}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->setTextViewGravity(Landroid/widget/TextView;I)V

    :cond_1
    return-void
.end method

.method private initLeftImageView()V
    .locals 3

    .line 1
    new-instance v0, Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftImageView:Landroid/widget/ImageView;

    .line 2
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0x9

    const/4 v2, -0x1

    .line 3
    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    const/16 v1, 0xf

    .line 4
    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 5
    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftImageViewMarginLeft:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftImageView:Landroid/widget/ImageView;

    sget-object v2, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 7
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftImageView:Landroid/widget/ImageView;

    sget v2, Lcom/xuexiang/xui/R$id;->cLeftImageViewId:I

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setId(I)V

    .line 8
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftImageView:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeft_IV_drawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 10
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftImageView:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftImageView:Landroid/widget/ImageView;

    invoke-virtual {p0, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    return-void
.end method

.method private initLeftText()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTextView:Landroid/widget/TextView;

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    if-nez v0, :cond_0

    .line 3
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->getParams(Landroid/widget/RelativeLayout$LayoutParams;)Landroid/widget/RelativeLayout$LayoutParams;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xf

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, 0x1

    sget v2, Lcom/xuexiang/xui/R$id;->cLeftImageViewId:I

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftViewPaddingLeft:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftViewPaddingRight:I

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 7
    iget-object v5, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTextView:Landroid/widget/TextView;

    iget-object v6, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    sget v7, Lcom/xuexiang/xui/R$id;->cLeftTextId:I

    iget v8, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTextColor:I

    iget v9, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTextSize:I

    move-object v4, p0

    invoke-virtual/range {v4 .. v9}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initText(Landroid/widget/TextView;Landroid/widget/RelativeLayout$LayoutParams;III)Landroid/widget/TextView;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTextView:Landroid/widget/TextView;

    .line 8
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTextString:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTextView:Landroid/widget/TextView;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTextViewLineSpacingExtra:I

    int-to-float v1, v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTextView:Landroid/widget/TextView;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTextViewGravity:I

    invoke-direct {p0, v0, v1}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->setTextViewGravity(Landroid/widget/TextView;I)V

    .line 11
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftViewIsClickable:Z

    if-eqz v0, :cond_1

    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTextView:Landroid/widget/TextView;

    new-instance v1, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView$2;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView$2;-><init>(Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 13
    :cond_1
    iget-object v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTextView:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeft_drawableLeft:Landroid/graphics/drawable/Drawable;

    iget-object v5, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeft_drawableTop:Landroid/graphics/drawable/Drawable;

    iget-object v6, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeft_drawableRight:Landroid/graphics/drawable/Drawable;

    iget-object v7, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeft_drawableBottom:Landroid/graphics/drawable/Drawable;

    iget v8, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftIconDrawablePadding:I

    move-object v2, p0

    invoke-virtual/range {v2 .. v8}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->setDrawable(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;I)V

    return-void
.end method

.method private initLeftTopText()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTopTextView:Landroid/widget/TextView;

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTopTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    if-nez v0, :cond_0

    .line 3
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->getParams(Landroid/widget/RelativeLayout$LayoutParams;)Landroid/widget/RelativeLayout$LayoutParams;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTopTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTopTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xf

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTopTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, 0x2

    sget v2, Lcom/xuexiang/xui/R$id;->cCenterBaseLineId:I

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTopTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, 0x1

    sget v2, Lcom/xuexiang/xui/R$id;->cLeftImageViewId:I

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTopTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftViewPaddingLeft:I

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftViewPaddingRight:I

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 8
    iget-object v5, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTopTextView:Landroid/widget/TextView;

    iget-object v6, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTopTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    sget v7, Lcom/xuexiang/xui/R$id;->cLeftTopTextId:I

    iget v8, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTopTextColor:I

    iget v9, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTopTextSize:I

    move-object v4, p0

    invoke-virtual/range {v4 .. v9}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initText(Landroid/widget/TextView;Landroid/widget/RelativeLayout$LayoutParams;III)Landroid/widget/TextView;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTopTextView:Landroid/widget/TextView;

    .line 9
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTopTextString:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTopTextView:Landroid/widget/TextView;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTextViewGravity:I

    invoke-direct {p0, v0, v1}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->setTextViewGravity(Landroid/widget/TextView;I)V

    :cond_1
    return-void
.end method

.method private initLineView()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDividerLineType:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->setTopLineMargin()V

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->setBottomLineMargin()V

    goto :goto_0

    .line 4
    :cond_1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->setBottomLineMargin()V

    goto :goto_0

    .line 5
    :cond_2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->setTopLineMargin()V

    :goto_0
    return-void
.end method

.method private initRightBottomText()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightBottomTextView:Landroid/widget/TextView;

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightBottomTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    if-nez v0, :cond_0

    .line 3
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->getParams(Landroid/widget/RelativeLayout$LayoutParams;)Landroid/widget/RelativeLayout$LayoutParams;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightBottomTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightBottomTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xf

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightBottomTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xb

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightBottomTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, 0x3

    sget v2, Lcom/xuexiang/xui/R$id;->cCenterBaseLineId:I

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightBottomTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    sget v1, Lcom/xuexiang/xui/R$id;->cRightImageViewId:I

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightBottomTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightViewPaddingLeft:I

    iget v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightViewPaddingRight:I

    invoke-virtual {v0, v1, v2, v3, v2}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 9
    iget-object v5, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightBottomTextView:Landroid/widget/TextView;

    iget-object v6, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightBottomTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    sget v7, Lcom/xuexiang/xui/R$id;->cRightBottomTextId:I

    iget v8, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightBottomTextColor:I

    iget v9, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightBottomTextSize:I

    move-object v4, p0

    invoke-virtual/range {v4 .. v9}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initText(Landroid/widget/TextView;Landroid/widget/RelativeLayout$LayoutParams;III)Landroid/widget/TextView;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightBottomTextView:Landroid/widget/TextView;

    .line 10
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightBottomTextString:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightBottomTextView:Landroid/widget/TextView;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextViewLineSpacingExtra:I

    int-to-float v1, v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightBottomTextView:Landroid/widget/TextView;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextViewGravity:I

    invoke-direct {p0, v0, v1}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->setTextViewGravity(Landroid/widget/TextView;I)V

    :cond_1
    return-void
.end method

.method private initRightText()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextView:Landroid/widget/TextView;

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    if-nez v0, :cond_0

    .line 3
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->getParams(Landroid/widget/RelativeLayout$LayoutParams;)Landroid/widget/RelativeLayout$LayoutParams;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xf

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xb

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    sget v1, Lcom/xuexiang/xui/R$id;->cRightImageViewId:I

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightViewPaddingLeft:I

    iget v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightViewPaddingRight:I

    invoke-virtual {v0, v1, v2, v3, v2}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 8
    iget-object v5, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextView:Landroid/widget/TextView;

    iget-object v6, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    sget v7, Lcom/xuexiang/xui/R$id;->cRightTextId:I

    iget v8, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextColor:I

    iget v9, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextSize:I

    move-object v4, p0

    invoke-virtual/range {v4 .. v9}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initText(Landroid/widget/TextView;Landroid/widget/RelativeLayout$LayoutParams;III)Landroid/widget/TextView;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextView:Landroid/widget/TextView;

    .line 9
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextString:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextView:Landroid/widget/TextView;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextViewLineSpacingExtra:I

    int-to-float v1, v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextView:Landroid/widget/TextView;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextViewGravity:I

    invoke-direct {p0, v0, v1}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->setTextViewGravity(Landroid/widget/TextView;I)V

    .line 12
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightViewIsClickable:Z

    if-eqz v0, :cond_1

    .line 13
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextView:Landroid/widget/TextView;

    new-instance v1, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView$4;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView$4;-><init>(Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    :cond_1
    iget-object v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextView:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRight_drawableLeft:Landroid/graphics/drawable/Drawable;

    iget-object v5, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRight_drawableTop:Landroid/graphics/drawable/Drawable;

    iget-object v6, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRight_drawableRight:Landroid/graphics/drawable/Drawable;

    iget-object v7, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRight_drawableBottom:Landroid/graphics/drawable/Drawable;

    iget v8, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightIconDrawablePadding:I

    move-object v2, p0

    invoke-virtual/range {v2 .. v8}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->setDrawable(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;I)V

    return-void
.end method

.method private initRightTopText()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTopTextView:Landroid/widget/TextView;

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTopTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    if-nez v0, :cond_0

    .line 3
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->getParams(Landroid/widget/RelativeLayout$LayoutParams;)Landroid/widget/RelativeLayout$LayoutParams;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTopTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTopTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xf

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTopTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0xb

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTopTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, 0x2

    sget v2, Lcom/xuexiang/xui/R$id;->cCenterBaseLineId:I

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTopTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    sget v1, Lcom/xuexiang/xui/R$id;->cRightImageViewId:I

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTopTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightViewPaddingLeft:I

    iget v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightViewPaddingRight:I

    invoke-virtual {v0, v1, v2, v3, v2}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 9
    iget-object v5, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTopTextView:Landroid/widget/TextView;

    iget-object v6, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTopTVParams:Landroid/widget/RelativeLayout$LayoutParams;

    sget v7, Lcom/xuexiang/xui/R$id;->cRightTopTextId:I

    iget v8, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTopTextColor:I

    iget v9, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTopTextSize:I

    move-object v4, p0

    invoke-virtual/range {v4 .. v9}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initText(Landroid/widget/TextView;Landroid/widget/RelativeLayout$LayoutParams;III)Landroid/widget/TextView;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTopTextView:Landroid/widget/TextView;

    .line 10
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTopTextString:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTopTextView:Landroid/widget/TextView;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextViewLineSpacingExtra:I

    int-to-float v1, v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTopTextView:Landroid/widget/TextView;

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextViewGravity:I

    invoke-direct {p0, v0, v1}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->setTextViewGravity(Landroid/widget/TextView;I)V

    :cond_1
    return-void
.end method

.method private initTopLineView(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mTopLineView:Landroid/view/View;

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mTopLineParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x1

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDividerLineHeight:I

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mTopLineParams:Landroid/widget/RelativeLayout$LayoutParams;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mTopLineParams:Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v2, 0xa

    invoke-virtual {v0, v2, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mTopLineParams:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, p1}, Landroid/widget/RelativeLayout$LayoutParams;->setMarginStart(I)V

    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mTopLineParams:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout$LayoutParams;->setMarginEnd(I)V

    .line 7
    new-instance p1, Landroid/view/View;

    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mContext:Landroid/content/Context;

    invoke-direct {p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mTopLineView:Landroid/view/View;

    .line 8
    iget-object p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mTopLineParams:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mTopLineView:Landroid/view/View;

    iget p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mDividerLineColor:I

    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 10
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mTopLineView:Landroid/view/View;

    invoke-virtual {p0, p1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    return-void
.end method

.method private setBottomLineMargin()V
    .locals 4

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mBottomDividerLineMarginLR:I

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0, v0, v0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initBottomLineView(II)V

    goto :goto_2

    .line 3
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mBothDividerLineMarginRight:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    or-int/2addr v1, v3

    if-eqz v1, :cond_3

    .line 4
    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mBothDividerLineMarginLeft:I

    invoke-direct {p0, v1, v0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initBottomLineView(II)V

    goto :goto_2

    .line 5
    :cond_3
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mBottomDividerLineMarginLeft:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mBottomDividerLineMarginRight:I

    invoke-direct {p0, v0, v1}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initBottomLineView(II)V

    :goto_2
    return-void
.end method

.method private setTextViewGravity(Landroid/widget/TextView;I)V
    .locals 1

    if-eqz p2, :cond_2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_1

    const/4 v0, 0x2

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 p2, 0x15

    .line 1
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setGravity(I)V

    goto :goto_0

    :cond_1
    const/16 p2, 0x11

    .line 2
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setGravity(I)V

    goto :goto_0

    :cond_2
    const/16 p2, 0x13

    .line 3
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setGravity(I)V

    :goto_0
    return-void
.end method

.method private setTopLineMargin()V
    .locals 5

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mTopDividerLineMarginLR:I

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0, v0, v0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initTopLineView(II)V

    goto :goto_2

    .line 3
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mBothDividerLineMarginLeft:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    iget v4, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mBothDividerLineMarginRight:I

    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    or-int/2addr v1, v3

    if-eqz v1, :cond_3

    .line 4
    invoke-direct {p0, v0, v4}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initTopLineView(II)V

    goto :goto_2

    .line 5
    :cond_3
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mTopDividerLineMarginLeft:I

    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mTopDividerLineMarginRight:I

    invoke-direct {p0, v0, v1}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initTopLineView(II)V

    :goto_2
    return-void
.end method


# virtual methods
.method public dip2px(Landroid/content/Context;F)I
    .locals 0

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    mul-float p2, p2, p1

    const/high16 p1, 0x3f000000    # 0.5f

    add-float/2addr p2, p1

    float-to-int p1, p2

    return p1
.end method

.method public getCenterBottomTextString()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterBottomTextView:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public getCenterTextString()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextView:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public getCenterTopTextString()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTopTextView:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public getLeftBottomTextString()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftBottomTextView:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public getLeftImageView()Landroid/widget/ImageView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftImageView:Landroid/widget/ImageView;

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initLeftImageView()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftImageView:Landroid/widget/ImageView;

    return-object v0
.end method

.method public getLeftTextString()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTextView:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public getLeftTopTextString()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTopTextView:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public getParams(Landroid/widget/RelativeLayout$LayoutParams;)Landroid/widget/RelativeLayout$LayoutParams;
    .locals 1

    if-nez p1, :cond_0

    new-instance p1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v0, -0x2

    invoke-direct {p1, v0, v0}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    :cond_0
    return-object p1
.end method

.method public getRightBottomTextString()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightBottomTextView:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public getRightTextString()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextView:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public getRightTopTextString()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTopTextView:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public initText(Landroid/widget/TextView;Landroid/widget/RelativeLayout$LayoutParams;III)Landroid/widget/TextView;
    .locals 1

    if-nez p1, :cond_0

    .line 1
    new-instance p1, Landroid/widget/TextView;

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mContext:Landroid/content/Context;

    invoke-direct {p1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setId(I)V

    .line 3
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    invoke-virtual {p1, p4}, Landroid/widget/TextView;->setTextColor(I)V

    int-to-float p2, p5

    const/4 p3, 0x0

    .line 5
    invoke-virtual {p1, p3, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 6
    iget p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mSetLines:I

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setLines(I)V

    .line 7
    iget-boolean p2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mSetSingleLine:Z

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setSingleLine(Z)V

    const/4 p2, 0x1

    new-array p2, p2, [Landroid/text/InputFilter;

    .line 8
    new-instance p4, Landroid/text/InputFilter$LengthFilter;

    iget p5, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mSetMaxEms:I

    invoke-direct {p4, p5}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    aput-object p4, p2, p3

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    .line 9
    invoke-virtual {p0, p1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    :cond_0
    return-object p1
.end method

.method public px2dip(Landroid/content/Context;F)I
    .locals 0

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr p2, p1

    const/high16 p1, 0x3f000000    # 0.5f

    add-float/2addr p2, p1

    float-to-int p1, p2

    return p1
.end method

.method public setCenterBottomTextString(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterBottomTextView:Landroid/widget/TextView;

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initCenterBottomText()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterBottomTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p0
.end method

.method public setCenterDrawableBottom(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;
    .locals 3

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v2, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextView:Landroid/widget/TextView;

    if-nez v0, :cond_1

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initCenterText()V

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextView:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1, v1, p1}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-object p0
.end method

.method public setCenterDrawableLeft(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;
    .locals 3

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v2, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextView:Landroid/widget/TextView;

    if-nez v0, :cond_1

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initCenterText()V

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextView:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, v1, v1}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-object p0
.end method

.method public setCenterDrawableRight(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;
    .locals 3

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v2, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextView:Landroid/widget/TextView;

    if-nez v0, :cond_1

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initCenterText()V

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextView:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1, p1, v1}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-object p0
.end method

.method public setCenterDrawableTop(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;
    .locals 3

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v2, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextView:Landroid/widget/TextView;

    if-nez v0, :cond_1

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initCenterText()V

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextView:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1, v1, v1}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-object p0
.end method

.method public setCenterTextColor(I)Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextView:Landroid/widget/TextView;

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initCenterText()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-object p0
.end method

.method public setCenterTextSize(F)Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextView:Landroid/widget/TextView;

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initCenterText()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    return-object p0
.end method

.method public setCenterTextString(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextView:Landroid/widget/TextView;

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initCenterText()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p0
.end method

.method public setCenterTopTextString(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTopTextView:Landroid/widget/TextView;

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initCenterTopText()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTopTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p0
.end method

.method public setCenterViewIsClickable(Z)Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextView:Landroid/widget/TextView;

    if-eqz p1, :cond_0

    .line 2
    new-instance v0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView$6;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView$6;-><init>(Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-object p0
.end method

.method public setDrawable(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;I)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 2
    invoke-virtual {p1, p6}, Landroid/widget/TextView;->setCompoundDrawablePadding(I)V

    return-void
.end method

.method public setLeftBottomTextString(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftBottomTextView:Landroid/widget/TextView;

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initLeftBottomText()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftBottomTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p0
.end method

.method public setLeftDrawableBottom(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;
    .locals 3

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v2, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTextView:Landroid/widget/TextView;

    if-nez v0, :cond_1

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initLeftText()V

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTextView:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1, v1, p1}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-object p0
.end method

.method public setLeftDrawableLeft(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;
    .locals 3

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v2, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTextView:Landroid/widget/TextView;

    if-nez v0, :cond_1

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initLeftText()V

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTextView:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, v1, v1}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-object p0
.end method

.method public setLeftDrawableRight(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;
    .locals 3

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v2, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTextView:Landroid/widget/TextView;

    if-nez v0, :cond_1

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initLeftText()V

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTextView:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1, p1, v1}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-object p0
.end method

.method public setLeftDrawableTop(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;
    .locals 3

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v2, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTextView:Landroid/widget/TextView;

    if-nez v0, :cond_1

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initLeftText()V

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTextView:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1, v1, v1}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-object p0
.end method

.method public setLeftTextColor(I)Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTextView:Landroid/widget/TextView;

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initLeftText()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-object p0
.end method

.method public setLeftTextSize(F)Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTextView:Landroid/widget/TextView;

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initLeftText()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    return-object p0
.end method

.method public setLeftTextString(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTextView:Landroid/widget/TextView;

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initLeftText()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p0
.end method

.method public setLeftTopTextString(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTopTextView:Landroid/widget/TextView;

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initLeftTopText()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTopTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p0
.end method

.method public setLeftViewIsClickable(Z)Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTextView:Landroid/widget/TextView;

    if-eqz p1, :cond_0

    .line 2
    new-instance v0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView$5;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView$5;-><init>(Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-object p0
.end method

.method public setOnCommonTextViewClickListener(Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView$OnCommonTextViewClickListener;)Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mOnCommonTextViewClickListener:Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView$OnCommonTextViewClickListener;

    return-object p0
.end method

.method public setRightBottomTextString(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightBottomTextView:Landroid/widget/TextView;

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initRightBottomText()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightBottomTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p0
.end method

.method public setRightDrawableBottom(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;
    .locals 3

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v2, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextView:Landroid/widget/TextView;

    if-nez v0, :cond_1

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initRightText()V

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextView:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1, v1, p1}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-object p0
.end method

.method public setRightDrawableLeft(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;
    .locals 3

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v2, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextView:Landroid/widget/TextView;

    if-nez v0, :cond_1

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initRightText()V

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextView:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, v1, v1}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-object p0
.end method

.method public setRightDrawableRight(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;
    .locals 3

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v2, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextView:Landroid/widget/TextView;

    if-nez v0, :cond_1

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initRightText()V

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextView:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1, p1, v1}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-object p0
.end method

.method public setRightDrawableTop(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;
    .locals 3

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v2, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextView:Landroid/widget/TextView;

    if-nez v0, :cond_1

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initRightText()V

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextView:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1, v1, v1}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-object p0
.end method

.method public setRightTextColor(I)Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextView:Landroid/widget/TextView;

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initRightText()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-object p0
.end method

.method public setRightTextSize(F)Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextView:Landroid/widget/TextView;

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initRightText()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    return-object p0
.end method

.method public setRightTextString(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextView:Landroid/widget/TextView;

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initRightText()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p0
.end method

.method public setRightTopTextString(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTopTextView:Landroid/widget/TextView;

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->initRightTopText()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTopTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p0
.end method

.method public setRightViewIsClickable(Z)Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextView:Landroid/widget/TextView;

    if-eqz p1, :cond_0

    .line 2
    new-instance v0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView$7;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView$7;-><init>(Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-object p0
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTextView:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTextView:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTextView:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftTopTextView:Landroid/widget/TextView;

    if-eqz v0, :cond_3

    .line 8
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 9
    :cond_3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterTopTextView:Landroid/widget/TextView;

    if-eqz v0, :cond_4

    .line 10
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 11
    :cond_4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightTopTextView:Landroid/widget/TextView;

    if-eqz v0, :cond_5

    .line 12
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 13
    :cond_5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mLeftBottomTextView:Landroid/widget/TextView;

    if-eqz v0, :cond_6

    .line 14
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 15
    :cond_6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mCenterBottomTextView:Landroid/widget/TextView;

    if-eqz v0, :cond_7

    .line 16
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 17
    :cond_7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/CommonTextView;->mRightBottomTextView:Landroid/widget/TextView;

    if-eqz v0, :cond_8

    .line 18
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_8
    return-void
.end method

.method public sp2px(Landroid/content/Context;F)I
    .locals 0

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->scaledDensity:F

    mul-float p2, p2, p1

    const/high16 p1, 0x3f000000    # 0.5f

    add-float/2addr p2, p1

    float-to-int p1, p2

    return p1
.end method
