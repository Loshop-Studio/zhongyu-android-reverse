.class public Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;
.super Landroid/widget/LinearLayout;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroidx/viewpager/widget/ViewPager$i;
.implements Lio/github/inflationx/calligraphy3/HasTypeface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/tabbar/EasyIndicator$OnTabClickListener;
    }
.end annotation


# instance fields
.field private indicatorBottomLineColor:I

.field private indicatorBottomLineHeight:I

.field private indicatorHeight:I

.field private indicatorLineColor:I

.field private indicatorLineDrawable:Landroid/graphics/drawable/Drawable;

.field private indicatorLineHeight:I

.field private indicatorLineShow:Z

.field private indicatorLineWidth:I

.field private indicatorNormalColor:I

.field private indicatorSelectTextSize:F

.field private indicatorSelectedColor:I

.field private indicatorTextSize:F

.field private indicatorVerticalLineColor:I

.field private indicatorVerticalLineHeight:I

.field private indicatorVerticalLineWidth:I

.field private indicatorWidth:I

.field private mCurrIndex:I

.field private mIndicatorContainer:Landroid/widget/LinearLayout;

.field public mOnTabClickListener:Lcom/xuexiang/xui/widget/tabbar/EasyIndicator$OnTabClickListener;

.field private mViewPager:Landroidx/viewpager/widget/ViewPager;

.field public screenHeight:I

.field public screenWidth:I

.field private tabContent:Landroid/widget/LinearLayout;

