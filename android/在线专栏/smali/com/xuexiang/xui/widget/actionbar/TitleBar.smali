.class public Lcom/xuexiang/xui/widget/actionbar/TitleBar;
.super Landroid/view/ViewGroup;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lio/github/inflationx/calligraphy3/HasTypeface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/actionbar/TitleBar$TextAction;,
        Lcom/xuexiang/xui/widget/actionbar/TitleBar$ImageAction;,
        Lcom/xuexiang/xui/widget/actionbar/TitleBar$Action;,
        Lcom/xuexiang/xui/widget/actionbar/TitleBar$ActionList;
    }
.end annotation


# static fields
.field public static final CENTER_CENTER:I = 0x0

.field public static final CENTER_LEFT:I = 0x1

.field public static final CENTER_RIGHT:I = 0x2

.field private static final STATUS_BAR_HEIGHT_RES_NAME:Ljava/lang/String; = "status_bar_height"


# instance fields
.field private mActionPadding:I

.field private mActionTextColor:I

.field private mActionTextSize:I

.field private mBarHeight:I

.field private mCenterGravity:I

.field private mCenterLayout:Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;

.field private mCenterText:Landroid/widget/TextView;

.field private mCustomCenterView:Landroid/view/View;

.field private mDivideHeight:I

.field private mDividerColor:I

.field private mDividerView:Landroid/view/View;

.field private mImmersive:Z

.field private mIsUseThemeColor:Z

.field private mLeftImageResource:Landroid/graphics/drawable/Drawable;

.field private mLeftText:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

.field private mLeftTextString:Ljava/lang/String;

.field private mRightLayout:Landroid/widget/LinearLayout;

.field private mScreenWidth:I

.field private mSideTextColor:I

.field private mSideTextPadding:I

.field private mSideTextSize:I

.field private mStatusBarHeight:I

.field private mSubTextString:Ljava/lang/String;

.field private mSubTitleText:Landroid/widget/TextView;

.field private mSubTitleTextColor:I

.field private mSubTitleTextSize:I

.field private mTitleTextColor:I

.field private mTitleTextSize:I

.field private mTitleTextString:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->TitleBarStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->init(Landroid/content/Context;)V

    return-void
.end method

