.class public Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;
.super Landroid/widget/LinearLayout;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;
.implements Lio/github/inflationx/calligraphy3/HasTypeface;


# instance fields
.field public a:Landroid/view/View;

.field public b:Landroidx/viewpager/widget/ViewPager;

.field public final c:Landroid/widget/LinearLayout;

.field public d:[Landroid/widget/TextView;

.field public final e:I

.field public f:I

.field public final g:I

.field public final h:I

.field public final i:Z

.field public final j:I

.field public final k:I

.field public final l:I

.field public final m:I

.field public final n:F

.field public final o:F


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
    .locals 4

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 v0, 0x2d

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->g:I

    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->h:I

    const/4 v1, 0x1

    .line 6
    iput-boolean v1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->i:Z

    const/4 v2, 0x3

    .line 7
    iput v2, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->j:I

    const/4 v2, 0x0

    .line 8
    iput v2, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->k:I

    const/high16 v3, 0x41600000    # 14.0f

    .line 9
    iput v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->n:F

    .line 10
    iput v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->o:F

    .line 11
    invoke-virtual {p0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 13
    iget v3, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 14
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->e:I

    .line 15
    sget-object v1, Lcom/xuexiang/xui/R$styleable;->EasyIndicator:[I

    invoke-virtual {p1, p2, v1, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    if-nez p1, :cond_0

    .line 16
    new-instance p1, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->c:Landroid/widget/LinearLayout;

    .line 17
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    iget p2, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->h:I

    const/4 p3, -0x2

    invoke-direct {p1, p2, p3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 18
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->c:Landroid/widget/LinearLayout;

    invoke-virtual {p2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    const/16 p2, 0x11

    .line 19
    iput p2, p1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 20
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->c:Landroid/widget/LinearLayout;

    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    .line 21
    :cond_0
    sget p2, Lcom/xuexiang/xui/R$styleable;->EasyIndicator_indicator_height:I

    iget p3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->g:I

    invoke-virtual {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->a(Landroid/content/res/TypedArray;II)F

    move-result p2

    float-to-int p2, p2

    iput p2, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->g:I

    .line 22
    sget p2, Lcom/xuexiang/xui/R$styleable;->EasyIndicator_indicator_line_height:I

    iget p3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->j:I

    invoke-virtual {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->a(Landroid/content/res/TypedArray;II)F

    move-result p2

    float-to-int p2, p2

    iput p2, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->j:I

    .line 23
    sget p2, Lcom/xuexiang/xui/R$styleable;->EasyIndicator_indicator_bottom_line_height:I

    iget p3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->k:I

    invoke-virtual {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->a(Landroid/content/res/TypedArray;II)F

    move-result p2

    float-to-int p2, p2

    iput p2, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->k:I

    .line 24
    sget p2, Lcom/xuexiang/xui/R$styleable;->EasyIndicator_indicator_bottom_line_color:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    sget v0, Lcom/xuexiang/xui/R$attr;->xui_config_color_separator_dark:I

    .line 25
    invoke-static {p3, v0, v2}, Lkotlin/collections/u;->F(Landroid/content/Context;II)I

    move-result p3

    .line 26
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->l:I

    .line 27
    sget p2, Lcom/xuexiang/xui/R$styleable;->EasyIndicator_indicator_selected_color:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    sget v0, Lcom/xuexiang/xui/R$attr;->colorAccent:I

    .line 28
    invoke-static {p3, v0, v2}, Lkotlin/collections/u;->F(Landroid/content/Context;II)I

    move-result p3

    .line 29
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->m:I

    .line 30
    invoke-static {}, Lt1/a;->a()V

    const/4 p1, 0x0

    throw p1
.end method

.method private setSelectorColor(Landroid/widget/TextView;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->d:[Landroid/widget/TextView;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v3, v1, :cond_0

    .line 7
    .line 8
    aget-object v4, v0, v3

    .line 9
    .line 10
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 11
    .line 12
    .line 13
    iget v5, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->n:F

    .line 14
    .line 15
    invoke-virtual {v4, v2, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 16
    .line 17
    .line 18
    add-int/lit8 v3, v3, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->m:I

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 24
    .line 25
    .line 26
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->o:F

    .line 27
    .line 28
    invoke-virtual {p1, v2, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 29
    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/res/TypedArray;II)F
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    :goto_0
    int-to-float p1, p1

    .line 17
    return p1

    .line 18
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget v0, v0, Landroid/util/DisplayMetrics;->scaledDensity:F

    .line 27
    .line 28
    int-to-float p3, p3

    .line 29
    mul-float/2addr p3, v0

    .line 30
    float-to-int p3, p3

    .line 31
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    goto :goto_0
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 6

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Landroid/widget/TextView;

    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->b:Landroidx/viewpager/widget/ViewPager;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1, p1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->setSelectorColor(Landroid/widget/TextView;)V

    .line 23
    .line 24
    .line 25
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->i:Z

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->c:Landroid/widget/LinearLayout;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/view/View;->getX()F

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->a:Landroid/view/View;

    .line 36
    .line 37
    invoke-virtual {v1}, Landroid/view/View;->getX()F

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-virtual {v0}, Landroid/view/View;->getX()F

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    add-float/2addr v3, p1

    .line 46
    const/4 p1, 0x2

    .line 47
    new-array v4, p1, [F

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    aput v2, v4, v5

    .line 51
    .line 52
    const/4 v2, 0x1

    .line 53
    aput v3, v4, v2

    .line 54
    .line 55
    const-string v3, "X"

    .line 56
    .line 57
    invoke-static {v1, v3, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iget-object v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->a:Landroid/view/View;

    .line 62
    .line 63
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    iget v4, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    filled-new-array {v4, v0}, [I

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    new-instance v4, Lp3/a;

    .line 82
    .line 83
    invoke-direct {v4, p0, v3}, Lp3/a;-><init>(Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;Landroid/view/ViewGroup$LayoutParams;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 87
    .line 88
    .line 89
    new-instance v3, Landroid/animation/AnimatorSet;

    .line 90
    .line 91
    invoke-direct {v3}, Landroid/animation/AnimatorSet;-><init>()V

    .line 92
    .line 93
    .line 94
    new-instance v4, Landroidx/interpolator/view/animation/FastOutSlowInInterpolator;

    .line 95
    .line 96
    invoke-direct {v4}, Landroidx/interpolator/view/animation/FastOutSlowInInterpolator;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v3, v4}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 100
    .line 101
    .line 102
    new-array p1, p1, [Landroid/animation/Animator;

    .line 103
    .line 104
    aput-object v1, p1, v5

    .line 105
    .line 106
    aput-object v0, p1, v2

    .line 107
    .line 108
    invoke-virtual {v3, p1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3}, Landroid/animation/AnimatorSet;->start()V

    .line 112
    .line 113
    .line 114
    :cond_1
    return-void
.end method

.method public final onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public final onPageScrolled(IFI)V
    .locals 1

    .line 1
    iget-object p3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->a:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    check-cast p3, Landroid/widget/LinearLayout$LayoutParams;

    .line 8
    .line 9
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->f:I

    .line 10
    .line 11
    if-ne v0, p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->a:Landroid/view/View;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    mul-int/2addr p1, v0

    .line 20
    int-to-float p1, p1

    .line 21
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->a:Landroid/view/View;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    int-to-float v0, v0

    .line 28
    mul-float/2addr p2, v0

    .line 29
    add-float/2addr p2, p1

    .line 30
    float-to-int p1, p2

    .line 31
    invoke-virtual {p3, p1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    if-le v0, p1, :cond_1

    .line 36
    .line 37
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->a:Landroid/view/View;

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    mul-int/2addr p1, v0

    .line 44
    int-to-float p1, p1

    .line 45
    const/high16 v0, 0x3f800000    # 1.0f

    .line 46
    .line 47
    sub-float/2addr v0, p2

    .line 48
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->a:Landroid/view/View;

    .line 49
    .line 50
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    int-to-float p2, p2

    .line 55
    mul-float/2addr v0, p2

    .line 56
    sub-float/2addr p1, v0

    .line 57
    float-to-int p1, p1

    .line 58
    invoke-virtual {p3, p1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 59
    .line 60
    .line 61
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->a:Landroid/view/View;

    .line 62
    .line 63
    invoke-virtual {p1, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final onPageSelected(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->f:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->d:[Landroid/widget/TextView;

    .line 4
    .line 5
    aget-object p1, v0, p1

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->setSelectorColor(Landroid/widget/TextView;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setOnTabClickListener(Lp3/b;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setTabTitles([Ljava/lang/String;)V
    .locals 6

    .line 1
    array-length v0, p1

    .line 2
    new-array v0, v0, [Landroid/widget/TextView;

    .line 3
    .line 4
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->d:[Landroid/widget/TextView;

    .line 5
    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->c:Landroid/widget/LinearLayout;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    move v1, v0

    .line 13
    :goto_0
    array-length v2, p1

    .line 14
    if-ge v1, v2, :cond_2

    .line 15
    .line 16
    new-instance v2, Landroid/widget/TextView;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-direct {v2, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    aget-object v3, p1, v1

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    .line 36
    .line 37
    invoke-static {}, Lt1/a;->b()V

    .line 38
    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 42
    .line 43
    .line 44
    const/16 v3, 0x11

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 47
    .line 48
    .line 49
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 50
    .line 51
    iget v4, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->g:I

    .line 52
    .line 53
    const/high16 v5, 0x3f800000    # 1.0f

    .line 54
    .line 55
    invoke-direct {v3, v0, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 59
    .line 60
    .line 61
    if-eqz v1, :cond_0

    .line 62
    .line 63
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 64
    .line 65
    .line 66
    iget v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->n:F

    .line 67
    .line 68
    invoke-virtual {v2, v0, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_0
    iget v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->m:I

    .line 73
    .line 74
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 75
    .line 76
    .line 77
    iget v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->o:F

    .line 78
    .line 79
    invoke-virtual {v2, v0, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 80
    .line 81
    .line 82
    :goto_1
    invoke-virtual {v2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 83
    .line 84
    .line 85
    iget-object v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->d:[Landroid/widget/TextView;

    .line 86
    .line 87
    aput-object v2, v3, v1

    .line 88
    .line 89
    iget-object v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->c:Landroid/widget/LinearLayout;

    .line 90
    .line 91
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 92
    .line 93
    .line 94
    array-length v2, p1

    .line 95
    add-int/lit8 v2, v2, -0x1

    .line 96
    .line 97
    if-eq v1, v2, :cond_1

    .line 98
    .line 99
    new-instance v2, Landroid/view/View;

    .line 100
    .line 101
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-direct {v2, v3}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 109
    .line 110
    .line 111
    new-instance v3, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    .line 112
    .line 113
    invoke-direct {v3, v0, v0}, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;-><init>(II)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 117
    .line 118
    .line 119
    iget-object v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->c:Landroid/widget/LinearLayout;

    .line 120
    .line 121
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 122
    .line 123
    .line 124
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 128
    .line 129
    .line 130
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->c:Landroid/widget/LinearLayout;

    .line 131
    .line 132
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 133
    .line 134
    .line 135
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->i:Z

    .line 136
    .line 137
    const/4 v1, -0x1

    .line 138
    if-eqz p1, :cond_5

    .line 139
    .line 140
    new-instance p1, Landroid/view/View;

    .line 141
    .line 142
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-direct {p1, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 147
    .line 148
    .line 149
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->a:Landroid/view/View;

    .line 150
    .line 151
    iget v2, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->h:I

    .line 152
    .line 153
    if-eqz v2, :cond_4

    .line 154
    .line 155
    if-ne v2, v1, :cond_3

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_3
    move v3, v0

    .line 159
    goto :goto_3

    .line 160
    :cond_4
    :goto_2
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->d:[Landroid/widget/TextView;

    .line 161
    .line 162
    array-length v2, v2

    .line 163
    iget v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->e:I

    .line 164
    .line 165
    div-int/2addr v3, v2

    .line 166
    :goto_3
    new-instance v2, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    .line 167
    .line 168
    iget v4, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->j:I

    .line 169
    .line 170
    invoke-direct {v2, v3, v4}, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;-><init>(II)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 174
    .line 175
    .line 176
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->a:Landroid/view/View;

    .line 177
    .line 178
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 179
    .line 180
    .line 181
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->a:Landroid/view/View;

    .line 182
    .line 183
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 184
    .line 185
    .line 186
    :cond_5
    new-instance p1, Landroid/view/View;

    .line 187
    .line 188
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-direct {p1, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 193
    .line 194
    .line 195
    new-instance v0, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    .line 196
    .line 197
    iget v2, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->k:I

    .line 198
    .line 199
    invoke-direct {v0, v1, v2}, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;-><init>(II)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 203
    .line 204
    .line 205
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->l:I

    .line 206
    .line 207
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 211
    .line 212
    .line 213
    return-void
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->d:[Landroid/widget/TextView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_0

    .line 8
    .line 9
    aget-object v3, v0, v2

    .line 10
    .line 11
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 12
    .line 13
    .line 14
    add-int/lit8 v2, v2, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    return-void
.end method

.method public setViewPager(Landroidx/viewpager/widget/PagerAdapter;)V
    .locals 3

    .line 1
    new-instance v0, Landroidx/viewpager/widget/ViewPager;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroidx/viewpager/widget/ViewPager;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->b:Landroidx/viewpager/widget/ViewPager;

    .line 11
    .line 12
    sget v1, Lcom/xuexiang/xui/R$id;->view_pager:I

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->b:Landroidx/viewpager/widget/ViewPager;

    .line 18
    .line 19
    new-instance v1, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    .line 20
    .line 21
    const/4 v2, -0x1

    .line 22
    invoke-direct {v1, v2, v2}, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;-><init>(II)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->b:Landroidx/viewpager/widget/ViewPager;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->b:Landroidx/viewpager/widget/ViewPager;

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->b:Landroidx/viewpager/widget/ViewPager;

    .line 40
    .line 41
    invoke-virtual {p1, p0}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->b:Landroidx/viewpager/widget/ViewPager;

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method
