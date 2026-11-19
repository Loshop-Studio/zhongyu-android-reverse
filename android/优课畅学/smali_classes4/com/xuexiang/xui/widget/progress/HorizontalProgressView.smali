.class public Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/progress/HorizontalProgressView$a;
    }
.end annotation


# instance fields
.field public a:I

.field public b:F

.field public c:F

.field public d:I

.field public e:I

.field public f:Z

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:Z

.field public m:I

.field public n:I

.field public o:Z

.field public p:F

.field public q:Landroid/graphics/Paint;

.field public r:Landroid/graphics/LinearGradient;

.field public s:Landroid/graphics/RectF;

.field public t:Landroid/graphics/RectF;

.field public u:Landroid/view/animation/Interpolator;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    sget v0, Lcom/xuexiang/xui/R$attr;->HorizontalProgressViewStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->a:I

    const/4 v1, 0x0

    .line 4
    iput v1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->b:F

    const/high16 v2, 0x42700000    # 60.0f

    .line 5
    iput v2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->c:F

    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/xuexiang/xui/R$color;->xui_config_color_light_orange:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->d:I

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/xuexiang/xui/R$color;->xui_config_color_dark_orange:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    iput v2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->e:I

    .line 8
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->f:Z

    const/4 v0, 0x6

    .line 9
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->g:I

    const/16 v0, 0x30

    .line 10
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->h:I

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, Lcom/xuexiang/xui/R$color;->default_pv_track_color:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->j:I

    const/16 v0, 0x4b0

    .line 12
    iput v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->k:I

    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->l:Z

    const/16 v2, 0x1e

    .line 14
    iput v2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->m:I

    const/4 v2, 0x5

    .line 15
    iput v2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->n:I

    .line 16
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->o:Z

    .line 17
    iput v1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->p:F

    .line 18
    invoke-virtual {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->d(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 19
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->c()V

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
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->u:Landroid/view/animation/Interpolator;

    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->u:Landroid/view/animation/Interpolator;

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
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->u:Landroid/view/animation/Interpolator;

    .line 29
    .line 30
    return-void

    .line 31
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->u:Landroid/view/animation/Interpolator;

    .line 32
    .line 33
    if-eqz p1, :cond_3

    .line 34
    .line 35
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->u:Landroid/view/animation/Interpolator;

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
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->u:Landroid/view/animation/Interpolator;

    .line 43
    .line 44
    return-void

    .line 45
    :cond_4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->u:Landroid/view/animation/Interpolator;

    .line 46
    .line 47
    if-eqz p1, :cond_5

    .line 48
    .line 49
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->u:Landroid/view/animation/Interpolator;

    .line 50
    .line 51
    new-instance p1, Landroid/view/animation/AccelerateInterpolator;

    .line 52
    .line 53
    invoke-direct {p1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->u:Landroid/view/animation/Interpolator;

    .line 57
    .line 58
    :cond_5
    :goto_0
    return-void

    .line 59
    :cond_6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->u:Landroid/view/animation/Interpolator;

    .line 60
    .line 61
    if-eqz p1, :cond_7

    .line 62
    .line 63
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->u:Landroid/view/animation/Interpolator;

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
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->u:Landroid/view/animation/Interpolator;

    .line 71
    .line 72
    return-void

    .line 73
    :cond_8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->u:Landroid/view/animation/Interpolator;

    .line 74
    .line 75
    if-eqz p1, :cond_9

    .line 76
    .line 77
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->u:Landroid/view/animation/Interpolator;

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
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->u:Landroid/view/animation/Interpolator;

    .line 85
    .line 86
    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->l:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/Paint;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 9
    .line 10
    .line 11
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 14
    .line 15
    .line 16
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->h:I

    .line 17
    .line 18
    int-to-float v1, v1

    .line 19
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 20
    .line 21
    .line 22
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->i:I

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 25
    .line 26
    .line 27
    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 30
    .line 31
    .line 32
    new-instance v1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    iget v2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->p:F

    .line 38
    .line 39
    float-to-int v2, v2

    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v2, "%"

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    iget-boolean v2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->o:Z

    .line 53
    .line 54
    const/high16 v3, 0x40000000    # 2.0f

    .line 55
    .line 56
    if-eqz v2, :cond_0

    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    sub-int/2addr v2, v4

    .line 67
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    sub-int/2addr v2, v4

    .line 72
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    const/high16 v5, 0x41e00000    # 28.0f

    .line 77
    .line 78
    invoke-static {v4, v5}, Lcom/xuexiang/xui/utils/b;->a(Landroid/content/Context;F)I

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    sub-int/2addr v2, v4

    .line 83
    int-to-float v2, v2

    .line 84
    iget v4, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->p:F

    .line 85
    .line 86
    const/high16 v5, 0x42c80000    # 100.0f

    .line 87
    .line 88
    div-float/2addr v4, v5

    .line 89
    mul-float/2addr v2, v4

    .line 90
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    const/high16 v5, 0x41200000    # 10.0f

    .line 95
    .line 96
    invoke-static {v4, v5}, Lcom/xuexiang/xui/utils/b;->a(Landroid/content/Context;F)I

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    int-to-float v4, v4

    .line 101
    add-float/2addr v2, v4

    .line 102
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    int-to-float v4, v4

    .line 107
    div-float/2addr v4, v3

    .line 108
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    int-to-float v3, v3

    .line 113
    sub-float/2addr v4, v3

    .line 114
    iget v3, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->n:I

    .line 115
    .line 116
    int-to-float v3, v3

    .line 117
    sub-float/2addr v4, v3

    .line 118
    invoke-virtual {p1, v1, v2, v4, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    sub-int/2addr v2, v4

    .line 131
    int-to-float v2, v2

    .line 132
    div-float/2addr v2, v3

    .line 133
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    int-to-float v4, v4

    .line 138
    div-float/2addr v4, v3

    .line 139
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    int-to-float v3, v3

    .line 144
    sub-float/2addr v4, v3

    .line 145
    iget v3, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->n:I

    .line 146
    .line 147
    int-to-float v3, v3

    .line 148
    sub-float/2addr v4, v3

    .line 149
    invoke-virtual {p1, v1, v2, v4, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 150
    .line 151
    .line 152
    :cond_1
    return-void
.end method

.method public final b(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->q:Landroid/graphics/Paint;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->q:Landroid/graphics/Paint;

    .line 12
    .line 13
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->j:I

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->t:Landroid/graphics/RectF;

    .line 19
    .line 20
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->m:I

    .line 21
    .line 22
    int-to-float v2, v1

    .line 23
    int-to-float v1, v1

    .line 24
    iget-object v3, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->q:Landroid/graphics/Paint;

    .line 25
    .line 26
    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public final c()V
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->q:Landroid/graphics/Paint;

    .line 8
    .line 9
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final d(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_start_progress:I

    .line 9
    .line 10
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    int-to-float p2, p2

    .line 15
    iput p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->b:F

    .line 16
    .line 17
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_end_progress:I

    .line 18
    .line 19
    const/16 p3, 0x3c

    .line 20
    .line 21
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    int-to-float p2, p2

    .line 26
    iput p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->c:F

    .line 27
    .line 28
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_start_color:I

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 31
    .line 32
    .line 33
    move-result-object p3

    .line 34
    sget v0, Lcom/xuexiang/xui/R$color;->xui_config_color_light_orange:I

    .line 35
    .line 36
    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getColor(I)I

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    iput p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->d:I

    .line 45
    .line 46
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_end_color:I

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    sget v0, Lcom/xuexiang/xui/R$color;->xui_config_color_dark_orange:I

    .line 53
    .line 54
    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getColor(I)I

    .line 55
    .line 56
    .line 57
    move-result p3

    .line 58
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    iput p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->e:I

    .line 63
    .line 64
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_isTracked:I

    .line 65
    .line 66
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->f:Z

    .line 71
    .line 72
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_progress_textColor:I

    .line 73
    .line 74
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 75
    .line 76
    .line 77
    move-result-object p3

    .line 78
    invoke-static {p3}, Lcom/xuexiang/xui/utils/g;->f(Landroid/content/Context;)I

    .line 79
    .line 80
    .line 81
    move-result p3

    .line 82
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    iput p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->i:I

    .line 87
    .line 88
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_progress_textSize:I

    .line 89
    .line 90
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 91
    .line 92
    .line 93
    move-result-object p3

    .line 94
    sget v0, Lcom/xuexiang/xui/R$dimen;->default_pv_horizontal_text_size:I

    .line 95
    .line 96
    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 97
    .line 98
    .line 99
    move-result p3

    .line 100
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    iput p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->h:I

    .line 105
    .line 106
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_track_width:I

    .line 107
    .line 108
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 109
    .line 110
    .line 111
    move-result-object p3

    .line 112
    sget v0, Lcom/xuexiang/xui/R$dimen;->default_pv_trace_width:I

    .line 113
    .line 114
    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 115
    .line 116
    .line 117
    move-result p3

    .line 118
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    iput p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->g:I

    .line 123
    .line 124
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_animate_type:I

    .line 125
    .line 126
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    iput p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->a:I

    .line 131
    .line 132
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_track_color:I

    .line 133
    .line 134
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 135
    .line 136
    .line 137
    move-result-object p3

    .line 138
    sget v0, Lcom/xuexiang/xui/R$color;->default_pv_track_color:I

    .line 139
    .line 140
    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getColor(I)I

    .line 141
    .line 142
    .line 143
    move-result p3

    .line 144
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 145
    .line 146
    .line 147
    move-result p2

    .line 148
    iput p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->j:I

    .line 149
    .line 150
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_progress_textVisibility:I

    .line 151
    .line 152
    const/4 p3, 0x1

    .line 153
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 154
    .line 155
    .line 156
    move-result p2

    .line 157
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->l:Z

    .line 158
    .line 159
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_progress_duration:I

    .line 160
    .line 161
    const/16 v0, 0x4b0

    .line 162
    .line 163
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 164
    .line 165
    .line 166
    move-result p2

    .line 167
    iput p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->k:I

    .line 168
    .line 169
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_corner_radius:I

    .line 170
    .line 171
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    sget v1, Lcom/xuexiang/xui/R$dimen;->default_pv_corner_radius:I

    .line 176
    .line 177
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 182
    .line 183
    .line 184
    move-result p2

    .line 185
    iput p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->m:I

    .line 186
    .line 187
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_text_padding_bottom:I

    .line 188
    .line 189
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    sget v1, Lcom/xuexiang/xui/R$dimen;->default_pv_corner_radius:I

    .line 194
    .line 195
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 200
    .line 201
    .line 202
    move-result p2

    .line 203
    iput p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->n:I

    .line 204
    .line 205
    sget p2, Lcom/xuexiang/xui/R$styleable;->HorizontalProgressView_hpv_text_movedEnable:I

    .line 206
    .line 207
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 208
    .line 209
    .line 210
    move-result p2

    .line 211
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->o:Z

    .line 212
    .line 213
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 214
    .line 215
    .line 216
    iget p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->b:F

    .line 217
    .line 218
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->p:F

    .line 219
    .line 220
    iget p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->a:I

    .line 221
    .line 222
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->setAnimateType(I)V

    .line 223
    .line 224
    .line 225
    return-void
.end method

.method public final e()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final f()V
    .locals 7

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    int-to-float v1, v1

    .line 8
    iget v2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->b:F

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    sub-int/2addr v3, v4

    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    sub-int/2addr v3, v4

    .line 24
    add-int/lit8 v3, v3, 0x3c

    .line 25
    .line 26
    int-to-float v3, v3

    .line 27
    mul-float/2addr v2, v3

    .line 28
    const/high16 v3, 0x42c80000    # 100.0f

    .line 29
    .line 30
    div-float/2addr v2, v3

    .line 31
    add-float/2addr v1, v2

    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    int-to-float v2, v2

    .line 37
    const/high16 v4, 0x40000000    # 2.0f

    .line 38
    .line 39
    div-float/2addr v2, v4

    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    int-to-float v5, v5

    .line 45
    sub-float/2addr v2, v5

    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    sub-int/2addr v5, v6

    .line 55
    add-int/lit8 v5, v5, -0x14

    .line 56
    .line 57
    int-to-float v5, v5

    .line 58
    iget v6, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->p:F

    .line 59
    .line 60
    div-float/2addr v6, v3

    .line 61
    mul-float/2addr v5, v6

    .line 62
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    int-to-float v3, v3

    .line 67
    div-float/2addr v3, v4

    .line 68
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    int-to-float v6, v6

    .line 73
    add-float/2addr v3, v6

    .line 74
    iget v6, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->g:I

    .line 75
    .line 76
    int-to-float v6, v6

    .line 77
    add-float/2addr v3, v6

    .line 78
    invoke-direct {v0, v1, v2, v5, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 79
    .line 80
    .line 81
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->s:Landroid/graphics/RectF;

    .line 82
    .line 83
    new-instance v0, Landroid/graphics/RectF;

    .line 84
    .line 85
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    int-to-float v1, v1

    .line 90
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    int-to-float v2, v2

    .line 95
    div-float/2addr v2, v4

    .line 96
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    int-to-float v3, v3

    .line 101
    sub-float/2addr v2, v3

    .line 102
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    sub-int/2addr v3, v5

    .line 111
    add-int/lit8 v3, v3, -0x14

    .line 112
    .line 113
    int-to-float v3, v3

    .line 114
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    int-to-float v5, v5

    .line 119
    div-float/2addr v5, v4

    .line 120
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    int-to-float v4, v4

    .line 125
    add-float/2addr v5, v4

    .line 126
    iget v4, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->g:I

    .line 127
    .line 128
    int-to-float v4, v4

    .line 129
    add-float/2addr v5, v4

    .line 130
    invoke-direct {v0, v1, v2, v3, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 131
    .line 132
    .line 133
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->t:Landroid/graphics/RectF;

    .line 134
    .line 135
    return-void
.end method

.method public getProgress()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->p:F

    .line 2
    .line 3
    return v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->f()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->b(Landroid/graphics/Canvas;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->q:Landroid/graphics/Paint;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->r:Landroid/graphics/LinearGradient;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->s:Landroid/graphics/RectF;

    .line 18
    .line 19
    iget v1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->m:I

    .line 20
    .line 21
    int-to-float v2, v1

    .line 22
    int-to-float v1, v1

    .line 23
    iget-object v3, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->q:Landroid/graphics/Paint;

    .line 24
    .line 25
    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->a(Landroid/graphics/Canvas;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public onSizeChanged(IIII)V
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
    iget p2, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->g:I

    .line 50
    .line 51
    int-to-float p2, p2

    .line 52
    add-float v4, p1, p2

    .line 53
    .line 54
    iget v5, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->d:I

    .line 55
    .line 56
    iget v6, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->e:I

    .line 57
    .line 58
    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 59
    .line 60
    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->r:Landroid/graphics/LinearGradient;

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
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->e:I

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
    iget v4, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->g:I

    .line 49
    .line 50
    int-to-float v4, v4

    .line 51
    add-float/2addr v4, p1

    .line 52
    iget v5, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->d:I

    .line 53
    .line 54
    iget v6, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->e:I

    .line 55
    .line 56
    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 57
    .line 58
    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 59
    .line 60
    .line 61
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->r:Landroid/graphics/LinearGradient;

    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->e()V

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
    cmpl-float v0, p1, v0

    .line 9
    .line 10
    if-gtz v0, :cond_0

    .line 11
    .line 12
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->c:F

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->e()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 19
    .line 20
    const-string v0, "Illegal progress value, please change it!"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1
.end method

.method public setProgress(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->p:F

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->e()V

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
    invoke-static {v0, p1}, Lcom/xuexiang/xui/utils/b;->a(Landroid/content/Context;F)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->m:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->e()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setProgressDuration(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->k:I

    .line 2
    .line 3
    return-void
.end method

.method public setProgressTextColor(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->i:I

    .line 2
    .line 3
    return-void
.end method

.method public setProgressTextMoved(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->o:Z

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
    invoke-static {v0, p1}, Lcom/xuexiang/xui/utils/b;->a(Landroid/content/Context;F)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->n:I

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
    invoke-static {v0, p1}, Lcom/xuexiang/xui/utils/b;->d(Landroid/content/Context;F)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->h:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->e()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setProgressTextVisibility(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->l:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->e()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setProgressViewUpdateListener(Lcom/xuexiang/xui/widget/progress/HorizontalProgressView$a;)V
    .locals 0

    return-void
.end method

.method public setStartColor(I)V
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
    iget v4, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->g:I

    .line 49
    .line 50
    int-to-float v4, v4

    .line 51
    add-float/2addr v4, p1

    .line 52
    iget v5, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->d:I

    .line 53
    .line 54
    iget v6, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->e:I

    .line 55
    .line 56
    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 57
    .line 58
    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 59
    .line 60
    .line 61
    iput-object v0, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->r:Landroid/graphics/LinearGradient;

    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->e()V

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
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->p:F

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->e()V

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
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->j:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->e()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setTrackEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->f:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->e()V

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
    invoke-static {v0, p1}, Lcom/xuexiang/xui/utils/b;->a(Landroid/content/Context;F)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->g:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/progress/HorizontalProgressView;->e()V

    .line 13
    .line 14
    .line 15
    return-void
.end method
