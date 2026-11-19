.class public Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:F

.field public c:I

.field public d:I

.field public e:Z

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:Z

.field public k:I

.field public l:I

.field public m:Z

.field public n:F

.field public final o:Landroid/graphics/Paint;

.field public p:Landroid/graphics/LinearGradient;

.field public q:Landroid/graphics/RectF;

.field public r:Landroid/graphics/RectF;

.field public s:Landroid/view/animation/BaseInterpolator;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->HorizontalProgressViewStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->a:I

    const/4 v1, 0x0

    .line 5
    iput v1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->b:F

    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/xuexiang/xui/R$color;->xui_config_color_light_orange:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->c:I

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/xuexiang/xui/R$color;->xui_config_color_dark_orange:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->d:I

    .line 8
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->e:Z

    const/4 v2, 0x6

    .line 9
    iput v2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->f:I

    const/16 v2, 0x30

    .line 10
    iput v2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->g:I

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/xuexiang/xui/R$color;->default_pv_track_color:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->i:I

    const/4 v2, 0x1

    .line 12
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->j:Z

    const/16 v3, 0x1e

    .line 13
    iput v3, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->k:I

    const/4 v3, 0x5

    .line 14
    iput v3, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->l:I

    .line 15
    iput-boolean v2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->m:Z

    .line 16
    iput v1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->n:F

    .line 17
    sget-object v1, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView:[I

    invoke-virtual {p1, p2, v1, p3, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 18
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_start_progress:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    int-to-float p2, p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->b:F

    .line 19
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_end_progress:I

    const/16 p3, 0x3c

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 20
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_start_color:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget v1, Lcom/xuexiang/xui/R$color;->xui_config_color_light_orange:I

    invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->c:I

    .line 21
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_end_color:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget v1, Lcom/xuexiang/xui/R$color;->xui_config_color_dark_orange:I

    invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->d:I

    .line 22
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_isTracked:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->e:Z

    .line 23
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_progress_textColor:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    sget v1, Lcom/xuexiang/xui/R$attr;->colorAccent:I

    .line 24
    invoke-static {p3, v1, v0}, Lkotlin/collections/u;->F(Landroid/content/Context;II)I

    move-result p3

    .line 25
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->h:I

    .line 26
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_progress_textSize:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget v1, Lcom/xuexiang/xui/R$dimen;->default_pv_horizontal_text_size:I

    invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->g:I

    .line 27
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_track_width:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget v1, Lcom/xuexiang/xui/R$dimen;->default_pv_trace_width:I

    invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->f:I

    .line 28
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_animate_type:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->a:I

    .line 29
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_track_color:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget v0, Lcom/xuexiang/xui/R$color;->default_pv_track_color:I

    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->i:I

    .line 30
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_progress_textVisibility:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->j:Z

    .line 31
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_progress_duration:I

    const/16 p3, 0x4b0

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 32
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_corner_radius:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget v0, Lcom/xuexiang/xui/R$dimen;->default_pv_corner_radius:I

    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->k:I

    .line 33
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_text_padding_bottom:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget v0, Lcom/xuexiang/xui/R$dimen;->default_pv_corner_radius:I

    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->l:I

    .line 34
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_text_movedEnable:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->m:Z

    .line 35
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 36
    iget p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->b:F

    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->n:F

    .line 37
    iget p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->a:I

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->setAnimateType(I)V

    .line 38
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, v2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->o:Landroid/graphics/Paint;

    .line 39
    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    return-void
.end method

.method private setObjectAnimatorType(I)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_8

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-eq p1, v1, :cond_6

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    if-eq p1, v1, :cond_4

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    if-eq p1, v1, :cond_2

    .line 12
    .line 13
    const/4 v1, 0x4

    .line 14
    if-eq p1, v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->s:Landroid/view/animation/BaseInterpolator;

    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->s:Landroid/view/animation/BaseInterpolator;

    .line 22
    .line 23
    :cond_1
    new-instance p1, Landroid/view/animation/OvershootInterpolator;

    .line 24
    .line 25
    invoke-direct {p1}, Landroid/view/animation/OvershootInterpolator;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->s:Landroid/view/animation/BaseInterpolator;

    .line 29
    .line 30
    return-void

    .line 31
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->s:Landroid/view/animation/BaseInterpolator;

    .line 32
    .line 33
    if-eqz p1, :cond_3

    .line 34
    .line 35
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->s:Landroid/view/animation/BaseInterpolator;

    .line 36
    .line 37
    :cond_3
    new-instance p1, Landroid/view/animation/DecelerateInterpolator;

    .line 38
    .line 39
    invoke-direct {p1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->s:Landroid/view/animation/BaseInterpolator;

    .line 43
    .line 44
    return-void

    .line 45
    :cond_4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->s:Landroid/view/animation/BaseInterpolator;

    .line 46
    .line 47
    if-eqz p1, :cond_5

    .line 48
    .line 49
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->s:Landroid/view/animation/BaseInterpolator;

    .line 50
    .line 51
    new-instance p1, Landroid/view/animation/AccelerateInterpolator;

    .line 52
    .line 53
    invoke-direct {p1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->s:Landroid/view/animation/BaseInterpolator;

    .line 57
    .line 58
    :cond_5
    :goto_0
    return-void

    .line 59
    :cond_6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->s:Landroid/view/animation/BaseInterpolator;

    .line 60
    .line 61
    if-eqz p1, :cond_7

    .line 62
    .line 63
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->s:Landroid/view/animation/BaseInterpolator;

    .line 64
    .line 65
    :cond_7
    new-instance p1, Landroid/view/animation/LinearInterpolator;

    .line 66
    .line 67
    invoke-direct {p1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->s:Landroid/view/animation/BaseInterpolator;

    .line 71
    .line 72
    return-void

    .line 73
    :cond_8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->s:Landroid/view/animation/BaseInterpolator;

    .line 74
    .line 75
    if-eqz p1, :cond_9

    .line 76
    .line 77
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->s:Landroid/view/animation/BaseInterpolator;

    .line 78
    .line 79
    :cond_9
    new-instance p1, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 80
    .line 81
    invoke-direct {p1}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 82
    .line 83
    .line 84
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->s:Landroid/view/animation/BaseInterpolator;

    .line 85
    .line 86
    return-void
.end method


# virtual methods
.method public getProgress()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->n:F

    .line 2
    .line 3
    return v0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 8

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/RectF;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    int-to-float v1, v1

    .line 11
    iget v2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->b:F

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    sub-int/2addr v3, v4

    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    sub-int/2addr v3, v4

    .line 27
    add-int/lit8 v3, v3, 0x3c

    .line 28
    .line 29
    int-to-float v3, v3

    .line 30
    mul-float/2addr v2, v3

    .line 31
    const/high16 v3, 0x42c80000    # 100.0f

    .line 32
    .line 33
    div-float/2addr v2, v3

    .line 34
    add-float/2addr v2, v1

    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    int-to-float v1, v1

    .line 40
    const/high16 v4, 0x40000000    # 2.0f

    .line 41
    .line 42
    div-float/2addr v1, v4

    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    int-to-float v5, v5

    .line 48
    sub-float/2addr v1, v5

    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    sub-int/2addr v5, v6

    .line 58
    add-int/lit8 v5, v5, -0x14

    .line 59
    .line 60
    int-to-float v5, v5

    .line 61
    iget v6, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->n:F

    .line 62
    .line 63
    div-float/2addr v6, v3

    .line 64
    mul-float/2addr v6, v5

    .line 65
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    int-to-float v5, v5

    .line 70
    div-float/2addr v5, v4

    .line 71
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    int-to-float v7, v7

    .line 76
    add-float/2addr v5, v7

    .line 77
    iget v7, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->f:I

    .line 78
    .line 79
    int-to-float v7, v7

    .line 80
    add-float/2addr v5, v7

    .line 81
    invoke-direct {v0, v2, v1, v6, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 82
    .line 83
    .line 84
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->q:Landroid/graphics/RectF;

    .line 85
    .line 86
    new-instance v0, Landroid/graphics/RectF;

    .line 87
    .line 88
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    int-to-float v1, v1

    .line 93
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    int-to-float v2, v2

    .line 98
    div-float/2addr v2, v4

    .line 99
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    int-to-float v5, v5

    .line 104
    sub-float/2addr v2, v5

    .line 105
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    sub-int/2addr v5, v6

    .line 114
    add-int/lit8 v5, v5, -0x14

    .line 115
    .line 116
    int-to-float v5, v5

    .line 117
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 118
    .line 119
    .line 120
    move-result v6

    .line 121
    int-to-float v6, v6

    .line 122
    div-float/2addr v6, v4

    .line 123
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    int-to-float v7, v7

    .line 128
    add-float/2addr v6, v7

    .line 129
    iget v7, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->f:I

    .line 130
    .line 131
    int-to-float v7, v7

    .line 132
    add-float/2addr v6, v7

    .line 133
    invoke-direct {v0, v1, v2, v5, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 134
    .line 135
    .line 136
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->r:Landroid/graphics/RectF;

    .line 137
    .line 138
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->e:Z

    .line 139
    .line 140
    if-eqz v0, :cond_0

    .line 141
    .line 142
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->o:Landroid/graphics/Paint;

    .line 143
    .line 144
    const/4 v1, 0x0

    .line 145
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 146
    .line 147
    .line 148
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->o:Landroid/graphics/Paint;

    .line 149
    .line 150
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->i:I

    .line 151
    .line 152
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 153
    .line 154
    .line 155
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->r:Landroid/graphics/RectF;

    .line 156
    .line 157
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->k:I

    .line 158
    .line 159
    int-to-float v1, v1

    .line 160
    iget-object v2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->o:Landroid/graphics/Paint;

    .line 161
    .line 162
    invoke-virtual {p1, v0, v1, v1, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 163
    .line 164
    .line 165
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->o:Landroid/graphics/Paint;

    .line 166
    .line 167
    iget-object v1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->p:Landroid/graphics/LinearGradient;

    .line 168
    .line 169
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 170
    .line 171
    .line 172
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->q:Landroid/graphics/RectF;

    .line 173
    .line 174
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->k:I

    .line 175
    .line 176
    int-to-float v2, v1

    .line 177
    int-to-float v1, v1

    .line 178
    iget-object v5, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->o:Landroid/graphics/Paint;

    .line 179
    .line 180
    invoke-virtual {p1, v0, v2, v1, v5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 181
    .line 182
    .line 183
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->j:Z

    .line 184
    .line 185
    if-eqz v0, :cond_2

    .line 186
    .line 187
    new-instance v0, Landroid/graphics/Paint;

    .line 188
    .line 189
    const/4 v1, 0x1

    .line 190
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 191
    .line 192
    .line 193
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 194
    .line 195
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 196
    .line 197
    .line 198
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->g:I

    .line 199
    .line 200
    int-to-float v1, v1

    .line 201
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 202
    .line 203
    .line 204
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->h:I

    .line 205
    .line 206
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 207
    .line 208
    .line 209
    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    .line 210
    .line 211
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 212
    .line 213
    .line 214
    new-instance v1, Ljava/lang/StringBuilder;

    .line 215
    .line 216
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 217
    .line 218
    .line 219
    iget v2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->n:F

    .line 220
    .line 221
    float-to-int v2, v2

    .line 222
    const-string v5, "%"

    .line 223
    .line 224
    invoke-static {v1, v5, v2}, Landroid/support/v4/media/f;->o(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->m:Z

    .line 229
    .line 230
    if-eqz v2, :cond_1

    .line 231
    .line 232
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 233
    .line 234
    .line 235
    move-result v2

    .line 236
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 237
    .line 238
    .line 239
    move-result v5

    .line 240
    sub-int/2addr v2, v5

    .line 241
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 242
    .line 243
    .line 244
    move-result v5

    .line 245
    sub-int/2addr v2, v5

    .line 246
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    const/high16 v6, 0x41e00000    # 28.0f

    .line 251
    .line 252
    invoke-static {v5, v6}, Lh4/a;->h(Landroid/content/Context;F)I

    .line 253
    .line 254
    .line 255
    move-result v5

    .line 256
    sub-int/2addr v2, v5

    .line 257
    int-to-float v2, v2

    .line 258
    iget v5, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->n:F

    .line 259
    .line 260
    div-float/2addr v5, v3

    .line 261
    mul-float/2addr v5, v2

    .line 262
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    const/high16 v3, 0x41200000    # 10.0f

    .line 267
    .line 268
    invoke-static {v2, v3}, Lh4/a;->h(Landroid/content/Context;F)I

    .line 269
    .line 270
    .line 271
    move-result v2

    .line 272
    int-to-float v2, v2

    .line 273
    add-float/2addr v5, v2

    .line 274
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 275
    .line 276
    .line 277
    move-result v2

    .line 278
    int-to-float v2, v2

    .line 279
    div-float/2addr v2, v4

    .line 280
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 281
    .line 282
    .line 283
    move-result v3

    .line 284
    int-to-float v3, v3

    .line 285
    sub-float/2addr v2, v3

    .line 286
    iget v3, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->l:I

    .line 287
    .line 288
    int-to-float v3, v3

    .line 289
    sub-float/2addr v2, v3

    .line 290
    invoke-virtual {p1, v1, v5, v2, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 291
    .line 292
    .line 293
    return-void

    .line 294
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 295
    .line 296
    .line 297
    move-result v2

    .line 298
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 299
    .line 300
    .line 301
    move-result v3

    .line 302
    sub-int/2addr v2, v3

    .line 303
    int-to-float v2, v2

    .line 304
    div-float/2addr v2, v4

    .line 305
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 306
    .line 307
    .line 308
    move-result v3

    .line 309
    int-to-float v3, v3

    .line 310
    div-float/2addr v3, v4

    .line 311
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 312
    .line 313
    .line 314
    move-result v4

    .line 315
    int-to-float v4, v4

    .line 316
    sub-float/2addr v3, v4

    .line 317
    iget v4, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->l:I

    .line 318
    .line 319
    int-to-float v4, v4

    .line 320
    sub-float/2addr v3, v4

    .line 321
    invoke-virtual {p1, v1, v2, v3, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 322
    .line 323
    .line 324
    :cond_2
    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 8

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/LinearGradient;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    add-int/lit8 p1, p1, -0x32

    .line 11
    .line 12
    int-to-float v1, p1

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    sub-int/2addr p1, p2

    .line 22
    add-int/lit8 p1, p1, -0x32

    .line 23
    .line 24
    int-to-float v2, p1

    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    sub-int/2addr p1, p2

    .line 34
    int-to-float v3, p1

    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    int-to-float p1, p1

    .line 40
    const/high16 p2, 0x40000000    # 2.0f

    .line 41
    .line 42
    div-float/2addr p1, p2

    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    int-to-float p2, p2

    .line 48
    add-float/2addr p1, p2

    .line 49
    iget p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->f:I

    .line 50
    .line 51
    int-to-float p2, p2

    .line 52
    add-float v4, p1, p2

    .line 53
    .line 54
    iget v5, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->c:I

    .line 55
    .line 56
    iget v6, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->d:I

    .line 57
    .line 58
    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 59
    .line 60
    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->p:Landroid/graphics/LinearGradient;

    .line 64
    .line 65
    return-void
.end method

.method public setAnimateType(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->a:I

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->setObjectAnimatorType(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setEndColor(I)V
    .locals 8
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->d:I

    .line 2
    .line 3
    new-instance v0, Landroid/graphics/LinearGradient;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    add-int/lit8 p1, p1, -0x32

    .line 10
    .line 11
    int-to-float v1, p1

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    sub-int/2addr p1, v2

    .line 21
    add-int/lit8 p1, p1, -0x32

    .line 22
    .line 23
    int-to-float v2, p1

    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    sub-int/2addr p1, v3

    .line 33
    int-to-float v3, p1

    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    int-to-float p1, p1

    .line 39
    const/high16 v4, 0x40000000    # 2.0f

    .line 40
    .line 41
    div-float/2addr p1, v4

    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    int-to-float v4, v4

    .line 47
    add-float/2addr p1, v4

    .line 48
    iget v4, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->f:I

    .line 49
    .line 50
    int-to-float v4, v4

    .line 51
    add-float/2addr v4, p1

    .line 52
    iget v5, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->c:I

    .line 53
    .line 54
    iget v6, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->d:I

    .line 55
    .line 56
    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 57
    .line 58
    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 59
    .line 60
    .line 61
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->p:Landroid/graphics/LinearGradient;

    .line 62
    .line 63
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public setEndProgress(F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v0, p1, v0

    .line 3
    .line 4
    if-ltz v0, :cond_0

    .line 5
    .line 6
    const/high16 v0, 0x42c80000    # 100.0f

    .line 7
    .line 8
    cmpl-float p1, p1, v0

    .line 9
    .line 10
    if-gtz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    const-string v0, "Illegal progress value, please change it!"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1
.end method

.method public setProgress(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->n:F

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setProgressCornerRadius(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    int-to-float p1, p1

    .line 6
    invoke-static {v0, p1}, Lh4/a;->h(Landroid/content/Context;F)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->k:I

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setProgressDuration(I)V
    .locals 0

    return-void
.end method

.method public setProgressTextColor(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->h:I

    .line 2
    .line 3
    return-void
.end method

.method public setProgressTextMoved(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->m:Z

    .line 2
    .line 3
    return-void
.end method

.method public setProgressTextPaddingBottom(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    int-to-float p1, p1

    .line 6
    invoke-static {v0, p1}, Lh4/a;->h(Landroid/content/Context;F)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->l:I

    .line 11
    .line 12
    return-void
.end method

.method public setProgressTextSize(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    int-to-float p1, p1

    .line 6
    invoke-static {v0, p1}, Lh4/a;->n(Landroid/content/Context;F)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->g:I

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setProgressTextVisibility(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->j:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setProgressViewUpdateListener(Lj3/c;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setStartColor(I)V
    .locals 8
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->c:I

    .line 2
    .line 3
    new-instance v0, Landroid/graphics/LinearGradient;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    add-int/lit8 p1, p1, -0x32

    .line 10
    .line 11
    int-to-float v1, p1

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    sub-int/2addr p1, v2

    .line 21
    add-int/lit8 p1, p1, -0x32

    .line 22
    .line 23
    int-to-float v2, p1

    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    sub-int/2addr p1, v3

    .line 33
    int-to-float v3, p1

    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    int-to-float p1, p1

    .line 39
    const/high16 v4, 0x40000000    # 2.0f

    .line 40
    .line 41
    div-float/2addr p1, v4

    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    int-to-float v4, v4

    .line 47
    add-float/2addr p1, v4

    .line 48
    iget v4, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->f:I

    .line 49
    .line 50
    int-to-float v4, v4

    .line 51
    add-float/2addr v4, p1

    .line 52
    iget v5, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->c:I

    .line 53
    .line 54
    iget v6, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->d:I

    .line 55
    .line 56
    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 57
    .line 58
    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 59
    .line 60
    .line 61
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->p:Landroid/graphics/LinearGradient;

    .line 62
    .line 63
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public setStartProgress(F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v0, p1, v0

    .line 3
    .line 4
    if-ltz v0, :cond_0

    .line 5
    .line 6
    const/high16 v0, 0x42c80000    # 100.0f

    .line 7
    .line 8
    cmpl-float v0, p1, v0

    .line 9
    .line 10
    if-gtz v0, :cond_0

    .line 11
    .line 12
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->b:F

    .line 13
    .line 14
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->n:F

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 21
    .line 22
    const-string v0, "Illegal progress value, please change it!"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1
.end method

.method public setTrackColor(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->i:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setTrackEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->e:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setTrackWidth(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    int-to-float p1, p1

    .line 6
    invoke-static {v0, p1}, Lh4/a;->h(Landroid/content/Context;F)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->f:I

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 13
    .line 14
    .line 15
    return-void
.end method