.field private tvs:[Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->EasyIndicatorStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 v0, 0x2d

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorHeight:I

    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorWidth:I

    const/4 v1, 0x1

    .line 6
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorLineShow:Z

    const/4 v2, 0x3

    .line 7
    iput v2, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorLineHeight:I

    .line 8
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorLineWidth:I

    const/4 v0, 0x0

    .line 9
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorBottomLineHeight:I

    .line 10
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorVerticalLineWidth:I

    .line 11
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorVerticalLineHeight:I

    const/high16 v0, 0x41600000    # 14.0f

    .line 12
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorTextSize:F

    .line 13
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorSelectTextSize:F

    .line 14
    invoke-virtual {p0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 15
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->initScreenWidth()V

    .line 16
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->init(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;)Landroid/widget/LinearLayout;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->mIndicatorContainer:Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private buildIndicatorAnimatorTowards(Landroid/widget/TextView;)Landroid/animation/AnimatorSet;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->tabContent:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getX()F

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->mIndicatorContainer:Landroid/widget/LinearLayout;

    const/4 v2, 0x2

    new-array v3, v2, [F

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getX()F

    move-result v4

    const/4 v5, 0x0

    aput v4, v3, v5

    invoke-virtual {p1}, Landroid/widget/TextView;->getX()F

    move-result v4

    add-float/2addr v4, v0

    const/4 v0, 0x1

    aput v4, v3, v0

    const-string v4, "X"

    invoke-static {v1, v4, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    .line 3
    iget-object v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->mIndicatorContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    new-array v4, v2, [I

    .line 4
    iget v6, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    aput v6, v4, v5

    invoke-virtual {p1}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result p1

    aput p1, v4, v0

    invoke-static {v4}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object p1

    .line 5
    new-instance v4, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator$1;

    invoke-direct {v4, p0, v3}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator$1;-><init>(Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p1, v4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 6
    new-instance v3, Landroid/animation/AnimatorSet;

    invoke-direct {v3}, Landroid/animation/AnimatorSet;-><init>()V

    .line 7
    new-instance v4, Lj0/b;

    invoke-direct {v4}, Lj0/b;-><init>()V

    invoke-virtual {v3, v4}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-array v2, v2, [Landroid/animation/Animator;

    aput-object v1, v2, v5

    aput-object p1, v2, v0

    .line 8
    invoke-virtual {v3, v2}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    return-object v3
.end method

.method private getDimensionPixelSize(Landroid/content/res/TypedArray;II)F
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    if-lez v0, :cond_0

    .line 2
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-direct {p0, p3}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->getPixelSizeBySp(I)F

    move-result p3

    float-to-int p3, p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p1

    :goto_0
    int-to-float p1, p1

    return p1
.end method

.method private getPixelSizeBySp(I)F
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->scaledDensity:F

    int-to-float p1, p1

    mul-float p1, p1, v0

    return p1
.end method

.method private init(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->EasyIndicator:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 2
    sget p3, Lcom/xuexiang/xui/R$styleable;->EasyIndicator_indicator_width:I

    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorWidth:I

    invoke-direct {p0, p2, p3, v0}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->getDimensionPixelSize(Landroid/content/res/TypedArray;II)F

    move-result p3

    float-to-int p3, p3

    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorWidth:I

    .line 3
    sget p3, Lcom/xuexiang/xui/R$styleable;->EasyIndicator_indicator_height:I

    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorHeight:I

    invoke-direct {p0, p2, p3, v0}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->getDimensionPixelSize(Landroid/content/res/TypedArray;II)F

    move-result p3

    float-to-int p3, p3

    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorHeight:I

    .line 4
    sget p3, Lcom/xuexiang/xui/R$styleable;->EasyIndicator_indicator_background:I

    invoke-static {p1, p2, p3}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    .line 5
    sget v0, Lcom/xuexiang/xui/R$styleable;->EasyIndicator_indicator_line_show:I

    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorLineShow:Z

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorLineShow:Z

    .line 6
    sget v0, Lcom/xuexiang/xui/R$styleable;->EasyIndicator_indicator_line_width:I

    iget v1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorLineWidth:I

    invoke-direct {p0, p2, v0, v1}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->getDimensionPixelSize(Landroid/content/res/TypedArray;II)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorLineWidth:I

    .line 7
    sget v0, Lcom/xuexiang/xui/R$styleable;->EasyIndicator_indicator_line_height:I

    iget v1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorLineHeight:I

    invoke-direct {p0, p2, v0, v1}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->getDimensionPixelSize(Landroid/content/res/TypedArray;II)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorLineHeight:I

    .line 8
    sget v0, Lcom/xuexiang/xui/R$styleable;->EasyIndicator_indicator_line_color:I

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/xuexiang/xui/utils/ThemeUtils;->getMainThemeColor(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorLineColor:I

    .line 9
    sget v0, Lcom/xuexiang/xui/R$styleable;->EasyIndicator_indicator_line_res:I

    invoke-static {p1, p2, v0}, Lcom/xuexiang/xui/utils/ResUtils;->getDrawableAttrRes(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorLineDrawable:Landroid/graphics/drawable/Drawable;

    .line 10
    sget p1, Lcom/xuexiang/xui/R$styleable;->EasyIndicator_indicator_bottom_line_height:I

    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorBottomLineHeight:I

    invoke-direct {p0, p2, p1, v0}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->getDimensionPixelSize(Landroid/content/res/TypedArray;II)F

    move-result p1

    float-to-int p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorBottomLineHeight:I

    .line 11
    sget p1, Lcom/xuexiang/xui/R$styleable;->EasyIndicator_indicator_bottom_line_color:I

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/xuexiang/xui/R$attr;->xui_config_color_separator_dark:I

    invoke-static {v0, v1}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorBottomLineColor:I

    .line 12
    sget p1, Lcom/xuexiang/xui/R$styleable;->EasyIndicator_indicator_selected_color:I

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/xuexiang/xui/utils/ThemeUtils;->getMainThemeColor(Landroid/content/Context;)I

    move-result v0

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorSelectedColor:I

    .line 13
    sget p1, Lcom/xuexiang/xui/R$styleable;->EasyIndicator_indicator_normal_color:I

    sget v0, Lcom/xuexiang/xui/R$color;->xui_config_color_black:I

    invoke-static {v0}, Lcom/xuexiang/xui/utils/ResUtils;->getColor(I)I

    move-result v0

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorNormalColor:I

    .line 14
    sget p1, Lcom/xuexiang/xui/R$styleable;->EasyIndicator_indicator_textSize:I

    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorTextSize:F

    float-to-int v0, v0

    invoke-direct {p0, p2, p1, v0}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->getDimensionPixelSize(Landroid/content/res/TypedArray;II)F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorTextSize:F

    .line 15
    sget p1, Lcom/xuexiang/xui/R$styleable;->EasyIndicator_indicator_vertical_line_w:I

    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorVerticalLineWidth:I

    invoke-direct {p0, p2, p1, v0}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->getDimensionPixelSize(Landroid/content/res/TypedArray;II)F

    move-result p1

    float-to-int p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorVerticalLineWidth:I

    .line 16
    sget p1, Lcom/xuexiang/xui/R$styleable;->EasyIndicator_indicator_vertical_line_color:I

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/xuexiang/xui/utils/ThemeUtils;->resolveColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorVerticalLineColor:I

    .line 17
    sget p1, Lcom/xuexiang/xui/R$styleable;->EasyIndicator_indicator_vertical_line_h:I

    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorVerticalLineHeight:I

    invoke-direct {p0, p2, p1, v0}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->getDimensionPixelSize(Landroid/content/res/TypedArray;II)F

    move-result p1

    float-to-int p1, p1

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorVerticalLineHeight:I

    .line 18
    sget p1, Lcom/xuexiang/xui/R$styleable;->EasyIndicator_indicator_select_textSize:I

    const/16 v0, 0xe

    invoke-direct {p0, p2, p1, v0}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->getDimensionPixelSize(Landroid/content/res/TypedArray;II)F

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorSelectTextSize:F

    .line 19
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 20
    iget p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorWidth:I

    iget p2, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->screenWidth:I

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorWidth:I

    const/4 p2, -0x1

    if-nez p1, :cond_0

    .line 21
    iput p2, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorWidth:I

    .line 22
    :cond_0
    new-instance p1, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->tabContent:Landroid/widget/LinearLayout;

    .line 23
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorWidth:I

    const/4 v1, -0x2

    invoke-direct {p1, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    if-eqz p3, :cond_1

    .line 24
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->tabContent:Landroid/widget/LinearLayout;

    invoke-virtual {p2, p3}, Landroid/widget/LinearLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 25
    :cond_1
    iget-object p3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->tabContent:Landroid/widget/LinearLayout;

    invoke-virtual {p3, p2}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    :goto_0
    const/16 p2, 0x11

    .line 26
    iput p2, p1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 27
    iget-object p3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->tabContent:Landroid/widget/LinearLayout;

    invoke-virtual {p3, p1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 28
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->tabContent:Landroid/widget/LinearLayout;

    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->setGravity(I)V

    return-void
.end method

.method private initScreenWidth()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 2
    iget v1, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->screenHeight:I

    .line 3
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->screenWidth:I

    return-void
.end method

.method private setSelectorColor(Landroid/widget/TextView;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->tvs:[Landroid/widget/TextView;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    .line 2
    iget v5, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorNormalColor:I

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 3
    iget v5, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorTextSize:F

    invoke-virtual {v4, v2, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 4
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorSelectedColor:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 5
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorSelectTextSize:F

    invoke-virtual {p1, v2, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    return-void
.end method


# virtual methods
.method public getTabContent()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->tabContent:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    move-object v0, p1

    check-cast v0, Landroid/widget/TextView;

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 3
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    if-eqz v2, :cond_0

    .line 4
    invoke-virtual {v2, v1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->setSelectorColor(Landroid/widget/TextView;)V

    .line 6
    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorLineShow:Z

    if-eqz v2, :cond_1

    .line 7
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->buildIndicatorAnimatorTowards(Landroid/widget/TextView;)Landroid/animation/AnimatorSet;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 8
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->mOnTabClickListener:Lcom/xuexiang/xui/widget/tabbar/EasyIndicator$OnTabClickListener;

    if-eqz v0, :cond_2

    .line 9
    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1, v1}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator$OnTabClickListener;->onTabClick(Ljava/lang/String;I)V

    :cond_2
    return-void
.end method

.method public onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 1

    .line 1
    iget-object p3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->mIndicatorContainer:Landroid/widget/LinearLayout;

    .line 2
    invoke-virtual {p3}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    check-cast p3, Landroid/widget/LinearLayout$LayoutParams;

    .line 3
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->mCurrIndex:I

    if-ne v0, p1, :cond_0

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->mIndicatorContainer:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Landroid/widget/LinearLayout;->getMeasuredWidth()I

    move-result p1

    mul-int v0, v0, p1

    int-to-float p1, v0

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->mIndicatorContainer:Landroid/widget/LinearLayout;

    .line 5
    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getMeasuredWidth()I

    move-result v0

    int-to-float v0, v0

    mul-float p2, p2, v0

    add-float/2addr p1, p2

    float-to-int p1, p1

    .line 6
    invoke-virtual {p3, p1}, Landroid/widget/LinearLayout$LayoutParams;->setMarginStart(I)V

    goto :goto_0

    :cond_0
    if-le v0, p1, :cond_1

    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->mIndicatorContainer:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Landroid/widget/LinearLayout;->getMeasuredWidth()I

    move-result p1

    mul-int v0, v0, p1

    int-to-float p1, v0

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr v0, p2

    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->mIndicatorContainer:Landroid/widget/LinearLayout;

    .line 8
    invoke-virtual {p2}, Landroid/widget/LinearLayout;->getMeasuredWidth()I

    move-result p2

    int-to-float p2, p2

    mul-float v0, v0, p2

    sub-float/2addr p1, v0

    float-to-int p1, p1

    .line 9
    invoke-virtual {p3, p1}, Landroid/widget/LinearLayout$LayoutParams;->setMarginStart(I)V

    .line 10
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->mIndicatorContainer:Landroid/widget/LinearLayout;

    invoke-virtual {p1, p3}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public onPageSelected(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->mCurrIndex:I

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->tvs:[Landroid/widget/TextView;

    aget-object p1, v0, p1

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->setSelectorColor(Landroid/widget/TextView;)V

    return-void
.end method

.method public setOnTabClickListener(Lcom/xuexiang/xui/widget/tabbar/EasyIndicator$OnTabClickListener;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->mOnTabClickListener:Lcom/xuexiang/xui/widget/tabbar/EasyIndicator$OnTabClickListener;

    return-void
.end method

.method public setTabTitles([Ljava/lang/String;)V
    .locals 6

    .line 1
    array-length v0, p1

    new-array v0, v0, [Landroid/widget/TextView;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->tvs:[Landroid/widget/TextView;

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->tabContent:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 3
    :goto_0
    array-length v2, p1

    const/16 v3, 0x11

    if-ge v1, v2, :cond_2

    .line 4
    new-instance v2, Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v2, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 5
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 6
    aget-object v4, p1, v1

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    invoke-static {}, Lcom/xuexiang/xui/XUI;->getDefaultTypeface()Landroid/graphics/Typeface;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 8
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 9
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    iget v4, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorHeight:I

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-direct {v3, v0, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 10
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    if-nez v1, :cond_0

    .line 11
    iget v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorSelectedColor:I

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 12
    iget v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorSelectTextSize:F

    invoke-virtual {v2, v0, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    goto :goto_1

    .line 13
    :cond_0
    iget v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorNormalColor:I

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 14
    iget v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorTextSize:F

    invoke-virtual {v2, v0, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 15
    :goto_1
    invoke-virtual {v2, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16
    iget-object v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->tvs:[Landroid/widget/TextView;

    aput-object v2, v3, v1

    .line 17
    iget-object v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->tabContent:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 18
    array-length v2, p1

    add-int/lit8 v2, v2, -0x1

    if-eq v1, v2, :cond_1

    .line 19
    new-instance v2, Landroid/view/View;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 20
    iget v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorVerticalLineColor:I

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 21
    new-instance v3, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    iget v4, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorVerticalLineWidth:I

    iget v5, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorVerticalLineHeight:I

    invoke-direct {v3, v4, v5}, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;-><init>(II)V

    .line 22
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 23
    iget-object v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->tabContent:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 24
    :cond_2
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 25
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->tabContent:Landroid/widget/LinearLayout;

    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 26
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorLineShow:Z

    const/4 v0, -0x1

    if-eqz p1, :cond_6

    .line 27
    new-instance p1, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p1, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->mIndicatorContainer:Landroid/widget/LinearLayout;

    .line 28
    invoke-virtual {p1, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 29
    iget p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorWidth:I

    if-lez p1, :cond_3

    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->tvs:[Landroid/widget/TextView;

    array-length v1, v1

    goto :goto_2

    :cond_3
    iget p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->screenWidth:I

    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->tvs:[Landroid/widget/TextView;

    array-length v1, v1

    :goto_2
    div-int/2addr p1, v1

    .line 30
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->mIndicatorContainer:Landroid/widget/LinearLayout;

    new-instance v2, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    iget v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorLineHeight:I

    invoke-direct {v2, p1, v3}, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 31
    new-instance p1, Landroid/view/View;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p1, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 32
    new-instance v1, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    iget v2, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorLineWidth:I

    if-lez v2, :cond_4

    goto :goto_3

    :cond_4
    const/4 v2, -0x1

    :goto_3
    invoke-direct {v1, v2, v0}, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 33
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorLineDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_5

    .line 34
    invoke-virtual {p1, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_4

    .line 35
    :cond_5
    iget v1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorLineColor:I

    invoke-virtual {p1, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 36
    :goto_4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->mIndicatorContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v1, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 37
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->mIndicatorContainer:Landroid/widget/LinearLayout;

    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 38
    iget p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorWidth:I

    if-lez p1, :cond_6

    .line 39
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->mIndicatorContainer:Landroid/widget/LinearLayout;

    .line 40
    invoke-virtual {p1}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 41
    iget v1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->screenWidth:I

    iget v2, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorWidth:I

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x2

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout$LayoutParams;->setMarginStart(I)V

    .line 42
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->mIndicatorContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v1, p1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 43
    :cond_6
    new-instance p1, Landroid/view/View;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p1, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 44
    new-instance v1, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    iget v2, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorBottomLineHeight:I

    invoke-direct {v1, v0, v2}, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;-><init>(II)V

    .line 45
    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 46
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->indicatorBottomLineColor:I

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 47
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    return-void
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->tvs:[Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 2
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 3
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setViewPager(Landroidx/viewpager/widget/ViewPager;Landroidx/viewpager/widget/a;)V
    .locals 0

    .line 8
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    .line 9
    invoke-virtual {p1, p2}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/a;)V

    .line 10
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    .line 11
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1, p0}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$i;)V

    return-void
.end method

.method public setViewPager(Landroidx/viewpager/widget/a;)V
    .locals 3

    .line 1
    new-instance v0, Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/viewpager/widget/ViewPager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    .line 2
    sget v1, Lcom/xuexiang/xui/R$id;->view_pager:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setId(I)V

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    new-instance v1, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v2}, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0, p1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/a;)V

    .line 5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p1, p0}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$i;)V

    .line 7
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->mViewPager:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    return-void
.end method