.method private static getInternalDimensionSize(Landroid/content/res/Resources;Ljava/lang/String;)I
    .locals 2

    const-string v0, "dimen"

    const-string v1, "android"

    .line 1
    invoke-virtual {p0, p1, v0, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    if-lez p1, :cond_0

    .line 2
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static getStatusBarHeight()I
    .locals 2

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "status_bar_height"

    invoke-static {v0, v1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->getInternalDimensionSize(Landroid/content/res/Resources;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method private init(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mScreenWidth:I

    .line 2
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mImmersive:Z

    if-eqz v0, :cond_0

    .line 3
    invoke-static {}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->getStatusBarHeight()I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mStatusBarHeight:I

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->initView(Landroid/content/Context;)V

    return-void
.end method

.method private initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->TitleBar:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 2
    sget p3, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_barHeight:I

    sget v0, Lcom/xuexiang/xui/R$attr;->xui_actionbar_height:I

    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mBarHeight:I

    .line 3
    sget p3, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_immersive:I

    sget v0, Lcom/xuexiang/xui/R$attr;->xui_actionbar_immersive:I

    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveBoolean(Landroid/content/Context;I)Z

    move-result v0

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    iput-boolean p3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mImmersive:Z

    .line 4
    sget p3, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_actionPadding:I

    sget v0, Lcom/xuexiang/xui/R$attr;->xui_actionbar_action_padding:I

    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mActionPadding:I

    .line 5
    sget p3, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_sideTextPadding:I

    sget v0, Lcom/xuexiang/xui/R$attr;->xui_actionbar_side_text_padding:I

    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mSideTextPadding:I

    .line 6
    sget p3, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_centerGravity:I

    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterGravity:I

    .line 7
    sget p3, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_sideTextSize:I

    sget v0, Lcom/xuexiang/xui/R$attr;->xui_actionbar_action_text_size:I

    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mSideTextSize:I

    .line 8
    sget p3, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_titleTextSize:I

    sget v2, Lcom/xuexiang/xui/R$attr;->xui_actionbar_title_text_size:I

    invoke-static {p1, v2}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mTitleTextSize:I

    .line 9
    sget p3, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_subTitleTextSize:I

    sget v2, Lcom/xuexiang/xui/R$attr;->xui_actionbar_sub_text_size:I

    invoke-static {p1, v2}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    iput p3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mSubTitleTextSize:I

    .line 10
    sget p3, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_actionTextSize:I

    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDimension(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p2, p3, p1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mActionTextSize:I

    .line 11
    sget p1, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_sideTextColor:I

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p3

    sget v0, Lcom/xuexiang/xui/R$attr;->xui_actionbar_text_color:I

    const/4 v2, -0x1

    invoke-static {p3, v0, v2}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveColor(Landroid/content/Context;II)I

    move-result p3

    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mSideTextColor:I

    .line 12
    sget p1, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_titleTextColor:I

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, v0, v2}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveColor(Landroid/content/Context;II)I

    move-result p3

    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mTitleTextColor:I

    .line 13
    sget p1, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_subTitleTextColor:I

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, v0, v2}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveColor(Landroid/content/Context;II)I

    move-result p3

    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mSubTitleTextColor:I

    .line 14
    sget p1, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_actionTextColor:I

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, v0, v2}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveColor(Landroid/content/Context;II)I

    move-result p3

    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mActionTextColor:I

    .line 15
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    sget p3, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_leftImageResource:I

    invoke-static {p1, p2, p3}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftImageResource:Landroid/graphics/drawable/Drawable;

    .line 16
    sget p1, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_leftText:I

    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftTextString:Ljava/lang/String;

    .line 17
    sget p1, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_titleText:I

    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mTitleTextString:Ljava/lang/String;

    .line 18
    sget p1, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_subTitleText:I

    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mSubTextString:Ljava/lang/String;

    .line 19
    sget p1, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_dividerColor:I

    invoke-virtual {p2, p1, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mDividerColor:I

    .line 20
    sget p1, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_dividerHeight:I

    const/high16 p3, 0x3f800000    # 1.0f

    invoke-static {p3}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(F)I

    move-result p3

    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mDivideHeight:I

    .line 21
    sget p1, Lcom/xuexiang/xui/R$styleable;->TitleBar_tb_useThemeColor:I

    const/4 p3, 0x1

    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mIsUseThemeColor:Z

    .line 22
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private initView(Landroid/content/Context;)V
    .locals 7

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    invoke-direct {v0, p1}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftText:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    .line 2
    new-instance v0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;

    invoke-direct {v0, p1}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterLayout:Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;

    .line 3
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mRightLayout:Landroid/widget/LinearLayout;

    .line 4
    new-instance v0, Landroid/view/View;

    invoke-direct {v0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mDividerView:Landroid/view/View;

    .line 5
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x1

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftText:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    iget v3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mSideTextSize:I

    int-to-float v3, v3

    const/4 v4, 0x0

    invoke-virtual {v1, v4, v3}, Landroidx/appcompat/widget/AppCompatTextView;->setTextSize(IF)V

    .line 7
    iget-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftText:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    iget v3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mSideTextColor:I

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 8
    iget-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftText:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    iget-object v3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftTextString:Ljava/lang/String;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    iget-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftImageResource:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_0

    .line 10
    iget-object v3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftText:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    const/4 v5, 0x0

    invoke-virtual {v3, v1, v5, v5, v5}, Landroidx/appcompat/widget/AppCompatTextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 11
    :cond_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftText:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->setSingleLine()V

    .line 12
    iget-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftText:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    const/16 v3, 0x10

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 13
    iget-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftText:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    iget v3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mSideTextPadding:I

    invoke-virtual {v1, v3, v4, v3, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 14
    iget-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftText:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    invoke-static {}, Lcom/xuexiang/xui/XUI;->getDefaultTypeface()Landroid/graphics/Typeface;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 15
    new-instance v1, Lcom/xuexiang/xui/widget/textview/AutoMoveTextView;

    invoke-direct {v1, p1}, Lcom/xuexiang/xui/widget/textview/AutoMoveTextView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterText:Landroid/widget/TextView;

    .line 16
    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mSubTitleText:Landroid/widget/TextView;

    .line 17
    iget-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mSubTextString:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v3, 0x1

    if-nez v1, :cond_1

    .line 18
    iget-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterLayout:Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 19
    :cond_1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterText:Landroid/widget/TextView;

    iget v5, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mTitleTextSize:I

    int-to-float v5, v5

    invoke-virtual {v1, v4, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 20
    iget-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterText:Landroid/widget/TextView;

    iget v5, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mTitleTextColor:I

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 21
    iget-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterText:Landroid/widget/TextView;

    iget-object v5, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mTitleTextString:Ljava/lang/String;

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 22
    iget-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterText:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->setSingleLine()V

    .line 23
    iget-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterText:Landroid/widget/TextView;

    sget-object v5, Landroid/text/TextUtils$TruncateAt;->MARQUEE:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 24
    iget-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterText:Landroid/widget/TextView;

    invoke-static {}, Lcom/xuexiang/xui/XUI;->getDefaultTypeface()Landroid/graphics/Typeface;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 25
    iget-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mSubTitleText:Landroid/widget/TextView;

    iget v5, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mSubTitleTextSize:I

    int-to-float v5, v5

    invoke-virtual {v1, v4, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 26
    iget-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mSubTitleText:Landroid/widget/TextView;

    iget v5, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mSubTitleTextColor:I

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 27
    iget-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mSubTitleText:Landroid/widget/TextView;

    iget-object v5, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mSubTextString:Ljava/lang/String;

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    iget-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mSubTitleText:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->setSingleLine()V

    .line 29
    iget-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mSubTitleText:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v5

    const/high16 v6, 0x40000000    # 2.0f

    invoke-static {v5, v6}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result v5

    invoke-virtual {v1, v4, v5, v4, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 30
    iget-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mSubTitleText:Landroid/widget/TextView;

    sget-object v5, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 31
    iget-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mSubTitleText:Landroid/widget/TextView;

    invoke-static {}, Lcom/xuexiang/xui/XUI;->getDefaultTypeface()Landroid/graphics/Typeface;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 32
    iget v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterGravity:I

    if-ne v1, v3, :cond_2

    const v1, 0x800013

    .line 33
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->setCenterGravity(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    goto :goto_0

    :cond_2
    const/4 v3, 0x2

    if-ne v1, v3, :cond_3

    const v1, 0x800015

    .line 34
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->setCenterGravity(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    goto :goto_0

    :cond_3
    const/16 v1, 0x11

    .line 35
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->setCenterGravity(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 36
    :goto_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterLayout:Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;

    iget-object v3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterText:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 37
    iget-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterLayout:Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;

    iget-object v3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mSubTitleText:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 38
    iget-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mRightLayout:Landroid/widget/LinearLayout;

    iget v3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mSideTextPadding:I

    invoke-virtual {v1, v3, v4, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .line 39
    iget-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mDividerView:Landroid/view/View;

    iget v3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mDividerColor:I

    invoke-virtual {v1, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 40
    iget-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftText:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    invoke-virtual {p0, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 41
    iget-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterLayout:Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 42
    iget-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mRightLayout:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 43
    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mDividerView:Landroid/view/View;

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    iget v3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mDivideHeight:I

    invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 44
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mIsUseThemeColor:Z

    if-eqz v0, :cond_5

    .line 45
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$attr;->xui_actionbar_background:I

    invoke-static {v0, v1}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 46
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 47
    :cond_4
    sget v0, Lcom/xuexiang/xui/R$attr;->xui_actionbar_color:I

    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setBackgroundColor(I)V

    :cond_5
    :goto_1
    return-void
.end method

.method private isRtl()Z
    .locals 2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getLayoutDirection()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method private layoutChildView(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mStatusBarHeight:I

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    iget v3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mStatusBarHeight:I

    add-int/2addr v2, v3

    const/4 v3, 0x0

    invoke-virtual {p1, v3, v0, v1, v2}, Landroid/view/View;->layout(IIII)V

    .line 2
    iget v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mScreenWidth:I

    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    sub-int/2addr v0, v1

    iget v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mStatusBarHeight:I

    iget v2, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mScreenWidth:I

    .line 3
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    iget v4, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mStatusBarHeight:I

    add-int/2addr v3, v4

    .line 4
    invoke-virtual {p3, v0, v1, v2, v3}, Landroid/view/View;->layout(IIII)V

    .line 5
    iget v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterGravity:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p3

    iget v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mStatusBarHeight:I

    iget v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mScreenWidth:I

    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    sub-int/2addr v1, p1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result p1

    .line 8
    invoke-virtual {p2, p3, v0, v1, p1}, Landroid/view/View;->layout(IIII)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 9
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    iget v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mStatusBarHeight:I

    iget v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mScreenWidth:I

    .line 10
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    move-result p3

    sub-int/2addr v1, p3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result p3

    .line 11
    invoke-virtual {p2, p1, v0, v1, p3}, Landroid/view/View;->layout(IIII)V

    goto :goto_0

    .line 12
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    if-le v0, v1, :cond_2

    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p3

    iget v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mStatusBarHeight:I

    iget v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mScreenWidth:I

    .line 14
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    sub-int/2addr v1, p1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result p1

    .line 15
    invoke-virtual {p2, p3, v0, v1, p1}, Landroid/view/View;->layout(IIII)V

    goto :goto_0

    .line 16
    :cond_2
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    iget v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mStatusBarHeight:I

    iget v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mScreenWidth:I

    .line 17
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    move-result p3

    sub-int/2addr v1, p3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result p3

    .line 18
    invoke-virtual {p2, p1, v0, v1, p3}, Landroid/view/View;->layout(IIII)V

    :goto_0
    return-void
.end method


# virtual methods
.method public addAction(Lcom/xuexiang/xui/widget/actionbar/TitleBar$Action;)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mRightLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->addAction(Lcom/xuexiang/xui/widget/actionbar/TitleBar$Action;I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public addAction(Lcom/xuexiang/xui/widget/actionbar/TitleBar$Action;I)Landroid/view/View;
    .locals 3

    .line 3
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    const/4 v2, -0x1

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 4
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->inflateAction(Lcom/xuexiang/xui/widget/actionbar/TitleBar$Action;)Landroid/view/View;

    move-result-object p1

    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mRightLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v1, p1, p2, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-object p1
.end method

.method public addActions(Lcom/xuexiang/xui/widget/actionbar/TitleBar$ActionList;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/util/LinkedList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 2
    invoke-virtual {p1, v1}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/xuexiang/xui/widget/actionbar/TitleBar$Action;

    invoke-virtual {p0, v2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->addAction(Lcom/xuexiang/xui/widget/actionbar/TitleBar$Action;)Landroid/view/View;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public disableLeftView()Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 2

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->setBackImageResource(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 2
    iget v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mActionPadding:I

    invoke-virtual {p0, v1, v0}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->setLeftTextPadding(II)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 3
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->setLeftVisible(Z)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    return-object p0
.end method

.method public getActionCount()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mRightLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    return v0
.end method

.method public getCenterText()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterText:Landroid/widget/TextView;

    return-object v0
.end method

.method public getDividerView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mDividerView:Landroid/view/View;

    return-object v0
.end method

.method public getLeftText()Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftText:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    return-object v0
.end method

.method public getSubTitleText()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mSubTitleText:Landroid/widget/TextView;

    return-object v0
.end method

.method public getViewByAction(Lcom/xuexiang/xui/widget/actionbar/TitleBar$Action;)Landroid/view/View;
    .locals 0

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method protected inflateAction(Lcom/xuexiang/xui/widget/actionbar/TitleBar$Action;)Landroid/view/View;
    .locals 5

    .line 1
    invoke-interface {p1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar$Action;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaImageView;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaImageView;-><init>(Landroid/content/Context;)V

    .line 3
    invoke-interface {p1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar$Action;->getDrawable()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;-><init>(Landroid/content/Context;)V

    const/16 v2, 0x11

    .line 5
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 6
    invoke-interface {p1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar$Action;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    iget v2, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mActionTextSize:I

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 8
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    iget v3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mActionTextSize:I

    int-to-float v3, v3

    invoke-static {v2, v3}, Lcom/xuexiang/xui/utils/DensityUtils;->px2sp(Landroid/content/Context;F)I

    move-result v2

    const/16 v3, 0x10

    if-lt v2, v3, :cond_1

    .line 9
    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v2

    const/4 v3, 0x1

    .line 10
    invoke-virtual {v2, v3}, Landroid/text/TextPaint;->setFakeBoldText(Z)V

    .line 11
    :cond_1
    invoke-static {}, Lcom/xuexiang/xui/XUI;->getDefaultTypeface()Landroid/graphics/Typeface;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 12
    iget v2, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mActionTextColor:I

    if-eqz v2, :cond_2

    .line 13
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 14
    :cond_2
    :goto_0
    invoke-interface {p1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar$Action;->leftPadding()I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_3

    invoke-interface {p1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar$Action;->leftPadding()I

    move-result v2

    goto :goto_1

    :cond_3
    iget v2, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mActionPadding:I

    :goto_1
    invoke-interface {p1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar$Action;->rightPadding()I

    move-result v4

    if-eq v4, v3, :cond_4

    invoke-interface {p1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar$Action;->rightPadding()I

    move-result v3

    goto :goto_2

    :cond_4
    iget v3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mActionPadding:I

    :goto_2
    invoke-virtual {v0, v2, v1, v3, v1}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 15
    invoke-virtual {v0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 16
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    .line 2
    instance-of v1, v0, Lcom/xuexiang/xui/widget/actionbar/TitleBar$Action;

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Lcom/xuexiang/xui/widget/actionbar/TitleBar$Action;

    .line 4
    invoke-interface {v0, p1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar$Action;->performAction(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->isRtl()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mRightLayout:Landroid/widget/LinearLayout;

    iget-object p2, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterLayout:Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;

    iget-object p3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftText:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->layoutChildView(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftText:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    iget-object p2, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterLayout:Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;

    iget-object p3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mRightLayout:Landroid/widget/LinearLayout;

    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->layoutChildView(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V

    .line 4
    :goto_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mDividerView:Landroid/view/View;

    const/4 p2, 0x0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result p3

    iget-object p4, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mDividerView:Landroid/view/View;

    invoke-virtual {p4}, Landroid/view/View;->getMeasuredHeight()I

    move-result p4

    sub-int/2addr p3, p4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result p4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result p5

    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 5

    .line 1
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_0

    .line 2
    iget p2, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mBarHeight:I

    iget v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mStatusBarHeight:I

    add-int/2addr v0, p2

    .line 3
    invoke-static {p2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    iget v2, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mStatusBarHeight:I

    add-int/2addr v0, v2

    .line 5
    :goto_0
    iget-object v2, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftText:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    invoke-virtual {p0, v2, p1, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    .line 6
    iget-object v2, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mRightLayout:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v2, p1, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    .line 7
    iget-object v2, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftText:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v2

    iget-object v3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mRightLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getMeasuredWidth()I

    move-result v3

    if-le v2, v3, :cond_1

    .line 8
    iget-object v2, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterLayout:Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;

    iget v3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mScreenWidth:I

    iget-object v4, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftText:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    .line 9
    invoke-virtual {v4}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v4

    mul-int/lit8 v4, v4, 0x2

    sub-int/2addr v3, v4

    invoke-static {v3, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 10
    invoke-virtual {v2, v1, p2}, Landroid/widget/LinearLayout;->measure(II)V

    goto :goto_1

    .line 11
    :cond_1
    iget-object v2, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterLayout:Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;

    iget v3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mScreenWidth:I

    iget-object v4, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mRightLayout:Landroid/widget/LinearLayout;

    .line 12
    invoke-virtual {v4}, Landroid/widget/LinearLayout;->getMeasuredWidth()I

    move-result v4

    mul-int/lit8 v4, v4, 0x2

    sub-int/2addr v3, v4

    invoke-static {v3, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 13
    invoke-virtual {v2, v1, p2}, Landroid/widget/LinearLayout;->measure(II)V

    .line 14
    :goto_1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mDividerView:Landroid/view/View;

    invoke-virtual {p0, v1, p1, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    .line 15
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V

    return-void
.end method

.method public removeAction(Lcom/xuexiang/xui/widget/actionbar/TitleBar$Action;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mRightLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 2
    iget-object v2, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mRightLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v3

    .line 4
    instance-of v4, v3, Lcom/xuexiang/xui/widget/actionbar/TitleBar$Action;

    if-eqz v4, :cond_0

    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 5
    iget-object v3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mRightLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v2}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public removeActionAt(I)V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mRightLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->removeViewAt(I)V

    return-void
.end method

.method public removeAllActions()V
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mRightLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    return-void
.end method

.method public setActionTextColor(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mActionTextColor:I

    return-object p0
.end method

.method public setBackImageResource(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, p1}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftImageResource:Landroid/graphics/drawable/Drawable;

    .line 2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x41400000    # 12.0f

    invoke-static {v1, v2}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result v1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    const/high16 v3, 0x41b00000    # 22.0f

    invoke-static {v2, v3}, Lcom/xuexiang/xui/utils/DensityUtils;->dp2px(Landroid/content/Context;F)I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {p1, v3, v3, v1, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftText:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftImageResource:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, v1, v0, v0, v0}, Landroidx/appcompat/widget/AppCompatTextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 4
    :cond_0
    iput-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftImageResource:Landroid/graphics/drawable/Drawable;

    .line 5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftText:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    invoke-virtual {p1, v0, v0, v0, v0}, Landroidx/appcompat/widget/AppCompatTextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    :goto_0
    return-object p0
.end method

.method public setCenterClickListener(Landroid/view/View$OnClickListener;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterLayout:Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object p0
.end method

.method public setCenterGravity(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterLayout:Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterText:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mSubTitleText:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setGravity(I)V

    return-object p0
.end method

.method public setCenterTextBold(Z)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterText:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/text/TextPaint;->setFakeBoldText(Z)V

    :cond_0
    return-object p0
.end method

.method public setCustomTitle(Landroid/view/View;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 2

    if-nez p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterText:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCustomCenterView:Landroid/view/View;

    if-eqz p1, :cond_2

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterLayout:Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCustomCenterView:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterLayout:Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    .line 6
    :cond_1
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 7
    iput-object p1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCustomCenterView:Landroid/view/View;

    .line 8
    iget-object v1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterLayout:Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;

    invoke-virtual {v1, p1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterText:Landroid/widget/TextView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_2
    :goto_0
    return-object p0
.end method

.method public setDivider(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mDividerView:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-object p0
.end method

.method public setDividerColor(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mDividerView:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    return-object p0
.end method

.method public setDividerHeight(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mDividerView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    return-object p0
.end method

.method public setHeight(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mBarHeight:I

    .line 2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result p1

    iget v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mBarHeight:I

    invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V

    return-object p0
.end method

.method public setImmersive(Z)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mImmersive:Z

    if-eqz p1, :cond_0

    .line 2
    invoke-static {}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->getStatusBarHeight()I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mStatusBarHeight:I

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 3
    iput p1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mStatusBarHeight:I

    :goto_0
    return-object p0
.end method

.method public setLeftClickListener(Landroid/view/View$OnClickListener;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftText:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object p0
.end method

.method public setLeftImageDrawable(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftImageResource:Landroid/graphics/drawable/Drawable;

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftText:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 3
    invoke-virtual {v0, p1, v1, v1, v1}, Landroidx/appcompat/widget/AppCompatTextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-object p0
.end method

.method public setLeftImageResource(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftText:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, p1, v1, v1, v1}, Landroidx/appcompat/widget/AppCompatTextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(IIII)V

    :cond_0
    return-object p0
.end method

.method public setLeftText(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftText:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    return-object p0
.end method

.method public setLeftText(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftText:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p0
.end method

.method public setLeftTextBold(Z)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftText:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/text/TextPaint;->setFakeBoldText(Z)V

    :cond_0
    return-object p0
.end method

.method public setLeftTextColor(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftText:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-object p0
.end method

.method public setLeftTextEllipsize(Landroid/text/TextUtils$TruncateAt;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftText:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    return-object p0
.end method

.method public setLeftTextMaxEms(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftText:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setMaxEms(I)V

    return-object p0
.end method

.method public setLeftTextMaxWidth(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftText:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setMaxWidth(I)V

    return-object p0
.end method

.method public setLeftTextPadding(II)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftText:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, p2, v1}, Landroid/widget/TextView;->setPaddingRelative(IIII)V

    return-object p0
.end method

.method public setLeftTextSize(F)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftText:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Landroidx/appcompat/widget/AppCompatTextView;->setTextSize(IF)V

    return-object p0
.end method

.method public setLeftVisible(Z)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftText:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V

    return-object p0
.end method

.method public setOnTitleClickListener(Landroid/view/View$OnClickListener;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterText:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object p0
.end method

.method public setSubTitle(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 2

    .line 4
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterLayout:Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mSubTitleText:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mSubTitleText:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    return-object p0
.end method

.method public setSubTitle(Ljava/lang/CharSequence;I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterLayout:Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;

    invoke-virtual {v0, p2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 2
    iget-object p2, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mSubTitleText:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mSubTitleText:Landroid/widget/TextView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    return-object p0
.end method

.method public setSubTitleColor(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mSubTitleText:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-object p0
.end method

.method public setSubTitleSize(F)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mSubTitleText:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Landroid/widget/TextView;->setTextSize(IF)V

    return-object p0
.end method

.method public setTitle(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 1

    .line 11
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->setTitle(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    return-object p0
.end method

.method public setTitle(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 6

    .line 1
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-lez v0, :cond_0

    .line 2
    invoke-interface {p1, v2, v0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v2

    add-int/2addr v0, v1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    invoke-interface {p1, v0, v3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->setTitle(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "\t"

    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_1

    .line 4
    invoke-interface {p1, v2, v0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "  "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/2addr v0, v1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-interface {p1, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v3, p1, v2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->setTitle(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    goto :goto_0

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterText:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mSubTitleText:Landroid/widget/TextView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-object p0
.end method

.method public setTitle(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterLayout:Lcom/xuexiang/xui/widget/alpha/XUIAlphaLinearLayout;

    invoke-virtual {v0, p3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 8
    iget-object p3, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterText:Landroid/widget/TextView;

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mSubTitleText:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    iget-object p1, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mSubTitleText:Landroid/widget/TextView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    return-object p0
.end method

.method public setTitleBackground(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterText:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    return-object p0
.end method

.method public setTitleColor(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterText:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-object p0
.end method

.method public setTitleSize(F)Lcom/xuexiang/xui/widget/actionbar/TitleBar;
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterText:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Landroid/widget/TextView;->setTextSize(IF)V

    return-object p0
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mLeftText:Lcom/xuexiang/xui/widget/alpha/XUIAlphaTextView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mCenterText:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->mSubTitleText:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_2
    return-void
.end method
